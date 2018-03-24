package com.jy.modules.externalplatform.interfacerepository.jxl.extjxldemandsinfostock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:需求信息表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:25:40
 */
public class ExtJxlDemandsInfoStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**近期需求表id*/
	private java.lang.Long fkRecentNeedId;

	/**需求名称*/
	private java.lang.String demandsName;

	/**对该需求的主叫总次数*/
	private java.lang.Long demandsCallOutCnt;

	/**对该需求的被叫总次数*/
	private java.lang.Long demandsCallInCnt;

	/**对该需求的主叫总时长（秒）*/
	private java.lang.Long demandsCallOutTime;

	/**对该需求的被叫总时长（秒）*/
	private java.lang.Long demandsCallInTime;

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
	 *方法: 获得fkRecentNeedId
	 *@return: java.lang.Long  fkRecentNeedId
	 */
	public java.lang.Long getFkRecentNeedId(){
		return this.fkRecentNeedId;
	}

	/**
	 *方法: 设置fkRecentNeedId
	 *@param: java.lang.Long  fkRecentNeedId
	 */
	public void setFkRecentNeedId(java.lang.Long fkRecentNeedId){
		this.fkRecentNeedId = fkRecentNeedId;
	}

	/**
	 *方法: 获得demandsName
	 *@return: java.lang.String  demandsName
	 */
	public java.lang.String getDemandsName(){
		return this.demandsName;
	}

	/**
	 *方法: 设置demandsName
	 *@param: java.lang.String  demandsName
	 */
	public void setDemandsName(java.lang.String demandsName){
		this.demandsName = demandsName;
	}

	/**
	 *方法: 获得demandsCallOutCnt
	 *@return: java.lang.Long  demandsCallOutCnt
	 */
	public java.lang.Long getDemandsCallOutCnt(){
		return this.demandsCallOutCnt;
	}

	/**
	 *方法: 设置demandsCallOutCnt
	 *@param: java.lang.Long  demandsCallOutCnt
	 */
	public void setDemandsCallOutCnt(java.lang.Long demandsCallOutCnt){
		this.demandsCallOutCnt = demandsCallOutCnt;
	}

	/**
	 *方法: 获得demandsCallInCnt
	 *@return: java.lang.Long  demandsCallInCnt
	 */
	public java.lang.Long getDemandsCallInCnt(){
		return this.demandsCallInCnt;
	}

	/**
	 *方法: 设置demandsCallInCnt
	 *@param: java.lang.Long  demandsCallInCnt
	 */
	public void setDemandsCallInCnt(java.lang.Long demandsCallInCnt){
		this.demandsCallInCnt = demandsCallInCnt;
	}

	/**
	 *方法: 获得demandsCallOutTime
	 *@return: java.lang.Long  demandsCallOutTime
	 */
	public java.lang.Long getDemandsCallOutTime(){
		return this.demandsCallOutTime;
	}

	/**
	 *方法: 设置demandsCallOutTime
	 *@param: java.lang.Long  demandsCallOutTime
	 */
	public void setDemandsCallOutTime(java.lang.Long demandsCallOutTime){
		this.demandsCallOutTime = demandsCallOutTime;
	}

	/**
	 *方法: 获得demandsCallInTime
	 *@return: java.lang.Long  demandsCallInTime
	 */
	public java.lang.Long getDemandsCallInTime(){
		return this.demandsCallInTime;
	}

	/**
	 *方法: 设置demandsCallInTime
	 *@param: java.lang.Long  demandsCallInTime
	 */
	public void setDemandsCallInTime(java.lang.Long demandsCallInTime){
		this.demandsCallInTime = demandsCallInTime;
	}

}