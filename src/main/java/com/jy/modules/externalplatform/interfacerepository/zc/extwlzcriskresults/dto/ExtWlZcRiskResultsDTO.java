package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcriskresults.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:致诚风险项记录表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 13:40:28
 */
public class ExtWlZcRiskResultsDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private Long id;

	/**主表主键*/
	private String keyId;

	/**命中项码*/
	private String riskItemTypeCode;

	/**命中内容*/
	private String riskItemValue;

	/**风险类别码*/
	private String riskTypeCode;

	/**风险明细*/
	private String riskDetail;

	/**风险最近时间*/
	private String riskTime;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

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
	 *方法: 获得riskItemValue
	 *@return: java.lang.String  riskItemValue
	 */
	public String getRiskItemValue(){
		return this.riskItemValue;
	}

	/**
	 *方法: 设置riskItemValue
	 *@param: java.lang.String  riskItemValue
	 */
	public void setRiskItemValue(String riskItemValue){
		this.riskItemValue = riskItemValue;
	}

	/**
	 *方法: 获得riskTypeCode
	 *@return: java.lang.String  riskTypeCode
	 */
	public String getRiskTypeCode(){
		return this.riskTypeCode;
	}

	/**
	 *方法: 设置riskTypeCode
	 *@param: java.lang.String  riskTypeCode
	 */
	public void setRiskTypeCode(String riskTypeCode){
		this.riskTypeCode = riskTypeCode;
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

}