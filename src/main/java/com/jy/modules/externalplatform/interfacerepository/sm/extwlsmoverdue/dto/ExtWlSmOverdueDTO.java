package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmoverdue.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:数美逾期黑名单服务信息(外联平台表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-09-26 14:26:46
 */
public class ExtWlSmOverdueDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private java.lang.Long id;

	/**进件客户关联主键*/
	private java.lang.Long intoCustRefId;

	/**1：命中黑名单；0：未命中黑名单 黑名单指高风险信贷欺诈用户。*/
	private java.lang.String inBlack;

	/**1：命中灰名单；0：未命中灰名单 灰名单指改用户存在风险行为，如存在手机号被盗用、多次浏览“赌”、“毒”网站等。命中后建议和其它维度配合使用。*/
	private java.lang.String inGrey;

	/**该用户在多少不同网贷平台发生了逾期。*/
	private java.lang.String overdues;

	/**网贷最大逾期时长级别*/
	private java.lang.String overdueDuration;

	/**在最近 7 天中，该用户在多少不同网贷平台发生了逾期。*/
	private java.lang.String overdues7d;

	/**在最近 7 天中，网贷最大逾期时长级别*/
	private java.lang.String overdueDuration7d;

	/**在最近 30 天中，该用户在多少不同网贷平台发生了逾期。*/
	private java.lang.String overdues30d;

	/**在最近 30 天中，网贷最大逾期时长级别*/
	private java.lang.String overdueDuration30d;

	/**在最近 60 天中，该用户在多少不同网贷平台发生了逾期。*/
	private java.lang.String overdues60d;

	/**在最近 60 天中，网贷最大逾期时长级别*/
	private java.lang.String overdueDuration60d;

	/**在最近 90 天中，该用户在多少不同网贷平台发生了逾期。*/
	private java.lang.String overdues90d;

	/**在最近 90 天中，网贷最大逾期时长级别*/
	private java.lang.String overdueDuration90d;

	/**在最近 180 天中，该用户在多少不同网贷平台发生了逾期。*/
	private java.lang.String overdues180d;

	/**在最近 180 天中，网贷最大逾期时长级别*/
	private java.lang.String overdueDuration180d;

	/**数据有效性（1：有效、0：无效）*/
	private java.lang.String validateState;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**创建人*/
	private java.lang.Long createBy;

	/**修改人*/
	private java.lang.Long modifyBy;

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
	 *方法: 获得intoCustRefId
	 *@return: java.lang.Long  intoCustRefId
	 */
	public java.lang.Long getIntoCustRefId(){
		return this.intoCustRefId;
	}

	/**
	 *方法: 设置intoCustRefId
	 *@param: java.lang.Long  intoCustRefId
	 */
	public void setIntoCustRefId(java.lang.Long intoCustRefId){
		this.intoCustRefId = intoCustRefId;
	}

	/**
	 *方法: 获得inBlack
	 *@return: java.lang.String  inBlack
	 */
	public java.lang.String getInBlack(){
		return this.inBlack;
	}

	/**
	 *方法: 设置inBlack
	 *@param: java.lang.String  inBlack
	 */
	public void setInBlack(java.lang.String inBlack){
		this.inBlack = inBlack;
	}

	/**
	 *方法: 获得inGrey
	 *@return: java.lang.String  inGrey
	 */
	public java.lang.String getInGrey(){
		return this.inGrey;
	}

	/**
	 *方法: 设置inGrey
	 *@param: java.lang.String  inGrey
	 */
	public void setInGrey(java.lang.String inGrey){
		this.inGrey = inGrey;
	}

	/**
	 *方法: 获得overdues
	 *@return: java.lang.String  overdues
	 */
	public java.lang.String getOverdues(){
		return this.overdues;
	}

	/**
	 *方法: 设置overdues
	 *@param: java.lang.String  overdues
	 */
	public void setOverdues(java.lang.String overdues){
		this.overdues = overdues;
	}

	/**
	 *方法: 获得overdueDuration
	 *@return: java.lang.String  overdueDuration
	 */
	public java.lang.String getOverdueDuration(){
		return this.overdueDuration;
	}

	/**
	 *方法: 设置overdueDuration
	 *@param: java.lang.String  overdueDuration
	 */
	public void setOverdueDuration(java.lang.String overdueDuration){
		this.overdueDuration = overdueDuration;
	}

	/**
	 *方法: 获得overdues7d
	 *@return: java.lang.String  overdues7d
	 */
	public java.lang.String getOverdues7d(){
		return this.overdues7d;
	}

	/**
	 *方法: 设置overdues7d
	 *@param: java.lang.String  overdues7d
	 */
	public void setOverdues7d(java.lang.String overdues7d){
		this.overdues7d = overdues7d;
	}

	/**
	 *方法: 获得overdueDuration7d
	 *@return: java.lang.String  overdueDuration7d
	 */
	public java.lang.String getOverdueDuration7d(){
		return this.overdueDuration7d;
	}

	/**
	 *方法: 设置overdueDuration7d
	 *@param: java.lang.String  overdueDuration7d
	 */
	public void setOverdueDuration7d(java.lang.String overdueDuration7d){
		this.overdueDuration7d = overdueDuration7d;
	}

	/**
	 *方法: 获得overdues30d
	 *@return: java.lang.String  overdues30d
	 */
	public java.lang.String getOverdues30d(){
		return this.overdues30d;
	}

	/**
	 *方法: 设置overdues30d
	 *@param: java.lang.String  overdues30d
	 */
	public void setOverdues30d(java.lang.String overdues30d){
		this.overdues30d = overdues30d;
	}

	/**
	 *方法: 获得overdueDuration30d
	 *@return: java.lang.String  overdueDuration30d
	 */
	public java.lang.String getOverdueDuration30d(){
		return this.overdueDuration30d;
	}

	/**
	 *方法: 设置overdueDuration30d
	 *@param: java.lang.String  overdueDuration30d
	 */
	public void setOverdueDuration30d(java.lang.String overdueDuration30d){
		this.overdueDuration30d = overdueDuration30d;
	}

	/**
	 *方法: 获得overdues60d
	 *@return: java.lang.String  overdues60d
	 */
	public java.lang.String getOverdues60d(){
		return this.overdues60d;
	}

	/**
	 *方法: 设置overdues60d
	 *@param: java.lang.String  overdues60d
	 */
	public void setOverdues60d(java.lang.String overdues60d){
		this.overdues60d = overdues60d;
	}

	/**
	 *方法: 获得overdueDuration60d
	 *@return: java.lang.String  overdueDuration60d
	 */
	public java.lang.String getOverdueDuration60d(){
		return this.overdueDuration60d;
	}

	/**
	 *方法: 设置overdueDuration60d
	 *@param: java.lang.String  overdueDuration60d
	 */
	public void setOverdueDuration60d(java.lang.String overdueDuration60d){
		this.overdueDuration60d = overdueDuration60d;
	}

	/**
	 *方法: 获得overdues90d
	 *@return: java.lang.String  overdues90d
	 */
	public java.lang.String getOverdues90d(){
		return this.overdues90d;
	}

	/**
	 *方法: 设置overdues90d
	 *@param: java.lang.String  overdues90d
	 */
	public void setOverdues90d(java.lang.String overdues90d){
		this.overdues90d = overdues90d;
	}

	/**
	 *方法: 获得overdueDuration90d
	 *@return: java.lang.String  overdueDuration90d
	 */
	public java.lang.String getOverdueDuration90d(){
		return this.overdueDuration90d;
	}

	/**
	 *方法: 设置overdueDuration90d
	 *@param: java.lang.String  overdueDuration90d
	 */
	public void setOverdueDuration90d(java.lang.String overdueDuration90d){
		this.overdueDuration90d = overdueDuration90d;
	}

	/**
	 *方法: 获得overdues180d
	 *@return: java.lang.String  overdues180d
	 */
	public java.lang.String getOverdues180d(){
		return this.overdues180d;
	}

	/**
	 *方法: 设置overdues180d
	 *@param: java.lang.String  overdues180d
	 */
	public void setOverdues180d(java.lang.String overdues180d){
		this.overdues180d = overdues180d;
	}

	/**
	 *方法: 获得overdueDuration180d
	 *@return: java.lang.String  overdueDuration180d
	 */
	public java.lang.String getOverdueDuration180d(){
		return this.overdueDuration180d;
	}

	/**
	 *方法: 设置overdueDuration180d
	 *@param: java.lang.String  overdueDuration180d
	 */
	public void setOverdueDuration180d(java.lang.String overdueDuration180d){
		this.overdueDuration180d = overdueDuration180d;
	}

	/**
	 *方法: 获得validateState
	 *@return: java.lang.String  validateState
	 */
	public java.lang.String getValidateState(){
		return this.validateState;
	}

	/**
	 *方法: 设置validateState
	 *@param: java.lang.String  validateState
	 */
	public void setValidateState(java.lang.String validateState){
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
	 *方法: 获得createBy
	 *@return: java.lang.Long  createBy
	 */
	public java.lang.Long getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置createBy
	 *@param: java.lang.Long  createBy
	 */
	public void setCreateBy(java.lang.Long createBy){
		this.createBy = createBy;
	}

	/**
	 *方法: 获得modifyBy
	 *@return: java.lang.Long  modifyBy
	 */
	public java.lang.Long getModifyBy(){
		return this.modifyBy;
	}

	/**
	 *方法: 设置modifyBy
	 *@param: java.lang.Long  modifyBy
	 */
	public void setModifyBy(java.lang.Long modifyBy){
		this.modifyBy = modifyBy;
	}

}