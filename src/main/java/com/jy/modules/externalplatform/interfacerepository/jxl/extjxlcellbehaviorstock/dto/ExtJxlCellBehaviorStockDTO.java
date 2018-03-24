package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcellbehaviorstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:通话行为分析表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:24:08
 */
public class ExtJxlCellBehaviorStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**申请人信息(JXL)id*/
	private java.lang.Long fkJxlCustInfoId;

	/**手机号码*/
	private java.lang.String cellPhoneNum;

	/**手机运营商*/
	private java.lang.String cellOperator;

	/**手机归属地*/
	private java.lang.String cellLoc;

	/**月份*/
	private java.lang.String cellMth;

	/**月主被叫通话时间（分钟）*/
	private java.lang.Long callInTime;

	/**月主叫通话时间（分钟）*/
	private java.lang.Long callOutTime;

	/**月短信条数*/
	private java.lang.Long smsCnt;

	/**月流量（MB）*/
	private java.lang.Long netFlow;
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
	 *方法: 获得cellPhoneNum
	 *@return: java.lang.String  cellPhoneNum
	 */
	public java.lang.String getCellPhoneNum(){
		return this.cellPhoneNum;
	}

	/**
	 *方法: 设置cellPhoneNum
	 *@param: java.lang.String  cellPhoneNum
	 */
	public void setCellPhoneNum(java.lang.String cellPhoneNum){
		this.cellPhoneNum = cellPhoneNum;
	}

	/**
	 *方法: 获得cellOperator
	 *@return: java.lang.String  cellOperator
	 */
	public java.lang.String getCellOperator(){
		return this.cellOperator;
	}

	/**
	 *方法: 设置cellOperator
	 *@param: java.lang.String  cellOperator
	 */
	public void setCellOperator(java.lang.String cellOperator){
		this.cellOperator = cellOperator;
	}

	/**
	 *方法: 获得cellLoc
	 *@return: java.lang.String  cellLoc
	 */
	public java.lang.String getCellLoc(){
		return this.cellLoc;
	}

	/**
	 *方法: 设置cellLoc
	 *@param: java.lang.String  cellLoc
	 */
	public void setCellLoc(java.lang.String cellLoc){
		this.cellLoc = cellLoc;
	}

	/**
	 *方法: 获得cellMth
	 *@return: java.lang.String  cellMth
	 */
	public java.lang.String getCellMth(){
		return this.cellMth;
	}

	/**
	 *方法: 设置cellMth
	 *@param: java.lang.String  cellMth
	 */
	public void setCellMth(java.lang.String cellMth){
		this.cellMth = cellMth;
	}

	/**
	 *方法: 获得callInTime
	 *@return: java.lang.Long  callInTime
	 */
	public java.lang.Long getCallInTime(){
		return this.callInTime;
	}

	/**
	 *方法: 设置callInTime
	 *@param: java.lang.Long  callInTime
	 */
	public void setCallInTime(java.lang.Long callInTime){
		this.callInTime = callInTime;
	}

	/**
	 *方法: 获得callOutTime
	 *@return: java.lang.Long  callOutTime
	 */
	public java.lang.Long getCallOutTime(){
		return this.callOutTime;
	}

	/**
	 *方法: 设置callOutTime
	 *@param: java.lang.Long  callOutTime
	 */
	public void setCallOutTime(java.lang.Long callOutTime){
		this.callOutTime = callOutTime;
	}

	/**
	 *方法: 获得smsCnt
	 *@return: java.lang.Long  smsCnt
	 */
	public java.lang.Long getSmsCnt(){
		return this.smsCnt;
	}

	/**
	 *方法: 设置smsCnt
	 *@param: java.lang.Long  smsCnt
	 */
	public void setSmsCnt(java.lang.Long smsCnt){
		this.smsCnt = smsCnt;
	}

	/**
	 *方法: 获得netFlow
	 *@return: java.lang.Long  netFlow
	 */
	public java.lang.Long getNetFlow(){
		return this.netFlow;
	}

	/**
	 *方法: 设置netFlow
	 *@param: java.lang.Long  netFlow
	 */
	public void setNetFlow(java.lang.Long netFlow){
		this.netFlow = netFlow;
	}

}