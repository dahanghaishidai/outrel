package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactliststock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:运营商联系人列表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:24:57
 */
public class ExtJxlContactListStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**申请人信息（jxl）id*/
	private java.lang.Long fkJxlCustInfoId;

	/**号码*/
	private java.lang.String phoneNum;

	/**号码归属地*/
	private java.lang.String phoneNumLoc;

	/**号码被标注的名称*/
	private java.lang.String contactName;

	/**被标注的名称的类型*/
	private java.lang.String needsType;

	/**通话次数*/
	private java.lang.Long callCnt;

	/**通话时长(秒）*/
	private java.lang.Long callLen;

	/**呼出次数*/
	private java.lang.Long callOutCnt;

	/**呼出时间(秒)*/
	private java.lang.Long callOutLen;

	/**呼入次数*/
	private java.lang.Long callInCnt;

	/**呼入时间(秒)*/
	private java.lang.Long callInLen;

	/**关系推测*/
	private java.lang.String pRelation;

	/**最近一周联系次数*/
	private java.lang.Long contact1w;

	/**最近一月联系次数*/
	private java.lang.Long contact1m;

	/**最近三月联系次数*/
	private java.lang.Long contact3m;

	/**凌晨联系次数*/
	private java.lang.Long contactEarlyMorning;

	/**上午联系次数*/
	private java.lang.Long contactMorning;

	/**中午联系次数*/
	private java.lang.Long contactNoon;

	/**晚上联系次数*/
	private java.lang.Long contactAfternoon;

	/**深夜联系次数*/
	private java.lang.Long contactNight;

	/**是否全天联系*/
	private java.lang.String contactAllDay;

	/**周中联系次数*/
	private java.lang.Long contactWeekday;

	/**周末联系次数*/
	private java.lang.Long contactWeekend;

	/**节假日联系次数*/
	private java.lang.Long contactHoliday;
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
	 *方法: 获得phoneNum
	 *@return: java.lang.String  phoneNum
	 */
	public java.lang.String getPhoneNum(){
		return this.phoneNum;
	}

	/**
	 *方法: 设置phoneNum
	 *@param: java.lang.String  phoneNum
	 */
	public void setPhoneNum(java.lang.String phoneNum){
		this.phoneNum = phoneNum;
	}

	/**
	 *方法: 获得phoneNumLoc
	 *@return: java.lang.String  phoneNumLoc
	 */
	public java.lang.String getPhoneNumLoc(){
		return this.phoneNumLoc;
	}

	/**
	 *方法: 设置phoneNumLoc
	 *@param: java.lang.String  phoneNumLoc
	 */
	public void setPhoneNumLoc(java.lang.String phoneNumLoc){
		this.phoneNumLoc = phoneNumLoc;
	}

	/**
	 *方法: 获得contactName
	 *@return: java.lang.String  contactName
	 */
	public java.lang.String getContactName(){
		return this.contactName;
	}

	/**
	 *方法: 设置contactName
	 *@param: java.lang.String  contactName
	 */
	public void setContactName(java.lang.String contactName){
		this.contactName = contactName;
	}

	/**
	 *方法: 获得needsType
	 *@return: java.lang.String  needsType
	 */
	public java.lang.String getNeedsType(){
		return this.needsType;
	}

	/**
	 *方法: 设置needsType
	 *@param: java.lang.String  needsType
	 */
	public void setNeedsType(java.lang.String needsType){
		this.needsType = needsType;
	}

	/**
	 *方法: 获得callCnt
	 *@return: java.lang.Long  callCnt
	 */
	public java.lang.Long getCallCnt(){
		return this.callCnt;
	}

	/**
	 *方法: 设置callCnt
	 *@param: java.lang.Long  callCnt
	 */
	public void setCallCnt(java.lang.Long callCnt){
		this.callCnt = callCnt;
	}

	/**
	 *方法: 获得callLen
	 *@return: java.lang.Long  callLen
	 */
	public java.lang.Long getCallLen(){
		return this.callLen;
	}

	/**
	 *方法: 设置callLen
	 *@param: java.lang.Long  callLen
	 */
	public void setCallLen(java.lang.Long callLen){
		this.callLen = callLen;
	}

	/**
	 *方法: 获得callOutCnt
	 *@return: java.lang.Long  callOutCnt
	 */
	public java.lang.Long getCallOutCnt(){
		return this.callOutCnt;
	}

	/**
	 *方法: 设置callOutCnt
	 *@param: java.lang.Long  callOutCnt
	 */
	public void setCallOutCnt(java.lang.Long callOutCnt){
		this.callOutCnt = callOutCnt;
	}

	/**
	 *方法: 获得callOutLen
	 *@return: java.lang.Long  callOutLen
	 */
	public java.lang.Long getCallOutLen(){
		return this.callOutLen;
	}

	/**
	 *方法: 设置callOutLen
	 *@param: java.lang.Long  callOutLen
	 */
	public void setCallOutLen(java.lang.Long callOutLen){
		this.callOutLen = callOutLen;
	}

	/**
	 *方法: 获得callInCnt
	 *@return: java.lang.Long  callInCnt
	 */
	public java.lang.Long getCallInCnt(){
		return this.callInCnt;
	}

	/**
	 *方法: 设置callInCnt
	 *@param: java.lang.Long  callInCnt
	 */
	public void setCallInCnt(java.lang.Long callInCnt){
		this.callInCnt = callInCnt;
	}

	/**
	 *方法: 获得callInLen
	 *@return: java.lang.Long  callInLen
	 */
	public java.lang.Long getCallInLen(){
		return this.callInLen;
	}

	/**
	 *方法: 设置callInLen
	 *@param: java.lang.Long  callInLen
	 */
	public void setCallInLen(java.lang.Long callInLen){
		this.callInLen = callInLen;
	}

	/**
	 *方法: 获得pRelation
	 *@return: java.lang.String  pRelation
	 */
	public java.lang.String getPRelation(){
		return this.pRelation;
	}

	/**
	 *方法: 设置pRelation
	 *@param: java.lang.String  pRelation
	 */
	public void setPRelation(java.lang.String pRelation){
		this.pRelation = pRelation;
	}

	/**
	 *方法: 获得contact1w
	 *@return: java.lang.Long  contact1w
	 */
	public java.lang.Long getContact1w(){
		return this.contact1w;
	}

	/**
	 *方法: 设置contact1w
	 *@param: java.lang.Long  contact1w
	 */
	public void setContact1w(java.lang.Long contact1w){
		this.contact1w = contact1w;
	}

	/**
	 *方法: 获得contact1m
	 *@return: java.lang.Long  contact1m
	 */
	public java.lang.Long getContact1m(){
		return this.contact1m;
	}

	/**
	 *方法: 设置contact1m
	 *@param: java.lang.Long  contact1m
	 */
	public void setContact1m(java.lang.Long contact1m){
		this.contact1m = contact1m;
	}

	/**
	 *方法: 获得contact3m
	 *@return: java.lang.Long  contact3m
	 */
	public java.lang.Long getContact3m(){
		return this.contact3m;
	}

	/**
	 *方法: 设置contact3m
	 *@param: java.lang.Long  contact3m
	 */
	public void setContact3m(java.lang.Long contact3m){
		this.contact3m = contact3m;
	}

	/**
	 *方法: 获得contactEarlyMorning
	 *@return: java.lang.Long  contactEarlyMorning
	 */
	public java.lang.Long getContactEarlyMorning(){
		return this.contactEarlyMorning;
	}

	/**
	 *方法: 设置contactEarlyMorning
	 *@param: java.lang.Long  contactEarlyMorning
	 */
	public void setContactEarlyMorning(java.lang.Long contactEarlyMorning){
		this.contactEarlyMorning = contactEarlyMorning;
	}

	/**
	 *方法: 获得contactMorning
	 *@return: java.lang.Long  contactMorning
	 */
	public java.lang.Long getContactMorning(){
		return this.contactMorning;
	}

	/**
	 *方法: 设置contactMorning
	 *@param: java.lang.Long  contactMorning
	 */
	public void setContactMorning(java.lang.Long contactMorning){
		this.contactMorning = contactMorning;
	}

	/**
	 *方法: 获得contactNoon
	 *@return: java.lang.Long  contactNoon
	 */
	public java.lang.Long getContactNoon(){
		return this.contactNoon;
	}

	/**
	 *方法: 设置contactNoon
	 *@param: java.lang.Long  contactNoon
	 */
	public void setContactNoon(java.lang.Long contactNoon){
		this.contactNoon = contactNoon;
	}

	/**
	 *方法: 获得contactAfternoon
	 *@return: java.lang.Long  contactAfternoon
	 */
	public java.lang.Long getContactAfternoon(){
		return this.contactAfternoon;
	}

	/**
	 *方法: 设置contactAfternoon
	 *@param: java.lang.Long  contactAfternoon
	 */
	public void setContactAfternoon(java.lang.Long contactAfternoon){
		this.contactAfternoon = contactAfternoon;
	}

	/**
	 *方法: 获得contactNight
	 *@return: java.lang.Long  contactNight
	 */
	public java.lang.Long getContactNight(){
		return this.contactNight;
	}

	/**
	 *方法: 设置contactNight
	 *@param: java.lang.Long  contactNight
	 */
	public void setContactNight(java.lang.Long contactNight){
		this.contactNight = contactNight;
	}

	/**
	 *方法: 获得contactAllDay
	 *@return: java.lang.String  contactAllDay
	 */
	public java.lang.String getContactAllDay(){
		return this.contactAllDay;
	}

	/**
	 *方法: 设置contactAllDay
	 *@param: java.lang.String  contactAllDay
	 */
	public void setContactAllDay(java.lang.String contactAllDay){
		this.contactAllDay = contactAllDay;
	}

	/**
	 *方法: 获得contactWeekday
	 *@return: java.lang.Long  contactWeekday
	 */
	public java.lang.Long getContactWeekday(){
		return this.contactWeekday;
	}

	/**
	 *方法: 设置contactWeekday
	 *@param: java.lang.Long  contactWeekday
	 */
	public void setContactWeekday(java.lang.Long contactWeekday){
		this.contactWeekday = contactWeekday;
	}

	/**
	 *方法: 获得contactWeekend
	 *@return: java.lang.Long  contactWeekend
	 */
	public java.lang.Long getContactWeekend(){
		return this.contactWeekend;
	}

	/**
	 *方法: 设置contactWeekend
	 *@param: java.lang.Long  contactWeekend
	 */
	public void setContactWeekend(java.lang.Long contactWeekend){
		this.contactWeekend = contactWeekend;
	}

	/**
	 *方法: 获得contactHoliday
	 *@return: java.lang.Long  contactHoliday
	 */
	public java.lang.Long getContactHoliday(){
		return this.contactHoliday;
	}

	/**
	 *方法: 设置contactHoliday
	 *@param: java.lang.Long  contactHoliday
	 */
	public void setContactHoliday(java.lang.Long contactHoliday){
		this.contactHoliday = contactHoliday;
	}

}