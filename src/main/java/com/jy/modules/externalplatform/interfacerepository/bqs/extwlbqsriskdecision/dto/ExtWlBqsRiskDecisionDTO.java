package com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsriskdecision.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:白骑士反欺诈云风险决策（主表）
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-20 11:27:23
 */
public class ExtWlBqsRiskDecisionDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**进件客户关联ID*/
	private Long intoCustRefId;

	/**结果码*/
	private String resultCode;

	/**结果描述*/
	private String resultDesc;

	/**本次请求的流水号，用于事后案件调查*/
	private String flowNo;

	/**决策结果码*/
	private String finalDecision;

	/**最终风险系数*/
	private String finalScore;

	/**数据有效性（1：有效、0：无效）*/
	private String validateState;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp updateTime;

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
	 *方法: 获得intoCustRefId
	 *@return: java.lang.Long  intoCustRefId
	 */
	public Long getIntoCustRefId(){
		return this.intoCustRefId;
	}

	/**
	 *方法: 设置intoCustRefId
	 *@param: java.lang.Long  intoCustRefId
	 */
	public void setIntoCustRefId(Long intoCustRefId){
		this.intoCustRefId = intoCustRefId;
	}

	/**
	 *方法: 获得resultCode
	 *@return: java.lang.String  resultCode
	 */
	public String getResultCode(){
		return this.resultCode;
	}

	/**
	 *方法: 设置resultCode
	 *@param: java.lang.String  resultCode
	 */
	public void setResultCode(String resultCode){
		this.resultCode = resultCode;
	}

	/**
	 *方法: 获得resultDesc
	 *@return: java.lang.String  resultDesc
	 */
	public String getResultDesc(){
		return this.resultDesc;
	}

	/**
	 *方法: 设置resultDesc
	 *@param: java.lang.String  resultDesc
	 */
	public void setResultDesc(String resultDesc){
		this.resultDesc = resultDesc;
	}

	/**
	 *方法: 获得flowNo
	 *@return: java.lang.String  flowNo
	 */
	public String getFlowNo(){
		return this.flowNo;
	}

	/**
	 *方法: 设置flowNo
	 *@param: java.lang.String  flowNo
	 */
	public void setFlowNo(String flowNo){
		this.flowNo = flowNo;
	}

	/**
	 *方法: 获得finalDecision
	 *@return: java.lang.String  finalDecision
	 */
	public String getFinalDecision(){
		return this.finalDecision;
	}

	/**
	 *方法: 设置finalDecision
	 *@param: java.lang.String  finalDecision
	 */
	public void setFinalDecision(String finalDecision){
		this.finalDecision = finalDecision;
	}

	/**
	 *方法: 获得finalScore
	 *@return: java.lang.String  finalScore
	 */
	public String getFinalScore(){
		return this.finalScore;
	}

	/**
	 *方法: 设置finalScore
	 *@param: java.lang.String  finalScore
	 */
	public void setFinalScore(String finalScore){
		this.finalScore = finalScore;
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
	 *方法: 获得updateTime
	 *@return: java.sql.Timestamp  updateTime
	 */
	public java.sql.Timestamp getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置updateTime
	 *@param: java.sql.Timestamp  updateTime
	 */
	public void setUpdateTime(java.sql.Timestamp updateTime){
		this.updateTime = updateTime;
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