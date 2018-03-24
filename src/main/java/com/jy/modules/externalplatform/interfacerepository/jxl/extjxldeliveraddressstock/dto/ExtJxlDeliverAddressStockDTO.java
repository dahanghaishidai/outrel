package com.jy.modules.externalplatform.interfacerepository.jxl.extjxldeliveraddressstock.dto;

import java.util.List;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlreceiverstock.dto.ExtJxlReceiverStockDTO;
import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:送货地址列表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:25:28
 */
public class ExtJxlDeliverAddressStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**申请人信息(JXL)id*/
	private java.lang.Long fkJxlCustInfoId;

	/**收货地址*/
	private java.lang.String address;

	/**经度*/
	private java.lang.Long lng;

	/**纬度*/
	private java.lang.Long lat;

	/**地址类型*/
	private java.lang.String predictAddrType;

	/**开始送货时间*/
	private java.lang.String beginDate;

	/**结束送货时间*/
	private java.lang.String endDate;

	/**总送货金额*/
	private java.lang.Long totalAmount;

	/**总送货次数*/
	private java.lang.Long totalCount;

	//收货人列表
	private List<ExtJxlReceiverStockDTO> receiver;
	
	
	public List<ExtJxlReceiverStockDTO> getReceiver() {
		return receiver;
	}

	public void setReceiver(List<ExtJxlReceiverStockDTO> receiver) {
		this.receiver = receiver;
	}
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
	 *方法: 获得address
	 *@return: java.lang.String  address
	 */
	public java.lang.String getAddress(){
		return this.address;
	}

	/**
	 *方法: 设置address
	 *@param: java.lang.String  address
	 */
	public void setAddress(java.lang.String address){
		this.address = address;
	}

	/**
	 *方法: 获得lng
	 *@return: java.lang.Long  lng
	 */
	public java.lang.Long getLng(){
		return this.lng;
	}

	/**
	 *方法: 设置lng
	 *@param: java.lang.Long  lng
	 */
	public void setLng(java.lang.Long lng){
		this.lng = lng;
	}

	/**
	 *方法: 获得lat
	 *@return: java.lang.Long  lat
	 */
	public java.lang.Long getLat(){
		return this.lat;
	}

	/**
	 *方法: 设置lat
	 *@param: java.lang.Long  lat
	 */
	public void setLat(java.lang.Long lat){
		this.lat = lat;
	}

	/**
	 *方法: 获得predictAddrType
	 *@return: java.lang.String  predictAddrType
	 */
	public java.lang.String getPredictAddrType(){
		return this.predictAddrType;
	}

	/**
	 *方法: 设置predictAddrType
	 *@param: java.lang.String  predictAddrType
	 */
	public void setPredictAddrType(java.lang.String predictAddrType){
		this.predictAddrType = predictAddrType;
	}

	/**
	 *方法: 获得beginDate
	 *@return: java.lang.String  beginDate
	 */
	public java.lang.String getBeginDate(){
		return this.beginDate;
	}

	/**
	 *方法: 设置beginDate
	 *@param: java.lang.String  beginDate
	 */
	public void setBeginDate(java.lang.String beginDate){
		this.beginDate = beginDate;
	}

	/**
	 *方法: 获得endDate
	 *@return: java.lang.String  endDate
	 */
	public java.lang.String getEndDate(){
		return this.endDate;
	}

	/**
	 *方法: 设置endDate
	 *@param: java.lang.String  endDate
	 */
	public void setEndDate(java.lang.String endDate){
		this.endDate = endDate;
	}

	/**
	 *方法: 获得totalAmount
	 *@return: java.lang.Long  totalAmount
	 */
	public java.lang.Long getTotalAmount(){
		return this.totalAmount;
	}

	/**
	 *方法: 设置totalAmount
	 *@param: java.lang.Long  totalAmount
	 */
	public void setTotalAmount(java.lang.Long totalAmount){
		this.totalAmount = totalAmount;
	}

	/**
	 *方法: 获得totalCount
	 *@return: java.lang.Long  totalCount
	 */
	public java.lang.Long getTotalCount(){
		return this.totalCount;
	}

	/**
	 *方法: 设置totalCount
	 *@param: java.lang.Long  totalCount
	 */
	public void setTotalCount(java.lang.Long totalCount){
		this.totalCount = totalCount;
	}

}