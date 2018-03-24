package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportspec.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:网络金融版个人信用报告-特殊交易信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-05 10:08:39
 */
public class ExtPersonalReportSpecDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**记录来源*/
	private java.lang.String recordSource;

	/**记录类型*/
	private java.lang.String recordType;

	/**信息获取日期*/
	private java.lang.String infoDate;

	/**主表关联ID*/
	private java.lang.Long personalCreditReport;

	/**发生日期*/
	private java.lang.String happenDate;

	/**变更月数*/
	private java.lang.String changeDate;

	/**发生金额*/
	private java.lang.String happenAmount;

	/**明细信息*/
	private java.lang.String info;

	/**OPTLOCK*/
	private java.lang.Long optlock;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;
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
	 *方法: 获得recordSource
	 *@return: java.lang.String  recordSource
	 */
	public java.lang.String getRecordSource(){
		return this.recordSource;
	}

	/**
	 *方法: 设置recordSource
	 *@param: java.lang.String  recordSource
	 */
	public void setRecordSource(java.lang.String recordSource){
		this.recordSource = recordSource;
	}

	/**
	 *方法: 获得recordType
	 *@return: java.lang.String  recordType
	 */
	public java.lang.String getRecordType(){
		return this.recordType;
	}

	/**
	 *方法: 设置recordType
	 *@param: java.lang.String  recordType
	 */
	public void setRecordType(java.lang.String recordType){
		this.recordType = recordType;
	}

	/**
	 *方法: 获得infoDate
	 *@return: java.lang.String  infoDate
	 */
	public java.lang.String getInfoDate(){
		return this.infoDate;
	}

	/**
	 *方法: 设置infoDate
	 *@param: java.lang.String  infoDate
	 */
	public void setInfoDate(java.lang.String infoDate){
		this.infoDate = infoDate;
	}

	/**
	 *方法: 获得personalCreditReport
	 *@return: java.lang.Long  personalCreditReport
	 */
	public java.lang.Long getPersonalCreditReport(){
		return this.personalCreditReport;
	}

	/**
	 *方法: 设置personalCreditReport
	 *@param: java.lang.Long  personalCreditReport
	 */
	public void setPersonalCreditReport(java.lang.Long personalCreditReport){
		this.personalCreditReport = personalCreditReport;
	}

	/**
	 *方法: 获得happenDate
	 *@return: java.lang.String  happenDate
	 */
	public java.lang.String getHappenDate(){
		return this.happenDate;
	}

	/**
	 *方法: 设置happenDate
	 *@param: java.lang.String  happenDate
	 */
	public void setHappenDate(java.lang.String happenDate){
		this.happenDate = happenDate;
	}

	/**
	 *方法: 获得changeDate
	 *@return: java.lang.String  changeDate
	 */
	public java.lang.String getChangeDate(){
		return this.changeDate;
	}

	/**
	 *方法: 设置changeDate
	 *@param: java.lang.String  changeDate
	 */
	public void setChangeDate(java.lang.String changeDate){
		this.changeDate = changeDate;
	}

	/**
	 *方法: 获得happenAmount
	 *@return: java.lang.String  happenAmount
	 */
	public java.lang.String getHappenAmount(){
		return this.happenAmount;
	}

	/**
	 *方法: 设置happenAmount
	 *@param: java.lang.String  happenAmount
	 */
	public void setHappenAmount(java.lang.String happenAmount){
		this.happenAmount = happenAmount;
	}

	/**
	 *方法: 获得info
	 *@return: java.lang.String  info
	 */
	public java.lang.String getInfo(){
		return this.info;
	}

	/**
	 *方法: 设置info
	 *@param: java.lang.String  info
	 */
	public void setInfo(java.lang.String info){
		this.info = info;
	}

	/**
	 *方法: 获得optlock
	 *@return: java.lang.Long  optlock
	 */
	public java.lang.Long getOptlock(){
		return this.optlock;
	}

	/**
	 *方法: 设置optlock
	 *@param: java.lang.Long  optlock
	 */
	public void setOptlock(java.lang.Long optlock){
		this.optlock = optlock;
	}

	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.sql.Timestamp createTime) {
		this.createTime = createTime;
	}

	public java.sql.Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(java.sql.Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

}