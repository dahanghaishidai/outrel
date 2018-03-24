package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxphonerevcheck.service;

import com.jy.modules.externalplatform.interfacerepository.pa.extwlpainfo.service.ExtWlPaInfoService;
import com.jy.modules.externalplatform.interfacerepository.pyzx.common.AnalyzeUtil;
import com.jy.modules.externalplatform.interfacerepository.pyzx.common.CompressStringUtil;
import com.jy.modules.externalplatform.interfacerepository.pyzx.common.PYZXConstant;
import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxphonerevcheck.dao.ExtWlPyzxPhoneRevcheckDao;
import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxphonerevcheck.dto.ExtWlPyzxPhoneRevcheckDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @className: ExtWlPyzxPhoneRevcheckService
 * @package: com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxphonerevcheck.service
 * @describe: 定义  电话反查信息 实现类
 * @auther: 董康宁
 * @date: 2018/1/10
 * @time: 15:32
 */
@Service("com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxphonerevcheck.service.ExtWlPyzxPhoneRevcheckService")
public class ExtWlPyzxPhoneRevcheckService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    static Logger logger = LoggerFactory.getLogger(ExtWlPyzxPhoneRevcheckService.class);

    @Autowired
    ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtWlPyzxPhoneRevcheckDao dao;


	/**
     * @title: insertExtWlPyzxPhoneRevcheck
     * @author Administrator
     * @description: 新增 电话反查信息对象
     * @date 2018-01-10 13:51:52
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlPyzxPhoneRevcheck(ExtWlPyzxPhoneRevcheckDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlPyzxPhoneRevcheck(paramMap);
		
		ExtWlPyzxPhoneRevcheckDTO resultDto = (ExtWlPyzxPhoneRevcheckDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 鹏元征信电话反查 数据落地
	 * @auther: 董康宁
	 * @date: 2018/1/10
	 * @time: 15:37
	 */
    @Override
    public void saveMessage(Map<String, Object> map) {
        String isSuccess = "0";//是否调用成功  1：成功 0：失败
        String retCode = "";//接口返回码
        String retMsg = "";//接口返回信息
        String fkBizId = "";//接口落地数据主表ID
        String respXml = "";

        //日志信息
        ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");
        String result = String.valueOf(map.get("result"));

        try {

            String fkIntoCustRefId  = "";
            if(null != map.get("intoCustomerRefId"))
                fkIntoCustRefId = String.valueOf(map.get("intoCustomerRefId"));
            String phoneNumber =  String.valueOf(map.get("phoneNumber"));//接口必传参数
            String phoneType =  String.valueOf(map.get("phoneType"));//接口必传参数

            if(StringUtils.isEmpty(result)){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("鹏元征信电话反查接口接口业务接口返回报文为空！");
            }else if(result.contains("Read timed out")){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("鹏元征信电话反查接口接口业务接口 访问超时！");
            }else{

                respXml = CompressStringUtil.decodeToXml(result);

                logger.info("解析鹏元征信电话反查开始：respXml=" + respXml);
                Document document = DocumentHelper.parseText(respXml);
                //获取根节点
                Element root = document.getRootElement();
                Iterator it = root.elementIterator();
                while (it.hasNext()) {//这里实际只会有一个符合条件的 节点
                    Element cisReport = (Element) it.next();
                    Iterator cisreports = cisReport.elementIterator();
                    while (cisreports.hasNext()) {
                        Element ele = (Element) cisreports.next();
                        Attribute subReportType = ele.attribute("subReportType");
                        isSuccess = "1";
                        if(subReportType != null) {
                            String reportId = subReportType.getValue();
                            //如果类型为个人，但是收费id为企业 或者类型为企业 但是收费ID为个人不进行解析
                            if((phoneType.equals(PYZXConstant.PY_PHONE_TYPE_TEL) && reportId.equals(PYZXConstant.PY_QUERY_TYPE_ID_13600))
                                    || (phoneType.equals(PYZXConstant.PY_PHONE_TYPE_COMPANY) && reportId.equals(PYZXConstant.PY_QUERY_TYPE_ID_21603))){
                                Map resultMap = handleEntity(ele,  fkIntoCustRefId,  phoneNumber, interfaceLogDto);
                                fkBizId = (String)resultMap.get("keyId");
                                retCode = (String)resultMap.get("retCode");;
                                retMsg = (String)resultMap.get("retMsg");;
                            }
                        }
                    }
                }

                logger.info("解析鹏元征信电话反查完成");


            }

        } catch (Exception ex) {
            JYLoggerUtil.error(this.getClass(), "===鹏元征信电话反查接口接口业务接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
            interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
            interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());

        } finally{
            try {
                interfaceLogDto.setRetBody(respXml);
                interfaceLogDto.setExt2(isSuccess);
                interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt4(retMsg);
                interfaceLogDto.setExt5(fkBizId);
                Long keyId = extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
            } catch (Exception e) {
                JYLoggerUtil.error(this.getClass(), "===保存鹏元征信电话反查接口信息日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
            }
        }
    }

    /**
     * @methodName: handleEntity
     * @param: [ele, fkIntoCustRefId, phoneNumber]
     * @describe: 解析并保存数据 如果treatResult 返回结果为1则进行处理，否则没有查询到数据
     * @auther: 董康宁
     * @date: 2018/1/10
     * @time: 16:16
     */
    public Map handleEntity(Element ele , String fkIntoCustRefId, String phoneNumber, ExtInterfaceLogDTO interfaceLogDto) throws Exception{
        Map resultMap = new HashMap();
        String retCode = "";//接口返回码
        String retMsg = "";//接口返回信息

        ExtWlPyzxPhoneRevcheckDTO entity = null;
        Attribute treatResult = ele.attribute("treatResult");
        try {
            if(treatResult!=null && "1".equals(treatResult.getValue())) {
                //1: 固话精确匹配     2: 固话非精确匹配
                Element thredNode = ele.element("resultType");
                if("telCheckInfo".equals(ele.getName())){
                    if("1".equals(thredNode.getText())){
                        entity = ananalysisXmlInfo(ele, "fixedTelMatch1");
                    }else{
                        entity = ananalysisXmlInfo(ele, "fixedTelMatch2");
                    }
                    entity.setResultType(PYZXConstant.PY_PHONE_TYPE_TEL);
                }
                entity.setPhoneNumber(phoneNumber);
                entity.setFkIntoCustId(Long.parseLong(fkIntoCustRefId));
                entity.setCreateBy(-1L);
                Long keyId = this.insertExtWlPyzxPhoneRevcheck(entity);
                resultMap.put("keyId", keyId.toString());

                retCode = treatResult.getValue();
                retMsg = "电话反查 查得;";
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
            }else if("2".equals(treatResult.getValue())){
                retCode = treatResult.getValue();
                retMsg = "电话反查 未查得;";
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
                interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_2.getValue());
            }else if("3".equals(treatResult.getValue())){
                Attribute treatErrorCode = ele.attribute("treatErrorCode");
                Attribute errorMessage = ele.attribute("errorMessage");

                retCode = treatResult.getValue();
                retMsg = "电话反查 其他原因未查得(" + treatErrorCode.getValue() + ":" + errorMessage.getValue() +");";
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
                interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("执行方法handleEntity异常",e);
        }
        resultMap.put("retCode", retCode);
        resultMap.put("retMsg", retMsg);
        return resultMap;
    }
    /**
     * @methodName: ananalysisXmlInfo
     * @param: [ele, nodeName]
     * @describe: 数据节点解析
     * @auther: 董康宁
     * @date: 2018/1/10
     * @time: 16:37
     */
    @SuppressWarnings("unchecked")
    public ExtWlPyzxPhoneRevcheckDTO ananalysisXmlInfo(Element ele,String nodeName ) throws Exception{
        ExtWlPyzxPhoneRevcheckDTO	entity = new ExtWlPyzxPhoneRevcheckDTO();
        Element fix1 = ele.element(nodeName);
        Iterator<Element> itm = fix1.elementIterator("item");
        while (itm.hasNext()) {
            //此处一般只有0-1个节点，所以不必返回集合
            Element thre = itm.next();
            entity =  (ExtWlPyzxPhoneRevcheckDTO) AnalyzeUtil.parseToEntity(thre, ExtWlPyzxPhoneRevcheckDTO.class);
        }
        return entity;
    }
}

