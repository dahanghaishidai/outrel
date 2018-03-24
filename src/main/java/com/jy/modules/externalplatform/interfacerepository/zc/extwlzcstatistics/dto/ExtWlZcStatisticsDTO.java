package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcstatistics.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:致诚统计次数表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 13:40:09
 */
public class ExtWlZcStatisticsDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private Long id;

	/**主表主键*/
	private String keyId;

	/**其他机构查询次数*/
	private String timesByOtherOrg;

	/**其他查询机构数*/
	private String otherOrgCount;

	/**本机构查询次数*/
	private String timesByCurrentOrg;

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
	 *方法: 获得timesByOtherOrg
	 *@return: java.lang.String  timesByOtherOrg
	 */
	public String getTimesByOtherOrg(){
		return this.timesByOtherOrg;
	}

	/**
	 *方法: 设置timesByOtherOrg
	 *@param: java.lang.String  timesByOtherOrg
	 */
	public void setTimesByOtherOrg(String timesByOtherOrg){
		this.timesByOtherOrg = timesByOtherOrg;
	}

	/**
	 *方法: 获得otherOrgCount
	 *@return: java.lang.String  otherOrgCount
	 */
	public String getOtherOrgCount(){
		return this.otherOrgCount;
	}

	/**
	 *方法: 设置otherOrgCount
	 *@param: java.lang.String  otherOrgCount
	 */
	public void setOtherOrgCount(String otherOrgCount){
		this.otherOrgCount = otherOrgCount;
	}

	/**
	 *方法: 获得timesByCurrentOrg
	 *@return: java.lang.String  timesByCurrentOrg
	 */
	public String getTimesByCurrentOrg(){
		return this.timesByCurrentOrg;
	}

	/**
	 *方法: 设置timesByCurrentOrg
	 *@param: java.lang.String  timesByCurrentOrg
	 */
	public void setTimesByCurrentOrg(String timesByCurrentOrg){
		this.timesByCurrentOrg = timesByCurrentOrg;
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