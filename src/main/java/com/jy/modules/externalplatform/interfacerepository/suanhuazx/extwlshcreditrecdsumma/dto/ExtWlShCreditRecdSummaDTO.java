package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecdsumma.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行原版(信贷记录概要)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:46:19
 */
public class ExtWlShCreditRecdSummaDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**征信主表ID*/
	private Long fkReportId;

	/**信贷类型*/
	private String creditType;

	/**账户数*/
	private String accountTotal;

	/**未结清/未销户账户数*/
	private String activeTotal;

	/**发生过逾期账户数*/
	private String overdueTotal;

	/**发生过90天以上逾期账户数*/
	private String overdue90Total;

	/**为他人担保笔数*/
	private String guarantee;

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
	 *方法: 获得accountTotal
	 *@return: java.lang.String  accountTotal
	 */
	public String getAccountTotal(){
		return this.accountTotal;
	}

	/**
	 *方法: 设置accountTotal
	 *@param: java.lang.String  accountTotal
	 */
	public void setAccountTotal(String accountTotal){
		this.accountTotal = accountTotal;
	}

	/**
	 *方法: 获得activeTotal
	 *@return: java.lang.String  activeTotal
	 */
	public String getActiveTotal(){
		return this.activeTotal;
	}

	/**
	 *方法: 设置activeTotal
	 *@param: java.lang.String  activeTotal
	 */
	public void setActiveTotal(String activeTotal){
		this.activeTotal = activeTotal;
	}

	/**
	 *方法: 获得overdueTotal
	 *@return: java.lang.String  overdueTotal
	 */
	public String getOverdueTotal(){
		return this.overdueTotal;
	}

	/**
	 *方法: 设置overdueTotal
	 *@param: java.lang.String  overdueTotal
	 */
	public void setOverdueTotal(String overdueTotal){
		this.overdueTotal = overdueTotal;
	}

	/**
	 *方法: 获得overdue90Total
	 *@return: java.lang.String  overdue90Total
	 */
	public String getOverdue90Total(){
		return this.overdue90Total;
	}

	/**
	 *方法: 设置overdue90Total
	 *@param: java.lang.String  overdue90Total
	 */
	public void setOverdue90Total(String overdue90Total){
		this.overdue90Total = overdue90Total;
	}

	/**
	 *方法: 获得guarantee
	 *@return: java.lang.String  guarantee
	 */
	public String getGuarantee(){
		return this.guarantee;
	}

	/**
	 *方法: 设置guarantee
	 *@param: java.lang.String  guarantee
	 */
	public void setGuarantee(String guarantee){
		this.guarantee = guarantee;
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