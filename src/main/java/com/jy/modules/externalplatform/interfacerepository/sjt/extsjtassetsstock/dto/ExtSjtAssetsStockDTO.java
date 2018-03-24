package com.jy.modules.externalplatform.interfacerepository.sjt.extsjtassetsstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:数据堂个人消费报告资产指标
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-08 11:42:02
 */
public class ExtSjtAssetsStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**交易流水*/
	private java.lang.String transNo;

	/**进件编号*/
	private java.lang.Long intoId;

	/**是否有房产*/
	private java.lang.String hasHouse;

	/**是否有车*/
	private java.lang.String hasCar;

	/**房产预估购买时间*/
	private java.lang.String housePurTime;

	/**汽车预估购买时间*/
	private java.lang.String carPurTime;

	/**房产预估价值*/
	private java.lang.Long houseValue;

	/**汽车预估价值*/
	private java.lang.Long carValue;

	/**关联主键*/
	private java.lang.Long fkId;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private java.lang.String createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**修改人*/
	private java.lang.String modifyBy;

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
	 *方法: 获得transNo
	 *@return: java.lang.String  transNo
	 */
	public java.lang.String getTransNo(){
		return this.transNo;
	}

	/**
	 *方法: 设置transNo
	 *@param: java.lang.String  transNo
	 */
	public void setTransNo(java.lang.String transNo){
		this.transNo = transNo;
	}

	/**
	 *方法: 获得intoId
	 *@return: java.lang.Long  intoId
	 */
	public java.lang.Long getIntoId(){
		return this.intoId;
	}

	/**
	 *方法: 设置intoId
	 *@param: java.lang.Long  intoId
	 */
	public void setIntoId(java.lang.Long intoId){
		this.intoId = intoId;
	}

	/**
	 *方法: 获得hasHouse
	 *@return: java.lang.String  hasHouse
	 */
	public java.lang.String getHasHouse(){
		return this.hasHouse;
	}

	/**
	 *方法: 设置hasHouse
	 *@param: java.lang.String  hasHouse
	 */
	public void setHasHouse(java.lang.String hasHouse){
		this.hasHouse = hasHouse;
	}

	/**
	 *方法: 获得hasCar
	 *@return: java.lang.String  hasCar
	 */
	public java.lang.String getHasCar(){
		return this.hasCar;
	}

	/**
	 *方法: 设置hasCar
	 *@param: java.lang.String  hasCar
	 */
	public void setHasCar(java.lang.String hasCar){
		this.hasCar = hasCar;
	}

	/**
	 *方法: 获得housePurTime
	 *@return: java.lang.String  housePurTime
	 */
	public java.lang.String getHousePurTime(){
		return this.housePurTime;
	}

	/**
	 *方法: 设置housePurTime
	 *@param: java.lang.String  housePurTime
	 */
	public void setHousePurTime(java.lang.String housePurTime){
		this.housePurTime = housePurTime;
	}

	/**
	 *方法: 获得carPurTime
	 *@return: java.lang.String  carPurTime
	 */
	public java.lang.String getCarPurTime(){
		return this.carPurTime;
	}

	/**
	 *方法: 设置carPurTime
	 *@param: java.lang.String  carPurTime
	 */
	public void setCarPurTime(java.lang.String carPurTime){
		this.carPurTime = carPurTime;
	}

	/**
	 *方法: 获得houseValue
	 *@return: java.lang.Long  houseValue
	 */
	public java.lang.Long getHouseValue(){
		return this.houseValue;
	}

	/**
	 *方法: 设置houseValue
	 *@param: java.lang.Long  houseValue
	 */
	public void setHouseValue(java.lang.Long houseValue){
		this.houseValue = houseValue;
	}

	/**
	 *方法: 获得carValue
	 *@return: java.lang.Long  carValue
	 */
	public java.lang.Long getCarValue(){
		return this.carValue;
	}

	/**
	 *方法: 设置carValue
	 *@param: java.lang.Long  carValue
	 */
	public void setCarValue(java.lang.Long carValue){
		this.carValue = carValue;
	}

	/**
	 *方法: 获得fkId
	 *@return: java.lang.Long  fkId
	 */
	public java.lang.Long getFkId(){
		return this.fkId;
	}

	/**
	 *方法: 设置fkId
	 *@param: java.lang.Long  fkId
	 */
	public void setFkId(java.lang.Long fkId){
		this.fkId = fkId;
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
	 *@return: java.lang.String  createBy
	 */
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置createBy
	 *@param: java.lang.String  createBy
	 */
	public void setCreateBy(java.lang.String createBy){
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
	 *@return: java.lang.String  modifyBy
	 */
	public java.lang.String getModifyBy(){
		return this.modifyBy;
	}

	/**
	 *方法: 设置modifyBy
	 *@param: java.lang.String  modifyBy
	 */
	public void setModifyBy(java.lang.String modifyBy){
		this.modifyBy = modifyBy;
	}

}