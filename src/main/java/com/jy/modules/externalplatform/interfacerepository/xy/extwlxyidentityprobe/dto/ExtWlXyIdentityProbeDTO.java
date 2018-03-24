package com.jy.modules.externalplatform.interfacerepository.xy.extwlxyidentityprobe.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:新颜身份探针信息表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-06 10:47:37
 */
public class ExtWlXyIdentityProbeDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键Id*/
	private Long id;

	/**进件客户关联主键*/
	private Long intoCustRefId;

	/**功能码*/
	private String productCode;

	/**功能码子类*/
	private String blackType;

	/**功能码子类细项*/
	private String subBlackType;

	/**案件编号*/
	private String caseNo;

	/**公开日期(yyyyMMdd)*/
	private String publishDate;

	/**执行情况*/
	private String performance;

	/**省份*/
	private String province;

	/**判决法院*/
	private String court;

	/**执行义务*/
	private String duty;

	/**违反条例*/
	private String disruptTypeName;

	/**注册时间(yyyy-MM)*/
	private String regDate;

	/**执行金额(元)*/
	private String execMoney;

	/**黑名单类型*/
	private String blackTypeName;

	/**不良原因*/
	private String intoBlackReason;

	/**不良时间(yyyy-MM-dd)*/
	private String intoBlackTime;

	/**逾期金额  区间， 间隔符号"~"*/
	private String overdueAmount;

	/**逾期时长  区间， 间隔符号"~"*/
	private String overdueLong;

	/**备注*/
	private String remarks;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**创建人*/
	private Long createBy;

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
	 *方法: 获得intoCustRefId
	 *@return: java.lang.Long  intoCustRefId
	 */
	public Long getIntoCustRefId(){
		return this.intoCustRefId;
	}

	/**
	 *方法: 设置intoCustRefId
	 *@param: java.lang.Long  intoCustRefId
	 */
	public void setIntoCustRefId(Long intoCustRefId){
		this.intoCustRefId = intoCustRefId;
	}

	/**
	 *方法: 获得productCode
	 *@return: java.lang.String  productCode
	 */
	public String getProductCode(){
		return this.productCode;
	}

	/**
	 *方法: 设置productCode
	 *@param: java.lang.String  productCode
	 */
	public void setProductCode(String productCode){
		this.productCode = productCode;
	}

	/**
	 *方法: 获得blackType
	 *@return: java.lang.String  blackType
	 */
	public String getBlackType(){
		return this.blackType;
	}

	/**
	 *方法: 设置blackType
	 *@param: java.lang.String  blackType
	 */
	public void setBlackType(String blackType){
		this.blackType = blackType;
	}

	/**
	 *方法: 获得subBlackType
	 *@return: java.lang.String  subBlackType
	 */
	public String getSubBlackType(){
		return this.subBlackType;
	}

	/**
	 *方法: 设置subBlackType
	 *@param: java.lang.String  subBlackType
	 */
	public void setSubBlackType(String subBlackType){
		this.subBlackType = subBlackType;
	}

	/**
	 *方法: 获得caseNo
	 *@return: java.lang.String  caseNo
	 */
	public String getCaseNo(){
		return this.caseNo;
	}

	/**
	 *方法: 设置caseNo
	 *@param: java.lang.String  caseNo
	 */
	public void setCaseNo(String caseNo){
		this.caseNo = caseNo;
	}

	/**
	 *方法: 获得publishDate
	 *@return: java.lang.String  publishDate
	 */
	public String getPublishDate(){
		return this.publishDate;
	}

	/**
	 *方法: 设置publishDate
	 *@param: java.lang.String  publishDate
	 */
	public void setPublishDate(String publishDate){
		this.publishDate = publishDate;
	}

	/**
	 *方法: 获得performance
	 *@return: java.lang.String  performance
	 */
	public String getPerformance(){
		return this.performance;
	}

	/**
	 *方法: 设置performance
	 *@param: java.lang.String  performance
	 */
	public void setPerformance(String performance){
		this.performance = performance;
	}

	/**
	 *方法: 获得province
	 *@return: java.lang.String  province
	 */
	public String getProvince(){
		return this.province;
	}

	/**
	 *方法: 设置province
	 *@param: java.lang.String  province
	 */
	public void setProvince(String province){
		this.province = province;
	}

	/**
	 *方法: 获得court
	 *@return: java.lang.String  court
	 */
	public String getCourt(){
		return this.court;
	}

	/**
	 *方法: 设置court
	 *@param: java.lang.String  court
	 */
	public void setCourt(String court){
		this.court = court;
	}

	/**
	 *方法: 获得duty
	 *@return: java.lang.String  duty
	 */
	public String getDuty(){
		return this.duty;
	}

	/**
	 *方法: 设置duty
	 *@param: java.lang.String  duty
	 */
	public void setDuty(String duty){
		this.duty = duty;
	}

	/**
	 *方法: 获得disruptTypeName
	 *@return: java.lang.String  disruptTypeName
	 */
	public String getDisruptTypeName(){
		return this.disruptTypeName;
	}

	/**
	 *方法: 设置disruptTypeName
	 *@param: java.lang.String  disruptTypeName
	 */
	public void setDisruptTypeName(String disruptTypeName){
		this.disruptTypeName = disruptTypeName;
	}

	/**
	 *方法: 获得regDate
	 *@return: java.lang.String  regDate
	 */
	public String getRegDate(){
		return this.regDate;
	}

	/**
	 *方法: 设置regDate
	 *@param: java.lang.String  regDate
	 */
	public void setRegDate(String regDate){
		this.regDate = regDate;
	}

	/**
	 *方法: 获得execMoney
	 *@return: java.lang.String  execMoney
	 */
	public String getExecMoney(){
		return this.execMoney;
	}

	/**
	 *方法: 设置execMoney
	 *@param: java.lang.String  execMoney
	 */
	public void setExecMoney(String execMoney){
		this.execMoney = execMoney;
	}

	/**
	 *方法: 获得blackTypeName
	 *@return: java.lang.String  blackTypeName
	 */
	public String getBlackTypeName(){
		return this.blackTypeName;
	}

	/**
	 *方法: 设置blackTypeName
	 *@param: java.lang.String  blackTypeName
	 */
	public void setBlackTypeName(String blackTypeName){
		this.blackTypeName = blackTypeName;
	}

	/**
	 *方法: 获得intoBlackReason
	 *@return: java.lang.String  intoBlackReason
	 */
	public String getIntoBlackReason(){
		return this.intoBlackReason;
	}

	/**
	 *方法: 设置intoBlackReason
	 *@param: java.lang.String  intoBlackReason
	 */
	public void setIntoBlackReason(String intoBlackReason){
		this.intoBlackReason = intoBlackReason;
	}

	/**
	 *方法: 获得intoBlackTime
	 *@return: java.lang.String  intoBlackTime
	 */
	public String getIntoBlackTime(){
		return this.intoBlackTime;
	}

	/**
	 *方法: 设置intoBlackTime
	 *@param: java.lang.String  intoBlackTime
	 */
	public void setIntoBlackTime(String intoBlackTime){
		this.intoBlackTime = intoBlackTime;
	}

	/**
	 *方法: 获得overdueAmount
	 *@return: java.lang.String  overdueAmount
	 */
	public String getOverdueAmount(){
		return this.overdueAmount;
	}

	/**
	 *方法: 设置overdueAmount
	 *@param: java.lang.String  overdueAmount
	 */
	public void setOverdueAmount(String overdueAmount){
		this.overdueAmount = overdueAmount;
	}

	/**
	 *方法: 获得overdueLong
	 *@return: java.lang.String  overdueLong
	 */
	public String getOverdueLong(){
		return this.overdueLong;
	}

	/**
	 *方法: 设置overdueLong
	 *@param: java.lang.String  overdueLong
	 */
	public void setOverdueLong(String overdueLong){
		this.overdueLong = overdueLong;
	}

	/**
	 *方法: 获得remarks
	 *@return: java.lang.String  remarks
	 */
	public String getRemarks(){
		return this.remarks;
	}

	/**
	 *方法: 设置remarks
	 *@param: java.lang.String  remarks
	 */
	public void setRemarks(String remarks){
		this.remarks = remarks;
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