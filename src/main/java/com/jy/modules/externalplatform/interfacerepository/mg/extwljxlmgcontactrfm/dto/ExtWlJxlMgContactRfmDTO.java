package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontactrfm.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:EXT_WL_JXL_MG_CONTACT_RFM
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-09 17:44:42
 */
public class ExtWlJxlMgContactRfmDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**蜜罐ID*/
	private String userGridId;

	/**与所有联系人的最近主动通话时间，时间戳(ms)*/
	private Long recentTimeToAll;

	/**与所有联系人的最近被动通话时间，时间戳(ms)*/
	private Long recentTimeBeAll;

	/**与黑号的最近主动通话时间，时间戳(ms)*/
	private Long recentTimeToBlack;

	/**与黑号的最近被动通话时间，时间戳(ms)*/
	private Long recentTimeBeBlack;

	/**与申请人的最近主动通话时间，时间戳(ms)*/
	private Long recentTimeToApplied;

	/**与申请人的最近被动通话时间，时间戳(ms)*/
	private Long recentTimeBeApplied;

	/**与所有联系人的主动总通话次数*/
	private Long callCntToAll;

	/**与所有联系人的被动总通话次数*/
	private Long callCntBeAll;

	/**与黑号的主动总通话次数*/
	private Long callCntToBlack;

	/**与黑号的被动总通话次数*/
	private Long callCntBeBlack;

	/**与申请人的主动通话次数*/
	private Long callCntToApplied;

	/**与申请人的被动通话次数*/
	private Long callCntBeApplied;

	/**与所有联系人的主动总通话时长(s)*/
	private Long timeSpentToAll;

	/**与所有联系人的被动总通话时长(s)*/
	private Long timeSpentBeAll;

	/**与黑号的主动总通话时长(s)*/
	private Long timeSpentToBlack;

	/**与黑号的被动总通话时长(s)*/
	private Long timeSpentBeBlack;

	/**与申请人的主动通话时长(s)*/
	private Long timeSpentToApplied;

	/**与申请人的被动通话时长(s)*/
	private Long timeSpentBeApplied;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private Long createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**修改人*/
	private Long modifyBy;

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
	 *方法: 获得userGridId
	 *@return: java.lang.String  userGridId
	 */
	public String getUserGridId(){
		return this.userGridId;
	}

	/**
	 *方法: 设置userGridId
	 *@param: java.lang.String  userGridId
	 */
	public void setUserGridId(String userGridId){
		this.userGridId = userGridId;
	}

	/**
	 *方法: 获得recentTimeToAll
	 *@return: java.lang.Long  recentTimeToAll
	 */
	public Long getRecentTimeToAll(){
		return this.recentTimeToAll;
	}

	/**
	 *方法: 设置recentTimeToAll
	 *@param: java.lang.Long  recentTimeToAll
	 */
	public void setRecentTimeToAll(Long recentTimeToAll){
		this.recentTimeToAll = recentTimeToAll;
	}

	/**
	 *方法: 获得recentTimeBeAll
	 *@return: java.lang.Long  recentTimeBeAll
	 */
	public Long getRecentTimeBeAll(){
		return this.recentTimeBeAll;
	}

	/**
	 *方法: 设置recentTimeBeAll
	 *@param: java.lang.Long  recentTimeBeAll
	 */
	public void setRecentTimeBeAll(Long recentTimeBeAll){
		this.recentTimeBeAll = recentTimeBeAll;
	}

	/**
	 *方法: 获得recentTimeToBlack
	 *@return: java.lang.Long  recentTimeToBlack
	 */
	public Long getRecentTimeToBlack(){
		return this.recentTimeToBlack;
	}

	/**
	 *方法: 设置recentTimeToBlack
	 *@param: java.lang.Long  recentTimeToBlack
	 */
	public void setRecentTimeToBlack(Long recentTimeToBlack){
		this.recentTimeToBlack = recentTimeToBlack;
	}

	/**
	 *方法: 获得recentTimeBeBlack
	 *@return: java.lang.Long  recentTimeBeBlack
	 */
	public Long getRecentTimeBeBlack(){
		return this.recentTimeBeBlack;
	}

	/**
	 *方法: 设置recentTimeBeBlack
	 *@param: java.lang.Long  recentTimeBeBlack
	 */
	public void setRecentTimeBeBlack(Long recentTimeBeBlack){
		this.recentTimeBeBlack = recentTimeBeBlack;
	}

	/**
	 *方法: 获得recentTimeToApplied
	 *@return: java.lang.Long  recentTimeToApplied
	 */
	public Long getRecentTimeToApplied(){
		return this.recentTimeToApplied;
	}

	/**
	 *方法: 设置recentTimeToApplied
	 *@param: java.lang.Long  recentTimeToApplied
	 */
	public void setRecentTimeToApplied(Long recentTimeToApplied){
		this.recentTimeToApplied = recentTimeToApplied;
	}

	/**
	 *方法: 获得recentTimeBeApplied
	 *@return: java.lang.Long  recentTimeBeApplied
	 */
	public Long getRecentTimeBeApplied(){
		return this.recentTimeBeApplied;
	}

	/**
	 *方法: 设置recentTimeBeApplied
	 *@param: java.lang.Long  recentTimeBeApplied
	 */
	public void setRecentTimeBeApplied(Long recentTimeBeApplied){
		this.recentTimeBeApplied = recentTimeBeApplied;
	}

	/**
	 *方法: 获得callCntToAll
	 *@return: java.lang.Long  callCntToAll
	 */
	public Long getCallCntToAll(){
		return this.callCntToAll;
	}

	/**
	 *方法: 设置callCntToAll
	 *@param: java.lang.Long  callCntToAll
	 */
	public void setCallCntToAll(Long callCntToAll){
		this.callCntToAll = callCntToAll;
	}

	/**
	 *方法: 获得callCntBeAll
	 *@return: java.lang.Long  callCntBeAll
	 */
	public Long getCallCntBeAll(){
		return this.callCntBeAll;
	}

	/**
	 *方法: 设置callCntBeAll
	 *@param: java.lang.Long  callCntBeAll
	 */
	public void setCallCntBeAll(Long callCntBeAll){
		this.callCntBeAll = callCntBeAll;
	}

	/**
	 *方法: 获得callCntToBlack
	 *@return: java.lang.Long  callCntToBlack
	 */
	public Long getCallCntToBlack(){
		return this.callCntToBlack;
	}

	/**
	 *方法: 设置callCntToBlack
	 *@param: java.lang.Long  callCntToBlack
	 */
	public void setCallCntToBlack(Long callCntToBlack){
		this.callCntToBlack = callCntToBlack;
	}

	/**
	 *方法: 获得callCntBeBlack
	 *@return: java.lang.Long  callCntBeBlack
	 */
	public Long getCallCntBeBlack(){
		return this.callCntBeBlack;
	}

	/**
	 *方法: 设置callCntBeBlack
	 *@param: java.lang.Long  callCntBeBlack
	 */
	public void setCallCntBeBlack(Long callCntBeBlack){
		this.callCntBeBlack = callCntBeBlack;
	}

	/**
	 *方法: 获得callCntToApplied
	 *@return: java.lang.Long  callCntToApplied
	 */
	public Long getCallCntToApplied(){
		return this.callCntToApplied;
	}

	/**
	 *方法: 设置callCntToApplied
	 *@param: java.lang.Long  callCntToApplied
	 */
	public void setCallCntToApplied(Long callCntToApplied){
		this.callCntToApplied = callCntToApplied;
	}

	/**
	 *方法: 获得callCntBeApplied
	 *@return: java.lang.Long  callCntBeApplied
	 */
	public Long getCallCntBeApplied(){
		return this.callCntBeApplied;
	}

	/**
	 *方法: 设置callCntBeApplied
	 *@param: java.lang.Long  callCntBeApplied
	 */
	public void setCallCntBeApplied(Long callCntBeApplied){
		this.callCntBeApplied = callCntBeApplied;
	}

	/**
	 *方法: 获得timeSpentToAll
	 *@return: java.lang.Long  timeSpentToAll
	 */
	public Long getTimeSpentToAll(){
		return this.timeSpentToAll;
	}

	/**
	 *方法: 设置timeSpentToAll
	 *@param: java.lang.Long  timeSpentToAll
	 */
	public void setTimeSpentToAll(Long timeSpentToAll){
		this.timeSpentToAll = timeSpentToAll;
	}

	/**
	 *方法: 获得timeSpentBeAll
	 *@return: java.lang.Long  timeSpentBeAll
	 */
	public Long getTimeSpentBeAll(){
		return this.timeSpentBeAll;
	}

	/**
	 *方法: 设置timeSpentBeAll
	 *@param: java.lang.Long  timeSpentBeAll
	 */
	public void setTimeSpentBeAll(Long timeSpentBeAll){
		this.timeSpentBeAll = timeSpentBeAll;
	}

	/**
	 *方法: 获得timeSpentToBlack
	 *@return: java.lang.Long  timeSpentToBlack
	 */
	public Long getTimeSpentToBlack(){
		return this.timeSpentToBlack;
	}

	/**
	 *方法: 设置timeSpentToBlack
	 *@param: java.lang.Long  timeSpentToBlack
	 */
	public void setTimeSpentToBlack(Long timeSpentToBlack){
		this.timeSpentToBlack = timeSpentToBlack;
	}

	/**
	 *方法: 获得timeSpentBeBlack
	 *@return: java.lang.Long  timeSpentBeBlack
	 */
	public Long getTimeSpentBeBlack(){
		return this.timeSpentBeBlack;
	}

	/**
	 *方法: 设置timeSpentBeBlack
	 *@param: java.lang.Long  timeSpentBeBlack
	 */
	public void setTimeSpentBeBlack(Long timeSpentBeBlack){
		this.timeSpentBeBlack = timeSpentBeBlack;
	}

	/**
	 *方法: 获得timeSpentToApplied
	 *@return: java.lang.Long  timeSpentToApplied
	 */
	public Long getTimeSpentToApplied(){
		return this.timeSpentToApplied;
	}

	/**
	 *方法: 设置timeSpentToApplied
	 *@param: java.lang.Long  timeSpentToApplied
	 */
	public void setTimeSpentToApplied(Long timeSpentToApplied){
		this.timeSpentToApplied = timeSpentToApplied;
	}

	/**
	 *方法: 获得timeSpentBeApplied
	 *@return: java.lang.Long  timeSpentBeApplied
	 */
	public Long getTimeSpentBeApplied(){
		return this.timeSpentBeApplied;
	}

	/**
	 *方法: 设置timeSpentBeApplied
	 *@param: java.lang.Long  timeSpentBeApplied
	 */
	public void setTimeSpentBeApplied(Long timeSpentBeApplied){
		this.timeSpentBeApplied = timeSpentBeApplied;
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
	 *@return: java.lang.Long  createBy
	 */
	public Long getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置createBy
	 *@param: java.lang.Long  createBy
	 */
	public void setCreateBy(Long createBy){
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
	 *@return: java.lang.Long  modifyBy
	 */
	public Long getModifyBy(){
		return this.modifyBy;
	}

	/**
	 *方法: 设置modifyBy
	 *@param: java.lang.Long  modifyBy
	 */
	public void setModifyBy(Long modifyBy){
		this.modifyBy = modifyBy;
	}

}