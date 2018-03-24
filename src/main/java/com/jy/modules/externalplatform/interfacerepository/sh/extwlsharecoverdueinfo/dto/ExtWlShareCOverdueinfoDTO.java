package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecoverdueinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话共享报告_信贷信息概要（逾期及违约信息概要）
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 19:53:12
 */
public class ExtWlShareCOverdueinfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**呆账笔数*/
	private Long badDebtNum;

	/**呆账总负债*/
	private Long badDebtBalance;

	/**核销笔数*/
	private Long offNum;

	/**核销总负债*/
	private Long offBalance;

	/**代偿笔数*/
	private Long agentNum;

	/**代偿总负债*/
	private Long agentBalance;

	/**逾期笔数*/
	private Long overdueNum;

	/**最大逾期期数*/
	private Long maxOverdueTimes;

	/**最大逾期金额*/
	private Long maxOverdueAmount;

	/**征信报告主表ID*/
	private Long fkReportId;

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
	 *方法: 获得badDebtNum
	 *@return: java.lang.Long  badDebtNum
	 */
	public Long getBadDebtNum(){
		return this.badDebtNum;
	}

	/**
	 *方法: 设置badDebtNum
	 *@param: java.lang.Long  badDebtNum
	 */
	public void setBadDebtNum(Long badDebtNum){
		this.badDebtNum = badDebtNum;
	}

	/**
	 *方法: 获得badDebtBalance
	 *@return: java.lang.Long  badDebtBalance
	 */
	public Long getBadDebtBalance(){
		return this.badDebtBalance;
	}

	/**
	 *方法: 设置badDebtBalance
	 *@param: java.lang.Long  badDebtBalance
	 */
	public void setBadDebtBalance(Long badDebtBalance){
		this.badDebtBalance = badDebtBalance;
	}

	/**
	 *方法: 获得offNum
	 *@return: java.lang.Long  offNum
	 */
	public Long getOffNum(){
		return this.offNum;
	}

	/**
	 *方法: 设置offNum
	 *@param: java.lang.Long  offNum
	 */
	public void setOffNum(Long offNum){
		this.offNum = offNum;
	}

	/**
	 *方法: 获得offBalance
	 *@return: java.lang.Long  offBalance
	 */
	public Long getOffBalance(){
		return this.offBalance;
	}

	/**
	 *方法: 设置offBalance
	 *@param: java.lang.Long  offBalance
	 */
	public void setOffBalance(Long offBalance){
		this.offBalance = offBalance;
	}

	/**
	 *方法: 获得agentNum
	 *@return: java.lang.Long  agentNum
	 */
	public Long getAgentNum(){
		return this.agentNum;
	}

	/**
	 *方法: 设置agentNum
	 *@param: java.lang.Long  agentNum
	 */
	public void setAgentNum(Long agentNum){
		this.agentNum = agentNum;
	}

	/**
	 *方法: 获得agentBalance
	 *@return: java.lang.Long  agentBalance
	 */
	public Long getAgentBalance(){
		return this.agentBalance;
	}

	/**
	 *方法: 设置agentBalance
	 *@param: java.lang.Long  agentBalance
	 */
	public void setAgentBalance(Long agentBalance){
		this.agentBalance = agentBalance;
	}

	/**
	 *方法: 获得overdueNum
	 *@return: java.lang.Long  overdueNum
	 */
	public Long getOverdueNum(){
		return this.overdueNum;
	}

	/**
	 *方法: 设置overdueNum
	 *@param: java.lang.Long  overdueNum
	 */
	public void setOverdueNum(Long overdueNum){
		this.overdueNum = overdueNum;
	}

	/**
	 *方法: 获得maxOverdueTimes
	 *@return: java.lang.Long  maxOverdueTimes
	 */
	public Long getMaxOverdueTimes(){
		return this.maxOverdueTimes;
	}

	/**
	 *方法: 设置maxOverdueTimes
	 *@param: java.lang.Long  maxOverdueTimes
	 */
	public void setMaxOverdueTimes(Long maxOverdueTimes){
		this.maxOverdueTimes = maxOverdueTimes;
	}

	/**
	 *方法: 获得maxOverdueAmount
	 *@return: java.lang.Long  maxOverdueAmount
	 */
	public Long getMaxOverdueAmount(){
		return this.maxOverdueAmount;
	}

	/**
	 *方法: 设置maxOverdueAmount
	 *@param: java.lang.Long  maxOverdueAmount
	 */
	public void setMaxOverdueAmount(Long maxOverdueAmount){
		this.maxOverdueAmount = maxOverdueAmount;
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