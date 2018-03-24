package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourtnoprom.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:个人/单位-法院失信被执行信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-18 11:33:37
 */
public class ExtWlZxtCourtNoPromDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**模块查询状态表ID*/
	private Long moduleFkId;

	/**立案时间 */
	private String time;

	/**被执行人性别(个人)*/
	private String sex;

	/**被执行人的履行情况 */
	private String execution;

	/**执行依据文号 */
	private String documentNo;

	/**相关当事人(个人)*/
	private String personConcerned;

	/**执行法院 */
	private String court;

	/**身份证号码(个人)*/
	private String idNo;

	/**组织机构代码(单位)*/
	private String corpNo;

	/**做出执行依据单位 */
	private String executionUnit;

	/**失信被执行人行为具体情形 */
	private String reason;

	/**生效法律文书确定的义务*/
	private String obligation;

	/**被执行人年龄(个人)*/
	private String age;

	/**被执行人姓名 */
	private String personName;

	/**法院所属省份 */
	private String province;

	/**案号 */
	private String caseNo;

	/**发布时间 */
	private String publishTime;

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
	 *方法: 获得moduleFkId
	 *@return: java.lang.Long  moduleFkId
	 */
	public Long getModuleFkId(){
		return this.moduleFkId;
	}

	/**
	 *方法: 设置moduleFkId
	 *@param: java.lang.Long  moduleFkId
	 */
	public void setModuleFkId(Long moduleFkId){
		this.moduleFkId = moduleFkId;
	}

	/**
	 *方法: 获得time
	 *@return: java.lang.String  time
	 */
	public String getTime(){
		return this.time;
	}

	/**
	 *方法: 设置time
	 *@param: java.lang.String  time
	 */
	public void setTime(String time){
		this.time = time;
	}

	/**
	 *方法: 获得sex
	 *@return: java.lang.String  sex
	 */
	public String getSex(){
		return this.sex;
	}

	/**
	 *方法: 设置sex
	 *@param: java.lang.String  sex
	 */
	public void setSex(String sex){
		this.sex = sex;
	}

	/**
	 *方法: 获得execution
	 *@return: String  execution
	 */
	public String getExecution(){
		return this.execution;
	}

	/**
	 *方法: 设置execution
	 *@param: String  execution
	 */
	public void setExecution(String execution){
		this.execution = execution;
	}

	/**
	 *方法: 获得documentNo
	 *@return: java.lang.String  documentNo
	 */
	public String getDocumentNo(){
		return this.documentNo;
	}

	/**
	 *方法: 设置documentNo
	 *@param: java.lang.String  documentNo
	 */
	public void setDocumentNo(String documentNo){
		this.documentNo = documentNo;
	}

	/**
	 *方法: 获得personConcerned
	 *@return: java.lang.String  personConcerned
	 */
	public String getPersonConcerned(){
		return this.personConcerned;
	}

	/**
	 *方法: 设置personConcerned
	 *@param: java.lang.String  personConcerned
	 */
	public void setPersonConcerned(String personConcerned){
		this.personConcerned = personConcerned;
	}

	/**
	 *方法: 获得court
	 *@return: java.lang.String  court
	 */
	public String getCourt(){
		return this.court;
	}

	/**
	 *方法: 设置court
	 *@param: java.lang.String  court
	 */
	public void setCourt(String court){
		this.court = court;
	}

	/**
	 *方法: 获得idNo
	 *@return: java.lang.String  idNo
	 */
	public String getIdNo(){
		return this.idNo;
	}

	/**
	 *方法: 设置idNo
	 *@param: java.lang.String  idNo
	 */
	public void setIdNo(String idNo){
		this.idNo = idNo;
	}

	/**
	 *方法: 获得corpNo
	 *@return: java.lang.String  corpNo
	 */
	public String getCorpNo(){
		return this.corpNo;
	}

	/**
	 *方法: 设置corpNo
	 *@param: java.lang.String  corpNo
	 */
	public void setCorpNo(String corpNo){
		this.corpNo = corpNo;
	}

	/**
	 *方法: 获得executionUnit
	 *@return: java.lang.String  executionUnit
	 */
	public String getExecutionUnit(){
		return this.executionUnit;
	}

	/**
	 *方法: 设置executionUnit
	 *@param: java.lang.String  executionUnit
	 */
	public void setExecutionUnit(String executionUnit){
		this.executionUnit = executionUnit;
	}

	/**
	 *方法: 获得reason
	 *@return: String  reason
	 */
	public String getReason(){
		return this.reason;
	}

	/**
	 *方法: 设置reason
	 *@param: String  reason
	 */
	public void setReason(String reason){
		this.reason = reason;
	}

	/**
	 *方法: 获得obligation
	 *@return: String  obligation
	 */
	public String getObligation(){
		return this.obligation;
	}

	/**
	 *方法: 设置obligation
	 *@param: String  obligation
	 */
	public void setObligation(String obligation){
		this.obligation = obligation;
	}

	/**
	 *方法: 获得age
	 *@return: java.lang.String  age
	 */
	public String getAge(){
		return this.age;
	}

	/**
	 *方法: 设置age
	 *@param: java.lang.String  age
	 */
	public void setAge(String age){
		this.age = age;
	}

	/**
	 *方法: 获得personName
	 *@return: java.lang.String  personName
	 */
	public String getPersonName(){
		return this.personName;
	}

	/**
	 *方法: 设置personName
	 *@param: java.lang.String  personName
	 */
	public void setPersonName(String personName){
		this.personName = personName;
	}

	/**
	 *方法: 获得province
	 *@return: java.lang.String  province
	 */
	public String getProvince(){
		return this.province;
	}

	/**
	 *方法: 设置province
	 *@param: java.lang.String  province
	 */
	public void setProvince(String province){
		this.province = province;
	}

	/**
	 *方法: 获得caseNo
	 *@return: java.lang.String  caseNo
	 */
	public String getCaseNo(){
		return this.caseNo;
	}

	/**
	 *方法: 设置caseNo
	 *@param: java.lang.String  caseNo
	 */
	public void setCaseNo(String caseNo){
		this.caseNo = caseNo;
	}

	/**
	 *方法: 获得publishTime
	 *@return: java.lang.String  publishTime
	 */
	public String getPublishTime(){
		return this.publishTime;
	}

	/**
	 *方法: 设置publishTime
	 *@param: java.lang.String  publishTime
	 */
	public void setPublishTime(String publishTime){
		this.publishTime = publishTime;
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