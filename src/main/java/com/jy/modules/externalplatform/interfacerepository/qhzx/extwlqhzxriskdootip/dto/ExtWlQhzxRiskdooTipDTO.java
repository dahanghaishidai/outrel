package com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdootip.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:前海征信风险度提示表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-06 16:03:13
 */
public class ExtWlQhzxRiskdooTipDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**证件号码*/
	private String cardId;

	/**证件类型（0:身份证）*/
	private String cardType;

	/**客户名称*/
	private String custName;

	/**借款人主银行卡号（放款账号）*/
	private String bankAccount;

	/**手机号码*/
	private String mobileNo;

	/**查询原因（01:贷款审批）*/
	private String reasonCode;

	/**请求报文*/
	private String reqMsg;

	/**返回报文*/
	private String respMsg;

	/**批次号*/
	private String batchNo;

	/**错误代码( 报头信息：E000000成功 其他失败)*/
	private String rtCode;

	/**错误消息*/
	private String rtMsg;

	/**交易流水号*/
	private String transNo;

	/**交易时间（格式：yyyy-MM-dd HH:mm:ss）*/
	private String transDate;

	/**进件编号*/
	private Long fkIntoAppId;

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
	 *方法: 获得cardId
	 *@return: java.lang.String  cardId
	 */
	public String getCardId(){
		return this.cardId;
	}

	/**
	 *方法: 设置cardId
	 *@param: java.lang.String  cardId
	 */
	public void setCardId(String cardId){
		this.cardId = cardId;
	}

	/**
	 *方法: 获得cardType
	 *@return: java.lang.String  cardType
	 */
	public String getCardType(){
		return this.cardType;
	}

	/**
	 *方法: 设置cardType
	 *@param: java.lang.String  cardType
	 */
	public void setCardType(String cardType){
		this.cardType = cardType;
	}

	/**
	 *方法: 获得custName
	 *@return: java.lang.String  custName
	 */
	public String getCustName(){
		return this.custName;
	}

	/**
	 *方法: 设置custName
	 *@param: java.lang.String  custName
	 */
	public void setCustName(String custName){
		this.custName = custName;
	}

	/**
	 *方法: 获得bankAccount
	 *@return: java.lang.String  bankAccount
	 */
	public String getBankAccount(){
		return this.bankAccount;
	}

	/**
	 *方法: 设置bankAccount
	 *@param: java.lang.String  bankAccount
	 */
	public void setBankAccount(String bankAccount){
		this.bankAccount = bankAccount;
	}

	/**
	 *方法: 获得mobileNo
	 *@return: java.lang.String  mobileNo
	 */
	public String getMobileNo(){
		return this.mobileNo;
	}

	/**
	 *方法: 设置mobileNo
	 *@param: java.lang.String  mobileNo
	 */
	public void setMobileNo(String mobileNo){
		this.mobileNo = mobileNo;
	}

	/**
	 *方法: 获得reasonCode
	 *@return: java.lang.String  reasonCode
	 */
	public String getReasonCode(){
		return this.reasonCode;
	}

	/**
	 *方法: 设置reasonCode
	 *@param: java.lang.String  reasonCode
	 */
	public void setReasonCode(String reasonCode){
		this.reasonCode = reasonCode;
	}

	/**
	 *方法: 获得reqMsg
	 *@return: java.lang.String  reqMsg
	 */
	public String getReqMsg(){
		return this.reqMsg;
	}

	/**
	 *方法: 设置reqMsg
	 *@param: java.lang.String  reqMsg
	 */
	public void setReqMsg(String reqMsg){
		this.reqMsg = reqMsg;
	}

	/**
	 *方法: 获得respMsg
	 *@return: java.lang.String  respMsg
	 */
	public String getRespMsg(){
		return this.respMsg;
	}

	/**
	 *方法: 设置respMsg
	 *@param: java.lang.String  respMsg
	 */
	public void setRespMsg(String respMsg){
		this.respMsg = respMsg;
	}

	/**
	 *方法: 获得batchNo
	 *@return: java.lang.String  batchNo
	 */
	public String getBatchNo(){
		return this.batchNo;
	}

	/**
	 *方法: 设置batchNo
	 *@param: java.lang.String  batchNo
	 */
	public void setBatchNo(String batchNo){
		this.batchNo = batchNo;
	}

	/**
	 *方法: 获得rtCode
	 *@return: java.lang.String  rtCode
	 */
	public String getRtCode(){
		return this.rtCode;
	}

	/**
	 *方法: 设置rtCode
	 *@param: java.lang.String  rtCode
	 */
	public void setRtCode(String rtCode){
		this.rtCode = rtCode;
	}

	/**
	 *方法: 获得rtMsg
	 *@return: java.lang.String  rtMsg
	 */
	public String getRtMsg(){
		return this.rtMsg;
	}

	/**
	 *方法: 设置rtMsg
	 *@param: java.lang.String  rtMsg
	 */
	public void setRtMsg(String rtMsg){
		this.rtMsg = rtMsg;
	}

	/**
	 *方法: 获得transNo
	 *@return: java.lang.String  transNo
	 */
	public String getTransNo(){
		return this.transNo;
	}

	/**
	 *方法: 设置transNo
	 *@param: java.lang.String  transNo
	 */
	public void setTransNo(String transNo){
		this.transNo = transNo;
	}

	/**
	 *方法: 获得transDate
	 *@return: java.lang.String  transDate
	 */
	public String getTransDate(){
		return this.transDate;
	}

	/**
	 *方法: 设置transDate
	 *@param: java.lang.String  transDate
	 */
	public void setTransDate(String transDate){
		this.transDate = transDate;
	}

	/**
	 *方法: 获得fkIntoAppId
	 *@return: java.lang.Long  fkIntoAppId
	 */
	public Long getFkIntoAppId(){
		return this.fkIntoAppId;
	}

	/**
	 *方法: 设置fkIntoAppId
	 *@param: java.lang.Long  fkIntoAppId
	 */
	public void setFkIntoAppId(Long fkIntoAppId){
		this.fkIntoAppId = fkIntoAppId;
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