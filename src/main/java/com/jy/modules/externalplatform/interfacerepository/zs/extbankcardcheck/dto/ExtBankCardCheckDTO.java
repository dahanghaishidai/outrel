package com.jy.modules.externalplatform.interfacerepository.zs.extbankcardcheck.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:银行卡验证表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-14 11:35:32
 */
public class ExtBankCardCheckDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**银行卡户名*/
	private java.lang.String name;

	/**证件类型*/
	private java.lang.String idcardType;

	/**证件号码*/
	private java.lang.String idcard;

	/**银行卡账号*/
	private java.lang.String bankcardNum;

	/**银行预留手机号*/
	private java.lang.String mobile;

	/**银行卡类型*/
	private java.lang.String bankcardType;

	/**安全码*/
	private java.lang.String cvv2;

	/**银行卡有效截止日期*/
	private java.lang.String expireDate;

	/**业务码*/
	private java.lang.String code;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private java.lang.Long createBy;

	/**数据有效性(1：有效，0：无效)*/
	private java.lang.String validateState;

	/**产品编码*/
	private java.lang.String prodCode;

	/**机构编码*/
	private java.lang.String orgCode;

	/**系统编码*/
	private java.lang.String sysCode;

	/**返回码 1：查有 2：查无 3：查询报错 4：解析错误*/
	private java.lang.String retcode;

	/**返回错误信息*/
	private java.lang.String errormsg;

	/**接口日志ID*/
	private java.lang.String interfaceId;

	/**MODIFY_TIME*/
	private java.sql.Timestamp modifyTime;

	/**备注*/
	private java.lang.String remark;

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
	 *方法: 获得name
	 *@return: java.lang.String  name
	 */
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置name
	 *@param: java.lang.String  name
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}

	/**
	 *方法: 获得idcardType
	 *@return: java.lang.String  idcardType
	 */
	public java.lang.String getIdcardType(){
		return this.idcardType;
	}

	/**
	 *方法: 设置idcardType
	 *@param: java.lang.String  idcardType
	 */
	public void setIdcardType(java.lang.String idcardType){
		this.idcardType = idcardType;
	}

	/**
	 *方法: 获得idcard
	 *@return: java.lang.String  idcard
	 */
	public java.lang.String getIdcard(){
		return this.idcard;
	}

	/**
	 *方法: 设置idcard
	 *@param: java.lang.String  idcard
	 */
	public void setIdcard(java.lang.String idcard){
		this.idcard = idcard;
	}

	/**
	 *方法: 获得bankcardNum
	 *@return: java.lang.String  bankcardNum
	 */
	public java.lang.String getBankcardNum(){
		return this.bankcardNum;
	}

	/**
	 *方法: 设置bankcardNum
	 *@param: java.lang.String  bankcardNum
	 */
	public void setBankcardNum(java.lang.String bankcardNum){
		this.bankcardNum = bankcardNum;
	}

	/**
	 *方法: 获得mobile
	 *@return: java.lang.String  mobile
	 */
	public java.lang.String getMobile(){
		return this.mobile;
	}

	/**
	 *方法: 设置mobile
	 *@param: java.lang.String  mobile
	 */
	public void setMobile(java.lang.String mobile){
		this.mobile = mobile;
	}

	/**
	 *方法: 获得bankcardType
	 *@return: java.lang.String  bankcardType
	 */
	public java.lang.String getBankcardType(){
		return this.bankcardType;
	}

	/**
	 *方法: 设置bankcardType
	 *@param: java.lang.String  bankcardType
	 */
	public void setBankcardType(java.lang.String bankcardType){
		this.bankcardType = bankcardType;
	}

	/**
	 *方法: 获得cvv2
	 *@return: java.lang.String  cvv2
	 */
	public java.lang.String getCvv2(){
		return this.cvv2;
	}

	/**
	 *方法: 设置cvv2
	 *@param: java.lang.String  cvv2
	 */
	public void setCvv2(java.lang.String cvv2){
		this.cvv2 = cvv2;
	}

	/**
	 *方法: 获得expireDate
	 *@return: java.lang.String  expireDate
	 */
	public java.lang.String getExpireDate(){
		return this.expireDate;
	}

	/**
	 *方法: 设置expireDate
	 *@param: java.lang.String  expireDate
	 */
	public void setExpireDate(java.lang.String expireDate){
		this.expireDate = expireDate;
	}

	/**
	 *方法: 获得code
	 *@return: java.lang.String  code
	 */
	public java.lang.String getCode(){
		return this.code;
	}

	/**
	 *方法: 设置code
	 *@param: java.lang.String  code
	 */
	public void setCode(java.lang.String code){
		this.code = code;
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
	public java.lang.Long getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置createBy
	 *@param: java.lang.Long  createBy
	 */
	public void setCreateBy(java.lang.Long createBy){
		this.createBy = createBy;
	}

	/**
	 *方法: 获得validateState
	 *@return: java.lang.String  validateState
	 */
	public java.lang.String getValidateState(){
		return this.validateState;
	}

	/**
	 *方法: 设置validateState
	 *@param: java.lang.String  validateState
	 */
	public void setValidateState(java.lang.String validateState){
		this.validateState = validateState;
	}

	/**
	 *方法: 获得prodCode
	 *@return: java.lang.String  prodCode
	 */
	public java.lang.String getProdCode(){
		return this.prodCode;
	}

	/**
	 *方法: 设置prodCode
	 *@param: java.lang.String  prodCode
	 */
	public void setProdCode(java.lang.String prodCode){
		this.prodCode = prodCode;
	}

	/**
	 *方法: 获得orgCode
	 *@return: java.lang.String  orgCode
	 */
	public java.lang.String getOrgCode(){
		return this.orgCode;
	}

	/**
	 *方法: 设置orgCode
	 *@param: java.lang.String  orgCode
	 */
	public void setOrgCode(java.lang.String orgCode){
		this.orgCode = orgCode;
	}

	/**
	 *方法: 获得sysCode
	 *@return: java.lang.String  sysCode
	 */
	public java.lang.String getSysCode(){
		return this.sysCode;
	}

	/**
	 *方法: 设置sysCode
	 *@param: java.lang.String  sysCode
	 */
	public void setSysCode(java.lang.String sysCode){
		this.sysCode = sysCode;
	}

	/**
	 *方法: 获得retcode
	 *@return: java.lang.String  retcode
	 */
	public java.lang.String getRetcode(){
		return this.retcode;
	}

	/**
	 *方法: 设置retcode
	 *@param: java.lang.String  retcode
	 */
	public void setRetcode(java.lang.String retcode){
		this.retcode = retcode;
	}

	/**
	 *方法: 获得errormsg
	 *@return: java.lang.String  errormsg
	 */
	public java.lang.String getErrormsg(){
		return this.errormsg;
	}

	/**
	 *方法: 设置errormsg
	 *@param: java.lang.String  errormsg
	 */
	public void setErrormsg(java.lang.String errormsg){
		this.errormsg = errormsg;
	}

	/**
	 *方法: 获得interfaceId
	 *@return: java.lang.String  interfaceId
	 */
	public java.lang.String getInterfaceId(){
		return this.interfaceId;
	}

	/**
	 *方法: 设置interfaceId
	 *@param: java.lang.String  interfaceId
	 */
	public void setInterfaceId(java.lang.String interfaceId){
		this.interfaceId = interfaceId;
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
	 *方法: 获得remark
	 *@return: java.lang.String  remark
	 */
	public java.lang.String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置remark
	 *@param: java.lang.String  remark
	 */
	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}

}