package com.jy.modules.externalplatform.interfacerepository.suanhua.extshpercreloanstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:人行征信信贷信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-12 14:56:13
 */
public class ExtShPerCreLoanStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**信用卡最大MOB*/
	private java.lang.String creditMob;

	/**贷款最大MOB*/
	private java.lang.String loanMob;

	/**近3个月内新发信用卡机构数*/
	private java.lang.String creditOrgCountsM3;

	/**近3个月内新核发贷款笔数*/
	private java.lang.String creditLimitTotalM3;

	/**近3个月内贷款审批查询次数*/
	private java.lang.String loanCountsM3;

	/**近3个月内新增信用卡信用总额度*/
	private java.lang.String loanAmtsM3;

	/**近3月贷款审核查询次数*/
	private java.lang.String loanQueriesM3;

	/**近3月本人查询次数*/
	private java.lang.String selfQueriesM3;

	/**当前为他人担保笔数*/
	private java.lang.String guarantees;

	/**当前为他人担保金额*/
	private java.lang.String guaranteeAmts;

	/**近6个月内欠税总额*/
	private java.lang.String month6TaxAmts;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**MODIFY_TIME*/
	private java.sql.Timestamp modifyTime;

	/**人行征信报告主键*/
	private java.lang.Long fkPersonalReportId;

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
	 *方法: 获得creditMob
	 *@return: java.lang.String  creditMob
	 */
	public java.lang.String getCreditMob(){
		return this.creditMob;
	}

	/**
	 *方法: 设置creditMob
	 *@param: java.lang.String  creditMob
	 */
	public void setCreditMob(java.lang.String creditMob){
		this.creditMob = creditMob;
	}

	/**
	 *方法: 获得loanMob
	 *@return: java.lang.String  loanMob
	 */
	public java.lang.String getLoanMob(){
		return this.loanMob;
	}

	/**
	 *方法: 设置loanMob
	 *@param: java.lang.String  loanMob
	 */
	public void setLoanMob(java.lang.String loanMob){
		this.loanMob = loanMob;
	}

	/**
	 *方法: 获得creditOrgCountsM3
	 *@return: java.lang.String  creditOrgCountsM3
	 */
	public java.lang.String getCreditOrgCountsM3(){
		return this.creditOrgCountsM3;
	}

	/**
	 *方法: 设置creditOrgCountsM3
	 *@param: java.lang.String  creditOrgCountsM3
	 */
	public void setCreditOrgCountsM3(java.lang.String creditOrgCountsM3){
		this.creditOrgCountsM3 = creditOrgCountsM3;
	}

	/**
	 *方法: 获得creditLimitTotalM3
	 *@return: java.lang.String  creditLimitTotalM3
	 */
	public java.lang.String getCreditLimitTotalM3(){
		return this.creditLimitTotalM3;
	}

	/**
	 *方法: 设置creditLimitTotalM3
	 *@param: java.lang.String  creditLimitTotalM3
	 */
	public void setCreditLimitTotalM3(java.lang.String creditLimitTotalM3){
		this.creditLimitTotalM3 = creditLimitTotalM3;
	}

	/**
	 *方法: 获得loanCountsM3
	 *@return: java.lang.String  loanCountsM3
	 */
	public java.lang.String getLoanCountsM3(){
		return this.loanCountsM3;
	}

	/**
	 *方法: 设置loanCountsM3
	 *@param: java.lang.String  loanCountsM3
	 */
	public void setLoanCountsM3(java.lang.String loanCountsM3){
		this.loanCountsM3 = loanCountsM3;
	}

	/**
	 *方法: 获得loanAmtsM3
	 *@return: java.lang.String  loanAmtsM3
	 */
	public java.lang.String getLoanAmtsM3(){
		return this.loanAmtsM3;
	}

	/**
	 *方法: 设置loanAmtsM3
	 *@param: java.lang.String  loanAmtsM3
	 */
	public void setLoanAmtsM3(java.lang.String loanAmtsM3){
		this.loanAmtsM3 = loanAmtsM3;
	}

	/**
	 *方法: 获得loanQueriesM3
	 *@return: java.lang.String  loanQueriesM3
	 */
	public java.lang.String getLoanQueriesM3(){
		return this.loanQueriesM3;
	}

	/**
	 *方法: 设置loanQueriesM3
	 *@param: java.lang.String  loanQueriesM3
	 */
	public void setLoanQueriesM3(java.lang.String loanQueriesM3){
		this.loanQueriesM3 = loanQueriesM3;
	}

	/**
	 *方法: 获得selfQueriesM3
	 *@return: java.lang.String  selfQueriesM3
	 */
	public java.lang.String getSelfQueriesM3(){
		return this.selfQueriesM3;
	}

	/**
	 *方法: 设置selfQueriesM3
	 *@param: java.lang.String  selfQueriesM3
	 */
	public void setSelfQueriesM3(java.lang.String selfQueriesM3){
		this.selfQueriesM3 = selfQueriesM3;
	}

	/**
	 *方法: 获得guarantees
	 *@return: java.lang.String  guarantees
	 */
	public java.lang.String getGuarantees(){
		return this.guarantees;
	}

	/**
	 *方法: 设置guarantees
	 *@param: java.lang.String  guarantees
	 */
	public void setGuarantees(java.lang.String guarantees){
		this.guarantees = guarantees;
	}

	/**
	 *方法: 获得guaranteeAmts
	 *@return: java.lang.String  guaranteeAmts
	 */
	public java.lang.String getGuaranteeAmts(){
		return this.guaranteeAmts;
	}

	/**
	 *方法: 设置guaranteeAmts
	 *@param: java.lang.String  guaranteeAmts
	 */
	public void setGuaranteeAmts(java.lang.String guaranteeAmts){
		this.guaranteeAmts = guaranteeAmts;
	}

	/**
	 *方法: 获得month6TaxAmts
	 *@return: java.lang.String  month6TaxAmts
	 */
	public java.lang.String getMonth6TaxAmts(){
		return this.month6TaxAmts;
	}

	/**
	 *方法: 设置month6TaxAmts
	 *@param: java.lang.String  month6TaxAmts
	 */
	public void setMonth6TaxAmts(java.lang.String month6TaxAmts){
		this.month6TaxAmts = month6TaxAmts;
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
	 *方法: 获得fkPersonalReportId
	 *@return: java.lang.Long  fkPersonalReportId
	 */
	public java.lang.Long getFkPersonalReportId(){
		return this.fkPersonalReportId;
	}

	/**
	 *方法: 设置fkPersonalReportId
	 *@param: java.lang.Long  fkPersonalReportId
	 */
	public void setFkPersonalReportId(java.lang.Long fkPersonalReportId){
		this.fkPersonalReportId = fkPersonalReportId;
	}

}