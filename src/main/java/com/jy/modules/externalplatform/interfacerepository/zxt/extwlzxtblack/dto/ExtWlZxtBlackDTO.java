package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtblack.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:个人-黑名单
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-14 19:06:08
 */
public class ExtWlZxtBlackDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**模块查询状态表ID*/
	private Long moduleFkId;

	/**风险分类类型*/
	private String blackType;

	/**风险分类项名称*/
	private String itemName;

	/**风险分类项标签*/
	private String label;

	/**风险分类项值*/
	private String itemValue;

	/**备注*/
	private String remarks;

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
	 *方法: 获得moduleFkId
	 *@return: java.lang.Long  moduleFkId
	 */
	public Long getModuleFkId(){
		return this.moduleFkId;
	}

	/**
	 *方法: 设置moduleFkId
	 *@param: java.lang.Long  moduleFkId
	 */
	public void setModuleFkId(Long moduleFkId){
		this.moduleFkId = moduleFkId;
	}

	/**
	 *方法: 获得blackType
	 *@return: java.lang.String  blackType
	 */
	public String getBlackType(){
		return this.blackType;
	}

	/**
	 *方法: 设置blackType
	 *@param: java.lang.String  blackType
	 */
	public void setBlackType(String blackType){
		this.blackType = blackType;
	}

	/**
	 *方法: 获得itemName
	 *@return: java.lang.String  itemName
	 */
	public String getItemName(){
		return this.itemName;
	}

	/**
	 *方法: 设置itemName
	 *@param: java.lang.String  itemName
	 */
	public void setItemName(String itemName){
		this.itemName = itemName;
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
	 *方法: 获得itemValue
	 *@return: java.lang.String  itemValue
	 */
	public String getItemValue(){
		return this.itemValue;
	}

	/**
	 *方法: 设置itemValue
	 *@param: java.lang.String  itemValue
	 */
	public void setItemValue(String itemValue){
		this.itemValue = itemValue;
	}

	/**
	 *方法: 获得remarks
	 *@return: java.lang.String  remarks
	 */
	public String getRemarks(){
		return this.remarks;
	}

	/**
	 *方法: 设置remarks
	 *@param: java.lang.String  remarks
	 */
	public void setRemarks(String remarks){
		this.remarks = remarks;
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