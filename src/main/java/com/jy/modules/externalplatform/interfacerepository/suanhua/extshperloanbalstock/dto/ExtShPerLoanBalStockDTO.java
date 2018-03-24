package com.jy.modules.externalplatform.interfacerepository.suanhua.extshperloanbalstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:人行征信贷款余额信息详列
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-12 14:56:02
 */
public class ExtShPerLoanBalStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**放贷机构*/
	private java.lang.String org;

	/**贷款类型*/
	private java.lang.String type;

	/**放贷总额*/
	private java.lang.String limits;

	/**放贷余额*/
	private java.lang.String balances;

	/**未偿月数*/
	private java.lang.String debtMonths;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**MODIFY_TIME*/
	private java.sql.Timestamp modifyTime;

	/**负债情况表主键*/
	private java.lang.Long fkPersonDebtsId;

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
	 *方法: 获得org
	 *@return: java.lang.String  org
	 */
	public java.lang.String getOrg(){
		return this.org;
	}

	/**
	 *方法: 设置org
	 *@param: java.lang.String  org
	 */
	public void setOrg(java.lang.String org){
		this.org = org;
	}

	/**
	 *方法: 获得type
	 *@return: java.lang.String  type
	 */
	public java.lang.String getType(){
		return this.type;
	}

	/**
	 *方法: 设置type
	 *@param: java.lang.String  type
	 */
	public void setType(java.lang.String type){
		this.type = type;
	}

	/**
	 *方法: 获得limits
	 *@return: java.lang.String  limits
	 */
	public java.lang.String getLimits(){
		return this.limits;
	}

	/**
	 *方法: 设置limits
	 *@param: java.lang.String  limits
	 */
	public void setLimits(java.lang.String limits){
		this.limits = limits;
	}

	/**
	 *方法: 获得balances
	 *@return: java.lang.String  balances
	 */
	public java.lang.String getBalances(){
		return this.balances;
	}

	/**
	 *方法: 设置balances
	 *@param: java.lang.String  balances
	 */
	public void setBalances(java.lang.String balances){
		this.balances = balances;
	}

	/**
	 *方法: 获得debtMonths
	 *@return: java.lang.String  debtMonths
	 */
	public java.lang.String getDebtMonths(){
		return this.debtMonths;
	}

	/**
	 *方法: 设置debtMonths
	 *@param: java.lang.String  debtMonths
	 */
	public void setDebtMonths(java.lang.String debtMonths){
		this.debtMonths = debtMonths;
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
	 *方法: 获得fkPersonDebtsId
	 *@return: java.lang.Long  fkPersonDebtsId
	 */
	public java.lang.Long getFkPersonDebtsId(){
		return this.fkPersonDebtsId;
	}

	/**
	 *方法: 设置fkPersonDebtsId
	 *@param: java.lang.Long  fkPersonDebtsId
	 */
	public void setFkPersonDebtsId(java.lang.Long fkPersonDebtsId){
		this.fkPersonDebtsId = fkPersonDebtsId;
	}

}