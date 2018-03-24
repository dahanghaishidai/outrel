package com.jy.modules.externalplatform.interfacerepository.sjt.extsjtdetailstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:数据堂个人消费报告明细信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-08 11:42:16
 */
public class ExtSjtDetailStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**TRANS_NO*/
	private java.lang.String transNo;

	/**INTO_ID*/
	private java.lang.Long intoId;

	/**01-信用相关交易统计、02-消费大类分布信息、03-消费地域分布信息、04-每月消费状况信息*/
	private java.lang.String detailType;

	/**交易类型*/
	private java.lang.String name;

	/**消费金额*/
	private java.lang.Long amount;

	/**消费笔数*/
	private java.lang.Long count;

	/**消费金额在本市的排名*/
	private java.lang.Long amountranking;

	/**消费笔数在本市的排*/
	private java.lang.Long countranking;

	/**关联主键*/
	private java.lang.Long fkId;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private java.lang.String createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**修改人*/
	private java.lang.String modifyBy;

	private Long custId ;
	
	private String month ;
	
	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
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
	 *方法: 获得detailType
	 *@return: java.lang.String  detailType
	 */
	public java.lang.String getDetailType(){
		return this.detailType;
	}

	/**
	 *方法: 设置detailType
	 *@param: java.lang.String  detailType
	 */
	public void setDetailType(java.lang.String detailType){
		this.detailType = detailType;
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
	 *方法: 获得amount
	 *@return: java.lang.Long  amount
	 */
	public java.lang.Long getAmount(){
		return this.amount;
	}

	/**
	 *方法: 设置amount
	 *@param: java.lang.Long  amount
	 */
	public void setAmount(java.lang.Long amount){
		this.amount = amount;
	}

	/**
	 *方法: 获得count
	 *@return: java.lang.Long  count
	 */
	public java.lang.Long getCount(){
		return this.count;
	}

	/**
	 *方法: 设置count
	 *@param: java.lang.Long  count
	 */
	public void setCount(java.lang.Long count){
		this.count = count;
	}

	/**
	 *方法: 获得amountranking
	 *@return: java.lang.Long  amountranking
	 */
	public java.lang.Long getAmountranking(){
		return this.amountranking;
	}

	/**
	 *方法: 设置amountranking
	 *@param: java.lang.Long  amountranking
	 */
	public void setAmountranking(java.lang.Long amountranking){
		this.amountranking = amountranking;
	}

	/**
	 *方法: 获得countranking
	 *@return: java.lang.Long  countranking
	 */
	public java.lang.Long getCountranking(){
		return this.countranking;
	}

	/**
	 *方法: 设置countranking
	 *@param: java.lang.Long  countranking
	 */
	public void setCountranking(java.lang.Long countranking){
		this.countranking = countranking;
	}

	/**
	 *方法: 获得fkId
	 *@return: java.lang.Long  fkId
	 */
	public java.lang.Long getFkId(){
		return this.fkId;
	}

	/**
	 *方法: 设置fkId
	 *@param: java.lang.Long  fkId
	 */
	public void setFkId(java.lang.Long fkId){
		this.fkId = fkId;
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

}