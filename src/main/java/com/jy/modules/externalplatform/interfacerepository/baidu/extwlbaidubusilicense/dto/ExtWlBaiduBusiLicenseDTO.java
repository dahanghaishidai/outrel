package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidubusilicense.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:百度金融工商执照表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-13 16:42:46
 */
public class ExtWlBaiduBusiLicenseDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**关联主表主键*/
	private String keyId;

	/**处罚编号*/
	private String punishmentNo;

	/**执法原因*/
	private String causeOfAction;

	/**处罚部门*/
	private String handleOrgName;

	/**公示时间*/
	private String pubDate;

	/**处罚内容*/
	private String punishmentContent;

	/**创建人*/
	private Long createBy;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改人*/
	private Long modifyBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**数据有效性(1：有效，0：无效)*/
	private String validateState;

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
	 *方法: 获得punishmentNo
	 *@return: java.lang.String  punishmentNo
	 */
	public String getPunishmentNo(){
		return this.punishmentNo;
	}

	/**
	 *方法: 设置punishmentNo
	 *@param: java.lang.String  punishmentNo
	 */
	public void setPunishmentNo(String punishmentNo){
		this.punishmentNo = punishmentNo;
	}

	/**
	 *方法: 获得causeOfAction
	 *@return: java.lang.String  causeOfAction
	 */
	public String getCauseOfAction(){
		return this.causeOfAction;
	}

	/**
	 *方法: 设置causeOfAction
	 *@param: java.lang.String  causeOfAction
	 */
	public void setCauseOfAction(String causeOfAction){
		this.causeOfAction = causeOfAction;
	}

	/**
	 *方法: 获得handleOrgName
	 *@return: java.lang.String  handleOrgName
	 */
	public String getHandleOrgName(){
		return this.handleOrgName;
	}

	/**
	 *方法: 设置handleOrgName
	 *@param: java.lang.String  handleOrgName
	 */
	public void setHandleOrgName(String handleOrgName){
		this.handleOrgName = handleOrgName;
	}

	/**
	 *方法: 获得pubDate
	 *@return: java.lang.String  pubDate
	 */
	public String getPubDate(){
		return this.pubDate;
	}

	/**
	 *方法: 设置pubDate
	 *@param: java.lang.String  pubDate
	 */
	public void setPubDate(String pubDate){
		this.pubDate = pubDate;
	}

	/**
	 *方法: 获得punishmentContent
	 *@return: java.lang.String  punishmentContent
	 */
	public String getPunishmentContent(){
		return this.punishmentContent;
	}

	/**
	 *方法: 设置punishmentContent
	 *@param: java.lang.String  punishmentContent
	 */
	public void setPunishmentContent(String punishmentContent){
		this.punishmentContent = punishmentContent;
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
	 *方法: 获得validateState
	 *@return: java.lang.String  validateState
	 */
	public String getValidateState(){
		return this.validateState;
	}

	/**
	 *方法: 设置validateState
	 *@param: java.lang.String  validateState
	 */
	public void setValidateState(String validateState){
		this.validateState = validateState;
	}

}