package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordjudgment.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行原版(公共记录_民事判决记录表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:49:39
 */
public class ExtWlShPrecordJudgmentDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**征信主表ID*/
	private Long fkReportId;

	/**立案法院*/
	private String court;

	/**案号*/
	private String docketNo;

	/**执行案由*/
	private String docketCause;

	/**结案方式*/
	private String filingWay;

	/**立案时间*/
	private String filingTime;

	/**判决/调解结果*/
	private String filingResult;

	/**判决/调解生效时间*/
	private String filingEffective;

	/**诉讼标的*/
	private String litigationSubject;

	/**诉讼标的金额*/
	private String litigationAmount;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**VALIDATE_STATE*/
	private String validateState;

	/**CREATE_BY*/
	private Long createBy;

	/**UPDATE_BY*/
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
	 *方法: 获得court
	 *@return: java.lang.String  court
	 */
	public String getCourt(){
		return this.court;
	}

	/**
	 *方法: 设置court
	 *@param: java.lang.String  court
	 */
	public void setCourt(String court){
		this.court = court;
	}

	/**
	 *方法: 获得docketNo
	 *@return: java.lang.String  docketNo
	 */
	public String getDocketNo(){
		return this.docketNo;
	}

	/**
	 *方法: 设置docketNo
	 *@param: java.lang.String  docketNo
	 */
	public void setDocketNo(String docketNo){
		this.docketNo = docketNo;
	}

	/**
	 *方法: 获得docketCause
	 *@return: java.lang.String  docketCause
	 */
	public String getDocketCause(){
		return this.docketCause;
	}

	/**
	 *方法: 设置docketCause
	 *@param: java.lang.String  docketCause
	 */
	public void setDocketCause(String docketCause){
		this.docketCause = docketCause;
	}

	/**
	 *方法: 获得filingWay
	 *@return: java.lang.String  filingWay
	 */
	public String getFilingWay(){
		return this.filingWay;
	}

	/**
	 *方法: 设置filingWay
	 *@param: java.lang.String  filingWay
	 */
	public void setFilingWay(String filingWay){
		this.filingWay = filingWay;
	}

	/**
	 *方法: 获得filingTime
	 *@return: java.lang.String  filingTime
	 */
	public String getFilingTime(){
		return this.filingTime;
	}

	/**
	 *方法: 设置filingTime
	 *@param: java.lang.String  filingTime
	 */
	public void setFilingTime(String filingTime){
		this.filingTime = filingTime;
	}

	/**
	 *方法: 获得filingResult
	 *@return: java.lang.String  filingResult
	 */
	public String getFilingResult(){
		return this.filingResult;
	}

	/**
	 *方法: 设置filingResult
	 *@param: java.lang.String  filingResult
	 */
	public void setFilingResult(String filingResult){
		this.filingResult = filingResult;
	}

	/**
	 *方法: 获得filingEffective
	 *@return: java.lang.String  filingEffective
	 */
	public String getFilingEffective(){
		return this.filingEffective;
	}

	/**
	 *方法: 设置filingEffective
	 *@param: java.lang.String  filingEffective
	 */
	public void setFilingEffective(String filingEffective){
		this.filingEffective = filingEffective;
	}

	/**
	 *方法: 获得litigationSubject
	 *@return: java.lang.String  litigationSubject
	 */
	public String getLitigationSubject(){
		return this.litigationSubject;
	}

	/**
	 *方法: 设置litigationSubject
	 *@param: java.lang.String  litigationSubject
	 */
	public void setLitigationSubject(String litigationSubject){
		this.litigationSubject = litigationSubject;
	}

	/**
	 *方法: 获得litigationAmount
	 *@return: java.lang.String  litigationAmount
	 */
	public String getLitigationAmount(){
		return this.litigationAmount;
	}

	/**
	 *方法: 设置litigationAmount
	 *@param: java.lang.String  litigationAmount
	 */
	public void setLitigationAmount(String litigationAmount){
		this.litigationAmount = litigationAmount;
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