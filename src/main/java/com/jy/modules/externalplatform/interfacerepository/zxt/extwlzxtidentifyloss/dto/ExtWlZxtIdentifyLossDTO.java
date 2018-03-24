package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtidentifyloss.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:身份证挂失信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-18 11:33:56
 */
public class ExtWlZxtIdentifyLossDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**模块查询状态表ID
*/
	private Long moduleFkId;

	/**身份证号
*/
	private String idNo;

	/**姓名
*/
	private String name;

	/**挂失时间
*/
	private String lostDate;

	/**链接
*/
	private String url;

	/**匹配类型  0=模糊匹配，1=精准匹配
*/
	private String matchType;

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
	 *方法: 获得moduleFkId
	 *@return: java.lang.Long  moduleFkId
	 */
	public Long getModuleFkId(){
		return this.moduleFkId;
	}

	/**
	 *方法: 设置moduleFkId
	 *@param: java.lang.Long  moduleFkId
	 */
	public void setModuleFkId(Long moduleFkId){
		this.moduleFkId = moduleFkId;
	}

	/**
	 *方法: 获得idNo
	 *@return: java.lang.String  idNo
	 */
	public String getIdNo(){
		return this.idNo;
	}

	/**
	 *方法: 设置idNo
	 *@param: java.lang.String  idNo
	 */
	public void setIdNo(String idNo){
		this.idNo = idNo;
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
	 *方法: 获得lostDate
	 *@return: java.lang.String  lostDate
	 */
	public String getLostDate(){
		return this.lostDate;
	}

	/**
	 *方法: 设置lostDate
	 *@param: java.lang.String  lostDate
	 */
	public void setLostDate(String lostDate){
		this.lostDate = lostDate;
	}

	/**
	 *方法: 获得url
	 *@return: java.lang.String  url
	 */
	public String getUrl(){
		return this.url;
	}

	/**
	 *方法: 设置url
	 *@param: java.lang.String  url
	 */
	public void setUrl(String url){
		this.url = url;
	}

	/**
	 *方法: 获得matchType
	 *@return: java.lang.String  matchType
	 */
	public String getMatchType(){
		return this.matchType;
	}

	/**
	 *方法: 设置matchType
	 *@param: java.lang.String  matchType
	 */
	public void setMatchType(String matchType){
		this.matchType = matchType;
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