package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:元素征信-企业股东信息
 *@author dell
 *@version 1.0,
 *@date 2017-06-01 18:01:47
 */
public class ExtYszxShareholderInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**元素征信主表ID*/
	private java.lang.Long fkReportId;

	/**查询人姓名*/
	private java.lang.String ryname;

	/**企业(机构)名称*/
	private java.lang.String entname;

	/**注册号*/
	private java.lang.String regno;

	/**企业(机构)类型*/
	private java.lang.String enttype;

	/**注册资本(万元)*/
	private java.lang.String regcap;

	/**注册资本币种*/
	private java.lang.String regcapcur;

	/**企业状态*/
	private java.lang.String entstatus;

	/**认缴出资额(万元)*/
	private java.lang.String subconam;

	/**认缴出资币种*/
	private java.lang.String currency;

	/**出资方式*/
	private java.lang.String conform;

	/**出资比例*/
	private java.lang.String fundedratio;

	/**创建时间*/
	private java.sql.Timestamp createTime;

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
	 *方法: 获得ryname
	 *@return: java.lang.String  ryname
	 */
	public java.lang.String getRyname(){
		return this.ryname;
	}

	/**
	 *方法: 设置ryname
	 *@param: java.lang.String  ryname
	 */
	public void setRyname(java.lang.String ryname){
		this.ryname = ryname;
	}

	/**
	 *方法: 获得entname
	 *@return: java.lang.String  entname
	 */
	public java.lang.String getEntname(){
		return this.entname;
	}

	/**
	 *方法: 设置entname
	 *@param: java.lang.String  entname
	 */
	public void setEntname(java.lang.String entname){
		this.entname = entname;
	}

	/**
	 *方法: 获得regno
	 *@return: java.lang.String  regno
	 */
	public java.lang.String getRegno(){
		return this.regno;
	}

	/**
	 *方法: 设置regno
	 *@param: java.lang.String  regno
	 */
	public void setRegno(java.lang.String regno){
		this.regno = regno;
	}

	/**
	 *方法: 获得enttype
	 *@return: java.lang.String  enttype
	 */
	public java.lang.String getEnttype(){
		return this.enttype;
	}

	/**
	 *方法: 设置enttype
	 *@param: java.lang.String  enttype
	 */
	public void setEnttype(java.lang.String enttype){
		this.enttype = enttype;
	}

	/**
	 *方法: 获得regcap
	 *@return: java.lang.String  regcap
	 */
	public java.lang.String getRegcap(){
		return this.regcap;
	}

	/**
	 *方法: 设置regcap
	 *@param: java.lang.String  regcap
	 */
	public void setRegcap(java.lang.String regcap){
		this.regcap = regcap;
	}

	/**
	 *方法: 获得regcapcur
	 *@return: java.lang.String  regcapcur
	 */
	public java.lang.String getRegcapcur(){
		return this.regcapcur;
	}

	/**
	 *方法: 设置regcapcur
	 *@param: java.lang.String  regcapcur
	 */
	public void setRegcapcur(java.lang.String regcapcur){
		this.regcapcur = regcapcur;
	}

	/**
	 *方法: 获得entstatus
	 *@return: java.lang.String  entstatus
	 */
	public java.lang.String getEntstatus(){
		return this.entstatus;
	}

	/**
	 *方法: 设置entstatus
	 *@param: java.lang.String  entstatus
	 */
	public void setEntstatus(java.lang.String entstatus){
		this.entstatus = entstatus;
	}

	/**
	 *方法: 获得subconam
	 *@return: java.lang.String  subconam
	 */
	public java.lang.String getSubconam(){
		return this.subconam;
	}

	/**
	 *方法: 设置subconam
	 *@param: java.lang.String  subconam
	 */
	public void setSubconam(java.lang.String subconam){
		this.subconam = subconam;
	}

	/**
	 *方法: 获得currency
	 *@return: java.lang.String  currency
	 */
	public java.lang.String getCurrency(){
		return this.currency;
	}

	/**
	 *方法: 设置currency
	 *@param: java.lang.String  currency
	 */
	public void setCurrency(java.lang.String currency){
		this.currency = currency;
	}

	/**
	 *方法: 获得conform
	 *@return: java.lang.String  conform
	 */
	public java.lang.String getConform(){
		return this.conform;
	}

	/**
	 *方法: 设置conform
	 *@param: java.lang.String  conform
	 */
	public void setConform(java.lang.String conform){
		this.conform = conform;
	}

	/**
	 *方法: 获得fundedratio
	 *@return: java.lang.String  fundedratio
	 */
	public java.lang.String getFundedratio(){
		return this.fundedratio;
	}

	/**
	 *方法: 设置fundedratio
	 *@param: java.lang.String  fundedratio
	 */
	public void setFundedratio(java.lang.String fundedratio){
		this.fundedratio = fundedratio;
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

}