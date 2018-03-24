package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskmultiple.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:多重借贷查询主表
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-12 17:35:05
 */
public class ExtWlTxskMultipleDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**INTO_CUST_REF_ID*/
	private Long intoCustRefId;

	/**接口查询状态 true false*/
	private String success;

	/**异常码*/
	private String code;

	/**异常码描述(英文)*/
	private String error;

	/**异常码描述(中文)*/
	private String errorDesc;

	/**CREATE_TIME*/
	private java.sql.Timestamp createTime;

	/**UPDATE_TIME*/
	private java.sql.Timestamp updateTime;

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
	 *方法: 获得code
	 *@return: java.lang.String  code
	 */
	public String getCode(){
		return this.code;
	}

	/**
	 *方法: 设置code
	 *@param: java.lang.String  code
	 */
	public void setCode(String code){
		this.code = code;
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
	 *方法: 获得errorDesc
	 *@return: java.lang.String  errorDesc
	 */
	public String getErrorDesc(){
		return this.errorDesc;
	}

	/**
	 *方法: 设置errorDesc
	 *@param: java.lang.String  errorDesc
	 */
	public void setErrorDesc(String errorDesc){
		this.errorDesc = errorDesc;
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
	 *方法: 获得updateTime
	 *@return: java.sql.Timestamp  updateTime
	 */
	public java.sql.Timestamp getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置updateTime
	 *@param: java.sql.Timestamp  updateTime
	 */
	public void setUpdateTime(java.sql.Timestamp updateTime){
		this.updateTime = updateTime;
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