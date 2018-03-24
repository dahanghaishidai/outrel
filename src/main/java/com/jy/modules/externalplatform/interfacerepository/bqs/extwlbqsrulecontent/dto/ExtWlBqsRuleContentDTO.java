package com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsrulecontent.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:白骑士反欺诈云风险决策-规则内容表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-20 11:28:22
 */
public class ExtWlBqsRuleContentDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**关联策略集明细表ID*/
	private Long strategySetId;

	/**规则名称*/
	private String ruleName;

	/**规则ID*/
	private String ruleId;

	/**规则风险系数*/
	private String score;

	/**规则决策结果*/
	private String decision;

	/**规则击中信息备注*/
	private String memo;

	/**模版类型*/
	private String templateType;

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
	 *方法: 获得strategySetId
	 *@return: java.lang.Long  strategySetId
	 */
	public Long getStrategySetId(){
		return this.strategySetId;
	}

	/**
	 *方法: 设置strategySetId
	 *@param: java.lang.Long  strategySetId
	 */
	public void setStrategySetId(Long strategySetId){
		this.strategySetId = strategySetId;
	}

	/**
	 *方法: 获得ruleName
	 *@return: java.lang.String  ruleName
	 */
	public String getRuleName(){
		return this.ruleName;
	}

	/**
	 *方法: 设置ruleName
	 *@param: java.lang.String  ruleName
	 */
	public void setRuleName(String ruleName){
		this.ruleName = ruleName;
	}

	/**
	 *方法: 获得ruleId
	 *@return: java.lang.String  ruleId
	 */
	public String getRuleId(){
		return this.ruleId;
	}

	/**
	 *方法: 设置ruleId
	 *@param: java.lang.String  ruleId
	 */
	public void setRuleId(String ruleId){
		this.ruleId = ruleId;
	}

	/**
	 *方法: 获得score
	 *@return: java.lang.String  score
	 */
	public String getScore(){
		return this.score;
	}

	/**
	 *方法: 设置score
	 *@param: java.lang.String  score
	 */
	public void setScore(String score){
		this.score = score;
	}

	/**
	 *方法: 获得decision
	 *@return: java.lang.String  decision
	 */
	public String getDecision(){
		return this.decision;
	}

	/**
	 *方法: 设置decision
	 *@param: java.lang.String  decision
	 */
	public void setDecision(String decision){
		this.decision = decision;
	}

	/**
	 *方法: 获得memo
	 *@return: java.lang.String  memo
	 */
	public String getMemo(){
		return this.memo;
	}

	/**
	 *方法: 设置memo
	 *@param: java.lang.String  memo
	 */
	public void setMemo(String memo){
		this.memo = memo;
	}

	/**
	 *方法: 获得templateType
	 *@return: java.lang.String  templateType
	 */
	public String getTemplateType(){
		return this.templateType;
	}

	/**
	 *方法: 设置templateType
	 *@param: java.lang.String  templateType
	 */
	public void setTemplateType(String templateType){
		this.templateType = templateType;
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