package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonoverd.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:人行征信逾期情况
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:48:55
 */
public class ExtWlShPersonOverdDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**逾期信用卡机构数*/
	private String creditOrgCounts;

	/**总信用卡逾期金额*/
	private String creditAmts;

	/**当前逾期卡所属机构数(逾期金额>200元/卡)*/
	private String creditOrgCounts200;

	/**当前逾期总金额(逾期金额>200元/卡)*/
	private String creditAmts200;

	/**近60个月逾期次数（信用卡）*/
	private String creditCountsM60;

	/**近60个月逾期90天以上次数（信用卡）*/
	private String creditCountsM60D90;

	/**当前逾期笔数（贷款）*/
	private String loanCounts;

	/**当前逾期总金额（贷款）*/
	private String loanAmts;

	/**近60个月逾期次数（贷款）*/
	private String loanCountsM60;

	/**近60个月逾期90天以上次数（贷款）*/
	private String loanCountsM60D90;

	/**近60个月逾期次数（汇总）*/
	private String countsM60;

	/**近60个月逾期90天以上次数（汇总）*/
	private String countsM60D90;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**人行征信报告主键*/
	private Long fkPersonalReportId;

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
	 *方法: 获得creditOrgCounts
	 *@return: java.lang.String  creditOrgCounts
	 */
	public String getCreditOrgCounts(){
		return this.creditOrgCounts;
	}

	/**
	 *方法: 设置creditOrgCounts
	 *@param: java.lang.String  creditOrgCounts
	 */
	public void setCreditOrgCounts(String creditOrgCounts){
		this.creditOrgCounts = creditOrgCounts;
	}

	/**
	 *方法: 获得creditAmts
	 *@return: java.lang.String  creditAmts
	 */
	public String getCreditAmts(){
		return this.creditAmts;
	}

	/**
	 *方法: 设置creditAmts
	 *@param: java.lang.String  creditAmts
	 */
	public void setCreditAmts(String creditAmts){
		this.creditAmts = creditAmts;
	}

	/**
	 *方法: 获得creditOrgCounts200
	 *@return: java.lang.String  creditOrgCounts200
	 */
	public String getCreditOrgCounts200(){
		return this.creditOrgCounts200;
	}

	/**
	 *方法: 设置creditOrgCounts200
	 *@param: java.lang.String  creditOrgCounts200
	 */
	public void setCreditOrgCounts200(String creditOrgCounts200){
		this.creditOrgCounts200 = creditOrgCounts200;
	}

	/**
	 *方法: 获得creditAmts200
	 *@return: java.lang.String  creditAmts200
	 */
	public String getCreditAmts200(){
		return this.creditAmts200;
	}

	/**
	 *方法: 设置creditAmts200
	 *@param: java.lang.String  creditAmts200
	 */
	public void setCreditAmts200(String creditAmts200){
		this.creditAmts200 = creditAmts200;
	}

	/**
	 *方法: 获得creditCountsM60
	 *@return: java.lang.String  creditCountsM60
	 */
	public String getCreditCountsM60(){
		return this.creditCountsM60;
	}

	/**
	 *方法: 设置creditCountsM60
	 *@param: java.lang.String  creditCountsM60
	 */
	public void setCreditCountsM60(String creditCountsM60){
		this.creditCountsM60 = creditCountsM60;
	}



	/**
	 *方法: 获得loanCounts
	 *@return: java.lang.String  loanCounts
	 */
	public String getLoanCounts(){
		return this.loanCounts;
	}

	/**
	 *方法: 设置loanCounts
	 *@param: java.lang.String  loanCounts
	 */
	public void setLoanCounts(String loanCounts){
		this.loanCounts = loanCounts;
	}

	/**
	 *方法: 获得loanAmts
	 *@return: java.lang.String  loanAmts
	 */
	public String getLoanAmts(){
		return this.loanAmts;
	}

	/**
	 *方法: 设置loanAmts
	 *@param: java.lang.String  loanAmts
	 */
	public void setLoanAmts(String loanAmts){
		this.loanAmts = loanAmts;
	}

	/**
	 *方法: 获得loanCountsM60
	 *@return: java.lang.String  loanCountsM60
	 */
	public String getLoanCountsM60(){
		return this.loanCountsM60;
	}

	/**
	 *方法: 设置loanCountsM60
	 *@param: java.lang.String  loanCountsM60
	 */
	public void setLoanCountsM60(String loanCountsM60){
		this.loanCountsM60 = loanCountsM60;
	}



	/**
	 *方法: 获得countsM60
	 *@return: java.lang.String  countsM60
	 */
	public String getCountsM60(){
		return this.countsM60;
	}

	/**
	 *方法: 设置countsM60
	 *@param: java.lang.String  countsM60
	 */
	public void setCountsM60(String countsM60){
		this.countsM60 = countsM60;
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
	 *方法: 获得fkPersonalReportId
	 *@return: java.lang.Long  fkPersonalReportId
	 */
	public Long getFkPersonalReportId(){
		return this.fkPersonalReportId;
	}

	/**
	 *方法: 设置fkPersonalReportId
	 *@param: java.lang.Long  fkPersonalReportId
	 */
	public void setFkPersonalReportId(Long fkPersonalReportId){
		this.fkPersonalReportId = fkPersonalReportId;
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

	public String getCreditCountsM60D90() {
		return creditCountsM60D90;
	}

	public void setCreditCountsM60D90(String creditCountsM60D90) {
		this.creditCountsM60D90 = creditCountsM60D90;
	}

	public String getLoanCountsM60D90() {
		return loanCountsM60D90;
	}

	public void setLoanCountsM60D90(String loanCountsM60D90) {
		this.loanCountsM60D90 = loanCountsM60D90;
	}

	public String getCountsM60D90() {
		return countsM60D90;
	}

	public void setCountsM60D90(String countsM60D90) {
		this.countsM60D90 = countsM60D90;
	}
}