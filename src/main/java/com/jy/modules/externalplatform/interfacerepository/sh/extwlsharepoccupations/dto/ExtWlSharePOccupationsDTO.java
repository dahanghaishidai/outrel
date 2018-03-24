package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepoccupations.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话共享报告_身份信息概要（职业信息）
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 19:52:57
 */
public class ExtWlSharePOccupationsDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**工作单位*/
	private String company;

	/**单位地址*/
	private String companyAddress;

	/**信息更新时间*/
	private String updateTime;

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
	 *方法: 获得company
	 *@return: java.lang.String  company
	 */
	public String getCompany(){
		return this.company;
	}

	/**
	 *方法: 设置company
	 *@param: java.lang.String  company
	 */
	public void setCompany(String company){
		this.company = company;
	}

	/**
	 *方法: 获得companyAddress
	 *@return: java.lang.String  companyAddress
	 */
	public String getCompanyAddress(){
		return this.companyAddress;
	}

	/**
	 *方法: 设置companyAddress
	 *@param: java.lang.String  companyAddress
	 */
	public void setCompanyAddress(String companyAddress){
		this.companyAddress = companyAddress;
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