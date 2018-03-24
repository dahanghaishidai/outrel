package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrloans.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行结构化版(贷款表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:55:43
 */
public class ExtWlShSrLoansDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**征信主表ID*/
	private Long fkReportId;

	/**信息详情*/
	private String original;

	/**信用状态[逾期、未逾期]*/
	private String creditStatus;

	/**账户状态[正常、结清、转出、呆账、核销]*/
	private String accountStatus;

	/**贷款机构*/
	private String loanBank;

	/**贷款类型*/
	private String loanType;

	/**贷款时间*/
	private String loanTime;

	/**贷款总额*/
	private String loanAmount;

	/**目前余额*/
	private String loanBalance;

	/**到期时间*/
	private String loanDeadline;

	/**统计/结清时间*/
	private String recordOrCancellation;

	/**逾期金额*/
	private String overAmount;

	/**最近5年内处于逾期状态月数*/
	private String overMonth;

	/**最近5年内处于逾期超过90天的月数*/
	private String overMonth90days;

	/**声明*/
	private String declaration;

	/**是否失败(0-成功;1-失败)*/
	private String isfail;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**数据有效性*/
	private String validateState;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long updateBy;

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
	 *方法: 获得fkReportId
	 *@return: java.lang.Long  fkReportId
	 */
	public Long getFkReportId(){
		return this.fkReportId;
	}

	/**
	 *方法: 设置fkReportId
	 *@param: java.lang.Long  fkReportId
	 */
	public void setFkReportId(Long fkReportId){
		this.fkReportId = fkReportId;
	}

	/**
	 *方法: 获得original
	 *@return: java.lang.String  original
	 */
	public String getOriginal(){
		return this.original;
	}

	/**
	 *方法: 设置original
	 *@param: java.lang.String  original
	 */
	public void setOriginal(String original){
		this.original = original;
	}

	/**
	 *方法: 获得creditStatus
	 *@return: java.lang.String  creditStatus
	 */
	public String getCreditStatus(){
		return this.creditStatus;
	}

	/**
	 *方法: 设置creditStatus
	 *@param: java.lang.String  creditStatus
	 */
	public void setCreditStatus(String creditStatus){
		this.creditStatus = creditStatus;
	}

	/**
	 *方法: 获得accountStatus
	 *@return: java.lang.String  accountStatus
	 */
	public String getAccountStatus(){
		return this.accountStatus;
	}

	/**
	 *方法: 设置accountStatus
	 *@param: java.lang.String  accountStatus
	 */
	public void setAccountStatus(String accountStatus){
		this.accountStatus = accountStatus;
	}

	/**
	 *方法: 获得loanBank
	 *@return: java.lang.String  loanBank
	 */
	public String getLoanBank(){
		return this.loanBank;
	}

	/**
	 *方法: 设置loanBank
	 *@param: java.lang.String  loanBank
	 */
	public void setLoanBank(String loanBank){
		this.loanBank = loanBank;
	}

	/**
	 *方法: 获得loanType
	 *@return: java.lang.String  loanType
	 */
	public String getLoanType(){
		return this.loanType;
	}

	/**
	 *方法: 设置loanType
	 *@param: java.lang.String  loanType
	 */
	public void setLoanType(String loanType){
		this.loanType = loanType;
	}

	/**
	 *方法: 获得loanTime
	 *@return: java.lang.String  loanTime
	 */
	public String getLoanTime(){
		return this.loanTime;
	}

	/**
	 *方法: 设置loanTime
	 *@param: java.lang.String  loanTime
	 */
	public void setLoanTime(String loanTime){
		this.loanTime = loanTime;
	}

	/**
	 *方法: 获得loanAmount
	 *@return: java.lang.String  loanAmount
	 */
	public String getLoanAmount(){
		return this.loanAmount;
	}

	/**
	 *方法: 设置loanAmount
	 *@param: java.lang.String  loanAmount
	 */
	public void setLoanAmount(String loanAmount){
		this.loanAmount = loanAmount;
	}

	/**
	 *方法: 获得loanBalance
	 *@return: java.lang.String  loanBalance
	 */
	public String getLoanBalance(){
		return this.loanBalance;
	}

	/**
	 *方法: 设置loanBalance
	 *@param: java.lang.String  loanBalance
	 */
	public void setLoanBalance(String loanBalance){
		this.loanBalance = loanBalance;
	}

	/**
	 *方法: 获得loanDeadline
	 *@return: java.lang.String  loanDeadline
	 */
	public String getLoanDeadline(){
		return this.loanDeadline;
	}

	/**
	 *方法: 设置loanDeadline
	 *@param: java.lang.String  loanDeadline
	 */
	public void setLoanDeadline(String loanDeadline){
		this.loanDeadline = loanDeadline;
	}

	/**
	 *方法: 获得recordOrCancellation
	 *@return: java.lang.String  recordOrCancellation
	 */
	public String getRecordOrCancellation(){
		return this.recordOrCancellation;
	}

	/**
	 *方法: 设置recordOrCancellation
	 *@param: java.lang.String  recordOrCancellation
	 */
	public void setRecordOrCancellation(String recordOrCancellation){
		this.recordOrCancellation = recordOrCancellation;
	}

	/**
	 *方法: 获得overAmount
	 *@return: java.lang.String  overAmount
	 */
	public String getOverAmount(){
		return this.overAmount;
	}

	/**
	 *方法: 设置overAmount
	 *@param: java.lang.String  overAmount
	 */
	public void setOverAmount(String overAmount){
		this.overAmount = overAmount;
	}

	/**
	 *方法: 获得overMonth
	 *@return: java.lang.String  overMonth
	 */
	public String getOverMonth(){
		return this.overMonth;
	}

	/**
	 *方法: 设置overMonth
	 *@param: java.lang.String  overMonth
	 */
	public void setOverMonth(String overMonth){
		this.overMonth = overMonth;
	}

	/**
	 *方法: 获得overMonth90days
	 *@return: java.lang.String  overMonth90days
	 */
	public String getOverMonth90days(){
		return this.overMonth90days;
	}

	/**
	 *方法: 设置overMonth90days
	 *@param: java.lang.String  overMonth90days
	 */
	public void setOverMonth90days(String overMonth90days){
		this.overMonth90days = overMonth90days;
	}

	/**
	 *方法: 获得declaration
	 *@return: java.lang.String  declaration
	 */
	public String getDeclaration(){
		return this.declaration;
	}

	/**
	 *方法: 设置declaration
	 *@param: java.lang.String  declaration
	 */
	public void setDeclaration(String declaration){
		this.declaration = declaration;
	}

	/**
	 *方法: 获得isfail
	 *@return: java.lang.String  isfail
	 */
	public String getIsfail(){
		return this.isfail;
	}

	/**
	 *方法: 设置isfail
	 *@param: java.lang.String  isfail
	 */
	public void setIsfail(String isfail){
		this.isfail = isfail;
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
	 *方法: 获得modifyTime
	 *@return: java.sql.Timestamp  modifyTime
	 */
	public java.sql.Timestamp getModifyTime(){
		return this.modifyTime;
	}

	/**
	 *方法: 设置modifyTime
	 *@param: java.sql.Timestamp  modifyTime
	 */
	public void setModifyTime(java.sql.Timestamp modifyTime){
		this.modifyTime = modifyTime;
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

}