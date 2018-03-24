package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcongrscore.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:蜜罐联系人灰度分信息
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-09 17:45:51
 */
public class ExtWlJxlMgConGrScoreDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**蜜罐ID*/
	private String userGridId;

	/**主动联系最亲密联系人的灰度分*/
	private Float mostFamiliarToAll;

	/**被动联系最亲密联系人的灰度分*/
	private Float mostFamiliarBeAll;

	/**互动联系最亲密联系人的灰度分*/
	private Float mostFamiliarAll;

	/**主动联系最亲密申请人的灰度分*/
	private Float mostFamiliarToApplied;

	/**被动联系最亲密申请人的灰度分*/
	private Float mostFamiliarBeApplied;

	/**互动联系最亲密申请人的灰度分*/
	private Float mostFamiliarApplied;

	/**主动联系的联系人的最高灰度分*/
	private Float toMax;

	/**主动联系的联系人的平均灰度分*/
	private Float toMean;

	/**主动联系的联系人的最低灰度分*/
	private Float toMin;

	/**被动联系的联系人的最高灰度分*/
	private Float beMax;

	/**被动联系的联系人的平均灰度分*/
	private Float beMean;

	/**被动联系的联系人的最低灰度分*/
	private Float beMin;

	/**联系人的最高灰度分*/
	private Float max;

	/**联系人的平均灰度分*/
	private Float mean;

	/**联系人的最低灰度分*/
	private Float min;

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
	 *方法: 获得mostFamiliarToAll
	 *@return: java.lang.Float  mostFamiliarToAll
	 */
	public Float getMostFamiliarToAll(){
		return this.mostFamiliarToAll;
	}

	/**
	 *方法: 设置mostFamiliarToAll
	 *@param: java.lang.Float  mostFamiliarToAll
	 */
	public void setMostFamiliarToAll(Float mostFamiliarToAll){
		this.mostFamiliarToAll = mostFamiliarToAll;
	}

	/**
	 *方法: 获得mostFamiliarBeAll
	 *@return: java.lang.Float  mostFamiliarBeAll
	 */
	public Float getMostFamiliarBeAll(){
		return this.mostFamiliarBeAll;
	}

	/**
	 *方法: 设置mostFamiliarBeAll
	 *@param: java.lang.Float  mostFamiliarBeAll
	 */
	public void setMostFamiliarBeAll(Float mostFamiliarBeAll){
		this.mostFamiliarBeAll = mostFamiliarBeAll;
	}

	/**
	 *方法: 获得mostFamiliarAll
	 *@return: java.lang.Float  mostFamiliarAll
	 */
	public Float getMostFamiliarAll(){
		return this.mostFamiliarAll;
	}

	/**
	 *方法: 设置mostFamiliarAll
	 *@param: java.lang.Float  mostFamiliarAll
	 */
	public void setMostFamiliarAll(Float mostFamiliarAll){
		this.mostFamiliarAll = mostFamiliarAll;
	}

	/**
	 *方法: 获得mostFamiliarToApplied
	 *@return: java.lang.Float  mostFamiliarToApplied
	 */
	public Float getMostFamiliarToApplied(){
		return this.mostFamiliarToApplied;
	}

	/**
	 *方法: 设置mostFamiliarToApplied
	 *@param: java.lang.Float  mostFamiliarToApplied
	 */
	public void setMostFamiliarToApplied(Float mostFamiliarToApplied){
		this.mostFamiliarToApplied = mostFamiliarToApplied;
	}

	/**
	 *方法: 获得mostFamiliarBeApplied
	 *@return: java.lang.Float  mostFamiliarBeApplied
	 */
	public Float getMostFamiliarBeApplied(){
		return this.mostFamiliarBeApplied;
	}

	/**
	 *方法: 设置mostFamiliarBeApplied
	 *@param: java.lang.Float  mostFamiliarBeApplied
	 */
	public void setMostFamiliarBeApplied(Float mostFamiliarBeApplied){
		this.mostFamiliarBeApplied = mostFamiliarBeApplied;
	}

	/**
	 *方法: 获得mostFamiliarApplied
	 *@return: java.lang.Float  mostFamiliarApplied
	 */
	public Float getMostFamiliarApplied(){
		return this.mostFamiliarApplied;
	}

	/**
	 *方法: 设置mostFamiliarApplied
	 *@param: java.lang.Float  mostFamiliarApplied
	 */
	public void setMostFamiliarApplied(Float mostFamiliarApplied){
		this.mostFamiliarApplied = mostFamiliarApplied;
	}

	/**
	 *方法: 获得toMax
	 *@return: java.lang.Float  toMax
	 */
	public Float getToMax(){
		return this.toMax;
	}

	/**
	 *方法: 设置toMax
	 *@param: java.lang.Float  toMax
	 */
	public void setToMax(Float toMax){
		this.toMax = toMax;
	}

	/**
	 *方法: 获得toMean
	 *@return: java.lang.Float  toMean
	 */
	public Float getToMean(){
		return this.toMean;
	}

	/**
	 *方法: 设置toMean
	 *@param: java.lang.Float  toMean
	 */
	public void setToMean(Float toMean){
		this.toMean = toMean;
	}

	/**
	 *方法: 获得toMin
	 *@return: java.lang.Float  toMin
	 */
	public Float getToMin(){
		return this.toMin;
	}

	/**
	 *方法: 设置toMin
	 *@param: java.lang.Float  toMin
	 */
	public void setToMin(Float toMin){
		this.toMin = toMin;
	}

	/**
	 *方法: 获得beMax
	 *@return: java.lang.Float  beMax
	 */
	public Float getBeMax(){
		return this.beMax;
	}

	/**
	 *方法: 设置beMax
	 *@param: java.lang.Float  beMax
	 */
	public void setBeMax(Float beMax){
		this.beMax = beMax;
	}

	/**
	 *方法: 获得beMean
	 *@return: java.lang.Float  beMean
	 */
	public Float getBeMean(){
		return this.beMean;
	}

	/**
	 *方法: 设置beMean
	 *@param: java.lang.Float  beMean
	 */
	public void setBeMean(Float beMean){
		this.beMean = beMean;
	}

	/**
	 *方法: 获得beMin
	 *@return: java.lang.Float  beMin
	 */
	public Float getBeMin(){
		return this.beMin;
	}

	/**
	 *方法: 设置beMin
	 *@param: java.lang.Float  beMin
	 */
	public void setBeMin(Float beMin){
		this.beMin = beMin;
	}

	/**
	 *方法: 获得max
	 *@return: java.lang.Float  max
	 */
	public Float getMax(){
		return this.max;
	}

	/**
	 *方法: 设置max
	 *@param: java.lang.Float  max
	 */
	public void setMax(Float max){
		this.max = max;
	}

	/**
	 *方法: 获得mean
	 *@return: java.lang.Float  mean
	 */
	public Float getMean(){
		return this.mean;
	}

	/**
	 *方法: 设置mean
	 *@param: java.lang.Float  mean
	 */
	public void setMean(Float mean){
		this.mean = mean;
	}

	/**
	 *方法: 获得min
	 *@return: java.lang.Float  min
	 */
	public Float getMin(){
		return this.min;
	}

	/**
	 *方法: 设置min
	 *@param: java.lang.Float  min
	 */
	public void setMin(Float min){
		this.min = min;
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