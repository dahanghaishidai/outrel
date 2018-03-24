package com.jy.modules.externalplatform.interfacerepository.sjt.extsjtabstractstock.dto;

import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtassetsstock.dto.ExtSjtAssetsStockDTO;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtdetailstock.dto.ExtSjtDetailStockDTO;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjttransbehaviorstock.dto.ExtSjtTransBehaviorStockDTO;
import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:数据堂个人消费报告摘要信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-08 11:41:50
 */
public class ExtSjtAbstractStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**交易流水号*/
	private java.lang.String transNo;

	/**进件编号*/
	private java.lang.Long intoId;

	/**每月还贷能力*/
	private java.lang.String repaymentAbility;

	/**客户ID*/
	private java.lang.Long custId;

	/**是否存在资产指标*/
	private java.lang.String assetsMsg;

	/**是否存在明细信息*/
	private java.lang.String detailMsg;

	/**是否存在交易行为特征信息*/
	private java.lang.String transBehaviorMsg;

	/**CREATE_TIME*/
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

	private String resCode ;
	private String message ;
	/**信用相关交易统计*/
	private ExtSjtDetailStockDTO [] indexTransCredits ; 
	
	/** 消费大类分布信息*/
	private ExtSjtDetailStockDTO [] indexConsumeCategories	 ; 
	
	/**  消费地域分布信息	*/
	private ExtSjtDetailStockDTO [] indexConsumeCities	 ; 
	
	/**  每月消费状况信息	*/
	private ExtSjtDetailStockDTO [] indexMonthConsumes	 ; 
	
	/**  数据堂个人消费报告资产指标	*/
	private ExtSjtAssetsStockDTO indexProperty ;
	
	/**  交易行为特征信息	*/
	private ExtSjtTransBehaviorStockDTO indexTransBehavior ;
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
	 *方法: 获得intoId
	 *@return: java.lang.Long  intoId
	 */
	public java.lang.Long getIntoId(){
		return this.intoId;
	}

	/**
	 *方法: 设置intoId
	 *@param: java.lang.Long  intoId
	 */
	public void setIntoId(java.lang.Long intoId){
		this.intoId = intoId;
	}

	/**
	 *方法: 获得repaymentAbility
	 *@return: java.lang.String  repaymentAbility
	 */
	public java.lang.String getRepaymentAbility(){
		return this.repaymentAbility;
	}

	/**
	 *方法: 设置repaymentAbility
	 *@param: java.lang.String  repaymentAbility
	 */
	public void setRepaymentAbility(java.lang.String repaymentAbility){
		this.repaymentAbility = repaymentAbility;
	}

	/**
	 *方法: 获得custId
	 *@return: java.lang.Long  custId
	 */
	public java.lang.Long getCustId(){
		return this.custId;
	}

	/**
	 *方法: 设置custId
	 *@param: java.lang.Long  custId
	 */
	public void setCustId(java.lang.Long custId){
		this.custId = custId;
	}

	/**
	 *方法: 获得assetsMsg
	 *@return: java.lang.String  assetsMsg
	 */
	public java.lang.String getAssetsMsg(){
		return this.assetsMsg;
	}

	/**
	 *方法: 设置assetsMsg
	 *@param: java.lang.String  assetsMsg
	 */
	public void setAssetsMsg(java.lang.String assetsMsg){
		this.assetsMsg = assetsMsg;
	}

	/**
	 *方法: 获得detailMsg
	 *@return: java.lang.String  detailMsg
	 */
	public java.lang.String getDetailMsg(){
		return this.detailMsg;
	}

	/**
	 *方法: 设置detailMsg
	 *@param: java.lang.String  detailMsg
	 */
	public void setDetailMsg(java.lang.String detailMsg){
		this.detailMsg = detailMsg;
	}

	/**
	 *方法: 获得transBehaviorMsg
	 *@return: java.lang.String  transBehaviorMsg
	 */
	public java.lang.String getTransBehaviorMsg(){
		return this.transBehaviorMsg;
	}

	/**
	 *方法: 设置transBehaviorMsg
	 *@param: java.lang.String  transBehaviorMsg
	 */
	public void setTransBehaviorMsg(java.lang.String transBehaviorMsg){
		this.transBehaviorMsg = transBehaviorMsg;
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

	public String getResCode() {
		return resCode;
	}

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ExtSjtDetailStockDTO[] getIndexTransCredits() {
		return indexTransCredits;
	}

	public void setIndexTransCredits(ExtSjtDetailStockDTO[] indexTransCredits) {
		this.indexTransCredits = indexTransCredits;
	}

	public ExtSjtDetailStockDTO[] getIndexConsumeCategories() {
		return indexConsumeCategories;
	}

	public void setIndexConsumeCategories(
			ExtSjtDetailStockDTO[] indexConsumeCategories) {
		this.indexConsumeCategories = indexConsumeCategories;
	}

	public ExtSjtDetailStockDTO[] getIndexConsumeCities() {
		return indexConsumeCities;
	}

	public void setIndexConsumeCities(ExtSjtDetailStockDTO[] indexConsumeCities) {
		this.indexConsumeCities = indexConsumeCities;
	}

	public ExtSjtDetailStockDTO[] getIndexMonthConsumes() {
		return indexMonthConsumes;
	}

	public void setIndexMonthConsumes(ExtSjtDetailStockDTO[] indexMonthConsumes) {
		this.indexMonthConsumes = indexMonthConsumes;
	}

	public ExtSjtAssetsStockDTO getIndexProperty() {
		return indexProperty;
	}

	public void setIndexProperty(ExtSjtAssetsStockDTO indexProperty) {
		this.indexProperty = indexProperty;
	}

	public ExtSjtTransBehaviorStockDTO getIndexTransBehavior() {
		return indexTransBehavior;
	}

	public void setIndexTransBehavior(ExtSjtTransBehaviorStockDTO indexTransBehavior) {
		this.indexTransBehavior = indexTransBehavior;
	}

	
}