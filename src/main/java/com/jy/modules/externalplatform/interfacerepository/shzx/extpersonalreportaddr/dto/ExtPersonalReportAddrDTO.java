package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportaddr.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:网络金融版个人信用报告-地址
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-05 10:08:24
 */
public class ExtPersonalReportAddrDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**地址序号*/
	private java.lang.String addressNumber;

	/**地址明细*/
	private java.lang.String addressInfo;

	/**信息获取日期*/
	private java.lang.String infoDate;

	/**主表关联ID*/
	private java.lang.Long personalCreditReport;

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
	 *方法: 获得addressNumber
	 *@return: java.lang.String  addressNumber
	 */
	public java.lang.String getAddressNumber(){
		return this.addressNumber;
	}

	/**
	 *方法: 设置addressNumber
	 *@param: java.lang.String  addressNumber
	 */
	public void setAddressNumber(java.lang.String addressNumber){
		this.addressNumber = addressNumber;
	}

	/**
	 *方法: 获得addressInfo
	 *@return: java.lang.String  addressInfo
	 */
	public java.lang.String getAddressInfo(){
		return this.addressInfo;
	}

	/**
	 *方法: 设置addressInfo
	 *@param: java.lang.String  addressInfo
	 */
	public void setAddressInfo(java.lang.String addressInfo){
		this.addressInfo = addressInfo;
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