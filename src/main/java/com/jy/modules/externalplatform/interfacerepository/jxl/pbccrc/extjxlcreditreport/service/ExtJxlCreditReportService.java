package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditreport.service;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jodd.util.StringUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jy.modules.common.util.JsonTool;
import com.jy.modules.externalplatform.interfacerepository.jxl.callthirdbiz.TransferJuxinliBizInteface;
import com.jy.modules.externalplatform.interfacerepository.jxl.common.util.JXLCodeConstant;
import com.jy.modules.externalplatform.interfacerepository.jxl.common.util.JXLConstant;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditcard.dto.ExtJxlCreditCardDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditcard.service.ExtJxlCreditCardService;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.dto.ExtJxlCreditInvestDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.service.ExtJxlCreditInvestService;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditreport.dao.ExtJxlCreditReportDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditreport.dto.ExtJxlCreditReportDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlguarantee.dto.ExtJxlGuaranteeDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlguarantee.service.ExtJxlGuaranteeService;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlloaninfo.dto.ExtJxlLoanInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlloaninfo.service.ExtJxlLoanInfoService;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlqrecord.dto.ExtJxlQrecordDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlqrecord.service.ExtJxlQrecordService;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlsummary.dto.ExtJxlSummaryDTO;
import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlsummary.service.ExtJxlSummaryService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtJxlCreditReportService
 * @description: 定义  聚信立央行征信报告 实现类
 * @author:  dell
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditreport.service.ExtJxlCreditReportService")
public class ExtJxlCreditReportService implements Serializable,ExtSaveMessageDao {

	private static final long serialVersionUID = 1L;

    private static Logger logger = LoggerFactory.getLogger(ExtJxlCreditReportService.class);
    
	@Autowired
	private ExtJxlCreditReportDao dao;
	
	@Autowired
	private ExtJxlCreditInvestService creditInvestService;
	
	@Autowired
	private ExtJxlLoanInfoService loanInfoService;
	
	@Autowired
	private ExtJxlCreditCardService  creditCardService;
	
	@Autowired
	private ExtJxlGuaranteeService guaranteeService;
	
	@Autowired
	private ExtJxlSummaryService summaryService;
	
	@Autowired
	private ExtJxlQrecordService qrecordService; 
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
	
	
	/**
	 *  更新聚信立央行征信报告
	 * @param dto
	 * @param linkConsultIds
	 * @throws Exception
	 */
	public void updateExtJxlCreditReport(ExtJxlCreditReportDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		dao.updateExtJxlCreditReport(paramMap);
	}

	/**
     * @author dell
     * @description: 按条件查询聚信立央行征信报告列表
     * @date 2017-08-24 20:48:30
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlCreditReportDTO> searchExtJxlCreditReport(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlCreditReportDTO> dataList = dao.searchExtJxlCreditReport(searchParams);
        return dataList;
    }

	/**
     * @title: insertExtJxlCreditReport
     * @author dell
     * @description: 新增 聚信立央行征信报告对象
     * @date 2017-08-24 20:48:30
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlCreditReport(ExtJxlCreditReportDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlCreditReport(paramMap);
		
		ExtJxlCreditReportDTO resultDto = (ExtJxlCreditReportDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	
	/**
	* @title: analyzeAndSaveJxlLoanInfo
	* @description: 解析并保存聚信立央行征信报告（贷款信息）
	* @date 2017年8月30日 下午2:46:16
	* @param jsonObject
	* @param fkReportId 聚信立央行征信报告主表ID
	* @throws Exception
	* @throws 
	*/ 
	public void analyzeAndSaveJxlLoanInfo(JSONObject jsonObject ,Long fkReportId) throws Exception{
		List<ExtJxlLoanInfoDTO>   loanInfoList = new ArrayList<ExtJxlLoanInfoDTO>();
		//获取房贷信息
		JSONObject houseLoanJson = jsonObject.getJSONObject("housing_loan_info");
		if(JsonTool.isJSONObjectNotEmpty(houseLoanJson)){
			analyzeJxlLoanInfo(loanInfoList,houseLoanJson,JXLConstant.HOUSING_LOAN_INFO);
		}
		//获取其他贷款信息
		JSONObject otherLoanJson = jsonObject.getJSONObject("loan_info");
		if(JsonTool.isJSONObjectNotEmpty(otherLoanJson)){
			analyzeJxlLoanInfo(loanInfoList,otherLoanJson,JXLConstant.LOAN_INFO);	
		}
		if(CollectionUtils.isNotEmpty(loanInfoList)){
			//批量新增聚信立央行征信报告（贷款信息）
			loanInfoService.insertExtJxlLoanInfoList(loanInfoList, fkReportId);	
		}
	}
	
	
	
