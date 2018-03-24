package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtmodule.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:模块查询状态表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-14 19:06:01
 */
public class ExtWlZxtModuleDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**增信通信贷信息搜索主表ID*/
	private Long searchFkId;

	/**模块编号*/
	private String moduleNo;

	/**状态码*/
	private String status;

	/**状态消息*/
	private String msg;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp updateTime;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long updateBy;

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
	 *方法: 获得searchFkId
	 *@return: java.lang.Long  searchFkId
	 */
	public Long getSearchFkId(){
		return this.searchFkId;
	}

	/**
	 *方法: 设置searchFkId
	 *@param: java.lang.Long  searchFkId
	 */
	public void setSearchFkId(Long searchFkId){
		this.searchFkId = searchFkId;
	}

	/**
	 *方法: 获得moduleNo
	 *@return: java.lang.String  moduleNo
	 */
	public String getModuleNo(){
		return this.moduleNo;
	}

	/**
	 *方法: 设置moduleNo
	 *@param: java.lang.String  moduleNo
	 */
	public void setModuleNo(String moduleNo){
		this.moduleNo = moduleNo;
	}

	/**
	 *方法: 获得status
	 *@return: java.lang.String  status
	 */
	public String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置status
	 *@param: java.lang.String  status
	 */
	public void setStatus(String status){
		this.status = status;
	}

	/**
	 *方法: 获得msg
	 *@return: java.lang.String  msg
	 */
	public String getMsg(){
		return this.msg;
	}

	/**
	 *方法: 设置msg
	 *@param: java.lang.String  msg
	 */
	public void setMsg(String msg){
		this.msg = msg;
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
	 *方法: 获得updateTime
	 *@return: java.sql.Timestamp  updateTime
	 */
	public java.sql.Timestamp getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置updateTime
	 *@param: java.sql.Timestamp  updateTime
	 */
	public void setUpdateTime(java.sql.Timestamp updateTime){
		this.updateTime = updateTime;
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
	 *方法: 获得updateBy
	 *@return: java.lang.Long  updateBy
	 */
	public Long getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置updateBy
	 *@param: java.lang.Long  updateBy
	 */
	public void setUpdateBy(Long updateBy){
		this.updateBy = updateBy;
	}

}