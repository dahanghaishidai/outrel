package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusersechbyo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:用户被机构查询历史
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-14 13:54:03
 */
public class ExtWlJxlMgUserSechByODTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**蜜罐id*/
	private String userGridId;

	/**主动查询用户信息的机构类型*/
	private String searchedOrg;

	/**查询时间*/
	private String searchedDate;

	/**是否是本机构查询*/
	private String orgSelf;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private Long createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**修改人*/
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
	 *方法: 获得userGridId
	 *@return: java.lang.String  userGridId
	 */
	public String getUserGridId(){
		return this.userGridId;
	}

	/**
	 *方法: 设置userGridId
	 *@param: java.lang.String  userGridId
	 */
	public void setUserGridId(String userGridId){
		this.userGridId = userGridId;
	}

	/**
	 *方法: 获得searchedOrg
	 *@return: java.lang.String  searchedOrg
	 */
	public String getSearchedOrg(){
		return this.searchedOrg;
	}

	/**
	 *方法: 设置searchedOrg
	 *@param: java.lang.String  searchedOrg
	 */
	public void setSearchedOrg(String searchedOrg){
		this.searchedOrg = searchedOrg;
	}

	/**
	 *方法: 获得searchedDate
	 *@return: java.lang.String  searchedDate
	 */
	public String getSearchedDate(){
		return this.searchedDate;
	}

	/**
	 *方法: 设置searchedDate
	 *@param: java.lang.String  searchedDate
	 */
	public void setSearchedDate(String searchedDate){
		this.searchedDate = searchedDate;
	}

	/**
	 *方法: 获得orgSelf
	 *@return: java.lang.String  orgSelf
	 */
	public String getOrgSelf(){
		return this.orgSelf;
	}

	/**
	 *方法: 设置orgSelf
	 *@param: java.lang.String  orgSelf
	 */
	public void setOrgSelf(String orgSelf){
		this.orgSelf = orgSelf;
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