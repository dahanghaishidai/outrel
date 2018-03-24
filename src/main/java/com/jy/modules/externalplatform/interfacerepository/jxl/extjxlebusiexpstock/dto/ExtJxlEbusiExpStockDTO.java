package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlebusiexpstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:电商月消费表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:25:51
 */
public class ExtJxlEbusiExpStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**申请人信息(JXL)id*/
	private java.lang.Long fkJxlCustInfoId;

	/**汇总月份*/
	private java.lang.String transMth;

	/**本人购物金额*/
	private java.lang.Long ownerAmount;

	/**本人购物次数*/
	private java.lang.Long ownerCount;

	/**本人+同住人购物金额*/
	private java.lang.Long familyAmount;

	/**本人+同住人购物次数*/
	private java.lang.Long familyCount;

	/**非本人和家庭购物的购物金额*/
	private java.lang.Long othersAmount;

	/**非本人和家庭购物的购物次数*/
	private java.lang.Long othersCount;

	/**总购物金额*/
	private java.lang.Long allAmount;

	/**总购物次数*/
	private java.lang.Long allCount;

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
	 *方法: 获得transMth
	 *@return: java.lang.String  transMth
	 */
	public java.lang.String getTransMth(){
		return this.transMth;
	}

	/**
	 *方法: 设置transMth
	 *@param: java.lang.String  transMth
	 */
	public void setTransMth(java.lang.String transMth){
		this.transMth = transMth;
	}

	/**
	 *方法: 获得ownerAmount
	 *@return: java.lang.Long  ownerAmount
	 */
	public java.lang.Long getOwnerAmount(){
		return this.ownerAmount;
	}

	/**
	 *方法: 设置ownerAmount
	 *@param: java.lang.Long  ownerAmount
	 */
	public void setOwnerAmount(java.lang.Long ownerAmount){
		this.ownerAmount = ownerAmount;
	}

	/**
	 *方法: 获得ownerCount
	 *@return: java.lang.Long  ownerCount
	 */
	public java.lang.Long getOwnerCount(){
		return this.ownerCount;
	}

	/**
	 *方法: 设置ownerCount
	 *@param: java.lang.Long  ownerCount
	 */
	public void setOwnerCount(java.lang.Long ownerCount){
		this.ownerCount = ownerCount;
	}

	/**
	 *方法: 获得familyAmount
	 *@return: java.lang.Long  familyAmount
	 */
	public java.lang.Long getFamilyAmount(){
		return this.familyAmount;
	}

	/**
	 *方法: 设置familyAmount
	 *@param: java.lang.Long  familyAmount
	 */
	public void setFamilyAmount(java.lang.Long familyAmount){
		this.familyAmount = familyAmount;
	}

	/**
	 *方法: 获得familyCount
	 *@return: java.lang.Long  familyCount
	 */
	public java.lang.Long getFamilyCount(){
		return this.familyCount;
	}

	/**
	 *方法: 设置familyCount
	 *@param: java.lang.Long  familyCount
	 */
	public void setFamilyCount(java.lang.Long familyCount){
		this.familyCount = familyCount;
	}

	/**
	 *方法: 获得othersAmount
	 *@return: java.lang.Long  othersAmount
	 */
	public java.lang.Long getOthersAmount(){
		return this.othersAmount;
	}

	/**
	 *方法: 设置othersAmount
	 *@param: java.lang.Long  othersAmount
	 */
	public void setOthersAmount(java.lang.Long othersAmount){
		this.othersAmount = othersAmount;
	}

	/**
	 *方法: 获得othersCount
	 *@return: java.lang.Long  othersCount
	 */
	public java.lang.Long getOthersCount(){
		return this.othersCount;
	}

	/**
	 *方法: 设置othersCount
	 *@param: java.lang.Long  othersCount
	 */
	public void setOthersCount(java.lang.Long othersCount){
		this.othersCount = othersCount;
	}

	/**
	 *方法: 获得allAmount
	 *@return: java.lang.Long  allAmount
	 */
	public java.lang.Long getAllAmount(){
		return this.allAmount;
	}

	/**
	 *方法: 设置allAmount
	 *@param: java.lang.Long  allAmount
	 */
	public void setAllAmount(java.lang.Long allAmount){
		this.allAmount = allAmount;
	}

	/**
	 *方法: 获得allCount
	 *@return: java.lang.Long  allCount
	 */
	public java.lang.Long getAllCount(){
		return this.allCount;
	}

	/**
	 *方法: 设置allCount
	 *@param: java.lang.Long  allCount
	 */
	public void setAllCount(java.lang.Long allCount){
		this.allCount = allCount;
	}

}