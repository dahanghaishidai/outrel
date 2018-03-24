package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshreportextend.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行报告扩展字段表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:52:26
 */
public class ExtWlShReportExtendDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**被查询人(预期被查人)姓名*/
	private String cusName;

	/**被查询人身份证号*/
	private String cusIdNo;

	/**报告绑定人(实际被查人)姓名*/
	private String binderName;

	/**报告绑定人身份证号*/
	private String binderIdNo;

	/**查询人标识*/
	private String operatorId;

	/**扩展字段1*/
	private String extend_1;

	/**扩展字段2*/
	private String extend_2;

	/**扩展字段3*/
	private String extend_3;

	/**查询轨迹表ID*/
	private Long fkTrailId;

	/**返回报文*/
	private String respMsg;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**数据有效性*/
	private String validateState;

	/**创建人*/
	private Long createBy;

	/**修改人*/
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
	 *方法: 获得cusName
	 *@return: java.lang.String  cusName
	 */
	public String getCusName(){
		return this.cusName;
	}

	/**
	 *方法: 设置cusName
	 *@param: java.lang.String  cusName
	 */
	public void setCusName(String cusName){
		this.cusName = cusName;
	}

	/**
	 *方法: 获得cusIdNo
	 *@return: java.lang.String  cusIdNo
	 */
	public String getCusIdNo(){
		return this.cusIdNo;
	}

	/**
	 *方法: 设置cusIdNo
	 *@param: java.lang.String  cusIdNo
	 */
	public void setCusIdNo(String cusIdNo){
		this.cusIdNo = cusIdNo;
	}

	/**
	 *方法: 获得binderName
	 *@return: java.lang.String  binderName
	 */
	public String getBinderName(){
		return this.binderName;
	}

	/**
	 *方法: 设置binderName
	 *@param: java.lang.String  binderName
	 */
	public void setBinderName(String binderName){
		this.binderName = binderName;
	}

	/**
	 *方法: 获得binderIdNo
	 *@return: java.lang.String  binderIdNo
	 */
	public String getBinderIdNo(){
		return this.binderIdNo;
	}

	/**
	 *方法: 设置binderIdNo
	 *@param: java.lang.String  binderIdNo
	 */
	public void setBinderIdNo(String binderIdNo){
		this.binderIdNo = binderIdNo;
	}

	/**
	 *方法: 获得operatorId
	 *@return: java.lang.String  operatorId
	 */
	public String getOperatorId(){
		return this.operatorId;
	}

	/**
	 *方法: 设置operatorId
	 *@param: java.lang.String  operatorId
	 */
	public void setOperatorId(String operatorId){
		this.operatorId = operatorId;
	}


	/**
	 *方法: 获得fkTrailId
	 *@return: java.lang.Long  fkTrailId
	 */
	public Long getFkTrailId(){
		return this.fkTrailId;
	}

	/**
	 *方法: 设置fkTrailId
	 *@param: java.lang.Long  fkTrailId
	 */
	public void setFkTrailId(Long fkTrailId){
		this.fkTrailId = fkTrailId;
	}

	/**
	 *方法: 获得respMsg
	 *@return: String  respMsg
	 */
	public String getRespMsg(){
		return this.respMsg;
	}

	/**
	 *方法: 设置respMsg
	 *@param: String  respMsg
	 */
	public void setRespMsg(String respMsg){
		this.respMsg = respMsg;
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
	 *方法: 获得validateState
	 *@return: java.lang.String  validateState
	 */
	public String getValidateState(){
		return this.validateState;
	}

	/**
	 *方法: 设置validateState
	 *@param: java.lang.String  validateState
	 */
	public void setValidateState(String validateState){
		this.validateState = validateState;
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


	public String getExtend_1() {
		return extend_1;
	}

	public void setExtend_1(String extend_1) {
		this.extend_1 = extend_1;
	}

	public String getExtend_2() {
		return extend_2;
	}

	public void setExtend_2(String extend_2) {
		this.extend_2 = extend_2;
	}

	public String getExtend_3() {
		return extend_3;
	}

	public void setExtend_3(String extend_3) {
		this.extend_3 = extend_3;
	}


}