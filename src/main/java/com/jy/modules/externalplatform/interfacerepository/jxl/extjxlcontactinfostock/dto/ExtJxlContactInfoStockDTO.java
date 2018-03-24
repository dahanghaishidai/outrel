package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactinfostock.dto;

import java.util.List;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcallinfostock.dto.ExtJxlCallInfoStockDTO;
import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:联系人信息表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:24:34
 */
public class ExtJxlContactInfoStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**申请人信息(JXL)id*/
	private java.lang.Long fkJxlCustInfoId;

	/**联系人姓名*/
	private java.lang.String contactName;

	/**和联系人最早联系的时间*/
	private java.lang.String beginDate;

	/**和联系人最晚联系的时间*/
	private java.lang.String endDate;

	/**申请人为该联系人购货总次数*/
	private java.lang.Long totalCount;

	/**申请人为该联系人购货总金额*/
	private java.lang.Long totalAmount;

	//呼叫信息列表
	private List<ExtJxlCallInfoStockDTO> contact_details;
	
	
	public List<ExtJxlCallInfoStockDTO> getContact_details() {
		return contact_details;
	}

	public void setContact_details(List<ExtJxlCallInfoStockDTO> contact_details) {
		this.contact_details = contact_details;
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
	 *方法: 获得contactName
	 *@return: java.lang.String  contactName
	 */
	public java.lang.String getContactName(){
		return this.contactName;
	}

	/**
	 *方法: 设置contactName
	 *@param: java.lang.String  contactName
	 */
	public void setContactName(java.lang.String contactName){
		this.contactName = contactName;
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

}