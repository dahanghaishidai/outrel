package com.jy.modules.externalplatform.interfacerepository.suanhua.extshperdebtsstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:人行征信负债情况
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-12 14:55:48
 */
public class ExtShPerDebtsStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**单卡最大信用额度*/
	private java.lang.String creditLimitMax;

	/**总信用额度*/
	private java.lang.String creditLimitTotal;

	/**卡数/机构数*/
	private java.lang.String creditOrgCounts;

	/**当前已使用信用额度合计*/
	private java.lang.String creditLimitUsed;

	/**当前总信用额度使用率*/
	private java.lang.String creditLimitUseRate;

	/**所有贷款总余额 （含已结清）*/
	private java.lang.String loanAmts;

	/**未结清贷款总额 */
	private java.lang.String loanAmtsNoSettle;

	/**房贷总余额*/
	private java.lang.String loanBalancesMortgage;

	/**车贷总余额*/
	private java.lang.String loanBalancesCar;

	/**经营贷总余额*/
	private java.lang.String loanBalancesBiz;

	/**其他贷总余额*/
	private java.lang.String loanBalancesOther;

	/**所有贷款总笔数（含已结清）*/
	private java.lang.String loanCounts;

	/**未结清贷款总笔数*/
	private java.lang.String loanBalanceCounts;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**MODIFY_TIME*/
	private java.sql.Timestamp modifyTime;

	/**人行征信报告主键*/
	private java.lang.Long fkPersonalReportId;

	/**贷款总余额*/
	private java.lang.String loanBalances;

	/**月还贷款总额*/
	private java.lang.String loanBalancesMonth;

	/**月还房贷金额*/
	private java.lang.String loanBalancesMortgageMonth;

	/**月还车贷金额*/
	private java.lang.String loanBalancesCarMonth;

	/**月还经营贷金额*/
	private java.lang.String loanBalancesBizMonth;

	/**月还其他贷总余额*/
	private java.lang.String loanBalancesOtherMonth;

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
	 *方法: 获得creditLimitMax
	 *@return: java.lang.String  creditLimitMax
	 */
	public java.lang.String getCreditLimitMax(){
		return this.creditLimitMax;
	}

	/**
	 *方法: 设置creditLimitMax
	 *@param: java.lang.String  creditLimitMax
	 */
	public void setCreditLimitMax(java.lang.String creditLimitMax){
		this.creditLimitMax = creditLimitMax;
	}

	/**
	 *方法: 获得creditLimitTotal
	 *@return: java.lang.String  creditLimitTotal
	 */
	public java.lang.String getCreditLimitTotal(){
		return this.creditLimitTotal;
	}

	/**
	 *方法: 设置creditLimitTotal
	 *@param: java.lang.String  creditLimitTotal
	 */
	public void setCreditLimitTotal(java.lang.String creditLimitTotal){
		this.creditLimitTotal = creditLimitTotal;
	}

	/**
	 *方法: 获得creditOrgCounts
	 *@return: java.lang.String  creditOrgCounts
	 */
	public java.lang.String getCreditOrgCounts(){
		return this.creditOrgCounts;
	}

	/**
	 *方法: 设置creditOrgCounts
	 *@param: java.lang.String  creditOrgCounts
	 */
	public void setCreditOrgCounts(java.lang.String creditOrgCounts){
		this.creditOrgCounts = creditOrgCounts;
	}

	/**
	 *方法: 获得creditLimitUsed
	 *@return: java.lang.String  creditLimitUsed
	 */
	public java.lang.String getCreditLimitUsed(){
		return this.creditLimitUsed;
	}

	/**
	 *方法: 设置creditLimitUsed
	 *@param: java.lang.String  creditLimitUsed
	 */
	public void setCreditLimitUsed(java.lang.String creditLimitUsed){
		this.creditLimitUsed = creditLimitUsed;
	}

	/**
	 *方法: 获得creditLimitUseRate
	 *@return: java.lang.String  creditLimitUseRate
	 */
	public java.lang.String getCreditLimitUseRate(){
		return this.creditLimitUseRate;
	}

	/**
	 *方法: 设置creditLimitUseRate
	 *@param: java.lang.String  creditLimitUseRate
	 */
	public void setCreditLimitUseRate(java.lang.String creditLimitUseRate){
		this.creditLimitUseRate = creditLimitUseRate;
	}

	/**
	 *方法: 获得loanAmts
	 *@return: java.lang.String  loanAmts
	 */
	public java.lang.String getLoanAmts(){
		return this.loanAmts;
	}

	/**
	 *方法: 设置loanAmts
	 *@param: java.lang.String  loanAmts
	 */
	public void setLoanAmts(java.lang.String loanAmts){
		this.loanAmts = loanAmts;
	}

	/**
	 *方法: 获得loanAmtsNoSettle
	 *@return: java.lang.String  loanAmtsNoSettle
	 */
	public java.lang.String getLoanAmtsNoSettle(){
		return this.loanAmtsNoSettle;
	}

	/**
	 *方法: 设置loanAmtsNoSettle
	 *@param: java.lang.String  loanAmtsNoSettle
	 */
	public void setLoanAmtsNoSettle(java.lang.String loanAmtsNoSettle){
		this.loanAmtsNoSettle = loanAmtsNoSettle;
	}

	/**
	 *方法: 获得loanBalancesMortgage
	 *@return: java.lang.String  loanBalancesMortgage
	 */
	public java.lang.String getLoanBalancesMortgage(){
		return this.loanBalancesMortgage;
	}

	/**
	 *方法: 设置loanBalancesMortgage
	 *@param: java.lang.String  loanBalancesMortgage
	 */
	public void setLoanBalancesMortgage(java.lang.String loanBalancesMortgage){
		this.loanBalancesMortgage = loanBalancesMortgage;
	}

	/**
	 *方法: 获得loanBalancesCar
	 *@return: java.lang.String  loanBalancesCar
	 */
	public java.lang.String getLoanBalancesCar(){
		return this.loanBalancesCar;
	}

	/**
	 *方法: 设置loanBalancesCar
	 *@param: java.lang.String  loanBalancesCar
	 */
	public void setLoanBalancesCar(java.lang.String loanBalancesCar){
		this.loanBalancesCar = loanBalancesCar;
	}

	/**
	 *方法: 获得loanBalancesBiz
	 *@return: java.lang.String  loanBalancesBiz
	 */
	public java.lang.String getLoanBalancesBiz(){
		return this.loanBalancesBiz;
	}

	/**
	 *方法: 设置loanBalancesBiz
	 *@param: java.lang.String  loanBalancesBiz
	 */
	public void setLoanBalancesBiz(java.lang.String loanBalancesBiz){
		this.loanBalancesBiz = loanBalancesBiz;
	}

	/**
	 *方法: 获得loanBalancesOther
	 *@return: java.lang.String  loanBalancesOther
	 */
	public java.lang.String getLoanBalancesOther(){
		return this.loanBalancesOther;
	}

	/**
	 *方法: 设置loanBalancesOther
	 *@param: java.lang.String  loanBalancesOther
	 */
	public void setLoanBalancesOther(java.lang.String loanBalancesOther){
		this.loanBalancesOther = loanBalancesOther;
	}

	/**
	 *方法: 获得loanCounts
	 *@return: java.lang.String  loanCounts
	 */
	public java.lang.String getLoanCounts(){
		return this.loanCounts;
	}

	/**
	 *方法: 设置loanCounts
	 *@param: java.lang.String  loanCounts
	 */
	public void setLoanCounts(java.lang.String loanCounts){
		this.loanCounts = loanCounts;
	}

	/**
	 *方法: 获得loanBalanceCounts
	 *@return: java.lang.String  loanBalanceCounts
	 */
	public java.lang.String getLoanBalanceCounts(){
		return this.loanBalanceCounts;
	}

	/**
	 *方法: 设置loanBalanceCounts
	 *@param: java.lang.String  loanBalanceCounts
	 */
	public void setLoanBalanceCounts(java.lang.String loanBalanceCounts){
		this.loanBalanceCounts = loanBalanceCounts;
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

	/**
	 *方法: 获得loanBalances
	 *@return: java.lang.String  loanBalances
	 */
	public java.lang.String getLoanBalances(){
		return this.loanBalances;
	}

	/**
	 *方法: 设置loanBalances
	 *@param: java.lang.String  loanBalances
	 */
	public void setLoanBalances(java.lang.String loanBalances){
		this.loanBalances = loanBalances;
	}

	/**
	 *方法: 获得loanBalancesMonth
	 *@return: java.lang.String  loanBalancesMonth
	 */
	public java.lang.String getLoanBalancesMonth(){
		return this.loanBalancesMonth;
	}

	/**
	 *方法: 设置loanBalancesMonth
	 *@param: java.lang.String  loanBalancesMonth
	 */
	public void setLoanBalancesMonth(java.lang.String loanBalancesMonth){
		this.loanBalancesMonth = loanBalancesMonth;
	}

	/**
	 *方法: 获得loanBalancesMortgageMonth
	 *@return: java.lang.String  loanBalancesMortgageMonth
	 */
	public java.lang.String getLoanBalancesMortgageMonth(){
		return this.loanBalancesMortgageMonth;
	}

	/**
	 *方法: 设置loanBalancesMortgageMonth
	 *@param: java.lang.String  loanBalancesMortgageMonth
	 */
	public void setLoanBalancesMortgageMonth(java.lang.String loanBalancesMortgageMonth){
		this.loanBalancesMortgageMonth = loanBalancesMortgageMonth;
	}

	/**
	 *方法: 获得loanBalancesCarMonth
	 *@return: java.lang.String  loanBalancesCarMonth
	 */
	public java.lang.String getLoanBalancesCarMonth(){
		return this.loanBalancesCarMonth;
	}

	/**
	 *方法: 设置loanBalancesCarMonth
	 *@param: java.lang.String  loanBalancesCarMonth
	 */
	public void setLoanBalancesCarMonth(java.lang.String loanBalancesCarMonth){
		this.loanBalancesCarMonth = loanBalancesCarMonth;
	}

	/**
	 *方法: 获得loanBalancesBizMonth
	 *@return: java.lang.String  loanBalancesBizMonth
	 */
	public java.lang.String getLoanBalancesBizMonth(){
		return this.loanBalancesBizMonth;
	}

	/**
	 *方法: 设置loanBalancesBizMonth
	 *@param: java.lang.String  loanBalancesBizMonth
	 */
	public void setLoanBalancesBizMonth(java.lang.String loanBalancesBizMonth){
		this.loanBalancesBizMonth = loanBalancesBizMonth;
	}

	/**
	 *方法: 获得loanBalancesOtherMonth
	 *@return: java.lang.String  loanBalancesOtherMonth
	 */
	public java.lang.String getLoanBalancesOtherMonth(){
		return this.loanBalancesOtherMonth;
	}

	/**
	 *方法: 设置loanBalancesOtherMonth
	 *@param: java.lang.String  loanBalancesOtherMonth
	 */
	public void setLoanBalancesOtherMonth(java.lang.String loanBalancesOtherMonth){
		this.loanBalancesOtherMonth = loanBalancesOtherMonth;
	}

}