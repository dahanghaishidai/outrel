package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserbasic.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:聚信立蜜罐用户基本信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-14 13:55:27
 */
public class ExtWlJxlMgUserBasicDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**蜜罐ID*/
	private String userGridId;

	/**身份证号码*/
	private String userIdcard;

	/**手机号码*/
	private String userPhone;

	/**身份证是否有效*/
	private String userIdcardValid;

	/**手机号归属地:省份*/
	private String userPhoneProvince;

	/**用户出生地:城市*/
	private String userCity;

	/**手机号归属地:城市*/
	private String userPhoneCity;

	/**用户出生地:区县*/
	private String userRegion;

	/**运营商类别*/
	private String userPhoneOperator;

	/**年龄*/
	private Long userAge;

	/**性别*/
	private String userGender;

	/**用户出生地:省份*/
	private String userProvince;

	/**姓名*/
	private String userName;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private Long createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**修改人*/
	private Long modifyBy;

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
	 *方法: 获得userIdcard
	 *@return: java.lang.String  userIdcard
	 */
	public String getUserIdcard(){
		return this.userIdcard;
	}

	/**
	 *方法: 设置userIdcard
	 *@param: java.lang.String  userIdcard
	 */
	public void setUserIdcard(String userIdcard){
		this.userIdcard = userIdcard;
	}

	/**
	 *方法: 获得userPhone
	 *@return: java.lang.String  userPhone
	 */
	public String getUserPhone(){
		return this.userPhone;
	}

	/**
	 *方法: 设置userPhone
	 *@param: java.lang.String  userPhone
	 */
	public void setUserPhone(String userPhone){
		this.userPhone = userPhone;
	}

	/**
	 *方法: 获得userIdcardValid
	 *@return: java.lang.String  userIdcardValid
	 */
	public String getUserIdcardValid(){
		return this.userIdcardValid;
	}

	/**
	 *方法: 设置userIdcardValid
	 *@param: java.lang.String  userIdcardValid
	 */
	public void setUserIdcardValid(String userIdcardValid){
		this.userIdcardValid = userIdcardValid;
	}

	/**
	 *方法: 获得userPhoneProvince
	 *@return: java.lang.String  userPhoneProvince
	 */
	public String getUserPhoneProvince(){
		return this.userPhoneProvince;
	}

	/**
	 *方法: 设置userPhoneProvince
	 *@param: java.lang.String  userPhoneProvince
	 */
	public void setUserPhoneProvince(String userPhoneProvince){
		this.userPhoneProvince = userPhoneProvince;
	}

	/**
	 *方法: 获得userCity
	 *@return: java.lang.String  userCity
	 */
	public String getUserCity(){
		return this.userCity;
	}

	/**
	 *方法: 设置userCity
	 *@param: java.lang.String  userCity
	 */
	public void setUserCity(String userCity){
		this.userCity = userCity;
	}

	/**
	 *方法: 获得userPhoneCity
	 *@return: java.lang.String  userPhoneCity
	 */
	public String getUserPhoneCity(){
		return this.userPhoneCity;
	}

	/**
	 *方法: 设置userPhoneCity
	 *@param: java.lang.String  userPhoneCity
	 */
	public void setUserPhoneCity(String userPhoneCity){
		this.userPhoneCity = userPhoneCity;
	}

	/**
	 *方法: 获得userRegion
	 *@return: java.lang.String  userRegion
	 */
	public String getUserRegion(){
		return this.userRegion;
	}

	/**
	 *方法: 设置userRegion
	 *@param: java.lang.String  userRegion
	 */
	public void setUserRegion(String userRegion){
		this.userRegion = userRegion;
	}

	/**
	 *方法: 获得userPhoneOperator
	 *@return: java.lang.String  userPhoneOperator
	 */
	public String getUserPhoneOperator(){
		return this.userPhoneOperator;
	}

	/**
	 *方法: 设置userPhoneOperator
	 *@param: java.lang.String  userPhoneOperator
	 */
	public void setUserPhoneOperator(String userPhoneOperator){
		this.userPhoneOperator = userPhoneOperator;
	}

	/**
	 *方法: 获得userAge
	 *@return: java.lang.Long  userAge
	 */
	public Long getUserAge(){
		return this.userAge;
	}

	/**
	 *方法: 设置userAge
	 *@param: java.lang.Long  userAge
	 */
	public void setUserAge(Long userAge){
		this.userAge = userAge;
	}

	/**
	 *方法: 获得userGender
	 *@return: java.lang.String  userGender
	 */
	public String getUserGender(){
		return this.userGender;
	}

	/**
	 *方法: 设置userGender
	 *@param: java.lang.String  userGender
	 */
	public void setUserGender(String userGender){
		this.userGender = userGender;
	}

	/**
	 *方法: 获得userProvince
	 *@return: java.lang.String  userProvince
	 */
	public String getUserProvince(){
		return this.userProvince;
	}

	/**
	 *方法: 设置userProvince
	 *@param: java.lang.String  userProvince
	 */
	public void setUserProvince(String userProvince){
		this.userProvince = userProvince;
	}

	/**
	 *方法: 获得userName
	 *@return: java.lang.String  userName
	 */
	public String getUserName(){
		return this.userName;
	}

	/**
	 *方法: 设置userName
	 *@param: java.lang.String  userName
	 */
	public void setUserName(String userName){
		this.userName = userName;
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

}