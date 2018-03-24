package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconreladist.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:蜜罐联系人分布表
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-09 17:46:08
 */
public class ExtWlJxlMgConReladistDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**蜜罐ID*/
	private String userGridId;

	/**主动联系的亲密联系人数（w>67)*/
	private Long toIsFamiliar;

	/**主动联系的中等亲密联系人数（67>=w>=33)*/
	private Long toMedianFamiliar;

	/**主动联系的非亲密联系人数(w<33)*/
	private Long toNotFamiliar;

	/**被动联系的亲密联系人数（w>67)*/
	private Long beIsFamiliar;

	/**被动联系的中等亲密联系人数（67>=w>=33)*/
	private Long beMedianFamiliar;

	/**被动联系的非亲密联系人数(w<33)*/
	private Long beNotFamiliar;

	/**互动联系的亲密联系人数（w>133)*/
	private Long isFamiliar;

	/**互动联系的中等亲密联系人数（133>=w>=67)*/
	private Long medianFamiliar;

	/**互动联系的非亲密联系人数(w<67)*/
	private Long notFamiliar;

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
	 *方法: 获得toIsFamiliar
	 *@return: java.lang.Long  toIsFamiliar
	 */
	public Long getToIsFamiliar(){
		return this.toIsFamiliar;
	}

	/**
	 *方法: 设置toIsFamiliar
	 *@param: java.lang.Long  toIsFamiliar
	 */
	public void setToIsFamiliar(Long toIsFamiliar){
		this.toIsFamiliar = toIsFamiliar;
	}

	/**
	 *方法: 获得toMedianFamiliar
	 *@return: java.lang.Long  toMedianFamiliar
	 */
	public Long getToMedianFamiliar(){
		return this.toMedianFamiliar;
	}

	/**
	 *方法: 设置toMedianFamiliar
	 *@param: java.lang.Long  toMedianFamiliar
	 */
	public void setToMedianFamiliar(Long toMedianFamiliar){
		this.toMedianFamiliar = toMedianFamiliar;
	}

	/**
	 *方法: 获得toNotFamiliar
	 *@return: java.lang.Long  toNotFamiliar
	 */
	public Long getToNotFamiliar(){
		return this.toNotFamiliar;
	}

	/**
	 *方法: 设置toNotFamiliar
	 *@param: java.lang.Long  toNotFamiliar
	 */
	public void setToNotFamiliar(Long toNotFamiliar){
		this.toNotFamiliar = toNotFamiliar;
	}

	/**
	 *方法: 获得beIsFamiliar
	 *@return: java.lang.Long  beIsFamiliar
	 */
	public Long getBeIsFamiliar(){
		return this.beIsFamiliar;
	}

	/**
	 *方法: 设置beIsFamiliar
	 *@param: java.lang.Long  beIsFamiliar
	 */
	public void setBeIsFamiliar(Long beIsFamiliar){
		this.beIsFamiliar = beIsFamiliar;
	}

	/**
	 *方法: 获得beMedianFamiliar
	 *@return: java.lang.Long  beMedianFamiliar
	 */
	public Long getBeMedianFamiliar(){
		return this.beMedianFamiliar;
	}

	/**
	 *方法: 设置beMedianFamiliar
	 *@param: java.lang.Long  beMedianFamiliar
	 */
	public void setBeMedianFamiliar(Long beMedianFamiliar){
		this.beMedianFamiliar = beMedianFamiliar;
	}

	/**
	 *方法: 获得beNotFamiliar
	 *@return: java.lang.Long  beNotFamiliar
	 */
	public Long getBeNotFamiliar(){
		return this.beNotFamiliar;
	}

	/**
	 *方法: 设置beNotFamiliar
	 *@param: java.lang.Long  beNotFamiliar
	 */
	public void setBeNotFamiliar(Long beNotFamiliar){
		this.beNotFamiliar = beNotFamiliar;
	}

	/**
	 *方法: 获得isFamiliar
	 *@return: java.lang.Long  isFamiliar
	 */
	public Long getIsFamiliar(){
		return this.isFamiliar;
	}

	/**
	 *方法: 设置isFamiliar
	 *@param: java.lang.Long  isFamiliar
	 */
	public void setIsFamiliar(Long isFamiliar){
		this.isFamiliar = isFamiliar;
	}

	/**
	 *方法: 获得medianFamiliar
	 *@return: java.lang.Long  medianFamiliar
	 */
	public Long getMedianFamiliar(){
		return this.medianFamiliar;
	}

	/**
	 *方法: 设置medianFamiliar
	 *@param: java.lang.Long  medianFamiliar
	 */
	public void setMedianFamiliar(Long medianFamiliar){
		this.medianFamiliar = medianFamiliar;
	}

	/**
	 *方法: 获得notFamiliar
	 *@return: java.lang.Long  notFamiliar
	 */
	public Long getNotFamiliar(){
		return this.notFamiliar;
	}

	/**
	 *方法: 设置notFamiliar
	 *@param: java.lang.Long  notFamiliar
	 */
	public void setNotFamiliar(Long notFamiliar){
		this.notFamiliar = notFamiliar;
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