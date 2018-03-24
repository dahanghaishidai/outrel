package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcredits.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行结构化版(信用卡表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:53:50
 */
public class ExtWlShSrCreditsDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**征信主表ID*/
	private Long fkReportId;

	/**信息详情*/
	private String original;

	/**信用状态[逾期、透支超过60天、未逾期/未透支超过60天]*/
	private String creditStatus;

	/**卡类型[贷记卡、准贷记卡]  */
	private String cardType;

	/**账户状态[未激活、正常、销户、呆账、核销]*/
	private String accountStatus;

	/**发卡行*/
	private String issueBank;

	/**发卡时间*/
	private String issueTime;

	/**账户类型[人名币账户、美元账户]*/
	private String accountType;

	/**统计/销户时间*/
	private String recordOrCancellation;

	/**信用额度*/
	private String creditAmount;

	/**已使用额度*/
	private String creditUsed;

	/**逾期/透支金额*/
	private String overAmount;

	/**最近5年内处于逾期状态/透支超过60天的月数*/
	private String overMonth;

	/**最近5年内处于逾期状态/透支超过90天的月数*/
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
	 *方法: 获得cardType
	 *@return: java.lang.String  cardType
	 */
	public String getCardType(){
		return this.cardType;
	}

	/**
	 *方法: 设置cardType
	 *@param: java.lang.String  cardType
	 */
	public void setCardType(String cardType){
		this.cardType = cardType;
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
	 *方法: 获得issueBank
	 *@return: java.lang.String  issueBank
	 */
	public String getIssueBank(){
		return this.issueBank;
	}

	/**
	 *方法: 设置issueBank
	 *@param: java.lang.String  issueBank
	 */
	public void setIssueBank(String issueBank){
		this.issueBank = issueBank;
	}

	/**
	 *方法: 获得issueTime
	 *@return: java.lang.String  issueTime
	 */
	public String getIssueTime(){
		return this.issueTime;
	}

	/**
	 *方法: 设置issueTime
	 *@param: java.lang.String  issueTime
	 */
	public void setIssueTime(String issueTime){
		this.issueTime = issueTime;
	}

	/**
	 *方法: 获得accountType
	 *@return: java.lang.String  accountType
	 */
	public String getAccountType(){
		return this.accountType;
	}

	/**
	 *方法: 设置accountType
	 *@param: java.lang.String  accountType
	 */
	public void setAccountType(String accountType){
		this.accountType = accountType;
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
	 *方法: 获得creditAmount
	 *@return: java.lang.String  creditAmount
	 */
	public String getCreditAmount(){
		return this.creditAmount;
	}

	/**
	 *方法: 设置creditAmount
	 *@param: java.lang.String  creditAmount
	 */
	public void setCreditAmount(String creditAmount){
		this.creditAmount = creditAmount;
	}

	/**
	 *方法: 获得creditUsed
	 *@return: java.lang.String  creditUsed
	 */
	public String getCreditUsed(){
		return this.creditUsed;
	}

	/**
	 *方法: 设置creditUsed
	 *@param: java.lang.String  creditUsed
	 */
	public void setCreditUsed(String creditUsed){
		this.creditUsed = creditUsed;
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