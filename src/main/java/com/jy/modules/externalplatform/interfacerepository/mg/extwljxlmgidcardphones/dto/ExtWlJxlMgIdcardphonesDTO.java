package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardphones.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:身份证号码存疑绑定其他手机表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-14 13:56:42
 */
public class ExtWlJxlMgIdcardphonesDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**蜜罐主表ID*/
	private String userGridId;

	/**该号码所属省份*/
	private String suspPhoneProvince;

	/**该号码所属运营商*/
	private String suspPhoneOperator;

	/**该号码最后一次绑定时间*/
	private String suspUpdt;

	/**存疑手机号码*/
	private String suspPhone;

	/**该号码所在地区*/
	private String suspPhoneCity;

	/**创建人*/
	private Long createBy;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改人*/
	private Long modifyBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**是否有效1.有效 0.无效*/
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
	 *方法: 获得userGridId
	 *@return: java.lang.String  userGridId
	 */
	public String getUserGridId(){
		return this.userGridId;
	}

	/**
	 *方法: 设置userGridId
	 *@param: java.lang.String  userGridId
	 */
	public void setUserGridId(String userGridId){
		this.userGridId = userGridId;
	}

	/**
	 *方法: 获得suspPhoneProvince
	 *@return: java.lang.String  suspPhoneProvince
	 */
	public String getSuspPhoneProvince(){
		return this.suspPhoneProvince;
	}

	/**
	 *方法: 设置suspPhoneProvince
	 *@param: java.lang.String  suspPhoneProvince
	 */
	public void setSuspPhoneProvince(String suspPhoneProvince){
		this.suspPhoneProvince = suspPhoneProvince;
	}

	/**
	 *方法: 获得suspPhoneOperator
	 *@return: java.lang.String  suspPhoneOperator
	 */
	public String getSuspPhoneOperator(){
		return this.suspPhoneOperator;
	}

	/**
	 *方法: 设置suspPhoneOperator
	 *@param: java.lang.String  suspPhoneOperator
	 */
	public void setSuspPhoneOperator(String suspPhoneOperator){
		this.suspPhoneOperator = suspPhoneOperator;
	}

	/**
	 *方法: 获得suspUpdt
	 *@return: java.lang.String  suspUpdt
	 */
	public String getSuspUpdt(){
		return this.suspUpdt;
	}

	/**
	 *方法: 设置suspUpdt
	 *@param: java.lang.String  suspUpdt
	 */
	public void setSuspUpdt(String suspUpdt){
		this.suspUpdt = suspUpdt;
	}

	/**
	 *方法: 获得suspPhone
	 *@return: java.lang.String  suspPhone
	 */
	public String getSuspPhone(){
		return this.suspPhone;
	}

	/**
	 *方法: 设置suspPhone
	 *@param: java.lang.String  suspPhone
	 */
	public void setSuspPhone(String suspPhone){
		this.suspPhone = suspPhone;
	}

	/**
	 *方法: 获得suspPhoneCity
	 *@return: java.lang.String  suspPhoneCity
	 */
	public String getSuspPhoneCity(){
		return this.suspPhoneCity;
	}

	/**
	 *方法: 设置suspPhoneCity
	 *@param: java.lang.String  suspPhoneCity
	 */
	public void setSuspPhoneCity(String suspPhoneCity){
		this.suspPhoneCity = suspPhoneCity;
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