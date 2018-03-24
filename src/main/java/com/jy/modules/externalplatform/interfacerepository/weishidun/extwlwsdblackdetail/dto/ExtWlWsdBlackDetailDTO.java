package com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblackdetail.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:维氏盾个人黑名单详细信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-19 20:14:33
 */
public class ExtWlWsdBlackDetailDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**维氏盾个人黑名单主表主键
*/
	private Long fkId;

	/**逾期时间 （天） 0-6 ； 7-29 ； 30-89 ； 90-179  ；180-364  365-1000 ； >1000
*/
	private String overdueDate;

	/**法律状态(未知,已结案,执行中)
*/
	private String legalState;

	/**黑名单类型 (借款违约,失信网名单,人法网名单)
*/
	private String type;

	/**逾期金额 （元）0-500 ； 500-1000 ； 1000-5000  ；5000-10000  ；10000-50000  ；50000-100000  ；>100000
*/
	private String overdueAmount;

	/**数据入库时间 （天）0-6 ； 7-29 ； 30-89 ； 90-179 ； 180-364  ；365-1000 ； >1000
*/
	private String overdueDays;

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
	 *方法: 获得overdueDate
	 *@return: java.lang.String  overdueDate
	 */
	public String getOverdueDate(){
		return this.overdueDate;
	}

	/**
	 *方法: 设置overdueDate
	 *@param: java.lang.String  overdueDate
	 */
	public void setOverdueDate(String overdueDate){
		this.overdueDate = overdueDate;
	}

	/**
	 *方法: 获得legalState
	 *@return: java.lang.String  legalState
	 */
	public String getLegalState(){
		return this.legalState;
	}

	/**
	 *方法: 设置legalState
	 *@param: java.lang.String  legalState
	 */
	public void setLegalState(String legalState){
		this.legalState = legalState;
	}

	/**
	 *方法: 获得type
	 *@return: java.lang.String  type
	 */
	public String getType(){
		return this.type;
	}

	/**
	 *方法: 设置type
	 *@param: java.lang.String  type
	 */
	public void setType(String type){
		this.type = type;
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
	 *方法: 获得overdueDays
	 *@return: java.lang.String  overdueDays
	 */
	public String getOverdueDays(){
		return this.overdueDays;
	}

	/**
	 *方法: 设置overdueDays
	 *@param: java.lang.String  overdueDays
	 */
	public void setOverdueDays(String overdueDays){
		this.overdueDays = overdueDays;
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