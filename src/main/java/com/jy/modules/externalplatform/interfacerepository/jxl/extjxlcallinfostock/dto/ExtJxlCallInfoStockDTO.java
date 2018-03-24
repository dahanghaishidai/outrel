package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcallinfostock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:呼叫信息表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:23:53
 */
public class ExtJxlCallInfoStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**联系人信息表id*/
	private java.lang.Long fkContactInfoId;

	/**联系人的电话号码*/
	private java.lang.String phoneNum;

	/**号码的归属地*/
	private java.lang.String phoneNumLoc;

	/**呼叫次数*/
	private java.lang.Long callCnt;

	/**呼叫时间(分钟)*/
	private java.lang.Long callLen;

	/**主叫次数*/
	private java.lang.Long callOutCnt;

	/**被叫次数*/
	private java.lang.Long callInCnt;

	/**发送和接收短信次数*/
	private java.lang.Long smsCnt;

	/**在呼叫记录里面最早出现的时间*/
	private java.lang.String transStart;

	/**在呼叫记录里面最晚出现的时间*/
	private java.lang.String transEnd;
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
	 *方法: 获得fkContactInfoId
	 *@return: java.lang.Long  fkContactInfoId
	 */
	public java.lang.Long getFkContactInfoId(){
		return this.fkContactInfoId;
	}

	/**
	 *方法: 设置fkContactInfoId
	 *@param: java.lang.Long  fkContactInfoId
	 */
	public void setFkContactInfoId(java.lang.Long fkContactInfoId){
		this.fkContactInfoId = fkContactInfoId;
	}

	/**
	 *方法: 获得phoneNum
	 *@return: java.lang.String  phoneNum
	 */
	public java.lang.String getPhoneNum(){
		return this.phoneNum;
	}

	/**
	 *方法: 设置phoneNum
	 *@param: java.lang.String  phoneNum
	 */
	public void setPhoneNum(java.lang.String phoneNum){
		this.phoneNum = phoneNum;
	}

	/**
	 *方法: 获得phoneNumLoc
	 *@return: java.lang.String  phoneNumLoc
	 */
	public java.lang.String getPhoneNumLoc(){
		return this.phoneNumLoc;
	}

	/**
	 *方法: 设置phoneNumLoc
	 *@param: java.lang.String  phoneNumLoc
	 */
	public void setPhoneNumLoc(java.lang.String phoneNumLoc){
		this.phoneNumLoc = phoneNumLoc;
	}

	/**
	 *方法: 获得callCnt
	 *@return: java.lang.Long  callCnt
	 */
	public java.lang.Long getCallCnt(){
		return this.callCnt;
	}

	/**
	 *方法: 设置callCnt
	 *@param: java.lang.Long  callCnt
	 */
	public void setCallCnt(java.lang.Long callCnt){
		this.callCnt = callCnt;
	}

	/**
	 *方法: 获得callLen
	 *@return: java.lang.Long  callLen
	 */
	public java.lang.Long getCallLen(){
		return this.callLen;
	}

	/**
	 *方法: 设置callLen
	 *@param: java.lang.Long  callLen
	 */
	public void setCallLen(java.lang.Long callLen){
		this.callLen = callLen;
	}

	/**
	 *方法: 获得callOutCnt
	 *@return: java.lang.Long  callOutCnt
	 */
	public java.lang.Long getCallOutCnt(){
		return this.callOutCnt;
	}

	/**
	 *方法: 设置callOutCnt
	 *@param: java.lang.Long  callOutCnt
	 */
	public void setCallOutCnt(java.lang.Long callOutCnt){
		this.callOutCnt = callOutCnt;
	}

	/**
	 *方法: 获得callInCnt
	 *@return: java.lang.Long  callInCnt
	 */
	public java.lang.Long getCallInCnt(){
		return this.callInCnt;
	}

	/**
	 *方法: 设置callInCnt
	 *@param: java.lang.Long  callInCnt
	 */
	public void setCallInCnt(java.lang.Long callInCnt){
		this.callInCnt = callInCnt;
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
	 *方法: 获得transStart
	 *@return: java.lang.String  transStart
	 */
	public java.lang.String getTransStart(){
		return this.transStart;
	}

	/**
	 *方法: 设置transStart
	 *@param: java.lang.String  transStart
	 */
	public void setTransStart(java.lang.String transStart){
		this.transStart = transStart;
	}

	/**
	 *方法: 获得transEnd
	 *@return: java.lang.String  transEnd
	 */
	public java.lang.String getTransEnd(){
		return this.transEnd;
	}

	/**
	 *方法: 设置transEnd
	 *@param: java.lang.String  transEnd
	 */
	public void setTransEnd(java.lang.String transEnd){
		this.transEnd = transEnd;
	}

}