	/**
	* @title: analyzeJxlLoanInfo
	* @description: 解析聚信立央行征信报告（贷款信息）
	* @date 2017年8月30日 下午5:21:00
	* @param loanInfoList
	* @param loanJson
	* @param loanType 贷款类型
	* @throws 
	*/ 
	public void analyzeJxlLoanInfo(List<ExtJxlLoanInfoDTO> loanInfoList,JSONObject loanJson,String loanType){
		//贷款未逾期信息
		JSONArray loanNoOverDueJsonArr = loanJson.getJSONArray("loan_no_overdue_account");
		JSONArray loanNoOverDueDetailJsonArr = loanJson.getJSONArray("no_overdue_account_detail");
		if(JsonTool.isJSONArrayNotEmpty(loanNoOverDueJsonArr)){
			String noOverdueStatus = JXLConstant.NO_OVERDUE_STATUS;
			for (int i = 0; i < loanNoOverDueJsonArr.size(); i++) {
				JSONObject loanNoOverDueJson = loanNoOverDueJsonArr.getJSONObject(i);
				ExtJxlLoanInfoDTO loanInfoDTO = (ExtJxlLoanInfoDTO)JSONObject.toBean(JsonTool.camelCaseJSONKey(loanNoOverDueJson), ExtJxlLoanInfoDTO.class);
				String originalContent = loanNoOverDueDetailJsonArr.getString(i);//每条贷款记录的原文本信息
				loanInfoDTO.setLoanType(loanType);
				loanInfoDTO.setOverdueStatus(noOverdueStatus);
			    loanInfoDTO.setOriginalContent(originalContent);
				loanInfoList.add(loanInfoDTO);
			}
		}
		//贷款逾期信息
		JSONArray loanOverDueJsonArr = loanJson.getJSONArray("loan_overdue_account");
		JSONArray loanOverDueDetailJsonArr = loanJson.getJSONArray("overdue_account_detail");
		if(JsonTool.isJSONArrayNotEmpty(loanOverDueJsonArr)){
			String overdueStatus = JXLConstant.OVERDUE_STATUS;
			for (int i = 0; i < loanOverDueJsonArr.size(); i++) {
				JSONObject loanOverDueJson = loanOverDueJsonArr.getJSONObject(i);
				ExtJxlLoanInfoDTO loanInfoDTO = (ExtJxlLoanInfoDTO)JSONObject.toBean(JsonTool.camelCaseJSONKey(loanOverDueJson), ExtJxlLoanInfoDTO.class);
				String originalContent = loanOverDueDetailJsonArr.getString(i);//每条贷款记录的原文本信息
				loanInfoDTO.setLoanType(loanType);
				loanInfoDTO.setOverdueStatus(overdueStatus);
				loanInfoDTO.setOriginalContent(originalContent);
				loanInfoList.add(loanInfoDTO);
			}	
		}
	}
	
	/**
	* @title: analyzeAndSaveJxlCreditCard
	* @description: 解析并保存聚信立央行征信报告（信用卡信息）
	* @date 2017年8月30日 下午2:46:16
	* @param jsonObject
	* @param fkReportId 聚信立央行征信报告主表ID
	* @throws Exception
	* @throws 
	*/ 
	public void analyzeAndSaveJxlCreditCard(JSONObject jsonObject ,Long fkReportId) throws Exception{
		 List<ExtJxlCreditCardDTO>   creditCardList = new ArrayList<ExtJxlCreditCardDTO>();
		 JSONObject creditInfoJson = jsonObject.getJSONObject("credit_info");
		 if(JsonTool.isJSONObjectNotEmpty(creditInfoJson)){
			//未逾期信息
			JSONArray creditNoOverDueJsonArr = creditInfoJson.getJSONArray("credit_no_overdue_account");
			JSONArray creditNoOverDueDetailJsonArr = creditInfoJson.getJSONArray("no_overdue_account_detail");
			if(JsonTool.isJSONArrayNotEmpty(creditNoOverDueJsonArr)){
				String noOverdueStatus = JXLConstant.NO_OVERDUE_STATUS;
				for (int i = 0; i < creditNoOverDueJsonArr.size(); i++) {
					JSONObject creditNoOverDueJson = creditNoOverDueJsonArr.getJSONObject(i);
					ExtJxlCreditCardDTO creditCardDTO = (ExtJxlCreditCardDTO)JSONObject.toBean(JsonTool.camelCaseJSONKey(creditNoOverDueJson), ExtJxlCreditCardDTO.class);
					String originalContent = creditNoOverDueDetailJsonArr.getString(i);//每条贷款记录的原文本信息
					creditCardDTO.setOverDueStatus(noOverdueStatus);
					creditCardDTO.setOriginalContent(originalContent);
					creditCardList.add(creditCardDTO);
				}
			}
			//逾期信息
			JSONArray creditOverDueJsonArr = creditInfoJson.getJSONArray("credit_overdue_account");
			JSONArray creditOverDueDetailJsonArr = creditInfoJson.getJSONArray("overdue_account_detail");
			if(JsonTool.isJSONArrayNotEmpty(creditOverDueJsonArr)){
				String overdueStatus = JXLConstant.OVERDUE_STATUS;
				for (int i = 0; i < creditOverDueJsonArr.size(); i++) {
					JSONObject creditOverDueJson = creditOverDueJsonArr.getJSONObject(i);
					ExtJxlCreditCardDTO creditCardDTO = (ExtJxlCreditCardDTO)JSONObject.toBean(JsonTool.camelCaseJSONKey(creditOverDueJson), ExtJxlCreditCardDTO.class);
					String originalContent = creditOverDueDetailJsonArr.getString(i);//每条贷款记录的原文本信息
					creditCardDTO.setOverDueStatus(overdueStatus);
					creditCardDTO.setOriginalContent(originalContent);
					creditCardList.add(creditCardDTO);
				}
			}
			if(CollectionUtils.isNotEmpty(creditCardList)){
				//批量新增聚信立央行征信报告（信用卡信息）
				creditCardService.insertExtJxlCreditCardList(creditCardList, fkReportId);
			} 
		 }	
	}
	
