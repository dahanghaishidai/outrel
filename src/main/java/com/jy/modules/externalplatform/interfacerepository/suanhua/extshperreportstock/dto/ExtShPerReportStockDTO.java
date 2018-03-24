package com.jy.modules.externalplatform.interfacerepository.suanhua.extshperreportstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:人行征信报告主表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-12 14:55:15
 */
public class ExtShPerReportStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**报告编号*/
	private java.lang.String reportNumber;

	/**报告时间*/
	private java.lang.String reportTime;

	/**查询时间*/
	private java.lang.String queryTime;

	/**姓名*/
	private java.lang.String name;

	/**证件类型*/
	private java.lang.String certificatesType;

	/**证件编号*/
	private java.lang.String certificatesNumber;

	/**婚姻状态*/
	private java.lang.String marital;

	/**推送报文*/
	private java.lang.String pushMessage;

	/**是否有人行征信逾期记录*/
	private java.lang.String overduesMsg;

	/**是否有人行征信负债记录*/
	private java.lang.String debtsMsg;

	/**是否有人行征信贷款余额详列*/
	private java.lang.String loanBalancesMsg;

	/**是否有人行征信信贷信息*/
	private java.lang.String creditLoanMsg;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**MODIFY_TIME*/
	private java.sql.Timestamp modifyTime;

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
	 *方法: 获得reportNumber
	 *@return: java.lang.String  reportNumber
	 */
	public java.lang.String getReportNumber(){
		return this.reportNumber;
	}

	/**
	 *方法: 设置reportNumber
	 *@param: java.lang.String  reportNumber
	 */
	public void setReportNumber(java.lang.String reportNumber){
		this.reportNumber = reportNumber;
	}

	/**
	 *方法: 获得reportTime
	 *@return: java.lang.String  reportTime
	 */
	public java.lang.String getReportTime(){
		return this.reportTime;
	}

	/**
	 *方法: 设置reportTime
	 *@param: java.lang.String  reportTime
	 */
	public void setReportTime(java.lang.String reportTime){
		this.reportTime = reportTime;
	}

	/**
	 *方法: 获得queryTime
	 *@return: java.lang.String  queryTime
	 */
	public java.lang.String getQueryTime(){
		return this.queryTime;
	}

	/**
	 *方法: 设置queryTime
	 *@param: java.lang.String  queryTime
	 */
	public void setQueryTime(java.lang.String queryTime){
		this.queryTime = queryTime;
	}

	/**
	 *方法: 获得name
	 *@return: java.lang.String  name
	 */
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置name
	 *@param: java.lang.String  name
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}

	/**
	 *方法: 获得certificatesType
	 *@return: java.lang.String  certificatesType
	 */
	public java.lang.String getCertificatesType(){
		return this.certificatesType;
	}

	/**
	 *方法: 设置certificatesType
	 *@param: java.lang.String  certificatesType
	 */
	public void setCertificatesType(java.lang.String certificatesType){
		this.certificatesType = certificatesType;
	}

	/**
	 *方法: 获得certificatesNumber
	 *@return: java.lang.String  certificatesNumber
	 */
	public java.lang.String getCertificatesNumber(){
		return this.certificatesNumber;
	}

	/**
	 *方法: 设置certificatesNumber
	 *@param: java.lang.String  certificatesNumber
	 */
	public void setCertificatesNumber(java.lang.String certificatesNumber){
		this.certificatesNumber = certificatesNumber;
	}

	/**
	 *方法: 获得marital
	 *@return: java.lang.String  marital
	 */
	public java.lang.String getMarital(){
		return this.marital;
	}

	/**
	 *方法: 设置marital
	 *@param: java.lang.String  marital
	 */
	public void setMarital(java.lang.String marital){
		this.marital = marital;
	}

	/**
	 *方法: 获得pushMessage
	 *@return: java.sql.Clob  pushMessage
	 */
	public java.lang.String getPushMessage(){
		return this.pushMessage;
	}

	/**
	 *方法: 设置pushMessage
	 *@param: java.sql.Clob  pushMessage
	 */
	public void setPushMessage(java.lang.String pushMessage){
		this.pushMessage = pushMessage;
	}

	/**
	 *方法: 获得overduesMsg
	 *@return: java.lang.String  overduesMsg
	 */
	public java.lang.String getOverduesMsg(){
		return this.overduesMsg;
	}

	/**
	 *方法: 设置overduesMsg
	 *@param: java.lang.String  overduesMsg
	 */
	public void setOverduesMsg(java.lang.String overduesMsg){
		this.overduesMsg = overduesMsg;
	}

	/**
	 *方法: 获得debtsMsg
	 *@return: java.lang.String  debtsMsg
	 */
	public java.lang.String getDebtsMsg(){
		return this.debtsMsg;
	}

	/**
	 *方法: 设置debtsMsg
	 *@param: java.lang.String  debtsMsg
	 */
	public void setDebtsMsg(java.lang.String debtsMsg){
		this.debtsMsg = debtsMsg;
	}

	/**
	 *方法: 获得loanBalancesMsg
	 *@return: java.lang.String  loanBalancesMsg
	 */
	public java.lang.String getLoanBalancesMsg(){
		return this.loanBalancesMsg;
	}

	/**
	 *方法: 设置loanBalancesMsg
	 *@param: java.lang.String  loanBalancesMsg
	 */
	public void setLoanBalancesMsg(java.lang.String loanBalancesMsg){
		this.loanBalancesMsg = loanBalancesMsg;
	}

	/**
	 *方法: 获得creditLoanMsg
	 *@return: java.lang.String  creditLoanMsg
	 */
	public java.lang.String getCreditLoanMsg(){
		return this.creditLoanMsg;
	}

	/**
	 *方法: 设置creditLoanMsg
	 *@param: java.lang.String  creditLoanMsg
	 */
	public void setCreditLoanMsg(java.lang.String creditLoanMsg){
		this.creditLoanMsg = creditLoanMsg;
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