package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmultiloan.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:数美多平台借贷服务信息(外联平台表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-09-26 14:26:38
 */
public class ExtWlSmMultiloanDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private java.lang.Long id;

	/**进件客户关联主键*/
	private java.lang.Long intoCustRefId;

	/**注册使用的不同网贷平台数目*/
	private java.lang.String itfinRegisters;

	/**在多少不同网贷平台提出过申请*/
	private java.lang.String itfinLoanApplications;

	/**在多少不同网贷平台被拒绝*/
	private java.lang.String itfinLoanRefuses;

	/**用户被多少个不同网贷平台查询过信贷信息*/
	private java.lang.String itfinLoanQueries;

	/**在多少不同网贷平台申请通过*/
	private java.lang.String itfinLoanApprovals;

	/**7 天内注册使用的不同网贷平台数目*/
	private java.lang.String itfinRegisters7d;

	/**7 天内在多少不同网贷平台提出过申请*/
	private java.lang.String itfinLoanApplications7d;

	/**7 天内在多少不同网贷平台被拒绝*/
	private java.lang.String itfinLoanRefuses7d;

	/**7 天内用户被多少个不同网贷平台查询过信贷信息*/
	private java.lang.String itfinLoanQueries7d;

	/**7 天内在多少不同网贷平台申请通过*/
	private java.lang.String itfinLoanApprovals7d;

	/**30 天内注册使用的不同网贷平台数目*/
	private java.lang.String itfinRegisters30d;

	/**30 天内在多少不同网贷平台提出过申请*/
	private java.lang.String itfinLoanApplications30d;

	/**30 天内在多少不同网贷平台被拒绝*/
	private java.lang.String itfinLoanRefuses30d;

	/**30 天用户被多少个不同网贷平台查询过信贷信息*/
	private java.lang.String itfinLoanQueries30d;

	/**30 天内在多少不同网贷平台申请通过*/
	private java.lang.String itfinLoanApprovals30d;

	/**60 天内注册使用的不同网贷平台数目*/
	private java.lang.String itfinRegisters60d;

	/**60 天内在多少不同网贷平台提出过申请*/
	private java.lang.String itfinLoanApplications60d;

	/**60 天内在多少不同网贷平台被拒绝*/
	private java.lang.String itfinLoanRefuses60d;

	/**60 天用户被多少个不同网贷平台查询过信贷信息*/
	private java.lang.String itfinLoanQueries60d;

	/**60 天内在多少不同网贷平台申请通过*/
	private java.lang.String itfinLoanApprovals60d;

	/**90 天内注册使用的不同网贷平台数目*/
	private java.lang.String itfinRegisters90d;

	/**90 天内在多少不同网贷平台提出过申请*/
	private java.lang.String itfinLoanApplications90d;

	/**90 天内在多少不同网贷平台被拒绝*/
	private java.lang.String itfinLoanRefuses90d;

	/**90 天用户被多少个不同网贷平台查询过信贷信息*/
	private java.lang.String itfinLoanQueries90d;

	/**90 天内在多少不同网贷平台申请通过*/
	private java.lang.String itfinLoanApprovals90d;

	/**180 天内注册使用的不同网贷平台数目*/
	private java.lang.String itfinRegisters180d;

	/**180 天内在多少不同网贷平台提出过申请*/
	private java.lang.String itfinLoanApplications180d;

	/**180 天内在多少不同网贷平台被拒绝*/
	private java.lang.String itfinLoanRefuses180d;

	/**180 天内用户被多少个不同网贷平台查询过信贷信息*/
	private java.lang.String itfinLoanQueries180d;

	/**180 天内在多少不同网贷平台申请通过*/
	private java.lang.String itfinLoanApprovals180d;

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
	 *方法: 获得itfinRegisters
	 *@return: java.lang.String  itfinRegisters
	 */
	public java.lang.String getItfinRegisters(){
		return this.itfinRegisters;
	}

	/**
	 *方法: 设置itfinRegisters
	 *@param: java.lang.String  itfinRegisters
	 */
	public void setItfinRegisters(java.lang.String itfinRegisters){
		this.itfinRegisters = itfinRegisters;
	}

	/**
	 *方法: 获得itfinLoanApplications
	 *@return: java.lang.String  itfinLoanApplications
	 */
	public java.lang.String getItfinLoanApplications(){
		return this.itfinLoanApplications;
	}

	/**
	 *方法: 设置itfinLoanApplications
	 *@param: java.lang.String  itfinLoanApplications
	 */
	public void setItfinLoanApplications(java.lang.String itfinLoanApplications){
		this.itfinLoanApplications = itfinLoanApplications;
	}

	/**
	 *方法: 获得itfinLoanRefuses
	 *@return: java.lang.String  itfinLoanRefuses
	 */
	public java.lang.String getItfinLoanRefuses(){
		return this.itfinLoanRefuses;
	}

	/**
	 *方法: 设置itfinLoanRefuses
	 *@param: java.lang.String  itfinLoanRefuses
	 */
	public void setItfinLoanRefuses(java.lang.String itfinLoanRefuses){
		this.itfinLoanRefuses = itfinLoanRefuses;
	}

	/**
	 *方法: 获得itfinLoanQueries
	 *@return: java.lang.String  itfinLoanQueries
	 */
	public java.lang.String getItfinLoanQueries(){
		return this.itfinLoanQueries;
	}

	/**
	 *方法: 设置itfinLoanQueries
	 *@param: java.lang.String  itfinLoanQueries
	 */
	public void setItfinLoanQueries(java.lang.String itfinLoanQueries){
		this.itfinLoanQueries = itfinLoanQueries;
	}

	/**
	 *方法: 获得itfinLoanApprovals
	 *@return: java.lang.String  itfinLoanApprovals
	 */
	public java.lang.String getItfinLoanApprovals(){
		return this.itfinLoanApprovals;
	}

	/**
	 *方法: 设置itfinLoanApprovals
	 *@param: java.lang.String  itfinLoanApprovals
	 */
	public void setItfinLoanApprovals(java.lang.String itfinLoanApprovals){
		this.itfinLoanApprovals = itfinLoanApprovals;
	}

	/**
	 *方法: 获得itfinRegisters7d
	 *@return: java.lang.String  itfinRegisters7d
	 */
	public java.lang.String getItfinRegisters7d(){
		return this.itfinRegisters7d;
	}

	/**
	 *方法: 设置itfinRegisters7d
	 *@param: java.lang.String  itfinRegisters7d
	 */
	public void setItfinRegisters7d(java.lang.String itfinRegisters7d){
		this.itfinRegisters7d = itfinRegisters7d;
	}

	/**
	 *方法: 获得itfinLoanApplications7d
	 *@return: java.lang.String  itfinLoanApplications7d
	 */
	public java.lang.String getItfinLoanApplications7d(){
		return this.itfinLoanApplications7d;
	}

	/**
	 *方法: 设置itfinLoanApplications7d
	 *@param: java.lang.String  itfinLoanApplications7d
	 */
	public void setItfinLoanApplications7d(java.lang.String itfinLoanApplications7d){
		this.itfinLoanApplications7d = itfinLoanApplications7d;
	}

	/**
	 *方法: 获得itfinLoanRefuses7d
	 *@return: java.lang.String  itfinLoanRefuses7d
	 */
	public java.lang.String getItfinLoanRefuses7d(){
		return this.itfinLoanRefuses7d;
	}

	/**
	 *方法: 设置itfinLoanRefuses7d
	 *@param: java.lang.String  itfinLoanRefuses7d
	 */
	public void setItfinLoanRefuses7d(java.lang.String itfinLoanRefuses7d){
		this.itfinLoanRefuses7d = itfinLoanRefuses7d;
	}

	/**
	 *方法: 获得itfinLoanQueries7d
	 *@return: java.lang.String  itfinLoanQueries7d
	 */
	public java.lang.String getItfinLoanQueries7d(){
		return this.itfinLoanQueries7d;
	}

	/**
	 *方法: 设置itfinLoanQueries7d
	 *@param: java.lang.String  itfinLoanQueries7d
	 */
	public void setItfinLoanQueries7d(java.lang.String itfinLoanQueries7d){
		this.itfinLoanQueries7d = itfinLoanQueries7d;
	}

	/**
	 *方法: 获得itfinLoanApprovals7d
	 *@return: java.lang.String  itfinLoanApprovals7d
	 */
	public java.lang.String getItfinLoanApprovals7d(){
		return this.itfinLoanApprovals7d;
	}

	/**
	 *方法: 设置itfinLoanApprovals7d
	 *@param: java.lang.String  itfinLoanApprovals7d
	 */
	public void setItfinLoanApprovals7d(java.lang.String itfinLoanApprovals7d){
		this.itfinLoanApprovals7d = itfinLoanApprovals7d;
	}

	/**
	 *方法: 获得itfinRegisters30d
	 *@return: java.lang.String  itfinRegisters30d
	 */
	public java.lang.String getItfinRegisters30d(){
		return this.itfinRegisters30d;
	}

	/**
	 *方法: 设置itfinRegisters30d
	 *@param: java.lang.String  itfinRegisters30d
	 */
	public void setItfinRegisters30d(java.lang.String itfinRegisters30d){
		this.itfinRegisters30d = itfinRegisters30d;
	}

	/**
	 *方法: 获得itfinLoanApplications30d
	 *@return: java.lang.String  itfinLoanApplications30d
	 */
	public java.lang.String getItfinLoanApplications30d(){
		return this.itfinLoanApplications30d;
	}

	/**
	 *方法: 设置itfinLoanApplications30d
	 *@param: java.lang.String  itfinLoanApplications30d
	 */
	public void setItfinLoanApplications30d(java.lang.String itfinLoanApplications30d){
		this.itfinLoanApplications30d = itfinLoanApplications30d;
	}

	/**
	 *方法: 获得itfinLoanRefuses30d
	 *@return: java.lang.String  itfinLoanRefuses30d
	 */
	public java.lang.String getItfinLoanRefuses30d(){
		return this.itfinLoanRefuses30d;
	}

	/**
	 *方法: 设置itfinLoanRefuses30d
	 *@param: java.lang.String  itfinLoanRefuses30d
	 */
	public void setItfinLoanRefuses30d(java.lang.String itfinLoanRefuses30d){
		this.itfinLoanRefuses30d = itfinLoanRefuses30d;
	}

	/**
	 *方法: 获得itfinLoanQueries30d
	 *@return: java.lang.String  itfinLoanQueries30d
	 */
	public java.lang.String getItfinLoanQueries30d(){
		return this.itfinLoanQueries30d;
	}

	/**
	 *方法: 设置itfinLoanQueries30d
	 *@param: java.lang.String  itfinLoanQueries30d
	 */
	public void setItfinLoanQueries30d(java.lang.String itfinLoanQueries30d){
		this.itfinLoanQueries30d = itfinLoanQueries30d;
	}

	/**
	 *方法: 获得itfinLoanApprovals30d
	 *@return: java.lang.String  itfinLoanApprovals30d
	 */
	public java.lang.String getItfinLoanApprovals30d(){
		return this.itfinLoanApprovals30d;
	}

	/**
	 *方法: 设置itfinLoanApprovals30d
	 *@param: java.lang.String  itfinLoanApprovals30d
	 */
	public void setItfinLoanApprovals30d(java.lang.String itfinLoanApprovals30d){
		this.itfinLoanApprovals30d = itfinLoanApprovals30d;
	}

	/**
	 *方法: 获得itfinRegisters60d
	 *@return: java.lang.String  itfinRegisters60d
	 */
	public java.lang.String getItfinRegisters60d(){
		return this.itfinRegisters60d;
	}

	/**
	 *方法: 设置itfinRegisters60d
	 *@param: java.lang.String  itfinRegisters60d
	 */
	public void setItfinRegisters60d(java.lang.String itfinRegisters60d){
		this.itfinRegisters60d = itfinRegisters60d;
	}

	/**
	 *方法: 获得itfinLoanApplications60d
	 *@return: java.lang.String  itfinLoanApplications60d
	 */
	public java.lang.String getItfinLoanApplications60d(){
		return this.itfinLoanApplications60d;
	}

	/**
	 *方法: 设置itfinLoanApplications60d
	 *@param: java.lang.String  itfinLoanApplications60d
	 */
	public void setItfinLoanApplications60d(java.lang.String itfinLoanApplications60d){
		this.itfinLoanApplications60d = itfinLoanApplications60d;
	}

	/**
	 *方法: 获得itfinLoanRefuses60d
	 *@return: java.lang.String  itfinLoanRefuses60d
	 */
	public java.lang.String getItfinLoanRefuses60d(){
		return this.itfinLoanRefuses60d;
	}

	/**
	 *方法: 设置itfinLoanRefuses60d
	 *@param: java.lang.String  itfinLoanRefuses60d
	 */
	public void setItfinLoanRefuses60d(java.lang.String itfinLoanRefuses60d){
		this.itfinLoanRefuses60d = itfinLoanRefuses60d;
	}

	/**
	 *方法: 获得itfinLoanQueries60d
	 *@return: java.lang.String  itfinLoanQueries60d
	 */
	public java.lang.String getItfinLoanQueries60d(){
		return this.itfinLoanQueries60d;
	}

	/**
	 *方法: 设置itfinLoanQueries60d
	 *@param: java.lang.String  itfinLoanQueries60d
	 */
	public void setItfinLoanQueries60d(java.lang.String itfinLoanQueries60d){
		this.itfinLoanQueries60d = itfinLoanQueries60d;
	}

	/**
	 *方法: 获得itfinLoanApprovals60d
	 *@return: java.lang.String  itfinLoanApprovals60d
	 */
	public java.lang.String getItfinLoanApprovals60d(){
		return this.itfinLoanApprovals60d;
	}

	/**
	 *方法: 设置itfinLoanApprovals60d
	 *@param: java.lang.String  itfinLoanApprovals60d
	 */
	public void setItfinLoanApprovals60d(java.lang.String itfinLoanApprovals60d){
		this.itfinLoanApprovals60d = itfinLoanApprovals60d;
	}

	/**
	 *方法: 获得itfinRegisters90d
	 *@return: java.lang.String  itfinRegisters90d
	 */
	public java.lang.String getItfinRegisters90d(){
		return this.itfinRegisters90d;
	}

	/**
	 *方法: 设置itfinRegisters90d
	 *@param: java.lang.String  itfinRegisters90d
	 */
	public void setItfinRegisters90d(java.lang.String itfinRegisters90d){
		this.itfinRegisters90d = itfinRegisters90d;
	}

	/**
	 *方法: 获得itfinLoanApplications90d
	 *@return: java.lang.String  itfinLoanApplications90d
	 */
	public java.lang.String getItfinLoanApplications90d(){
		return this.itfinLoanApplications90d;
	}

	/**
	 *方法: 设置itfinLoanApplications90d
	 *@param: java.lang.String  itfinLoanApplications90d
	 */
	public void setItfinLoanApplications90d(java.lang.String itfinLoanApplications90d){
		this.itfinLoanApplications90d = itfinLoanApplications90d;
	}

	/**
	 *方法: 获得itfinLoanRefuses90d
	 *@return: java.lang.String  itfinLoanRefuses90d
	 */
	public java.lang.String getItfinLoanRefuses90d(){
		return this.itfinLoanRefuses90d;
	}

	/**
	 *方法: 设置itfinLoanRefuses90d
	 *@param: java.lang.String  itfinLoanRefuses90d
	 */
	public void setItfinLoanRefuses90d(java.lang.String itfinLoanRefuses90d){
		this.itfinLoanRefuses90d = itfinLoanRefuses90d;
	}

	/**
	 *方法: 获得itfinLoanQueries90d
	 *@return: java.lang.String  itfinLoanQueries90d
	 */
	public java.lang.String getItfinLoanQueries90d(){
		return this.itfinLoanQueries90d;
	}

	/**
	 *方法: 设置itfinLoanQueries90d
	 *@param: java.lang.String  itfinLoanQueries90d
	 */
	public void setItfinLoanQueries90d(java.lang.String itfinLoanQueries90d){
		this.itfinLoanQueries90d = itfinLoanQueries90d;
	}

	/**
	 *方法: 获得itfinLoanApprovals90d
	 *@return: java.lang.String  itfinLoanApprovals90d
	 */
	public java.lang.String getItfinLoanApprovals90d(){
		return this.itfinLoanApprovals90d;
	}

	/**
	 *方法: 设置itfinLoanApprovals90d
	 *@param: java.lang.String  itfinLoanApprovals90d
	 */
	public void setItfinLoanApprovals90d(java.lang.String itfinLoanApprovals90d){
		this.itfinLoanApprovals90d = itfinLoanApprovals90d;
	}

	/**
	 *方法: 获得itfinRegisters180d
	 *@return: java.lang.String  itfinRegisters180d
	 */
	public java.lang.String getItfinRegisters180d(){
		return this.itfinRegisters180d;
	}

	/**
	 *方法: 设置itfinRegisters180d
	 *@param: java.lang.String  itfinRegisters180d
	 */
	public void setItfinRegisters180d(java.lang.String itfinRegisters180d){
		this.itfinRegisters180d = itfinRegisters180d;
	}

	/**
	 *方法: 获得itfinLoanApplications180d
	 *@return: java.lang.String  itfinLoanApplications180d
	 */
	public java.lang.String getItfinLoanApplications180d(){
		return this.itfinLoanApplications180d;
	}

	/**
	 *方法: 设置itfinLoanApplications180d
	 *@param: java.lang.String  itfinLoanApplications180d
	 */
	public void setItfinLoanApplications180d(java.lang.String itfinLoanApplications180d){
		this.itfinLoanApplications180d = itfinLoanApplications180d;
	}

	/**
	 *方法: 获得itfinLoanRefuses180d
	 *@return: java.lang.String  itfinLoanRefuses180d
	 */
	public java.lang.String getItfinLoanRefuses180d(){
		return this.itfinLoanRefuses180d;
	}

	/**
	 *方法: 设置itfinLoanRefuses180d
	 *@param: java.lang.String  itfinLoanRefuses180d
	 */
	public void setItfinLoanRefuses180d(java.lang.String itfinLoanRefuses180d){
		this.itfinLoanRefuses180d = itfinLoanRefuses180d;
	}

	/**
	 *方法: 获得itfinLoanQueries180d
	 *@return: java.lang.String  itfinLoanQueries180d
	 */
	public java.lang.String getItfinLoanQueries180d(){
		return this.itfinLoanQueries180d;
	}

	/**
	 *方法: 设置itfinLoanQueries180d
	 *@param: java.lang.String  itfinLoanQueries180d
	 */
	public void setItfinLoanQueries180d(java.lang.String itfinLoanQueries180d){
		this.itfinLoanQueries180d = itfinLoanQueries180d;
	}

	/**
	 *方法: 获得itfinLoanApprovals180d
	 *@return: java.lang.String  itfinLoanApprovals180d
	 */
	public java.lang.String getItfinLoanApprovals180d(){
		return this.itfinLoanApprovals180d;
	}

	/**
	 *方法: 设置itfinLoanApprovals180d
	 *@param: java.lang.String  itfinLoanApprovals180d
	 */
	public void setItfinLoanApprovals180d(java.lang.String itfinLoanApprovals180d){
		this.itfinLoanApprovals180d = itfinLoanApprovals180d;
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