	/**
	* @title: analyzeAndSaveJxlGuarantee
	* @description:解析并保存聚信立央行征信报告（担保信息）
	* @date 2017年8月30日 下午2:52:52
	* @param transactionsJson
	* @param fkReportId 聚信立央行征信报告主表ID
	* @throws 
	*/ 
	public void analyzeAndSaveJxlGuarantee(JSONObject jsonObject,Long fkReportId) throws Exception{
		List<ExtJxlGuaranteeDTO>   guaranteeList = new ArrayList<ExtJxlGuaranteeDTO>();
		JSONObject guaranteeJson = jsonObject.getJSONObject("guarantee");
		if(JsonTool.isJSONObjectNotEmpty(guaranteeJson)){
			JSONArray guaranteeInfoJsonArr = guaranteeJson.getJSONArray("guarantee_info");
			JSONArray guaranteeDetailJsonArr = guaranteeJson.getJSONArray("guarantee_detail");
			if(JsonTool.isJSONArrayNotEmpty(guaranteeDetailJsonArr)){
				for (int i = 0; i < guaranteeDetailJsonArr.size(); i++) {
					JSONObject guaranteeDetailJson = guaranteeDetailJsonArr.getJSONObject(i);
					ExtJxlGuaranteeDTO guaranteeDTO = (ExtJxlGuaranteeDTO)JSONObject.toBean(JsonTool.camelCaseJSONKey(guaranteeDetailJson), ExtJxlGuaranteeDTO.class);
					String originalContent = guaranteeInfoJsonArr.getString(i);//每条担保记录明细的原文本信息
					guaranteeDTO.setOriginalContent(originalContent);
					guaranteeList.add(guaranteeDTO);
				}
			}
		}
		if(CollectionUtils.isNotEmpty(guaranteeList)){
			//批量新增聚信立央行征信报告（担保信息）
			guaranteeService.insertExtJxlGuaranteeList(guaranteeList, fkReportId);
		}
	}
	
	
	/**
	* @title: analyzeAndSaveJxlSummary
	* @description: 解析并保存聚信立央行征信报告（汇总信息）
	* @date 2017年8月30日 下午2:58:08
	* @param transactionsJson
	* @param fkReportId 聚信立央行征信报告主表ID
	* @throws Exception
	* @throws 
	*/ 
	@SuppressWarnings("unchecked")
	public void analyzeAndSaveJxlSummary(JSONObject jsonObject,Long fkReportId) throws Exception{
		JSONArray summarysJsonArr = jsonObject.getJSONArray("summarys");
		if(JsonTool.isJSONArrayNotEmpty(summarysJsonArr)){
			List<ExtJxlSummaryDTO> summaryList = JSONArray.toList(JsonTool.camelCaseJSONArrayKey(summarysJsonArr),ExtJxlSummaryDTO.class);
		    if(CollectionUtils.isNotEmpty(summaryList)){
		    	//批量新增聚信立央行征信报告（汇总信息）
		    	summaryService.insertExtJxlSummaryList(summaryList, fkReportId);
		    }
		}
	}
	
	
	/**
	* @title: analyzeAndSaveJxlQrecord
	* @description: 解析并保存聚信立央行征信报告（查询记录信息）
	* @date 2017年8月30日 下午3:03:27
	* @param transactionsJson
	* @param fkReportId
	* @throws Exception
	* @throws 
	*/ 
	public void analyzeAndSaveJxlQrecord(JSONObject jsonObject,Long fkReportId) throws Exception{
		List<ExtJxlQrecordDTO>   qrecordList = new ArrayList<ExtJxlQrecordDTO>();
		//获取个人查询记录明细
		JSONArray personalQueryJsonArr = jsonObject.getJSONArray("personal_query_details");
		if(JsonTool.isJSONArrayNotEmpty(personalQueryJsonArr)){
			  String queryType = JXLConstant.PERSONAL_QUERY_RECORD;
			  for (int i = 0; i < personalQueryJsonArr.size(); i++) {
				  JSONObject  personalQueryJson = personalQueryJsonArr.getJSONObject(i);
				  ExtJxlQrecordDTO qrecordDTO  = (ExtJxlQrecordDTO)JSONObject.toBean(JsonTool.camelCaseJSONKey(personalQueryJson), ExtJxlQrecordDTO.class);
				  qrecordDTO.setQueryType(queryType);
				  qrecordList.add(qrecordDTO);
			  }	
		}
		//获取机构查询记录明细
		JSONArray institutionQueryJsonArr = jsonObject.getJSONArray("institution_query_details");
		if(JsonTool.isJSONArrayNotEmpty(institutionQueryJsonArr)){
			  String queryType = JXLConstant.INSTITUTION_QUERY_RECORD;
			  for (int i = 0; i < institutionQueryJsonArr.size(); i++) {
				  JSONObject  institutionQueryJson = institutionQueryJsonArr.getJSONObject(i);
				  ExtJxlQrecordDTO qrecordDTO  = (ExtJxlQrecordDTO)JSONObject.toBean(JsonTool.camelCaseJSONKey(institutionQueryJson), ExtJxlQrecordDTO.class);
				  qrecordDTO.setQueryType(queryType);
				  qrecordList.add(qrecordDTO);
			  }	
		}
		if(CollectionUtils.isNotEmpty(qrecordList)){
			//批量新增聚信立央行征信报告（查询记录信息）
			qrecordService.insertExtJxlQrecordList(qrecordList, fkReportId);
		}
	}

