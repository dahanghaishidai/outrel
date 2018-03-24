package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlloaninfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:聚信立央行征信报告（贷款信息表）
 *@author dell
 *@version 1.0,
 *@date 2017-08-24 20:59:39
 */
public class ExtJxlLoanInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private java.lang.Long id;

	/**征信主表ID*/
	private java.lang.Long fkReportId;

	/**发放贷款日期*/
	private java.lang.String grantTime;

	/**发放贷款单位*/
	private java.lang.String grantCompany;

	/**发放贷款金额*/
	private java.lang.String grantAmount;

	/**发放贷款金额类型*/
	private java.lang.String grantAmountType;

	/**发放贷款名称*/
	private java.lang.String grantName;

	/**贷款到期日*/
	private java.lang.String expirationTime;

	/**状态截止日*/
	private java.lang.String deadlineTime;

	/**贷款余额*/
	private java.lang.String balance;

	/**5年内逾期超过90天的月份数*/
	private java.lang.String monthOfFiveYear90;

	/**5年内处于逾期状态的月份数*/
	private java.lang.String monthOfFiveYear;

	/**逾期金额*/
	private java.lang.String overdueAmount;

	/**结清日期*/
	private java.lang.String clearTime;

	/**每条贷款记录的原文本*/
	private java.lang.String originalContent;

	/**贷款类型*/
	private java.lang.String loanType;
	
	/**逾期状态*/
	private java.lang.String overdueStatus;
	
	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	public java.lang.Long getId() {
		return id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Long getFkReportId() {
		return fkReportId;
	}

	public void setFkReportId(java.lang.Long fkReportId) {
		this.fkReportId = fkReportId;
	}

	public java.lang.String getGrantTime() {
		return grantTime;
	}

	public void setGrantTime(java.lang.String grantTime) {
		this.grantTime = grantTime;
	}

	public java.lang.String getGrantCompany() {
		return grantCompany;
	}

	public void setGrantCompany(java.lang.String grantCompany) {
		this.grantCompany = grantCompany;
	}

	public java.lang.String getGrantAmount() {
		return grantAmount;
	}

	public void setGrantAmount(java.lang.String grantAmount) {
		this.grantAmount = grantAmount;
	}

	public java.lang.String getGrantAmountType() {
		return grantAmountType;
	}

	public void setGrantAmountType(java.lang.String grantAmountType) {
		this.grantAmountType = grantAmountType;
	}

	public java.lang.String getGrantName() {
		return grantName;
	}

	public void setGrantName(java.lang.String grantName) {
		this.grantName = grantName;
	}

	public java.lang.String getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(java.lang.String expirationTime) {
		this.expirationTime = expirationTime;
	}

	public java.lang.String getDeadlineTime() {
		return deadlineTime;
	}

	public void setDeadlineTime(java.lang.String deadlineTime) {
		this.deadlineTime = deadlineTime;
	}

	public java.lang.String getBalance() {
		return balance;
	}

	public void setBalance(java.lang.String balance) {
		this.balance = balance;
	}

	public java.lang.String getMonthOfFiveYear90() {
		return monthOfFiveYear90;
	}

	public void setMonthOfFiveYear90(java.lang.String monthOfFiveYear90) {
		this.monthOfFiveYear90 = monthOfFiveYear90;
	}

	public java.lang.String getMonthOfFiveYear() {
		return monthOfFiveYear;
	}

	public void setMonthOfFiveYear(java.lang.String monthOfFiveYear) {
		this.monthOfFiveYear = monthOfFiveYear;
	}

	public java.lang.String getOverdueAmount() {
		return overdueAmount;
	}

	public void setOverdueAmount(java.lang.String overdueAmount) {
		this.overdueAmount = overdueAmount;
	}

	public java.lang.String getClearTime() {
		return clearTime;
	}

	public void setClearTime(java.lang.String clearTime) {
		this.clearTime = clearTime;
	}

	public java.lang.String getOriginalContent() {
		return originalContent;
	}

	public void setOriginalContent(java.lang.String originalContent) {
		this.originalContent = originalContent;
	}

	public java.lang.String getLoanType() {
		return loanType;
	}

	public void setLoanType(java.lang.String loanType) {
		this.loanType = loanType;
	}

	public java.lang.String getOverdueStatus() {
		return overdueStatus;
	}

	public void setOverdueStatus(java.lang.String overdueStatus) {
		this.overdueStatus = overdueStatus;
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