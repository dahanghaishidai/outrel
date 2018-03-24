package com.jy.modules.externalplatform.interfacerepository.dzswxh.extwlcecablacklist.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:电子商务协会反欺诈黑名单表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 10:00:02
 */
public class ExtWlCecaBlacklistDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private Long id;

	/**进件编号*/
	private String intoId;

	/**手机号*/
	private String mobile;

	/**身份证号码*/
	private String idNo;

	/**姓名*/
	private String name;

	/**描述*/
	private String description;

	/**详细*/
	private String detail;

	/**是否有效*/
	private String validateState;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**CREATE_BY*/
	private Long createBy;

	/**MODIFY_BY*/
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
	 *方法: 获得mobile
	 *@return: java.lang.String  mobile
	 */
	public String getMobile(){
		return this.mobile;
	}

	/**
	 *方法: 设置mobile
	 *@param: java.lang.String  mobile
	 */
	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	/**
	 *方法: 获得idNo
	 *@return: java.lang.String  idNo
	 */
	public String getIdNo(){
		return this.idNo;
	}

	/**
	 *方法: 设置idNo
	 *@param: java.lang.String  idNo
	 */
	public void setIdNo(String idNo){
		this.idNo = idNo;
	}

	/**
	 *方法: 获得name
	 *@return: java.lang.String  name
	 */
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置name
	 *@param: java.lang.String  name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 *方法: 获得description
	 *@return: java.lang.String  description
	 */
	public String getDescription(){
		return this.description;
	}

	/**
	 *方法: 设置description
	 *@param: java.lang.String  description
	 */
	public void setDescription(String description){
		this.description = description;
	}

	/**
	 *方法: 获得detail
	 *@return: java.lang.String  detail
	 */
	public String getDetail(){
		return this.detail;
	}

	/**
	 *方法: 设置detail
	 *@param: java.lang.String  detail
	 */
	public void setDetail(String detail){
		this.detail = detail;
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