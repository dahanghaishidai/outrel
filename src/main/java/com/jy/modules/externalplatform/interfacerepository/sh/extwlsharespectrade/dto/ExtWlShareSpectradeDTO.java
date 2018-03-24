package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharespectrade.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话共享报告_异常交易信息列表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 19:53:42
 */
public class ExtWlShareSpectradeDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**异常交易类型*/
	private String tradeType;

	/**机构号*/
	private String orgCode;

	/**发生日期*/
	private String tradeDate;

	/**发生金额*/
	private Long tradeSum;

	/**合同生效日期*/
	private String dateOpened;

	/**明细记录*/
	private String details;

	/**信息获取时间*/
	private String createTime;

	/**征信报告主表ID*/
	private Long fkReportId;

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
	 *方法: 获得tradeType
	 *@return: java.lang.String  tradeType
	 */
	public String getTradeType(){
		return this.tradeType;
	}

	/**
	 *方法: 设置tradeType
	 *@param: java.lang.String  tradeType
	 */
	public void setTradeType(String tradeType){
		this.tradeType = tradeType;
	}

	/**
	 *方法: 获得orgCode
	 *@return: java.lang.String  orgCode
	 */
	public String getOrgCode(){
		return this.orgCode;
	}

	/**
	 *方法: 设置orgCode
	 *@param: java.lang.String  orgCode
	 */
	public void setOrgCode(String orgCode){
		this.orgCode = orgCode;
	}

	/**
	 *方法: 获得tradeDate
	 *@return: java.lang.String  tradeDate
	 */
	public String getTradeDate(){
		return this.tradeDate;
	}

	/**
	 *方法: 设置tradeDate
	 *@param: java.lang.String  tradeDate
	 */
	public void setTradeDate(String tradeDate){
		this.tradeDate = tradeDate;
	}

	/**
	 *方法: 获得tradeSum
	 *@return: java.lang.Long  tradeSum
	 */
	public Long getTradeSum(){
		return this.tradeSum;
	}

	/**
	 *方法: 设置tradeSum
	 *@param: java.lang.Long  tradeSum
	 */
	public void setTradeSum(Long tradeSum){
		this.tradeSum = tradeSum;
	}

	/**
	 *方法: 获得dateOpened
	 *@return: java.lang.String  dateOpened
	 */
	public String getDateOpened(){
		return this.dateOpened;
	}

	/**
	 *方法: 设置dateOpened
	 *@param: java.lang.String  dateOpened
	 */
	public void setDateOpened(String dateOpened){
		this.dateOpened = dateOpened;
	}

	/**
	 *方法: 获得details
	 *@return: java.lang.String  details
	 */
	public String getDetails(){
		return this.details;
	}

	/**
	 *方法: 设置details
	 *@param: java.lang.String  details
	 */
	public void setDetails(String details){
		this.details = details;
	}

	/**
	 *方法: 获得createTime
	 *@return: java.lang.String  createTime
	 */
	public String getCreateTime(){
		return this.createTime;
	}

	/**
	 *方法: 设置createTime
	 *@param: java.lang.String  createTime
	 */
	public void setCreateTime(String createTime){
		this.createTime = createTime;
	}

	/**
	 *方法: 获得fkReportId
	 *@return: java.lang.Long  fkReportId
	 */
	public Long getFkReportId(){
		return this.fkReportId;
	}

	/**
	 *方法: 设置fkReportId
	 *@param: java.lang.Long  fkReportId
	 */
	public void setFkReportId(Long fkReportId){
		this.fkReportId = fkReportId;
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