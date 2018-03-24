package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecremote.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话共享报告_信贷信息概要（长期未更新信贷信息概要）
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 19:53:22
 */
public class ExtWlShareCRemoteDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**未结清总笔数*/
	private Long unSettledNum;

	/**未结清总负债*/
	private Long unSettledBalance;

	/**代偿总笔数*/
	private Long guaranteeNum;

	/**代偿总负债*/
	private Long guaranteeBalance;

	/**对外担保总笔数*/
	private Long agentNum;

	/**对外担保总总负债*/
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
	 *方法: 获得unSettledNum
	 *@return: java.lang.Long  unSettledNum
	 */
	public Long getUnSettledNum(){
		return this.unSettledNum;
	}

	/**
	 *方法: 设置unSettledNum
	 *@param: java.lang.Long  unSettledNum
	 */
	public void setUnSettledNum(Long unSettledNum){
		this.unSettledNum = unSettledNum;
	}

	/**
	 *方法: 获得unSettledBalance
	 *@return: java.lang.Long  unSettledBalance
	 */
	public Long getUnSettledBalance(){
		return this.unSettledBalance;
	}

	/**
	 *方法: 设置unSettledBalance
	 *@param: java.lang.Long  unSettledBalance
	 */
	public void setUnSettledBalance(Long unSettledBalance){
		this.unSettledBalance = unSettledBalance;
	}

	/**
	 *方法: 获得guaranteeNum
	 *@return: java.lang.Long  guaranteeNum
	 */
	public Long getGuaranteeNum(){
		return this.guaranteeNum;
	}

	/**
	 *方法: 设置guaranteeNum
	 *@param: java.lang.Long  guaranteeNum
	 */
	public void setGuaranteeNum(Long guaranteeNum){
		this.guaranteeNum = guaranteeNum;
	}

	/**
	 *方法: 获得guaranteeBalance
	 *@return: java.lang.Long  guaranteeBalance
	 */
	public Long getGuaranteeBalance(){
		return this.guaranteeBalance;
	}

	/**
	 *方法: 设置guaranteeBalance
	 *@param: java.lang.Long  guaranteeBalance
	 */
	public void setGuaranteeBalance(Long guaranteeBalance){
		this.guaranteeBalance = guaranteeBalance;
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