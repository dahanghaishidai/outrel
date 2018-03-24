package com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxcredoostock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:好信度数据表
 *@author dell
 *@version 1.0,
 *@date 2017-06-05 10:36:40
 */
public class ExtQhzxCredooStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private java.lang.Long id;

	/**产品编码*/
	private java.lang.String prodCode;

	/**机构编码*/
	private java.lang.String orgCode;

	/**系统编码*/
	private java.lang.String sysCode;

	/**证件号码*/
	private java.lang.String idNo;

	/**证件类型（0:身份证）*/
	private java.lang.String idType;

	/**客户名称*/
	private java.lang.String name;

	/**借款人主银行卡号（放款账号）*/
	private java.lang.String cardNo;

	/**手机号码*/
	private java.lang.String mobileNo;

	/**查询原因（01:贷款审批）*/
	private java.lang.String reasonNo;

	/**批次号*/
	private java.lang.String batchNo;

	/**错误代码( 报头信息：E000000成功 其他失败)*/
	private java.lang.String rtCode;

	/**交易流水号*/
	private java.lang.String transNo;

	/**交易时间（格式：yyyy-MM-dd HH:mm:ss）*/
	private java.lang.String transDate;

	/**来源代码（1 - 金融机构）*/
	private java.lang.String sourceId;

	/**可度分（ -1：权限不足，其他为评分值）*/
	private java.lang.String credooScore;

	/**个人信息评分*/
	private java.lang.String bseInfoScore;

	/**金融需求评分*/
	private java.lang.String finRequireScore;

	/**还款能力评分*/
	private java.lang.String payAbilityScore;

	/**信用履约评分*/
	private java.lang.String performScore;

	/**行为数据评分*/
	private java.lang.String actionScore;

	/**虚拟资产评分*/
	private java.lang.String virAssetScore;

	/**成长性评分*/
	private java.lang.String trendScore;

	/**查询时间*/
	private java.lang.String dataBuildTime;

	/**错误代码( 业务数据：E000000成功 其他失败)*/
	private java.lang.String erCode;

	/**错误信息*/
	private java.lang.String erMsg;

	/**返回码 1：查有 2：查无 3：查询报错 4：解析错误*/
	private java.lang.String retCode;

	/**接口日志ID*/
	private java.lang.String interfaceId;

	/**创建时间*/
	private java.sql.Timestamp createTime;

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
	 *方法: 获得idNo
	 *@return: java.lang.String  idNo
	 */
	public java.lang.String getIdNo(){
		return this.idNo;
	}

	/**
	 *方法: 设置idNo
	 *@param: java.lang.String  idNo
	 */
	public void setIdNo(java.lang.String idNo){
		this.idNo = idNo;
	}

	/**
	 *方法: 获得idType
	 *@return: java.lang.String  idType
	 */
	public java.lang.String getIdType(){
		return this.idType;
	}

	/**
	 *方法: 设置idType
	 *@param: java.lang.String  idType
	 */
	public void setIdType(java.lang.String idType){
		this.idType = idType;
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
	 *方法: 获得cardNo
	 *@return: java.lang.String  cardNo
	 */
	public java.lang.String getCardNo(){
		return this.cardNo;
	}

	/**
	 *方法: 设置cardNo
	 *@param: java.lang.String  cardNo
	 */
	public void setCardNo(java.lang.String cardNo){
		this.cardNo = cardNo;
	}

	/**
	 *方法: 获得mobileNo
	 *@return: java.lang.String  mobileNo
	 */
	public java.lang.String getMobileNo(){
		return this.mobileNo;
	}

	/**
	 *方法: 设置mobileNo
	 *@param: java.lang.String  mobileNo
	 */
	public void setMobileNo(java.lang.String mobileNo){
		this.mobileNo = mobileNo;
	}

	/**
	 *方法: 获得reasonNo
	 *@return: java.lang.String  reasonNo
	 */
	public java.lang.String getReasonNo(){
		return this.reasonNo;
	}

	/**
	 *方法: 设置reasonNo
	 *@param: java.lang.String  reasonNo
	 */
	public void setReasonNo(java.lang.String reasonNo){
		this.reasonNo = reasonNo;
	}

	/**
	 *方法: 获得batchNo
	 *@return: java.lang.String  batchNo
	 */
	public java.lang.String getBatchNo(){
		return this.batchNo;
	}

	/**
	 *方法: 设置batchNo
	 *@param: java.lang.String  batchNo
	 */
	public void setBatchNo(java.lang.String batchNo){
		this.batchNo = batchNo;
	}

	/**
	 *方法: 获得rtCode
	 *@return: java.lang.String  rtCode
	 */
	public java.lang.String getRtCode(){
		return this.rtCode;
	}

	/**
	 *方法: 设置rtCode
	 *@param: java.lang.String  rtCode
	 */
	public void setRtCode(java.lang.String rtCode){
		this.rtCode = rtCode;
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
	 *方法: 获得transDate
	 *@return: java.lang.String  transDate
	 */
	public java.lang.String getTransDate(){
		return this.transDate;
	}

	/**
	 *方法: 设置transDate
	 *@param: java.lang.String  transDate
	 */
	public void setTransDate(java.lang.String transDate){
		this.transDate = transDate;
	}

	/**
	 *方法: 获得sourceId
	 *@return: java.lang.String  sourceId
	 */
	public java.lang.String getSourceId(){
		return this.sourceId;
	}

	/**
	 *方法: 设置sourceId
	 *@param: java.lang.String  sourceId
	 */
	public void setSourceId(java.lang.String sourceId){
		this.sourceId = sourceId;
	}

	/**
	 *方法: 获得credooScore
	 *@return: java.lang.String  credooScore
	 */
	public java.lang.String getCredooScore(){
		return this.credooScore;
	}

	/**
	 *方法: 设置credooScore
	 *@param: java.lang.String  credooScore
	 */
	public void setCredooScore(java.lang.String credooScore){
		this.credooScore = credooScore;
	}

	/**
	 *方法: 获得bseInfoScore
	 *@return: java.lang.String  bseInfoScore
	 */
	public java.lang.String getBseInfoScore(){
		return this.bseInfoScore;
	}

	/**
	 *方法: 设置bseInfoScore
	 *@param: java.lang.String  bseInfoScore
	 */
	public void setBseInfoScore(java.lang.String bseInfoScore){
		this.bseInfoScore = bseInfoScore;
	}

	/**
	 *方法: 获得finRequireScore
	 *@return: java.lang.String  finRequireScore
	 */
	public java.lang.String getFinRequireScore(){
		return this.finRequireScore;
	}

	/**
	 *方法: 设置finRequireScore
	 *@param: java.lang.String  finRequireScore
	 */
	public void setFinRequireScore(java.lang.String finRequireScore){
		this.finRequireScore = finRequireScore;
	}

	/**
	 *方法: 获得payAbilityScore
	 *@return: java.lang.String  payAbilityScore
	 */
	public java.lang.String getPayAbilityScore(){
		return this.payAbilityScore;
	}

	/**
	 *方法: 设置payAbilityScore
	 *@param: java.lang.String  payAbilityScore
	 */
	public void setPayAbilityScore(java.lang.String payAbilityScore){
		this.payAbilityScore = payAbilityScore;
	}

	/**
	 *方法: 获得performScore
	 *@return: java.lang.String  performScore
	 */
	public java.lang.String getPerformScore(){
		return this.performScore;
	}

	/**
	 *方法: 设置performScore
	 *@param: java.lang.String  performScore
	 */
	public void setPerformScore(java.lang.String performScore){
		this.performScore = performScore;
	}

	/**
	 *方法: 获得actionScore
	 *@return: java.lang.String  actionScore
	 */
	public java.lang.String getActionScore(){
		return this.actionScore;
	}

	/**
	 *方法: 设置actionScore
	 *@param: java.lang.String  actionScore
	 */
	public void setActionScore(java.lang.String actionScore){
		this.actionScore = actionScore;
	}

	/**
	 *方法: 获得virAssetScore
	 *@return: java.lang.String  virAssetScore
	 */
	public java.lang.String getVirAssetScore(){
		return this.virAssetScore;
	}

	/**
	 *方法: 设置virAssetScore
	 *@param: java.lang.String  virAssetScore
	 */
	public void setVirAssetScore(java.lang.String virAssetScore){
		this.virAssetScore = virAssetScore;
	}

	/**
	 *方法: 获得trendScore
	 *@return: java.lang.String  trendScore
	 */
	public java.lang.String getTrendScore(){
		return this.trendScore;
	}

	/**
	 *方法: 设置trendScore
	 *@param: java.lang.String  trendScore
	 */
	public void setTrendScore(java.lang.String trendScore){
		this.trendScore = trendScore;
	}

	/**
	 *方法: 获得dataBuildTime
	 *@return: java.lang.String  dataBuildTime
	 */
	public java.lang.String getDataBuildTime(){
		return this.dataBuildTime;
	}

	/**
	 *方法: 设置dataBuildTime
	 *@param: java.lang.String  dataBuildTime
	 */
	public void setDataBuildTime(java.lang.String dataBuildTime){
		this.dataBuildTime = dataBuildTime;
	}

	/**
	 *方法: 获得erCode
	 *@return: java.lang.String  erCode
	 */
	public java.lang.String getErCode(){
		return this.erCode;
	}

	/**
	 *方法: 设置erCode
	 *@param: java.lang.String  erCode
	 */
	public void setErCode(java.lang.String erCode){
		this.erCode = erCode;
	}

	/**
	 *方法: 获得erMsg
	 *@return: java.lang.String  erMsg
	 */
	public java.lang.String getErMsg(){
		return this.erMsg;
	}

	/**
	 *方法: 设置erMsg
	 *@param: java.lang.String  erMsg
	 */
	public void setErMsg(java.lang.String erMsg){
		this.erMsg = erMsg;
	}

	/**
	 *方法: 获得retCode
	 *@return: java.lang.String  retCode
	 */
	public java.lang.String getRetCode(){
		return this.retCode;
	}

	/**
	 *方法: 设置retCode
	 *@param: java.lang.String  retCode
	 */
	public void setRetCode(java.lang.String retCode){
		this.retCode = retCode;
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