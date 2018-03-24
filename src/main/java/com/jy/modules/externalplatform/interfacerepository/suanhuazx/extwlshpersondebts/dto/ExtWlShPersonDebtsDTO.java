package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersondebts.dto;

import com.jy.platform.core.common.BaseDTO;

import java.util.List;

/**
 *@Description:人行征信负债情况
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:48:03
 */
public class ExtWlShPersonDebtsDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**单卡最大信用额度*/
	private String creditLimitMax;

	/**总信用额度*/
	private String creditLimitTotal;

	/**卡数/机构数*/
	private String creditOrgCounts;

	/**当前已使用信用额度合计*/
	private String creditLimitUsed;

	/**当前总信用额度使用率*/
	private String creditLimitUseRate;

	/**所有贷款总余额 （含已结清）*/
	private String loanAmts;

	/**未结清贷款总额 */
	private String loanAmtsNoSettle;

	/**房贷总余额*/
	private String loanBalancesMortgage;

	/**车贷总余额*/
	private String loanBalancesCar;

	/**经营贷总余额*/
	private String loanBalancesBiz;

	/**其他贷总余额*/
	private String loanBalancesOther;

	/**所有贷款总笔数（含已结清）*/
	private String loanCounts;

	/**未结清贷款总笔数*/
	private String loanBalanceCounts;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**人行征信报告主键*/
	private Long fkPersonalReportId;

	/**贷款总余额*/
	private String loanBalances;

	/**月还贷款总额*/
	private String loanBalancesMonth;

	/**月还房贷金额*/
	private String loanBalancesMortgageMonth;

	/**月还车贷金额*/
	private String loanBalancesCarMonth;

	/**月还经营贷金额*/
	private String loanBalancesBizMonth;

	/**月还其他贷总余额*/
	private String loanBalancesOtherMonth;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**数据有效性*/
	private String validateState;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long updateBy;

	@SuppressWarnings("rawtypes")
	private java.util.List loanBalanceInfos;

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
	 *方法: 获得creditLimitMax
	 *@return: java.lang.String  creditLimitMax
	 */
	public String getCreditLimitMax(){
		return this.creditLimitMax;
	}

	/**
	 *方法: 设置creditLimitMax
	 *@param: java.lang.String  creditLimitMax
	 */
	public void setCreditLimitMax(String creditLimitMax){
		this.creditLimitMax = creditLimitMax;
	}

	/**
	 *方法: 获得creditLimitTotal
	 *@return: java.lang.String  creditLimitTotal
	 */
	public String getCreditLimitTotal(){
		return this.creditLimitTotal;
	}

	/**
	 *方法: 设置creditLimitTotal
	 *@param: java.lang.String  creditLimitTotal
	 */
	public void setCreditLimitTotal(String creditLimitTotal){
		this.creditLimitTotal = creditLimitTotal;
	}

	/**
	 *方法: 获得creditOrgCounts
	 *@return: java.lang.String  creditOrgCounts
	 */
	public String getCreditOrgCounts(){
		return this.creditOrgCounts;
	}

	/**
	 *方法: 设置creditOrgCounts
	 *@param: java.lang.String  creditOrgCounts
	 */
	public void setCreditOrgCounts(String creditOrgCounts){
		this.creditOrgCounts = creditOrgCounts;
	}

	/**
	 *方法: 获得creditLimitUsed
	 *@return: java.lang.String  creditLimitUsed
	 */
	public String getCreditLimitUsed(){
		return this.creditLimitUsed;
	}

	/**
	 *方法: 设置creditLimitUsed
	 *@param: java.lang.String  creditLimitUsed
	 */
	public void setCreditLimitUsed(String creditLimitUsed){
		this.creditLimitUsed = creditLimitUsed;
	}

	/**
	 *方法: 获得creditLimitUseRate
	 *@return: java.lang.String  creditLimitUseRate
	 */
	public String getCreditLimitUseRate(){
		return this.creditLimitUseRate;
	}

	/**
	 *方法: 设置creditLimitUseRate
	 *@param: java.lang.String  creditLimitUseRate
	 */
	public void setCreditLimitUseRate(String creditLimitUseRate){
		this.creditLimitUseRate = creditLimitUseRate;
	}

	/**
	 *方法: 获得loanAmts
	 *@return: java.lang.String  loanAmts
	 */
	public String getLoanAmts(){
		return this.loanAmts;
	}

	/**
	 *方法: 设置loanAmts
	 *@param: java.lang.String  loanAmts
	 */
	public void setLoanAmts(String loanAmts){
		this.loanAmts = loanAmts;
	}

	/**
	 *方法: 获得loanAmtsNoSettle
	 *@return: java.lang.String  loanAmtsNoSettle
	 */
	public String getLoanAmtsNoSettle(){
		return this.loanAmtsNoSettle;
	}

	/**
	 *方法: 设置loanAmtsNoSettle
	 *@param: java.lang.String  loanAmtsNoSettle
	 */
	public void setLoanAmtsNoSettle(String loanAmtsNoSettle){
		this.loanAmtsNoSettle = loanAmtsNoSettle;
	}

	/**
	 *方法: 获得loanBalancesMortgage
	 *@return: java.lang.String  loanBalancesMortgage
	 */
	public String getLoanBalancesMortgage(){
		return this.loanBalancesMortgage;
	}

	/**
	 *方法: 设置loanBalancesMortgage
	 *@param: java.lang.String  loanBalancesMortgage
	 */
	public void setLoanBalancesMortgage(String loanBalancesMortgage){
		this.loanBalancesMortgage = loanBalancesMortgage;
	}

	/**
	 *方法: 获得loanBalancesCar
	 *@return: java.lang.String  loanBalancesCar
	 */
	public String getLoanBalancesCar(){
		return this.loanBalancesCar;
	}

	/**
	 *方法: 设置loanBalancesCar
	 *@param: java.lang.String  loanBalancesCar
	 */
	public void setLoanBalancesCar(String loanBalancesCar){
		this.loanBalancesCar = loanBalancesCar;
	}

	/**
	 *方法: 获得loanBalancesBiz
	 *@return: java.lang.String  loanBalancesBiz
	 */
	public String getLoanBalancesBiz(){
		return this.loanBalancesBiz;
	}

	/**
	 *方法: 设置loanBalancesBiz
	 *@param: java.lang.String  loanBalancesBiz
	 */
	public void setLoanBalancesBiz(String loanBalancesBiz){
		this.loanBalancesBiz = loanBalancesBiz;
	}

	/**
	 *方法: 获得loanBalancesOther
	 *@return: java.lang.String  loanBalancesOther
	 */
	public String getLoanBalancesOther(){
		return this.loanBalancesOther;
	}

	/**
	 *方法: 设置loanBalancesOther
	 *@param: java.lang.String  loanBalancesOther
	 */
	public void setLoanBalancesOther(String loanBalancesOther){
		this.loanBalancesOther = loanBalancesOther;
	}

	/**
	 *方法: 获得loanCounts
	 *@return: java.lang.String  loanCounts
	 */
	public String getLoanCounts(){
		return this.loanCounts;
	}

	/**
	 *方法: 设置loanCounts
	 *@param: java.lang.String  loanCounts
	 */
	public void setLoanCounts(String loanCounts){
		this.loanCounts = loanCounts;
	}

	/**
	 *方法: 获得loanBalanceCounts
	 *@return: java.lang.String  loanBalanceCounts
	 */
	public String getLoanBalanceCounts(){
		return this.loanBalanceCounts;
	}

	/**
	 *方法: 设置loanBalanceCounts
	 *@param: java.lang.String  loanBalanceCounts
	 */
	public void setLoanBalanceCounts(String loanBalanceCounts){
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
	 *方法: 获得fkPersonalReportId
	 *@return: java.lang.Long  fkPersonalReportId
	 */
	public Long getFkPersonalReportId(){
		return this.fkPersonalReportId;
	}

	/**
	 *方法: 设置fkPersonalReportId
	 *@param: java.lang.Long  fkPersonalReportId
	 */
	public void setFkPersonalReportId(Long fkPersonalReportId){
		this.fkPersonalReportId = fkPersonalReportId;
	}

	/**
	 *方法: 获得loanBalances
	 *@return: java.lang.String  loanBalances
	 */
	public String getLoanBalances(){
		return this.loanBalances;
	}

	/**
	 *方法: 设置loanBalances
	 *@param: java.lang.String  loanBalances
	 */
	public void setLoanBalances(String loanBalances){
		this.loanBalances = loanBalances;
	}

	/**
	 *方法: 获得loanBalancesMonth
	 *@return: java.lang.String  loanBalancesMonth
	 */
	public String getLoanBalancesMonth(){
		return this.loanBalancesMonth;
	}

	/**
	 *方法: 设置loanBalancesMonth
	 *@param: java.lang.String  loanBalancesMonth
	 */
	public void setLoanBalancesMonth(String loanBalancesMonth){
		this.loanBalancesMonth = loanBalancesMonth;
	}

	/**
	 *方法: 获得loanBalancesMortgageMonth
	 *@return: java.lang.String  loanBalancesMortgageMonth
	 */
	public String getLoanBalancesMortgageMonth(){
		return this.loanBalancesMortgageMonth;
	}

	/**
	 *方法: 设置loanBalancesMortgageMonth
	 *@param: java.lang.String  loanBalancesMortgageMonth
	 */
	public void setLoanBalancesMortgageMonth(String loanBalancesMortgageMonth){
		this.loanBalancesMortgageMonth = loanBalancesMortgageMonth;
	}

	/**
	 *方法: 获得loanBalancesCarMonth
	 *@return: java.lang.String  loanBalancesCarMonth
	 */
	public String getLoanBalancesCarMonth(){
		return this.loanBalancesCarMonth;
	}

	/**
	 *方法: 设置loanBalancesCarMonth
	 *@param: java.lang.String  loanBalancesCarMonth
	 */
	public void setLoanBalancesCarMonth(String loanBalancesCarMonth){
		this.loanBalancesCarMonth = loanBalancesCarMonth;
	}

	/**
	 *方法: 获得loanBalancesBizMonth
	 *@return: java.lang.String  loanBalancesBizMonth
	 */
	public String getLoanBalancesBizMonth(){
		return this.loanBalancesBizMonth;
	}

	/**
	 *方法: 设置loanBalancesBizMonth
	 *@param: java.lang.String  loanBalancesBizMonth
	 */
	public void setLoanBalancesBizMonth(String loanBalancesBizMonth){
		this.loanBalancesBizMonth = loanBalancesBizMonth;
	}

	/**
	 *方法: 获得loanBalancesOtherMonth
	 *@return: java.lang.String  loanBalancesOtherMonth
	 */
	public String getLoanBalancesOtherMonth(){
		return this.loanBalancesOtherMonth;
	}

	/**
	 *方法: 设置loanBalancesOtherMonth
	 *@param: java.lang.String  loanBalancesOtherMonth
	 */
	public void setLoanBalancesOtherMonth(String loanBalancesOtherMonth){
		this.loanBalancesOtherMonth = loanBalancesOtherMonth;
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

	public List getLoanBalanceInfos() {
		return loanBalanceInfos;
	}

	public void setLoanBalanceInfos(List loanBalanceInfos) {
		this.loanBalanceInfos = loanBalanceInfos;
	}
}