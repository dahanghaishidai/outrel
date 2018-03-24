package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditquerytrail.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行信用报告查询轨迹表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:45:40
 */
public class ExtWlShCreditQueryTrailDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**被查询人姓名*/
	private String custName;

	/**被查询人身份证号*/
	private String idCard;

	/**查询结果*/
	private String success;

	/**错误信息*/
	private String errorMsg;

	/**请求报文*/
	private String reqMsg;

	/**返回报文*/
	private String respMsg;

	/**申请表主键ID*/
	private Long fkInvestId;

	/**系统来源*/
	private String sysSource;

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
	 *方法: 获得errorMsg
	 *@return: java.lang.String  errorMsg
	 */
	public String getErrorMsg(){
		return this.errorMsg;
	}

	/**
	 *方法: 设置errorMsg
	 *@param: java.lang.String  errorMsg
	 */
	public void setErrorMsg(String errorMsg){
		this.errorMsg = errorMsg;
	}

	/**
	 *方法: 获得reqMsg
	 *@return: String  reqMsg
	 */
	public String getReqMsg(){
		return this.reqMsg;
	}

	/**
	 *方法: 设置reqMsg
	 *@param: String  reqMsg
	 */
	public void setReqMsg(String reqMsg){
		this.reqMsg = reqMsg;
	}

	/**
	 *方法: 获得respMsg
	 *@return: String  respMsg
	 */
	public String getRespMsg(){
		return this.respMsg;
	}

	/**
	 *方法: 设置respMsg
	 *@param: String  respMsg
	 */
	public void setRespMsg(String respMsg){
		this.respMsg = respMsg;
	}

	/**
	 *方法: 获得fkInvestId
	 *@return: java.lang.Long  fkInvestId
	 */
	public Long getFkInvestId(){
		return this.fkInvestId;
	}

	/**
	 *方法: 设置fkInvestId
	 *@param: java.lang.Long  fkInvestId
	 */
	public void setFkInvestId(Long fkInvestId){
		this.fkInvestId = fkInvestId;
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