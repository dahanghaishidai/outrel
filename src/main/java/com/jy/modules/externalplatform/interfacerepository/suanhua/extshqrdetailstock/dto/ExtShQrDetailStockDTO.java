package com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrdetailstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话征信查询记录查询详细
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-08 18:05:12
 */
public class ExtShQrDetailStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**查询报告主键*/
	private java.lang.Long reportId;

	/**查询机构*/
	private java.lang.String org;

	/**查询原因*/
	private java.lang.String reason;

	/**查询时间*/
	private java.lang.String datetime;

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
	 *方法: 获得org
	 *@return: java.lang.String  org
	 */
	public java.lang.String getOrg(){
		return this.org;
	}

	/**
	 *方法: 设置org
	 *@param: java.lang.String  org
	 */
	public void setOrg(java.lang.String org){
		this.org = org;
	}

	/**
	 *方法: 获得reason
	 *@return: java.lang.String  reason
	 */
	public java.lang.String getReason(){
		return this.reason;
	}

	/**
	 *方法: 设置reason
	 *@param: java.lang.String  reason
	 */
	public void setReason(java.lang.String reason){
		this.reason = reason;
	}

	/**
	 *方法: 获得datetime
	 *@return: java.lang.String  datetime
	 */
	public java.lang.String getDatetime(){
		return this.datetime;
	}

	/**
	 *方法: 设置datetime
	 *@param: java.lang.String  datetime
	 */
	public void setDatetime(java.lang.String datetime){
		this.datetime = datetime;
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