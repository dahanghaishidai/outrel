package com.jy.modules.externalplatform.interfacerepository.br.extbrreportlastweek.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:记录百融个人过去一周数据
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-07 15:56:44
 */
public class ExtBrReportLastweekDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**BR_REPORT_ID*/
	private java.lang.Long brReportId;

	/**OPTLOCK*/
	private java.lang.Long optlock;

	/**城市/操作系统/网站类型*/
	private java.lang.String onlineType;

	/**最近一周上网次数*/
	private java.lang.String lastweekOnlineNum;

	/**累积上网天数*/
	private java.lang.String onlineTotal;

	/**最后一次上网时间*/
	private java.lang.String lastOnline;

	/**名称*/
	private java.lang.String onlineName;

	/**CREATE_TIME*/
	private java.sql.Timestamp createTime;

	/**CREATE_BY*/
	private java.lang.String createBy;

	/**MODIFY_TIME*/
	private java.sql.Timestamp modifyTime;

	/**MODIFY_BY*/
	private java.lang.String modifyBy;

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
	 *方法: 获得brReportId
	 *@return: java.lang.Long  brReportId
	 */
	public java.lang.Long getBrReportId(){
		return this.brReportId;
	}

	/**
	 *方法: 设置brReportId
	 *@param: java.lang.Long  brReportId
	 */
	public void setBrReportId(java.lang.Long brReportId){
		this.brReportId = brReportId;
	}

	/**
	 *方法: 获得optlock
	 *@return: java.lang.Long  optlock
	 */
	public java.lang.Long getOptlock(){
		return this.optlock;
	}

	/**
	 *方法: 设置optlock
	 *@param: java.lang.Long  optlock
	 */
	public void setOptlock(java.lang.Long optlock){
		this.optlock = optlock;
	}

	/**
	 *方法: 获得onlineType
	 *@return: java.lang.String  onlineType
	 */
	public java.lang.String getOnlineType(){
		return this.onlineType;
	}

	/**
	 *方法: 设置onlineType
	 *@param: java.lang.String  onlineType
	 */
	public void setOnlineType(java.lang.String onlineType){
		this.onlineType = onlineType;
	}

	/**
	 *方法: 获得lastweekOnlineNum
	 *@return: java.lang.String  lastweekOnlineNum
	 */
	public java.lang.String getLastweekOnlineNum(){
		return this.lastweekOnlineNum;
	}

	/**
	 *方法: 设置lastweekOnlineNum
	 *@param: java.lang.String  lastweekOnlineNum
	 */
	public void setLastweekOnlineNum(java.lang.String lastweekOnlineNum){
		this.lastweekOnlineNum = lastweekOnlineNum;
	}

	/**
	 *方法: 获得onlineTotal
	 *@return: java.lang.String  onlineTotal
	 */
	public java.lang.String getOnlineTotal(){
		return this.onlineTotal;
	}

	/**
	 *方法: 设置onlineTotal
	 *@param: java.lang.String  onlineTotal
	 */
	public void setOnlineTotal(java.lang.String onlineTotal){
		this.onlineTotal = onlineTotal;
	}

	/**
	 *方法: 获得lastOnline
	 *@return: java.lang.String  lastOnline
	 */
	public java.lang.String getLastOnline(){
		return this.lastOnline;
	}

	/**
	 *方法: 设置lastOnline
	 *@param: java.lang.String  lastOnline
	 */
	public void setLastOnline(java.lang.String lastOnline){
		this.lastOnline = lastOnline;
	}

	/**
	 *方法: 获得onlineName
	 *@return: java.lang.String  onlineName
	 */
	public java.lang.String getOnlineName(){
		return this.onlineName;
	}

	/**
	 *方法: 设置onlineName
	 *@param: java.lang.String  onlineName
	 */
	public void setOnlineName(java.lang.String onlineName){
		this.onlineName = onlineName;
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
	 *方法: 获得createBy
	 *@return: java.lang.String  createBy
	 */
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置createBy
	 *@param: java.lang.String  createBy
	 */
	public void setCreateBy(java.lang.String createBy){
		this.createBy = createBy;
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

	/**
	 *方法: 获得modifyBy
	 *@return: java.lang.String  modifyBy
	 */
	public java.lang.String getModifyBy(){
		return this.modifyBy;
	}

	/**
	 *方法: 设置modifyBy
	 *@param: java.lang.String  modifyBy
	 */
	public void setModifyBy(java.lang.String modifyBy){
		this.modifyBy = modifyBy;
	}

}