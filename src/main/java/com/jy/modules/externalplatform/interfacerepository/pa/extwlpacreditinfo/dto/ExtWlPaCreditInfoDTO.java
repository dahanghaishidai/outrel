package com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:凭安信用信息表
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-08 10:55:23
 */
public class ExtWlPaCreditInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**平安信用主表主键*/
	private String keyId;

	/**手机(固话)号码*/
	private String mobile;

	/** 电话号码 */
	private java.lang.String number;

	/**机构编码*/
	private String orgCode;

	/**机构类型*/
	private String orgType;

	/**需求类型*/
	private String demandType;

	/**最新标记日期*/
	private String lastMarkDate;

	/**创建人*/
	private Long createBy;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改人*/
	private Long modifyBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**数据有效性(1：有效，0：无效)*/
	private String validateState;

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
	 *方法: 获得keyId
	 *@return: java.lang.String  keyId
	 */
	public String getKeyId(){
		return this.keyId;
	}

	/**
	 *方法: 设置keyId
	 *@param: java.lang.String  keyId
	 */
	public void setKeyId(String keyId){
		this.keyId = keyId;
	}

	/**
	 *方法: 获得mobile
	 *@return: java.lang.String  mobile
	 */
	public String getMobile(){
		return this.mobile;
	}

	/**
	 *方法: 设置mobile
	 *@param: java.lang.String  mobile
	 */
	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	/**
	 *方法: 获得orgCode
	 *@return: java.lang.String  orgCode
	 */
	public String getOrgCode(){
		return this.orgCode;
	}

	/**
	 *方法: 设置orgCode
	 *@param: java.lang.String  orgCode
	 */
	public void setOrgCode(String orgCode){
		this.orgCode = orgCode;
	}

	/**
	 *方法: 获得orgType
	 *@return: java.lang.String  orgType
	 */
	public String getOrgType(){
		return this.orgType;
	}

	/**
	 *方法: 设置orgType
	 *@param: java.lang.String  orgType
	 */
	public void setOrgType(String orgType){
		this.orgType = orgType;
	}

	/**
	 *方法: 获得demandType
	 *@return: java.lang.String  demandType
	 */
	public String getDemandType(){
		return this.demandType;
	}

	/**
	 *方法: 设置demandType
	 *@param: java.lang.String  demandType
	 */
	public void setDemandType(String demandType){
		this.demandType = demandType;
	}

	/**
	 *方法: 获得lastMarkDate
	 *@return: java.lang.String  lastMarkDate
	 */
	public String getLastMarkDate(){
		return this.lastMarkDate;
	}

	/**
	 *方法: 设置lastMarkDate
	 *@param: java.lang.String  lastMarkDate
	 */
	public void setLastMarkDate(String lastMarkDate){
		this.lastMarkDate = lastMarkDate;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}