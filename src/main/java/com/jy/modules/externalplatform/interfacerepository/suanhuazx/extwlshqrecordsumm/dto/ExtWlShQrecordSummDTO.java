package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordsumm.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行原版(查询记录信息概要表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:52:00
 */
public class ExtWlShQrecordSummDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**征信主表ID*/
	private Long fkReportId;

	/**最近2年被机构查询次数*/
	private String organization;

	/**最近2年个人查询次数*/
	private String individual;

	/**查询记录解释文字*/
	private String intro;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**数据有效性*/
	private String validateState;

	/**创建人*/
	private Long createBy;

	/**修该人*/
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
	 *方法: 获得organization
	 *@return: java.lang.String  organization
	 */
	public String getOrganization(){
		return this.organization;
	}

	/**
	 *方法: 设置organization
	 *@param: java.lang.String  organization
	 */
	public void setOrganization(String organization){
		this.organization = organization;
	}

	/**
	 *方法: 获得individual
	 *@return: java.lang.String  individual
	 */
	public String getIndividual(){
		return this.individual;
	}

	/**
	 *方法: 设置individual
	 *@param: java.lang.String  individual
	 */
	public void setIndividual(String individual){
		this.individual = individual;
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