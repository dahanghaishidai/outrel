package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidupenalty.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:百度金融行政处罚表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-13 16:42:29
 */
public class ExtWlBaiduPenaltyDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**关联主表主键*/
	private String keyId;

	/**更新时间*/
	private String regDate;

	/**行政处罚决定书文号*/
	private String cfWshu;

	/**处罚名称*/
	private String cfCfmc;

	/**处罚事由*/
	private String cfSy;

	/**处罚结果*/
	private String cfJg;

	/**处罚机关*/
	private String cfXzjg;

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
	 *方法: 获得regDate
	 *@return: java.lang.String  regDate
	 */
	public String getRegDate(){
		return this.regDate;
	}

	/**
	 *方法: 设置regDate
	 *@param: java.lang.String  regDate
	 */
	public void setRegDate(String regDate){
		this.regDate = regDate;
	}

	/**
	 *方法: 获得cfWshu
	 *@return: java.lang.String  cfWshu
	 */
	public String getCfWshu(){
		return this.cfWshu;
	}

	/**
	 *方法: 设置cfWshu
	 *@param: java.lang.String  cfWshu
	 */
	public void setCfWshu(String cfWshu){
		this.cfWshu = cfWshu;
	}

	/**
	 *方法: 获得cfCfmc
	 *@return: java.lang.String  cfCfmc
	 */
	public String getCfCfmc(){
		return this.cfCfmc;
	}

	/**
	 *方法: 设置cfCfmc
	 *@param: java.lang.String  cfCfmc
	 */
	public void setCfCfmc(String cfCfmc){
		this.cfCfmc = cfCfmc;
	}

	/**
	 *方法: 获得cfSy
	 *@return: java.lang.String  cfSy
	 */
	public String getCfSy(){
		return this.cfSy;
	}

	/**
	 *方法: 设置cfSy
	 *@param: java.lang.String  cfSy
	 */
	public void setCfSy(String cfSy){
		this.cfSy = cfSy;
	}

	/**
	 *方法: 获得cfJg
	 *@return: java.lang.String  cfJg
	 */
	public String getCfJg(){
		return this.cfJg;
	}

	/**
	 *方法: 设置cfJg
	 *@param: java.lang.String  cfJg
	 */
	public void setCfJg(String cfJg){
		this.cfJg = cfJg;
	}

	/**
	 *方法: 获得cfXzjg
	 *@return: java.lang.String  cfXzjg
	 */
	public String getCfXzjg(){
		return this.cfXzjg;
	}

	/**
	 *方法: 设置cfXzjg
	 *@param: java.lang.String  cfXzjg
	 */
	public void setCfXzjg(String cfXzjg){
		this.cfXzjg = cfXzjg;
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