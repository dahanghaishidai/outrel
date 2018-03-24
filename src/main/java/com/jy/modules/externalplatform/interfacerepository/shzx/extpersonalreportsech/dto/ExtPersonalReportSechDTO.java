package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportsech.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:网络金融版个人信用报告-查询记录
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-05 10:07:55
 */
public class ExtPersonalReportSechDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**查询者类型*/
	private java.lang.String searchType;

	/**查询原因*/
	private java.lang.String searchBecause;

	/**查询日期*/
	private java.lang.String searchDate;

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
	 *方法: 获得searchType
	 *@return: java.lang.String  searchType
	 */
	public java.lang.String getSearchType(){
		return this.searchType;
	}

	/**
	 *方法: 设置searchType
	 *@param: java.lang.String  searchType
	 */
	public void setSearchType(java.lang.String searchType){
		this.searchType = searchType;
	}

	/**
	 *方法: 获得searchBecause
	 *@return: java.lang.String  searchBecause
	 */
	public java.lang.String getSearchBecause(){
		return this.searchBecause;
	}

	/**
	 *方法: 设置searchBecause
	 *@param: java.lang.String  searchBecause
	 */
	public void setSearchBecause(java.lang.String searchBecause){
		this.searchBecause = searchBecause;
	}

	/**
	 *方法: 获得searchDate
	 *@return: java.lang.String  searchDate
	 */
	public java.lang.String getSearchDate(){
		return this.searchDate;
	}

	/**
	 *方法: 设置searchDate
	 *@param: java.lang.String  searchDate
	 */
	public void setSearchDate(java.lang.String searchDate){
		this.searchDate = searchDate;
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