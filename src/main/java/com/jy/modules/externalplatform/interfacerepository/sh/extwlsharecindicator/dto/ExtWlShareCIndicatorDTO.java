package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecindicator.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话共享报告_信贷信息概要（信用提示）
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 19:53:07
 */
public class ExtWlShareCIndicatorDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**信贷业务类型*/
	private String scredittype;

	/**总笔数*/
	private Long total;

	/**未结清笔数*/
	private Long unSettledTotal;

	/**为他人担保笔数*/
	private Long guaranteeTotal;

	/**征信报告主表ID*/
	private Long fkReportId;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

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
	 *方法: 获得scredittype
	 *@return: java.lang.String  scredittype
	 */
	public String getScredittype(){
		return this.scredittype;
	}

	/**
	 *方法: 设置scredittype
	 *@param: java.lang.String  scredittype
	 */
	public void setScredittype(String scredittype){
		this.scredittype = scredittype;
	}

	/**
	 *方法: 获得total
	 *@return: java.lang.Long  total
	 */
	public Long getTotal(){
		return this.total;
	}

	/**
	 *方法: 设置total
	 *@param: java.lang.Long  total
	 */
	public void setTotal(Long total){
		this.total = total;
	}

	/**
	 *方法: 获得unSettledTotal
	 *@return: java.lang.Long  unSettledTotal
	 */
	public Long getUnSettledTotal(){
		return this.unSettledTotal;
	}

	/**
	 *方法: 设置unSettledTotal
	 *@param: java.lang.Long  unSettledTotal
	 */
	public void setUnSettledTotal(Long unSettledTotal){
		this.unSettledTotal = unSettledTotal;
	}

	/**
	 *方法: 获得guaranteeTotal
	 *@return: java.lang.Long  guaranteeTotal
	 */
	public Long getGuaranteeTotal(){
		return this.guaranteeTotal;
	}

	/**
	 *方法: 设置guaranteeTotal
	 *@param: java.lang.Long  guaranteeTotal
	 */
	public void setGuaranteeTotal(Long guaranteeTotal){
		this.guaranteeTotal = guaranteeTotal;
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

}