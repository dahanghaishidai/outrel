package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrguarantees.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行结构化版(为他人担保信息表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:54:56
 */
public class ExtWlShSrGuaranteesDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**征信主表ID*/
	private Long fkReportId;

	/**信息详情*/
	private String original;

	/**担保时间*/
	private String guaranteeTime;

	/**担保对象证件类型*/
	private String guaranteeIdtype;

	/**担保对象证件类型*/
	private String guaranteeIdname;

	/**担保对象证件号*/
	private String guaranteeIdno;

	/**担保办理机构*/
	private String organization;

	/**担保贷款合同金额*/
	private String contractAmount;

	/**担保金额*/
	private String guaranteeAmount;

	/**担保贷款本金余额*/
	private String principaAmount;

	/**统计时间*/
	private String recordTime;

	/**是否失败(0-成功;1-失败)*/
	private String isfail;

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
	 *方法: 获得original
	 *@return: java.lang.String  original
	 */
	public String getOriginal(){
		return this.original;
	}

	/**
	 *方法: 设置original
	 *@param: java.lang.String  original
	 */
	public void setOriginal(String original){
		this.original = original;
	}

	/**
	 *方法: 获得guaranteeTime
	 *@return: java.lang.String  guaranteeTime
	 */
	public String getGuaranteeTime(){
		return this.guaranteeTime;
	}

	/**
	 *方法: 设置guaranteeTime
	 *@param: java.lang.String  guaranteeTime
	 */
	public void setGuaranteeTime(String guaranteeTime){
		this.guaranteeTime = guaranteeTime;
	}

	/**
	 *方法: 获得guaranteeIdtype
	 *@return: java.lang.String  guaranteeIdtype
	 */
	public String getGuaranteeIdtype(){
		return this.guaranteeIdtype;
	}

	/**
	 *方法: 设置guaranteeIdtype
	 *@param: java.lang.String  guaranteeIdtype
	 */
	public void setGuaranteeIdtype(String guaranteeIdtype){
		this.guaranteeIdtype = guaranteeIdtype;
	}

	/**
	 *方法: 获得guaranteeIdname
	 *@return: java.lang.String  guaranteeIdname
	 */
	public String getGuaranteeIdname(){
		return this.guaranteeIdname;
	}

	/**
	 *方法: 设置guaranteeIdname
	 *@param: java.lang.String  guaranteeIdname
	 */
	public void setGuaranteeIdname(String guaranteeIdname){
		this.guaranteeIdname = guaranteeIdname;
	}

	/**
	 *方法: 获得guaranteeIdno
	 *@return: java.lang.String  guaranteeIdno
	 */
	public String getGuaranteeIdno(){
		return this.guaranteeIdno;
	}

	/**
	 *方法: 设置guaranteeIdno
	 *@param: java.lang.String  guaranteeIdno
	 */
	public void setGuaranteeIdno(String guaranteeIdno){
		this.guaranteeIdno = guaranteeIdno;
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
	 *方法: 获得contractAmount
	 *@return: java.lang.String  contractAmount
	 */
	public String getContractAmount(){
		return this.contractAmount;
	}

	/**
	 *方法: 设置contractAmount
	 *@param: java.lang.String  contractAmount
	 */
	public void setContractAmount(String contractAmount){
		this.contractAmount = contractAmount;
	}

	/**
	 *方法: 获得guaranteeAmount
	 *@return: java.lang.String  guaranteeAmount
	 */
	public String getGuaranteeAmount(){
		return this.guaranteeAmount;
	}

	/**
	 *方法: 设置guaranteeAmount
	 *@param: java.lang.String  guaranteeAmount
	 */
	public void setGuaranteeAmount(String guaranteeAmount){
		this.guaranteeAmount = guaranteeAmount;
	}

	/**
	 *方法: 获得principaAmount
	 *@return: java.lang.String  principaAmount
	 */
	public String getPrincipaAmount(){
		return this.principaAmount;
	}

	/**
	 *方法: 设置principaAmount
	 *@param: java.lang.String  principaAmount
	 */
	public void setPrincipaAmount(String principaAmount){
		this.principaAmount = principaAmount;
	}

	/**
	 *方法: 获得recordTime
	 *@return: java.lang.String  recordTime
	 */
	public String getRecordTime(){
		return this.recordTime;
	}

	/**
	 *方法: 设置recordTime
	 *@param: java.lang.String  recordTime
	 */
	public void setRecordTime(String recordTime){
		this.recordTime = recordTime;
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