package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditreport.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:聚信立央行征信报告
 *@author dell
 *@version 1.0,
 *@date 2017-08-24 20:48:30
 */
public class ExtJxlCreditReportDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private java.lang.Long id;

	/**申请表主键ID*/
	private java.lang.Long fkInvestId;

	/**接口调用是否成功(ture-成功；false-失败)*/
	private java.lang.String success;

	/**说明信息*/
	private java.lang.String note;

	/**报告编号*/
	private java.lang.String reportId;

	/**查询时间*/
	private java.lang.String requestTime;

	/**报告时间*/
	private java.lang.String reportTime;

	/**被查询者姓名*/
	private java.lang.String queriedName;

	/**被查询者证件类型*/
	private java.lang.String queriedPapers;

	/**被查询者证件号码*/
	private java.lang.String queriedNumber;

	/**被查询者婚姻状况*/
	private java.lang.String queryMarriage;

	/**查询TOKEN*/
	private java.lang.String token;

	/**数据源*/
	private java.lang.String dataSource;

	/**接口版本*/
	private java.lang.String version;

	/**调用状态*/
	private java.lang.String errorCode;

	/**调用状态说明*/
	private java.lang.String errorMsg;
	
	/**返回报文*/
	private java.lang.String respMsg;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;
	
	/**系统编码*/
	private java.lang.String sysCode;

	/**接口日志ID*/
	private java.lang.String interfaceId;

	public java.lang.String getSysCode() {
		return sysCode;
	}

	public void setSysCode(java.lang.String sysCode) {
		this.sysCode = sysCode;
	}

	public java.lang.String getInterfaceId() {
		return interfaceId;
	}

	public void setInterfaceId(java.lang.String interfaceId) {
		this.interfaceId = interfaceId;
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
	 *方法: 获得fkInvestId
	 *@return: java.lang.Long  fkInvestId
	 */
	public java.lang.Long getFkInvestId(){
		return this.fkInvestId;
	}

	/**
	 *方法: 设置fkInvestId
	 *@param: java.lang.Long  fkInvestId
	 */
	public void setFkInvestId(java.lang.Long fkInvestId){
		this.fkInvestId = fkInvestId;
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
	 *方法: 获得note
	 *@return: java.lang.String  note
	 */
	public java.lang.String getNote(){
		return this.note;
	}

	/**
	 *方法: 设置note
	 *@param: java.lang.String  note
	 */
	public void setNote(java.lang.String note){
		this.note = note;
	}

	/**
	 *方法: 获得reportId
	 *@return: java.lang.String  reportId
	 */
	public java.lang.String getReportId(){
		return this.reportId;
	}

	/**
	 *方法: 设置reportId
	 *@param: java.lang.String  reportId
	 */
	public void setReportId(java.lang.String reportId){
		this.reportId = reportId;
	}

	/**
	 *方法: 获得requestTime
	 *@return: java.lang.String  requestTime
	 */
	public java.lang.String getRequestTime(){
		return this.requestTime;
	}

	/**
	 *方法: 设置requestTime
	 *@param: java.lang.String  requestTime
	 */
	public void setRequestTime(java.lang.String requestTime){
		this.requestTime = requestTime;
	}

	/**
	 *方法: 获得reportTime
	 *@return: java.lang.String  reportTime
	 */
	public java.lang.String getReportTime(){
		return this.reportTime;
	}

	/**
	 *方法: 设置reportTime
	 *@param: java.lang.String  reportTime
	 */
	public void setReportTime(java.lang.String reportTime){
		this.reportTime = reportTime;
	}

	/**
	 *方法: 获得queriedName
	 *@return: java.lang.String  queriedName
	 */
	public java.lang.String getQueriedName(){
		return this.queriedName;
	}

	/**
	 *方法: 设置queriedName
	 *@param: java.lang.String  queriedName
	 */
	public void setQueriedName(java.lang.String queriedName){
		this.queriedName = queriedName;
	}

	/**
	 *方法: 获得queriedPapers
	 *@return: java.lang.String  queriedPapers
	 */
	public java.lang.String getQueriedPapers(){
		return this.queriedPapers;
	}

	/**
	 *方法: 设置queriedPapers
	 *@param: java.lang.String  queriedPapers
	 */
	public void setQueriedPapers(java.lang.String queriedPapers){
		this.queriedPapers = queriedPapers;
	}

	/**
	 *方法: 获得queriedNumber
	 *@return: java.lang.String  queriedNumber
	 */
	public java.lang.String getQueriedNumber(){
		return this.queriedNumber;
	}

	/**
	 *方法: 设置queriedNumber
	 *@param: java.lang.String  queriedNumber
	 */
	public void setQueriedNumber(java.lang.String queriedNumber){
		this.queriedNumber = queriedNumber;
	}

	/**
	 *方法: 获得queryMarriage
	 *@return: java.lang.String  queryMarriage
	 */
	public java.lang.String getQueryMarriage(){
		return this.queryMarriage;
	}

	/**
	 *方法: 设置queryMarriage
	 *@param: java.lang.String  queryMarriage
	 */
	public void setQueryMarriage(java.lang.String queryMarriage){
		this.queryMarriage = queryMarriage;
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
	 *方法: 获得dataSource
	 *@return: java.lang.String  dataSource
	 */
	public java.lang.String getDataSource(){
		return this.dataSource;
	}

	/**
	 *方法: 设置dataSource
	 *@param: java.lang.String  dataSource
	 */
	public void setDataSource(java.lang.String dataSource){
		this.dataSource = dataSource;
	}

	/**
	 *方法: 获得version
	 *@return: java.lang.String  version
	 */
	public java.lang.String getVersion(){
		return this.version;
	}

	/**
	 *方法: 设置version
	 *@param: java.lang.String  version
	 */
	public void setVersion(java.lang.String version){
		this.version = version;
	}

	/**
	 *方法: 获得errorCode
	 *@return: java.lang.String  errorCode
	 */
	public java.lang.String getErrorCode(){
		return this.errorCode;
	}

	/**
	 *方法: 设置errorCode
	 *@param: java.lang.String  errorCode
	 */
	public void setErrorCode(java.lang.String errorCode){
		this.errorCode = errorCode;
	}

	/**
	 *方法: 获得errorMsg
	 *@return: java.lang.String  errorMsg
	 */
	public java.lang.String getErrorMsg(){
		return this.errorMsg;
	}

	/**
	 *方法: 设置errorMsg
	 *@param: java.lang.String  errorMsg
	 */
	public void setErrorMsg(java.lang.String errorMsg){
		this.errorMsg = errorMsg;
	}
	
	
	/**
	 *方法: 获得respMsg
	 *@return: java.lang.String  respMsg
	 */
	public java.lang.String getRespMsg() {
		return respMsg;
	}

	/**
	 *方法: 设置respMsg
	 *@param: java.lang.String  respMsg
	 */
	public void setRespMsg(java.lang.String respMsg) {
		this.respMsg = respMsg;
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