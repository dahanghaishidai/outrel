package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxastrategy.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 * @className: ExtWlFpxaStrategyDTO
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxastrategy.dto
 * @describe: EXT_WL_FPXA_STRATEGY
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 10:05
 **/
public class ExtWlFpxaStrategyDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**小爱有信基本信息表主键*/
	private Long fkId;

	/**指标编码*/
	private String ruleCode;

	/**指标名称*/
	private String ruleName;

	/**指标计算结果*/
	private String value;

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
	 *方法: 获得fkId
	 *@return: java.lang.Long  fkId
	 */
	public Long getFkId(){
		return this.fkId;
	}

	/**
	 *方法: 设置fkId
	 *@param: java.lang.Long  fkId
	 */
	public void setFkId(Long fkId){
		this.fkId = fkId;
	}

	/**
	 *方法: 获得ruleCode
	 *@return: java.lang.String  ruleCode
	 */
	public String getRuleCode(){
		return this.ruleCode;
	}

	/**
	 *方法: 设置ruleCode
	 *@param: java.lang.String  ruleCode
	 */
	public void setRuleCode(String ruleCode){
		this.ruleCode = ruleCode;
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
	 *方法: 获得value
	 *@return: java.lang.String  value
	 */
	public String getValue(){
		return this.value;
	}

	/**
	 *方法: 设置value
	 *@param: java.lang.String  value
	 */
	public void setValue(String value){
		this.value = value;
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