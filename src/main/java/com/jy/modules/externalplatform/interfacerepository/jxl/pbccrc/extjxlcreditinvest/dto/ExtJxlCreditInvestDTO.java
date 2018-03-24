package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:聚信立央行征信采集申请表
 *@author dell
 *@version 1.0,
 *@date 2017-08-24 19:56:47
 */
public class ExtJxlCreditInvestDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private java.lang.Long id;

	/**客户姓名*/
	private java.lang.String custName;

	/**手机号码*/
	private java.lang.String cellPhoneNum;

	/**身份证号码*/
	private java.lang.String idCardNum;

	/**接口调用是否成功(ture-成功；false-失败)*/
	private java.lang.String success;

	/**错误信息*/
	private java.lang.String message;

	/**流程类型 CONTROL / ERROR*/
	private java.lang.String processType;

	/**流程码说明*/
	private java.lang.String content;

	/**流程码*/
	private java.lang.Long processCode;

	/**采集TOKEN*/
	private java.lang.String token;

	/**咨询编号*/
	private java.lang.Long fkConsultId;
	
	
	/**关联咨询编号（多个咨询编号之间以逗号分隔）*/
	private java.lang.String linkConsultIds;
	
	/**调用状态（1-待调用；2-已完成；3-调用失败）*/ 
	private java.lang.String state;
	
	/**调用次数（state为3时累加）*/
	private java.lang.Long invokeTimes;
	
	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;
	
	/**系统编码*/
	private java.lang.String sysCode;

	/**返回码 1：查有 2：查无 3：查询报错 4：解析错误 5:返回错误信息*/
	private java.lang.String retcode;

	/**返回错误信息*/
	private java.lang.String errormsg;

	/**接口日志ID*/
	private java.lang.String interfaceId;

	/**备注*/
	private java.lang.String remark;

	public java.lang.String getSysCode() {
		return sysCode;
	}

	public void setSysCode(java.lang.String sysCode) {
		this.sysCode = sysCode;
	}

	public java.lang.String getRetcode() {
		return retcode;
	}

	public void setRetcode(java.lang.String retcode) {
		this.retcode = retcode;
	}

	public java.lang.String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(java.lang.String errormsg) {
		this.errormsg = errormsg;
	}

	public java.lang.String getInterfaceId() {
		return interfaceId;
	}

	public void setInterfaceId(java.lang.String interfaceId) {
		this.interfaceId = interfaceId;
	}

	public java.lang.String getRemark() {
		return remark;
	}

	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}

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
	 *方法: 获得custName
	 *@return: java.lang.String  custName
	 */
	public java.lang.String getCustName(){
		return this.custName;
	}

	/**
	 *方法: 设置custName
	 *@param: java.lang.String  custName
	 */
	public void setCustName(java.lang.String custName){
		this.custName = custName;
	}

	/**
	 *方法: 获得cellPhoneNum
	 *@return: java.lang.String  cellPhoneNum
	 */
	public java.lang.String getCellPhoneNum(){
		return this.cellPhoneNum;
	}

	/**
	 *方法: 设置cellPhoneNum
	 *@param: java.lang.String  cellPhoneNum
	 */
	public void setCellPhoneNum(java.lang.String cellPhoneNum){
		this.cellPhoneNum = cellPhoneNum;
	}

	/**
	 *方法: 获得idCardNum
	 *@return: java.lang.String  idCardNum
	 */
	public java.lang.String getIdCardNum(){
		return this.idCardNum;
	}

	/**
	 *方法: 设置idCardNum
	 *@param: java.lang.String  idCardNum
	 */
	public void setIdCardNum(java.lang.String idCardNum){
		this.idCardNum = idCardNum;
	}

	/**
	 *方法: 获得success
	 *@return: java.lang.String  success
	 */
	public java.lang.String getSuccess(){
		return this.success;
	}

	/**
	 *方法: 设置success
	 *@param: java.lang.String  success
	 */
	public void setSuccess(java.lang.String success){
		this.success = success;
	}

	/**
	 *方法: 获得message
	 *@return: java.lang.String  message
	 */
	public java.lang.String getMessage(){
		return this.message;
	}

	/**
	 *方法: 设置message
	 *@param: java.lang.String  message
	 */
	public void setMessage(java.lang.String message){
		this.message = message;
	}

	/**
	 *方法: 获得processType
	 *@return: java.lang.String  processType
	 */
	public java.lang.String getProcessType(){
		return this.processType;
	}

	/**
	 *方法: 设置processType
	 *@param: java.lang.String  processType
	 */
	public void setProcessType(java.lang.String processType){
		this.processType = processType;
	}

	/**
	 *方法: 获得content
	 *@return: java.lang.String  content
	 */
	public java.lang.String getContent(){
		return this.content;
	}

	/**
	 *方法: 设置content
	 *@param: java.lang.String  content
	 */
	public void setContent(java.lang.String content){
		this.content = content;
	}

	/**
	 *方法: 获得processCode
	 *@return: java.lang.Long  processCode
	 */
	public java.lang.Long getProcessCode(){
		return this.processCode;
	}

	/**
	 *方法: 设置processCode
	 *@param: java.lang.Long  processCode
	 */
	public void setProcessCode(java.lang.Long processCode){
		this.processCode = processCode;
	}

	/**
	 *方法: 获得token
	 *@return: java.lang.String  token
	 */
	public java.lang.String getToken(){
		return this.token;
	}

	/**
	 *方法: 设置token
	 *@param: java.lang.String  token
	 */
	public void setToken(java.lang.String token){
		this.token = token;
	}

	/**
	 *方法: 获得fkConsultId
	 *@return: java.lang.Long  fkConsultId
	 */
	public java.lang.Long getFkConsultId(){
		return this.fkConsultId;
	}

	/**
	 *方法: 设置fkConsultId
	 *@param: java.lang.Long  fkConsultId
	 */
	public void setFkConsultId(java.lang.Long fkConsultId){
		this.fkConsultId = fkConsultId;
	}
	
	/**
	 *方法: 获得linkConsultIds
	 *@return: java.lang.String  linkConsultIds
	 */
	public java.lang.String getLinkConsultIds() {
		return linkConsultIds;
	}

	/**
	 *方法: 设置linkConsultIds
	 *@param: java.lang.String  linkConsultIds
	 */
	public void setLinkConsultIds(java.lang.String linkConsultIds) {
		this.linkConsultIds = linkConsultIds;
	}
	
	public java.lang.String getState() {
		return state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}
	
	public java.lang.Long getInvokeTimes() {
		return invokeTimes;
	}

	public void setInvokeTimes(java.lang.Long invokeTimes) {
		this.invokeTimes = invokeTimes;
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