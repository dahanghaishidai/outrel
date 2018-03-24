package com.jy.modules.externalplatform.interfacerepository.td.extwltdhitrules.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 * @className: ExtWlTdHitRulesDTO
 * @package: com.jy.modules.externalplatform.interfacerepository.td.extwltdhitrules.dto
 * @describe: 同盾_TDRC决策引擎命中规则详情表
 * @auther: huangxianchao
 * @date: 2018/1/25 0025
 * @time: 上午 10:36
 **/
public class ExtWlTdHitRulesDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**同盾_TDRC决策引擎信息主表主键
*/
	private Long fkPolicyId;

	/**规则Id
*/
	private String retId;

	/**父规则uuid
*/
	private String parentUuid;

	/**规则名称
*/
	private String name;

	/**规则分数
*/
	private Long score;

	/**UUID*/
	private String uuid;

	/**决策结果
*/
	private String decision;

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

	//关联命中策略集表
	private Long fkPoSetId;
	//标识 区分同盾_TDRC决策引擎信息主表 和 命中策略集表
	private String hitPolicy;

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
	 *方法: 获得retId
	 *@return: java.lang.String  retId
	 */
	public String getRetId(){
		return this.retId;
	}

	/**
	 *方法: 设置retId
	 *@param: java.lang.String  retId
	 */
	public void setRetId(String retId){
		this.retId = retId;
	}

	/**
	 *方法: 获得parentUuid
	 *@return: java.lang.String  parentUuid
	 */
	public String getParentUuid(){
		return this.parentUuid;
	}

	/**
	 *方法: 设置parentUuid
	 *@param: java.lang.String  parentUuid
	 */
	public void setParentUuid(String parentUuid){
		this.parentUuid = parentUuid;
	}

	/**
	 *方法: 获得name
	 *@return: java.lang.String  name
	 */
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置name
	 *@param: java.lang.String  name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 *方法: 获得score
	 *@return: java.lang.Long  score
	 */
	public Long getScore(){
		return this.score;
	}

	/**
	 *方法: 设置score
	 *@param: java.lang.Long  score
	 */
	public void setScore(Long score){
		this.score = score;
	}

	/**
	 *方法: 获得uuid
	 *@return: java.lang.String  uuid
	 */
	public String getUuid(){
		return this.uuid;
	}

	/**
	 *方法: 设置uuid
	 *@param: java.lang.String  uuid
	 */
	public void setUuid(String uuid){
		this.uuid = uuid;
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

    public Long getFkPoSetId() {
        return fkPoSetId;
    }

    public void setFkPoSetId(Long fkPoSetId) {
        this.fkPoSetId = fkPoSetId;
    }

    public String getHitPolicy() {
        return hitPolicy;
    }

    public void setHitPolicy(String hitPolicy) {
        this.hitPolicy = hitPolicy;
    }
}