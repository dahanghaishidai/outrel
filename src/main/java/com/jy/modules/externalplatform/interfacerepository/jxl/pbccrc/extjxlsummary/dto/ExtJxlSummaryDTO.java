package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlsummary.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:聚信立央行征信报告（汇总信息表）
 *@author dell
 *@version 1.0,
 *@date 2017-08-24 21:00:37
 */
public class ExtJxlSummaryDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**征信主表ID*/
	private java.lang.Long fkReportId;

	/**为他人担保笔数*/
	private java.lang.String guaranteeNumber;

	/**未结清/未销户账户数*/
	private java.lang.String noSettleAccountNumber;

	/**账户数*/
	private java.lang.String accountNumber;

	/**逾期账户数*/
	private java.lang.String overdueAccountNum;

	/**90天以上逾期的账户数*/
	private java.lang.String overdue90AccountNum;

	/**信贷类型*/
	private java.lang.String type;

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
	 *方法: 获得guaranteeNumber
	 *@return: java.lang.String  guaranteeNumber
	 */
	public java.lang.String getGuaranteeNumber(){
		return this.guaranteeNumber;
	}

	/**
	 *方法: 设置guaranteeNumber
	 *@param: java.lang.String  guaranteeNumber
	 */
	public void setGuaranteeNumber(java.lang.String guaranteeNumber){
		this.guaranteeNumber = guaranteeNumber;
	}

	/**
	 *方法: 获得noSettleAccountNumber
	 *@return: java.lang.String  noSettleAccountNumber
	 */
	public java.lang.String getNoSettleAccountNumber(){
		return this.noSettleAccountNumber;
	}

	/**
	 *方法: 设置noSettleAccountNumber
	 *@param: java.lang.String  noSettleAccountNumber
	 */
	public void setNoSettleAccountNumber(java.lang.String noSettleAccountNumber){
		this.noSettleAccountNumber = noSettleAccountNumber;
	}

	/**
	 *方法: 获得accountNumber
	 *@return: java.lang.String  accountNumber
	 */
	public java.lang.String getAccountNumber(){
		return this.accountNumber;
	}

	/**
	 *方法: 设置accountNumber
	 *@param: java.lang.String  accountNumber
	 */
	public void setAccountNumber(java.lang.String accountNumber){
		this.accountNumber = accountNumber;
	}

	/**
	 *方法: 获得overdueAccountNum
	 *@return: java.lang.String  overdueAccountNum
	 */
	public java.lang.String getOverdueAccountNum(){
		return this.overdueAccountNum;
	}

	/**
	 *方法: 设置overdueAccountNum
	 *@param: java.lang.String  overdueAccountNum
	 */
	public void setOverdueAccountNum(java.lang.String overdueAccountNum){
		this.overdueAccountNum = overdueAccountNum;
	}

	/**
	 *方法: 获得overdue90AccountNum
	 *@return: java.lang.String  overdue90AccountNum
	 */
	public java.lang.String getOverdue90AccountNum(){
		return this.overdue90AccountNum;
	}

	/**
	 *方法: 设置overdue90AccountNum
	 *@param: java.lang.String  overdue90AccountNum
	 */
	public void setOverdue90AccountNum(java.lang.String overdue90AccountNum){
		this.overdue90AccountNum = overdue90AccountNum;
	}

	/**
	 *方法: 获得type
	 *@return: java.lang.String  type
	 */
	public java.lang.String getType(){
		return this.type;
	}

	/**
	 *方法: 设置type
	 *@param: java.lang.String  type
	 */
	public void setType(java.lang.String type){
		this.type = type;
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