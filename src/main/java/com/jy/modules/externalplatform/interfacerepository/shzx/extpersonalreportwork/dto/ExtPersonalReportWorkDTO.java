package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportwork.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:网络金融版个人信用报告-工作
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-05 10:09:01
 */
public class ExtPersonalReportWorkDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**工作序号*/
	private java.lang.String workNumber;

	/**职业*/
	private java.lang.String career;

	/**信息获取日期*/
	private java.lang.String infoDate;

	/**主表关联ID*/
	private java.lang.Long personalCreditReport;

	/**工作明细*/
	private java.lang.String workInfo;

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
	 *方法: 获得workNumber
	 *@return: java.lang.String  workNumber
	 */
	public java.lang.String getWorkNumber(){
		return this.workNumber;
	}

	/**
	 *方法: 设置workNumber
	 *@param: java.lang.String  workNumber
	 */
	public void setWorkNumber(java.lang.String workNumber){
		this.workNumber = workNumber;
	}

	/**
	 *方法: 获得career
	 *@return: java.lang.String  career
	 */
	public java.lang.String getCareer(){
		return this.career;
	}

	/**
	 *方法: 设置career
	 *@param: java.lang.String  career
	 */
	public void setCareer(java.lang.String career){
		this.career = career;
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
	 *方法: 获得workInfo
	 *@return: java.lang.String  workInfo
	 */
	public java.lang.String getWorkInfo(){
		return this.workInfo;
	}

	/**
	 *方法: 设置workInfo
	 *@param: java.lang.String  workInfo
	 */
	public void setWorkInfo(java.lang.String workInfo){
		this.workInfo = workInfo;
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