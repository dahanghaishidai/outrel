package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontclosest.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:蜜罐与联系人的最大亲密度表
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-09 17:45:04
 */
public class ExtWlJxlMgContClosestDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**蜜罐ID*/
	private String userGridId;

	/**与所有联系人的最大主动联系亲密度，取值(0, 100)*/
	private Float weightToAll;

	/**与所有联系人的最大被动联系亲密度，取值(0, 100)*/
	private Float weightBeAll;

	/**与所有联系人的最大互动联系亲密度，主被动亲密度相加，取值(0, 200)*/
	private Float weightAll;

	/**与黑号的最大主动联系亲密度，取值(0, 100)*/
	private Float weightToBlack;

	/**与黑号的最大被动联系亲密度，取值(0, 100)*/
	private Float weightBeBlack;

	/**与黑号的最大互动联系亲密度，主被动亲密度相加，取值(0, 200)*/
	private Float weightBlack;

	/**与申请人的最大主动联系亲密度，取值(0, 100)*/
	private Float weightToApplied;

	/**与申请人的最大被动联系亲密度，取值(0, 100)*/
	private Float weightBeApplied;

	/**与申请人的最大互动联系亲密度，主被动亲密度相加，取值(0, 200)*/
	private Float weightApplied;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private Long createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**修改人*/
	private Long modifyBy;

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
	 *方法: 获得userGridId
	 *@return: java.lang.String  userGridId
	 */
	public String getUserGridId(){
		return this.userGridId;
	}

	/**
	 *方法: 设置userGridId
	 *@param: java.lang.String  userGridId
	 */
	public void setUserGridId(String userGridId){
		this.userGridId = userGridId;
	}

	/**
	 *方法: 获得weightToAll
	 *@return: java.lang.Float  weightToAll
	 */
	public Float getWeightToAll(){
		return this.weightToAll;
	}

	/**
	 *方法: 设置weightToAll
	 *@param: java.lang.Float  weightToAll
	 */
	public void setWeightToAll(Float weightToAll){
		this.weightToAll = weightToAll;
	}

	/**
	 *方法: 获得weightBeAll
	 *@return: java.lang.Float  weightBeAll
	 */
	public Float getWeightBeAll(){
		return this.weightBeAll;
	}

	/**
	 *方法: 设置weightBeAll
	 *@param: java.lang.Float  weightBeAll
	 */
	public void setWeightBeAll(Float weightBeAll){
		this.weightBeAll = weightBeAll;
	}

	/**
	 *方法: 获得weightAll
	 *@return: java.lang.Float  weightAll
	 */
	public Float getWeightAll(){
		return this.weightAll;
	}

	/**
	 *方法: 设置weightAll
	 *@param: java.lang.Float  weightAll
	 */
	public void setWeightAll(Float weightAll){
		this.weightAll = weightAll;
	}

	/**
	 *方法: 获得weightToBlack
	 *@return: java.lang.Float  weightToBlack
	 */
	public Float getWeightToBlack(){
		return this.weightToBlack;
	}

	/**
	 *方法: 设置weightToBlack
	 *@param: java.lang.Float  weightToBlack
	 */
	public void setWeightToBlack(Float weightToBlack){
		this.weightToBlack = weightToBlack;
	}

	/**
	 *方法: 获得weightBeBlack
	 *@return: java.lang.Float  weightBeBlack
	 */
	public Float getWeightBeBlack(){
		return this.weightBeBlack;
	}

	/**
	 *方法: 设置weightBeBlack
	 *@param: java.lang.Float  weightBeBlack
	 */
	public void setWeightBeBlack(Float weightBeBlack){
		this.weightBeBlack = weightBeBlack;
	}

	/**
	 *方法: 获得weightBlack
	 *@return: java.lang.Float  weightBlack
	 */
	public Float getWeightBlack(){
		return this.weightBlack;
	}

	/**
	 *方法: 设置weightBlack
	 *@param: java.lang.Float  weightBlack
	 */
	public void setWeightBlack(Float weightBlack){
		this.weightBlack = weightBlack;
	}

	/**
	 *方法: 获得weightToApplied
	 *@return: java.lang.Float  weightToApplied
	 */
	public Float getWeightToApplied(){
		return this.weightToApplied;
	}

	/**
	 *方法: 设置weightToApplied
	 *@param: java.lang.Float  weightToApplied
	 */
	public void setWeightToApplied(Float weightToApplied){
		this.weightToApplied = weightToApplied;
	}

	/**
	 *方法: 获得weightBeApplied
	 *@return: java.lang.Float  weightBeApplied
	 */
	public Float getWeightBeApplied(){
		return this.weightBeApplied;
	}

	/**
	 *方法: 设置weightBeApplied
	 *@param: java.lang.Float  weightBeApplied
	 */
	public void setWeightBeApplied(Float weightBeApplied){
		this.weightBeApplied = weightBeApplied;
	}

	/**
	 *方法: 获得weightApplied
	 *@return: java.lang.Float  weightApplied
	 */
	public Float getWeightApplied(){
		return this.weightApplied;
	}

	/**
	 *方法: 设置weightApplied
	 *@param: java.lang.Float  weightApplied
	 */
	public void setWeightApplied(Float weightApplied){
		this.weightApplied = weightApplied;
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
	 *方法: 获得modifyBy
	 *@return: java.lang.Long  modifyBy
	 */
	public Long getModifyBy(){
		return this.modifyBy;
	}

	/**
	 *方法: 设置modifyBy
	 *@param: java.lang.Long  modifyBy
	 */
	public void setModifyBy(Long modifyBy){
		this.modifyBy = modifyBy;
	}

}