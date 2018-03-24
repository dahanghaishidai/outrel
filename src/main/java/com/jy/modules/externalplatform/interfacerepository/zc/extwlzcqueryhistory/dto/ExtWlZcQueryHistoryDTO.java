package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryhistory.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:致诚查询历史表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 13:40:15
 */
public class ExtWlZcQueryHistoryDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private Long id;

	/**主表主键*/
	private String keyId;

	/**机构代号*/
	private String orgName;

	/**机构类型*/
	private String orgType;

	/**查询原因*/
	private String queryReason;

	/**查询时间*/
	private String time;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

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
	 *方法: 获得keyId
	 *@return: java.lang.String  keyId
	 */
	public String getKeyId(){
		return this.keyId;
	}

	/**
	 *方法: 设置keyId
	 *@param: java.lang.String  keyId
	 */
	public void setKeyId(String keyId){
		this.keyId = keyId;
	}

	/**
	 *方法: 获得orgName
	 *@return: java.lang.String  orgName
	 */
	public String getOrgName(){
		return this.orgName;
	}

	/**
	 *方法: 设置orgName
	 *@param: java.lang.String  orgName
	 */
	public void setOrgName(String orgName){
		this.orgName = orgName;
	}

	/**
	 *方法: 获得orgType
	 *@return: java.lang.String  orgType
	 */
	public String getOrgType(){
		return this.orgType;
	}

	/**
	 *方法: 设置orgType
	 *@param: java.lang.String  orgType
	 */
	public void setOrgType(String orgType){
		this.orgType = orgType;
	}

	/**
	 *方法: 获得queryReason
	 *@return: java.lang.String  queryReason
	 */
	public String getQueryReason(){
		return this.queryReason;
	}

	/**
	 *方法: 设置queryReason
	 *@param: java.lang.String  queryReason
	 */
	public void setQueryReason(String queryReason){
		this.queryReason = queryReason;
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