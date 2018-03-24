package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilecheck.service;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

import com.alibaba.fastjson.JSON;
import com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.dto.ExtWlPaCreditInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.service.RequestPaDto;
import com.jy.modules.externalplatform.interfacerepository.pa.extwlpainfo.dto.ExtWlPaInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.pa.extwlpainfo.service.ExtWlPaInfoService;
import com.jy.modules.externalplatform.interfacerepository.pyzx.common.AnalyzeUtil;
import com.jy.modules.externalplatform.interfacerepository.pyzx.common.CompressStringUtil;
import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilestatus.dto.ExtWlPyzxMobileStatusDTO;
import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilestatus.service.ExtWlPyzxMobileStatusService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.ExtCompressStringUtil;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Attribute;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilecheck.dto.ExtWlPyzxMobileCheckDTO;
import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilecheck.dao.ExtWlPyzxMobileCheckDao;

/**
 * @className: ExtWlPyzxMobileCheckService
 * @package: com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilecheck.service
 * @describe: 定义  手机号码核查结果 实现类
 * @auther: 董康宁
 * @date: 2018/1/10
 * @time: 13:57
 */
@Service("com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilecheck.service.ExtWlPyzxMobileCheckService")
public class ExtWlPyzxMobileCheckService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static Logger logger = LoggerFactory.getLogger(ExtWlPyzxMobileCheckService.class);

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

	@Autowired
	ExtWlPyzxMobileStatusService extWlPyzxMobileStatusService;

	@Autowired
	private ExtWlPyzxMobileCheckDao dao;


	/**
     * @title: insertExtWlPyzxMobileCheck
     * @author Administrator
     * @description: 新增 手机号码核查结果对象
     * @date 2018-01-10 13:51:32
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlPyzxMobileCheck(ExtWlPyzxMobileCheckDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlPyzxMobileCheck(paramMap);
		
		ExtWlPyzxMobileCheckDTO resultDto = (ExtWlPyzxMobileCheckDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 鹏元征信手机核查接口 数据落地
	 * @auther: 董康宁
	 * @date: 2018/1/10
	 * @time: 14:10
	 */
	@Override
	public void saveMessage(Map<String, Object> map) {
        String isSuccess = "0";//是否调用成功  1：成功 0：失败
        String retCode = "";//接口返回码
        String retMsg = "";//接口返回信息
        String fkBizId = "";//接口落地数据主表ID
        String respXml = "";

        //日志信息
        ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
        String result = String.valueOf(map.get("result"));

        try {

            String intoCustomerRefId  = "";
            if(null != map.get("intoCustomerRefId"))
                intoCustomerRefId = String.valueOf(map.get("intoCustomerRefId"));
            String phoneNumber =  String.valueOf(map.get("phoneNumber"));//接口必传参数

            if(StringUtils.isEmpty(result)){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("鹏元征信手机核查接口接口业务接口返回报文为空！");
            }else if(result.contains("Read timed out")){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("鹏元征信手机核查接口接口业务接口 访问超时！");
            }else{

                respXml = CompressStringUtil.decodeToXml(result);

                String retCode1 = "";//接口返回码
                String retMsg1 = "";//接口返回信息
                //保存个人手机核查数据
                Element moblieCheckEle = AnalyzeUtil.parseXml(respXml, "mobileCheckInfo");
                if(moblieCheckEle!=null){
                    isSuccess = "1";//设置成功
                    Attribute treatResult = moblieCheckEle.attribute("treatResult");
                    if(treatResult!=null && "1".equals(treatResult.getValue())) {
                        Long keyId = this.savaPyzxMobileCheck(moblieCheckEle, intoCustomerRefId, phoneNumber);
                        if(null != keyId)
                            fkBizId = keyId.toString();

                        retCode1 = treatResult.getValue();
                        retMsg1 = "个人手机核查数据 查得;";
                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
                    }else if("2".equals(treatResult.getValue())){
                        retCode1 = treatResult.getValue();
                        retMsg1 = "个人手机核查数据 未查得;";
                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_2.getValue());
                    }else if("3".equals(treatResult.getValue())){
                        Attribute treatErrorCode = moblieCheckEle.attribute("treatErrorCode");
                        Attribute errorMessage = moblieCheckEle.attribute("errorMessage");

                        retCode1 = treatResult.getValue();
                        retMsg1 = "个人手机核查数据 其他原因未查得(" + treatErrorCode.getValue() + ":" + errorMessage.getValue() +");";
                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
                    }
                }

                String retCode2 = "";//接口返回码
                String retMsg2 = "";//接口返回信息
                //保存个人手机状态数据
                Element moblieStaEle = AnalyzeUtil.parseXml(respXml, "mobileStatusInfo");
                if(moblieStaEle!=null){
                    isSuccess = "1";//设置成功
                    Attribute treatResult = moblieStaEle.attribute("treatResult");
                    if(treatResult!=null && "1".equals(treatResult.getValue())) {
                        Long keyId = this.savaPyzxMobileStatus(moblieStaEle, intoCustomerRefId, phoneNumber);
                        if(null != keyId)
                            fkBizId += ";" + keyId.toString();

                        retCode2 = treatResult.getValue();
                        retMsg2 = "个人手机状态数据 查得;";
                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
                    }else if("2".equals(treatResult.getValue())){

                        retCode2 = treatResult.getValue();
                        retMsg2 = "个人手机状态数据 未查得;";
                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_2.getValue());
                    }else if("3".equals(treatResult.getValue())){
                        Attribute treatErrorCode = moblieCheckEle.attribute("treatErrorCode");
                        Attribute errorMessage = moblieCheckEle.attribute("errorMessage");

                        retCode2 = treatResult.getValue();
                        retMsg2 = "个人手机状态数据 其他原因未查得(" + treatErrorCode.getValue() + ":" + errorMessage.getValue() +");";
                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
                    }
                }
                retCode = retCode1 + ";" + retCode2;
                retMsg = retMsg1 + retMsg2;
            }

        } catch (Exception ex) {
            JYLoggerUtil.error(this.getClass(), "===鹏元征信手机核查接口接口业务接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
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
                JYLoggerUtil.error(this.getClass(), "===保存鹏元征信手机核查接口信息日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
            }
        }
    }

    /**
     * @methodName: savaPyzxMobileCheck
     * @param: [ele, fkIntoCustRefId, phoneNumber]
     * @describe: 解析保存手机核查
     * @auther: 董康宁
     * @date: 2018/1/10
     * @time: 14:28
     */
    public Long savaPyzxMobileCheck(Element ele ,String fkIntoCustRefId, String phoneNumber) throws Exception{
        Long keyId = 0L;
        try {
            ExtWlPyzxMobileCheckDTO entity = (ExtWlPyzxMobileCheckDTO) ananalysisXmlInfo(ele ,ExtWlPyzxMobileCheckDTO.class);
            entity.setFkIntoCustId(Long.parseLong(fkIntoCustRefId));
            entity.setExt1(phoneNumber);
            entity.setCreateBy(-1L);
            keyId = this.insertExtWlPyzxMobileCheck(entity);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("鹏元征信个人手机核查数据保存异常",e);
        }
        return keyId;
    }
    /**
     * @methodName: savaPyzxMobileStatus
     * @param: [ele, fkIntoCustRefId, phoneNumber]
     * @describe: 解析保存手机状态信息
     * @auther: 董康宁
     * @date: 2018/1/10
     * @time: 14:44
     */
    public Long savaPyzxMobileStatus(Element ele ,String fkIntoCustRefId, String phoneNumber) throws Exception{
        Long keyId = 0L;
        try {
            ExtWlPyzxMobileStatusDTO entity = (ExtWlPyzxMobileStatusDTO) ananalysisXmlInfo(ele ,ExtWlPyzxMobileStatusDTO.class);
            entity.setFkIntoCustId(Long.parseLong(fkIntoCustRefId));
            entity.setExt1(phoneNumber);
            entity.setCreateBy(-1L);
            keyId = extWlPyzxMobileStatusService.insertExtWlPyzxMobileStatus(entity);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("鹏元征信个人手机状态数据保存异常",e);
        }
        return keyId;
    }
    /**
     * @methodName: ananalysisXmlInfo
     * @param: [ele, entity]
     * @describe: 数据节点解析
     * @auther: 董康宁
     * @date: 2018/1/10
     * @time: 14:33
     */
    public Object ananalysisXmlInfo(Element ele ,Class<?> entity) throws Exception{
        Object obj = entity.newInstance();
        Iterator<Element> itm = ele.elementIterator("item");
        while (itm.hasNext()) {
            Element thre = (Element) itm.next();
            obj =  AnalyzeUtil.parseToEntity(thre, entity);
        }
        return obj;
    }
}

