package com.jy.modules.externalplatform.interfacerepository.jxl.extjxldatasourcestock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:绑定数据源信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:25:17
 */
public class ExtJxlDataSourceStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**申请人信息(jxl)id*/
	private java.lang.Long fkJxlCustInfoId;

	/**绑定数据源的名称*/
	private java.lang.String name;

	/**绑定的账号名称*/
	private java.lang.String account;

	/**数据源类型*/
	private java.lang.String categoryName;

	/**数据源类型名称*/
	private java.lang.String categoryValue;

	/**数据有效性*/
	private java.lang.String status;

	/**数据可靠性*/
	private java.lang.String reliability;

	/**绑定时间*/
	private java.lang.String bindingTime;

	/**数据源标识*/
	private java.lang.String key;
	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;
	
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
	 *方法: 获得fkJxlCustInfoId
	 *@return: java.lang.Long  fkJxlCustInfoId
	 */
	public java.lang.Long getFkJxlCustInfoId(){
		return this.fkJxlCustInfoId;
	}

	/**
	 *方法: 设置fkJxlCustInfoId
	 *@param: java.lang.Long  fkJxlCustInfoId
	 */
	public void setFkJxlCustInfoId(java.lang.Long fkJxlCustInfoId){
		this.fkJxlCustInfoId = fkJxlCustInfoId;
	}

	/**
	 *方法: 获得name
	 *@return: java.lang.String  name
	 */
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置name
	 *@param: java.lang.String  name
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}

	/**
	 *方法: 获得account
	 *@return: java.lang.String  account
	 */
	public java.lang.String getAccount(){
		return this.account;
	}

	/**
	 *方法: 设置account
	 *@param: java.lang.String  account
	 */
	public void setAccount(java.lang.String account){
		this.account = account;
	}

	/**
	 *方法: 获得categoryName
	 *@return: java.lang.String  categoryName
	 */
	public java.lang.String getCategoryName(){
		return this.categoryName;
	}

	/**
	 *方法: 设置categoryName
	 *@param: java.lang.String  categoryName
	 */
	public void setCategoryName(java.lang.String categoryName){
		this.categoryName = categoryName;
	}

	/**
	 *方法: 获得categoryValue
	 *@return: java.lang.String  categoryValue
	 */
	public java.lang.String getCategoryValue(){
		return this.categoryValue;
	}

	/**
	 *方法: 设置categoryValue
	 *@param: java.lang.String  categoryValue
	 */
	public void setCategoryValue(java.lang.String categoryValue){
		this.categoryValue = categoryValue;
	}

	/**
	 *方法: 获得status
	 *@return: java.lang.String  status
	 */
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置status
	 *@param: java.lang.String  status
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
	}

	/**
	 *方法: 获得reliability
	 *@return: java.lang.String  reliability
	 */
	public java.lang.String getReliability(){
		return this.reliability;
	}

	/**
	 *方法: 设置reliability
	 *@param: java.lang.String  reliability
	 */
	public void setReliability(java.lang.String reliability){
		this.reliability = reliability;
	}

	/**
	 *方法: 获得bindingTime
	 *@return: java.lang.String  bindingTime
	 */
	public java.lang.String getBindingTime(){
		return this.bindingTime;
	}

	/**
	 *方法: 设置bindingTime
	 *@param: java.lang.String  bindingTime
	 */
	public void setBindingTime(java.lang.String bindingTime){
		this.bindingTime = bindingTime;
	}

	/**
	 *方法: 获得key
	 *@return: java.lang.String  key
	 */
	public java.lang.String getKey(){
		return this.key;
	}

	/**
	 *方法: 设置key
	 *@param: java.lang.String  key
	 */
	public void setKey(java.lang.String key){
		this.key = key;
	}

}