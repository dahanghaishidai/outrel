package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilestatus.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:手机号码状态查询结果
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-10 13:51:42
 */
public class ExtWlPyzxMobileStatusDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**客户主键*/
	private Long fkIntoCustId;

	/**注销时间，可能为空，格式为YYYYMMDD */
	private String cancelTime;

	/**手机号码在网时长，如在网时长不足1个月，1-2个月，3-6月，7-12个月等 */
	private String timeLength;

	/**手机状态 1：正常在用 2: 停机 3：未启用 4：已销号*/
	private String phoneStatus;

	/**运营商 1：中国电信 2：中国移动(暂不支持) .3:中国联通*/
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
	 *方法: 获得cancelTime
	 *@return: java.lang.String  cancelTime
	 */
	public String getCancelTime(){
		return this.cancelTime;
	}

	/**
	 *方法: 设置cancelTime
	 *@param: java.lang.String  cancelTime
	 */
	public void setCancelTime(String cancelTime){
		this.cancelTime = cancelTime;
	}

	/**
	 *方法: 获得timeLength
	 *@return: java.lang.String  timeLength
	 */
	public String getTimeLength(){
		return this.timeLength;
	}

	/**
	 *方法: 设置timeLength
	 *@param: java.lang.String  timeLength
	 */
	public void setTimeLength(String timeLength){
		this.timeLength = timeLength;
	}

	/**
	 *方法: 获得phoneStatus
	 *@return: java.lang.String  phoneStatus
	 */
	public String getPhoneStatus(){
		return this.phoneStatus;
	}

	/**
	 *方法: 设置phoneStatus
	 *@param: java.lang.String  phoneStatus
	 */
	public void setPhoneStatus(String phoneStatus){
		this.phoneStatus = phoneStatus;
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