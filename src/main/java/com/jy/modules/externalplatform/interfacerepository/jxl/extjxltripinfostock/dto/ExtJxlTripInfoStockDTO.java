package com.jy.modules.externalplatform.interfacerepository.jxl.extjxltripinfostock.dto;

import java.util.List;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:出行分析表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:26:22
 */
public class ExtJxlTripInfoStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**申请人信息(JXL)id*/
	private java.lang.Long fkJxlCustInfoId;

	/**出发地*/
	private java.lang.String tripLeave;

	/**目的地*/
	private java.lang.String tripDest;

	/**出行时间类型*/
	private java.lang.String tripType;

	/**出行开始时间*/
	private java.lang.String tripStartTime;

	/**出行结束时间*/
	private java.lang.String tripEndTime;

	/**多种出行交通工具*/
	private java.lang.String tripTransportation;

	/**多个同行人*/
	private java.lang.String tripPerson;

	/**是通过哪些数据源分析出来的*/
	private java.lang.String tripDataSource;
	
	/**多种出行交通工具*/
	private List<String> trip_transportation;
	
	/**多个同行人*/
	private List<String> trip_person;
	
	/**是通过哪些数据源分析出来的*/
	private List<String> trip_data_source;
	
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

	public List<String> getTrip_transportation() {
		return trip_transportation;
	}

	public void setTrip_transportation(List<String> trip_transportation) {
		this.trip_transportation = trip_transportation;
	}

	public List<String> getTrip_person() {
		return trip_person;
	}

	public void setTrip_person(List<String> trip_person) {
		this.trip_person = trip_person;
	}

	public List<String> getTrip_data_source() {
		return trip_data_source;
	}

	public void setTrip_data_source(List<String> trip_data_source) {
		this.trip_data_source = trip_data_source;
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
	 *方法: 获得tripLeave
	 *@return: java.lang.String  tripLeave
	 */
	public java.lang.String getTripLeave(){
		return this.tripLeave;
	}

	/**
	 *方法: 设置tripLeave
	 *@param: java.lang.String  tripLeave
	 */
	public void setTripLeave(java.lang.String tripLeave){
		this.tripLeave = tripLeave;
	}

	/**
	 *方法: 获得tripDest
	 *@return: java.lang.String  tripDest
	 */
	public java.lang.String getTripDest(){
		return this.tripDest;
	}

	/**
	 *方法: 设置tripDest
	 *@param: java.lang.String  tripDest
	 */
	public void setTripDest(java.lang.String tripDest){
		this.tripDest = tripDest;
	}

	/**
	 *方法: 获得tripType
	 *@return: java.lang.String  tripType
	 */
	public java.lang.String getTripType(){
		return this.tripType;
	}

	/**
	 *方法: 设置tripType
	 *@param: java.lang.String  tripType
	 */
	public void setTripType(java.lang.String tripType){
		this.tripType = tripType;
	}

	/**
	 *方法: 获得tripStartTime
	 *@return: java.lang.String  tripStartTime
	 */
	public java.lang.String getTripStartTime(){
		return this.tripStartTime;
	}

	/**
	 *方法: 设置tripStartTime
	 *@param: java.lang.String  tripStartTime
	 */
	public void setTripStartTime(java.lang.String tripStartTime){
		this.tripStartTime = tripStartTime;
	}

	/**
	 *方法: 获得tripEndTime
	 *@return: java.lang.String  tripEndTime
	 */
	public java.lang.String getTripEndTime(){
		return this.tripEndTime;
	}

	/**
	 *方法: 设置tripEndTime
	 *@param: java.lang.String  tripEndTime
	 */
	public void setTripEndTime(java.lang.String tripEndTime){
		this.tripEndTime = tripEndTime;
	}

	/**
	 *方法: 获得tripTransportation
	 *@return: java.lang.String  tripTransportation
	 */
	public java.lang.String getTripTransportation(){
		return this.tripTransportation;
	}

	/**
	 *方法: 设置tripTransportation
	 *@param: java.lang.String  tripTransportation
	 */
	public void setTripTransportation(java.lang.String tripTransportation){
		this.tripTransportation = tripTransportation;
	}

	/**
	 *方法: 获得tripPerson
	 *@return: java.lang.String  tripPerson
	 */
	public java.lang.String getTripPerson(){
		return this.tripPerson;
	}

	/**
	 *方法: 设置tripPerson
	 *@param: java.lang.String  tripPerson
	 */
	public void setTripPerson(java.lang.String tripPerson){
		this.tripPerson = tripPerson;
	}

	/**
	 *方法: 获得tripDataSource
	 *@return: java.lang.String  tripDataSource
	 */
	public java.lang.String getTripDataSource(){
		return this.tripDataSource;
	}

	/**
	 *方法: 设置tripDataSource
	 *@param: java.lang.String  tripDataSource
	 */
	public void setTripDataSource(java.lang.String tripDataSource){
		this.tripDataSource = tripDataSource;
	}

}