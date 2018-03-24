package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmcreditanalysis.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:数美文本信用分析服务
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-19 16:27:15
 */
public class ExtWlSmCreditAnalysisDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**网贷注册使用平台数*/
	private Long itfinRegisters;

	/**网贷申请贷款平台数*/
	private Long itfinLoanApplications;

	/**网贷申请贷款被拒绝平台数*/
	private Long itfinLoanRefuses;

	/**网贷逾期平台数*/
	private Long itfinLoanOverdues;

	/**网贷申请贷款申请通过平台数*/
	private Long itfinLoanApprovals;

	/**网贷申请贷款申请通过金额级别*/
	private Long itfinLoanApprovalLevel;

	/**网贷逾期时长级别*/
	private String itfinLoanOverdueDuration;

	/**网贷逾期金额级别*/
	private Long itfinLoanOverdueLevel;

	/**借记卡工资收入金额级别*/
	private Long debitSalaryLevel;

	/**信用卡注册机构数*/
	private Long creditRegisters;

	/**信用卡申请机构数*/
	private Long creditLoanApplications;

	/**信用卡申请通过机构数*/
	private Long creditLoanApprovals;

	/**信用卡申请被拒绝机构数*/
	private Long creditLoanRefuses;

	/**信用卡逾期机构数*/
	private Long creditLoanOverdues;

	/**信用卡申请通过级别*/
	private Long creditLoanApprovalLevel;

	/**信用卡逾期金额级别*/
	private Long creditLoanOverdueLevel;

	/**信用卡逾期时长级别*/
	private String creditLoanOverdueDuration;

	/**请求ID*/
	private String requestId;

	/**数据有效性（1：有效、0：无效）*/
	private String validateState;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp updateTime;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long updateBy;

	/**进件客户关联ID*/
	private Long intoCustRefId;

	/**返回码*/
	private Long code;

	/**详细信息*/
	private String message;

	/**
	 *方法: 获得id
	 *@return: java.lang.Long  id
	 */
	public Long getId(){
		return this.id;
	}

	/**
	 *方法: 设置id
	 *@param: java.lang.Long  id
	 */
	public void setId(Long id){
		this.id = id;
	}

	/**
	 *方法: 获得itfinRegisters
	 *@return: java.lang.Long  itfinRegisters
	 */
	public Long getItfinRegisters(){
		return this.itfinRegisters;
	}

	/**
	 *方法: 设置itfinRegisters
	 *@param: java.lang.Long  itfinRegisters
	 */
	public void setItfinRegisters(Long itfinRegisters){
		this.itfinRegisters = itfinRegisters;
	}

	/**
	 *方法: 获得itfinLoanApplications
	 *@return: java.lang.Long  itfinLoanApplications
	 */
	public Long getItfinLoanApplications(){
		return this.itfinLoanApplications;
	}

	/**
	 *方法: 设置itfinLoanApplications
	 *@param: java.lang.Long  itfinLoanApplications
	 */
	public void setItfinLoanApplications(Long itfinLoanApplications){
		this.itfinLoanApplications = itfinLoanApplications;
	}

	/**
	 *方法: 获得itfinLoanRefuses
	 *@return: java.lang.Long  itfinLoanRefuses
	 */
	public Long getItfinLoanRefuses(){
		return this.itfinLoanRefuses;
	}

	/**
	 *方法: 设置itfinLoanRefuses
	 *@param: java.lang.Long  itfinLoanRefuses
	 */
	public void setItfinLoanRefuses(Long itfinLoanRefuses){
		this.itfinLoanRefuses = itfinLoanRefuses;
	}

	/**
	 *方法: 获得itfinLoanOverdues
	 *@return: java.lang.Long  itfinLoanOverdues
	 */
	public Long getItfinLoanOverdues(){
		return this.itfinLoanOverdues;
	}

	/**
	 *方法: 设置itfinLoanOverdues
	 *@param: java.lang.Long  itfinLoanOverdues
	 */
	public void setItfinLoanOverdues(Long itfinLoanOverdues){
		this.itfinLoanOverdues = itfinLoanOverdues;
	}

	/**
	 *方法: 获得itfinLoanApprovals
	 *@return: java.lang.Long  itfinLoanApprovals
	 */
	public Long getItfinLoanApprovals(){
		return this.itfinLoanApprovals;
	}

	/**
	 *方法: 设置itfinLoanApprovals
	 *@param: java.lang.Long  itfinLoanApprovals
	 */
	public void setItfinLoanApprovals(Long itfinLoanApprovals){
		this.itfinLoanApprovals = itfinLoanApprovals;
	}

	/**
	 *方法: 获得itfinLoanApprovalLevel
	 *@return: java.lang.Long  itfinLoanApprovalLevel
	 */
	public Long getItfinLoanApprovalLevel(){
		return this.itfinLoanApprovalLevel;
	}

	/**
	 *方法: 设置itfinLoanApprovalLevel
	 *@param: java.lang.Long  itfinLoanApprovalLevel
	 */
	public void setItfinLoanApprovalLevel(Long itfinLoanApprovalLevel){
		this.itfinLoanApprovalLevel = itfinLoanApprovalLevel;
	}

	/**
	 *方法: 获得itfinLoanOverdueDuration
	 *@return: java.lang.String  itfinLoanOverdueDuration
	 */
	public String getItfinLoanOverdueDuration(){
		return this.itfinLoanOverdueDuration;
	}

	/**
	 *方法: 设置itfinLoanOverdueDuration
	 *@param: java.lang.String  itfinLoanOverdueDuration
	 */
	public void setItfinLoanOverdueDuration(String itfinLoanOverdueDuration){
		this.itfinLoanOverdueDuration = itfinLoanOverdueDuration;
	}

	/**
	 *方法: 获得itfinLoanOverdueLevel
	 *@return: java.lang.Long  itfinLoanOverdueLevel
	 */
	public Long getItfinLoanOverdueLevel(){
		return this.itfinLoanOverdueLevel;
	}

	/**
	 *方法: 设置itfinLoanOverdueLevel
	 *@param: java.lang.Long  itfinLoanOverdueLevel
	 */
	public void setItfinLoanOverdueLevel(Long itfinLoanOverdueLevel){
		this.itfinLoanOverdueLevel = itfinLoanOverdueLevel;
	}

	/**
	 *方法: 获得debitSalaryLevel
	 *@return: java.lang.Long  debitSalaryLevel
	 */
	public Long getDebitSalaryLevel(){
		return this.debitSalaryLevel;
	}

	/**
	 *方法: 设置debitSalaryLevel
	 *@param: java.lang.Long  debitSalaryLevel
	 */
	public void setDebitSalaryLevel(Long debitSalaryLevel){
		this.debitSalaryLevel = debitSalaryLevel;
	}

	/**
	 *方法: 获得creditRegisters
	 *@return: java.lang.Long  creditRegisters
	 */
	public Long getCreditRegisters(){
		return this.creditRegisters;
	}

	/**
	 *方法: 设置creditRegisters
	 *@param: java.lang.Long  creditRegisters
	 */
	public void setCreditRegisters(Long creditRegisters){
		this.creditRegisters = creditRegisters;
	}

	/**
	 *方法: 获得creditLoanApplications
	 *@return: java.lang.Long  creditLoanApplications
	 */
	public Long getCreditLoanApplications(){
		return this.creditLoanApplications;
	}

	/**
	 *方法: 设置creditLoanApplications
	 *@param: java.lang.Long  creditLoanApplications
	 */
	public void setCreditLoanApplications(Long creditLoanApplications){
		this.creditLoanApplications = creditLoanApplications;
	}

	/**
	 *方法: 获得creditLoanApprovals
	 *@return: java.lang.Long  creditLoanApprovals
	 */
	public Long getCreditLoanApprovals(){
		return this.creditLoanApprovals;
	}

	/**
	 *方法: 设置creditLoanApprovals
	 *@param: java.lang.Long  creditLoanApprovals
	 */
	public void setCreditLoanApprovals(Long creditLoanApprovals){
		this.creditLoanApprovals = creditLoanApprovals;
	}

	/**
	 *方法: 获得creditLoanRefuses
	 *@return: java.lang.Long  creditLoanRefuses
	 */
	public Long getCreditLoanRefuses(){
		return this.creditLoanRefuses;
	}

	/**
	 *方法: 设置creditLoanRefuses
	 *@param: java.lang.Long  creditLoanRefuses
	 */
	public void setCreditLoanRefuses(Long creditLoanRefuses){
		this.creditLoanRefuses = creditLoanRefuses;
	}

	/**
	 *方法: 获得creditLoanOverdues
	 *@return: java.lang.Long  creditLoanOverdues
	 */
	public Long getCreditLoanOverdues(){
		return this.creditLoanOverdues;
	}

	/**
	 *方法: 设置creditLoanOverdues
	 *@param: java.lang.Long  creditLoanOverdues
	 */
	public void setCreditLoanOverdues(Long creditLoanOverdues){
		this.creditLoanOverdues = creditLoanOverdues;
	}

	/**
	 *方法: 获得creditLoanApprovalLevel
	 *@return: java.lang.Long  creditLoanApprovalLevel
	 */
	public Long getCreditLoanApprovalLevel(){
		return this.creditLoanApprovalLevel;
	}

	/**
	 *方法: 设置creditLoanApprovalLevel
	 *@param: java.lang.Long  creditLoanApprovalLevel
	 */
	public void setCreditLoanApprovalLevel(Long creditLoanApprovalLevel){
		this.creditLoanApprovalLevel = creditLoanApprovalLevel;
	}

	/**
	 *方法: 获得creditLoanOverdueLevel
	 *@return: java.lang.Long  creditLoanOverdueLevel
	 */
	public Long getCreditLoanOverdueLevel(){
		return this.creditLoanOverdueLevel;
	}

	/**
	 *方法: 设置creditLoanOverdueLevel
	 *@param: java.lang.Long  creditLoanOverdueLevel
	 */
	public void setCreditLoanOverdueLevel(Long creditLoanOverdueLevel){
		this.creditLoanOverdueLevel = creditLoanOverdueLevel;
	}

	/**
	 *方法: 获得creditLoanOverdueDuration
	 *@return: java.lang.String  creditLoanOverdueDuration
	 */
	public String getCreditLoanOverdueDuration(){
		return this.creditLoanOverdueDuration;
	}

	/**
	 *方法: 设置creditLoanOverdueDuration
	 *@param: java.lang.String  creditLoanOverdueDuration
	 */
	public void setCreditLoanOverdueDuration(String creditLoanOverdueDuration){
		this.creditLoanOverdueDuration = creditLoanOverdueDuration;
	}

	/**
	 *方法: 获得requestId
	 *@return: java.lang.String  requestId
	 */
	public String getRequestId(){
		return this.requestId;
	}

	/**
	 *方法: 设置requestId
	 *@param: java.lang.String  requestId
	 */
	public void setRequestId(String requestId){
		this.requestId = requestId;
	}

	/**
	 *方法: 获得validateState
	 *@return: java.lang.String  validateState
	 */
	public String getValidateState(){
		return this.validateState;
	}

	/**
	 *方法: 设置validateState
	 *@param: java.lang.String  validateState
	 */
	public void setValidateState(String validateState){
		this.validateState = validateState;
	}

	/**
	 *方法: 获得createTime
	 *@return: java.sql.Timestamp  createTime
	 */
	public java.sql.Timestamp getCreateTime(){
		return this.createTime;
	}

	/**
	 *方法: 设置createTime
	 *@param: java.sql.Timestamp  createTime
	 */
	public void setCreateTime(java.sql.Timestamp createTime){
		this.createTime = createTime;
	}

	/**
	 *方法: 获得updateTime
	 *@return: java.sql.Timestamp  updateTime
	 */
	public java.sql.Timestamp getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置updateTime
	 *@param: java.sql.Timestamp  updateTime
	 */
	public void setUpdateTime(java.sql.Timestamp updateTime){
		this.updateTime = updateTime;
	}

	/**
	 *方法: 获得createBy
	 *@return: java.lang.Long  createBy
	 */
	public Long getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置createBy
	 *@param: java.lang.Long  createBy
	 */
	public void setCreateBy(Long createBy){
		this.createBy = createBy;
	}

	/**
	 *方法: 获得updateBy
	 *@return: java.lang.Long  updateBy
	 */
	public Long getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置updateBy
	 *@param: java.lang.Long  updateBy
	 */
	public void setUpdateBy(Long updateBy){
		this.updateBy = updateBy;
	}

	/**
	 *方法: 获得intoCustRefId
	 *@return: java.lang.Long  intoCustRefId
	 */
	public Long getIntoCustRefId(){
		return this.intoCustRefId;
	}

	/**
	 *方法: 设置intoCustRefId
	 *@param: java.lang.Long  intoCustRefId
	 */
	public void setIntoCustRefId(Long intoCustRefId){
		this.intoCustRefId = intoCustRefId;
	}

	/**
	 *方法: 获得code
	 *@return: java.lang.Long  code
	 */
	public Long getCode(){
		return this.code;
	}

	/**
	 *方法: 设置code
	 *@param: java.lang.Long  code
	 */
	public void setCode(Long code){
		this.code = code;
	}

	/**
	 *方法: 获得message
	 *@return: java.lang.String  message
	 */
	public String getMessage(){
		return this.message;
	}

	/**
	 *方法: 设置message
	 *@param: java.lang.String  message
	 */
	public void setMessage(String message){
		this.message = message;
	}

}