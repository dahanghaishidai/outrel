package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话共享报告_主表信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 19:52:36
 */
public class ExtWlShareMainReportDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**客户姓名*/
	private String custName;

	/**证件类型*/
	private String idType;

	/**证件号码*/
	private String idCard;

	/**查询原因*/
	private String sreason;

	/**成功标识 true-成功  false-失败*/
	private String success;

	/**错误描述信息*/
	private String error;

	/**请求报文*/
	private String reqMsg;

	/**返回报文*/
	private String respMsg;

	/**进件主表ID*/
	private Long fkIntoId;

	/**客户主表ID*/
	private Long fkCustId;

	/**查询编号*/
	private String sorgseq;

	/**查询时间*/
	private java.util.Date queryDate;

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
	 *方法: 获得idType
	 *@return: java.lang.String  idType
	 */
	public String getIdType(){
		return this.idType;
	}

	/**
	 *方法: 设置idType
	 *@param: java.lang.String  idType
	 */
	public void setIdType(String idType){
		this.idType = idType;
	}

	/**
	 *方法: 获得idCard
	 *@return: java.lang.String  idCard
	 */
	public String getIdCard(){
		return this.idCard;
	}

	/**
	 *方法: 设置idCard
	 *@param: java.lang.String  idCard
	 */
	public void setIdCard(String idCard){
		this.idCard = idCard;
	}

	/**
	 *方法: 获得sreason
	 *@return: java.lang.String  sreason
	 */
	public String getSreason(){
		return this.sreason;
	}

	/**
	 *方法: 设置sreason
	 *@param: java.lang.String  sreason
	 */
	public void setSreason(String sreason){
		this.sreason = sreason;
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
	 *方法: 获得error
	 *@return: java.lang.String  error
	 */
	public String getError(){
		return this.error;
	}

	/**
	 *方法: 设置error
	 *@param: java.lang.String  error
	 */
	public void setError(String error){
		this.error = error;
	}

	/**
	 *方法: 获得reqMsg
	 *@return: java.sql.Clob  reqMsg
	 */
	public String getReqMsg(){
		return this.reqMsg;
	}

	/**
	 *方法: 设置reqMsg
	 *@param: java.sql.Clob  reqMsg
	 */
	public void setReqMsg(String reqMsg){
		this.reqMsg = reqMsg;
	}

	/**
	 *方法: 获得respMsg
	 *@return: java.sql.Clob  respMsg
	 */
	public String getRespMsg(){
		return this.respMsg;
	}

	/**
	 *方法: 设置respMsg
	 *@param: java.sql.Clob  respMsg
	 */
	public void setRespMsg(String respMsg){
		this.respMsg = respMsg;
	}

	/**
	 *方法: 获得fkIntoId
	 *@return: java.lang.Long  fkIntoId
	 */
	public Long getFkIntoId(){
		return this.fkIntoId;
	}

	/**
	 *方法: 设置fkIntoId
	 *@param: java.lang.Long  fkIntoId
	 */
	public void setFkIntoId(Long fkIntoId){
		this.fkIntoId = fkIntoId;
	}

	/**
	 *方法: 获得fkCustId
	 *@return: java.lang.Long  fkCustId
	 */
	public Long getFkCustId(){
		return this.fkCustId;
	}

	/**
	 *方法: 设置fkCustId
	 *@param: java.lang.Long  fkCustId
	 */
	public void setFkCustId(Long fkCustId){
		this.fkCustId = fkCustId;
	}

	/**
	 *方法: 获得sorgseq
	 *@return: java.lang.String  sorgseq
	 */
	public String getSorgseq(){
		return this.sorgseq;
	}

	/**
	 *方法: 设置sorgseq
	 *@param: java.lang.String  sorgseq
	 */
	public void setSorgseq(String sorgseq){
		this.sorgseq = sorgseq;
	}

	/**
	 *方法: 获得queryDate
	 *@return: java.util.Date  queryDate
	 */
	public java.util.Date getQueryDate(){
		return this.queryDate;
	}

	/**
	 *方法: 设置queryDate
	 *@param: java.util.Date  queryDate
	 */
	public void setQueryDate(java.util.Date queryDate){
		this.queryDate = queryDate;
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