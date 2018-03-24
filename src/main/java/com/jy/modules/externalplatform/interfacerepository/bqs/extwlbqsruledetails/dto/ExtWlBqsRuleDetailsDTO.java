package com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsruledetails.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:白骑士反欺诈云风险决策-规则明细表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-20 11:28:54
 */
public class ExtWlBqsRuleDetailsDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**关联规则内容表ID*/
	private Long ruleContentId;

	/**第一类型*/
	private String firstType;

	/**等级*/
	private String grade;

	/**第二类型*/
	private String secondType;

	/**名称*/
	private String name;

	/**类型*/
	private String type;

	/**对应的值*/
	private String value;

	/**数据有效性（1：有效、0：无效）*/
	private String validateState;

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
	 *方法: 获得ruleContentId
	 *@return: java.lang.Long  ruleContentId
	 */
	public Long getRuleContentId(){
		return this.ruleContentId;
	}

	/**
	 *方法: 设置ruleContentId
	 *@param: java.lang.Long  ruleContentId
	 */
	public void setRuleContentId(Long ruleContentId){
		this.ruleContentId = ruleContentId;
	}

	/**
	 *方法: 获得firstType
	 *@return: java.lang.String  firstType
	 */
	public String getFirstType(){
		return this.firstType;
	}

	/**
	 *方法: 设置firstType
	 *@param: java.lang.String  firstType
	 */
	public void setFirstType(String firstType){
		this.firstType = firstType;
	}

	/**
	 *方法: 获得grade
	 *@return: java.lang.String  grade
	 */
	public String getGrade(){
		return this.grade;
	}

	/**
	 *方法: 设置grade
	 *@param: java.lang.String  grade
	 */
	public void setGrade(String grade){
		this.grade = grade;
	}

	/**
	 *方法: 获得secondType
	 *@return: java.lang.String  secondType
	 */
	public String getSecondType(){
		return this.secondType;
	}

	/**
	 *方法: 设置secondType
	 *@param: java.lang.String  secondType
	 */
	public void setSecondType(String secondType){
		this.secondType = secondType;
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
	 *方法: 获得type
	 *@return: java.lang.String  type
	 */
	public String getType(){
		return this.type;
	}

	/**
	 *方法: 设置type
	 *@param: java.lang.String  type
	 */
	public void setType(String type){
		this.type = type;
	}

	/**
	 *方法: 获得value
	 *@return: java.lang.String  value
	 */
	public String getValue(){
		return this.value;
	}

	/**
	 *方法: 设置value
	 *@param: java.lang.String  value
	 */
	public void setValue(String value){
		this.value = value;
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