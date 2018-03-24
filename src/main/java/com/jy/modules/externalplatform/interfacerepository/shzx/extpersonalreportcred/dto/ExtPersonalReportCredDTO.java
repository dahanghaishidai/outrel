package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportcred.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:网络金融版个人信用报告-贷款
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-05 10:08:09
 */
public class ExtPersonalReportCredDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**贷款项目*/
	private java.lang.String loanProject;

	/**机构名称*/
	private java.lang.String orgName;

	/**授信额度*/
	private java.lang.String creditQuota;

	/**主表关联ID*/
	private java.lang.Long personalCreditReport;

	/**担保方式*/
	private java.lang.String guaranteeWay;

	/**开户日期*/
	private java.lang.String accountOpeningDate;

	/**币种*/
	private java.lang.String currency;

	/**发生地*/
	private java.lang.String place;

	/**共享授信额度*/
	private java.lang.String sharedCreditQuota;

	/**最大负债额*/
	private java.lang.String maxLiabilitiesQuota;

	/**还款频率*/
	private java.lang.String paymentFrequency;

	/**期末贷款余额*/
	private java.lang.String endLoanBalance;

	/**剩余还款月数*/
	private java.lang.String remainingRepaymentMonths;

	/**本月应还款日期*/
	private java.lang.String monthRepaymentDate;

	/**本月应还款金额*/
	private java.lang.String monthRepaymentAmount;

	/**帐户状态*/
	private java.lang.String accountStatus;

	/**实际还款日期*/
	private java.lang.String actualRepaymentDate;

	/**实际还款金额*/
	private java.lang.String actualRepaymentAmount;

	/**当前逾期总额*/
	private java.lang.String currentOverdueTotal;

	/**当前逾期期数*/
	private java.lang.String currentOverdueNumber;

	/**累计逾期期数*/
	private java.lang.String accumulatedOverdueNumber;

	/**最高逾期期数*/
	private java.lang.String maxOverdueNumber;

	/**二十四月内各月还款状况*/
	private java.lang.String monthlyRepaymentConditions;

	/**逾期31-60天未归还贷款本金*/
	private java.lang.String overduePrincipalMonths2;

	/**逾期61-90天未归还贷款本金*/
	private java.lang.String overduePrincipalMonths3;

	/**逾期91-180天未归还贷款本金*/
	private java.lang.String overduePrincipalMonths6;

	/**逾期180天以上未归还贷款本金*/
	private java.lang.String overduePrincipalDays180;

	/**信息获取日期*/
	private java.lang.String loanObtainDate;

	/**OPTLOCK*/
	private java.lang.Long optlock;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;
	/**
	 *方法: 获得id
	 *@return: java.lang.Long  id
	 */
	public java.lang.Long getId(){
		return this.id;
	}

	/**
	 *方法: 设置id
	 *@param: java.lang.Long  id
	 */
	public void setId(java.lang.Long id){
		this.id = id;
	}

	/**
	 *方法: 获得loanProject
	 *@return: java.lang.String  loanProject
	 */
	public java.lang.String getLoanProject(){
		return this.loanProject;
	}

	/**
	 *方法: 设置loanProject
	 *@param: java.lang.String  loanProject
	 */
	public void setLoanProject(java.lang.String loanProject){
		this.loanProject = loanProject;
	}

	/**
	 *方法: 获得orgName
	 *@return: java.lang.String  orgName
	 */
	public java.lang.String getOrgName(){
		return this.orgName;
	}

	/**
	 *方法: 设置orgName
	 *@param: java.lang.String  orgName
	 */
	public void setOrgName(java.lang.String orgName){
		this.orgName = orgName;
	}

	/**
	 *方法: 获得creditQuota
	 *@return: java.lang.String  creditQuota
	 */
	public java.lang.String getCreditQuota(){
		return this.creditQuota;
	}

	/**
	 *方法: 设置creditQuota
	 *@param: java.lang.String  creditQuota
	 */
	public void setCreditQuota(java.lang.String creditQuota){
		this.creditQuota = creditQuota;
	}

	/**
	 *方法: 获得personalCreditReport
	 *@return: java.lang.Long  personalCreditReport
	 */
	public java.lang.Long getPersonalCreditReport(){
		return this.personalCreditReport;
	}

	/**
	 *方法: 设置personalCreditReport
	 *@param: java.lang.Long  personalCreditReport
	 */
	public void setPersonalCreditReport(java.lang.Long personalCreditReport){
		this.personalCreditReport = personalCreditReport;
	}

	/**
	 *方法: 获得guaranteeWay
	 *@return: java.lang.String  guaranteeWay
	 */
	public java.lang.String getGuaranteeWay(){
		return this.guaranteeWay;
	}

	/**
	 *方法: 设置guaranteeWay
	 *@param: java.lang.String  guaranteeWay
	 */
	public void setGuaranteeWay(java.lang.String guaranteeWay){
		this.guaranteeWay = guaranteeWay;
	}

	/**
	 *方法: 获得accountOpeningDate
	 *@return: java.lang.String  accountOpeningDate
	 */
	public java.lang.String getAccountOpeningDate(){
		return this.accountOpeningDate;
	}

	/**
	 *方法: 设置accountOpeningDate
	 *@param: java.lang.String  accountOpeningDate
	 */
	public void setAccountOpeningDate(java.lang.String accountOpeningDate){
		this.accountOpeningDate = accountOpeningDate;
	}

	/**
	 *方法: 获得currency
	 *@return: java.lang.String  currency
	 */
	public java.lang.String getCurrency(){
		return this.currency;
	}

	/**
	 *方法: 设置currency
	 *@param: java.lang.String  currency
	 */
	public void setCurrency(java.lang.String currency){
		this.currency = currency;
	}

	/**
	 *方法: 获得place
	 *@return: java.lang.String  place
	 */
	public java.lang.String getPlace(){
		return this.place;
	}

	/**
	 *方法: 设置place
	 *@param: java.lang.String  place
	 */
	public void setPlace(java.lang.String place){
		this.place = place;
	}

	/**
	 *方法: 获得sharedCreditQuota
	 *@return: java.lang.String  sharedCreditQuota
	 */
	public java.lang.String getSharedCreditQuota(){
		return this.sharedCreditQuota;
	}

	/**
	 *方法: 设置sharedCreditQuota
	 *@param: java.lang.String  sharedCreditQuota
	 */
	public void setSharedCreditQuota(java.lang.String sharedCreditQuota){
		this.sharedCreditQuota = sharedCreditQuota;
	}

	/**
	 *方法: 获得maxLiabilitiesQuota
	 *@return: java.lang.String  maxLiabilitiesQuota
	 */
	public java.lang.String getMaxLiabilitiesQuota(){
		return this.maxLiabilitiesQuota;
	}

	/**
	 *方法: 设置maxLiabilitiesQuota
	 *@param: java.lang.String  maxLiabilitiesQuota
	 */
	public void setMaxLiabilitiesQuota(java.lang.String maxLiabilitiesQuota){
		this.maxLiabilitiesQuota = maxLiabilitiesQuota;
	}

	/**
	 *方法: 获得paymentFrequency
	 *@return: java.lang.String  paymentFrequency
	 */
	public java.lang.String getPaymentFrequency(){
		return this.paymentFrequency;
	}

	/**
	 *方法: 设置paymentFrequency
	 *@param: java.lang.String  paymentFrequency
	 */
	public void setPaymentFrequency(java.lang.String paymentFrequency){
		this.paymentFrequency = paymentFrequency;
	}

	/**
	 *方法: 获得endLoanBalance
	 *@return: java.lang.String  endLoanBalance
	 */
	public java.lang.String getEndLoanBalance(){
		return this.endLoanBalance;
	}

	/**
	 *方法: 设置endLoanBalance
	 *@param: java.lang.String  endLoanBalance
	 */
	public void setEndLoanBalance(java.lang.String endLoanBalance){
		this.endLoanBalance = endLoanBalance;
	}

	/**
	 *方法: 获得remainingRepaymentMonths
	 *@return: java.lang.String  remainingRepaymentMonths
	 */
	public java.lang.String getRemainingRepaymentMonths(){
		return this.remainingRepaymentMonths;
	}

	/**
	 *方法: 设置remainingRepaymentMonths
	 *@param: java.lang.String  remainingRepaymentMonths
	 */
	public void setRemainingRepaymentMonths(java.lang.String remainingRepaymentMonths){
		this.remainingRepaymentMonths = remainingRepaymentMonths;
	}

	/**
	 *方法: 获得monthRepaymentDate
	 *@return: java.lang.String  monthRepaymentDate
	 */
	public java.lang.String getMonthRepaymentDate(){
		return this.monthRepaymentDate;
	}

	/**
	 *方法: 设置monthRepaymentDate
	 *@param: java.lang.String  monthRepaymentDate
	 */
	public void setMonthRepaymentDate(java.lang.String monthRepaymentDate){
		this.monthRepaymentDate = monthRepaymentDate;
	}

	/**
	 *方法: 获得monthRepaymentAmount
	 *@return: java.lang.String  monthRepaymentAmount
	 */
	public java.lang.String getMonthRepaymentAmount(){
		return this.monthRepaymentAmount;
	}

	/**
	 *方法: 设置monthRepaymentAmount
	 *@param: java.lang.String  monthRepaymentAmount
	 */
	public void setMonthRepaymentAmount(java.lang.String monthRepaymentAmount){
		this.monthRepaymentAmount = monthRepaymentAmount;
	}

	/**
	 *方法: 获得accountStatus
	 *@return: java.lang.String  accountStatus
	 */
	public java.lang.String getAccountStatus(){
		return this.accountStatus;
	}

	/**
	 *方法: 设置accountStatus
	 *@param: java.lang.String  accountStatus
	 */
	public void setAccountStatus(java.lang.String accountStatus){
		this.accountStatus = accountStatus;
	}

	/**
	 *方法: 获得actualRepaymentDate
	 *@return: java.lang.String  actualRepaymentDate
	 */
	public java.lang.String getActualRepaymentDate(){
		return this.actualRepaymentDate;
	}

	/**
	 *方法: 设置actualRepaymentDate
	 *@param: java.lang.String  actualRepaymentDate
	 */
	public void setActualRepaymentDate(java.lang.String actualRepaymentDate){
		this.actualRepaymentDate = actualRepaymentDate;
	}

	/**
	 *方法: 获得actualRepaymentAmount
	 *@return: java.lang.String  actualRepaymentAmount
	 */
	public java.lang.String getActualRepaymentAmount(){
		return this.actualRepaymentAmount;
	}

	/**
	 *方法: 设置actualRepaymentAmount
	 *@param: java.lang.String  actualRepaymentAmount
	 */
	public void setActualRepaymentAmount(java.lang.String actualRepaymentAmount){
		this.actualRepaymentAmount = actualRepaymentAmount;
	}

	/**
	 *方法: 获得currentOverdueTotal
	 *@return: java.lang.String  currentOverdueTotal
	 */
	public java.lang.String getCurrentOverdueTotal(){
		return this.currentOverdueTotal;
	}

	/**
	 *方法: 设置currentOverdueTotal
	 *@param: java.lang.String  currentOverdueTotal
	 */
	public void setCurrentOverdueTotal(java.lang.String currentOverdueTotal){
		this.currentOverdueTotal = currentOverdueTotal;
	}

	/**
	 *方法: 获得currentOverdueNumber
	 *@return: java.lang.String  currentOverdueNumber
	 */
	public java.lang.String getCurrentOverdueNumber(){
		return this.currentOverdueNumber;
	}

	/**
	 *方法: 设置currentOverdueNumber
	 *@param: java.lang.String  currentOverdueNumber
	 */
	public void setCurrentOverdueNumber(java.lang.String currentOverdueNumber){
		this.currentOverdueNumber = currentOverdueNumber;
	}

	/**
	 *方法: 获得accumulatedOverdueNumber
	 *@return: java.lang.String  accumulatedOverdueNumber
	 */
	public java.lang.String getAccumulatedOverdueNumber(){
		return this.accumulatedOverdueNumber;
	}

	/**
	 *方法: 设置accumulatedOverdueNumber
	 *@param: java.lang.String  accumulatedOverdueNumber
	 */
	public void setAccumulatedOverdueNumber(java.lang.String accumulatedOverdueNumber){
		this.accumulatedOverdueNumber = accumulatedOverdueNumber;
	}

	/**
	 *方法: 获得maxOverdueNumber
	 *@return: java.lang.String  maxOverdueNumber
	 */
	public java.lang.String getMaxOverdueNumber(){
		return this.maxOverdueNumber;
	}

	/**
	 *方法: 设置maxOverdueNumber
	 *@param: java.lang.String  maxOverdueNumber
	 */
	public void setMaxOverdueNumber(java.lang.String maxOverdueNumber){
		this.maxOverdueNumber = maxOverdueNumber;
	}

	/**
	 *方法: 获得monthlyRepaymentConditions
	 *@return: java.lang.String  monthlyRepaymentConditions
	 */
	public java.lang.String getMonthlyRepaymentConditions(){
		return this.monthlyRepaymentConditions;
	}

	/**
	 *方法: 设置monthlyRepaymentConditions
	 *@param: java.lang.String  monthlyRepaymentConditions
	 */
	public void setMonthlyRepaymentConditions(java.lang.String monthlyRepaymentConditions){
		this.monthlyRepaymentConditions = monthlyRepaymentConditions;
	}

	/**
	 *方法: 获得overduePrincipalMonths2
	 *@return: java.lang.String  overduePrincipalMonths2
	 */
	public java.lang.String getOverduePrincipalMonths2(){
		return this.overduePrincipalMonths2;
	}

	/**
	 *方法: 设置overduePrincipalMonths2
	 *@param: java.lang.String  overduePrincipalMonths2
	 */
	public void setOverduePrincipalMonths2(java.lang.String overduePrincipalMonths2){
		this.overduePrincipalMonths2 = overduePrincipalMonths2;
	}

	/**
	 *方法: 获得overduePrincipalMonths3
	 *@return: java.lang.String  overduePrincipalMonths3
	 */
	public java.lang.String getOverduePrincipalMonths3(){
		return this.overduePrincipalMonths3;
	}

	/**
	 *方法: 设置overduePrincipalMonths3
	 *@param: java.lang.String  overduePrincipalMonths3
	 */
	public void setOverduePrincipalMonths3(java.lang.String overduePrincipalMonths3){
		this.overduePrincipalMonths3 = overduePrincipalMonths3;
	}

	/**
	 *方法: 获得overduePrincipalMonths6
	 *@return: java.lang.String  overduePrincipalMonths6
	 */
	public java.lang.String getOverduePrincipalMonths6(){
		return this.overduePrincipalMonths6;
	}

	/**
	 *方法: 设置overduePrincipalMonths6
	 *@param: java.lang.String  overduePrincipalMonths6
	 */
	public void setOverduePrincipalMonths6(java.lang.String overduePrincipalMonths6){
		this.overduePrincipalMonths6 = overduePrincipalMonths6;
	}

	/**
	 *方法: 获得overduePrincipalDays180
	 *@return: java.lang.String  overduePrincipalDays180
	 */
	public java.lang.String getOverduePrincipalDays180(){
		return this.overduePrincipalDays180;
	}

	/**
	 *方法: 设置overduePrincipalDays180
	 *@param: java.lang.String  overduePrincipalDays180
	 */
	public void setOverduePrincipalDays180(java.lang.String overduePrincipalDays180){
		this.overduePrincipalDays180 = overduePrincipalDays180;
	}

	/**
	 *方法: 获得loanObtainDate
	 *@return: java.lang.String  loanObtainDate
	 */
	public java.lang.String getLoanObtainDate(){
		return this.loanObtainDate;
	}

	/**
	 *方法: 设置loanObtainDate
	 *@param: java.lang.String  loanObtainDate
	 */
	public void setLoanObtainDate(java.lang.String loanObtainDate){
		this.loanObtainDate = loanObtainDate;
	}

	/**
	 *方法: 获得optlock
	 *@return: java.lang.Long  optlock
	 */
	public java.lang.Long getOptlock(){
		return this.optlock;
	}

	/**
	 *方法: 设置optlock
	 *@param: java.lang.Long  optlock
	 */
	public void setOptlock(java.lang.Long optlock){
		this.optlock = optlock;
	}

	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.sql.Timestamp createTime) {
		this.createTime = createTime;
	}

	public java.sql.Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(java.sql.Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

}