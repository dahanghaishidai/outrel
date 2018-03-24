package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcloanrecords.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:致诚借款记录历史表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 13:40:21
 */
public class ExtWlZcLoanRecordsDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private Long id;

	/**主表主键*/
	private String keyId;

	/**机构代号*/
	private String orgName;

	/**借款人姓名*/
	private String name;

	/**借款人身份证号*/
	private String certNo;

	/**借款时间*/
	private String loanDate;

	/**期数*/
	private String periods;

	/**借款金额*/
	private String loanAmount;

	/**历史逾期M3+次数*/
	private String overdueM3;

	/**历史逾期M6+次数*/
	private String overdueM6;

	/**还款状态码*/
	private String loanStatusCode;

	/**逾期情况*/
	private String overdueStatus;

	/**历史逾期总次数*/
	private String overdueTotal;

	/**逾期金额*/
	private String overdueAmount;

	/**审批结果码*/
	private String approvalStatusCode;

	/**借款类型码*/
	private String loanTypeCode;

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
	 *方法: 获得keyId
	 *@return: java.lang.String  keyId
	 */
	public String getKeyId(){
		return this.keyId;
	}

	/**
	 *方法: 设置keyId
	 *@param: java.lang.String  keyId
	 */
	public void setKeyId(String keyId){
		this.keyId = keyId;
	}

	/**
	 *方法: 获得orgName
	 *@return: java.lang.String  orgName
	 */
	public String getOrgName(){
		return this.orgName;
	}

	/**
	 *方法: 设置orgName
	 *@param: java.lang.String  orgName
	 */
	public void setOrgName(String orgName){
		this.orgName = orgName;
	}

	/**
	 *方法: 获得name
	 *@return: java.lang.String  name
	 */
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置name
	 *@param: java.lang.String  name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 *方法: 获得certNo
	 *@return: java.lang.String  certNo
	 */
	public String getCertNo(){
		return this.certNo;
	}

	/**
	 *方法: 设置certNo
	 *@param: java.lang.String  certNo
	 */
	public void setCertNo(String certNo){
		this.certNo = certNo;
	}

	/**
	 *方法: 获得loanDate
	 *@return: java.lang.String  loanDate
	 */
	public String getLoanDate(){
		return this.loanDate;
	}

	/**
	 *方法: 设置loanDate
	 *@param: java.lang.String  loanDate
	 */
	public void setLoanDate(String loanDate){
		this.loanDate = loanDate;
	}

	/**
	 *方法: 获得periods
	 *@return: java.lang.String  periods
	 */
	public String getPeriods(){
		return this.periods;
	}

	/**
	 *方法: 设置periods
	 *@param: java.lang.String  periods
	 */
	public void setPeriods(String periods){
		this.periods = periods;
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
	 *方法: 获得overdueM3
	 *@return: java.lang.String  overdueM3
	 */
	public String getOverdueM3(){
		return this.overdueM3;
	}

	/**
	 *方法: 设置overdueM3
	 *@param: java.lang.String  overdueM3
	 */
	public void setOverdueM3(String overdueM3){
		this.overdueM3 = overdueM3;
	}

	/**
	 *方法: 获得overdueM6
	 *@return: java.lang.String  overdueM6
	 */
	public String getOverdueM6(){
		return this.overdueM6;
	}

	/**
	 *方法: 设置overdueM6
	 *@param: java.lang.String  overdueM6
	 */
	public void setOverdueM6(String overdueM6){
		this.overdueM6 = overdueM6;
	}

	/**
	 *方法: 获得loanStatusCode
	 *@return: java.lang.String  loanStatusCode
	 */
	public String getLoanStatusCode(){
		return this.loanStatusCode;
	}

	/**
	 *方法: 设置loanStatusCode
	 *@param: java.lang.String  loanStatusCode
	 */
	public void setLoanStatusCode(String loanStatusCode){
		this.loanStatusCode = loanStatusCode;
	}

	/**
	 *方法: 获得overdueStatus
	 *@return: java.lang.String  overdueStatus
	 */
	public String getOverdueStatus(){
		return this.overdueStatus;
	}

	/**
	 *方法: 设置overdueStatus
	 *@param: java.lang.String  overdueStatus
	 */
	public void setOverdueStatus(String overdueStatus){
		this.overdueStatus = overdueStatus;
	}

	/**
	 *方法: 获得overdueTotal
	 *@return: java.lang.String  overdueTotal
	 */
	public String getOverdueTotal(){
		return this.overdueTotal;
	}

	/**
	 *方法: 设置overdueTotal
	 *@param: java.lang.String  overdueTotal
	 */
	public void setOverdueTotal(String overdueTotal){
		this.overdueTotal = overdueTotal;
	}

	/**
	 *方法: 获得overdueAmount
	 *@return: java.lang.String  overdueAmount
	 */
	public String getOverdueAmount(){
		return this.overdueAmount;
	}

	/**
	 *方法: 设置overdueAmount
	 *@param: java.lang.String  overdueAmount
	 */
	public void setOverdueAmount(String overdueAmount){
		this.overdueAmount = overdueAmount;
	}

	/**
	 *方法: 获得approvalStatusCode
	 *@return: java.lang.String  approvalStatusCode
	 */
	public String getApprovalStatusCode(){
		return this.approvalStatusCode;
	}

	/**
	 *方法: 设置approvalStatusCode
	 *@param: java.lang.String  approvalStatusCode
	 */
	public void setApprovalStatusCode(String approvalStatusCode){
		this.approvalStatusCode = approvalStatusCode;
	}

	/**
	 *方法: 获得loanTypeCode
	 *@return: java.lang.String  loanTypeCode
	 */
	public String getLoanTypeCode(){
		return this.loanTypeCode;
	}

	/**
	 *方法: 设置loanTypeCode
	 *@param: java.lang.String  loanTypeCode
	 */
	public void setLoanTypeCode(String loanTypeCode){
		this.loanTypeCode = loanTypeCode;
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