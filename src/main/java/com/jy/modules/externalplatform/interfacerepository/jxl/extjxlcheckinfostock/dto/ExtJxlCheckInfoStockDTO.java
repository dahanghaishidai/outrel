package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcheckinfostock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:数据检查信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:24:19
 */
public class ExtJxlCheckInfoStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**申请人信息(jxl)id*/
	private java.lang.Long fkJxlCustInfoId;

	/**检查类型*/
	private java.lang.String category;

	/**检查项目*/
	private java.lang.String checkPoint;

	/**检查结果*/
	private java.lang.String result;

	/**证据*/
	private java.lang.String evidence;

	/**0 - 信息核对 1 - 行为检测*/
	private java.lang.String isApplicationBehavior;
	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;
	
	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.sql.Timestamp createTime) {
		this.createTime = createTime;
	}

	public java.sql.Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(java.sql.Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
	 *方法: 获得id
	 *@return: java.lang.Long  id
	 */
	public java.lang.Long getId(){
		return this.id;
	}

	/**
	 *方法: 设置id
	 *@param: java.lang.Long  id
	 */
	public void setId(java.lang.Long id){
		this.id = id;
	}

	/**
	 *方法: 获得fkJxlCustInfoId
	 *@return: java.lang.Long  fkJxlCustInfoId
	 */
	public java.lang.Long getFkJxlCustInfoId(){
		return this.fkJxlCustInfoId;
	}

	/**
	 *方法: 设置fkJxlCustInfoId
	 *@param: java.lang.Long  fkJxlCustInfoId
	 */
	public void setFkJxlCustInfoId(java.lang.Long fkJxlCustInfoId){
		this.fkJxlCustInfoId = fkJxlCustInfoId;
	}

	/**
	 *方法: 获得category
	 *@return: java.lang.String  category
	 */
	public java.lang.String getCategory(){
		return this.category;
	}

	/**
	 *方法: 设置category
	 *@param: java.lang.String  category
	 */
	public void setCategory(java.lang.String category){
		this.category = category;
	}

	/**
	 *方法: 获得checkPoint
	 *@return: java.lang.String  checkPoint
	 */
	public java.lang.String getCheckPoint(){
		return this.checkPoint;
	}

	/**
	 *方法: 设置checkPoint
	 *@param: java.lang.String  checkPoint
	 */
	public void setCheckPoint(java.lang.String checkPoint){
		this.checkPoint = checkPoint;
	}

	/**
	 *方法: 获得result
	 *@return: java.lang.String  result
	 */
	public java.lang.String getResult(){
		return this.result;
	}

	/**
	 *方法: 设置result
	 *@param: java.lang.String  result
	 */
	public void setResult(java.lang.String result){
		this.result = result;
	}

	/**
	 *方法: 获得evidence
	 *@return: java.lang.String  evidence
	 */
	public java.lang.String getEvidence(){
		return this.evidence;
	}

	/**
	 *方法: 设置evidence
	 *@param: java.lang.String  evidence
	 */
	public void setEvidence(java.lang.String evidence){
		this.evidence = evidence;
	}

	/**
	 *方法: 获得isApplicationBehavior
	 *@return: java.lang.String  isApplicationBehavior
	 */
	public java.lang.String getIsApplicationBehavior(){
		return this.isApplicationBehavior;
	}

	/**
	 *方法: 设置isApplicationBehavior
	 *@param: java.lang.String  isApplicationBehavior
	 */
	public void setIsApplicationBehavior(java.lang.String isApplicationBehavior){
		this.isApplicationBehavior = isApplicationBehavior;
	}

}