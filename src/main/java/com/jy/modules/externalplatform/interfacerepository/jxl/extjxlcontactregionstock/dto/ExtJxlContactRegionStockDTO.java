package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactregionstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:联系人区域汇总
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:25:07
 */
public class ExtJxlContactRegionStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**申请人信息(jxl)id*/
	private java.lang.Long fkJxlCustInfoId;

	/**联系人的号码归属地*/
	private java.lang.String regionLoc;

	/**去重后的联系人号码数量*/
	private java.lang.Long regionUniqNumCnt;

	/**电话呼入次数*/
	private java.lang.Long regionCallInCnt;

	/**电话呼出次数*/
	private java.lang.Long regionCallOutCnt;

	/**电话呼入总时间（秒）*/
	private java.lang.Long regionCallInTime;

	/**电话呼出总时间（秒）*/
	private java.lang.Long regionCallOutTime;

	/**平均电话呼入时间（秒）*/
	private java.lang.Long regionAvgCallInTime;

	/**平均电话呼出时间（秒）*/
	private java.lang.Long regionAvgCallOutTime;

	/**电话呼入次数百分比*/
	private java.lang.Long regionCallInCntPct;

	/**电话呼出次数百分比*/
	private java.lang.Long regionCallOutCntPct;

	/**电话呼入时间百分比*/
	private java.lang.Long regionCallInTimePct;

	/**电话呼出时间百分比*/
	private java.lang.Long regionCallOutTimePct;
	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;
	
	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.sql.Timestamp createTime) {
		this.createTime = createTime;
	}

	public java.sql.Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(java.sql.Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
	 *方法: 获得id
	 *@return: java.lang.Long  id
	 */
	public java.lang.Long getId(){
		return this.id;
	}

	/**
	 *方法: 设置id
	 *@param: java.lang.Long  id
	 */
	public void setId(java.lang.Long id){
		this.id = id;
	}

	/**
	 *方法: 获得fkJxlCustInfoId
	 *@return: java.lang.Long  fkJxlCustInfoId
	 */
	public java.lang.Long getFkJxlCustInfoId(){
		return this.fkJxlCustInfoId;
	}

	/**
	 *方法: 设置fkJxlCustInfoId
	 *@param: java.lang.Long  fkJxlCustInfoId
	 */
	public void setFkJxlCustInfoId(java.lang.Long fkJxlCustInfoId){
		this.fkJxlCustInfoId = fkJxlCustInfoId;
	}

	/**
	 *方法: 获得regionLoc
	 *@return: java.lang.String  regionLoc
	 */
	public java.lang.String getRegionLoc(){
		return this.regionLoc;
	}

	/**
	 *方法: 设置regionLoc
	 *@param: java.lang.String  regionLoc
	 */
	public void setRegionLoc(java.lang.String regionLoc){
		this.regionLoc = regionLoc;
	}

	/**
	 *方法: 获得regionUniqNumCnt
	 *@return: java.lang.Long  regionUniqNumCnt
	 */
	public java.lang.Long getRegionUniqNumCnt(){
		return this.regionUniqNumCnt;
	}

	/**
	 *方法: 设置regionUniqNumCnt
	 *@param: java.lang.Long  regionUniqNumCnt
	 */
	public void setRegionUniqNumCnt(java.lang.Long regionUniqNumCnt){
		this.regionUniqNumCnt = regionUniqNumCnt;
	}

	/**
	 *方法: 获得regionCallInCnt
	 *@return: java.lang.Long  regionCallInCnt
	 */
	public java.lang.Long getRegionCallInCnt(){
		return this.regionCallInCnt;
	}

	/**
	 *方法: 设置regionCallInCnt
	 *@param: java.lang.Long  regionCallInCnt
	 */
	public void setRegionCallInCnt(java.lang.Long regionCallInCnt){
		this.regionCallInCnt = regionCallInCnt;
	}

	/**
	 *方法: 获得regionCallOutCnt
	 *@return: java.lang.Long  regionCallOutCnt
	 */
	public java.lang.Long getRegionCallOutCnt(){
		return this.regionCallOutCnt;
	}

	/**
	 *方法: 设置regionCallOutCnt
	 *@param: java.lang.Long  regionCallOutCnt
	 */
	public void setRegionCallOutCnt(java.lang.Long regionCallOutCnt){
		this.regionCallOutCnt = regionCallOutCnt;
	}

	/**
	 *方法: 获得regionCallInTime
	 *@return: java.lang.Long  regionCallInTime
	 */
	public java.lang.Long getRegionCallInTime(){
		return this.regionCallInTime;
	}

	/**
	 *方法: 设置regionCallInTime
	 *@param: java.lang.Long  regionCallInTime
	 */
	public void setRegionCallInTime(java.lang.Long regionCallInTime){
		this.regionCallInTime = regionCallInTime;
	}

	/**
	 *方法: 获得regionCallOutTime
	 *@return: java.lang.Long  regionCallOutTime
	 */
	public java.lang.Long getRegionCallOutTime(){
		return this.regionCallOutTime;
	}

	/**
	 *方法: 设置regionCallOutTime
	 *@param: java.lang.Long  regionCallOutTime
	 */
	public void setRegionCallOutTime(java.lang.Long regionCallOutTime){
		this.regionCallOutTime = regionCallOutTime;
	}

	/**
	 *方法: 获得regionAvgCallInTime
	 *@return: java.lang.Long  regionAvgCallInTime
	 */
	public java.lang.Long getRegionAvgCallInTime(){
		return this.regionAvgCallInTime;
	}

	/**
	 *方法: 设置regionAvgCallInTime
	 *@param: java.lang.Long  regionAvgCallInTime
	 */
	public void setRegionAvgCallInTime(java.lang.Long regionAvgCallInTime){
		this.regionAvgCallInTime = regionAvgCallInTime;
	}

	/**
	 *方法: 获得regionAvgCallOutTime
	 *@return: java.lang.Long  regionAvgCallOutTime
	 */
	public java.lang.Long getRegionAvgCallOutTime(){
		return this.regionAvgCallOutTime;
	}

	/**
	 *方法: 设置regionAvgCallOutTime
	 *@param: java.lang.Long  regionAvgCallOutTime
	 */
	public void setRegionAvgCallOutTime(java.lang.Long regionAvgCallOutTime){
		this.regionAvgCallOutTime = regionAvgCallOutTime;
	}

	/**
	 *方法: 获得regionCallInCntPct
	 *@return: java.lang.Long  regionCallInCntPct
	 */
	public java.lang.Long getRegionCallInCntPct(){
		return this.regionCallInCntPct;
	}

	/**
	 *方法: 设置regionCallInCntPct
	 *@param: java.lang.Long  regionCallInCntPct
	 */
	public void setRegionCallInCntPct(java.lang.Long regionCallInCntPct){
		this.regionCallInCntPct = regionCallInCntPct;
	}

	/**
	 *方法: 获得regionCallOutCntPct
	 *@return: java.lang.Long  regionCallOutCntPct
	 */
	public java.lang.Long getRegionCallOutCntPct(){
		return this.regionCallOutCntPct;
	}

	/**
	 *方法: 设置regionCallOutCntPct
	 *@param: java.lang.Long  regionCallOutCntPct
	 */
	public void setRegionCallOutCntPct(java.lang.Long regionCallOutCntPct){
		this.regionCallOutCntPct = regionCallOutCntPct;
	}

	/**
	 *方法: 获得regionCallInTimePct
	 *@return: java.lang.Long  regionCallInTimePct
	 */
	public java.lang.Long getRegionCallInTimePct(){
		return this.regionCallInTimePct;
	}

	/**
	 *方法: 设置regionCallInTimePct
	 *@param: java.lang.Long  regionCallInTimePct
	 */
	public void setRegionCallInTimePct(java.lang.Long regionCallInTimePct){
		this.regionCallInTimePct = regionCallInTimePct;
	}

	/**
	 *方法: 获得regionCallOutTimePct
	 *@return: java.lang.Long  regionCallOutTimePct
	 */
	public java.lang.Long getRegionCallOutTimePct(){
		return this.regionCallOutTimePct;
	}

	/**
	 *方法: 设置regionCallOutTimePct
	 *@param: java.lang.Long  regionCallOutTimePct
	 */
	public void setRegionCallOutTimePct(java.lang.Long regionCallOutTimePct){
		this.regionCallOutTimePct = regionCallOutTimePct;
	}

}