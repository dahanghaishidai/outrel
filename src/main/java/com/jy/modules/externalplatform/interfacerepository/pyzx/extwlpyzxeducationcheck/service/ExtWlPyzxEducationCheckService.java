package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxeducationcheck.service;

import com.jy.modules.externalplatform.interfacerepository.pyzx.common.AnalyzeUtil;
import com.jy.modules.externalplatform.interfacerepository.pyzx.common.CompressStringUtil;
import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxeducationcheck.dao.ExtWlPyzxEducationCheckDao;
import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxeducationcheck.dto.ExtWlPyzxEducationCheckDTO;
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
import java.util.Map;

/**
 * @className: ExtWlPyzxEducationCheckService
 * @package: com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxeducationcheck.service
 * @describe: 定义  鹏元征信（学历核查结果表） 实现类
 * @auther: 董康宁
 * @date: 2018/1/10
 * @time: 16:46
 */
@Service("com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxeducationcheck.service.ExtWlPyzxEducationCheckService")
public class ExtWlPyzxEducationCheckService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    static Logger logger = LoggerFactory.getLogger(ExtWlPyzxEducationCheckService.class);

    @Autowired
    ExtInterfaceLogService extInterfaceLogService;


    @Autowired
	private ExtWlPyzxEducationCheckDao dao;


	/**
	 * @methodName: insertExtWlPyzxEducationCheck
	 * @param: [dto]
	 * @describe: 新增 鹏元征信（学历核查结果表）对象
	 * @auther: 董康宁
	 * @date: 2018/1/10
	 * @time: 16:40
	 */
	@SuppressWarnings("all")
	public Long insertExtWlPyzxEducationCheck(ExtWlPyzxEducationCheckDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlPyzxEducationCheck(paramMap);
		
		ExtWlPyzxEducationCheckDTO resultDto = (ExtWlPyzxEducationCheckDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 鹏元征信学历核查接口 数据落地
	 * @auther: 董康宁
	 * @date: 2018/1/10
	 * @time: 16:55
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
            String graduatedYear = (String)map.get("graduatedYear");//毕业年份
            String certificateNumber = (String)map.get("certificateNumber");//学历证编号
            String graduateInstitutions = (String)map.get("graduateInstitutions");//毕业院校
            String collegeLevel = (String)map.get("collegeLevel");//学历层次 代码

            if(StringUtils.isEmpty(result)){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("鹏元征信学历核查接口接口业务接口返回报文为空！");
            }else if(result.contains("Read timed out")){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("鹏元征信学历核查接口接口业务接口 访问超时！");
            }else{
                respXml = CompressStringUtil.decodeToXml(result);
                //解析鹏元征信学历信息
                Element educationCheck = AnalyzeUtil.parseXml(respXml, "educationCheck");
                if(educationCheck != null){
                    isSuccess = "1";//设置成功
                    Attribute treatResult = educationCheck.attribute("treatResult");
                    if(treatResult != null && "1".equals(treatResult.getValue())) {//查到信息，未查到不处理
                        //学历核查信息
                        ExtWlPyzxEducationCheckDTO entity =  (ExtWlPyzxEducationCheckDTO) AnalyzeUtil.parseToEntity(educationCheck, ExtWlPyzxEducationCheckDTO.class);
                        if(entity!=null){

                            entity.setFkIntoCustId(Long.parseLong(fkIntoCustRefId));
                            entity.setName(custName);
                            entity.setDocumentNo(cardId);
                            entity.setLevelNo(certificateNumber);
                            entity.setGraduateTime(graduatedYear.substring(0, graduatedYear.indexOf("-")));
                            entity.setCollege(graduateInstitutions);
                            entity.setCollegeLevel(collegeLevel);

                            Long keyId = this.insertExtWlPyzxEducationCheck(entity);
                            if(null != keyId)
                                fkBizId = keyId.toString();
                        }

                        retCode = treatResult.getValue();
                        retMsg = "学历核查数据 查得;";
                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
                    }else if("2".equals(treatResult.getValue())){
                        retCode = treatResult.getValue();
                        retMsg = "学历核查数据 未查得;";
                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_2.getValue());
                    }else if("3".equals(treatResult.getValue())){
                        Attribute treatErrorCode = educationCheck.attribute("treatErrorCode");
                        Attribute errorMessage = educationCheck.attribute("errorMessage");

                        retCode = treatResult.getValue();
                        retMsg = "学历核查数据 其他原因未查得(" + treatErrorCode.getValue() + ":" + errorMessage.getValue() +");";
                        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
                        interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
                    }
                }

            }

        } catch (Exception ex) {
            JYLoggerUtil.error(this.getClass(), "===鹏元征信学历核查接口接口业务接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
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
                JYLoggerUtil.error(this.getClass(), "===保存鹏元征信学历核查接口信息日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
            }
        }
    }
}

