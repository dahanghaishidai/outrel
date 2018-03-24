package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtdishonesty.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:百度金融法院失信表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-13 16:41:00
 */
public class ExtWlBaiduCourtDishonestyDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**关联主表主键*/
	private String keyId;

	/**执行义务*/
	private String duty;

	/**执行情况*/
	private String performance;

	/**公开日期*/
	private String publishDate;

	/**案件编号*/
	private String caseNo;

	/**违反条例*/
	private String disruptTypeName;

	/**省份*/
	private String province;

	/**判决法院*/
	private String court;

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
	 *方法: 获得duty
	 *@return: java.lang.String  duty
	 */
	public String getDuty(){
		return this.duty;
	}

	/**
	 *方法: 设置duty
	 *@param: java.lang.String  duty
	 */
	public void setDuty(String duty){
		this.duty = duty;
	}

	/**
	 *方法: 获得performance
	 *@return: java.lang.String  performance
	 */
	public String getPerformance(){
		return this.performance;
	}

	/**
	 *方法: 设置performance
	 *@param: java.lang.String  performance
	 */
	public void setPerformance(String performance){
		this.performance = performance;
	}

	/**
	 *方法: 获得publishDate
	 *@return: java.lang.String  publishDate
	 */
	public String getPublishDate(){
		return this.publishDate;
	}

	/**
	 *方法: 设置publishDate
	 *@param: java.lang.String  publishDate
	 */
	public void setPublishDate(String publishDate){
		this.publishDate = publishDate;
	}

	/**
	 *方法: 获得caseNo
	 *@return: java.lang.String  caseNo
	 */
	public String getCaseNo(){
		return this.caseNo;
	}

	/**
	 *方法: 设置caseNo
	 *@param: java.lang.String  caseNo
	 */
	public void setCaseNo(String caseNo){
		this.caseNo = caseNo;
	}

	/**
	 *方法: 获得disruptTypeName
	 *@return: java.lang.String  disruptTypeName
	 */
	public String getDisruptTypeName(){
		return this.disruptTypeName;
	}

	/**
	 *方法: 设置disruptTypeName
	 *@param: java.lang.String  disruptTypeName
	 */
	public void setDisruptTypeName(String disruptTypeName){
		this.disruptTypeName = disruptTypeName;
	}

	/**
	 *方法: 获得province
	 *@return: java.lang.String  province
	 */
	public String getProvince(){
		return this.province;
	}

	/**
	 *方法: 设置province
	 *@param: java.lang.String  province
	 */
	public void setProvince(String province){
		this.province = province;
	}

	/**
	 *方法: 获得court
	 *@return: java.lang.String  court
	 */
	public String getCourt(){
		return this.court;
	}

	/**
	 *方法: 设置court
	 *@param: java.lang.String  court
	 */
	public void setCourt(String court){
		this.court = court;
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