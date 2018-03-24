package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconsulabel.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:蜜罐消费标签信息
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-09 17:47:24
 */
public class ExtWlJxlMgConsuLabelDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**蜜罐ID*/
	private String userGridId;

	/**是否有信用卡*/
	private Long ifOwnCc;

	/**是否有白金卡*/
	private Long ownWgCc;

	/**是否有车*/
	private Long ifOwnCar;

	/**是否购买保险产品*/
	private Long ifPayIns;

	/**是否购买理财产品*/
	private Long ifFinBuyPre6;

	/**消费能力指数*/
	private Long cstScoreFinally;

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
	 *方法: 获得ifOwnCc
	 *@return: java.lang.Long  ifOwnCc
	 */
	public Long getIfOwnCc(){
		return this.ifOwnCc;
	}

	/**
	 *方法: 设置ifOwnCc
	 *@param: java.lang.Long  ifOwnCc
	 */
	public void setIfOwnCc(Long ifOwnCc){
		this.ifOwnCc = ifOwnCc;
	}

	/**
	 *方法: 获得ownWgCc
	 *@return: java.lang.Long  ownWgCc
	 */
	public Long getOwnWgCc(){
		return this.ownWgCc;
	}

	/**
	 *方法: 设置ownWgCc
	 *@param: java.lang.Long  ownWgCc
	 */
	public void setOwnWgCc(Long ownWgCc){
		this.ownWgCc = ownWgCc;
	}

	/**
	 *方法: 获得ifOwnCar
	 *@return: java.lang.Long  ifOwnCar
	 */
	public Long getIfOwnCar(){
		return this.ifOwnCar;
	}

	/**
	 *方法: 设置ifOwnCar
	 *@param: java.lang.Long  ifOwnCar
	 */
	public void setIfOwnCar(Long ifOwnCar){
		this.ifOwnCar = ifOwnCar;
	}

	/**
	 *方法: 获得ifPayIns
	 *@return: java.lang.Long  ifPayIns
	 */
	public Long getIfPayIns(){
		return this.ifPayIns;
	}

	/**
	 *方法: 设置ifPayIns
	 *@param: java.lang.Long  ifPayIns
	 */
	public void setIfPayIns(Long ifPayIns){
		this.ifPayIns = ifPayIns;
	}

	/**
	 *方法: 获得ifFinBuyPre6
	 *@return: java.lang.Long  ifFinBuyPre6
	 */
	public Long getIfFinBuyPre6(){
		return this.ifFinBuyPre6;
	}

	/**
	 *方法: 设置ifFinBuyPre6
	 *@param: java.lang.Long  ifFinBuyPre6
	 */
	public void setIfFinBuyPre6(Long ifFinBuyPre6){
		this.ifFinBuyPre6 = ifFinBuyPre6;
	}

	/**
	 *方法: 获得cstScoreFinally
	 *@return: java.lang.Long  cstScoreFinally
	 */
	public Long getCstScoreFinally(){
		return this.cstScoreFinally;
	}

	/**
	 *方法: 设置cstScoreFinally
	 *@param: java.lang.Long  cstScoreFinally
	 */
	public void setCstScoreFinally(Long cstScoreFinally){
		this.cstScoreFinally = cstScoreFinally;
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