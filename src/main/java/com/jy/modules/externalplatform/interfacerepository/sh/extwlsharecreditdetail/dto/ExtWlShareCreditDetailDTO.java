package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecreditdetail.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话共享报告_信贷信息明细
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 19:53:26
 */
public class ExtWlShareCreditDetailDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**开户时间*/
	private String applyDate;

	/**业务类型*/
	private String creditType;

	/**合同状态*/
	private String accountStatus;

	/**担保方式*/
	private String guaranteeWay;

	/**还款频率*/
	private String repayFreq;

	/**机构号*/
	private String orgCode;

	/**合同生效日期*/
	private String dateOpened;

	/**合同到期日期*/
	private String dateClosed;

	/**合同金额*/
	private Long creditLimit;

	/**当前负债余额*/
	private Long balance;

	/**贷款期数*/
	private Long loanTerm;

	/**剩余还款期数*/
	private Long periodNumber;

	/**本期应还款日*/
	private String billingDate;

	/**本期应还款*/
	private Long scheduledAmount;

	/**本期实还款金额*/
	private Long actualPayAmount;

	/**最近一次还款日*/
	private String actualPayDate;

	/**当前逾期期数*/
	private Long nowOverdueTimes;

	/**最高逾期期数*/
	private Long maxOverdueTimes;

	/**当前逾期金额*/
	private Long nowOverdueAmount;

	/**最高逾期金额*/
	private Long maxOverdueAmount;

	/**征信报告主表ID*/
	private Long fkReportId;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

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
	 *方法: 获得applyDate
	 *@return: java.lang.String  applyDate
	 */
	public String getApplyDate(){
		return this.applyDate;
	}

	/**
	 *方法: 设置applyDate
	 *@param: java.lang.String  applyDate
	 */
	public void setApplyDate(String applyDate){
		this.applyDate = applyDate;
	}

	/**
	 *方法: 获得creditType
	 *@return: java.lang.String  creditType
	 */
	public String getCreditType(){
		return this.creditType;
	}

	/**
	 *方法: 设置creditType
	 *@param: java.lang.String  creditType
	 */
	public void setCreditType(String creditType){
		this.creditType = creditType;
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
	 *方法: 获得guaranteeWay
	 *@return: java.lang.String  guaranteeWay
	 */
	public String getGuaranteeWay(){
		return this.guaranteeWay;
	}

	/**
	 *方法: 设置guaranteeWay
	 *@param: java.lang.String  guaranteeWay
	 */
	public void setGuaranteeWay(String guaranteeWay){
		this.guaranteeWay = guaranteeWay;
	}

	/**
	 *方法: 获得repayFreq
	 *@return: java.lang.String  repayFreq
	 */
	public String getRepayFreq(){
		return this.repayFreq;
	}

	/**
	 *方法: 设置repayFreq
	 *@param: java.lang.String  repayFreq
	 */
	public void setRepayFreq(String repayFreq){
		this.repayFreq = repayFreq;
	}

	/**
	 *方法: 获得orgCode
	 *@return: java.lang.String  orgCode
	 */
	public String getOrgCode(){
		return this.orgCode;
	}

	/**
	 *方法: 设置orgCode
	 *@param: java.lang.String  orgCode
	 */
	public void setOrgCode(String orgCode){
		this.orgCode = orgCode;
	}

	/**
	 *方法: 获得dateOpened
	 *@return: java.lang.String  dateOpened
	 */
	public String getDateOpened(){
		return this.dateOpened;
	}

	/**
	 *方法: 设置dateOpened
	 *@param: java.lang.String  dateOpened
	 */
	public void setDateOpened(String dateOpened){
		this.dateOpened = dateOpened;
	}

	/**
	 *方法: 获得dateClosed
	 *@return: java.lang.String  dateClosed
	 */
	public String getDateClosed(){
		return this.dateClosed;
	}

	/**
	 *方法: 设置dateClosed
	 *@param: java.lang.String  dateClosed
	 */
	public void setDateClosed(String dateClosed){
		this.dateClosed = dateClosed;
	}

	/**
	 *方法: 获得creditLimit
	 *@return: java.lang.Long  creditLimit
	 */
	public Long getCreditLimit(){
		return this.creditLimit;
	}

	/**
	 *方法: 设置creditLimit
	 *@param: java.lang.Long  creditLimit
	 */
	public void setCreditLimit(Long creditLimit){
		this.creditLimit = creditLimit;
	}

	/**
	 *方法: 获得balance
	 *@return: java.lang.Long  balance
	 */
	public Long getBalance(){
		return this.balance;
	}

	/**
	 *方法: 设置balance
	 *@param: java.lang.Long  balance
	 */
	public void setBalance(Long balance){
		this.balance = balance;
	}

	/**
	 *方法: 获得loanTerm
	 *@return: java.lang.Long  loanTerm
	 */
	public Long getLoanTerm(){
		return this.loanTerm;
	}

	/**
	 *方法: 设置loanTerm
	 *@param: java.lang.Long  loanTerm
	 */
	public void setLoanTerm(Long loanTerm){
		this.loanTerm = loanTerm;
	}

	/**
	 *方法: 获得periodNumber
	 *@return: java.lang.Long  periodNumber
	 */
	public Long getPeriodNumber(){
		return this.periodNumber;
	}

	/**
	 *方法: 设置periodNumber
	 *@param: java.lang.Long  periodNumber
	 */
	public void setPeriodNumber(Long periodNumber){
		this.periodNumber = periodNumber;
	}

	/**
	 *方法: 获得billingDate
	 *@return: java.lang.String  billingDate
	 */
	public String getBillingDate(){
		return this.billingDate;
	}

	/**
	 *方法: 设置billingDate
	 *@param: java.lang.String  billingDate
	 */
	public void setBillingDate(String billingDate){
		this.billingDate = billingDate;
	}

	/**
	 *方法: 获得scheduledAmount
	 *@return: java.lang.Long  scheduledAmount
	 */
	public Long getScheduledAmount(){
		return this.scheduledAmount;
	}

	/**
	 *方法: 设置scheduledAmount
	 *@param: java.lang.Long  scheduledAmount
	 */
	public void setScheduledAmount(Long scheduledAmount){
		this.scheduledAmount = scheduledAmount;
	}

	/**
	 *方法: 获得actualPayAmount
	 *@return: java.lang.Long  actualPayAmount
	 */
	public Long getActualPayAmount(){
		return this.actualPayAmount;
	}

	/**
	 *方法: 设置actualPayAmount
	 *@param: java.lang.Long  actualPayAmount
	 */
	public void setActualPayAmount(Long actualPayAmount){
		this.actualPayAmount = actualPayAmount;
	}

	/**
	 *方法: 获得actualPayDate
	 *@return: java.lang.String  actualPayDate
	 */
	public String getActualPayDate(){
		return this.actualPayDate;
	}

	/**
	 *方法: 设置actualPayDate
	 *@param: java.lang.String  actualPayDate
	 */
	public void setActualPayDate(String actualPayDate){
		this.actualPayDate = actualPayDate;
	}

	/**
	 *方法: 获得nowOverdueTimes
	 *@return: java.lang.Long  nowOverdueTimes
	 */
	public Long getNowOverdueTimes(){
		return this.nowOverdueTimes;
	}

	/**
	 *方法: 设置nowOverdueTimes
	 *@param: java.lang.Long  nowOverdueTimes
	 */
	public void setNowOverdueTimes(Long nowOverdueTimes){
		this.nowOverdueTimes = nowOverdueTimes;
	}

	/**
	 *方法: 获得maxOverdueTimes
	 *@return: java.lang.Long  maxOverdueTimes
	 */
	public Long getMaxOverdueTimes(){
		return this.maxOverdueTimes;
	}

	/**
	 *方法: 设置maxOverdueTimes
	 *@param: java.lang.Long  maxOverdueTimes
	 */
	public void setMaxOverdueTimes(Long maxOverdueTimes){
		this.maxOverdueTimes = maxOverdueTimes;
	}

	/**
	 *方法: 获得nowOverdueAmount
	 *@return: java.lang.Long  nowOverdueAmount
	 */
	public Long getNowOverdueAmount(){
		return this.nowOverdueAmount;
	}

	/**
	 *方法: 设置nowOverdueAmount
	 *@param: java.lang.Long  nowOverdueAmount
	 */
	public void setNowOverdueAmount(Long nowOverdueAmount){
		this.nowOverdueAmount = nowOverdueAmount;
	}

	/**
	 *方法: 获得maxOverdueAmount
	 *@return: java.lang.Long  maxOverdueAmount
	 */
	public Long getMaxOverdueAmount(){
		return this.maxOverdueAmount;
	}

	/**
	 *方法: 设置maxOverdueAmount
	 *@param: java.lang.Long  maxOverdueAmount
	 */
	public void setMaxOverdueAmount(Long maxOverdueAmount){
		this.maxOverdueAmount = maxOverdueAmount;
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

}