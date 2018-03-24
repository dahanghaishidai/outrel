package com.jy.modules.externalplatform.interfacerepository.tx.extwltxriskdetail.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:腾讯_反欺诈服务_风险类型详情
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-18 15:24:26
 */
public class ExtWlTxRiskDetailDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**进件客户关联ID*/
	private Long txFraudId;

	/**风险码*/
	private Long riskCode;

	/**风险详情值*/
	private String riskCodeValue;

	/**数据有效性（1：有效、0：无效）*/
	private String validateState;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private Long createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

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
	 *方法: 获得txFraudId
	 *@return: java.lang.Long  txFraudId
	 */
	public Long getTxFraudId(){
		return this.txFraudId;
	}

	/**
	 *方法: 设置txFraudId
	 *@param: java.lang.Long  txFraudId
	 */
	public void setTxFraudId(Long txFraudId){
		this.txFraudId = txFraudId;
	}

	/**
	 *方法: 获得riskCode
	 *@return: java.lang.Long  riskCode
	 */
	public Long getRiskCode(){
		return this.riskCode;
	}

	/**
	 *方法: 设置riskCode
	 *@param: java.lang.Long  riskCode
	 */
	public void setRiskCode(Long riskCode){
		this.riskCode = riskCode;
	}

	/**
	 *方法: 获得riskCodeValue
	 *@return: java.lang.String  riskCodeValue
	 */
	public String getRiskCodeValue(){
		return this.riskCodeValue;
	}

	/**
	 *方法: 设置riskCodeValue
	 *@param: java.lang.String  riskCodeValue
	 */
	public void setRiskCodeValue(String riskCodeValue){
		this.riskCodeValue = riskCodeValue;
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