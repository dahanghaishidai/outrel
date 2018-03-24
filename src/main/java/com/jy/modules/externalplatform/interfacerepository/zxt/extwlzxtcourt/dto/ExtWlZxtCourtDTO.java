package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourt.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:个人/单位-法院被执行信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-15 18:07:46
 */
public class ExtWlZxtCourtDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**模块查询状态表ID*/
	private Long moduleFkId;

	/**被执行人姓名*/
	private String personName;

	/**身份证号码（个人）*/
	private String idNo;

	/**组织机构代码（单位）*/
	private String corpNo;

	/**案号*/
	private String caseNo;

	/**执行法院*/
	private String court;

	/**立案时间*/
	private String time;

	/**标题*/
	private String title;

	/**执行标的*/
	private String objective;

	/**内容*/
	private String content;

	/**申请人*/
	private String applicant;

	/**案件状态*/
	private String caseStatus;

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
	 *方法: 获得title
	 *@return: java.lang.String  title
	 */
	public String getTitle(){
		return this.title;
	}

	/**
	 *方法: 设置title
	 *@param: java.lang.String  title
	 */
	public void setTitle(String title){
		this.title = title;
	}

	/**
	 *方法: 获得objective
	 *@return: java.lang.String  objective
	 */
	public String getObjective(){
		return this.objective;
	}

	/**
	 *方法: 设置objective
	 *@param: java.lang.String  objective
	 */
	public void setObjective(String objective){
		this.objective = objective;
	}

	/**
	 *方法: 获得content
	 *@return: java.sql.Clob  content
	 */
	public String getContent(){
		return this.content;
	}

	/**
	 *方法: 设置content
	 *@param: java.sql.Clob  content
	 */
	public void setContent(String content){
		this.content = content;
	}

	/**
	 *方法: 获得applicant
	 *@return: java.lang.String  applicant
	 */
	public String getApplicant(){
		return this.applicant;
	}

	/**
	 *方法: 设置applicant
	 *@param: java.lang.String  applicant
	 */
	public void setApplicant(String applicant){
		this.applicant = applicant;
	}

	/**
	 *方法: 获得caseStatus
	 *@return: java.lang.String  caseStatus
	 */
	public String getCaseStatus(){
		return this.caseStatus;
	}

	/**
	 *方法: 设置caseStatus
	 *@param: java.lang.String  caseStatus
	 */
	public void setCaseStatus(String caseStatus){
		this.caseStatus = caseStatus;
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