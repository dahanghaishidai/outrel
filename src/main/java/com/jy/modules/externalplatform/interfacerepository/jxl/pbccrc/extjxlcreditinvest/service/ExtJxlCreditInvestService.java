package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.service;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jodd.util.StringUtil;
import net.sf.json.JSONObject;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jy.modules.common.util.DateUtil;
import com.jy.modules.common.util.JsonTool;
import com.jy.modules.common.util.StringArrayUtil;
import com.jy.modules.externalplatform.interfacerepository.jxl.callthirdbiz.TransferJuxinliBizInteface;
import com.jy.modules.externalplatform.interfacerepository.jxl.common.pojo.ResponseCollectReqDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.common.pojo.ResponseDataDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.common.util.JXLCodeConstant;
import com.jy.modules.externalplatform.interfacerepository.jxl.common.util.JXLConstant;
import com.jy.modules.externalplatform.interfacerepository.jxl.common.util.ProcessCodeEnum;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.dao.ExtJxlCreditInvestDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.dto.ExtJxlCreditInvestDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.dto.RequestCreditInvestDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditreport.dto.ExtJxlCreditReportDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditreport.service.ExtJxlCreditReportService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.api.sysconfig.SysConfigAPI;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtJxlCreditInvestService
 * @description: 定义  聚信立央行征信采集申请表 实现类
 * @author:  dell
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.service.ExtJxlCreditInvestService")
public class ExtJxlCreditInvestService implements Serializable,ExtSaveMessageDao {

	 private static final long serialVersionUID = 1L;
	
	private static Logger logger = LoggerFactory.getLogger(ExtJxlCreditInvestService.class);
    
	@Autowired
	private ExtJxlCreditInvestDao dao;
	
	@Autowired
	private SysConfigAPI sysConfigAPI;
	
	
	@Autowired
	private ExtJxlCreditReportService  creditReportService;
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
	

