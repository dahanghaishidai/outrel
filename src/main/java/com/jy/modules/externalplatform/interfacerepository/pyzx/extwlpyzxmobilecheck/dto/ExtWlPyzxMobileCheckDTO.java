package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilecheck.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:手机号码核查结果
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-10 13:51:32
 */
public class ExtWlPyzxMobileCheckDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**客户主键*/
	private Long fkIntoCustId;

	/**姓名核查结果,有：一致、基本一致、不一致、无法核查*/
	private String nameCheckResult;

	/**证件号码核查结果，有：一致、不一致、无法核查*/
	private String documentNoCheckResult;

	/**手机号码核查结果，有：一致*/
	private String phoneCheckResult;

	/**运营商 1：中国电信 2：中国移动.3:中国联通*/
	private String operator;

	/**手机号码归属地*/
	private String areaInfo;

	/** 手机号码*/
	private String ext1;

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
	 *方法: 获得fkIntoCustId
	 *@return: java.lang.Long  fkIntoCustId
	 */
	public Long getFkIntoCustId(){
		return this.fkIntoCustId;
	}

	/**
	 *方法: 设置fkIntoCustId
	 *@param: java.lang.Long  fkIntoCustId
	 */
	public void setFkIntoCustId(Long fkIntoCustId){
		this.fkIntoCustId = fkIntoCustId;
	}

	/**
	 *方法: 获得nameCheckResult
	 *@return: java.lang.String  nameCheckResult
	 */
	public String getNameCheckResult(){
		return this.nameCheckResult;
	}

	/**
	 *方法: 设置nameCheckResult
	 *@param: java.lang.String  nameCheckResult
	 */
	public void setNameCheckResult(String nameCheckResult){
		this.nameCheckResult = nameCheckResult;
	}

	/**
	 *方法: 获得documentNoCheckResult
	 *@return: java.lang.String  documentNoCheckResult
	 */
	public String getDocumentNoCheckResult(){
		return this.documentNoCheckResult;
	}

	/**
	 *方法: 设置documentNoCheckResult
	 *@param: java.lang.String  documentNoCheckResult
	 */
	public void setDocumentNoCheckResult(String documentNoCheckResult){
		this.documentNoCheckResult = documentNoCheckResult;
	}

	/**
	 *方法: 获得phoneCheckResult
	 *@return: java.lang.String  phoneCheckResult
	 */
	public String getPhoneCheckResult(){
		return this.phoneCheckResult;
	}

	/**
	 *方法: 设置phoneCheckResult
	 *@param: java.lang.String  phoneCheckResult
	 */
	public void setPhoneCheckResult(String phoneCheckResult){
		this.phoneCheckResult = phoneCheckResult;
	}

	/**
	 *方法: 获得operator
	 *@return: java.lang.String  operator
	 */
	public String getOperator(){
		return this.operator;
	}

	/**
	 *方法: 设置operator
	 *@param: java.lang.String  operator
	 */
	public void setOperator(String operator){
		this.operator = operator;
	}

	/**
	 *方法: 获得areaInfo
	 *@return: java.lang.String  areaInfo
	 */
	public String getAreaInfo(){
		return this.areaInfo;
	}

	/**
	 *方法: 设置areaInfo
	 *@param: java.lang.String  areaInfo
	 */
	public void setAreaInfo(String areaInfo){
		this.areaInfo = areaInfo;
	}

	/**
	 *方法: 获得ext1
	 *@return: java.lang.String  ext1
	 */
	public String getExt1(){
		return this.ext1;
	}

	/**
	 *方法: 设置ext1
	 *@param: java.lang.String  ext1
	 */
	public void setExt1(String ext1){
		this.ext1 = ext1;
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

}