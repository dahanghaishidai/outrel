package com.jy.modules.externalplatform.interfacerepository.td.exttdblackresult.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:同盾黑名单查询结果表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-02 14:55:58
 */
public class ExtTdBlackResultDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**业务阶段编码*/
	private java.lang.String bizStage;

	/**业务表主键ID*/
	private java.lang.String bizId;

	/**身份证号码*/
	private java.lang.String cardId;

	/**最终的风险评估结果(Accept无风险，通过；Review低风险，审查；Reject高风险，拒绝)*/
	private java.lang.String finalDecision;

	/**最终的风险系数*/
	private java.lang.String finalScore;

	/**触发的策略集名称*/
	private java.lang.String policySetName;

	/**请求报文*/
	private java.lang.String repMessage;

	/**返回报文*/
	private java.lang.String respMessage;

	/**查询申请时间*/
	private java.lang.String receiveTime;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**查询状态(true:成功调用, false:未成功)*/
	private java.lang.String treatResult;

	/**treatResult=false时的错误代码,否则为空*/
	private java.lang.String treatErrorCode;

	/**treatResult=false时的错误描述信息,否则为空*/
	private java.lang.String errorMessage;

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
	 *方法: 获得bizStage
	 *@return: java.lang.String  bizStage
	 */
	public java.lang.String getBizStage(){
		return this.bizStage;
	}

	/**
	 *方法: 设置bizStage
	 *@param: java.lang.String  bizStage
	 */
	public void setBizStage(java.lang.String bizStage){
		this.bizStage = bizStage;
	}

	/**
	 *方法: 获得bizId
	 *@return: java.lang.String  bizId
	 */
	public java.lang.String getBizId(){
		return this.bizId;
	}

	/**
	 *方法: 设置bizId
	 *@param: java.lang.String  bizId
	 */
	public void setBizId(java.lang.String bizId){
		this.bizId = bizId;
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
	 *方法: 获得finalDecision
	 *@return: java.lang.String  finalDecision
	 */
	public java.lang.String getFinalDecision(){
		return this.finalDecision;
	}

	/**
	 *方法: 设置finalDecision
	 *@param: java.lang.String  finalDecision
	 */
	public void setFinalDecision(java.lang.String finalDecision){
		this.finalDecision = finalDecision;
	}

	/**
	 *方法: 获得finalScore
	 *@return: java.lang.String  finalScore
	 */
	public java.lang.String getFinalScore(){
		return this.finalScore;
	}

	/**
	 *方法: 设置finalScore
	 *@param: java.lang.String  finalScore
	 */
	public void setFinalScore(java.lang.String finalScore){
		this.finalScore = finalScore;
	}

	/**
	 *方法: 获得policySetName
	 *@return: java.lang.String  policySetName
	 */
	public java.lang.String getPolicySetName(){
		return this.policySetName;
	}

	/**
	 *方法: 设置policySetName
	 *@param: java.lang.String  policySetName
	 */
	public void setPolicySetName(java.lang.String policySetName){
		this.policySetName = policySetName;
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
	 *方法: 获得receiveTime
	 *@return: java.lang.String  receiveTime
	 */
	public java.lang.String getReceiveTime(){
		return this.receiveTime;
	}

	/**
	 *方法: 设置receiveTime
	 *@param: java.lang.String  receiveTime
	 */
	public void setReceiveTime(java.lang.String receiveTime){
		this.receiveTime = receiveTime;
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
	 *方法: 获得treatResult
	 *@return: java.lang.String  treatResult
	 */
	public java.lang.String getTreatResult(){
		return this.treatResult;
	}

	/**
	 *方法: 设置treatResult
	 *@param: java.lang.String  treatResult
	 */
	public void setTreatResult(java.lang.String treatResult){
		this.treatResult = treatResult;
	}

	/**
	 *方法: 获得treatErrorCode
	 *@return: java.lang.String  treatErrorCode
	 */
	public java.lang.String getTreatErrorCode(){
		return this.treatErrorCode;
	}

	/**
	 *方法: 设置treatErrorCode
	 *@param: java.lang.String  treatErrorCode
	 */
	public void setTreatErrorCode(java.lang.String treatErrorCode){
		this.treatErrorCode = treatErrorCode;
	}

	/**
	 *方法: 获得errorMessage
	 *@return: java.lang.String  errorMessage
	 */
	public java.lang.String getErrorMessage(){
		return this.errorMessage;
	}

	/**
	 *方法: 设置errorMessage
	 *@param: java.lang.String  errorMessage
	 */
	public void setErrorMessage(java.lang.String errorMessage){
		this.errorMessage = errorMessage;
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

	public java.sql.Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(java.sql.Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

}