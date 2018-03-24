package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepestates.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话共享报告_身份信息概要(居住地址信息)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 19:53:02
 */
public class ExtWlSharePEstatesDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**居住地址*/
	private String address;

	/**居住状况*/
	private String condition;

	/**信息更新日期*/
	private String updateTime;

	/**征信报告主表ID*/
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
	 *方法: 获得address
	 *@return: java.lang.String  address
	 */
	public String getAddress(){
		return this.address;
	}

	/**
	 *方法: 设置address
	 *@param: java.lang.String  address
	 */
	public void setAddress(String address){
		this.address = address;
	}

	/**
	 *方法: 获得condition
	 *@return: java.lang.String  condition
	 */
	public String getCondition(){
		return this.condition;
	}

	/**
	 *方法: 设置condition
	 *@param: java.lang.String  condition
	 */
	public void setCondition(String condition){
		this.condition = condition;
	}

	/**
	 *方法: 获得updateTime
	 *@return: java.lang.String  updateTime
	 */
	public String getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置updateTime
	 *@param: java.lang.String  updateTime
	 */
	public void setUpdateTime(String updateTime){
		this.updateTime = updateTime;
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