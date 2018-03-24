package com.jy.modules.externalplatform.interfacerepository.zs.extzsidentitycheck.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:中胜身份校验查询结果
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-02 14:13:34
 */
public class ExtZsIdentityCheckDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**身份证号码*/
	private java.lang.String cardId;

	/**姓名*/
	private java.lang.String custName;

	/**交易响应结果码*/
	private java.lang.String transRtnCode;

	/**交易响应结果描述*/
	private java.lang.String transRtnDesc;

	/**业务校验结果码*/
	private java.lang.String bizRtnCode;

	/**业务校验结果描述*/
	private java.lang.String bizRtnDesc;

	/**请求报文*/
	private java.lang.String repMessage;

	/**返回报文*/
	private java.lang.String respMessage;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**产品编码*/
	private java.lang.String prodCode;

	/**机构编码*/
	private java.lang.String orgCode;

	/**系统编码*/
	private java.lang.String sysCode;

	/**返回码 1：查有 2：查无 3：查询报错 4：解析错误*/
	private java.lang.String retcode;

	/**返回错误信息*/
	private java.lang.String errormsg;

	/**接口日志ID*/
	private java.lang.String interfaceId;

	/**备注*/
	private java.lang.String remark;

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
	 *方法: 获得cardId
	 *@return: java.lang.String  cardId
	 */
	public java.lang.String getCardId(){
		return this.cardId;
	}

	/**
	 *方法: 设置cardId
	 *@param: java.lang.String  cardId
	 */
	public void setCardId(java.lang.String cardId){
		this.cardId = cardId;
	}

	/**
	 *方法: 获得custName
	 *@return: java.lang.String  custName
	 */
	public java.lang.String getCustName(){
		return this.custName;
	}

	/**
	 *方法: 设置custName
	 *@param: java.lang.String  custName
	 */
	public void setCustName(java.lang.String custName){
		this.custName = custName;
	}

	/**
	 *方法: 获得transRtnCode
	 *@return: java.lang.String  transRtnCode
	 */
	public java.lang.String getTransRtnCode(){
		return this.transRtnCode;
	}

	/**
	 *方法: 设置transRtnCode
	 *@param: java.lang.String  transRtnCode
	 */
	public void setTransRtnCode(java.lang.String transRtnCode){
		this.transRtnCode = transRtnCode;
	}

	/**
	 *方法: 获得transRtnDesc
	 *@return: java.lang.String  transRtnDesc
	 */
	public java.lang.String getTransRtnDesc(){
		return this.transRtnDesc;
	}

	/**
	 *方法: 设置transRtnDesc
	 *@param: java.lang.String  transRtnDesc
	 */
	public void setTransRtnDesc(java.lang.String transRtnDesc){
		this.transRtnDesc = transRtnDesc;
	}

	/**
	 *方法: 获得bizRtnCode
	 *@return: java.lang.String  bizRtnCode
	 */
	public java.lang.String getBizRtnCode(){
		return this.bizRtnCode;
	}

	/**
	 *方法: 设置bizRtnCode
	 *@param: java.lang.String  bizRtnCode
	 */
	public void setBizRtnCode(java.lang.String bizRtnCode){
		this.bizRtnCode = bizRtnCode;
	}

	/**
	 *方法: 获得bizRtnDesc
	 *@return: java.lang.String  bizRtnDesc
	 */
	public java.lang.String getBizRtnDesc(){
		return this.bizRtnDesc;
	}

	/**
	 *方法: 设置bizRtnDesc
	 *@param: java.lang.String  bizRtnDesc
	 */
	public void setBizRtnDesc(java.lang.String bizRtnDesc){
		this.bizRtnDesc = bizRtnDesc;
	}

	/**
	 *方法: 获得repMessage
	 *@return: java.lang.String  repMessage
	 */
	public java.lang.String getRepMessage(){
		return this.repMessage;
	}

	/**
	 *方法: 设置repMessage
	 *@param: java.lang.String  repMessage
	 */
	public void setRepMessage(java.lang.String repMessage){
		this.repMessage = repMessage;
	}

	/**
	 *方法: 获得respMessage
	 *@return: java.lang.String  respMessage
	 */
	public java.lang.String getRespMessage(){
		return this.respMessage;
	}

	/**
	 *方法: 设置respMessage
	 *@param: java.lang.String  respMessage
	 */
	public void setRespMessage(java.lang.String respMessage){
		this.respMessage = respMessage;
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
	 *方法: 获得prodCode
	 *@return: java.lang.String  prodCode
	 */
	public java.lang.String getProdCode(){
		return this.prodCode;
	}

	/**
	 *方法: 设置prodCode
	 *@param: java.lang.String  prodCode
	 */
	public void setProdCode(java.lang.String prodCode){
		this.prodCode = prodCode;
	}

	/**
	 *方法: 获得orgCode
	 *@return: java.lang.String  orgCode
	 */
	public java.lang.String getOrgCode(){
		return this.orgCode;
	}

	/**
	 *方法: 设置orgCode
	 *@param: java.lang.String  orgCode
	 */
	public void setOrgCode(java.lang.String orgCode){
		this.orgCode = orgCode;
	}

	/**
	 *方法: 获得sysCode
	 *@return: java.lang.String  sysCode
	 */
	public java.lang.String getSysCode(){
		return this.sysCode;
	}

	/**
	 *方法: 设置sysCode
	 *@param: java.lang.String  sysCode
	 */
	public void setSysCode(java.lang.String sysCode){
		this.sysCode = sysCode;
	}

	/**
	 *方法: 获得retcode
	 *@return: java.lang.String  retcode
	 */
	public java.lang.String getRetcode(){
		return this.retcode;
	}

	/**
	 *方法: 设置retcode
	 *@param: java.lang.String  retcode
	 */
	public void setRetcode(java.lang.String retcode){
		this.retcode = retcode;
	}

	/**
	 *方法: 获得errormsg
	 *@return: java.lang.String  errormsg
	 */
	public java.lang.String getErrormsg(){
		return this.errormsg;
	}

	/**
	 *方法: 设置errormsg
	 *@param: java.lang.String  errormsg
	 */
	public void setErrormsg(java.lang.String errormsg){
		this.errormsg = errormsg;
	}

	/**
	 *方法: 获得interfaceId
	 *@return: java.lang.String  interfaceId
	 */
	public java.lang.String getInterfaceId(){
		return this.interfaceId;
	}

	/**
	 *方法: 设置interfaceId
	 *@param: java.lang.String  interfaceId
	 */
	public void setInterfaceId(java.lang.String interfaceId){
		this.interfaceId = interfaceId;
	}

	/**
	 *方法: 获得remark
	 *@return: java.lang.String  remark
	 */
	public java.lang.String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置remark
	 *@param: java.lang.String  remark
	 */
	public void setRemark(java.lang.String remark){
		this.remark = remark;
	}

}