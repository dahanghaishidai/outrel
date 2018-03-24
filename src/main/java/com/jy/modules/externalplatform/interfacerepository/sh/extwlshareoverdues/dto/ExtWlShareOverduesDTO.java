package com.jy.modules.externalplatform.interfacerepository.sh.extwlshareoverdues.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话共享报告_近5年逾期信息记录
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 19:53:36
 */
public class ExtWlShareOverduesDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**逾期期数*/
	private Long nowOverdueTimes;

	/**逾期金额*/
	private Long nowOverdueAmount;

	/**本期应还款日*/
	private String billingDate;

	/**开始统计年月*/
	private String startStatisDate;

	/**截止统计年月*/
	private String endStatisDate;

	/**信贷信息明细表主键ID*/
	private Long fkCreditDetailId;

	/**创建时间*/
	private java.sql.Timestamp createTime;

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
	 *方法: 获得nowOverdueTimes
	 *@return: java.lang.Long  nowOverdueTimes
	 */
	public Long getNowOverdueTimes(){
		return this.nowOverdueTimes;
	}

	/**
	 *方法: 设置nowOverdueTimes
	 *@param: java.lang.Long  nowOverdueTimes
	 */
	public void setNowOverdueTimes(Long nowOverdueTimes){
		this.nowOverdueTimes = nowOverdueTimes;
	}

	/**
	 *方法: 获得nowOverdueAmount
	 *@return: java.lang.Long  nowOverdueAmount
	 */
	public Long getNowOverdueAmount(){
		return this.nowOverdueAmount;
	}

	/**
	 *方法: 设置nowOverdueAmount
	 *@param: java.lang.Long  nowOverdueAmount
	 */
	public void setNowOverdueAmount(Long nowOverdueAmount){
		this.nowOverdueAmount = nowOverdueAmount;
	}

	/**
	 *方法: 获得billingDate
	 *@return: java.lang.String  billingDate
	 */
	public String getBillingDate(){
		return this.billingDate;
	}

	/**
	 *方法: 设置billingDate
	 *@param: java.lang.String  billingDate
	 */
	public void setBillingDate(String billingDate){
		this.billingDate = billingDate;
	}

	/**
	 *方法: 获得startStatisDate
	 *@return: java.lang.String  startStatisDate
	 */
	public String getStartStatisDate(){
		return this.startStatisDate;
	}

	/**
	 *方法: 设置startStatisDate
	 *@param: java.lang.String  startStatisDate
	 */
	public void setStartStatisDate(String startStatisDate){
		this.startStatisDate = startStatisDate;
	}

	/**
	 *方法: 获得endStatisDate
	 *@return: java.lang.String  endStatisDate
	 */
	public String getEndStatisDate(){
		return this.endStatisDate;
	}

	/**
	 *方法: 设置endStatisDate
	 *@param: java.lang.String  endStatisDate
	 */
	public void setEndStatisDate(String endStatisDate){
		this.endStatisDate = endStatisDate;
	}

	/**
	 *方法: 获得fkCreditDetailId
	 *@return: java.lang.Long  fkCreditDetailId
	 */
	public Long getFkCreditDetailId(){
		return this.fkCreditDetailId;
	}

	/**
	 *方法: 设置fkCreditDetailId
	 *@param: java.lang.Long  fkCreditDetailId
	 */
	public void setFkCreditDetailId(Long fkCreditDetailId){
		this.fkCreditDetailId = fkCreditDetailId;
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

}