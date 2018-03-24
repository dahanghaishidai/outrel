package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlqrecord.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:聚信立央行征信报告（查询记录信息表）
 *@author dell
 *@version 1.0,
 *@date 2017-08-24 21:00:21
 */
public class ExtJxlQrecordDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**征信主表ID*/
	private java.lang.Long fkReportId;

	/**查询日期*/
	private java.lang.String queryTime;

	/**查询机构*/
	private java.lang.String queryOperator;

	/**查询原因*/
	private java.lang.String queryReason;

	/**查询类型（1、机构查询 2、个人查询）*/
	private java.lang.String queryType;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
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
	 *方法: 获得queryTime
	 *@return: java.lang.String  queryTime
	 */
	public java.lang.String getQueryTime(){
		return this.queryTime;
	}

	/**
	 *方法: 设置queryTime
	 *@param: java.lang.String  queryTime
	 */
	public void setQueryTime(java.lang.String queryTime){
		this.queryTime = queryTime;
	}

	/**
	 *方法: 获得queryOperator
	 *@return: java.lang.String  queryOperator
	 */
	public java.lang.String getQueryOperator(){
		return this.queryOperator;
	}

	/**
	 *方法: 设置queryOperator
	 *@param: java.lang.String  queryOperator
	 */
	public void setQueryOperator(java.lang.String queryOperator){
		this.queryOperator = queryOperator;
	}

	/**
	 *方法: 获得queryReason
	 *@return: java.lang.String  queryReason
	 */
	public java.lang.String getQueryReason(){
		return this.queryReason;
	}

	/**
	 *方法: 设置queryReason
	 *@param: java.lang.String  queryReason
	 */
	public void setQueryReason(java.lang.String queryReason){
		this.queryReason = queryReason;
	}

	/**
	 *方法: 获得queryType
	 *@return: java.lang.String  queryType
	 */
	public java.lang.String getQueryType(){
		return this.queryType;
	}

	/**
	 *方法: 设置queryType
	 *@param: java.lang.String  queryType
	 */
	public void setQueryType(java.lang.String queryType){
		this.queryType = queryType;
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