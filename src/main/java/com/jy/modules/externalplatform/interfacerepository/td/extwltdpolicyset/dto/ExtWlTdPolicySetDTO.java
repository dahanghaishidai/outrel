package com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyset.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:同盾_TDRC决策引擎命中策略集表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-20 20:33:32
 */
public class ExtWlTdPolicySetDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**同盾_TDRC决策引擎信息主表主键
*/
	private Long fkPolicyId;

	/**风险决策结果
*/
	private String policyDecision;

	/**风险类型
*/
	private String riskType;

	/**策略模式
*/
	private String policyMode;

	/**策略名称
*/
	private String policyName;

	/**策略分数
*/
	private Long policyScore;

	/**策略UUID
*/
	private String policyUuid;

	/**创建时间
*/
	private java.sql.Timestamp createTime;

	/**修改时间
*/
	private java.sql.Timestamp updateTime;

	/**创建人
*/
	private Long createBy;

	/**修改人
*/
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
	 *方法: 获得fkPolicyId
	 *@return: java.lang.Long  fkPolicyId
	 */
	public Long getFkPolicyId(){
		return this.fkPolicyId;
	}

	/**
	 *方法: 设置fkPolicyId
	 *@param: java.lang.Long  fkPolicyId
	 */
	public void setFkPolicyId(Long fkPolicyId){
		this.fkPolicyId = fkPolicyId;
	}

	/**
	 *方法: 获得policyDecision
	 *@return: java.lang.String  policyDecision
	 */
	public String getPolicyDecision(){
		return this.policyDecision;
	}

	/**
	 *方法: 设置policyDecision
	 *@param: java.lang.String  policyDecision
	 */
	public void setPolicyDecision(String policyDecision){
		this.policyDecision = policyDecision;
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
	 *方法: 获得policyMode
	 *@return: java.lang.String  policyMode
	 */
	public String getPolicyMode(){
		return this.policyMode;
	}

	/**
	 *方法: 设置policyMode
	 *@param: java.lang.String  policyMode
	 */
	public void setPolicyMode(String policyMode){
		this.policyMode = policyMode;
	}

	/**
	 *方法: 获得policyName
	 *@return: java.lang.String  policyName
	 */
	public String getPolicyName(){
		return this.policyName;
	}

	/**
	 *方法: 设置policyName
	 *@param: java.lang.String  policyName
	 */
	public void setPolicyName(String policyName){
		this.policyName = policyName;
	}

	/**
	 *方法: 获得policyScore
	 *@return: java.lang.Long  policyScore
	 */
	public Long getPolicyScore(){
		return this.policyScore;
	}

	/**
	 *方法: 设置policyScore
	 *@param: java.lang.Long  policyScore
	 */
	public void setPolicyScore(Long policyScore){
		this.policyScore = policyScore;
	}

	/**
	 *方法: 获得policyUuid
	 *@return: java.lang.String  policyUuid
	 */
	public String getPolicyUuid(){
		return this.policyUuid;
	}

	/**
	 *方法: 设置policyUuid
	 *@param: java.lang.String  policyUuid
	 */
	public void setPolicyUuid(String policyUuid){
		this.policyUuid = policyUuid;
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