package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonloanbala.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:人行征信贷款余额信息详列
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:48:25
 */
public class ExtWlShPersonLoanBalaDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**放贷机构*/
	private String org;

	/**贷款类型*/
	private String type;

	/**放贷总额*/
	private String amts;

	/**放贷余额*/
	private String balances;

	/**未偿月数*/
	private String debtMonths;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**负债情况表主键*/
	private Long fkPersonDebtsId;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**数据有效性*/
	private String validateState;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long updateBy;

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
	 *方法: 获得org
	 *@return: java.lang.String  org
	 */
	public String getOrg(){
		return this.org;
	}

	/**
	 *方法: 设置org
	 *@param: java.lang.String  org
	 */
	public void setOrg(String org){
		this.org = org;
	}

	/**
	 *方法: 获得type
	 *@return: java.lang.String  type
	 */
	public String getType(){
		return this.type;
	}

	/**
	 *方法: 设置type
	 *@param: java.lang.String  type
	 */
	public void setType(String type){
		this.type = type;
	}

	public String getAmts() {
		return amts;
	}

	public void setAmts(String amts) {
		this.amts = amts;
	}

	/**
	 *方法: 获得balances
	 *@return: java.lang.String  balances
	 */
	public String getBalances(){
		return this.balances;
	}

	/**
	 *方法: 设置balances
	 *@param: java.lang.String  balances
	 */
	public void setBalances(String balances){
		this.balances = balances;
	}

	/**
	 *方法: 获得debtMonths
	 *@return: java.lang.String  debtMonths
	 */
	public String getDebtMonths(){
		return this.debtMonths;
	}

	/**
	 *方法: 设置debtMonths
	 *@param: java.lang.String  debtMonths
	 */
	public void setDebtMonths(String debtMonths){
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
	 *方法: 获得fkPersonDebtsId
	 *@return: java.lang.Long  fkPersonDebtsId
	 */
	public Long getFkPersonDebtsId(){
		return this.fkPersonDebtsId;
	}

	/**
	 *方法: 设置fkPersonDebtsId
	 *@param: java.lang.Long  fkPersonDebtsId
	 */
	public void setFkPersonDebtsId(Long fkPersonDebtsId){
		this.fkPersonDebtsId = fkPersonDebtsId;
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
	 *方法: 获得validateState
	 *@return: java.lang.String  validateState
	 */
	public String getValidateState(){
		return this.validateState;
	}

	/**
	 *方法: 设置validateState
	 *@param: java.lang.String  validateState
	 */
	public void setValidateState(String validateState){
		this.validateState = validateState;
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
	 *方法: 获得updateBy
	 *@return: java.lang.Long  updateBy
	 */
	public Long getUpdateBy(){
		return this.updateBy;
	}

	/**
	 *方法: 设置updateBy
	 *@param: java.lang.Long  updateBy
	 */
	public void setUpdateBy(Long updateBy){
		this.updateBy = updateBy;
	}

}