package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanytax.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:汇法网企业税务信息表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 10:11:13
 */
public class ExtLawCompanyTaxDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**数据在汇法网主键Id*/
	private java.lang.Long keyid;

	/**数据所有内容*/
	private java.lang.String allmsg;

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
	 *方法: 获得allmsg
	 *@return: java.lang.String  allmsg
	 */
	public java.lang.String getAllmsg(){
		return this.allmsg;
	}

	/**
	 *方法: 设置allmsg
	 *@param: java.lang.String  allmsg
	 */
	public void setAllmsg(java.lang.String allmsg){
		this.allmsg = allmsg;
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