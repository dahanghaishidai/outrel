package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxphonerevcheck.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:电话反查信息
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-10 13:51:52
 */
public class ExtWlPyzxPhoneRevcheckDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**客户进件关联ID*/
	private Long fkIntoCustId;

	/**反查结果类型 1-固话  2-手机*/
	private String resultType;

	/**此移动电话对应的联系人姓名*/
	private String contactName;

	/**移动电话号码归属地*/
	private String mobileAreaDesc;

	/**联系地址*/
	private String address;

	/**移动电话号码类型*/
	private String mobileType;

	/**反查类型 1-个人手机号码核查  2-企业手机号码核查*/
	private String checkType;

	/**机主名称，可能为企业名称，也可能为个人*/
	private String ownerName;

	/**行政区划代码*/
	private String areaCode;

	/**行政区划代码对应的行政区划名称*/
	private String areaDesc;

	/**预留字段*/
	private String ext1;

	/**电话号码*/
	private String phoneNumber;

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
	 *方法: 获得resultType
	 *@return: java.lang.String  resultType
	 */
	public String getResultType(){
		return this.resultType;
	}

	/**
	 *方法: 设置resultType
	 *@param: java.lang.String  resultType
	 */
	public void setResultType(String resultType){
		this.resultType = resultType;
	}

	/**
	 *方法: 获得contactName
	 *@return: java.lang.String  contactName
	 */
	public String getContactName(){
		return this.contactName;
	}

	/**
	 *方法: 设置contactName
	 *@param: java.lang.String  contactName
	 */
	public void setContactName(String contactName){
		this.contactName = contactName;
	}

	/**
	 *方法: 获得mobileAreaDesc
	 *@return: java.lang.String  mobileAreaDesc
	 */
	public String getMobileAreaDesc(){
		return this.mobileAreaDesc;
	}

	/**
	 *方法: 设置mobileAreaDesc
	 *@param: java.lang.String  mobileAreaDesc
	 */
	public void setMobileAreaDesc(String mobileAreaDesc){
		this.mobileAreaDesc = mobileAreaDesc;
	}

	/**
	 *方法: 获得address
	 *@return: java.lang.String  address
	 */
	public String getAddress(){
		return this.address;
	}

	/**
	 *方法: 设置address
	 *@param: java.lang.String  address
	 */
	public void setAddress(String address){
		this.address = address;
	}

	/**
	 *方法: 获得mobileType
	 *@return: java.lang.String  mobileType
	 */
	public String getMobileType(){
		return this.mobileType;
	}

	/**
	 *方法: 设置mobileType
	 *@param: java.lang.String  mobileType
	 */
	public void setMobileType(String mobileType){
		this.mobileType = mobileType;
	}

	/**
	 *方法: 获得checkType
	 *@return: java.lang.String  checkType
	 */
	public String getCheckType(){
		return this.checkType;
	}

	/**
	 *方法: 设置checkType
	 *@param: java.lang.String  checkType
	 */
	public void setCheckType(String checkType){
		this.checkType = checkType;
	}

	/**
	 *方法: 获得ownerName
	 *@return: java.lang.String  ownerName
	 */
	public String getOwnerName(){
		return this.ownerName;
	}

	/**
	 *方法: 设置ownerName
	 *@param: java.lang.String  ownerName
	 */
	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;
	}

	/**
	 *方法: 获得areaCode
	 *@return: java.lang.String  areaCode
	 */
	public String getAreaCode(){
		return this.areaCode;
	}

	/**
	 *方法: 设置areaCode
	 *@param: java.lang.String  areaCode
	 */
	public void setAreaCode(String areaCode){
		this.areaCode = areaCode;
	}

	/**
	 *方法: 获得areaDesc
	 *@return: java.lang.String  areaDesc
	 */
	public String getAreaDesc(){
		return this.areaDesc;
	}

	/**
	 *方法: 设置areaDesc
	 *@param: java.lang.String  areaDesc
	 */
	public void setAreaDesc(String areaDesc){
		this.areaDesc = areaDesc;
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
	 *方法: 获得phoneNumber
	 *@return: java.lang.String  phoneNumber
	 */
	public String getPhoneNumber(){
		return this.phoneNumber;
	}

	/**
	 *方法: 设置phoneNumber
	 *@param: java.lang.String  phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
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