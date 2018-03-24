package com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryguarstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话征信贷款信息查询_担保信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-09 10:01:47
 */
public class ExtShCreqryGuarStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**查询报告主键*/
	private java.lang.Long reportId;

	/**担保人姓名*/
	private java.lang.String sname;

	/**担保人证件类型*/
	private java.lang.String scerttype;

	/**担保人证件号*/
	private java.lang.String scertno;

	/**担保状态(1担保中)*/
	private java.lang.String istate;

	/**担保金额*/
	private java.lang.Long ioccursum;

	/**业务合同号*/
	private java.lang.String saccount;

	/**CREATE_TIME*/
	private java.sql.Timestamp createTime;

	/**MODIFY_TIME*/
	private java.sql.Timestamp modifyTime;

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
	 *方法: 获得reportId
	 *@return: java.lang.Long  reportId
	 */
	public java.lang.Long getReportId(){
		return this.reportId;
	}

	/**
	 *方法: 设置reportId
	 *@param: java.lang.Long  reportId
	 */
	public void setReportId(java.lang.Long reportId){
		this.reportId = reportId;
	}

	/**
	 *方法: 获得sname
	 *@return: java.lang.String  sname
	 */
	public java.lang.String getSname(){
		return this.sname;
	}

	/**
	 *方法: 设置sname
	 *@param: java.lang.String  sname
	 */
	public void setSname(java.lang.String sname){
		this.sname = sname;
	}

	/**
	 *方法: 获得scerttype
	 *@return: java.lang.String  scerttype
	 */
	public java.lang.String getScerttype(){
		return this.scerttype;
	}

	/**
	 *方法: 设置scerttype
	 *@param: java.lang.String  scerttype
	 */
	public void setScerttype(java.lang.String scerttype){
		this.scerttype = scerttype;
	}

	/**
	 *方法: 获得scertno
	 *@return: java.lang.String  scertno
	 */
	public java.lang.String getScertno(){
		return this.scertno;
	}

	/**
	 *方法: 设置scertno
	 *@param: java.lang.String  scertno
	 */
	public void setScertno(java.lang.String scertno){
		this.scertno = scertno;
	}

	/**
	 *方法: 获得istate
	 *@return: java.lang.String  istate
	 */
	public java.lang.String getIstate(){
		return this.istate;
	}

	/**
	 *方法: 设置istate
	 *@param: java.lang.String  istate
	 */
	public void setIstate(java.lang.String istate){
		this.istate = istate;
	}

	/**
	 *方法: 获得ioccursum
	 *@return: java.lang.Long  ioccursum
	 */
	public java.lang.Long getIoccursum(){
		return this.ioccursum;
	}

	/**
	 *方法: 设置ioccursum
	 *@param: java.lang.Long  ioccursum
	 */
	public void setIoccursum(java.lang.Long ioccursum){
		this.ioccursum = ioccursum;
	}

	/**
	 *方法: 获得saccount
	 *@return: java.lang.String  saccount
	 */
	public java.lang.String getSaccount(){
		return this.saccount;
	}

	/**
	 *方法: 设置saccount
	 *@param: java.lang.String  saccount
	 */
	public void setSaccount(java.lang.String saccount){
		this.saccount = saccount;
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

}