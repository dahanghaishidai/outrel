package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpublicrecdsumm.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行原版(公共记录概要表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:51:15
 */
public class ExtWlShPublicRecdSummDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**征信主表ID*/
	private Long fkReportId;

	/**公共记录解释文字*/
	private String intro;

	/**欠税记录个数*/
	private String tax;

	/**民事判决记录个数*/
	private String judgment;

	/**强制执行记录个数*/
	private String enforcement;

	/**行政处罚记录个数*/
	private String punishment;

	/**电信欠费记录个数*/
	private String telecom;

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
	 *方法: 获得intro
	 *@return: java.lang.String  intro
	 */
	public String getIntro(){
		return this.intro;
	}

	/**
	 *方法: 设置intro
	 *@param: java.lang.String  intro
	 */
	public void setIntro(String intro){
		this.intro = intro;
	}

	/**
	 *方法: 获得tax
	 *@return: java.lang.String  tax
	 */
	public String getTax(){
		return this.tax;
	}

	/**
	 *方法: 设置tax
	 *@param: java.lang.String  tax
	 */
	public void setTax(String tax){
		this.tax = tax;
	}

	/**
	 *方法: 获得judgment
	 *@return: java.lang.String  judgment
	 */
	public String getJudgment(){
		return this.judgment;
	}

	/**
	 *方法: 设置judgment
	 *@param: java.lang.String  judgment
	 */
	public void setJudgment(String judgment){
		this.judgment = judgment;
	}

	/**
	 *方法: 获得enforcement
	 *@return: java.lang.String  enforcement
	 */
	public String getEnforcement(){
		return this.enforcement;
	}

	/**
	 *方法: 设置enforcement
	 *@param: java.lang.String  enforcement
	 */
	public void setEnforcement(String enforcement){
		this.enforcement = enforcement;
	}

	/**
	 *方法: 获得punishment
	 *@return: java.lang.String  punishment
	 */
	public String getPunishment(){
		return this.punishment;
	}

	/**
	 *方法: 设置punishment
	 *@param: java.lang.String  punishment
	 */
	public void setPunishment(String punishment){
		this.punishment = punishment;
	}

	/**
	 *方法: 获得telecom
	 *@return: java.lang.String  telecom
	 */
	public String getTelecom(){
		return this.telecom;
	}

	/**
	 *方法: 设置telecom
	 *@param: java.lang.String  telecom
	 */
	public void setTelecom(String telecom){
		this.telecom = telecom;
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