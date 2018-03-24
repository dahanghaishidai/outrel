package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportoter.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:网络金融版个人信用报告-为他人担保
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-05 10:08:51
 */
public class ExtPersonalReportOterDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**OPTLOCK*/
	private java.lang.Long optlock;

	/**担保金额*/
	private java.lang.String guaranteeAmount;

	/**担保日期*/
	private java.lang.String guaranteeDate;

	/**担保项目*/
	private java.lang.String guaranteeProject;

	/**担保关系*/
	private java.lang.String guaranteeRelations;

	/**信息获取日期*/
	private java.lang.String infoDate;

	/**主表关联ID*/
	private java.lang.Long personalCreditReport;

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

	/**
	 *方法: 获得guaranteeAmount
	 *@return: java.lang.String  guaranteeAmount
	 */
	public java.lang.String getGuaranteeAmount(){
		return this.guaranteeAmount;
	}

	/**
	 *方法: 设置guaranteeAmount
	 *@param: java.lang.String  guaranteeAmount
	 */
	public void setGuaranteeAmount(java.lang.String guaranteeAmount){
		this.guaranteeAmount = guaranteeAmount;
	}

	/**
	 *方法: 获得guaranteeDate
	 *@return: java.lang.String  guaranteeDate
	 */
	public java.lang.String getGuaranteeDate(){
		return this.guaranteeDate;
	}

	/**
	 *方法: 设置guaranteeDate
	 *@param: java.lang.String  guaranteeDate
	 */
	public void setGuaranteeDate(java.lang.String guaranteeDate){
		this.guaranteeDate = guaranteeDate;
	}

	/**
	 *方法: 获得guaranteeProject
	 *@return: java.lang.String  guaranteeProject
	 */
	public java.lang.String getGuaranteeProject(){
		return this.guaranteeProject;
	}

	/**
	 *方法: 设置guaranteeProject
	 *@param: java.lang.String  guaranteeProject
	 */
	public void setGuaranteeProject(java.lang.String guaranteeProject){
		this.guaranteeProject = guaranteeProject;
	}

	/**
	 *方法: 获得guaranteeRelations
	 *@return: java.lang.String  guaranteeRelations
	 */
	public java.lang.String getGuaranteeRelations(){
		return this.guaranteeRelations;
	}

	/**
	 *方法: 设置guaranteeRelations
	 *@param: java.lang.String  guaranteeRelations
	 */
	public void setGuaranteeRelations(java.lang.String guaranteeRelations){
		this.guaranteeRelations = guaranteeRelations;
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