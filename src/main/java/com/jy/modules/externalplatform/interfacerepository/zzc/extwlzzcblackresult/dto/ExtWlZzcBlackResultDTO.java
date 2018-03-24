package com.jy.modules.externalplatform.interfacerepository.zzc.extwlzzcblackresult.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:中智诚_黑名单查询表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-18 11:09:25
 */
public class ExtWlZzcBlackResultDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**进件客户关联ID*/
	private Long intoCustRefId;

	/**数据有效性（1：有效、0：无效）*/
	private String validateState;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long modifyBy;

	/**身份证维度_黑名单类型*/
	private String pidBlacklevel;

	/**手机号维度_黑名单类型*/
	private String mobileBlacklevel;

	/**家庭电话维度_黑名单类型*/
	private String homePhoneBlacklevel;

	/**家庭地址维度_黑名单类型*/
	private String homeAddressBlacklevel;

	/**设备ID维度_黑名单类型*/
	private String deviceidBlacklevel;

	/**错误信息*/
	private String errormsg;

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

	/**
	 *方法: 获得pidBlacklevel
	 *@return: java.lang.String  pidBlacklevel
	 */
	public String getPidBlacklevel(){
		return this.pidBlacklevel;
	}

	/**
	 *方法: 设置pidBlacklevel
	 *@param: java.lang.String  pidBlacklevel
	 */
	public void setPidBlacklevel(String pidBlacklevel){
		this.pidBlacklevel = pidBlacklevel;
	}

	/**
	 *方法: 获得mobileBlacklevel
	 *@return: java.lang.String  mobileBlacklevel
	 */
	public String getMobileBlacklevel(){
		return this.mobileBlacklevel;
	}

	/**
	 *方法: 设置mobileBlacklevel
	 *@param: java.lang.String  mobileBlacklevel
	 */
	public void setMobileBlacklevel(String mobileBlacklevel){
		this.mobileBlacklevel = mobileBlacklevel;
	}

	/**
	 *方法: 获得homePhoneBlacklevel
	 *@return: java.lang.String  homePhoneBlacklevel
	 */
	public String getHomePhoneBlacklevel(){
		return this.homePhoneBlacklevel;
	}

	/**
	 *方法: 设置homePhoneBlacklevel
	 *@param: java.lang.String  homePhoneBlacklevel
	 */
	public void setHomePhoneBlacklevel(String homePhoneBlacklevel){
		this.homePhoneBlacklevel = homePhoneBlacklevel;
	}

	/**
	 *方法: 获得homeAddressBlacklevel
	 *@return: java.lang.String  homeAddressBlacklevel
	 */
	public String getHomeAddressBlacklevel(){
		return this.homeAddressBlacklevel;
	}

	/**
	 *方法: 设置homeAddressBlacklevel
	 *@param: java.lang.String  homeAddressBlacklevel
	 */
	public void setHomeAddressBlacklevel(String homeAddressBlacklevel){
		this.homeAddressBlacklevel = homeAddressBlacklevel;
	}

	/**
	 *方法: 获得deviceidBlacklevel
	 *@return: java.lang.String  deviceidBlacklevel
	 */
	public String getDeviceidBlacklevel(){
		return this.deviceidBlacklevel;
	}

	/**
	 *方法: 设置deviceidBlacklevel
	 *@param: java.lang.String  deviceidBlacklevel
	 */
	public void setDeviceidBlacklevel(String deviceidBlacklevel){
		this.deviceidBlacklevel = deviceidBlacklevel;
	}

	/**
	 *方法: 获得errormsg
	 *@return: java.lang.String  errormsg
	 */
	public String getErrormsg(){
		return this.errormsg;
	}

	/**
	 *方法: 设置errormsg
	 *@param: java.lang.String  errormsg
	 */
	public void setErrormsg(String errormsg){
		this.errormsg = errormsg;
	}

}