	/**
	* @throws Exception 
	* @title: inquireCreditRecordInfo
	* @author:陈东栋
	* @description: 查询信贷记录
	* @date 2017年9月19日 下午1:55:22
	* @param fkReportId
	* @param model
	* @throws 
	*/ 
	public void inquireCreditRecordInfo(Long fkReportId, ModelAndView model) throws Exception {
		 Map<String,Object> searchParams = new HashMap<String,Object>();
		 //查询信用卡信息
		 ExtJxlCreditCardDTO  creditCardDTO = new  ExtJxlCreditCardDTO();
		 creditCardDTO.setFkReportId(fkReportId);
		 searchParams.put("dto", creditCardDTO);
		 List<ExtJxlCreditCardDTO> creditCardList = creditCardService.searchExtJxlCreditCard(searchParams);
		 //从未逾期过的贷记卡及透支未超过60天的准贷记卡账户信息
		 List<ExtJxlCreditCardDTO> creditNoOverDueList = new ArrayList<ExtJxlCreditCardDTO>();
		 //发生过逾期的贷记卡账户信息
		 List<ExtJxlCreditCardDTO> creditOverDueList = new ArrayList<ExtJxlCreditCardDTO>();
		 if(CollectionUtils.isNotEmpty(creditCardList)){
			 for (ExtJxlCreditCardDTO extJxlCreditCardDTO : creditCardList) {
			   String overDueStatus = extJxlCreditCardDTO.getOverDueStatus();
			   if(JXLConstant.OVERDUE_STATUS.equals(overDueStatus)){
				   creditOverDueList.add(extJxlCreditCardDTO);
			   }else if(JXLConstant.NO_OVERDUE_STATUS.equals(overDueStatus)){
				   creditNoOverDueList.add(extJxlCreditCardDTO);
			   }
			 }
		 }
		 searchParams.clear();
		 model.addObject("creditNoOverDueList", creditNoOverDueList);
		 model.addObject("creditOverDueList", creditOverDueList);
		 //查询房屋贷款信息
		 ExtJxlLoanInfoDTO  loanInfoDTO = new ExtJxlLoanInfoDTO();
		 loanInfoDTO.setFkReportId(fkReportId);
		 loanInfoDTO.setLoanType(JXLConstant.HOUSING_LOAN_INFO);
		 searchParams.put("dto", loanInfoDTO);
		 List<ExtJxlLoanInfoDTO> houseLoanList = loanInfoService.searchExtJxlLoanInfo(searchParams);
		 //从未逾期过的账户明细(房贷)
		 List<ExtJxlLoanInfoDTO> houseLoanNoOverDueList = new ArrayList<ExtJxlLoanInfoDTO>();
		 //发生过逾期的账户明细(房贷)
		 List<ExtJxlLoanInfoDTO> houseLoanOverDueList = new ArrayList<ExtJxlLoanInfoDTO>();
		 if(CollectionUtils.isNotEmpty(houseLoanList)){
			for (ExtJxlLoanInfoDTO extJxlLoanInfoDTO : houseLoanList) {
			  String overdueStatus = extJxlLoanInfoDTO.getOverdueStatus();
			  if(JXLConstant.OVERDUE_STATUS.equals(overdueStatus)){
				  houseLoanOverDueList.add(extJxlLoanInfoDTO);
			  }else if(JXLConstant.NO_OVERDUE_STATUS.equals(overdueStatus)){
				  houseLoanNoOverDueList.add(extJxlLoanInfoDTO);
			  }
			}
		 }
		 model.addObject("houseLoanNoOverDueList", houseLoanNoOverDueList);
		 model.addObject("houseLoanOverDueList", houseLoanOverDueList);
		 searchParams.clear();
		 //查询其他贷款信息
		 loanInfoDTO.setLoanType(JXLConstant.LOAN_INFO);
		 searchParams.put("dto", loanInfoDTO);
		 List<ExtJxlLoanInfoDTO> otherLoanList = loanInfoService.searchExtJxlLoanInfo(searchParams);
		 //从未逾期过的账户明细(其他贷款)
		 List<ExtJxlLoanInfoDTO> otherLoanNoOverDueList = new ArrayList<ExtJxlLoanInfoDTO>();
		 //发生过逾期的账户明细(其他贷款)
		 List<ExtJxlLoanInfoDTO> otherLoanOverDueList = new ArrayList<ExtJxlLoanInfoDTO>();
		 if(CollectionUtils.isNotEmpty(otherLoanList)){
		    for (ExtJxlLoanInfoDTO extJxlLoanInfoDTO : otherLoanList) {
			   String overdueStatus = extJxlLoanInfoDTO.getOverdueStatus();
			   if(JXLConstant.OVERDUE_STATUS.equals(overdueStatus)){
				  otherLoanOverDueList.add(extJxlLoanInfoDTO);
			   }else if(JXLConstant.NO_OVERDUE_STATUS.equals(overdueStatus)){
				  otherLoanNoOverDueList.add(extJxlLoanInfoDTO);
			   }
		    }
		 }
		 model.addObject("otherLoanNoOverDueList", otherLoanNoOverDueList);
		 model.addObject("otherLoanOverDueList", otherLoanOverDueList);
		 searchParams.clear();
		 //查询担保信息表
		 ExtJxlGuaranteeDTO  guaranteeDTO = new ExtJxlGuaranteeDTO();
		 guaranteeDTO.setFkReportId(fkReportId);
		 searchParams.put("dto", guaranteeDTO);
		 List<ExtJxlGuaranteeDTO> guaranteeList = guaranteeService.searchExtJxlGuarantee(searchParams);
		 if(CollectionUtils.isNotEmpty(guaranteeList)){
			 model.addObject("guaranteeList", guaranteeList); 
		 }
		 //查询贷款汇总信息
		 ExtJxlSummaryDTO  summaryDTO = new  ExtJxlSummaryDTO();
		 summaryDTO.setFkReportId(fkReportId);
		 searchParams.put("dto", summaryDTO);
		 List<ExtJxlSummaryDTO> summaryList = summaryService.searchExtJxlSummary(searchParams);
		 if(CollectionUtils.isNotEmpty(summaryList)){
			 model.addObject("summaryList", summaryList); 
		 }
		 searchParams.clear();
	}
	
	
	/**
	* @throws Exception 
	* @title: inquireQrecordInfo
	* @author:陈东栋
	* @description: 查询查询记录信息
	* @date 2017年9月19日 下午2:01:02
	* @param fkReportId
	* @param model
	* @throws 
	*/ 
	public void inquireQrecordInfo(Long fkReportId, ModelAndView model) throws Exception {
		 Map<String,Object> searchParams = new HashMap<String,Object>();
		 ExtJxlQrecordDTO  qrecordDTO = new ExtJxlQrecordDTO();
		 qrecordDTO.setFkReportId(fkReportId);
		 searchParams.put("dto", qrecordDTO);
		 List<ExtJxlQrecordDTO> qrecordList = qrecordService.searchExtJxlQrecord(searchParams);
		 List<ExtJxlQrecordDTO> personalQrecordList = new ArrayList<ExtJxlQrecordDTO>();
		 List<ExtJxlQrecordDTO> institutionQrecordList = new ArrayList<ExtJxlQrecordDTO>();
		 if(CollectionUtils.isNotEmpty(qrecordList)){
		   for (ExtJxlQrecordDTO extJxlQrecordDTO : qrecordList) {
			   String queryType = extJxlQrecordDTO.getQueryType();
			   if(JXLConstant.PERSONAL_QUERY_RECORD.equals(queryType)){
				   personalQrecordList.add(extJxlQrecordDTO);
			   }else if(JXLConstant.INSTITUTION_QUERY_RECORD.equals(queryType)){
				   institutionQrecordList.add(extJxlQrecordDTO);
			   }
		   } 
		}
		model.addObject("personalQrecordList", personalQrecordList);
		model.addObject("institutionQrecordList",institutionQrecordList);
   }
	
	
	/**
	 * @throws Exception 
	* @title: accessOrSaveJxlCreditReport
	* @author:陈东栋
	* @description: 根据采集TOKEN获取并保存央行征信原始数据接口
    * @param url 
    * @param extJxlCreditInvestDTO
	* @date 2017年8月29日 下午8:12:24
	* @throws 
	*/ 
	public void accessOrSaveJxlCreditReport(String url, ExtJxlCreditInvestDTO extJxlCreditInvestDTO) throws Exception {
		Long fkConsultId = extJxlCreditInvestDTO.getFkConsultId();//咨询编号
		Long fkInvestId = extJxlCreditInvestDTO.getId();//采集申请表主键ID
		//组装请求报文
		JSONObject reqJson = new JSONObject();
		reqJson.put("token", extJxlCreditInvestDTO.getToken());
		String reqMsg = reqJson.toString();
		//返回报文
		String respMsg = "";
		//接口是否调用成功
		boolean success = false;
		//消息提示
		String note = "";
		//保存聚信立央行征信报告
		ExtJxlCreditReportDTO  creditReportDTO = new ExtJxlCreditReportDTO();
		//调用接口，获取返回报文
		try {
			respMsg = TransferJuxinliBizInteface.executeHttpPostEsb(url,reqMsg,String.valueOf(fkInvestId), String.valueOf(fkConsultId),JXLCodeConstant.JXL_CREDIT_TYPE ,JXLCodeConstant.JXL_CREDIT_ACCESS_BUSINESS_CODE);
			if(StringUtils.isNotEmpty(respMsg)){
				JSONObject respJson = JSONObject.fromObject(respMsg);
				if(JsonTool.isJSONObjectNotEmpty(respJson)){
					success = respJson.getBoolean(JXLConstant.SUCCESS);//接口调用是否成功
					if(success){
						JSONObject rawDataJson = respJson.getJSONObject(JXLConstant.RAW_DATA);
						if(JsonTool.isJSONObjectNotEmpty(rawDataJson)){
							JSONObject membersJson = rawDataJson.getJSONObject(JXLConstant.MEMBERS);
							if(JsonTool.isJSONObjectNotEmpty(membersJson)){
								String status = membersJson.getString(JXLConstant.STATUS);// 接口调用状态
								String errorCode = membersJson.getString(JXLConstant.ERROR_CODE);//调用状态码
								String errorMsg = membersJson.getString(JXLConstant.ERROR_MSG);//调用状态说明
								if(JXLConstant.SUCCESS.equals(status) && JXLConstant.QUERY_SUCESS_CODE.equals(errorCode)){
								    //修改[聚信立央行征信采集申请表]调用状态为已完成	
									creditInvestService.updateExtJxlCreditInvestState(extJxlCreditInvestDTO, JXLConstant.INVOKE_SUCCESS_STATE);
								}
								JSONArray transactionsJsonArr = membersJson.getJSONArray(JXLConstant.TRANSACTIONS);
								if(JsonTool.isJSONArrayNotEmpty(transactionsJsonArr)){
									JSONObject transactionsJson = (JSONObject)transactionsJsonArr.get(0);
									creditReportDTO = (ExtJxlCreditReportDTO) JSONObject.toBean(JsonTool.camelCaseJSONKey(transactionsJson), ExtJxlCreditReportDTO.class);
									creditReportDTO.setSuccess(String.valueOf(success));
									creditReportDTO.setErrorCode(errorCode);
									creditReportDTO.setErrorMsg(errorMsg);	
									creditReportDTO.setFkInvestId(fkInvestId);
									creditReportDTO.setRespMsg(respMsg);
									Long fkReportId = insertExtJxlCreditReport(creditReportDTO);//保存聚信立央行征信报告
									if (fkReportId != null) {
										//获取信贷记录
										JSONObject creditRecordJson = transactionsJson.getJSONObject("credit_record");
										if(JsonTool.isJSONObjectNotEmpty(creditRecordJson)){
											//解析并保存聚信立央行征信报告（贷款信息）
											analyzeAndSaveJxlLoanInfo(creditRecordJson ,fkReportId);
											//解析并保存聚信立央行征信报告（信用卡信息）
											analyzeAndSaveJxlCreditCard(creditRecordJson ,fkReportId);
											//解析并保存聚信立央行征信报告（担保信息）
											analyzeAndSaveJxlGuarantee(creditRecordJson ,fkReportId);
											//解析并保存聚信立央行征信报告（汇总信息）
											analyzeAndSaveJxlSummary(creditRecordJson ,fkReportId);
										}
										//获取查询记录
										JSONObject queryRecordJson = transactionsJson.getJSONObject("query");
										if(JsonTool.isJSONObjectNotEmpty(queryRecordJson)){
											//解析并保存聚信立央行征信报告（查询记录信息）
											analyzeAndSaveJxlQrecord(queryRecordJson ,fkReportId);
										}
									}
								}
							}	
						}
					}else{
						creditReportDTO.setSuccess(String.valueOf(success));
						creditReportDTO.setNote(note);
						creditReportDTO.setFkInvestId(fkInvestId);
						creditReportDTO.setRespMsg(respMsg);
						insertExtJxlCreditReport(creditReportDTO);//保存聚信立央行征信报告
					}
				}
			}else{
				note = "返回报文为空";
				creditReportDTO.setSuccess(String.valueOf(success));
				creditReportDTO.setNote(note);
				creditReportDTO.setFkInvestId(fkInvestId);
				insertExtJxlCreditReport(creditReportDTO);//保存聚信立央行征信报告
			}
		}catch (Exception e) {
			success = false;
			note = "请求接口异常";
			creditReportDTO.setSuccess(String.valueOf(success));
			creditReportDTO.setNote(note);
			creditReportDTO.setFkInvestId(fkInvestId);
			//修改[聚信立央行征信采集申请表]调用状态为调用失败	
			creditInvestService.updateExtJxlCreditInvestState(extJxlCreditInvestDTO, JXLConstant.INVOKE_FAILED_STATE);
			try {
				insertExtJxlCreditReport(creditReportDTO);//保存聚信立央行征信报告
			} catch (Exception ex) {
				logger.error("保存聚信立[央行征信原始数据]信息异常,咨询编号:"+fkConsultId,ex);
			}
			logger.error("调用聚信立[采集TOKEN获取央行征信原始数据]接口异常,咨询编号:"+fkConsultId,e);
		}
	}
	

