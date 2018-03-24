package com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverduedetail.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:新颜逾期信息详情表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-12 16:17:24
 */
public class ExtWlXyOverdueDetailDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**新颜逾期信息表主键*/
	private Long fkId;

	/**逾期时间 格式： YYYY-MM  */
	private String overdueDate;

	/**逾期天数 S:7-14天超短期现金贷的账期 M:月份账期 S1/M1/S2/M2/···  */
	private String overdueCount;

	/**逾期金额 单位:元  */
	private String amount;

	/**是否结清   Y:结清 N:未结清  */
	private String settlement;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long modifyBy;

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
	 *方法: 获得fkId
	 *@return: java.lang.Long  fkId
	 */
	public Long getFkId(){
		return this.fkId;
	}

	/**
	 *方法: 设置fkId
	 *@param: java.lang.Long  fkId
	 */
	public void setFkId(Long fkId){
		this.fkId = fkId;
	}

	/**
	 *方法: 获得overdueDate
	 *@return: java.lang.String  overdueDate
	 */
	public String getOverdueDate(){
		return this.overdueDate;
	}

	/**
	 *方法: 设置overdueDate
	 *@param: java.lang.String  overdueDate
	 */
	public void setOverdueDate(String overdueDate){
		this.overdueDate = overdueDate;
	}

	/**
	 *方法: 获得overdueCount
	 *@return: java.lang.String  overdueCount
	 */
	public String getOverdueCount(){
		return this.overdueCount;
	}

	/**
	 *方法: 设置overdueCount
	 *@param: java.lang.String  overdueCount
	 */
	public void setOverdueCount(String overdueCount){
		this.overdueCount = overdueCount;
	}

	/**
	 *方法: 获得amount
	 *@return: java.lang.String  amount
	 */
	public String getAmount(){
		return this.amount;
	}

	/**
	 *方法: 设置amount
	 *@param: java.lang.String  amount
	 */
	public void setAmount(String amount){
		this.amount = amount;
	}

	/**
	 *方法: 获得settlement
	 *@return: java.lang.String  settlement
	 */
	public String getSettlement(){
		return this.settlement;
	}

	/**
	 *方法: 设置settlement
	 *@param: java.lang.String  settlement
	 */
	public void setSettlement(String settlement){
		this.settlement = settlement;
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
	public Long getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置createBy
	 *@param: java.lang.Long  createBy
	 */
	public void setCreateBy(Long createBy){
		this.createBy = createBy;
	}

	/**
	 *方法: 获得modifyBy
	 *@return: java.lang.Long  modifyBy
	 */
	public Long getModifyBy(){
		return this.modifyBy;
	}

	/**
	 *方法: 设置modifyBy
	 *@param: java.lang.Long  modifyBy
	 */
	public void setModifyBy(Long modifyBy){
		this.modifyBy = modifyBy;
	}

}