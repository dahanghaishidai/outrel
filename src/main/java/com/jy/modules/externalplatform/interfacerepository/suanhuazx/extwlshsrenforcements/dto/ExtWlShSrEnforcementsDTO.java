package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrenforcements.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行结构化版(强制执行记录表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:54:07
 */
public class ExtWlShSrEnforcementsDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**征信主表ID*/
	private Long fkReportId;

	/**信息详情*/
	private String original;

	/**执行法院*/
	private String court;

	/**案号*/
	private String docketNo;

	/**执行案由*/
	private String docketCause;

	/**结案方式*/
	private String filingWay;

	/**立案时间*/
	private String filingTime;

	/**案件状态*/
	private String docketStatus;

	/**申请执行标的*/
	private String applyEnforceSubject;

	/**已执行标的*/
	private String executedEnforceSubject;

	/**申请执行标的金额*/
	private String applyEnforceAmount;

	/**已执行标的金额*/
	private String executedEnforceAmount;

	/**结案时间*/
	private String closedTime;

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
	 *方法: 获得docketStatus
	 *@return: java.lang.String  docketStatus
	 */
	public String getDocketStatus(){
		return this.docketStatus;
	}

	/**
	 *方法: 设置docketStatus
	 *@param: java.lang.String  docketStatus
	 */
	public void setDocketStatus(String docketStatus){
		this.docketStatus = docketStatus;
	}

	/**
	 *方法: 获得applyEnforceSubject
	 *@return: java.lang.String  applyEnforceSubject
	 */
	public String getApplyEnforceSubject(){
		return this.applyEnforceSubject;
	}

	/**
	 *方法: 设置applyEnforceSubject
	 *@param: java.lang.String  applyEnforceSubject
	 */
	public void setApplyEnforceSubject(String applyEnforceSubject){
		this.applyEnforceSubject = applyEnforceSubject;
	}

	/**
	 *方法: 获得executedEnforceSubject
	 *@return: java.lang.String  executedEnforceSubject
	 */
	public String getExecutedEnforceSubject(){
		return this.executedEnforceSubject;
	}

	/**
	 *方法: 设置executedEnforceSubject
	 *@param: java.lang.String  executedEnforceSubject
	 */
	public void setExecutedEnforceSubject(String executedEnforceSubject){
		this.executedEnforceSubject = executedEnforceSubject;
	}

	/**
	 *方法: 获得applyEnforceAmount
	 *@return: java.lang.String  applyEnforceAmount
	 */
	public String getApplyEnforceAmount(){
		return this.applyEnforceAmount;
	}

	/**
	 *方法: 设置applyEnforceAmount
	 *@param: java.lang.String  applyEnforceAmount
	 */
	public void setApplyEnforceAmount(String applyEnforceAmount){
		this.applyEnforceAmount = applyEnforceAmount;
	}

	/**
	 *方法: 获得executedEnforceAmount
	 *@return: java.lang.String  executedEnforceAmount
	 */
	public String getExecutedEnforceAmount(){
		return this.executedEnforceAmount;
	}

	/**
	 *方法: 设置executedEnforceAmount
	 *@param: java.lang.String  executedEnforceAmount
	 */
	public void setExecutedEnforceAmount(String executedEnforceAmount){
		this.executedEnforceAmount = executedEnforceAmount;
	}

	/**
	 *方法: 获得closedTime
	 *@return: java.lang.String  closedTime
	 */
	public String getClosedTime(){
		return this.closedTime;
	}

	/**
	 *方法: 设置closedTime
	 *@param: java.lang.String  closedTime
	 */
	public void setClosedTime(String closedTime){
		this.closedTime = closedTime;
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