	@Override
	public void saveMessage(Map<String, Object> map) {
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results=String.valueOf(map.get("result"));
    	JSONObject jsonObj = null;
    	//流程码
		//保存聚信立央行征信报告
		ExtJxlCreditReportDTO  creditReportDTO = new ExtJxlCreditReportDTO();
		creditReportDTO.setSysCode(String.valueOf(map.get("sysCode")));
		creditReportDTO.setFkInvestId((Long)(map.get("fkInvestId")));
		try {
			if(StringUtils.isNotEmpty(results) && !"null".equals(results)){
				jsonObj = JSONObject.fromObject(results);
				//调用失败
				if(null!=jsonObj.get("retCode") && jsonObj.get("retCode").equals("500")){
					
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_6.getKey());
					interfaceLogDto.setRetMsg(String.valueOf(jsonObj.get("errorDesc")));
					
					creditReportDTO.setErrorCode(InterfaceEnum.RET_CODE_6.getKey());
					creditReportDTO.setErrorMsg(String.valueOf(jsonObj.get("errorDesc")));
					creditReportDTO.setSuccess(InterfaceEnum.FALSE.getKey());
					creditReportDTO.setNote(String.valueOf(jsonObj.get("errorDesc")));
					creditReportDTO.setRespMsg(String.valueOf(jsonObj.get("errorDesc")));
					insertExtJxlCreditReport(creditReportDTO);//保存聚信立央行征信报告
					
					return;
				}
				if(JsonTool.isJSONObjectNotEmpty(jsonObj)){
					boolean success = jsonObj.getBoolean(JXLConstant.SUCCESS);//接口调用是否成功
					if(success){
						JSONObject rawDataJson = jsonObj.getJSONObject(JXLConstant.RAW_DATA);
						if(JsonTool.isJSONObjectNotEmpty(rawDataJson)){
							JSONObject membersJson = rawDataJson.getJSONObject(JXLConstant.MEMBERS);
							if(JsonTool.isJSONObjectNotEmpty(membersJson)){
								String status = membersJson.getString(JXLConstant.STATUS);// 接口调用状态
								String errorCode = membersJson.getString(JXLConstant.ERROR_CODE);//调用状态码
								if(JXLConstant.SUCCESS.equals(status) && JXLConstant.QUERY_SUCESS_CODE.equals(errorCode)){
								    //修改[聚信立央行征信采集申请表]调用状态为已完成	
								
									JSONArray transactionsJsonArr = membersJson.getJSONArray(JXLConstant.TRANSACTIONS);
									if(JsonTool.isJSONArrayNotEmpty(transactionsJsonArr)){
										JSONObject transactionsJson = (JSONObject)transactionsJsonArr.get(0);
										creditReportDTO = (ExtJxlCreditReportDTO) JSONObject.toBean(JsonTool.camelCaseJSONKey(transactionsJson), ExtJxlCreditReportDTO.class);
										creditReportDTO.setSuccess(String.valueOf(success));
										Long fkReportId = insertExtJxlCreditReport(creditReportDTO);//保存聚信立央行征信报告
										
										if (fkReportId != null) {
											//获取信贷记录
											JSONObject creditRecordJson = transactionsJson.getJSONObject("credit_record");
											if(JsonTool.isJSONObjectNotEmpty(creditRecordJson)){
												//解析并保存聚信立央行征信报告（贷款信息）
												analyzeAndSaveJxlLoanInfo(creditRecordJson ,fkReportId);
												//解析并保存聚信立央行征信报告（信用卡信息）
												analyzeAndSaveJxlCreditCard(creditRecordJson ,fkReportId);
												//解析并保存聚信立央行征信报告（担保信息）
												analyzeAndSaveJxlGuarantee(creditRecordJson ,fkReportId);
												//解析并保存聚信立央行征信报告（汇总信息）
												analyzeAndSaveJxlSummary(creditRecordJson ,fkReportId);
											}
											//获取查询记录
											JSONObject queryRecordJson = transactionsJson.getJSONObject("query");
											if(JsonTool.isJSONObjectNotEmpty(queryRecordJson)){
												//解析并保存聚信立央行征信报告（查询记录信息）
												analyzeAndSaveJxlQrecord(queryRecordJson ,fkReportId);
											}
										}
										
										creditReportDTO.setErrorCode(InterfaceEnum.RET_CODE_1.getKey());
										creditReportDTO.setErrorMsg("调用聚信立央行征信接口查有！");	
										creditReportDTO.setNote("调用聚信立央行征信接口查有！");
										insertExtJxlCreditReport(creditReportDTO);//保存聚信立央行征信报告
										
										interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
							            interfaceLogDto.setRetMsg("调用聚信立央行征信接口查有！");
									}
								}else{
									creditReportDTO.setErrorCode(InterfaceEnum.RET_CODE_2.getKey());
									creditReportDTO.setErrorMsg("调用聚信立央行征信接口查无！");	
									creditReportDTO.setNote("调用聚信立央行征信接口查无！");
									insertExtJxlCreditReport(creditReportDTO);//保存聚信立央行征信报告
				                	
							        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
								    interfaceLogDto.setRetMsg("调用聚信立央行征信接口查无！");
								}
							}	
						}
	                }else{
	                	creditReportDTO.setErrorCode(InterfaceEnum.RET_CODE_3.getKey());
						creditReportDTO.setErrorMsg("调用聚信立央行征信接口报错！");	
						creditReportDTO.setNote("调用聚信立央行征信接口报错！");
						insertExtJxlCreditReport(creditReportDTO);//保存聚信立央行征信报告
	                	
				        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					    interfaceLogDto.setRetMsg("调用聚信立央行征信接口报错！");
	                }
				}else{
					creditReportDTO.setErrorCode(InterfaceEnum.RET_CODE_3.getKey());
					creditReportDTO.setErrorMsg("调用聚信立央行征信接口报错！");	
					creditReportDTO.setNote("调用聚信立央行征信接口报错！");
					insertExtJxlCreditReport(creditReportDTO);//保存聚信立央行征信报告
                	
			        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				    interfaceLogDto.setRetMsg("调用聚信立央行征信接口报错！");
				}
			}else{
				creditReportDTO.setErrorCode(InterfaceEnum.RET_CODE_3.getKey());
				creditReportDTO.setErrorMsg("调用聚信立央行征信接口报错！");	
				creditReportDTO.setNote("调用聚信立央行征信接口报错！");
				insertExtJxlCreditReport(creditReportDTO);//保存聚信立央行征信报告
            	
		        interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
			    interfaceLogDto.setRetMsg("调用聚信立央行征信接口报错！");
			}
		} catch (Exception ex) {
			  JYLoggerUtil.error(this.getClass(), "===调用聚信立央行征信采集解析回参异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
			  String msg = ex.getMessage();
			  if(StringUtil.isNotEmpty(msg)){
				  creditReportDTO.setSuccess(InterfaceEnum.FALSE.getKey());
				  if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
					  creditReportDTO.setErrorCode(InterfaceEnum.RET_CODE_3.getKey());
					  creditReportDTO.setErrorMsg("调用聚信立央行征信接口异常请求返回，请联系IT解决");	
		              
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					  interfaceLogDto.setRetMsg("调用聚信立央行征信接口异常请求返回，请联系IT解决");
				 }else{
					  if(msg.length() > 2000){
						  creditReportDTO.setErrorMsg("调用聚信立央行征信采集接口返回信息解析出错:"+msg.substring(0,2000));
						  interfaceLogDto.setRetMsg("调用聚信立央行征信采集接口返回信息解析出错:"+msg.substring(0,2000));
					  }else{
						  creditReportDTO.setErrorMsg("调用聚信立央行征信采集接口返回信息解析出错:"+msg);
						  interfaceLogDto.setRetMsg("调用聚信立央行征信采集接口返回信息解析出错:"+msg);
					  }
					  creditReportDTO.setErrorCode(InterfaceEnum.RET_CODE_4.getKey());
					  try {
						insertExtJxlCreditReport(creditReportDTO);
					} catch (Exception e) {
						e.printStackTrace();
					}//保存聚信立央行征信报告
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
				 }
			  }
		}finally{
			try {
				interfaceLogDto.setRetBody(results);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				
				creditReportDTO.setInterfaceId(String.valueOf(keyId));
				updateExtJxlCreditReport(creditReportDTO);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

