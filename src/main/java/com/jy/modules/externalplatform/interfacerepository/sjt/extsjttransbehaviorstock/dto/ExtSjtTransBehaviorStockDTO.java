package com.jy.modules.externalplatform.interfacerepository.sjt.extsjttransbehaviorstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:交易行为特征信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-08 11:42:28
 */
public class ExtSjtTransBehaviorStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**交易流水*/
	private java.lang.String transNo;

	/**进件编号*/
	private java.lang.Long intoId;

	/**有无出差*/
	private java.lang.String businesstrip;

	/**有无婚庆消费*/
	private java.lang.String marriageconsume;

	/**是否在职*/
	private java.lang.String employed;

	/**是否失业*/
	private java.lang.String unemployed;

	/**有无母婴/教育投资*/
	private java.lang.String childinvest;

	/**有无夜消费*/
	private java.lang.String nightconsume;

	/**常住城市*/
	private java.lang.String city;

	/**工作时间消费区域*/
	private java.lang.String workregion;

	/**非工作时间消费区域*/
	private java.lang.String freeregion;

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
	 *方法: 获得businesstrip
	 *@return: java.lang.String  businesstrip
	 */
	public java.lang.String getBusinesstrip(){
		return this.businesstrip;
	}

	/**
	 *方法: 设置businesstrip
	 *@param: java.lang.String  businesstrip
	 */
	public void setBusinesstrip(java.lang.String businesstrip){
		this.businesstrip = businesstrip;
	}

	/**
	 *方法: 获得marriageconsume
	 *@return: java.lang.String  marriageconsume
	 */
	public java.lang.String getMarriageconsume(){
		return this.marriageconsume;
	}

	/**
	 *方法: 设置marriageconsume
	 *@param: java.lang.String  marriageconsume
	 */
	public void setMarriageconsume(java.lang.String marriageconsume){
		this.marriageconsume = marriageconsume;
	}

	/**
	 *方法: 获得employed
	 *@return: java.lang.String  employed
	 */
	public java.lang.String getEmployed(){
		return this.employed;
	}

	/**
	 *方法: 设置employed
	 *@param: java.lang.String  employed
	 */
	public void setEmployed(java.lang.String employed){
		this.employed = employed;
	}

	/**
	 *方法: 获得unemployed
	 *@return: java.lang.String  unemployed
	 */
	public java.lang.String getUnemployed(){
		return this.unemployed;
	}

	/**
	 *方法: 设置unemployed
	 *@param: java.lang.String  unemployed
	 */
	public void setUnemployed(java.lang.String unemployed){
		this.unemployed = unemployed;
	}

	/**
	 *方法: 获得childinvest
	 *@return: java.lang.String  childinvest
	 */
	public java.lang.String getChildinvest(){
		return this.childinvest;
	}

	/**
	 *方法: 设置childinvest
	 *@param: java.lang.String  childinvest
	 */
	public void setChildinvest(java.lang.String childinvest){
		this.childinvest = childinvest;
	}

	/**
	 *方法: 获得nightconsume
	 *@return: java.lang.String  nightconsume
	 */
	public java.lang.String getNightconsume(){
		return this.nightconsume;
	}

	/**
	 *方法: 设置nightconsume
	 *@param: java.lang.String  nightconsume
	 */
	public void setNightconsume(java.lang.String nightconsume){
		this.nightconsume = nightconsume;
	}

	/**
	 *方法: 获得city
	 *@return: java.lang.String  city
	 */
	public java.lang.String getCity(){
		return this.city;
	}

	/**
	 *方法: 设置city
	 *@param: java.lang.String  city
	 */
	public void setCity(java.lang.String city){
		this.city = city;
	}

	/**
	 *方法: 获得workregion
	 *@return: java.lang.String  workregion
	 */
	public java.lang.String getWorkregion(){
		return this.workregion;
	}

	/**
	 *方法: 设置workregion
	 *@param: java.lang.String  workregion
	 */
	public void setWorkregion(java.lang.String workregion){
		this.workregion = workregion;
	}

	/**
	 *方法: 获得freeregion
	 *@return: java.lang.String  freeregion
	 */
	public java.lang.String getFreeregion(){
		return this.freeregion;
	}

	/**
	 *方法: 设置freeregion
	 *@param: java.lang.String  freeregion
	 */
	public void setFreeregion(java.lang.String freeregion){
		this.freeregion = freeregion;
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