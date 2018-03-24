package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcredtreddetail.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行原版(信贷记录详情)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:47:07
 */
public class ExtWlShCredtRedDetailDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**征信主表ID*/
	private Long fkReportId;

	/**信贷类型(1-信用卡;2-购房贷款;3-其他贷款;4-资产处置信息;5-保证人代偿信息;6-为他人担保信息)*/
	private String creditType;

	/**每条信贷记录的原文本*/
	private String orginalContent;

	/**逾期状态(0-未逾期;1-逾期)*/
	private String overdueStatus;

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
	 *方法: 获得creditType
	 *@return: java.lang.String  creditType
	 */
	public String getCreditType(){
		return this.creditType;
	}

	/**
	 *方法: 设置creditType
	 *@param: java.lang.String  creditType
	 */
	public void setCreditType(String creditType){
		this.creditType = creditType;
	}

	/**
	 *方法: 获得orginalContent
	 *@return: java.lang.String  orginalContent
	 */
	public String getOrginalContent(){
		return this.orginalContent;
	}

	/**
	 *方法: 设置orginalContent
	 *@param: java.lang.String  orginalContent
	 */
	public void setOrginalContent(String orginalContent){
		this.orginalContent = orginalContent;
	}

	/**
	 *方法: 获得overdueStatus
	 *@return: java.lang.String  overdueStatus
	 */
	public String getOverdueStatus(){
		return this.overdueStatus;
	}

	/**
	 *方法: 设置overdueStatus
	 *@param: java.lang.String  overdueStatus
	 */
	public void setOverdueStatus(String overdueStatus){
		this.overdueStatus = overdueStatus;
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