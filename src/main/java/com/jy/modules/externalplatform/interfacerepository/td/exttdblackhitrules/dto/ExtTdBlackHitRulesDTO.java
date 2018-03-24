package com.jy.modules.externalplatform.interfacerepository.td.exttdblackhitrules.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:同盾黑名单命中规则明细表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-02 14:56:08
 */
public class ExtTdBlackHitRulesDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**同盾黑名单查询结果主键*/
	private java.lang.Long fkTdBlackResultId;

	/**规则编号*/
	private java.lang.String ruleId;

	/**规则名称*/
	private java.lang.String ruleName;

	/**规则决策结果(Accept/Review/Reject)*/
	private java.lang.String ruleDecision;

	/**规则风险权重,只有在权重模式下有效*/
	private java.lang.String ruleScore;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;
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
	 *方法: 获得fkTdBlackResultId
	 *@return: java.lang.Long  fkTdBlackResultId
	 */
	public java.lang.Long getFkTdBlackResultId(){
		return this.fkTdBlackResultId;
	}

	/**
	 *方法: 设置fkTdBlackResultId
	 *@param: java.lang.Long  fkTdBlackResultId
	 */
	public void setFkTdBlackResultId(java.lang.Long fkTdBlackResultId){
		this.fkTdBlackResultId = fkTdBlackResultId;
	}

	/**
	 *方法: 获得ruleId
	 *@return: java.lang.String  ruleId
	 */
	public java.lang.String getRuleId(){
		return this.ruleId;
	}

	/**
	 *方法: 设置ruleId
	 *@param: java.lang.String  ruleId
	 */
	public void setRuleId(java.lang.String ruleId){
		this.ruleId = ruleId;
	}

	/**
	 *方法: 获得ruleName
	 *@return: java.lang.String  ruleName
	 */
	public java.lang.String getRuleName(){
		return this.ruleName;
	}

	/**
	 *方法: 设置ruleName
	 *@param: java.lang.String  ruleName
	 */
	public void setRuleName(java.lang.String ruleName){
		this.ruleName = ruleName;
	}

	/**
	 *方法: 获得ruleDecision
	 *@return: java.lang.String  ruleDecision
	 */
	public java.lang.String getRuleDecision(){
		return this.ruleDecision;
	}

	/**
	 *方法: 设置ruleDecision
	 *@param: java.lang.String  ruleDecision
	 */
	public void setRuleDecision(java.lang.String ruleDecision){
		this.ruleDecision = ruleDecision;
	}

	/**
	 *方法: 获得ruleScore
	 *@return: java.lang.String  ruleScore
	 */
	public java.lang.String getRuleScore(){
		return this.ruleScore;
	}

	/**
	 *方法: 设置ruleScore
	 *@param: java.lang.String  ruleScore
	 */
	public void setRuleScore(java.lang.String ruleScore){
		this.ruleScore = ruleScore;
	}

	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.sql.Timestamp createTime) {
		this.createTime = createTime;
	}

	public java.sql.Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(java.sql.Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}
	
}