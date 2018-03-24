package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmlabelsinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:数美手机号码标签服务信息(外联平台表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-09-26 14:27:00
 */
public class ExtWlSmLabelsInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private java.lang.Long id;

	/**进件客户关联主键*/
	private java.lang.Long intoCustRefId;

	/**手机号*/
	private java.lang.String phone;

	/**该手机号的标注信息*/
	private java.lang.String labels;

	/**是否通讯小号(0 表示不是，1 表示是)*/
	private java.lang.String virtualNumber;

	/**数据有效性（1：有效、0：无效）*/
	private java.lang.String validateState;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**创建人*/
	private java.lang.Long createBy;

	/**修改人*/
	private java.lang.Long modifyBy;

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
	 *方法: 获得intoCustRefId
	 *@return: java.lang.Long  intoCustRefId
	 */
	public java.lang.Long getIntoCustRefId(){
		return this.intoCustRefId;
	}

	/**
	 *方法: 设置intoCustRefId
	 *@param: java.lang.Long  intoCustRefId
	 */
	public void setIntoCustRefId(java.lang.Long intoCustRefId){
		this.intoCustRefId = intoCustRefId;
	}

	/**
	 *方法: 获得phone
	 *@return: java.lang.String  phone
	 */
	public java.lang.String getPhone(){
		return this.phone;
	}

	/**
	 *方法: 设置phone
	 *@param: java.lang.String  phone
	 */
	public void setPhone(java.lang.String phone){
		this.phone = phone;
	}

	/**
	 *方法: 获得labels
	 *@return: java.lang.String  labels
	 */
	public java.lang.String getLabels(){
		return this.labels;
	}

	/**
	 *方法: 设置labels
	 *@param: java.lang.String  labels
	 */
	public void setLabels(java.lang.String labels){
		this.labels = labels;
	}

	/**
	 *方法: 获得virtualNumber
	 *@return: java.lang.String  virtualNumber
	 */
	public java.lang.String getVirtualNumber(){
		return this.virtualNumber;
	}

	/**
	 *方法: 设置virtualNumber
	 *@param: java.lang.String  virtualNumber
	 */
	public void setVirtualNumber(java.lang.String virtualNumber){
		this.virtualNumber = virtualNumber;
	}

	/**
	 *方法: 获得validateState
	 *@return: java.lang.String  validateState
	 */
	public java.lang.String getValidateState(){
		return this.validateState;
	}

	/**
	 *方法: 设置validateState
	 *@param: java.lang.String  validateState
	 */
	public void setValidateState(java.lang.String validateState){
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
	 *方法: 获得createBy
	 *@return: java.lang.Long  createBy
	 */
	public java.lang.Long getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置createBy
	 *@param: java.lang.Long  createBy
	 */
	public void setCreateBy(java.lang.Long createBy){
		this.createBy = createBy;
	}

	/**
	 *方法: 获得modifyBy
	 *@return: java.lang.Long  modifyBy
	 */
	public java.lang.Long getModifyBy(){
		return this.modifyBy;
	}

	/**
	 *方法: 设置modifyBy
	 *@param: java.lang.Long  modifyBy
	 */
	public void setModifyBy(java.lang.Long modifyBy){
		this.modifyBy = modifyBy;
	}

}