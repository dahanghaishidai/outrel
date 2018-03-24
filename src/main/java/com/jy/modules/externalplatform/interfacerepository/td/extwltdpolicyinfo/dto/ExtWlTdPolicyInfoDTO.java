package com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:同盾_TDRC决策引擎信息主表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-20 20:33:23
 */
public class ExtWlTdPolicyInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**提交是否成功
*/
	private String success;

	/**success为false的情况下对应错误码
*/
	private String reasonCode;

	/**本次调用产生的唯一性SequenceID
*/
	private String seqId;

	/**本次调用在服务端的执行时间(毫秒)
*/
	private Long spendTime;

	/**风险决策结果(Accept、Review、Reject三种值)
*/
	private String finalDecision;

	/**风险决策分数(范围1~65535)
*/
	private Long finalScore;

	/**策略集名称
*/
	private String policySetName;

	/**与policy_set中的policy_name内容相同，为了向前兼容
*/
	private String policyName;

	/**风险类型
*/
	private String riskType;

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
	 *方法: 获得success
	 *@return: java.lang.String  success
	 */
	public String getSuccess(){
		return this.success;
	}

	/**
	 *方法: 设置success
	 *@param: java.lang.String  success
	 */
	public void setSuccess(String success){
		this.success = success;
	}

	/**
	 *方法: 获得reasonCode
	 *@return: java.lang.String  reasonCode
	 */
	public String getReasonCode(){
		return this.reasonCode;
	}

	/**
	 *方法: 设置reasonCode
	 *@param: java.lang.String  reasonCode
	 */
	public void setReasonCode(String reasonCode){
		this.reasonCode = reasonCode;
	}

	/**
	 *方法: 获得seqId
	 *@return: java.lang.String  seqId
	 */
	public String getSeqId(){
		return this.seqId;
	}

	/**
	 *方法: 设置seqId
	 *@param: java.lang.String  seqId
	 */
	public void setSeqId(String seqId){
		this.seqId = seqId;
	}

	/**
	 *方法: 获得spendTime
	 *@return: java.lang.Long  spendTime
	 */
	public Long getSpendTime(){
		return this.spendTime;
	}

	/**
	 *方法: 设置spendTime
	 *@param: java.lang.Long  spendTime
	 */
	public void setSpendTime(Long spendTime){
		this.spendTime = spendTime;
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
	 *@return: java.lang.Long  finalScore
	 */
	public Long getFinalScore(){
		return this.finalScore;
	}

	/**
	 *方法: 设置finalScore
	 *@param: java.lang.Long  finalScore
	 */
	public void setFinalScore(Long finalScore){
		this.finalScore = finalScore;
	}

	/**
	 *方法: 获得policySetName
	 *@return: java.lang.String  policySetName
	 */
	public String getPolicySetName(){
		return this.policySetName;
	}

	/**
	 *方法: 设置policySetName
	 *@param: java.lang.String  policySetName
	 */
	public void setPolicySetName(String policySetName){
		this.policySetName = policySetName;
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