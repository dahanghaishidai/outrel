package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidutax.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:百度金融偷税漏税表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-13 16:41:52
 */
public class ExtWlBaiduTaxDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**关联主表主键*/
	private String keyId;

	/**税务主体*/
	private String taxpayerName;

	/**纳税识别号*/
	private String taxpayerIdenNum;

	/**公开机构*/
	private String infoSource;

	/**主要原因*/
	private String majorFact;

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
	 *方法: 获得taxpayerName
	 *@return: java.lang.String  taxpayerName
	 */
	public String getTaxpayerName(){
		return this.taxpayerName;
	}

	/**
	 *方法: 设置taxpayerName
	 *@param: java.lang.String  taxpayerName
	 */
	public void setTaxpayerName(String taxpayerName){
		this.taxpayerName = taxpayerName;
	}

	/**
	 *方法: 获得taxpayerIdenNum
	 *@return: java.lang.String  taxpayerIdenNum
	 */
	public String getTaxpayerIdenNum(){
		return this.taxpayerIdenNum;
	}

	/**
	 *方法: 设置taxpayerIdenNum
	 *@param: java.lang.String  taxpayerIdenNum
	 */
	public void setTaxpayerIdenNum(String taxpayerIdenNum){
		this.taxpayerIdenNum = taxpayerIdenNum;
	}

	/**
	 *方法: 获得infoSource
	 *@return: java.lang.String  infoSource
	 */
	public String getInfoSource(){
		return this.infoSource;
	}

	/**
	 *方法: 设置infoSource
	 *@param: java.lang.String  infoSource
	 */
	public void setInfoSource(String infoSource){
		this.infoSource = infoSource;
	}

	/**
	 *方法: 获得majorFact
	 *@return: java.lang.String  majorFact
	 */
	public String getMajorFact(){
		return this.majorFact;
	}

	/**
	 *方法: 设置majorFact
	 *@param: java.lang.String  majorFact
	 */
	public void setMajorFact(String majorFact){
		this.majorFact = majorFact;
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