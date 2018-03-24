package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditinvest.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话央行征信采集申请表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:45:18
 */
public class ExtWlShCreditInvestDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**客户姓名*/
	private String custName;

	/**手机号码*/
	private String cellPhoneNum;

	/**身份证号码*/
	private String idCardNum;

	/**接口调用是否成功(true-成功；false-失败)*/
	private String success;

	/**错误信息*/
	private String message;

	/**报告内容*/
	private String report;

	/**流程码说明*/
	private String content;

	/**流程码*/
	private String processCode;

	/**系统来源*/
	private String sysSource;

	/**咨询编号*/
	private Long fkConsultId;

	/**关联咨询编号(多个咨询编号之间以逗号分隔)*/
	private String linkConsultIds;

	/**状态(1-待调用；2-已完成；3-调用失败;4-终止状态)*/
	private String state;

	/**调用次数(STATE为3时累加)*/
	private Long invokeTimes;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**数据有效性（1：有效、0：无效）*/
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
	 *方法: 获得custName
	 *@return: java.lang.String  custName
	 */
	public String getCustName(){
		return this.custName;
	}

	/**
	 *方法: 设置custName
	 *@param: java.lang.String  custName
	 */
	public void setCustName(String custName){
		this.custName = custName;
	}

	/**
	 *方法: 获得cellPhoneNum
	 *@return: java.lang.String  cellPhoneNum
	 */
	public String getCellPhoneNum(){
		return this.cellPhoneNum;
	}

	/**
	 *方法: 设置cellPhoneNum
	 *@param: java.lang.String  cellPhoneNum
	 */
	public void setCellPhoneNum(String cellPhoneNum){
		this.cellPhoneNum = cellPhoneNum;
	}

	/**
	 *方法: 获得idCardNum
	 *@return: java.lang.String  idCardNum
	 */
	public String getIdCardNum(){
		return this.idCardNum;
	}

	/**
	 *方法: 设置idCardNum
	 *@param: java.lang.String  idCardNum
	 */
	public void setIdCardNum(String idCardNum){
		this.idCardNum = idCardNum;
	}

	/**
	 *方法: 获得success
	 *@return: java.lang.String  success
	 */
	public String getSuccess(){
		return this.success;
	}

	/**
	 *方法: 设置success
	 *@param: java.lang.String  success
	 */
	public void setSuccess(String success){
		this.success = success;
	}

	/**
	 *方法: 获得message
	 *@return: java.lang.String  message
	 */
	public String getMessage(){
		return this.message;
	}

	/**
	 *方法: 设置message
	 *@param: java.lang.String  message
	 */
	public void setMessage(String message){
		this.message = message;
	}

	/**
	 *方法: 获得report
	 *@return: String  report
	 */
	public String getReport(){
		return this.report;
	}

	/**
	 *方法: 设置report
	 *@param: String  report
	 */
	public void setReport(String report){
		this.report = report;
	}

	/**
	 *方法: 获得content
	 *@return: java.lang.String  content
	 */
	public String getContent(){
		return this.content;
	}

	/**
	 *方法: 设置content
	 *@param: java.lang.String  content
	 */
	public void setContent(String content){
		this.content = content;
	}

	/**
	 *方法: 获得processCode
	 *@return: java.lang.String  processCode
	 */
	public String getProcessCode(){
		return this.processCode;
	}

	/**
	 *方法: 设置processCode
	 *@param: java.lang.String  processCode
	 */
	public void setProcessCode(String processCode){
		this.processCode = processCode;
	}

	/**
	 *方法: 获得sysSource
	 *@return: java.lang.String  sysSource
	 */
	public String getSysSource(){
		return this.sysSource;
	}

	/**
	 *方法: 设置sysSource
	 *@param: java.lang.String  sysSource
	 */
	public void setSysSource(String sysSource){
		this.sysSource = sysSource;
	}

	/**
	 *方法: 获得fkConsultId
	 *@return: java.lang.Long  fkConsultId
	 */
	public Long getFkConsultId(){
		return this.fkConsultId;
	}

	/**
	 *方法: 设置fkConsultId
	 *@param: java.lang.Long  fkConsultId
	 */
	public void setFkConsultId(Long fkConsultId){
		this.fkConsultId = fkConsultId;
	}

	/**
	 *方法: 获得linkConsultIds
	 *@return: java.lang.String  linkConsultIds
	 */
	public String getLinkConsultIds(){
		return this.linkConsultIds;
	}

	/**
	 *方法: 设置linkConsultIds
	 *@param: java.lang.String  linkConsultIds
	 */
	public void setLinkConsultIds(String linkConsultIds){
		this.linkConsultIds = linkConsultIds;
	}

	/**
	 *方法: 获得state
	 *@return: java.lang.String  state
	 */
	public String getState(){
		return this.state;
	}

	/**
	 *方法: 设置state
	 *@param: java.lang.String  state
	 */
	public void setState(String state){
		this.state = state;
	}

	/**
	 *方法: 获得invokeTimes
	 *@return: java.lang.Long  invokeTimes
	 */
	public Long getInvokeTimes(){
		return this.invokeTimes;
	}

	/**
	 *方法: 设置invokeTimes
	 *@param: java.lang.Long  invokeTimes
	 */
	public void setInvokeTimes(Long invokeTimes){
		this.invokeTimes = invokeTimes;
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