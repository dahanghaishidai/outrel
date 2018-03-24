package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycase.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:汇法网企业案例信息表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 10:10:52
 */
public class ExtLawCompanyCaseDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**数据在汇法网主键Id*/
	private java.lang.Long keyid;

	/**企业全称*/
	private java.lang.String name;

	/**组织机构代码*/
	private java.lang.String cidorcode;

	/**当事人类型*/
	private java.lang.String ptype;

	/**案件标题*/
	private java.lang.String title;

	/**审结日期（yyyy-MM-dd）*/
	private java.lang.String adjudicateDate;

	/**案件类型*/
	private java.lang.String casetype;

	/**案件字号*/
	private java.lang.String casenum;

	/**原件下载地址*/
	private java.lang.String ownfile;

	/**pdf下载地址*/
	private java.lang.String pdf;

	/**内容查看地址*/
	private java.lang.String contenthref;

	/**异议内容*/
	private java.lang.String objection;

	/**异议时间（yyyy-MM-dd)*/
	private java.lang.String objectiontime;

	/**汇法网企业信息主表ID*/
	private java.lang.Long fkId;

	/**数据时间（yyyy-MM-dd）*/
	private java.lang.String datatime;
	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;
	
	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.sql.Timestamp createTime) {
		this.createTime = createTime;
	}

	public java.sql.Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(java.sql.Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}
	
	public java.lang.String getDatatime() {
		return datatime;
	}

	public void setDatatime(java.lang.String datatime) {
		this.datatime = datatime;
	}

	/**
	 *方法: 获得keyid
	 *@return: java.lang.Long  keyid
	 */
	public java.lang.Long getKeyid(){
		return this.keyid;
	}

	/**
	 *方法: 设置keyid
	 *@param: java.lang.Long  keyid
	 */
	public void setKeyid(java.lang.Long keyid){
		this.keyid = keyid;
	}

	/**
	 *方法: 获得name
	 *@return: java.lang.String  name
	 */
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置name
	 *@param: java.lang.String  name
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}

	/**
	 *方法: 获得cidorcode
	 *@return: java.lang.String  cidorcode
	 */
	public java.lang.String getCidorcode(){
		return this.cidorcode;
	}

	/**
	 *方法: 设置cidorcode
	 *@param: java.lang.String  cidorcode
	 */
	public void setCidorcode(java.lang.String cidorcode){
		this.cidorcode = cidorcode;
	}

	/**
	 *方法: 获得ptype
	 *@return: java.lang.String  ptype
	 */
	public java.lang.String getPtype(){
		return this.ptype;
	}

	/**
	 *方法: 设置ptype
	 *@param: java.lang.String  ptype
	 */
	public void setPtype(java.lang.String ptype){
		this.ptype = ptype;
	}

	/**
	 *方法: 获得title
	 *@return: java.lang.String  title
	 */
	public java.lang.String getTitle(){
		return this.title;
	}

	/**
	 *方法: 设置title
	 *@param: java.lang.String  title
	 */
	public void setTitle(java.lang.String title){
		this.title = title;
	}

	/**
	 *方法: 获得adjudicateDate
	 *@return: java.lang.String  adjudicateDate
	 */
	public java.lang.String getAdjudicateDate(){
		return this.adjudicateDate;
	}

	/**
	 *方法: 设置adjudicateDate
	 *@param: java.lang.String  adjudicateDate
	 */
	public void setAdjudicateDate(java.lang.String adjudicateDate){
		this.adjudicateDate = adjudicateDate;
	}

	/**
	 *方法: 获得casetype
	 *@return: java.lang.String  casetype
	 */
	public java.lang.String getCasetype(){
		return this.casetype;
	}

	/**
	 *方法: 设置casetype
	 *@param: java.lang.String  casetype
	 */
	public void setCasetype(java.lang.String casetype){
		this.casetype = casetype;
	}

	/**
	 *方法: 获得casenum
	 *@return: java.lang.String  casenum
	 */
	public java.lang.String getCasenum(){
		return this.casenum;
	}

	/**
	 *方法: 设置casenum
	 *@param: java.lang.String  casenum
	 */
	public void setCasenum(java.lang.String casenum){
		this.casenum = casenum;
	}

	/**
	 *方法: 获得ownfile
	 *@return: java.lang.String  ownfile
	 */
	public java.lang.String getOwnfile(){
		return this.ownfile;
	}

	/**
	 *方法: 设置ownfile
	 *@param: java.lang.String  ownfile
	 */
	public void setOwnfile(java.lang.String ownfile){
		this.ownfile = ownfile;
	}

	/**
	 *方法: 获得pdf
	 *@return: java.lang.String  pdf
	 */
	public java.lang.String getPdf(){
		return this.pdf;
	}

	/**
	 *方法: 设置pdf
	 *@param: java.lang.String  pdf
	 */
	public void setPdf(java.lang.String pdf){
		this.pdf = pdf;
	}

	/**
	 *方法: 获得contenthref
	 *@return: java.lang.String  contenthref
	 */
	public java.lang.String getContenthref(){
		return this.contenthref;
	}

	/**
	 *方法: 设置contenthref
	 *@param: java.lang.String  contenthref
	 */
	public void setContenthref(java.lang.String contenthref){
		this.contenthref = contenthref;
	}

	/**
	 *方法: 获得objection
	 *@return: java.lang.String  objection
	 */
	public java.lang.String getObjection(){
		return this.objection;
	}

	/**
	 *方法: 设置objection
	 *@param: java.lang.String  objection
	 */
	public void setObjection(java.lang.String objection){
		this.objection = objection;
	}

	/**
	 *方法: 获得objectiontime
	 *@return: java.lang.String  objectiontime
	 */
	public java.lang.String getObjectiontime(){
		return this.objectiontime;
	}

	/**
	 *方法: 设置objectiontime
	 *@param: java.lang.String  objectiontime
	 */
	public void setObjectiontime(java.lang.String objectiontime){
		this.objectiontime = objectiontime;
	}

	/**
	 *方法: 获得fkId
	 *@return: java.lang.Long  fkId
	 */
	public java.lang.Long getFkId(){
		return this.fkId;
	}

	/**
	 *方法: 设置fkId
	 *@param: java.lang.Long  fkId
	 */
	public void setFkId(java.lang.Long fkId){
		this.fkId = fkId;
	}

}