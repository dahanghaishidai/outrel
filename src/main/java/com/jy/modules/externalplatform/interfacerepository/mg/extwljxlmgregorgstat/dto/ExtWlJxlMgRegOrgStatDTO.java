package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgregorgstat.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:聚信立蜜罐用户注册信息情况
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-14 13:55:52
 */
public class ExtWlJxlMgRegOrgStatDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**蜜罐ID*/
	private String userGridId;

	/**查询手机号码*/
	private String phoneNum;

	/**每种类型注册的数量*/
	private Long count;

	/**注册App的类型*/
	private String label;

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
	 *方法: 获得phoneNum
	 *@return: java.lang.String  phoneNum
	 */
	public String getPhoneNum(){
		return this.phoneNum;
	}

	/**
	 *方法: 设置phoneNum
	 *@param: java.lang.String  phoneNum
	 */
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}

	/**
	 *方法: 获得count
	 *@return: java.lang.Long  count
	 */
	public Long getCount(){
		return this.count;
	}

	/**
	 *方法: 设置count
	 *@param: java.lang.Long  count
	 */
	public void setCount(Long count){
		this.count = count;
	}

	/**
	 *方法: 获得label
	 *@return: java.lang.String  label
	 */
	public String getLabel(){
		return this.label;
	}

	/**
	 *方法: 设置label
	 *@param: java.lang.String  label
	 */
	public void setLabel(String label){
		this.label = label;
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