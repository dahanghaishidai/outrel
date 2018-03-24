package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonalreport.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行征信报告主表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:47:29
 */
public class ExtWlShPersonalReportDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**报告编号*/
	private String reportSN;

	/**报告时间*/
	private String reporttime;

	/**查询时间*/
	private String querytime;

	/**姓名*/
	private String name;

	/**证件类型*/
	private String IDtype;

	/**证件编号*/
	private String IDnumber;

	/**婚姻状态*/
	private String marital;

	/**推送报文*/
	private String pushMessage;

	/**进件编号*/
	private Long fkIntoAppId;

	/**客户编号*/
	private Long fkCustId;

	/**备注*/
	private String remark;

	/**征信版本类型(1-风险报告;2-原始报告)*/
	private String creditVersionType;

	/**查询轨迹表ID*/
	private Long fkTrailId;

	/**数据有效性*/
	private String validateState;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp updateTime;

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
	 *方法: 获得name
	 *@return: java.lang.String  name
	 */
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置name
	 *@param: java.lang.String  name
	 */
	public void setName(String name){
		this.name = name;
	}



	/**
	 *方法: 获得marital
	 *@return: java.lang.String  marital
	 */
	public String getMarital(){
		return this.marital;
	}

	/**
	 *方法: 设置marital
	 *@param: java.lang.String  marital
	 */
	public void setMarital(String marital){
		this.marital = marital;
	}

	/**
	 *方法: 获得pushMessage
	 *@return: String  pushMessage
	 */
	public String getPushMessage(){
		return this.pushMessage;
	}

	/**
	 *方法: 设置pushMessage
	 *@param: String  pushMessage
	 */
	public void setPushMessage(String pushMessage){
		this.pushMessage = pushMessage;
	}

	/**
	 *方法: 获得fkIntoAppId
	 *@return: java.lang.Long  fkIntoAppId
	 */
	public Long getFkIntoAppId(){
		return this.fkIntoAppId;
	}

	/**
	 *方法: 设置fkIntoAppId
	 *@param: java.lang.Long  fkIntoAppId
	 */
	public void setFkIntoAppId(Long fkIntoAppId){
		this.fkIntoAppId = fkIntoAppId;
	}

	/**
	 *方法: 获得fkCustId
	 *@return: java.lang.Long  fkCustId
	 */
	public Long getFkCustId(){
		return this.fkCustId;
	}

	/**
	 *方法: 设置fkCustId
	 *@param: java.lang.Long  fkCustId
	 */
	public void setFkCustId(Long fkCustId){
		this.fkCustId = fkCustId;
	}

	/**
	 *方法: 获得remark
	 *@return: java.lang.String  remark
	 */
	public String getRemark(){
		return this.remark;
	}

	/**
	 *方法: 设置remark
	 *@param: java.lang.String  remark
	 */
	public void setRemark(String remark){
		this.remark = remark;
	}

	/**
	 *方法: 获得creditVersionType
	 *@return: java.lang.String  creditVersionType
	 */
	public String getCreditVersionType(){
		return this.creditVersionType;
	}

	/**
	 *方法: 设置creditVersionType
	 *@param: java.lang.String  creditVersionType
	 */
	public void setCreditVersionType(String creditVersionType){
		this.creditVersionType = creditVersionType;
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
	 *方法: 获得updateTime
	 *@return: java.sql.Timestamp  updateTime
	 */
	public java.sql.Timestamp getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置updateTime
	 *@param: java.sql.Timestamp  updateTime
	 */
	public void setUpdateTime(java.sql.Timestamp updateTime){
		this.updateTime = updateTime;
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

	public String getReportSN() {
		return reportSN;
	}

	public void setReportSN(String reportSN) {
		this.reportSN = reportSN;
	}

	public String getReporttime() {
		return reporttime;
	}

	public void setReporttime(String reporttime) {
		this.reporttime = reporttime;
	}

	public String getQuerytime() {
		return querytime;
	}

	public void setQuerytime(String querytime) {
		this.querytime = querytime;
	}

	public String getIDtype() {
		return IDtype;
	}

	public void setIDtype(String IDtype) {
		this.IDtype = IDtype;
	}

	public String getIDnumber() {
		return IDnumber;
	}

	public void setIDnumber(String IDnumber) {
		this.IDnumber = IDnumber;
	}

}