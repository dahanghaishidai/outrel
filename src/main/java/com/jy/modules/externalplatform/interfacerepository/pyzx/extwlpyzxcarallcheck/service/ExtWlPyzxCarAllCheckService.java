package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxcarallcheck.service;

import com.jy.modules.externalplatform.interfacerepository.pyzx.common.AnalyzeUtil;
import com.jy.modules.externalplatform.interfacerepository.pyzx.common.CompressStringUtil;
import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxcarallcheck.dao.ExtWlPyzxCarAllCheckDao;
import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxcarallcheck.dto.ExtWlPyzxCarAllCheckDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Attribute;
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
 * @className: ExtWlPyzxCarAllCheckService
 * @package: com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxcarallcheck.service
 * @describe: 定义  鹏元征信(车辆核查结果表) 实现类
 * @auther: 董康宁
 * @date: 2018/1/10
 * @time: 17:21
 */
@Service("com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxcarallcheck.service.ExtWlPyzxCarAllCheckService")
public class ExtWlPyzxCarAllCheckService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	static Logger logger = LoggerFactory.getLogger(ExtWlPyzxCarAllCheckService.class);

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;


	@Autowired
	private ExtWlPyzxCarAllCheckDao dao;


	/**
	 * @methodName: insertExtWlPyzxCarAllCheck
	 * @param: [dto]
	 * @describe: 新增 鹏元征信(车辆核查结果表)对象
	 * @auther: 董康宁
	 * @date: 2018/1/10
	 * @time: 17:22
	 */
	@SuppressWarnings("all")
	public Long insertExtWlPyzxCarAllCheck(ExtWlPyzxCarAllCheckDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlPyzxCarAllCheck(paramMap);
		
		ExtWlPyzxCarAllCheckDTO resultDto = (ExtWlPyzxCarAllCheckDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 鹏元征信车辆核查接口 数据落地
	 * @auther: 董康宁
	 * @date: 2018/1/10
	 * @time: 17:29
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

			String fkIntoCustRefId  = "";
			if(null != map.get("intoCustomerRefId"))
				fkIntoCustRefId = String.valueOf(map.get("intoCustomerRefId"));
			String cardId = (String)map.get("documentNo");//证件号码
			String custName = (String)map.get("name");//客户姓名
			String licenseNo = (String)map.get("licenseNo");//车牌号码 assetProofDto.getCardId()
			String carType = (String)map.get("carType");//号牌种类
			String VIN = (String)map.get("VIN");//车架号
			String registTime = (String)map.get("registTime");//初次登记日期

			if(StringUtils.isEmpty(result)){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("鹏元征信车辆核查接口接口业务接口返回报文为空！");
			}else if(result.contains("Read timed out")){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("鹏元征信车辆核查接口接口业务接口 访问超时！");
			}else{

			    respXml = CompressStringUtil.decodeToXml(result);//解密

                String  carStatusInfo = "";
                String  carCodeCheckResult = "";
                String  registTimeCheckResult = "";
                ExtWlPyzxCarAllCheckDTO carAllCheckInfoDTO = null;
                //解析机动车信息
                Element carInfo = AnalyzeUtil.parseXml(respXml, "carInfo");
                if(carInfo != null){
                    Attribute treatResult = carInfo.attribute("treatResult");
                    if(treatResult!=null && "1".equals(treatResult.getValue())) {
                        carAllCheckInfoDTO = (ExtWlPyzxCarAllCheckDTO) AnalyzeUtil.ananalysisXmlInfo(carInfo, "carInfo", ExtWlPyzxCarAllCheckDTO.class);
                    }
                }
                //解析车辆核查结果
                Element ele = AnalyzeUtil.parseXml(respXml, "carCheckInfo");
                if(ele!=null){
                    isSuccess = "1";
                    Attribute treatResult = ele.attribute("treatResult");
                    if(treatResult!=null && "1".equals(treatResult.getValue())) {
                        ExtWlPyzxCarAllCheckDTO tmpDto = (ExtWlPyzxCarAllCheckDTO) AnalyzeUtil.ananalysisXmlInfo(ele, "carCheckInfo", ExtWlPyzxCarAllCheckDTO.class);

                        if(null == carAllCheckInfoDTO){
                            carAllCheckInfoDTO = new ExtWlPyzxCarAllCheckDTO();
                        }
                        carAllCheckInfoDTO.setNameCheckResult(tmpDto.getNameCheckResult());
                        carAllCheckInfoDTO.setDocumentNoCheckResult(tmpDto.getDocumentNoCheckResult());
                        carAllCheckInfoDTO.setLicenseNoCheckResult(tmpDto.getLicenseNoCheckResult());
                        carAllCheckInfoDTO.setCarTypeCheckResult(tmpDto.getCarTypeCheckResult());

                        retCode = treatResult.getValue();
                        retMsg = "车辆核查数据 查得;";
                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
                    }else if("2".equals(treatResult.getValue())){
                        retCode = treatResult.getValue();
                        retMsg = "车辆核查数据 未查得;";
                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_2.getValue());
                    }else if("3".equals(treatResult.getValue())){
                        Attribute treatErrorCode = ele.attribute("treatErrorCode");
                        Attribute errorMessage = ele.attribute("errorMessage");

                        retCode = treatResult.getValue();
                        retMsg = "车辆核查数据 其他原因未查得(" + treatErrorCode.getValue() + ":" + errorMessage.getValue() +");";
                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
                    }
                }
                //解析车辆状态结果
                Element carStatus = AnalyzeUtil.parseXml(respXml, "carStatusInfo");
                if(carStatus!=null){
                    Attribute treatResult = carStatus.attribute("treatResult");
                    if(treatResult!=null && "1".equals(treatResult.getValue())) {
                        //解析车辆核查结果数据
                        carStatusInfo = this.analysisExtPyzxCarStatus(carStatus, "carStatusDesc");

                    }
                }
                //解析车架号核查结果
                Element carCodeCheck = AnalyzeUtil.parseXml(respXml, "carCodeCheck");
                if(carCodeCheck != null){
                    Attribute treatResult = carCodeCheck.attribute("treatResult");
                    if(treatResult!=null && "1".equals(treatResult.getValue())) {
                        //解析车架号核查结果
                        carCodeCheckResult = this.analysisExtPyzxCarStatus(carCodeCheck ,"carCodeCheckResult");

                    }
                }
                //解析初次登记日期核查结果
                Element carRegistTimeCheck = AnalyzeUtil.parseXml(respXml, "carRegistTimeCheck");
                if(carRegistTimeCheck != null){
                    Attribute treatResult = carRegistTimeCheck.attribute("treatResult");
                    if(treatResult!=null && "1".equals(treatResult.getValue())) {
                        //解析初次登记日期核查结果
                        registTimeCheckResult = this.analysisExtPyzxCarStatus(carRegistTimeCheck ,"registTimeCheckResult");

                    }
                }

                if(carAllCheckInfoDTO != null){
                    carAllCheckInfoDTO.setFkIntoCustId(Long.parseLong(fkIntoCustRefId));

                    carAllCheckInfoDTO.setName(custName);
                    carAllCheckInfoDTO.setDocumentNo(cardId);
                    carAllCheckInfoDTO.setLicenseNo(licenseNo);
                    carAllCheckInfoDTO.setCarType(carType);
                    carAllCheckInfoDTO.setVin(VIN);
                    carAllCheckInfoDTO.setRegistTime(registTime);

                    carAllCheckInfoDTO.setCarStatusDesc(carStatusInfo);//车辆状态结果
                    carAllCheckInfoDTO.setCarCodeCheckResult(carCodeCheckResult);//车架号核查结果
                    carAllCheckInfoDTO.setRegistTimeCheckResult(registTimeCheckResult);//初次登记日期核查结果

                    //保存数据
                    Long keyId = this.insertExtWlPyzxCarAllCheck(carAllCheckInfoDTO);
                    if(null != keyId)
                        fkBizId = keyId.toString();
                }

			}

		} catch (Exception ex) {
			JYLoggerUtil.error(this.getClass(), "===鹏元征信车辆核查接口接口业务接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());

		} finally{
			try {
				interfaceLogDto.setRetBody(respXml);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
				interfaceLogDto.setExt4(retMsg);
				interfaceLogDto.setExt5(fkBizId);
				extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存鹏元征信车辆核查接口信息日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
			}
		}
	}

    /**
     * @methodName: analysisExtPyzxCarStatus
     * @param: [ele, nodeName]
     * @describe:  解析车辆状态数据
     * @auther: 董康宁
     * @date: 2018/1/10
     * @time: 17:37
     */
    @SuppressWarnings("unchecked")
    public String analysisExtPyzxCarStatus(Element ele,String nodeName) throws Exception{
        String statuDesc = "";
        Iterator<Element> itm = ele.elementIterator(nodeName);
        while (itm.hasNext()) {
            //此处一般只有0-1个节点，所以不必返回集合
            Element e = itm.next();
            if(org.apache.commons.lang.StringUtils.isNotEmpty(e.getText())){
                statuDesc = e.getText();
            }
        }
        return statuDesc;
    }
}

