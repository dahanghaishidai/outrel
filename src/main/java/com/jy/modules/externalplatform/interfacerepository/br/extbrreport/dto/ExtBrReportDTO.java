package com.jy.modules.externalplatform.interfacerepository.br.extbrreport.dto;

import java.util.List;

import com.jy.modules.externalplatform.interfacerepository.br.extbrreportassessment.dto.ExtBrReportAssessmentDTO;
import com.jy.modules.externalplatform.interfacerepository.br.extbrreportlastweek.dto.ExtBrReportLastweekDTO;
import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:百融个人评估表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-07 15:56:28
 */
public class ExtBrReportDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**approveID*/
	private java.lang.String objectId;

	/**身份证号是否存在 0不存在 1存在*/
	private java.lang.String authenticationIdNum;

	/**手机号是否存在 0不存在 1存在*/
	private java.lang.String authenticationPhone;

	/**邮箱号是否存在 0不存在 1存在*/
	private java.lang.String authenticationMail;

	/**姓名是否存在 0不存在 1存在*/
	private java.lang.String authenticationName;

	/**家庭座机是否存在 0不存在 1存在*/
	private java.lang.String authenticationTelhome;

	/**核心主键关系*/
	private java.lang.String coreRelation;

	/**KEY值数*/
	private java.lang.String authenticationIdNumKey;

	/**KEY值数*/
	private java.lang.String authenticationPhoneKey;

	/**KEY值数*/
	private java.lang.String authenticationMailKey;

	/**KEY值数*/
	private java.lang.String authenticationNameKey;

	/**KEY值数*/
	private java.lang.String authenticationTelephoneKey;

	/**KEY值数*/
	private java.lang.String authenticationAddrKey;

	/**个人资产评估房产*/
	private java.lang.String assessmentHouse;

	/**个人资产评估车*/
	private java.lang.String assessmentCar;

	/**个人资产评估理财*/
	private java.lang.String assessmentMoney;

	/**个人资产评估财富*/
	private java.lang.String assessmentWealthType;

	/**兴趣top5*/
	private java.lang.String interestOne;

	/**兴趣top5*/
	private java.lang.String interestTwo;

	/**兴趣top5*/
	private java.lang.String interestThree;

	/**兴趣top5*/
	private java.lang.String interestFour;

	/**兴趣top5*/
	private java.lang.String interestFive;

	/**OPTLOCK*/
	private java.lang.Long optlock;

	/**企业职级评估*/
	private java.lang.String companyLevel;

	/**流水号*/
	private java.lang.String swiftNumber;

	/**公司座机是否存在 0不存在 1存在*/
	private java.lang.String authenticationTelbiz;

	/**个人过去一周数据是否存在*/
	private java.lang.String lastweekMsg;

	/**风险评估是否存在*/
	private java.lang.String assessmentMsg;
	
	/**风险评估是否存在*/
	private java.lang.String code;

	/**CREATE_TIME*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private java.lang.String createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**修改人*/
	private java.lang.String modifyBy;

	/**产品编码*/
	private java.lang.String prodCode;

	/**机构编码*/
	private java.lang.String orgCode;

	/**系统编码*/
	private java.lang.String sysCode;

	/**返回码 1：查有 2：查无 3：查询报错 4：解析错误 5:返回错误信息*/
	private java.lang.String retcode;

	/**返回错误信息*/
	private java.lang.String errormsg;

	/**接口日志ID*/
	private java.lang.String interfaceId;

	/**备注*/
	private java.lang.String remark;

	private List<ExtBrReportAssessmentDTO> brReportAssessments;
    private List<ExtBrReportLastweekDTO> brReportLastweeks;
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
	 *方法: 获得objectId
	 *@return: java.lang.String  objectId
	 */
	public java.lang.String getObjectId(){
		return this.objectId;
	}

	/**
	 *方法: 设置objectId
	 *@param: java.lang.String  objectId
	 */
	public void setObjectId(java.lang.String objectId){
		this.objectId = objectId;
	}

	/**
	 *方法: 获得authenticationIdNum
	 *@return: java.lang.String  authenticationIdNum
	 */
	public java.lang.String getAuthenticationIdNum(){
		return this.authenticationIdNum;
	}

	/**
	 *方法: 设置authenticationIdNum
	 *@param: java.lang.String  authenticationIdNum
	 */
	public void setAuthenticationIdNum(java.lang.String authenticationIdNum){
		this.authenticationIdNum = authenticationIdNum;
	}

	/**
	 *方法: 获得authenticationPhone
	 *@return: java.lang.String  authenticationPhone
	 */
	public java.lang.String getAuthenticationPhone(){
		return this.authenticationPhone;
	}

	/**
	 *方法: 设置authenticationPhone
	 *@param: java.lang.String  authenticationPhone
	 */
	public void setAuthenticationPhone(java.lang.String authenticationPhone){
		this.authenticationPhone = authenticationPhone;
	}

	/**
	 *方法: 获得authenticationMail
	 *@return: java.lang.String  authenticationMail
	 */
	public java.lang.String getAuthenticationMail(){
		return this.authenticationMail;
	}

	/**
	 *方法: 设置authenticationMail
	 *@param: java.lang.String  authenticationMail
	 */
	public void setAuthenticationMail(java.lang.String authenticationMail){
		this.authenticationMail = authenticationMail;
	}

	/**
	 *方法: 获得authenticationName
	 *@return: java.lang.String  authenticationName
	 */
	public java.lang.String getAuthenticationName(){
		return this.authenticationName;
	}

	/**
	 *方法: 设置authenticationName
	 *@param: java.lang.String  authenticationName
	 */
	public void setAuthenticationName(java.lang.String authenticationName){
		this.authenticationName = authenticationName;
	}

	/**
	 *方法: 获得authenticationTelhome
	 *@return: java.lang.String  authenticationTelhome
	 */
	public java.lang.String getAuthenticationTelhome(){
		return this.authenticationTelhome;
	}

	/**
	 *方法: 设置authenticationTelhome
	 *@param: java.lang.String  authenticationTelhome
	 */
	public void setAuthenticationTelhome(java.lang.String authenticationTelhome){
		this.authenticationTelhome = authenticationTelhome;
	}

	/**
	 *方法: 获得coreRelation
	 *@return: java.lang.String  coreRelation
	 */
	public java.lang.String getCoreRelation(){
		return this.coreRelation;
	}

	/**
	 *方法: 设置coreRelation
	 *@param: java.lang.String  coreRelation
	 */
	public void setCoreRelation(java.lang.String coreRelation){
		this.coreRelation = coreRelation;
	}

	/**
	 *方法: 获得authenticationIdNumKey
	 *@return: java.lang.String  authenticationIdNumKey
	 */
	public java.lang.String getAuthenticationIdNumKey(){
		return this.authenticationIdNumKey;
	}

	/**
	 *方法: 设置authenticationIdNumKey
	 *@param: java.lang.String  authenticationIdNumKey
	 */
	public void setAuthenticationIdNumKey(java.lang.String authenticationIdNumKey){
		this.authenticationIdNumKey = authenticationIdNumKey;
	}

	/**
	 *方法: 获得authenticationPhoneKey
	 *@return: java.lang.String  authenticationPhoneKey
	 */
	public java.lang.String getAuthenticationPhoneKey(){
		return this.authenticationPhoneKey;
	}

	/**
	 *方法: 设置authenticationPhoneKey
	 *@param: java.lang.String  authenticationPhoneKey
	 */
	public void setAuthenticationPhoneKey(java.lang.String authenticationPhoneKey){
		this.authenticationPhoneKey = authenticationPhoneKey;
	}

	/**
	 *方法: 获得authenticationMailKey
	 *@return: java.lang.String  authenticationMailKey
	 */
	public java.lang.String getAuthenticationMailKey(){
		return this.authenticationMailKey;
	}

	/**
	 *方法: 设置authenticationMailKey
	 *@param: java.lang.String  authenticationMailKey
	 */
	public void setAuthenticationMailKey(java.lang.String authenticationMailKey){
		this.authenticationMailKey = authenticationMailKey;
	}

	/**
	 *方法: 获得authenticationNameKey
	 *@return: java.lang.String  authenticationNameKey
	 */
	public java.lang.String getAuthenticationNameKey(){
		return this.authenticationNameKey;
	}

	/**
	 *方法: 设置authenticationNameKey
	 *@param: java.lang.String  authenticationNameKey
	 */
	public void setAuthenticationNameKey(java.lang.String authenticationNameKey){
		this.authenticationNameKey = authenticationNameKey;
	}

	/**
	 *方法: 获得authenticationTelephoneKey
	 *@return: java.lang.String  authenticationTelephoneKey
	 */
	public java.lang.String getAuthenticationTelephoneKey(){
		return this.authenticationTelephoneKey;
	}

	/**
	 *方法: 设置authenticationTelephoneKey
	 *@param: java.lang.String  authenticationTelephoneKey
	 */
	public void setAuthenticationTelephoneKey(java.lang.String authenticationTelephoneKey){
		this.authenticationTelephoneKey = authenticationTelephoneKey;
	}

	/**
	 *方法: 获得authenticationAddrKey
	 *@return: java.lang.String  authenticationAddrKey
	 */
	public java.lang.String getAuthenticationAddrKey(){
		return this.authenticationAddrKey;
	}

	/**
	 *方法: 设置authenticationAddrKey
	 *@param: java.lang.String  authenticationAddrKey
	 */
	public void setAuthenticationAddrKey(java.lang.String authenticationAddrKey){
		this.authenticationAddrKey = authenticationAddrKey;
	}

	/**
	 *方法: 获得assessmentHouse
	 *@return: java.lang.String  assessmentHouse
	 */
	public java.lang.String getAssessmentHouse(){
		return this.assessmentHouse;
	}

	/**
	 *方法: 设置assessmentHouse
	 *@param: java.lang.String  assessmentHouse
	 */
	public void setAssessmentHouse(java.lang.String assessmentHouse){
		this.assessmentHouse = assessmentHouse;
	}

	/**
	 *方法: 获得assessmentCar
	 *@return: java.lang.String  assessmentCar
	 */
	public java.lang.String getAssessmentCar(){
		return this.assessmentCar;
	}

	/**
	 *方法: 设置assessmentCar
	 *@param: java.lang.String  assessmentCar
	 */
	public void setAssessmentCar(java.lang.String assessmentCar){
		this.assessmentCar = assessmentCar;
	}

	/**
	 *方法: 获得assessmentMoney
	 *@return: java.lang.String  assessmentMoney
	 */
	public java.lang.String getAssessmentMoney(){
		return this.assessmentMoney;
	}

	/**
	 *方法: 设置assessmentMoney
	 *@param: java.lang.String  assessmentMoney
	 */
	public void setAssessmentMoney(java.lang.String assessmentMoney){
		this.assessmentMoney = assessmentMoney;
	}

	/**
	 *方法: 获得assessmentWealthType
	 *@return: java.lang.String  assessmentWealthType
	 */
	public java.lang.String getAssessmentWealthType(){
		return this.assessmentWealthType;
	}

	/**
	 *方法: 设置assessmentWealthType
	 *@param: java.lang.String  assessmentWealthType
	 */
	public void setAssessmentWealthType(java.lang.String assessmentWealthType){
		this.assessmentWealthType = assessmentWealthType;
	}

	/**
	 *方法: 获得interestOne
	 *@return: java.lang.String  interestOne
	 */
	public java.lang.String getInterestOne(){
		return this.interestOne;
	}

	/**
	 *方法: 设置interestOne
	 *@param: java.lang.String  interestOne
	 */
	public void setInterestOne(java.lang.String interestOne){
		this.interestOne = interestOne;
	}

	/**
	 *方法: 获得interestTwo
	 *@return: java.lang.String  interestTwo
	 */
	public java.lang.String getInterestTwo(){
		return this.interestTwo;
	}

	/**
	 *方法: 设置interestTwo
	 *@param: java.lang.String  interestTwo
	 */
	public void setInterestTwo(java.lang.String interestTwo){
		this.interestTwo = interestTwo;
	}

	/**
	 *方法: 获得interestThree
	 *@return: java.lang.String  interestThree
	 */
	public java.lang.String getInterestThree(){
		return this.interestThree;
	}

	/**
	 *方法: 设置interestThree
	 *@param: java.lang.String  interestThree
	 */
	public void setInterestThree(java.lang.String interestThree){
		this.interestThree = interestThree;
	}

	/**
	 *方法: 获得interestFour
	 *@return: java.lang.String  interestFour
	 */
	public java.lang.String getInterestFour(){
		return this.interestFour;
	}

	/**
	 *方法: 设置interestFour
	 *@param: java.lang.String  interestFour
	 */
	public void setInterestFour(java.lang.String interestFour){
		this.interestFour = interestFour;
	}

	/**
	 *方法: 获得interestFive
	 *@return: java.lang.String  interestFive
	 */
	public java.lang.String getInterestFive(){
		return this.interestFive;
	}

	/**
	 *方法: 设置interestFive
	 *@param: java.lang.String  interestFive
	 */
	public void setInterestFive(java.lang.String interestFive){
		this.interestFive = interestFive;
	}

	/**
	 *方法: 获得optlock
	 *@return: java.lang.Long  optlock
	 */
	public java.lang.Long getOptlock(){
		return this.optlock;
	}

	/**
	 *方法: 设置optlock
	 *@param: java.lang.Long  optlock
	 */
	public void setOptlock(java.lang.Long optlock){
		this.optlock = optlock;
	}

	/**
	 *方法: 获得companyLevel
	 *@return: java.lang.String  companyLevel
	 */
	public java.lang.String getCompanyLevel(){
		return this.companyLevel;
	}

	/**
	 *方法: 设置companyLevel
	 *@param: java.lang.String  companyLevel
	 */
	public void setCompanyLevel(java.lang.String companyLevel){
		this.companyLevel = companyLevel;
	}

	/**
	 *方法: 获得swiftNumber
	 *@return: java.lang.String  swiftNumber
	 */
	public java.lang.String getSwiftNumber(){
		return this.swiftNumber;
	}

	/**
	 *方法: 设置swiftNumber
	 *@param: java.lang.String  swiftNumber
	 */
	public void setSwiftNumber(java.lang.String swiftNumber){
		this.swiftNumber = swiftNumber;
	}

	/**
	 *方法: 获得authenticationTelbiz
	 *@return: java.lang.String  authenticationTelbiz
	 */
	public java.lang.String getAuthenticationTelbiz(){
		return this.authenticationTelbiz;
	}

	/**
	 *方法: 设置authenticationTelbiz
	 *@param: java.lang.String  authenticationTelbiz
	 */
	public void setAuthenticationTelbiz(java.lang.String authenticationTelbiz){
		this.authenticationTelbiz = authenticationTelbiz;
	}

	/**
	 *方法: 获得lastweekMsg
	 *@return: java.lang.String  lastweekMsg
	 */
	public java.lang.String getLastweekMsg(){
		return this.lastweekMsg;
	}

	/**
	 *方法: 设置lastweekMsg
	 *@param: java.lang.String  lastweekMsg
	 */
	public void setLastweekMsg(java.lang.String lastweekMsg){
		this.lastweekMsg = lastweekMsg;
	}

	/**
	 *方法: 获得assessmentMsg
	 *@return: java.lang.String  assessmentMsg
	 */
	public java.lang.String getAssessmentMsg(){
		return this.assessmentMsg;
	}

	/**
	 *方法: 设置assessmentMsg
	 *@param: java.lang.String  assessmentMsg
	 */
	public void setAssessmentMsg(java.lang.String assessmentMsg){
		this.assessmentMsg = assessmentMsg;
	}

	public java.lang.String getCode() {
		return code;
	}

	public void setCode(java.lang.String code) {
		this.code = code;
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
	 *@return: java.lang.String  createBy
	 */
	public java.lang.String getCreateBy(){
		return this.createBy;
	}

	/**
	 *方法: 设置createBy
	 *@param: java.lang.String  createBy
	 */
	public void setCreateBy(java.lang.String createBy){
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
	 *@return: java.lang.String  modifyBy
	 */
	public java.lang.String getModifyBy(){
		return this.modifyBy;
	}

	/**
	 *方法: 设置modifyBy
	 *@param: java.lang.String  modifyBy
	 */
	public void setModifyBy(java.lang.String modifyBy){
		this.modifyBy = modifyBy;
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

	public List<ExtBrReportAssessmentDTO> getBrReportAssessments() {
		return brReportAssessments;
	}

	public void setBrReportAssessments(List<ExtBrReportAssessmentDTO> brReportAssessments) {
		this.brReportAssessments = brReportAssessments;
	}

	public List<ExtBrReportLastweekDTO> getBrReportLastweeks() {
		return brReportLastweeks;
	}

	public void setBrReportLastweeks(List<ExtBrReportLastweekDTO> brReportLastweeks) {
		this.brReportLastweeks = brReportLastweeks;
	}

}