package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacollection.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 * @className: ExtWlFpxaCollectionDTO
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacollection.dto
 * @describe: EXT_WL_FPXA_COLLECTION
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 10:09
 **/
public class ExtWlFpxaCollectionDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**小爱有信基本信息表主键*/
	private Long fkId;

	/**是否存在于催收名单 1:是/2:否*/
	private String existCollection;

	/**被催收案件贷款时间*/
	private String loanTime;

	/**被催收案件逾期金额*/
	private String overdueAmount;

	/**被催收案件逾期月数*/
	private String overdueMonth;

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
	 *方法: 获得existCollection
	 *@return: java.lang.String  existCollection
	 */
	public String getExistCollection(){
		return this.existCollection;
	}

	/**
	 *方法: 设置existCollection
	 *@param: java.lang.String  existCollection
	 */
	public void setExistCollection(String existCollection){
		this.existCollection = existCollection;
	}

	/**
	 *方法: 获得loanTime
	 *@return: java.lang.String  loanTime
	 */
	public String getLoanTime(){
		return this.loanTime;
	}

	/**
	 *方法: 设置loanTime
	 *@param: java.lang.String  loanTime
	 */
	public void setLoanTime(String loanTime){
		this.loanTime = loanTime;
	}

	/**
	 *方法: 获得overdueAmount
	 *@return: java.lang.String  overdueAmount
	 */
	public String getOverdueAmount(){
		return this.overdueAmount;
	}

	/**
	 *方法: 设置overdueAmount
	 *@param: java.lang.String  overdueAmount
	 */
	public void setOverdueAmount(String overdueAmount){
		this.overdueAmount = overdueAmount;
	}

	/**
	 *方法: 获得overdueMonth
	 *@return: java.lang.String  overdueMonth
	 */
	public String getOverdueMonth(){
		return this.overdueMonth;
	}

	/**
	 *方法: 设置overdueMonth
	 *@param: java.lang.String  overdueMonth
	 */
	public void setOverdueMonth(String overdueMonth){
		this.overdueMonth = overdueMonth;
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