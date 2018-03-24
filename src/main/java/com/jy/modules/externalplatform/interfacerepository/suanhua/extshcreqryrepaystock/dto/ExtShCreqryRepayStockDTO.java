package com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryrepaystock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话征信贷款信息查询_还款信息列表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-09 10:02:10
 */
public class ExtShCreqryRepayStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**查询报告主键*/
	private java.lang.Long reportId;

	/**还款期数*/
	private java.lang.Long iperiodnumber;

	/**逾期标志 0-未逾期，1-逾期*/
	private java.lang.String soverdue;

	/**本期应还日期*/
	private java.lang.String dbillingdate;

	/**本期应还金额*/
	private java.lang.Long iactualpayamount;

	/**本期实还日期*/
	private java.lang.String drecentpaydate;

	/**本期实还金额*/
	private java.lang.Long ischeduledamount;

	/**当前负债余额*/
	private java.lang.Long ibalance;

	/**合同状态*/
	private java.lang.Long iaccountstat;

	/**业务合同号*/
	private java.lang.String saccount;

	/**CREATE_TIME*/
	private java.sql.Timestamp createTime;

	/**MODIFY_TIME*/
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
	 *方法: 获得reportId
	 *@return: java.lang.Long  reportId
	 */
	public java.lang.Long getReportId(){
		return this.reportId;
	}

	/**
	 *方法: 设置reportId
	 *@param: java.lang.Long  reportId
	 */
	public void setReportId(java.lang.Long reportId){
		this.reportId = reportId;
	}

	/**
	 *方法: 获得iperiodnumber
	 *@return: java.lang.Long  iperiodnumber
	 */
	public java.lang.Long getIperiodnumber(){
		return this.iperiodnumber;
	}

	/**
	 *方法: 设置iperiodnumber
	 *@param: java.lang.Long  iperiodnumber
	 */
	public void setIperiodnumber(java.lang.Long iperiodnumber){
		this.iperiodnumber = iperiodnumber;
	}

	/**
	 *方法: 获得soverdue
	 *@return: java.lang.String  soverdue
	 */
	public java.lang.String getSoverdue(){
		return this.soverdue;
	}

	/**
	 *方法: 设置soverdue
	 *@param: java.lang.String  soverdue
	 */
	public void setSoverdue(java.lang.String soverdue){
		this.soverdue = soverdue;
	}

	/**
	 *方法: 获得dbillingdate
	 *@return: java.lang.String  dbillingdate
	 */
	public java.lang.String getDbillingdate(){
		return this.dbillingdate;
	}

	/**
	 *方法: 设置dbillingdate
	 *@param: java.lang.String  dbillingdate
	 */
	public void setDbillingdate(java.lang.String dbillingdate){
		this.dbillingdate = dbillingdate;
	}

	/**
	 *方法: 获得iactualpayamount
	 *@return: java.lang.Long  iactualpayamount
	 */
	public java.lang.Long getIactualpayamount(){
		return this.iactualpayamount;
	}

	/**
	 *方法: 设置iactualpayamount
	 *@param: java.lang.Long  iactualpayamount
	 */
	public void setIactualpayamount(java.lang.Long iactualpayamount){
		this.iactualpayamount = iactualpayamount;
	}

	/**
	 *方法: 获得drecentpaydate
	 *@return: java.lang.String  drecentpaydate
	 */
	public java.lang.String getDrecentpaydate(){
		return this.drecentpaydate;
	}

	/**
	 *方法: 设置drecentpaydate
	 *@param: java.lang.String  drecentpaydate
	 */
	public void setDrecentpaydate(java.lang.String drecentpaydate){
		this.drecentpaydate = drecentpaydate;
	}

	/**
	 *方法: 获得ischeduledamount
	 *@return: java.lang.Long  ischeduledamount
	 */
	public java.lang.Long getIscheduledamount(){
		return this.ischeduledamount;
	}

	/**
	 *方法: 设置ischeduledamount
	 *@param: java.lang.Long  ischeduledamount
	 */
	public void setIscheduledamount(java.lang.Long ischeduledamount){
		this.ischeduledamount = ischeduledamount;
	}

	/**
	 *方法: 获得ibalance
	 *@return: java.lang.Long  ibalance
	 */
	public java.lang.Long getIbalance(){
		return this.ibalance;
	}

	/**
	 *方法: 设置ibalance
	 *@param: java.lang.Long  ibalance
	 */
	public void setIbalance(java.lang.Long ibalance){
		this.ibalance = ibalance;
	}

	/**
	 *方法: 获得iaccountstat
	 *@return: java.lang.Long  iaccountstat
	 */
	public java.lang.Long getIaccountstat(){
		return this.iaccountstat;
	}

	/**
	 *方法: 设置iaccountstat
	 *@param: java.lang.Long  iaccountstat
	 */
	public void setIaccountstat(java.lang.Long iaccountstat){
		this.iaccountstat = iaccountstat;
	}

	/**
	 *方法: 获得saccount
	 *@return: java.lang.String  saccount
	 */
	public java.lang.String getSaccount(){
		return this.saccount;
	}

	/**
	 *方法: 设置saccount
	 *@param: java.lang.String  saccount
	 */
	public void setSaccount(java.lang.String saccount){
		this.saccount = saccount;
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