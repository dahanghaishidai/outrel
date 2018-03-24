package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbdcreditscore.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:百度_PREA信用分
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-19 20:13:38
 */
public class ExtWlBdCreditScoreDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**错误码 0表示成功，非0表示错误*/
	private String retCode;

	/**错误话术 非0错误对应的话术*/
	private String retMsg;

	/**信用分模型*/
	private String models;

	/**信用分值*/
	private String score;

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
	 *方法: 获得retCode
	 *@return: java.lang.String  retCode
	 */
	public String getRetCode(){
		return this.retCode;
	}

	/**
	 *方法: 设置retCode
	 *@param: java.lang.String  retCode
	 */
	public void setRetCode(String retCode){
		this.retCode = retCode;
	}

	/**
	 *方法: 获得retMsg
	 *@return: java.lang.String  retMsg
	 */
	public String getRetMsg(){
		return this.retMsg;
	}

	/**
	 *方法: 设置retMsg
	 *@param: java.lang.String  retMsg
	 */
	public void setRetMsg(String retMsg){
		this.retMsg = retMsg;
	}

	/**
	 *方法: 获得models
	 *@return: java.lang.String  models
	 */
	public String getModels(){
		return this.models;
	}

	/**
	 *方法: 设置models
	 *@param: java.lang.String  models
	 */
	public void setModels(String models){
		this.models = models;
	}

	/**
	 *方法: 获得score
	 *@return: java.lang.String  score
	 */
	public String getScore(){
		return this.score;
	}

	/**
	 *方法: 设置score
	 *@param: java.lang.String  score
	 */
	public void setScore(String score){
		this.score = score;
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