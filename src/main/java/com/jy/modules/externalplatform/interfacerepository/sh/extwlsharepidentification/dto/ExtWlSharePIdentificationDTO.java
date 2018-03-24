package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepidentification.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话共享报告_身份信息概要(身份信息)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 19:52:47
 */
public class ExtWlSharePIdentificationDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**性别*/
	private String gender;

	/**出生日期*/
	private String birthday;

	/**证件类型*/
	private String idType;

	/**证件号码*/
	private String idCard;

	/**婚姻状态*/
	private String marriage;

	/**最高学历*/
	private Long eduLevel;

	/**征信主表ID*/
	private Long fkReportId;

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
	 *方法: 获得gender
	 *@return: java.lang.String  gender
	 */
	public String getGender(){
		return this.gender;
	}

	/**
	 *方法: 设置gender
	 *@param: java.lang.String  gender
	 */
	public void setGender(String gender){
		this.gender = gender;
	}

	/**
	 *方法: 获得birthday
	 *@return: java.lang.String  birthday
	 */
	public String getBirthday(){
		return this.birthday;
	}

	/**
	 *方法: 设置birthday
	 *@param: java.lang.String  birthday
	 */
	public void setBirthday(String birthday){
		this.birthday = birthday;
	}

	/**
	 *方法: 获得idType
	 *@return: java.lang.String  idType
	 */
	public String getIdType(){
		return this.idType;
	}

	/**
	 *方法: 设置idType
	 *@param: java.lang.String  idType
	 */
	public void setIdType(String idType){
		this.idType = idType;
	}

	/**
	 *方法: 获得idCard
	 *@return: java.lang.String  idCard
	 */
	public String getIdCard(){
		return this.idCard;
	}

	/**
	 *方法: 设置idCard
	 *@param: java.lang.String  idCard
	 */
	public void setIdCard(String idCard){
		this.idCard = idCard;
	}

	/**
	 *方法: 获得marriage
	 *@return: java.lang.String  marriage
	 */
	public String getMarriage(){
		return this.marriage;
	}

	/**
	 *方法: 设置marriage
	 *@param: java.lang.String  marriage
	 */
	public void setMarriage(String marriage){
		this.marriage = marriage;
	}

	/**
	 *方法: 获得eduLevel
	 *@return: java.lang.Long  eduLevel
	 */
	public Long getEduLevel(){
		return this.eduLevel;
	}

	/**
	 *方法: 设置eduLevel
	 *@param: java.lang.Long  eduLevel
	 */
	public void setEduLevel(Long eduLevel){
		this.eduLevel = eduLevel;
	}

	/**
	 *方法: 获得fkReportId
	 *@return: java.lang.Long  fkReportId
	 */
	public Long getFkReportId(){
		return this.fkReportId;
	}

	/**
	 *方法: 设置fkReportId
	 *@param: java.lang.Long  fkReportId
	 */
	public void setFkReportId(Long fkReportId){
		this.fkReportId = fkReportId;
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