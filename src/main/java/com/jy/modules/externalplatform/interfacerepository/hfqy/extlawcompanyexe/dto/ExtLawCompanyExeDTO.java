package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyexe.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:汇法网企业执行信息表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 10:10:40
 */
public class ExtLawCompanyExeDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**数据在汇法网ID*/
	private java.lang.Long keyid;

	/**被执行人组织机构全称*/
	private java.lang.String name;

	/**被执行人组织机构代码*/
	private java.lang.String cidorcode;

	/**执行法院*/
	private java.lang.String court;

	/**案号*/
	private java.lang.String casenum;

	/**案件状态*/
	private java.lang.String statute;

	/**执行标底*/
	private java.lang.String money;

	/**立案时间（yyyy-MM-dd）*/
	private java.lang.String putrecord;

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
	 *方法: 获得court
	 *@return: java.lang.String  court
	 */
	public java.lang.String getCourt(){
		return this.court;
	}

	/**
	 *方法: 设置court
	 *@param: java.lang.String  court
	 */
	public void setCourt(java.lang.String court){
		this.court = court;
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
	 *方法: 获得statute
	 *@return: java.lang.String  statute
	 */
	public java.lang.String getStatute(){
		return this.statute;
	}

	/**
	 *方法: 设置statute
	 *@param: java.lang.String  statute
	 */
	public void setStatute(java.lang.String statute){
		this.statute = statute;
	}

	/**
	 *方法: 获得money
	 *@return: java.lang.String  money
	 */
	public java.lang.String getMoney(){
		return this.money;
	}

	/**
	 *方法: 设置money
	 *@param: java.lang.String  money
	 */
	public void setMoney(java.lang.String money){
		this.money = money;
	}

	/**
	 *方法: 获得putrecord
	 *@return: java.lang.String  putrecord
	 */
	public java.lang.String getPutrecord(){
		return this.putrecord;
	}

	/**
	 *方法: 设置putrecord
	 *@param: java.lang.String  putrecord
	 */
	public void setPutrecord(java.lang.String putrecord){
		this.putrecord = putrecord;
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