package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditcard.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:聚信立央行征信报告（信用卡信息表）
 *@author dell
 *@version 1.0,
 *@date 2017-08-24 20:59:58
 */
public class ExtJxlCreditCardDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**征信主表ID*/
	private java.lang.Long fkReportId;

	/**发放信用卡日期*/
	private java.lang.String grantTime;

	/**发放信用卡单位*/
	private java.lang.String grantCompany;

	/**发放信用卡账户类型*/
	private java.lang.String grantAccountType;

	/**发放信用卡名称*/
	private java.lang.String grantName;

	/**截至日期*/
	private java.lang.String deadlineTime;

	/**信用额度*/
	private java.lang.String creditLimit;

	/**已使用额度*/
	private java.lang.String usedQuotas;

	/**透支余额*/
	private java.lang.String overdraftBalance;

	/**5年内逾期超过90天的月份数*/
	private java.lang.String monthOfFiveYear90;

	/**5年内处于逾期状态的月份数*/
	private java.lang.String monthOfFiveYear;

	/**账户状态*/
	private java.lang.String status;

	/**逾期金额*/
	private java.lang.String overdueAmount;

	/**每条信用卡记录的原文本*/
	private java.lang.String originalContent;
	
	/**逾期状态（1-未逾期;2-逾期）*/
	private java.lang.String overDueStatus;

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
	 *方法: 获得fkReportId
	 *@return: java.lang.Long  fkReportId
	 */
	public java.lang.Long getFkReportId(){
		return this.fkReportId;
	}

	/**
	 *方法: 设置fkReportId
	 *@param: java.lang.Long  fkReportId
	 */
	public void setFkReportId(java.lang.Long fkReportId){
		this.fkReportId = fkReportId;
	}

	/**
	 *方法: 获得grantTime
	 *@return: java.lang.String  grantTime
	 */
	public java.lang.String getGrantTime(){
		return this.grantTime;
	}

	/**
	 *方法: 设置grantTime
	 *@param: java.lang.String  grantTime
	 */
	public void setGrantTime(java.lang.String grantTime){
		this.grantTime = grantTime;
	}

	/**
	 *方法: 获得grantCompany
	 *@return: java.lang.String  grantCompany
	 */
	public java.lang.String getGrantCompany(){
		return this.grantCompany;
	}

	/**
	 *方法: 设置grantCompany
	 *@param: java.lang.String  grantCompany
	 */
	public void setGrantCompany(java.lang.String grantCompany){
		this.grantCompany = grantCompany;
	}

	/**
	 *方法: 获得grantAccountType
	 *@return: java.lang.String  grantAccountType
	 */
	public java.lang.String getGrantAccountType(){
		return this.grantAccountType;
	}

	/**
	 *方法: 设置grantAccountType
	 *@param: java.lang.String  grantAccountType
	 */
	public void setGrantAccountType(java.lang.String grantAccountType){
		this.grantAccountType = grantAccountType;
	}

	/**
	 *方法: 获得grantName
	 *@return: java.lang.String  grantName
	 */
	public java.lang.String getGrantName(){
		return this.grantName;
	}

	/**
	 *方法: 设置grantName
	 *@param: java.lang.String  grantName
	 */
	public void setGrantName(java.lang.String grantName){
		this.grantName = grantName;
	}

	/**
	 *方法: 获得deadlineTime
	 *@return: java.lang.String  deadlineTime
	 */
	public java.lang.String getDeadlineTime(){
		return this.deadlineTime;
	}

	/**
	 *方法: 设置deadlineTime
	 *@param: java.lang.String  deadlineTime
	 */
	public void setDeadlineTime(java.lang.String deadlineTime){
		this.deadlineTime = deadlineTime;
	}

	/**
	 *方法: 获得creditLimit
	 *@return: java.lang.String  creditLimit
	 */
	public java.lang.String getCreditLimit(){
		return this.creditLimit;
	}

	/**
	 *方法: 设置creditLimit
	 *@param: java.lang.String  creditLimit
	 */
	public void setCreditLimit(java.lang.String creditLimit){
		this.creditLimit = creditLimit;
	}

	/**
	 *方法: 获得usedQuotas
	 *@return: java.lang.String  usedQuotas
	 */
	public java.lang.String getUsedQuotas(){
		return this.usedQuotas;
	}

	/**
	 *方法: 设置usedQuotas
	 *@param: java.lang.String  usedQuotas
	 */
	public void setUsedQuotas(java.lang.String usedQuotas){
		this.usedQuotas = usedQuotas;
	}

	/**
	 *方法: 获得overdraftBalance
	 *@return: java.lang.String  overdraftBalance
	 */
	public java.lang.String getOverdraftBalance(){
		return this.overdraftBalance;
	}

	/**
	 *方法: 设置overdraftBalance
	 *@param: java.lang.String  overdraftBalance
	 */
	public void setOverdraftBalance(java.lang.String overdraftBalance){
		this.overdraftBalance = overdraftBalance;
	}

	/**
	 *方法: 获得monthOfFiveYear90
	 *@return: java.lang.String  monthOfFiveYear90
	 */
	public java.lang.String getMonthOfFiveYear90(){
		return this.monthOfFiveYear90;
	}

	/**
	 *方法: 设置monthOfFiveYear90
	 *@param: java.lang.String  monthOfFiveYear90
	 */
	public void setMonthOfFiveYear90(java.lang.String monthOfFiveYear90){
		this.monthOfFiveYear90 = monthOfFiveYear90;
	}

	/**
	 *方法: 获得monthOfFiveYear
	 *@return: java.lang.String  monthOfFiveYear
	 */
	public java.lang.String getMonthOfFiveYear(){
		return this.monthOfFiveYear;
	}

	/**
	 *方法: 设置monthOfFiveYear
	 *@param: java.lang.String  monthOfFiveYear
	 */
	public void setMonthOfFiveYear(java.lang.String monthOfFiveYear){
		this.monthOfFiveYear = monthOfFiveYear;
	}

	/**
	 *方法: 获得status
	 *@return: java.lang.String  status
	 */
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置status
	 *@param: java.lang.String  status
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}

	/**
	 *方法: 获得overdueAmount
	 *@return: java.lang.String  overdueAmount
	 */
	public java.lang.String getOverdueAmount(){
		return this.overdueAmount;
	}

	/**
	 *方法: 设置overdueAmount
	 *@param: java.lang.String  overdueAmount
	 */
	public void setOverdueAmount(java.lang.String overdueAmount){
		this.overdueAmount = overdueAmount;
	}

	/**
	 *方法: 获得originalContent
	 *@return: java.lang.String  originalContent
	 */
	public java.lang.String getOriginalContent(){
		return this.originalContent;
	}

	/**
	 *方法: 设置originalContent
	 *@param: java.lang.String  originalContent
	 */
	public void setOriginalContent(java.lang.String originalContent){
		this.originalContent = originalContent;
	}
	
	
	public java.lang.String getOverDueStatus() {
		return overDueStatus;
	}

	public void setOverDueStatus(java.lang.String overDueStatus) {
		this.overDueStatus = overDueStatus;
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