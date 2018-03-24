package com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxblackstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:前海征信黑名单查询结果表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-07 17:28:40
 */
public class ExtQhzxBlackStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**交易流水号*/
	private java.lang.String transNo;

	/**证件类型*/
	private java.lang.String cardType;

	/**证件号码*/
	private java.lang.String cardId;

	/**主体名称*/
	private java.lang.String custName;

	/**查询原因*/
	private java.lang.String reasonCode;

	/**查询严重等级*/
	private java.lang.String gradeQuery;

	/**金额范围*/
	private java.lang.String moneybound;

	/**数据状态(1:已验证;2:未验证)*/
	private java.lang.String dataStatus;

	/**业务错误代码(E000000:成功;其他失败)*/
	private java.lang.String bizErrorCode;

	/**请求错误代码(E000000:成功;其他失败)*/
	private java.lang.String rtnCode;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private java.lang.String createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**修改人*/
	private java.lang.String modifyBy;

	/**产品编码*/
	private java.lang.String prodCode;

	/**机构编码*/
	private java.lang.String orgCode;

	/**系统编码*/
	private java.lang.String sysCode;

	/**返回码 1：查有 2：查无 3：查询报错 4：解析错误 5:返回错误信息*/
	private java.lang.String retcode;

	/**返回错误信息*/
	private java.lang.String errormsg;

	/**接口日志ID*/
	private java.lang.String interfaceId;

	/**备注*/
	private java.lang.String remark;

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
	 *方法: 获得transNo
	 *@return: java.lang.String  transNo
	 */
	public java.lang.String getTransNo(){
		return this.transNo;
	}

	/**
	 *方法: 设置transNo
	 *@param: java.lang.String  transNo
	 */
	public void setTransNo(java.lang.String transNo){
		this.transNo = transNo;
	}

	/**
	 *方法: 获得cardType
	 *@return: java.lang.String  cardType
	 */
	public java.lang.String getCardType(){
		return this.cardType;
	}

	/**
	 *方法: 设置cardType
	 *@param: java.lang.String  cardType
	 */
	public void setCardType(java.lang.String cardType){
		this.cardType = cardType;
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
	 *方法: 获得reasonCode
	 *@return: java.lang.String  reasonCode
	 */
	public java.lang.String getReasonCode(){
		return this.reasonCode;
	}

	/**
	 *方法: 设置reasonCode
	 *@param: java.lang.String  reasonCode
	 */
	public void setReasonCode(java.lang.String reasonCode){
		this.reasonCode = reasonCode;
	}

	/**
	 *方法: 获得gradeQuery
	 *@return: java.lang.String  gradeQuery
	 */
	public java.lang.String getGradeQuery(){
		return this.gradeQuery;
	}

	/**
	 *方法: 设置gradeQuery
	 *@param: java.lang.String  gradeQuery
	 */
	public void setGradeQuery(java.lang.String gradeQuery){
		this.gradeQuery = gradeQuery;
	}

	/**
	 *方法: 获得moneybound
	 *@return: java.lang.String  moneybound
	 */
	public java.lang.String getMoneybound(){
		return this.moneybound;
	}

	/**
	 *方法: 设置moneybound
	 *@param: java.lang.String  moneybound
	 */
	public void setMoneybound(java.lang.String moneybound){
		this.moneybound = moneybound;
	}

	/**
	 *方法: 获得dataStatus
	 *@return: java.lang.String  dataStatus
	 */
	public java.lang.String getDataStatus(){
		return this.dataStatus;
	}

	/**
	 *方法: 设置dataStatus
	 *@param: java.lang.String  dataStatus
	 */
	public void setDataStatus(java.lang.String dataStatus){
		this.dataStatus = dataStatus;
	}

	/**
	 *方法: 获得bizErrorCode
	 *@return: java.lang.String  bizErrorCode
	 */
	public java.lang.String getBizErrorCode(){
		return this.bizErrorCode;
	}

	/**
	 *方法: 设置bizErrorCode
	 *@param: java.lang.String  bizErrorCode
	 */
	public void setBizErrorCode(java.lang.String bizErrorCode){
		this.bizErrorCode = bizErrorCode;
	}

	/**
	 *方法: 获得rtnCode
	 *@return: java.lang.String  rtnCode
	 */
	public java.lang.String getRtnCode(){
		return this.rtnCode;
	}

	/**
	 *方法: 设置rtnCode
	 *@param: java.lang.String  rtnCode
	 */
	public void setRtnCode(java.lang.String rtnCode){
		this.rtnCode = rtnCode;
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
	 *@return: java.lang.String  createBy
	 */
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置createBy
	 *@param: java.lang.String  createBy
	 */
	public void setCreateBy(java.lang.String createBy){
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
	 *@return: java.lang.String  modifyBy
	 */
	public java.lang.String getModifyBy(){
		return this.modifyBy;
	}

	/**
	 *方法: 设置modifyBy
	 *@param: java.lang.String  modifyBy
	 */
	public void setModifyBy(java.lang.String modifyBy){
		this.modifyBy = modifyBy;
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