package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtele.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行原版(公共记录_电信欠费信息表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:50:54
 */
public class ExtWlShPrecordTeleDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**征信主表ID*/
	private Long fkReportId;

	/**电信运营商*/
	private String telco;

	/**业务类型*/
	private String business;

	/**记账年月*/
	private String recordTime;

	/**业务开通时间*/
	private String businessTime;

	/**欠费金额*/
	private String amount;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**数据有效性*/
	private String validateState;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long updateBy;

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
	 *方法: 获得fkReportId
	 *@return: java.lang.Long  fkReportId
	 */
	public Long getFkReportId(){
		return this.fkReportId;
	}

	/**
	 *方法: 设置fkReportId
	 *@param: java.lang.Long  fkReportId
	 */
	public void setFkReportId(Long fkReportId){
		this.fkReportId = fkReportId;
	}

	/**
	 *方法: 获得telco
	 *@return: java.lang.String  telco
	 */
	public String getTelco(){
		return this.telco;
	}

	/**
	 *方法: 设置telco
	 *@param: java.lang.String  telco
	 */
	public void setTelco(String telco){
		this.telco = telco;
	}

	/**
	 *方法: 获得business
	 *@return: java.lang.String  business
	 */
	public String getBusiness(){
		return this.business;
	}

	/**
	 *方法: 设置business
	 *@param: java.lang.String  business
	 */
	public void setBusiness(String business){
		this.business = business;
	}

	/**
	 *方法: 获得recordTime
	 *@return: java.lang.String  recordTime
	 */
	public String getRecordTime(){
		return this.recordTime;
	}

	/**
	 *方法: 设置recordTime
	 *@param: java.lang.String  recordTime
	 */
	public void setRecordTime(String recordTime){
		this.recordTime = recordTime;
	}

	/**
	 *方法: 获得businessTime
	 *@return: java.lang.String  businessTime
	 */
	public String getBusinessTime(){
		return this.businessTime;
	}

	/**
	 *方法: 设置businessTime
	 *@param: java.lang.String  businessTime
	 */
	public void setBusinessTime(String businessTime){
		this.businessTime = businessTime;
	}

	/**
	 *方法: 获得amount
	 *@return: java.lang.String  amount
	 */
	public String getAmount(){
		return this.amount;
	}

	/**
	 *方法: 设置amount
	 *@param: java.lang.String  amount
	 */
	public void setAmount(String amount){
		this.amount = amount;
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
	 *方法: 获得updateBy
	 *@return: java.lang.Long  updateBy
	 */
	public Long getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置updateBy
	 *@param: java.lang.Long  updateBy
	 */
	public void setUpdateBy(Long updateBy){
		this.updateBy = updateBy;
	}

}