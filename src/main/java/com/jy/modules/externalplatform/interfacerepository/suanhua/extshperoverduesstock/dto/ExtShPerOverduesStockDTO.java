package com.jy.modules.externalplatform.interfacerepository.suanhua.extshperoverduesstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:人行征信逾期情况
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-12 14:55:31
 */
public class ExtShPerOverduesStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**逾期信用卡机构数*/
	private java.lang.String creditOrgCounts;

	/**总信用卡逾期金额*/
	private java.lang.String creditAmts;

	/**当前逾期卡所属机构数(逾期金额>200元/卡)*/
	private java.lang.String creditOrgCounts200;

	/**当前逾期总金额(逾期金额>200元/卡)*/
	private java.lang.String creditAmts200;

	/**近60个月逾期次数（信用卡）*/
	private java.lang.String creditCountsM60;

	/**近60个月逾期90天以上次数（信用卡）*/
	private java.lang.String creditCountsM60d90;

	/**当前逾期笔数（贷款）*/
	private java.lang.String loanCounts;

	/**当前逾期总金额（贷款）*/
	private java.lang.String loanAmts;

	/**近60个月逾期次数（贷款）*/
	private java.lang.String loanCountsM60;

	/**近60个月逾期90天以上次数（贷款）*/
	private java.lang.String loanCountsM60d90;

	/**近60个月逾期次数（汇总）*/
	private java.lang.String countsM60;

	/**近60个月逾期90天以上次数（汇总）*/
	private java.lang.String countsM60d90;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**MODIFY_TIME*/
	private java.sql.Timestamp modifyTime;

	/**人行征信报告主键*/
	private java.lang.Long fkPersonalReportId;

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
	 *方法: 获得creditOrgCounts
	 *@return: java.lang.String  creditOrgCounts
	 */
	public java.lang.String getCreditOrgCounts(){
		return this.creditOrgCounts;
	}

	/**
	 *方法: 设置creditOrgCounts
	 *@param: java.lang.String  creditOrgCounts
	 */
	public void setCreditOrgCounts(java.lang.String creditOrgCounts){
		this.creditOrgCounts = creditOrgCounts;
	}

	/**
	 *方法: 获得creditAmts
	 *@return: java.lang.String  creditAmts
	 */
	public java.lang.String getCreditAmts(){
		return this.creditAmts;
	}

	/**
	 *方法: 设置creditAmts
	 *@param: java.lang.String  creditAmts
	 */
	public void setCreditAmts(java.lang.String creditAmts){
		this.creditAmts = creditAmts;
	}

	/**
	 *方法: 获得creditOrgCounts200
	 *@return: java.lang.String  creditOrgCounts200
	 */
	public java.lang.String getCreditOrgCounts200(){
		return this.creditOrgCounts200;
	}

	/**
	 *方法: 设置creditOrgCounts200
	 *@param: java.lang.String  creditOrgCounts200
	 */
	public void setCreditOrgCounts200(java.lang.String creditOrgCounts200){
		this.creditOrgCounts200 = creditOrgCounts200;
	}

	/**
	 *方法: 获得creditAmts200
	 *@return: java.lang.String  creditAmts200
	 */
	public java.lang.String getCreditAmts200(){
		return this.creditAmts200;
	}

	/**
	 *方法: 设置creditAmts200
	 *@param: java.lang.String  creditAmts200
	 */
	public void setCreditAmts200(java.lang.String creditAmts200){
		this.creditAmts200 = creditAmts200;
	}

	/**
	 *方法: 获得creditCountsM60
	 *@return: java.lang.String  creditCountsM60
	 */
	public java.lang.String getCreditCountsM60(){
		return this.creditCountsM60;
	}

	/**
	 *方法: 设置creditCountsM60
	 *@param: java.lang.String  creditCountsM60
	 */
	public void setCreditCountsM60(java.lang.String creditCountsM60){
		this.creditCountsM60 = creditCountsM60;
	}

	/**
	 *方法: 获得creditCountsM60d90
	 *@return: java.lang.String  creditCountsM60d90
	 */
	public java.lang.String getCreditCountsM60d90(){
		return this.creditCountsM60d90;
	}

	/**
	 *方法: 设置creditCountsM60d90
	 *@param: java.lang.String  creditCountsM60d90
	 */
	public void setCreditCountsM60d90(java.lang.String creditCountsM60d90){
		this.creditCountsM60d90 = creditCountsM60d90;
	}

	/**
	 *方法: 获得loanCounts
	 *@return: java.lang.String  loanCounts
	 */
	public java.lang.String getLoanCounts(){
		return this.loanCounts;
	}

	/**
	 *方法: 设置loanCounts
	 *@param: java.lang.String  loanCounts
	 */
	public void setLoanCounts(java.lang.String loanCounts){
		this.loanCounts = loanCounts;
	}

	/**
	 *方法: 获得loanAmts
	 *@return: java.lang.String  loanAmts
	 */
	public java.lang.String getLoanAmts(){
		return this.loanAmts;
	}

	/**
	 *方法: 设置loanAmts
	 *@param: java.lang.String  loanAmts
	 */
	public void setLoanAmts(java.lang.String loanAmts){
		this.loanAmts = loanAmts;
	}

	/**
	 *方法: 获得loanCountsM60
	 *@return: java.lang.String  loanCountsM60
	 */
	public java.lang.String getLoanCountsM60(){
		return this.loanCountsM60;
	}

	/**
	 *方法: 设置loanCountsM60
	 *@param: java.lang.String  loanCountsM60
	 */
	public void setLoanCountsM60(java.lang.String loanCountsM60){
		this.loanCountsM60 = loanCountsM60;
	}

	/**
	 *方法: 获得loanCountsM60d90
	 *@return: java.lang.String  loanCountsM60d90
	 */
	public java.lang.String getLoanCountsM60d90(){
		return this.loanCountsM60d90;
	}

	/**
	 *方法: 设置loanCountsM60d90
	 *@param: java.lang.String  loanCountsM60d90
	 */
	public void setLoanCountsM60d90(java.lang.String loanCountsM60d90){
		this.loanCountsM60d90 = loanCountsM60d90;
	}

	/**
	 *方法: 获得countsM60
	 *@return: java.lang.String  countsM60
	 */
	public java.lang.String getCountsM60(){
		return this.countsM60;
	}

	/**
	 *方法: 设置countsM60
	 *@param: java.lang.String  countsM60
	 */
	public void setCountsM60(java.lang.String countsM60){
		this.countsM60 = countsM60;
	}

	/**
	 *方法: 获得countsM60d90
	 *@return: java.lang.String  countsM60d90
	 */
	public java.lang.String getCountsM60d90(){
		return this.countsM60d90;
	}

	/**
	 *方法: 设置countsM60d90
	 *@param: java.lang.String  countsM60d90
	 */
	public void setCountsM60d90(java.lang.String countsM60d90){
		this.countsM60d90 = countsM60d90;
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
	 *方法: 获得fkPersonalReportId
	 *@return: java.lang.Long  fkPersonalReportId
	 */
	public java.lang.Long getFkPersonalReportId(){
		return this.fkPersonalReportId;
	}

	/**
	 *方法: 设置fkPersonalReportId
	 *@param: java.lang.Long  fkPersonalReportId
	 */
	public void setFkPersonalReportId(java.lang.Long fkPersonalReportId){
		this.fkPersonalReportId = fkPersonalReportId;
	}

}