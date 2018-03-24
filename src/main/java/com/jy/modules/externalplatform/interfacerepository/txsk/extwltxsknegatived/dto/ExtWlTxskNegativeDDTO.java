package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegatived.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:负面信息查询详情表
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-19 13:56:39
 */
public class ExtWlTxskNegativeDDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**负面信息查询主表主键*/
	private Long fkId;

	/**身份证号*/
	private String idCard;

	/**姓名*/
	private String name;

	/**查询数据状态  EXIST、 NO_DATA*/
	private String status;

	/**是否在逃*/
	private String escape;

	/**是否有前科*/
	private String crime;

	/**是否吸毒*/
	private String drug;

	/**是否涉毒*/
	private String drugRelated;

	/**在逃比对结果 一致，不一致*/
	private String escapeCompared;

	/**前科比对结果 一致，不一致*/
	private String crimeCompared;

	/**吸毒比对结果 一致，不一致*/
	private String drugCompared;

	/**涉毒比对结果 一致，不一致*/
	private String drugRelatedCompared;

	/**案发时间 [a,b)的时间区间，代表案发距今 a-b 年(不含 b)*/
	private String caseTime;

	/**前科事件数量*/
	private String checkCount;

	/**事件类别*/
	private String caseType;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp updateTime;

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
	 *方法: 获得fkId
	 *@return: java.lang.Long  fkId
	 */
	public Long getFkId(){
		return this.fkId;
	}

	/**
	 *方法: 设置fkId
	 *@param: java.lang.Long  fkId
	 */
	public void setFkId(Long fkId){
		this.fkId = fkId;
	}

	/**
	 *方法: 获得idCard
	 *@return: java.lang.String  idCard
	 */
	public String getIdCard(){
		return this.idCard;
	}

	/**
	 *方法: 设置idCard
	 *@param: java.lang.String  idCard
	 */
	public void setIdCard(String idCard){
		this.idCard = idCard;
	}

	/**
	 *方法: 获得name
	 *@return: java.lang.String  name
	 */
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置name
	 *@param: java.lang.String  name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 *方法: 获得status
	 *@return: java.lang.String  status
	 */
	public String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置status
	 *@param: java.lang.String  status
	 */
	public void setStatus(String status){
		this.status = status;
	}

	/**
	 *方法: 获得escape
	 *@return: java.lang.String  escape
	 */
	public String getEscape(){
		return this.escape;
	}

	/**
	 *方法: 设置escape
	 *@param: java.lang.String  escape
	 */
	public void setEscape(String escape){
		this.escape = escape;
	}

	/**
	 *方法: 获得crime
	 *@return: java.lang.String  crime
	 */
	public String getCrime(){
		return this.crime;
	}

	/**
	 *方法: 设置crime
	 *@param: java.lang.String  crime
	 */
	public void setCrime(String crime){
		this.crime = crime;
	}

	/**
	 *方法: 获得drug
	 *@return: java.lang.String  drug
	 */
	public String getDrug(){
		return this.drug;
	}

	/**
	 *方法: 设置drug
	 *@param: java.lang.String  drug
	 */
	public void setDrug(String drug){
		this.drug = drug;
	}

	/**
	 *方法: 获得drugRelated
	 *@return: java.lang.String  drugRelated
	 */
	public String getDrugRelated(){
		return this.drugRelated;
	}

	/**
	 *方法: 设置drugRelated
	 *@param: java.lang.String  drugRelated
	 */
	public void setDrugRelated(String drugRelated){
		this.drugRelated = drugRelated;
	}

	/**
	 *方法: 获得escapeCompared
	 *@return: java.lang.String  escapeCompared
	 */
	public String getEscapeCompared(){
		return this.escapeCompared;
	}

	/**
	 *方法: 设置escapeCompared
	 *@param: java.lang.String  escapeCompared
	 */
	public void setEscapeCompared(String escapeCompared){
		this.escapeCompared = escapeCompared;
	}

	/**
	 *方法: 获得crimeCompared
	 *@return: java.lang.String  crimeCompared
	 */
	public String getCrimeCompared(){
		return this.crimeCompared;
	}

	/**
	 *方法: 设置crimeCompared
	 *@param: java.lang.String  crimeCompared
	 */
	public void setCrimeCompared(String crimeCompared){
		this.crimeCompared = crimeCompared;
	}

	/**
	 *方法: 获得drugCompared
	 *@return: java.lang.String  drugCompared
	 */
	public String getDrugCompared(){
		return this.drugCompared;
	}

	/**
	 *方法: 设置drugCompared
	 *@param: java.lang.String  drugCompared
	 */
	public void setDrugCompared(String drugCompared){
		this.drugCompared = drugCompared;
	}

	/**
	 *方法: 获得drugRelatedCompared
	 *@return: java.lang.String  drugRelatedCompared
	 */
	public String getDrugRelatedCompared(){
		return this.drugRelatedCompared;
	}

	/**
	 *方法: 设置drugRelatedCompared
	 *@param: java.lang.String  drugRelatedCompared
	 */
	public void setDrugRelatedCompared(String drugRelatedCompared){
		this.drugRelatedCompared = drugRelatedCompared;
	}

	/**
	 *方法: 获得caseTime
	 *@return: java.lang.String  caseTime
	 */
	public String getCaseTime(){
		return this.caseTime;
	}

	/**
	 *方法: 设置caseTime
	 *@param: java.lang.String  caseTime
	 */
	public void setCaseTime(String caseTime){
		this.caseTime = caseTime;
	}

	/**
	 *方法: 获得checkCount
	 *@return: java.lang.String  checkCount
	 */
	public String getCheckCount(){
		return this.checkCount;
	}

	/**
	 *方法: 设置checkCount
	 *@param: java.lang.String  checkCount
	 */
	public void setCheckCount(String checkCount){
		this.checkCount = checkCount;
	}

	/**
	 *方法: 获得caseType
	 *@return: java.lang.String  caseType
	 */
	public String getCaseType(){
		return this.caseType;
	}

	/**
	 *方法: 设置caseType
	 *@param: java.lang.String  caseType
	 */
	public void setCaseType(String caseType){
		this.caseType = caseType;
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
	 *方法: 获得updateTime
	 *@return: java.sql.Timestamp  updateTime
	 */
	public java.sql.Timestamp getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置updateTime
	 *@param: java.sql.Timestamp  updateTime
	 */
	public void setUpdateTime(java.sql.Timestamp updateTime){
		this.updateTime = updateTime;
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