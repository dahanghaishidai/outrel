package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcustinfostock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:申请人信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:23:38
 */
public class ExtJxlCustInfoStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private java.lang.Long id;

	/**申请人姓名*/
	private java.lang.String realName;

	/**申请人身份证号码*/
	private java.lang.String idCardNum;

	/**性别*/
	private java.lang.String gender;

	/**申请人星座*/
	private java.lang.String sign;

	/**申请人年龄*/
	private java.lang.String age;

	/**申请人出生省份*/
	private java.lang.String province;

	/**申请人出生城市*/
	private java.lang.String city;

	/**申请人出生县*/
	private java.lang.String region;

	/**呼叫信息*/
	private java.lang.String callInfoMsg;

	/**通话行为分析*/
	private java.lang.String cellBehaviorMsg;

	/**数据检查信息*/
	private java.lang.String checkInfoMsg;

	/**联系人信息*/
	private java.lang.String contactInfoMsg;

	/**运营商联系人列表*/
	private java.lang.String contactListMsg;

	/**联系人区域汇总*/
	private java.lang.String contactRegionMsg;

	/**绑定数据源信息*/
	private java.lang.String dataSourceMsg;

	/**送货地址列表*/
	private java.lang.String deliverAddressMsg;

	/**需求信息*/
	private java.lang.String demandsInfoMsg;

	/**电商月消费*/
	private java.lang.String ebusinessExpenseMsg;

	/**收货人*/
	private java.lang.String receiverMsg;

	/**近期需求*/
	private java.lang.String recentNeedMsg;

	/**出行分析*/
	private java.lang.String tripInfoMsg;

	/**产品编码*/
	private java.lang.String prodCode;

	/**机构编码*/
	private java.lang.String orgCode;

	/**系统编码*/
	private java.lang.String sysCode;

	/**返回码 1：查有 2：查无 3：查询报错 4：解析错误*/
	private java.lang.String retcode;

	/**返回错误信息*/
	private java.lang.String errormsg;

	/**接口日志ID*/
	private java.lang.String interfaceId;

	/**备注*/
	private java.lang.String remark;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;


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
	 *方法: 获得realName
	 *@return: java.lang.String  realName
	 */
	public java.lang.String getRealName(){
		return this.realName;
	}

	/**
	 *方法: 设置realName
	 *@param: java.lang.String  realName
	 */
	public void setRealName(java.lang.String realName){
		this.realName = realName;
	}

	/**
	 *方法: 获得idCardNum
	 *@return: java.lang.String  idCardNum
	 */
	public java.lang.String getIdCardNum(){
		return this.idCardNum;
	}

	/**
	 *方法: 设置idCardNum
	 *@param: java.lang.String  idCardNum
	 */
	public void setIdCardNum(java.lang.String idCardNum){
		this.idCardNum = idCardNum;
	}

	/**
	 *方法: 获得gender
	 *@return: java.lang.String  gender
	 */
	public java.lang.String getGender(){
		return this.gender;
	}

	/**
	 *方法: 设置gender
	 *@param: java.lang.String  gender
	 */
	public void setGender(java.lang.String gender){
		this.gender = gender;
	}

	/**
	 *方法: 获得sign
	 *@return: java.lang.String  sign
	 */
	public java.lang.String getSign(){
		return this.sign;
	}

	/**
	 *方法: 设置sign
	 *@param: java.lang.String  sign
	 */
	public void setSign(java.lang.String sign){
		this.sign = sign;
	}

	/**
	 *方法: 获得age
	 *@return: java.lang.String  age
	 */
	public java.lang.String getAge(){
		return this.age;
	}

	/**
	 *方法: 设置age
	 *@param: java.lang.String  age
	 */
	public void setAge(java.lang.String age){
		this.age = age;
	}

	/**
	 *方法: 获得province
	 *@return: java.lang.String  province
	 */
	public java.lang.String getProvince(){
		return this.province;
	}

	/**
	 *方法: 设置province
	 *@param: java.lang.String  province
	 */
	public void setProvince(java.lang.String province){
		this.province = province;
	}

	/**
	 *方法: 获得city
	 *@return: java.lang.String  city
	 */
	public java.lang.String getCity(){
		return this.city;
	}

	/**
	 *方法: 设置city
	 *@param: java.lang.String  city
	 */
	public void setCity(java.lang.String city){
		this.city = city;
	}

	/**
	 *方法: 获得region
	 *@return: java.lang.String  region
	 */
	public java.lang.String getRegion(){
		return this.region;
	}

	/**
	 *方法: 设置region
	 *@param: java.lang.String  region
	 */
	public void setRegion(java.lang.String region){
		this.region = region;
	}

	/**
	 *方法: 获得callInfoMsg
	 *@return: java.lang.String  callInfoMsg
	 */
	public java.lang.String getCallInfoMsg(){
		return this.callInfoMsg;
	}

	/**
	 *方法: 设置callInfoMsg
	 *@param: java.lang.String  callInfoMsg
	 */
	public void setCallInfoMsg(java.lang.String callInfoMsg){
		this.callInfoMsg = callInfoMsg;
	}

	/**
	 *方法: 获得cellBehaviorMsg
	 *@return: java.lang.String  cellBehaviorMsg
	 */
	public java.lang.String getCellBehaviorMsg(){
		return this.cellBehaviorMsg;
	}

	/**
	 *方法: 设置cellBehaviorMsg
	 *@param: java.lang.String  cellBehaviorMsg
	 */
	public void setCellBehaviorMsg(java.lang.String cellBehaviorMsg){
		this.cellBehaviorMsg = cellBehaviorMsg;
	}

	/**
	 *方法: 获得checkInfoMsg
	 *@return: java.lang.String  checkInfoMsg
	 */
	public java.lang.String getCheckInfoMsg(){
		return this.checkInfoMsg;
	}

	/**
	 *方法: 设置checkInfoMsg
	 *@param: java.lang.String  checkInfoMsg
	 */
	public void setCheckInfoMsg(java.lang.String checkInfoMsg){
		this.checkInfoMsg = checkInfoMsg;
	}

	/**
	 *方法: 获得contactInfoMsg
	 *@return: java.lang.String  contactInfoMsg
	 */
	public java.lang.String getContactInfoMsg(){
		return this.contactInfoMsg;
	}

	/**
	 *方法: 设置contactInfoMsg
	 *@param: java.lang.String  contactInfoMsg
	 */
	public void setContactInfoMsg(java.lang.String contactInfoMsg){
		this.contactInfoMsg = contactInfoMsg;
	}

	/**
	 *方法: 获得contactListMsg
	 *@return: java.lang.String  contactListMsg
	 */
	public java.lang.String getContactListMsg(){
		return this.contactListMsg;
	}

	/**
	 *方法: 设置contactListMsg
	 *@param: java.lang.String  contactListMsg
	 */
	public void setContactListMsg(java.lang.String contactListMsg){
		this.contactListMsg = contactListMsg;
	}

	/**
	 *方法: 获得contactRegionMsg
	 *@return: java.lang.String  contactRegionMsg
	 */
	public java.lang.String getContactRegionMsg(){
		return this.contactRegionMsg;
	}

	/**
	 *方法: 设置contactRegionMsg
	 *@param: java.lang.String  contactRegionMsg
	 */
	public void setContactRegionMsg(java.lang.String contactRegionMsg){
		this.contactRegionMsg = contactRegionMsg;
	}

	/**
	 *方法: 获得dataSourceMsg
	 *@return: java.lang.String  dataSourceMsg
	 */
	public java.lang.String getDataSourceMsg(){
		return this.dataSourceMsg;
	}

	/**
	 *方法: 设置dataSourceMsg
	 *@param: java.lang.String  dataSourceMsg
	 */
	public void setDataSourceMsg(java.lang.String dataSourceMsg){
		this.dataSourceMsg = dataSourceMsg;
	}

	/**
	 *方法: 获得deliverAddressMsg
	 *@return: java.lang.String  deliverAddressMsg
	 */
	public java.lang.String getDeliverAddressMsg(){
		return this.deliverAddressMsg;
	}

	/**
	 *方法: 设置deliverAddressMsg
	 *@param: java.lang.String  deliverAddressMsg
	 */
	public void setDeliverAddressMsg(java.lang.String deliverAddressMsg){
		this.deliverAddressMsg = deliverAddressMsg;
	}

	/**
	 *方法: 获得demandsInfoMsg
	 *@return: java.lang.String  demandsInfoMsg
	 */
	public java.lang.String getDemandsInfoMsg(){
		return this.demandsInfoMsg;
	}

	/**
	 *方法: 设置demandsInfoMsg
	 *@param: java.lang.String  demandsInfoMsg
	 */
	public void setDemandsInfoMsg(java.lang.String demandsInfoMsg){
		this.demandsInfoMsg = demandsInfoMsg;
	}

	/**
	 *方法: 获得ebusinessExpenseMsg
	 *@return: java.lang.String  ebusinessExpenseMsg
	 */
	public java.lang.String getEbusinessExpenseMsg(){
		return this.ebusinessExpenseMsg;
	}

	/**
	 *方法: 设置ebusinessExpenseMsg
	 *@param: java.lang.String  ebusinessExpenseMsg
	 */
	public void setEbusinessExpenseMsg(java.lang.String ebusinessExpenseMsg){
		this.ebusinessExpenseMsg = ebusinessExpenseMsg;
	}

	/**
	 *方法: 获得receiverMsg
	 *@return: java.lang.String  receiverMsg
	 */
	public java.lang.String getReceiverMsg(){
		return this.receiverMsg;
	}

	/**
	 *方法: 设置receiverMsg
	 *@param: java.lang.String  receiverMsg
	 */
	public void setReceiverMsg(java.lang.String receiverMsg){
		this.receiverMsg = receiverMsg;
	}

	/**
	 *方法: 获得recentNeedMsg
	 *@return: java.lang.String  recentNeedMsg
	 */
	public java.lang.String getRecentNeedMsg(){
		return this.recentNeedMsg;
	}

	/**
	 *方法: 设置recentNeedMsg
	 *@param: java.lang.String  recentNeedMsg
	 */
	public void setRecentNeedMsg(java.lang.String recentNeedMsg){
		this.recentNeedMsg = recentNeedMsg;
	}

	/**
	 *方法: 获得tripInfoMsg
	 *@return: java.lang.String  tripInfoMsg
	 */
	public java.lang.String getTripInfoMsg(){
		return this.tripInfoMsg;
	}

	/**
	 *方法: 设置tripInfoMsg
	 *@param: java.lang.String  tripInfoMsg
	 */
	public void setTripInfoMsg(java.lang.String tripInfoMsg){
		this.tripInfoMsg = tripInfoMsg;
	}

	/**
	 *方法: 获得prodCode
	 *@return: java.lang.String  prodCode
	 */
	public java.lang.String getProdCode(){
		return this.prodCode;
	}

	/**
	 *方法: 设置prodCode
	 *@param: java.lang.String  prodCode
	 */
	public void setProdCode(java.lang.String prodCode){
		this.prodCode = prodCode;
	}

	/**
	 *方法: 获得orgCode
	 *@return: java.lang.String  orgCode
	 */
	public java.lang.String getOrgCode(){
		return this.orgCode;
	}

	/**
	 *方法: 设置orgCode
	 *@param: java.lang.String  orgCode
	 */
	public void setOrgCode(java.lang.String orgCode){
		this.orgCode = orgCode;
	}

	/**
	 *方法: 获得sysCode
	 *@return: java.lang.String  sysCode
	 */
	public java.lang.String getSysCode(){
		return this.sysCode;
	}

	/**
	 *方法: 设置sysCode
	 *@param: java.lang.String  sysCode
	 */
	public void setSysCode(java.lang.String sysCode){
		this.sysCode = sysCode;
	}

	/**
	 *方法: 获得retcode
	 *@return: java.lang.String  retcode
	 */
	public java.lang.String getRetcode(){
		return this.retcode;
	}

	/**
	 *方法: 设置retcode
	 *@param: java.lang.String  retcode
	 */
	public void setRetcode(java.lang.String retcode){
		this.retcode = retcode;
	}

	/**
	 *方法: 获得errormsg
	 *@return: java.lang.String  errormsg
	 */
	public java.lang.String getErrormsg(){
		return this.errormsg;
	}

	/**
	 *方法: 设置errormsg
	 *@param: java.lang.String  errormsg
	 */
	public void setErrormsg(java.lang.String errormsg){
		this.errormsg = errormsg;
	}

	/**
	 *方法: 获得interfaceId
	 *@return: java.lang.String  interfaceId
	 */
	public java.lang.String getInterfaceId(){
		return this.interfaceId;
	}

	/**
	 *方法: 设置interfaceId
	 *@param: java.lang.String  interfaceId
	 */
	public void setInterfaceId(java.lang.String interfaceId){
		this.interfaceId = interfaceId;
	}

	/**
	 *方法: 获得remark
	 *@return: java.lang.String  remark
	 */
	public java.lang.String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置remark
	 *@param: java.lang.String  remark
	 */
	public void setRemark(java.lang.String remark){
		this.remark = remark;
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

}