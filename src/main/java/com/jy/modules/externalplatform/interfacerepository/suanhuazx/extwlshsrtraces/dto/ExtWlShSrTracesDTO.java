package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtraces.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行结构化版(查询记录表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:57:13
 */
public class ExtWlShSrTracesDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**信息详情*/
	private String original;

	/**查询日期*/
	private String queryTime;

	/**查询操作员*/
	private String queryOperator;

	/**查询原因*/
	private String queryReason;

	/**是否失败(0-成功;1-失败)*/
	private String isfail;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**征信主表ID*/
	private Long fkReportId;

	/**数据有效性*/
	private String validateState;

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
	 *方法: 获得original
	 *@return: java.lang.String  original
	 */
	public String getOriginal(){
		return this.original;
	}

	/**
	 *方法: 设置original
	 *@param: java.lang.String  original
	 */
	public void setOriginal(String original){
		this.original = original;
	}

	/**
	 *方法: 获得queryTime
	 *@return: java.lang.String  queryTime
	 */
	public String getQueryTime(){
		return this.queryTime;
	}

	/**
	 *方法: 设置queryTime
	 *@param: java.lang.String  queryTime
	 */
	public void setQueryTime(String queryTime){
		this.queryTime = queryTime;
	}

	/**
	 *方法: 获得queryOperator
	 *@return: java.lang.String  queryOperator
	 */
	public String getQueryOperator(){
		return this.queryOperator;
	}

	/**
	 *方法: 设置queryOperator
	 *@param: java.lang.String  queryOperator
	 */
	public void setQueryOperator(String queryOperator){
		this.queryOperator = queryOperator;
	}

	/**
	 *方法: 获得queryReason
	 *@return: java.lang.String  queryReason
	 */
	public String getQueryReason(){
		return this.queryReason;
	}

	/**
	 *方法: 设置queryReason
	 *@param: java.lang.String  queryReason
	 */
	public void setQueryReason(String queryReason){
		this.queryReason = queryReason;
	}

	/**
	 *方法: 获得isfail
	 *@return: java.lang.String  isfail
	 */
	public String getIsfail(){
		return this.isfail;
	}

	/**
	 *方法: 设置isfail
	 *@param: java.lang.String  isfail
	 */
	public void setIsfail(String isfail){
		this.isfail = isfail;
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
	 *方法: 获得fkReportId
	 *@return: java.lang.Long  fkReportId
	 */
	public Long getFkReportId(){
		return this.fkReportId;
	}

	/**
	 *方法: 设置fkReportId
	 *@param: java.lang.Long  fkReportId
	 */
	public void setFkReportId(Long fkReportId){
		this.fkReportId = fkReportId;
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