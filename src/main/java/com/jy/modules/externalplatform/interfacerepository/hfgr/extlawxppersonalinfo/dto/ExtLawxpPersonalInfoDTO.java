package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawxppersonalinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:汇法网个人信息主表
 *@author Administrator
 *@version 1.0,
 *@date 2017-05-31 11:09:16
 */
public class ExtLawxpPersonalInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private java.lang.Long id;
	
	/**数据在汇法网主键Id*/
	private java.lang.Long keyid;

	/**身份证号*/
	private java.lang.String cidorcode;

	/**姓名*/
	private java.lang.String name;
	
	/**数据类型（执行信息、失信信息、案例信息、税务信息、催欠公告、网贷逾期）*/
	private java.lang.String type;

	/**数据时间（yyyy-MM-dd）*/
	private java.lang.String datatime;

	/**产品编码*/
	private java.lang.String prodCode;

	/**机构编码*/
	private java.lang.String orgCode;

	/**系统编码*/
	private java.lang.String sysCode;

	/**个人执行信息标志*/
	private java.lang.String exeMsg;

	/**个人案例信息标志*/
	private java.lang.String caseMsg;

	/**个人失信信息标志*/
	private java.lang.String dishonestyMsg;

	/**个人税务信息标志*/
	private java.lang.String taxMsg;

	/**个人催欠公告信息标志*/
	private java.lang.String cqMsg;

	/**个人网贷逾期信息标志*/
	private java.lang.String loanoverdueMsg;

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

	public java.lang.Long getKeyid() {
		return keyid;
	}

	public void setKeyid(java.lang.Long keyid) {
		this.keyid = keyid;
	}

	/**
	 *方法: 获得cidorcode
	 *@return: java.lang.String  cidorcode
	 */
	public java.lang.String getCidorcode(){
		return this.cidorcode;
	}

	/**
	 *方法: 设置cidorcode
	 *@param: java.lang.String  cidorcode
	 */
	public void setCidorcode(java.lang.String cidorcode){
		this.cidorcode = cidorcode;
	}

	/**
	 *方法: 获得name
	 *@return: java.lang.String  name
	 */
	public java.lang.String getName(){
		return this.name;
	}

	/**
	 *方法: 设置name
	 *@param: java.lang.String  name
	 */
	public void setName(java.lang.String name){
		this.name = name;
	}

	public java.lang.String getType() {
		return type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	/**
	 *方法: 获得datatime
	 *@return: java.lang.String  datatime
	 */
	public java.lang.String getDatatime(){
		return this.datatime;
	}

	/**
	 *方法: 设置datatime
	 *@param: java.lang.String  datatime
	 */
	public void setDatatime(java.lang.String datatime){
		this.datatime = datatime;
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
	 *方法: 获得exeMsg
	 *@return: java.lang.String  exeMsg
	 */
	public java.lang.String getExeMsg(){
		return this.exeMsg;
	}

	/**
	 *方法: 设置exeMsg
	 *@param: java.lang.String  exeMsg
	 */
	public void setExeMsg(java.lang.String exeMsg){
		this.exeMsg = exeMsg;
	}

	/**
	 *方法: 获得caseMsg
	 *@return: java.lang.String  caseMsg
	 */
	public java.lang.String getCaseMsg(){
		return this.caseMsg;
	}

	/**
	 *方法: 设置caseMsg
	 *@param: java.lang.String  caseMsg
	 */
	public void setCaseMsg(java.lang.String caseMsg){
		this.caseMsg = caseMsg;
	}

	/**
	 *方法: 获得dishonestyMsg
	 *@return: java.lang.String  dishonestyMsg
	 */
	public java.lang.String getDishonestyMsg(){
		return this.dishonestyMsg;
	}

	/**
	 *方法: 设置dishonestyMsg
	 *@param: java.lang.String  dishonestyMsg
	 */
	public void setDishonestyMsg(java.lang.String dishonestyMsg){
		this.dishonestyMsg = dishonestyMsg;
	}

	/**
	 *方法: 获得taxMsg
	 *@return: java.lang.String  taxMsg
	 */
	public java.lang.String getTaxMsg(){
		return this.taxMsg;
	}

	/**
	 *方法: 设置taxMsg
	 *@param: java.lang.String  taxMsg
	 */
	public void setTaxMsg(java.lang.String taxMsg){
		this.taxMsg = taxMsg;
	}

	/**
	 *方法: 获得cqMsg
	 *@return: java.lang.String  cqMsg
	 */
	public java.lang.String getCqMsg(){
		return this.cqMsg;
	}

	/**
	 *方法: 设置cqMsg
	 *@param: java.lang.String  cqMsg
	 */
	public void setCqMsg(java.lang.String cqMsg){
		this.cqMsg = cqMsg;
	}

	/**
	 *方法: 获得loanoverdueMsg
	 *@return: java.lang.String  loanoverdueMsg
	 */
	public java.lang.String getLoanoverdueMsg(){
		return this.loanoverdueMsg;
	}

	/**
	 *方法: 设置loanoverdueMsg
	 *@param: java.lang.String  loanoverdueMsg
	 */
	public void setLoanoverdueMsg(java.lang.String loanoverdueMsg){
		this.loanoverdueMsg = loanoverdueMsg;
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