	/**
     * @author dell
     * @description: 按条件查询聚信立央行征信采集申请表列表
     * @date 2017-08-24 19:56:47
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlCreditInvestDTO> searchExtJxlCreditInvest(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlCreditInvestDTO> dataList = dao.searchExtJxlCreditInvest(searchParams);
        return dataList;
    }
	

	/**
     * @title: insertExtJxlCreditInvest
     * @author dell
     * @description: 新增 聚信立央行征信采集申请表对象
     * @date 2017-08-24 19:56:47
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlCreditInvest(ExtJxlCreditInvestDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlCreditInvest(paramMap);
		
		ExtJxlCreditInvestDTO resultDto = (ExtJxlCreditInvestDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	
	
	/**
	* @title: updateExtJxlCreditInvestState
	* @description: 更新 聚信立央行征信采集申请表对象[调用状态]
	* @date 2017年8月31日 上午11:32:56
	* @param dto
	* @param state
	* @throws Exception
	* @throws 
	*/ 
	public void updateExtJxlCreditInvestState(ExtJxlCreditInvestDTO dto,String state) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		dto.setState(state);
		if(JXLConstant.INVOKE_FAILED_STATE.equals(state)){//调用状态为失败时，调用次数累计加1
			long invokeTimes = dto.getInvokeTimes() != null ? dto.getInvokeTimes() + 1:1L;
			dto.setInvokeTimes(invokeTimes);
		}
		paramMap.put("dto", dto);
		dao.updateExtJxlCreditInvestState(paramMap);
	}
	
	
	/**
	* @title: updateExtJxlCreditInvestLinkConsultIds
	* @description: 更新 聚信立央行征信采集申请表对象[关联咨询编号]
	* @date 2017年9月1日 上午11:28:20
	* @param dto
	* @param linkConsultIds
	* @throws Exception
	* @throws 
	*/ 
	public void updateExtJxlCreditInvestLinkConsultIds(ExtJxlCreditInvestDTO dto,String linkConsultIds) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		dto.setLinkConsultIds(linkConsultIds);
		paramMap.put("dto", dto);
		dao.updateExtJxlCreditInvestLinkConsultIds(paramMap);
	}
	
	
	/**
	 * @throws Exception 
	* @title: submitCreditApplyInfo
	* @description: 提交央行征信采集申请信息
	* @date 2017年8月28日 下午4:46:51
	* @param requestBody
	* @return
	* @throws 
	*/ 
	public ResponseCollectReqDTO submitCreditApplyInfo(RequestCreditInvestDTO requestBody) throws Exception {
		ResponseCollectReqDTO responseBody = new ResponseCollectReqDTO();
		//获取咨询编号
		Long fkConsultId = requestBody.getConsultId();
		//接口是否调用成功
		boolean success = false;
		//校验客户在有效期内是否已成功采集央行征信
		boolean flag = checkCustAccessCreditReport(requestBody);
		if(flag){
			responseBody.setSuccess(success);
			responseBody.setMessage("该客户在有效期内已成功采集央行征信报告，请勿重复提交！");
			return responseBody;
		}
		//机构号
		String orgCode = sysConfigAPI.getValue(JXLConstant.JXL_ORG_ACCOUNT);
		//请求地址
		String url = sysConfigAPI.getValue(JXLConstant.JXL_CREDIT_APPLY) + "/"+ orgCode;
		//组装请求报文
		String reqMsg = makeUpReqMsg(requestBody);
		//返回报文
		String respMsg = "";
		//消息提示
		String message = "";
		//流程码
		String processCodeStr = "";
		//保存 聚信立央行征信采集申请表信息
		ExtJxlCreditInvestDTO   creditInvestDTO = new ExtJxlCreditInvestDTO();
		try {
			//调用接口，获取返回报文
			respMsg = TransferJuxinliBizInteface.executeHttpPostEsb(url,reqMsg, null, String.valueOf(fkConsultId), JXLCodeConstant.JXL_CREDIT_TYPE, JXLCodeConstant.JXL_CREDIT_APPLY_BUSINESS_CODE);
			if(StringUtils.isNotEmpty(respMsg)){
				JSONObject respJson = JSONObject.fromObject(respMsg);
				if(JsonTool.isJSONObjectNotEmpty(respJson)){
					success = respJson.getBoolean(JXLConstant.SUCCESS);//接口调用是否成功
					if(success){
						JSONObject dataJson = respJson.getJSONObject(JXLConstant.DATA);//返回业务主体信息
						if(JsonTool.isJSONObjectNotEmpty(dataJson)){
							ResponseDataDTO data = (ResponseDataDTO)JSONObject.toBean(dataJson,ResponseDataDTO.class);
							Long processCode = dataJson.getLong(JXLConstant.PROCESS_CODE);//流程码
							data.setProcessCode(processCode);
							processCodeStr = String.valueOf(processCode);
							responseBody.setData(data);
							creditInvestDTO.setProcessType(data.getType());
							creditInvestDTO.setProcessCode(processCode);
							creditInvestDTO.setContent(data.getContent());
							creditInvestDTO.setToken(data.getToken());
							if(ProcessCodeEnum.PROCESS_CODE_10008.getKey().equals(processCodeStr)){
								creditInvestDTO.setState(JXLConstant.INVOKE_WAITING_STATE);//待调用状态
							}else{
                                success = false;
                                message = data.getContent();
                            }
						}
					}else{
						message = respJson.getString(JXLConstant.MESSAGE);//消息提示
					}
				}
			}else{
				message = "返回报文为空";
			}
		} catch (Exception e) {
			success = false;
			responseBody.setSuccess(success);
			message = "请求接口异常";
		    logger.error("调用聚信立[提交央行征信采集申请]接口异常,咨询编号:"+fkConsultId,e);
		}finally{
			responseBody.setSuccess(success);
			responseBody.setMessage(message);
			creditInvestDTO.setFkConsultId(fkConsultId);
			creditInvestDTO.setCustName(requestBody.getName());
			creditInvestDTO.setCellPhoneNum(requestBody.getCellPhoneNum());
			creditInvestDTO.setIdCardNum(requestBody.getIdCardNum());
			creditInvestDTO.setSuccess(String.valueOf(success));
			creditInvestDTO.setMessage(message);
			try {
				Long fkInvestId = insertExtJxlCreditInvest(creditInvestDTO);
				String invokeSwitch = sysConfigAPI.getValue(JXLConstant.JXL_JIKE_INVOKE_SWITCH);//聚信立即刻采集调用开关
				if(fkInvestId != null && JXLConstant.YES.equalsIgnoreCase(invokeSwitch) && ProcessCodeEnum.PROCESS_CODE_10008.getKey().equals(processCodeStr)){
					//根据采集TOKEN获取并保存央行征信原始数据接口
					creditReportService.accessOrSaveJxlCreditReport(sysConfigAPI.getValue(JXLConstant.JXL_CREDIT_ACCESS),creditInvestDTO);	
				}
			} catch (Exception e) {
				logger.error("保存聚信立[提交央行征信采集申请]信息异常,咨询编号:"+fkConsultId,e);
			}
		}
		return responseBody;
	}


	/**
	* @description: 组装请求报文
	* @param requestBody
	* @return
	* @throws 
	*/ 
	private String makeUpReqMsg(RequestCreditInvestDTO requestBody) {
		JSONObject  reqJson = new JSONObject();//存储业务请求信息
		JSONObject  applyInfoJson = new JSONObject();//存储申请信息
		JSONObject  basicInfoJson = new JSONObject();//存储客户基础信息
		basicInfoJson.put("name", requestBody.getName());//客户姓名
		basicInfoJson.put("cell_phone_num", requestBody.getCellPhoneNum());//手机号码
		basicInfoJson.put("id_card_num", requestBody.getIdCardNum());//身份证号码
		applyInfoJson.put("basic_info", basicInfoJson);
		reqJson.put("apply_info", applyInfoJson);
		reqJson.put("account", requestBody.getAccount());//央行征信网站账号
		reqJson.put("password", requestBody.getPassword());//央行征信网站密码
		reqJson.put("captcha", requestBody.getCaptcha());//央行征信发送的验证码
		return reqJson.toString();
	}
	

	/**
	* @title: generateAccessJxlCreditReport
	* @description: 定时处理 待调用/调用失败的[聚信立央行征信采集申请]信息列表
	*        调用原则：调用状态为"调用失败"的，不得超过聚信立失败调用限制次数；
	*               调用状态为"待调用"的，不得超过聚信立央行征信采集时限。
	* @date 2017年9月1日 下午3:27:23
	* @throws Exception
	* @throws 
	*/ 
	public void  generateAccessJxlCreditReport() throws Exception{
		Map<String, Object>  paramMap = new HashMap<String, Object>();
		ExtJxlCreditInvestDTO  dto = new ExtJxlCreditInvestDTO();
		dto.setState(JXLConstant.getJobStateStr());
		paramMap.put("dto", dto);
		List<ExtJxlCreditInvestDTO> dataList = searchExtJxlCreditInvest(paramMap);
		if(CollectionUtils.isNotEmpty(dataList)){
			String url = sysConfigAPI.getValue(JXLConstant.JXL_CREDIT_ACCESS);
			boolean isTimeLimit = false; //是否时限控制
			String  timeLimitSwitch =  sysConfigAPI.getValue(JXLConstant.JXL_TIME_LIMIT_SWITCH);//聚信立信息采集时限控制总开关
			String  timeLimit = "";//聚信立央行征信采集时限(小时)
			if(JXLConstant.YES.equalsIgnoreCase(timeLimitSwitch)){
				timeLimit = sysConfigAPI.getValue(JXLConstant.JXL_CREDIT_ACCESS_TIME_LIMIT);
				isTimeLimit = StringUtils.isNotEmpty(timeLimit)? true: isTimeLimit;
			}
			boolean isLimitTimes = false;//是否次数控制
			String  limitTimesSwitch  =  sysConfigAPI.getValue(JXLConstant.JXL_LIMIT_TIMES_SWITCH);//聚信立失败调用次数限制总开关
			String  limitTimes = "";//聚信立失败调用限制次数(次数)
			if(JXLConstant.YES.equalsIgnoreCase(limitTimesSwitch)){
				limitTimes = sysConfigAPI.getValue(JXLConstant.JXL_FAIL_INVOKE_LIMIT_TIMES);
				isLimitTimes = StringUtils.isNotEmpty(limitTimes)? true: isLimitTimes;
			}
			for (ExtJxlCreditInvestDTO creditInvestDTO : dataList) {
				String state = creditInvestDTO.getState();//调用状态
				//调用状态为"待调用"的，不得超过聚信立央行征信采集时限(小时)
				if(JXLConstant.INVOKE_WAITING_STATE.equals(state)){
					if(isTimeLimit){
						Timestamp createTime = creditInvestDTO.getCreateTime();//创建日期
						long limitHours = Long.valueOf(timeLimit);
						long diffHours = DateUtil.getDifference(createTime, new Date(), JXLConstant.HOUR);
						if(diffHours < limitHours){
							creditReportService.accessOrSaveJxlCreditReport(url,creditInvestDTO);
						}else{
							//修改[聚信立央行征信采集申请表]调用状态为终止流程	
							updateExtJxlCreditInvestState(creditInvestDTO, JXLConstant.INVOKE_STOP_STATE);
						}
					}else{
						creditReportService.accessOrSaveJxlCreditReport(url,creditInvestDTO);
					}
					
				}else if(JXLConstant.INVOKE_FAILED_STATE.equals(state)){
					if(isLimitTimes){
						long invokeTimes = creditInvestDTO.getInvokeTimes() != null ? creditInvestDTO.getInvokeTimes() : 0;
						long limitCount = Long.valueOf(limitTimes);
						if(invokeTimes < limitCount){
							creditReportService.accessOrSaveJxlCreditReport(url,creditInvestDTO);
						}else{
							//修改[聚信立央行征信采集申请表]调用状态为终止流程	
							updateExtJxlCreditInvestState(creditInvestDTO, JXLConstant.INVOKE_STOP_STATE);
						}
					}else{
						creditReportService.accessOrSaveJxlCreditReport(url,creditInvestDTO);
					}
				}		
		    }	
	   }
    }
	

	/**
	* @title: checkCustAccessCreditReport
	* @description: 校验客户（客户姓名+证件号）在有效期内是否已成功采集央行征信
	* @date 2017年9月6日 上午10:53:12
	* @param requestBody
	* @return
	* @throws Exception
	* @throws 
	*/ 
	public boolean checkCustAccessCreditReport(RequestCreditInvestDTO requestBody) throws Exception{
		boolean flag = false;
		String effectivePeriodSwitch = sysConfigAPI.getValue(JXLConstant.JXL_EFFECTIVE_PERIOD_SWITCH);//聚信立信息采集有效期设置开关
		if("yes".equalsIgnoreCase(effectivePeriodSwitch)){
			Map<String, Object> paramMap = new HashMap<String, Object>();
			ExtJxlCreditInvestDTO  jxlCreditInvestDTO  = new  ExtJxlCreditInvestDTO();
		    jxlCreditInvestDTO.setCustName(requestBody.getName());
			jxlCreditInvestDTO.setIdCardNum(requestBody.getIdCardNum());
			jxlCreditInvestDTO.setState(JXLConstant.INVOKE_SUCCESS_STATE);
			paramMap.put("dto", jxlCreditInvestDTO);
			List<ExtJxlCreditInvestDTO> list = searchExtJxlCreditInvest(paramMap);
			if(CollectionUtils.isNotEmpty(list)){
				jxlCreditInvestDTO = list.get(0);
				Long fkConsultId = requestBody.getConsultId();
				Long consultId = jxlCreditInvestDTO.getFkConsultId();
				String linkConsultIds = jxlCreditInvestDTO.getLinkConsultIds();//关联咨询编号
				String effectivePeriod = sysConfigAPI.getValue(JXLConstant.JXL_CREDIT_REPORT_EFFECTIVE_PERIOD);//聚信立央行征信报告有效期(天)
				if(StringUtils.isNotEmpty(effectivePeriod)){
					long effectivePeriodDays = Long.valueOf(effectivePeriod);
					long diffDays = DateUtil.getDifference(jxlCreditInvestDTO.getCreateTime(), new Date(), JXLConstant.DAY);//相差天数
					if (diffDays <= effectivePeriodDays) {
						if(!consultId.equals(fkConsultId)){
							 linkConsultIds = StringArrayUtil.splitJoinStr(linkConsultIds,String.valueOf(fkConsultId),JXLConstant.COMMA_SEPARATOR);
							 jxlCreditInvestDTO.setLinkConsultIds(linkConsultIds);
							 //更新关联咨询编号字段
							 updateExtJxlCreditInvestLinkConsultIds(jxlCreditInvestDTO,linkConsultIds);
						}
						flag = true;
					}
				}
				
			}
		}
		return flag;
	}
	
	
	/**
	* @title: queryMaxConsultIdByIntoId
	* @author:陈东栋
	* @description: 查询进件咨询关联信息表中,某进件对应的最大的咨询单号 
	* @date 2017年9月19日 上午10:34:26
	* @param intoId
	* @return
	* @throws 
	*/ 
	public Long queryMaxConsultIdByIntoId(String intoId) {
		Long consultId = null;
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("intoId", intoId);
		Map<String, Object> map = dao.queryMaxConsultIdByIntoId(paramMap);
		if ((map != null) && (map.size() > 0)) {
		    consultId = Long.valueOf(String.valueOf(map.get("CONSULT_ID")));
		}
		return consultId;
	}
	
	/**
	* @throws Exception 
	* @title: lookJxlCreditReportInfo
	* @author:陈东栋
	* @description: 查询聚信立央行征信报告信息
	* @date 2017年9月19日 上午11:06:28
	* @param intoId
	* @return
	* @throws 
	*/ 
    public  ModelAndView inquireJxlCreditReportInfo(String intoId) throws Exception {
    	 ModelAndView model = new ModelAndView();
    	//获取咨询编号
         Long consultId = queryMaxConsultIdByIntoId(intoId);
		 if (consultId != null) {
			 Map<String,Object> searchParams = new HashMap<String,Object>();
			 ExtJxlCreditInvestDTO  creditInvestDTO = new ExtJxlCreditInvestDTO();
			 creditInvestDTO.setFkConsultId(consultId);
			 creditInvestDTO.setState(JXLConstant.INVOKE_SUCCESS_STATE);
			 creditInvestDTO.setSuccess(JXLConstant.TRUE); 
			 searchParams.put("dto", creditInvestDTO);
			 List<ExtJxlCreditInvestDTO> creditInvestList = searchExtJxlCreditInvest(searchParams);
		     if(CollectionUtils.isNotEmpty(creditInvestList)){
		    	  //在聚信立央行征信采集申请表中，获取咨询编号关联的最新的记录
		    	  int size = creditInvestList.size();
		    	  creditInvestDTO = creditInvestList.get(size-1);
		    	  searchParams.clear();
		    	  //查询聚信立央行征信报告
		    	  ExtJxlCreditReportDTO  creditReportDTO = new ExtJxlCreditReportDTO();
		    	  creditReportDTO.setFkInvestId(creditInvestDTO.getId());
		    	  creditReportDTO.setSuccess(JXLConstant.TRUE);
		    	  creditReportDTO.setErrorCode(JXLConstant.QUERY_SUCESS_CODE);
		    	  searchParams.put("dto", creditReportDTO);
		    	  List<ExtJxlCreditReportDTO> creditReportList = creditReportService.searchExtJxlCreditReport(searchParams);
		    	  searchParams.clear();
		    	  if(CollectionUtils.isNotEmpty(creditReportList)){
		    		  creditReportDTO = creditReportList.get(0); 
		    		  Long fkReportId = creditReportDTO.getId();
		    		  //查询信贷记录
		    		  creditReportService.inquireCreditRecordInfo(fkReportId,model);
		    		  //查询查询记录
		    		  creditReportService.inquireQrecordInfo(fkReportId,model);
		    		  model.addObject("creditReportDTO", creditReportDTO);
		    	  }
		     }
		 }
		return model;
	}

	@Override
	public void saveMessage(Map<String, Object> map) {
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results=String.valueOf(map.get("result"));
    	JSONObject jsonObj = null;
    	//流程码
		ExtJxlCreditInvestDTO   creditInvestDTO = new ExtJxlCreditInvestDTO();
		creditInvestDTO.setSysCode(String.valueOf(map.get("sysCode")));
		try {
			if(StringUtils.isNotEmpty((CharSequence) map.get("result")) && !"null".equals(map.get("result"))){
				jsonObj = JSONObject.fromObject(map.get("result"));
				//调用失败
				if(null!=jsonObj.get("retCode") && jsonObj.get("retCode").equals("500")){
					
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_6.getKey());
					interfaceLogDto.setRetMsg(String.valueOf(jsonObj.get("errorDesc")));
					return;
				}
				if(JsonTool.isJSONObjectNotEmpty(jsonObj)){
					boolean success = jsonObj.getBoolean(JXLConstant.SUCCESS);//接口调用是否成功
					if(success){
			             interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
			             interfaceLogDto.setRetMsg("调用聚信立央行征信采集接口获取token成功！");
	                }else{
				        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					    interfaceLogDto.setRetMsg("调用聚信立央行征信采集接口获取token失败！");
	                }
				}else{
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				    interfaceLogDto.setRetMsg("调用聚信立央行征信采集接口获取token失败！");
				}
			}else{
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
			    interfaceLogDto.setRetMsg("调用聚信立央行征信采集接口获取token失败！");
			}
		} catch (Exception ex) {
			  JYLoggerUtil.error(this.getClass(), "===调用聚信立央行征信采集获取token解析回参异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
			  String msg = ex.getMessage();
			  if(StringUtil.isNotEmpty(msg)){
				  if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					  interfaceLogDto.setRetMsg("调用聚信立央行征信采集获取token接口异常请求返回，请联系IT解决");
				 }else{
					  if(msg.length() > 2000){
						  interfaceLogDto.setRetMsg("调用聚信立央行征信采集获取token接口返回信息解析出错:"+msg.substring(0,2000));
					  }else{
						  interfaceLogDto.setRetMsg("调用聚信立央行征信采集获取token接口返回信息解析出错:"+msg);
					  }
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
				 }
			  }
		}finally{
			try {
				interfaceLogDto.setRetBody(results);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

