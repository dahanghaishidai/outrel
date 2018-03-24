package com.jy.modules.externalplatform.interfacerepository.sh.extwlshareguarantees.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话共享报告_对外担保信息明细
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-08 11:03:18
 */
public class ExtWlShareGuaranteesDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**发放机构*/
	private String orgCode;

	/**担保贷款合同金额*/
	private Long creditLimit;

	/**担保贷款发放日期*/
	private String dateOpened;

	/**担保贷款到期日期*/
	private String dateClosed;

	/**担保金额*/
	private Long occurSum;

	/**担保状态*/
	private String guaranteeType;

	/**总负债*/
	private Long balance;

	/**信息更新日*/
	private String updateDate;

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
	 *方法: 获得dateClosed
	 *@return: java.lang.String  dateClosed
	 */
	public String getDateClosed(){
		return this.dateClosed;
	}

	/**
	 *方法: 设置dateClosed
	 *@param: java.lang.String  dateClosed
	 */
	public void setDateClosed(String dateClosed){
		this.dateClosed = dateClosed;
	}

	/**
	 *方法: 获得occurSum
	 *@return: java.lang.Long  occurSum
	 */
	public Long getOccurSum(){
		return this.occurSum;
	}

	/**
	 *方法: 设置occurSum
	 *@param: java.lang.Long  occurSum
	 */
	public void setOccurSum(Long occurSum){
		this.occurSum = occurSum;
	}

	/**
	 *方法: 获得guaranteeType
	 *@return: java.lang.String  guaranteeType
	 */
	public String getGuaranteeType(){
		return this.guaranteeType;
	}

	/**
	 *方法: 设置guaranteeType
	 *@param: java.lang.String  guaranteeType
	 */
	public void setGuaranteeType(String guaranteeType){
		this.guaranteeType = guaranteeType;
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
	 *方法: 获得updateDate
	 *@return: java.lang.String  updateDate
	 */
	public String getUpdateDate(){
		return this.updateDate;
	}

	/**
	 *方法: 设置updateDate
	 *@param: java.lang.String  updateDate
	 */
	public void setUpdateDate(String updateDate){
		this.updateDate = updateDate;
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