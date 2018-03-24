package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackidentify.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:数美中介包装风险识别服务（主表）
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-19 10:36:10
 */
public class ExtWlSmPackIdentifyDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**进件客户关联ID*/
	private Long intoCustRefId;

	/**返回码*/
	private String code;

	/**详细信息*/
	private String message;

	/**中介呼入的次数*/
	private String incomingCallTimes;

	/**中介呼入累计时长*/
	private String incomingCallDuration;

	/**呼出到中介的次数*/
	private String outgoingCallTimes;

	/**呼出到中介累计时长*/
	private String outgoingCallDuration;

	/**通讯录包含中介的个数*/
	private String contactMatch;

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
	 *方法: 获得intoCustRefId
	 *@return: java.lang.Long  intoCustRefId
	 */
	public Long getIntoCustRefId(){
		return this.intoCustRefId;
	}

	/**
	 *方法: 设置intoCustRefId
	 *@param: java.lang.Long  intoCustRefId
	 */
	public void setIntoCustRefId(Long intoCustRefId){
		this.intoCustRefId = intoCustRefId;
	}

	/**
	 *方法: 获得code
	 *@return: java.lang.String  code
	 */
	public String getCode(){
		return this.code;
	}

	/**
	 *方法: 设置code
	 *@param: java.lang.String  code
	 */
	public void setCode(String code){
		this.code = code;
	}

	/**
	 *方法: 获得message
	 *@return: java.lang.String  message
	 */
	public String getMessage(){
		return this.message;
	}

	/**
	 *方法: 设置message
	 *@param: java.lang.String  message
	 */
	public void setMessage(String message){
		this.message = message;
	}

	/**
	 *方法: 获得incomingCallTimes
	 *@return: java.lang.String  incomingCallTimes
	 */
	public String getIncomingCallTimes(){
		return this.incomingCallTimes;
	}

	/**
	 *方法: 设置incomingCallTimes
	 *@param: java.lang.String  incomingCallTimes
	 */
	public void setIncomingCallTimes(String incomingCallTimes){
		this.incomingCallTimes = incomingCallTimes;
	}

	/**
	 *方法: 获得incomingCallDuration
	 *@return: java.lang.String  incomingCallDuration
	 */
	public String getIncomingCallDuration(){
		return this.incomingCallDuration;
	}

	/**
	 *方法: 设置incomingCallDuration
	 *@param: java.lang.String  incomingCallDuration
	 */
	public void setIncomingCallDuration(String incomingCallDuration){
		this.incomingCallDuration = incomingCallDuration;
	}

	/**
	 *方法: 获得outgoingCallTimes
	 *@return: java.lang.String  outgoingCallTimes
	 */
	public String getOutgoingCallTimes(){
		return this.outgoingCallTimes;
	}

	/**
	 *方法: 设置outgoingCallTimes
	 *@param: java.lang.String  outgoingCallTimes
	 */
	public void setOutgoingCallTimes(String outgoingCallTimes){
		this.outgoingCallTimes = outgoingCallTimes;
	}

	/**
	 *方法: 获得outgoingCallDuration
	 *@return: java.lang.String  outgoingCallDuration
	 */
	public String getOutgoingCallDuration(){
		return this.outgoingCallDuration;
	}

	/**
	 *方法: 设置outgoingCallDuration
	 *@param: java.lang.String  outgoingCallDuration
	 */
	public void setOutgoingCallDuration(String outgoingCallDuration){
		this.outgoingCallDuration = outgoingCallDuration;
	}

	/**
	 *方法: 获得contactMatch
	 *@return: java.lang.String  contactMatch
	 */
	public String getContactMatch(){
		return this.contactMatch;
	}

	/**
	 *方法: 设置contactMatch
	 *@param: java.lang.String  contactMatch
	 */
	public void setContactMatch(String contactMatch){
		this.contactMatch = contactMatch;
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