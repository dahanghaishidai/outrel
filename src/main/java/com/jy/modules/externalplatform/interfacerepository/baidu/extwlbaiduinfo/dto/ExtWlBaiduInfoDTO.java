package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:百度金融风险查询主表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-13 16:40:42
 */
public class ExtWlBaiduInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**进件编号*/
	private String intoId;

	/**返回编码*/
	private String retCode;

	/**返回错误信息*/
	private String retMsg;

	/**风险名单等级*/
	private String blackLevel;

	/**风险名单原因*/
	private String blackReason;

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
	 *方法: 获得intoId
	 *@return: java.lang.String  intoId
	 */
	public String getIntoId(){
		return this.intoId;
	}

	/**
	 *方法: 设置intoId
	 *@param: java.lang.String  intoId
	 */
	public void setIntoId(String intoId){
		this.intoId = intoId;
	}

	/**
	 *方法: 获得retCode
	 *@return: java.lang.String  retCode
	 */
	public String getRetCode(){
		return this.retCode;
	}

	/**
	 *方法: 设置retCode
	 *@param: java.lang.String  retCode
	 */
	public void setRetCode(String retCode){
		this.retCode = retCode;
	}

	/**
	 *方法: 获得retMsg
	 *@return: java.lang.String  retMsg
	 */
	public String getRetMsg(){
		return this.retMsg;
	}

	/**
	 *方法: 设置retMsg
	 *@param: java.lang.String  retMsg
	 */
	public void setRetMsg(String retMsg){
		this.retMsg = retMsg;
	}

	/**
	 *方法: 获得blackLevel
	 *@return: java.lang.String  blackLevel
	 */
	public String getBlackLevel(){
		return this.blackLevel;
	}

	/**
	 *方法: 设置blackLevel
	 *@param: java.lang.String  blackLevel
	 */
	public void setBlackLevel(String blackLevel){
		this.blackLevel = blackLevel;
	}

	/**
	 *方法: 获得blackReason
	 *@return: java.lang.String  blackReason
	 */
	public String getBlackReason(){
		return this.blackReason;
	}

	/**
	 *方法: 设置blackReason
	 *@param: java.lang.String  blackReason
	 */
	public void setBlackReason(String blackReason){
		this.blackReason = blackReason;
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