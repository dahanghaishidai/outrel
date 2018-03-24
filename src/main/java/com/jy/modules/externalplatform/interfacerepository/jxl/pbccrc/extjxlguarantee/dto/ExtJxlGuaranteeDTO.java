package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlguarantee.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:聚信立央行征信报告（担保信息表）
 *@author dell
 *@version 1.0,
 *@date 2017-08-24 21:00:10
 */
public class ExtJxlGuaranteeDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**征信主表ID*/
	private java.lang.Long fkReportId;

	/**担保办理日期*/
	private java.lang.String guaranteeMadeTime;

	/**被担保人姓名*/
	private java.lang.String guaranteedName;

	/**被担保人证件类型*/
	private java.lang.String guaranteedCardType;

	/**被担保人证件号码*/
	private java.lang.String guaranteedCardNumber;

	/**担保办理单位*/
	private java.lang.String guaranteeMadeEmployer;

	/**担保办理类型*/
	private java.lang.String guaranteeMadeType;

	/**担保合同金额*/
	private java.lang.String guaranteeContractAmount;

	/**担保金额*/
	private java.lang.String guaranteeAmount;

	/**截止日期*/
	private java.lang.String deadlineTime;

	/**担保余额*/
	private java.lang.String guaranteeBalance;

	/**每条担保记录原文本*/
	private java.lang.String originalContent;

	/**担保状态*/
	private java.lang.String status;

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
	 *方法: 获得fkReportId
	 *@return: java.lang.Long  fkReportId
	 */
	public java.lang.Long getFkReportId(){
		return this.fkReportId;
	}

	/**
	 *方法: 设置fkReportId
	 *@param: java.lang.Long  fkReportId
	 */
	public void setFkReportId(java.lang.Long fkReportId){
		this.fkReportId = fkReportId;
	}

	/**
	 *方法: 获得guaranteeMadeTime
	 *@return: java.lang.String  guaranteeMadeTime
	 */
	public java.lang.String getGuaranteeMadeTime(){
		return this.guaranteeMadeTime;
	}

	/**
	 *方法: 设置guaranteeMadeTime
	 *@param: java.lang.String  guaranteeMadeTime
	 */
	public void setGuaranteeMadeTime(java.lang.String guaranteeMadeTime){
		this.guaranteeMadeTime = guaranteeMadeTime;
	}

	/**
	 *方法: 获得guaranteedName
	 *@return: java.lang.String  guaranteedName
	 */
	public java.lang.String getGuaranteedName(){
		return this.guaranteedName;
	}

	/**
	 *方法: 设置guaranteedName
	 *@param: java.lang.String  guaranteedName
	 */
	public void setGuaranteedName(java.lang.String guaranteedName){
		this.guaranteedName = guaranteedName;
	}

	/**
	 *方法: 获得guaranteedCardType
	 *@return: java.lang.String  guaranteedCardType
	 */
	public java.lang.String getGuaranteedCardType(){
		return this.guaranteedCardType;
	}

	/**
	 *方法: 设置guaranteedCardType
	 *@param: java.lang.String  guaranteedCardType
	 */
	public void setGuaranteedCardType(java.lang.String guaranteedCardType){
		this.guaranteedCardType = guaranteedCardType;
	}

	/**
	 *方法: 获得guaranteedCardNumber
	 *@return: java.lang.String  guaranteedCardNumber
	 */
	public java.lang.String getGuaranteedCardNumber(){
		return this.guaranteedCardNumber;
	}

	/**
	 *方法: 设置guaranteedCardNumber
	 *@param: java.lang.String  guaranteedCardNumber
	 */
	public void setGuaranteedCardNumber(java.lang.String guaranteedCardNumber){
		this.guaranteedCardNumber = guaranteedCardNumber;
	}

	/**
	 *方法: 获得guaranteeMadeEmployer
	 *@return: java.lang.String  guaranteeMadeEmployer
	 */
	public java.lang.String getGuaranteeMadeEmployer(){
		return this.guaranteeMadeEmployer;
	}

	/**
	 *方法: 设置guaranteeMadeEmployer
	 *@param: java.lang.String  guaranteeMadeEmployer
	 */
	public void setGuaranteeMadeEmployer(java.lang.String guaranteeMadeEmployer){
		this.guaranteeMadeEmployer = guaranteeMadeEmployer;
	}

	/**
	 *方法: 获得guaranteeMadeType
	 *@return: java.lang.String  guaranteeMadeType
	 */
	public java.lang.String getGuaranteeMadeType(){
		return this.guaranteeMadeType;
	}

	/**
	 *方法: 设置guaranteeMadeType
	 *@param: java.lang.String  guaranteeMadeType
	 */
	public void setGuaranteeMadeType(java.lang.String guaranteeMadeType){
		this.guaranteeMadeType = guaranteeMadeType;
	}

	/**
	 *方法: 获得guaranteeContractAmount
	 *@return: java.lang.String  guaranteeContractAmount
	 */
	public java.lang.String getGuaranteeContractAmount(){
		return this.guaranteeContractAmount;
	}

	/**
	 *方法: 设置guaranteeContractAmount
	 *@param: java.lang.String  guaranteeContractAmount
	 */
	public void setGuaranteeContractAmount(java.lang.String guaranteeContractAmount){
		this.guaranteeContractAmount = guaranteeContractAmount;
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
	 *方法: 获得deadlineTime
	 *@return: java.lang.String  deadlineTime
	 */
	public java.lang.String getDeadlineTime(){
		return this.deadlineTime;
	}

	/**
	 *方法: 设置deadlineTime
	 *@param: java.lang.String  deadlineTime
	 */
	public void setDeadlineTime(java.lang.String deadlineTime){
		this.deadlineTime = deadlineTime;
	}

	/**
	 *方法: 获得guaranteeBalance
	 *@return: java.lang.String  guaranteeBalance
	 */
	public java.lang.String getGuaranteeBalance(){
		return this.guaranteeBalance;
	}

	/**
	 *方法: 设置guaranteeBalance
	 *@param: java.lang.String  guaranteeBalance
	 */
	public void setGuaranteeBalance(java.lang.String guaranteeBalance){
		this.guaranteeBalance = guaranteeBalance;
	}

	/**
	 *方法: 获得originalContent
	 *@return: java.lang.String  originalContent
	 */
	public java.lang.String getOriginalContent(){
		return this.originalContent;
	}

	/**
	 *方法: 设置originalContent
	 *@param: java.lang.String  originalContent
	 */
	public void setOriginalContent(java.lang.String originalContent){
		this.originalContent = originalContent;
	}

	/**
	 *方法: 获得status
	 *@return: java.lang.String  status
	 */
	public java.lang.String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置status
	 *@param: java.lang.String  status
	 */
	public void setStatus(java.lang.String status){
		this.status = status;
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