package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduequityfreeze.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:百度金融股权冻结表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-13 16:42:09
 */
public class ExtWlBaiduEquityFreezeDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**关联主表主键*/
	private String keyId;

	/**执行法院*/
	private String executeCourt;

	/**处罚编号*/
	private String adjudicateNo;

	/**冻结金额*/
	private String freezeAmount;

	/**处罚公开时间*/
	private String pubDate;

	/**合作企业名称*/
	private String corpName;

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
	 *方法: 获得executeCourt
	 *@return: java.lang.String  executeCourt
	 */
	public String getExecuteCourt(){
		return this.executeCourt;
	}

	/**
	 *方法: 设置executeCourt
	 *@param: java.lang.String  executeCourt
	 */
	public void setExecuteCourt(String executeCourt){
		this.executeCourt = executeCourt;
	}

	/**
	 *方法: 获得adjudicateNo
	 *@return: java.lang.String  adjudicateNo
	 */
	public String getAdjudicateNo(){
		return this.adjudicateNo;
	}

	/**
	 *方法: 设置adjudicateNo
	 *@param: java.lang.String  adjudicateNo
	 */
	public void setAdjudicateNo(String adjudicateNo){
		this.adjudicateNo = adjudicateNo;
	}

	/**
	 *方法: 获得freezeAmount
	 *@return: java.lang.String  freezeAmount
	 */
	public String getFreezeAmount(){
		return this.freezeAmount;
	}

	/**
	 *方法: 设置freezeAmount
	 *@param: java.lang.String  freezeAmount
	 */
	public void setFreezeAmount(String freezeAmount){
		this.freezeAmount = freezeAmount;
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
	 *方法: 获得corpName
	 *@return: java.lang.String  corpName
	 */
	public String getCorpName(){
		return this.corpName;
	}

	/**
	 *方法: 设置corpName
	 *@param: java.lang.String  corpName
	 */
	public void setCorpName(String corpName){
		this.corpName = corpName;
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