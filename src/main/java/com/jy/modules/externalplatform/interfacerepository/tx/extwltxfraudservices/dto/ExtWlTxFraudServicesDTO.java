package com.jy.modules.externalplatform.interfacerepository.tx.extwltxfraudservices.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:腾讯_反欺诈服务(主表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-18 15:22:08
 */
public class ExtWlTxFraudServicesDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**进件客户关联ID*/
	private Long intoCustRefId;

	/**公共错误码*/
	private Long code;

	/**业务侧错误码*/
	private String codeDesc;

	/**模块错误信息描述*/
	private String message;

	/**表示该条记录中的身份证能否查到,1 为能查到，-1 为查不到 */
	private Long idFound;

	/**表示该条记录能否查到,1 为能查到，-1 为查不到 */
	private Long found;

	/**0-100：欺诈分值*/
	private Long riskScore;

	/**数据有效性（1：有效、0：无效）*/
	private String validateState;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private Long createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**修改人*/
	private Long modifyBy;

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
	 *方法: 获得intoCustRefId
	 *@return: java.lang.Long  intoCustRefId
	 */
	public Long getIntoCustRefId(){
		return this.intoCustRefId;
	}

	/**
	 *方法: 设置intoCustRefId
	 *@param: java.lang.Long  intoCustRefId
	 */
	public void setIntoCustRefId(Long intoCustRefId){
		this.intoCustRefId = intoCustRefId;
	}

	/**
	 *方法: 获得code
	 *@return: java.lang.Long  code
	 */
	public Long getCode(){
		return this.code;
	}

	/**
	 *方法: 设置code
	 *@param: java.lang.Long  code
	 */
	public void setCode(Long code){
		this.code = code;
	}

	/**
	 *方法: 获得codeDesc
	 *@return: java.lang.String  codeDesc
	 */
	public String getCodeDesc(){
		return this.codeDesc;
	}

	/**
	 *方法: 设置codeDesc
	 *@param: java.lang.String  codeDesc
	 */
	public void setCodeDesc(String codeDesc){
		this.codeDesc = codeDesc;
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
	 *方法: 获得idFound
	 *@return: java.lang.Long  idFound
	 */
	public Long getIdFound(){
		return this.idFound;
	}

	/**
	 *方法: 设置idFound
	 *@param: java.lang.Long  idFound
	 */
	public void setIdFound(Long idFound){
		this.idFound = idFound;
	}

	/**
	 *方法: 获得found
	 *@return: java.lang.Long  found
	 */
	public Long getFound(){
		return this.found;
	}

	/**
	 *方法: 设置found
	 *@param: java.lang.Long  found
	 */
	public void setFound(Long found){
		this.found = found;
	}

	/**
	 *方法: 获得riskScore
	 *@return: java.lang.Long  riskScore
	 */
	public Long getRiskScore(){
		return this.riskScore;
	}

	/**
	 *方法: 设置riskScore
	 *@param: java.lang.Long  riskScore
	 */
	public void setRiskScore(Long riskScore){
		this.riskScore = riskScore;
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
	 *方法: 获得modifyBy
	 *@return: java.lang.Long  modifyBy
	 */
	public Long getModifyBy(){
		return this.modifyBy;
	}

	/**
	 *方法: 设置modifyBy
	 *@param: java.lang.Long  modifyBy
	 */
	public void setModifyBy(Long modifyBy){
		this.modifyBy = modifyBy;
	}

}