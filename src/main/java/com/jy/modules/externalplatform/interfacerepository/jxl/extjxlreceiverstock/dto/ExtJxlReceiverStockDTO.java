package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlreceiverstock.dto;

import java.util.List;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:收货人表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:26:01
 */
public class ExtJxlReceiverStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**送货地址表id*/
	private java.lang.Long fkDeliverAddressId;

	/**收货人姓名*/
	private java.lang.String name;

	/**收货人电话号码，用逗号分隔*/
	private java.lang.String phone_num_list1;
	/**收货人电话号码，用逗号分隔*/
	private List<String> phone_num_list;
	/**送货金额*/
	private java.lang.Long amount;

	/**送货次数*/
	private java.lang.Long count;

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
	 *方法: 获得fkDeliverAddressId
	 *@return: java.lang.Long  fkDeliverAddressId
	 */
	public java.lang.Long getFkDeliverAddressId(){
		return this.fkDeliverAddressId;
	}

	/**
	 *方法: 设置fkDeliverAddressId
	 *@param: java.lang.Long  fkDeliverAddressId
	 */
	public void setFkDeliverAddressId(java.lang.Long fkDeliverAddressId){
		this.fkDeliverAddressId = fkDeliverAddressId;
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

	

	public java.lang.String getPhone_num_list1() {
		return phone_num_list1;
	}

	public void setPhone_num_list1(java.lang.String phone_num_list1) {
		this.phone_num_list1 = phone_num_list1;
	}

	public List<String> getPhone_num_list() {
		return phone_num_list;
	}

	public void setPhone_num_list(List<String> phone_num_list) {
		this.phone_num_list = phone_num_list;
	}

	/**
	 *方法: 获得amount
	 *@return: java.lang.Long  amount
	 */
	public java.lang.Long getAmount(){
		return this.amount;
	}

	/**
	 *方法: 设置amount
	 *@param: java.lang.Long  amount
	 */
	public void setAmount(java.lang.Long amount){
		this.amount = amount;
	}

	/**
	 *方法: 获得count
	 *@return: java.lang.Long  count
	 */
	public java.lang.Long getCount(){
		return this.count;
	}

	/**
	 *方法: 设置count
	 *@param: java.lang.Long  count
	 */
	public void setCount(java.lang.Long count){
		this.count = count;
	}

}