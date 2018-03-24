package com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsstrategyset.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:白骑士反欺诈云风险决策-策略集明细表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-20 11:28:03
 */
public class ExtWlBqsStrategySetDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**关联主表ID*/
	private Long riskDescId;

	/**策略名称*/
	private String strategyName;

	/**策略ID*/
	private String strategyId;

	/**策略决策结果*/
	private String strategyDecision;

	/**策略匹配模式*/
	private String strategyMode;

	/**策略风险系数*/
	private String strategyScore;

	/**权重区间上限系数*/
	private String rejectValue;

	/**权重区间下限系数*/
	private String reviewValue;

	/**策略风险类型*/
	private String riskType;

	/**策略击中话术提示*/
	private String tips;

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
	 *方法: 获得riskDescId
	 *@return: java.lang.Long  riskDescId
	 */
	public Long getRiskDescId(){
		return this.riskDescId;
	}

	/**
	 *方法: 设置riskDescId
	 *@param: java.lang.Long  riskDescId
	 */
	public void setRiskDescId(Long riskDescId){
		this.riskDescId = riskDescId;
	}

	/**
	 *方法: 获得strategyName
	 *@return: java.lang.String  strategyName
	 */
	public String getStrategyName(){
		return this.strategyName;
	}

	/**
	 *方法: 设置strategyName
	 *@param: java.lang.String  strategyName
	 */
	public void setStrategyName(String strategyName){
		this.strategyName = strategyName;
	}

	/**
	 *方法: 获得strategyId
	 *@return: java.lang.String  strategyId
	 */
	public String getStrategyId(){
		return this.strategyId;
	}

	/**
	 *方法: 设置strategyId
	 *@param: java.lang.String  strategyId
	 */
	public void setStrategyId(String strategyId){
		this.strategyId = strategyId;
	}

	/**
	 *方法: 获得strategyDecision
	 *@return: java.lang.String  strategyDecision
	 */
	public String getStrategyDecision(){
		return this.strategyDecision;
	}

	/**
	 *方法: 设置strategyDecision
	 *@param: java.lang.String  strategyDecision
	 */
	public void setStrategyDecision(String strategyDecision){
		this.strategyDecision = strategyDecision;
	}

	/**
	 *方法: 获得strategyMode
	 *@return: java.lang.String  strategyMode
	 */
	public String getStrategyMode(){
		return this.strategyMode;
	}

	/**
	 *方法: 设置strategyMode
	 *@param: java.lang.String  strategyMode
	 */
	public void setStrategyMode(String strategyMode){
		this.strategyMode = strategyMode;
	}

	/**
	 *方法: 获得strategyScore
	 *@return: java.lang.String  strategyScore
	 */
	public String getStrategyScore(){
		return this.strategyScore;
	}

	/**
	 *方法: 设置strategyScore
	 *@param: java.lang.String  strategyScore
	 */
	public void setStrategyScore(String strategyScore){
		this.strategyScore = strategyScore;
	}

	/**
	 *方法: 获得rejectValue
	 *@return: java.lang.String  rejectValue
	 */
	public String getRejectValue(){
		return this.rejectValue;
	}

	/**
	 *方法: 设置rejectValue
	 *@param: java.lang.String  rejectValue
	 */
	public void setRejectValue(String rejectValue){
		this.rejectValue = rejectValue;
	}

	/**
	 *方法: 获得reviewValue
	 *@return: java.lang.String  reviewValue
	 */
	public String getReviewValue(){
		return this.reviewValue;
	}

	/**
	 *方法: 设置reviewValue
	 *@param: java.lang.String  reviewValue
	 */
	public void setReviewValue(String reviewValue){
		this.reviewValue = reviewValue;
	}

	/**
	 *方法: 获得riskType
	 *@return: java.lang.String  riskType
	 */
	public String getRiskType(){
		return this.riskType;
	}

	/**
	 *方法: 设置riskType
	 *@param: java.lang.String  riskType
	 */
	public void setRiskType(String riskType){
		this.riskType = riskType;
	}

	/**
	 *方法: 获得tips
	 *@return: java.lang.String  tips
	 */
	public String getTips(){
		return this.tips;
	}

	/**
	 *方法: 设置tips
	 *@param: java.lang.String  tips
	 */
	public void setTips(String tips){
		this.tips = tips;
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