package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrgeneralinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行结构化版(汇总信息表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:54:35
 */
public class ExtWlShSrGeneralInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**资产处置信息笔数*/
	private Long assetTotal;

	/**保证人代偿笔数*/
	private Long compensateTotal;

	/**信用卡账户总数*/
	private Long creditTotal;

	/**信用卡未结清/未销户账户数*/
	private Long creditActive;

	/**信用卡发生过逾期账户数*/
	private Long creditOverdue;

	/**信用卡90天以上逾期账户数*/
	private Long creditOverdue90;

	/**信用卡为他人担保数*/
	private Long creditGuarantee;

	/**住房贷款账户数*/
	private Long mortgageTotal;

	/**住房贷款未结清/未销户账户数*/
	private Long mortgageActive;

	/**住房贷款发生过逾期账户数*/
	private Long mortgageOverdue;

	/**住房贷款90天以上逾期账户数*/
	private Long mortgageOverdue90;

	/**住房贷款为他人担保数*/
	private Long mortgageGuarantee;

	/**其他贷款账户数*/
	private Long otherloanTotal;

	/**其他贷款未结清/未销户账户数*/
	private Long otherloanActive;

	/**其他贷款发生过逾期账户数*/
	private Long otherloanOverdue;

	/**其他贷款90天以上逾期账户数*/
	private Long otherloanOverdue90;

	/**其他贷款为他人担保数*/
	private Long otherloanGuarantee;

	/**是否失败(0-成功;1-失败)*/
	private String isfail;

	/**征信主表ID*/
	private Long fkReportId;

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
	 *方法: 获得assetTotal
	 *@return: java.lang.Long  assetTotal
	 */
	public Long getAssetTotal(){
		return this.assetTotal;
	}

	/**
	 *方法: 设置assetTotal
	 *@param: java.lang.Long  assetTotal
	 */
	public void setAssetTotal(Long assetTotal){
		this.assetTotal = assetTotal;
	}

	/**
	 *方法: 获得compensateTotal
	 *@return: java.lang.Long  compensateTotal
	 */
	public Long getCompensateTotal(){
		return this.compensateTotal;
	}

	/**
	 *方法: 设置compensateTotal
	 *@param: java.lang.Long  compensateTotal
	 */
	public void setCompensateTotal(Long compensateTotal){
		this.compensateTotal = compensateTotal;
	}

	/**
	 *方法: 获得creditTotal
	 *@return: java.lang.Long  creditTotal
	 */
	public Long getCreditTotal(){
		return this.creditTotal;
	}

	/**
	 *方法: 设置creditTotal
	 *@param: java.lang.Long  creditTotal
	 */
	public void setCreditTotal(Long creditTotal){
		this.creditTotal = creditTotal;
	}

	/**
	 *方法: 获得creditActive
	 *@return: java.lang.Long  creditActive
	 */
	public Long getCreditActive(){
		return this.creditActive;
	}

	/**
	 *方法: 设置creditActive
	 *@param: java.lang.Long  creditActive
	 */
	public void setCreditActive(Long creditActive){
		this.creditActive = creditActive;
	}

	/**
	 *方法: 获得creditOverdue
	 *@return: java.lang.Long  creditOverdue
	 */
	public Long getCreditOverdue(){
		return this.creditOverdue;
	}

	/**
	 *方法: 设置creditOverdue
	 *@param: java.lang.Long  creditOverdue
	 */
	public void setCreditOverdue(Long creditOverdue){
		this.creditOverdue = creditOverdue;
	}

	/**
	 *方法: 获得creditOverdue90
	 *@return: java.lang.Long  creditOverdue90
	 */
	public Long getCreditOverdue90(){
		return this.creditOverdue90;
	}

	/**
	 *方法: 设置creditOverdue90
	 *@param: java.lang.Long  creditOverdue90
	 */
	public void setCreditOverdue90(Long creditOverdue90){
		this.creditOverdue90 = creditOverdue90;
	}

	/**
	 *方法: 获得creditGuarantee
	 *@return: java.lang.Long  creditGuarantee
	 */
	public Long getCreditGuarantee(){
		return this.creditGuarantee;
	}

	/**
	 *方法: 设置creditGuarantee
	 *@param: java.lang.Long  creditGuarantee
	 */
	public void setCreditGuarantee(Long creditGuarantee){
		this.creditGuarantee = creditGuarantee;
	}

	/**
	 *方法: 获得mortgageTotal
	 *@return: java.lang.Long  mortgageTotal
	 */
	public Long getMortgageTotal(){
		return this.mortgageTotal;
	}

	/**
	 *方法: 设置mortgageTotal
	 *@param: java.lang.Long  mortgageTotal
	 */
	public void setMortgageTotal(Long mortgageTotal){
		this.mortgageTotal = mortgageTotal;
	}

	/**
	 *方法: 获得mortgageActive
	 *@return: java.lang.Long  mortgageActive
	 */
	public Long getMortgageActive(){
		return this.mortgageActive;
	}

	/**
	 *方法: 设置mortgageActive
	 *@param: java.lang.Long  mortgageActive
	 */
	public void setMortgageActive(Long mortgageActive){
		this.mortgageActive = mortgageActive;
	}

	/**
	 *方法: 获得mortgageOverdue
	 *@return: java.lang.Long  mortgageOverdue
	 */
	public Long getMortgageOverdue(){
		return this.mortgageOverdue;
	}

	/**
	 *方法: 设置mortgageOverdue
	 *@param: java.lang.Long  mortgageOverdue
	 */
	public void setMortgageOverdue(Long mortgageOverdue){
		this.mortgageOverdue = mortgageOverdue;
	}

	/**
	 *方法: 获得mortgageOverdue90
	 *@return: java.lang.Long  mortgageOverdue90
	 */
	public Long getMortgageOverdue90(){
		return this.mortgageOverdue90;
	}

	/**
	 *方法: 设置mortgageOverdue90
	 *@param: java.lang.Long  mortgageOverdue90
	 */
	public void setMortgageOverdue90(Long mortgageOverdue90){
		this.mortgageOverdue90 = mortgageOverdue90;
	}

	/**
	 *方法: 获得mortgageGuarantee
	 *@return: java.lang.Long  mortgageGuarantee
	 */
	public Long getMortgageGuarantee(){
		return this.mortgageGuarantee;
	}

	/**
	 *方法: 设置mortgageGuarantee
	 *@param: java.lang.Long  mortgageGuarantee
	 */
	public void setMortgageGuarantee(Long mortgageGuarantee){
		this.mortgageGuarantee = mortgageGuarantee;
	}

	/**
	 *方法: 获得otherloanTotal
	 *@return: java.lang.Long  otherloanTotal
	 */
	public Long getOtherloanTotal(){
		return this.otherloanTotal;
	}

	/**
	 *方法: 设置otherloanTotal
	 *@param: java.lang.Long  otherloanTotal
	 */
	public void setOtherloanTotal(Long otherloanTotal){
		this.otherloanTotal = otherloanTotal;
	}

	/**
	 *方法: 获得otherloanActive
	 *@return: java.lang.Long  otherloanActive
	 */
	public Long getOtherloanActive(){
		return this.otherloanActive;
	}

	/**
	 *方法: 设置otherloanActive
	 *@param: java.lang.Long  otherloanActive
	 */
	public void setOtherloanActive(Long otherloanActive){
		this.otherloanActive = otherloanActive;
	}

	/**
	 *方法: 获得otherloanOverdue
	 *@return: java.lang.Long  otherloanOverdue
	 */
	public Long getOtherloanOverdue(){
		return this.otherloanOverdue;
	}

	/**
	 *方法: 设置otherloanOverdue
	 *@param: java.lang.Long  otherloanOverdue
	 */
	public void setOtherloanOverdue(Long otherloanOverdue){
		this.otherloanOverdue = otherloanOverdue;
	}

	/**
	 *方法: 获得otherloanOverdue90
	 *@return: java.lang.Long  otherloanOverdue90
	 */
	public Long getOtherloanOverdue90(){
		return this.otherloanOverdue90;
	}

	/**
	 *方法: 设置otherloanOverdue90
	 *@param: java.lang.Long  otherloanOverdue90
	 */
	public void setOtherloanOverdue90(Long otherloanOverdue90){
		this.otherloanOverdue90 = otherloanOverdue90;
	}

	/**
	 *方法: 获得otherloanGuarantee
	 *@return: java.lang.Long  otherloanGuarantee
	 */
	public Long getOtherloanGuarantee(){
		return this.otherloanGuarantee;
	}

	/**
	 *方法: 设置otherloanGuarantee
	 *@param: java.lang.Long  otherloanGuarantee
	 */
	public void setOtherloanGuarantee(Long otherloanGuarantee){
		this.otherloanGuarantee = otherloanGuarantee;
	}

	/**
	 *方法: 获得isfail
	 *@return: java.lang.String  isfail
	 */
	public String getIsfail(){
		return this.isfail;
	}

	/**
	 *方法: 设置isfail
	 *@param: java.lang.String  isfail
	 */
	public void setIsfail(String isfail){
		this.isfail = isfail;
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