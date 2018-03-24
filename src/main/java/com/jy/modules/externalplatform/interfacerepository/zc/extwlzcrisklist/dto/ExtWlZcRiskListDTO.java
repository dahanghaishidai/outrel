package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcrisklist.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:致诚风险名单结果
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 13:39:56
 */
public class ExtWlZcRiskListDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**主表主键*/
	private String keyId;

	/**数据类型*/
	private String dataType;

	/**数据类型码值*/
	private String dataTypeCode;

	/**风险数据项类型*/
	private String riskItemType;

	/**风险数据项类型码*/
	private String riskItemTypeCode;

	/**风险数据项值*/
	private String riskValue;

	/**风险明细*/
	private String riskDetail;

	/**风险明细码*/
	private String riskDetailCode;

	/**风险最近时间*/
	private String riskTime;

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
	 *方法: 获得dataType
	 *@return: java.lang.String  dataType
	 */
	public String getDataType(){
		return this.dataType;
	}

	/**
	 *方法: 设置dataType
	 *@param: java.lang.String  dataType
	 */
	public void setDataType(String dataType){
		this.dataType = dataType;
	}

	/**
	 *方法: 获得dataTypeCode
	 *@return: java.lang.String  dataTypeCode
	 */
	public String getDataTypeCode(){
		return this.dataTypeCode;
	}

	/**
	 *方法: 设置dataTypeCode
	 *@param: java.lang.String  dataTypeCode
	 */
	public void setDataTypeCode(String dataTypeCode){
		this.dataTypeCode = dataTypeCode;
	}

	/**
	 *方法: 获得riskItemType
	 *@return: java.lang.String  riskItemType
	 */
	public String getRiskItemType(){
		return this.riskItemType;
	}

	/**
	 *方法: 设置riskItemType
	 *@param: java.lang.String  riskItemType
	 */
	public void setRiskItemType(String riskItemType){
		this.riskItemType = riskItemType;
	}

	/**
	 *方法: 获得riskItemTypeCode
	 *@return: java.lang.String  riskItemTypeCode
	 */
	public String getRiskItemTypeCode(){
		return this.riskItemTypeCode;
	}

	/**
	 *方法: 设置riskItemTypeCode
	 *@param: java.lang.String  riskItemTypeCode
	 */
	public void setRiskItemTypeCode(String riskItemTypeCode){
		this.riskItemTypeCode = riskItemTypeCode;
	}

	/**
	 *方法: 获得riskValue
	 *@return: java.lang.String  riskValue
	 */
	public String getRiskValue(){
		return this.riskValue;
	}

	/**
	 *方法: 设置riskValue
	 *@param: java.lang.String  riskValue
	 */
	public void setRiskValue(String riskValue){
		this.riskValue = riskValue;
	}

	/**
	 *方法: 获得riskDetail
	 *@return: java.lang.String  riskDetail
	 */
	public String getRiskDetail(){
		return this.riskDetail;
	}

	/**
	 *方法: 设置riskDetail
	 *@param: java.lang.String  riskDetail
	 */
	public void setRiskDetail(String riskDetail){
		this.riskDetail = riskDetail;
	}

	/**
	 *方法: 获得riskDetailCode
	 *@return: java.lang.String  riskDetailCode
	 */
	public String getRiskDetailCode(){
		return this.riskDetailCode;
	}

	/**
	 *方法: 设置riskDetailCode
	 *@param: java.lang.String  riskDetailCode
	 */
	public void setRiskDetailCode(String riskDetailCode){
		this.riskDetailCode = riskDetailCode;
	}

	/**
	 *方法: 获得riskTime
	 *@return: java.lang.String  riskTime
	 */
	public String getRiskTime(){
		return this.riskTime;
	}

	/**
	 *方法: 设置riskTime
	 *@param: java.lang.String  riskTime
	 */
	public void setRiskTime(String riskTime){
		this.riskTime = riskTime;
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