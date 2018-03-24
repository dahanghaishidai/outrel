package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecdebtinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话共享报告_信贷信息概要（授信及负债信息概要）
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 19:53:17
 */
public class ExtWlShareCDebtinfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**业务类型模块 （unSettled-未结清  guarantee-对外保证汇总）*/
	private String scerttypeModule;

	/**业务类型*/
	private String scerttype;

	/**机构数*/
	private Long orgNum;

	/**笔数*/
	private Long total;

	/**合同金额*/
	private Long creditLimit;

	/**总负债*/
	private Long balance;

	/**最近6个月平均还款*/
	private Long averagePay;

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
	 *方法: 获得scerttypeModule
	 *@return: java.lang.String  scerttypeModule
	 */
	public String getScerttypeModule(){
		return this.scerttypeModule;
	}

	/**
	 *方法: 设置scerttypeModule
	 *@param: java.lang.String  scerttypeModule
	 */
	public void setScerttypeModule(String scerttypeModule){
		this.scerttypeModule = scerttypeModule;
	}

	/**
	 *方法: 获得scerttype
	 *@return: java.lang.String  scerttype
	 */
	public String getScerttype(){
		return this.scerttype;
	}

	/**
	 *方法: 设置scerttype
	 *@param: java.lang.String  scerttype
	 */
	public void setScerttype(String scerttype){
		this.scerttype = scerttype;
	}

	/**
	 *方法: 获得orgNum
	 *@return: java.lang.Long  orgNum
	 */
	public Long getOrgNum(){
		return this.orgNum;
	}

	/**
	 *方法: 设置orgNum
	 *@param: java.lang.Long  orgNum
	 */
	public void setOrgNum(Long orgNum){
		this.orgNum = orgNum;
	}

	/**
	 *方法: 获得total
	 *@return: java.lang.Long  total
	 */
	public Long getTotal(){
		return this.total;
	}

	/**
	 *方法: 设置total
	 *@param: java.lang.Long  total
	 */
	public void setTotal(Long total){
		this.total = total;
	}

	/**
	 *方法: 获得creditLimit
	 *@return: java.lang.Long  creditLimit
	 */
	public Long getCreditLimit(){
		return this.creditLimit;
	}

	/**
	 *方法: 设置creditLimit
	 *@param: java.lang.Long  creditLimit
	 */
	public void setCreditLimit(Long creditLimit){
		this.creditLimit = creditLimit;
	}

	/**
	 *方法: 获得balance
	 *@return: java.lang.Long  balance
	 */
	public Long getBalance(){
		return this.balance;
	}

	/**
	 *方法: 设置balance
	 *@param: java.lang.Long  balance
	 */
	public void setBalance(Long balance){
		this.balance = balance;
	}

	/**
	 *方法: 获得averagePay
	 *@return: java.lang.Long  averagePay
	 */
	public Long getAveragePay(){
		return this.averagePay;
	}

	/**
	 *方法: 设置averagePay
	 *@param: java.lang.Long  averagePay
	 */
	public void setAveragePay(Long averagePay){
		this.averagePay = averagePay;
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