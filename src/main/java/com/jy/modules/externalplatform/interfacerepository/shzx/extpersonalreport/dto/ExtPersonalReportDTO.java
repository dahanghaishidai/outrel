package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreport.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:网络金融版个人信用报告
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-05 10:07:24
 */
public class ExtPersonalReportDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**查询原因*/
	private java.lang.String queryCauses;

	/**报告编号*/
	private java.lang.String reportNumber;

	/**报告时间*/
	private java.lang.String reportTime;

	/**姓名*/
	private java.lang.String name;

	/**证件类型*/
	private java.lang.String certificatesType;

	/**证件号码*/
	private java.lang.String certificatesNumber;

	/**性别*/
	private java.lang.String sex;

	/**出生日期*/
	private java.lang.String birthDate;

	/**婚姻明细*/
	private java.lang.String marriage;

	/**信息获取日期*/
	private java.lang.String marriageObtainDate;

	/**最高学历*/
	private java.lang.String education;

	/**信息获取日期*/
	private java.lang.String educationObtainDate;

	/**职称*/
	private java.lang.String title;

	/**职称明细*/
	private java.lang.String titleObtainDate;

	/**住宅电话明细*/
	private java.lang.String telephone;

	/**信息获取日期*/
	private java.lang.String telephoneObtainDate;

	/**手机号码*/
	private java.lang.String phoneNumber;

	/**信息获取日期*/
	private java.lang.String phoneNumberObtainDate;

	/**电子邮箱*/
	private java.lang.String email;

	/**信息获取日期*/
	private java.lang.String emailObtainDate;

	/**第一联系人姓名*/
	private java.lang.String contactsNameFirest;

	/**第一联系人关系*/
	private java.lang.String contactsRelationFirest;

	/**第一联系人电话*/
	private java.lang.String contactsPhoneNumberFirest;

	/**第一联系人信息获取日期*/
	private java.lang.String contactsObtainDateFirest;

	/**贷款申请信息*/
	private java.lang.String loanApplyInfo;

	/**为他人担保信息*/
	private java.lang.String forOtherGuaranteeInfo;

	/**查询信息*/
	private java.lang.String queryInfo;

	/**个人声明信息*/
	private java.lang.String personalstatementInfo;

	/**流程ID*/
	private java.lang.String objectId;

	/**配偶姓名*/
	private java.lang.String wifeName;

	/**配偶证件类型*/
	private java.lang.String wifeCertificatesType;

	/**配偶证件号码*/
	private java.lang.String wifeCertificatesNumber;

	/**配偶性别*/
	private java.lang.String wifeSex;

	/**配偶出生日期*/
	private java.lang.String wifeBirthDate;

	/**配偶工作单位明细*/
	private java.lang.String wifeWorkInfo;

	/**配偶工作单位明细信息获取日期*/
	private java.lang.String wifeWorkInfoDate;

	/**配偶联系电话明细*/
	private java.lang.String wifeTel;

	/**配偶联系电话明细信息获取日期*/
	private java.lang.String wifeTelDate;

	/**第二联系人姓名*/
	private java.lang.String contactsNameSecond;

	/**第二联系人关系*/
	private java.lang.String contactsRelationSecond;

	/**第二联系人电话*/
	private java.lang.String contactsPhoneNumberSecond;

	/**第二联系人信息获取日期*/
	private java.lang.String contactsObtainDateSecond;

	/**贷款笔数*/
	private java.lang.String loanCount;

	/**首贷日*/
	private java.lang.String loanFirstDate;

	/**最大授信额度*/
	private java.lang.String creditMax;

	/**贷款总额*/
	private java.lang.String loanTotal;

	/**贷款余额*/
	private java.lang.String loanOver;

	/**协定月还款*/
	private java.lang.String repaymentMonth;

	/**当前逾期总额*/
	private java.lang.String overdueTotal;

	/**最高逾期金额*/
	private java.lang.String overdueMax;

	/**最高逾期*/
	private java.lang.String overdueIssue;

	/**OPTLOCK*/
	private java.lang.Long optlock;

	/**错误信息*/
	private java.lang.String error;

	/**贷款*/
	private java.lang.String credMsg;

	/**查询记录*/
	private java.lang.String sechMsg;

	/**地址*/
	private java.lang.String addrMsg;

	/**特殊交易信息*/
	private java.lang.String spelMsg;

	/**为他人担保*/
	private java.lang.String oterMsg;

	/**工作*/
	private java.lang.String workMsg;

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
	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

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
	 *方法: 获得queryCauses
	 *@return: java.lang.String  queryCauses
	 */
	public java.lang.String getQueryCauses(){
		return this.queryCauses;
	}

	/**
	 *方法: 设置queryCauses
	 *@param: java.lang.String  queryCauses
	 */
	public void setQueryCauses(java.lang.String queryCauses){
		this.queryCauses = queryCauses;
	}

	/**
	 *方法: 获得reportNumber
	 *@return: java.lang.String  reportNumber
	 */
	public java.lang.String getReportNumber(){
		return this.reportNumber;
	}

	/**
	 *方法: 设置reportNumber
	 *@param: java.lang.String  reportNumber
	 */
	public void setReportNumber(java.lang.String reportNumber){
		this.reportNumber = reportNumber;
	}

	/**
	 *方法: 获得reportTime
	 *@return: java.lang.String  reportTime
	 */
	public java.lang.String getReportTime(){
		return this.reportTime;
	}

	/**
	 *方法: 设置reportTime
	 *@param: java.lang.String  reportTime
	 */
	public void setReportTime(java.lang.String reportTime){
		this.reportTime = reportTime;
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

	/**
	 *方法: 获得certificatesType
	 *@return: java.lang.String  certificatesType
	 */
	public java.lang.String getCertificatesType(){
		return this.certificatesType;
	}

	/**
	 *方法: 设置certificatesType
	 *@param: java.lang.String  certificatesType
	 */
	public void setCertificatesType(java.lang.String certificatesType){
		this.certificatesType = certificatesType;
	}

	/**
	 *方法: 获得certificatesNumber
	 *@return: java.lang.String  certificatesNumber
	 */
	public java.lang.String getCertificatesNumber(){
		return this.certificatesNumber;
	}

	/**
	 *方法: 设置certificatesNumber
	 *@param: java.lang.String  certificatesNumber
	 */
	public void setCertificatesNumber(java.lang.String certificatesNumber){
		this.certificatesNumber = certificatesNumber;
	}

	/**
	 *方法: 获得sex
	 *@return: java.lang.String  sex
	 */
	public java.lang.String getSex(){
		return this.sex;
	}

	/**
	 *方法: 设置sex
	 *@param: java.lang.String  sex
	 */
	public void setSex(java.lang.String sex){
		this.sex = sex;
	}

	/**
	 *方法: 获得birthDate
	 *@return: java.lang.String  birthDate
	 */
	public java.lang.String getBirthDate(){
		return this.birthDate;
	}

	/**
	 *方法: 设置birthDate
	 *@param: java.lang.String  birthDate
	 */
	public void setBirthDate(java.lang.String birthDate){
		this.birthDate = birthDate;
	}

	/**
	 *方法: 获得marriage
	 *@return: java.lang.String  marriage
	 */
	public java.lang.String getMarriage(){
		return this.marriage;
	}

	/**
	 *方法: 设置marriage
	 *@param: java.lang.String  marriage
	 */
	public void setMarriage(java.lang.String marriage){
		this.marriage = marriage;
	}

	/**
	 *方法: 获得marriageObtainDate
	 *@return: java.lang.String  marriageObtainDate
	 */
	public java.lang.String getMarriageObtainDate(){
		return this.marriageObtainDate;
	}

	/**
	 *方法: 设置marriageObtainDate
	 *@param: java.lang.String  marriageObtainDate
	 */
	public void setMarriageObtainDate(java.lang.String marriageObtainDate){
		this.marriageObtainDate = marriageObtainDate;
	}

	/**
	 *方法: 获得education
	 *@return: java.lang.String  education
	 */
	public java.lang.String getEducation(){
		return this.education;
	}

	/**
	 *方法: 设置education
	 *@param: java.lang.String  education
	 */
	public void setEducation(java.lang.String education){
		this.education = education;
	}

	/**
	 *方法: 获得educationObtainDate
	 *@return: java.lang.String  educationObtainDate
	 */
	public java.lang.String getEducationObtainDate(){
		return this.educationObtainDate;
	}

	/**
	 *方法: 设置educationObtainDate
	 *@param: java.lang.String  educationObtainDate
	 */
	public void setEducationObtainDate(java.lang.String educationObtainDate){
		this.educationObtainDate = educationObtainDate;
	}

	/**
	 *方法: 获得title
	 *@return: java.lang.String  title
	 */
	public java.lang.String getTitle(){
		return this.title;
	}

	/**
	 *方法: 设置title
	 *@param: java.lang.String  title
	 */
	public void setTitle(java.lang.String title){
		this.title = title;
	}

	/**
	 *方法: 获得titleObtainDate
	 *@return: java.lang.String  titleObtainDate
	 */
	public java.lang.String getTitleObtainDate(){
		return this.titleObtainDate;
	}

	/**
	 *方法: 设置titleObtainDate
	 *@param: java.lang.String  titleObtainDate
	 */
	public void setTitleObtainDate(java.lang.String titleObtainDate){
		this.titleObtainDate = titleObtainDate;
	}

	/**
	 *方法: 获得telephone
	 *@return: java.lang.String  telephone
	 */
	public java.lang.String getTelephone(){
		return this.telephone;
	}

	/**
	 *方法: 设置telephone
	 *@param: java.lang.String  telephone
	 */
	public void setTelephone(java.lang.String telephone){
		this.telephone = telephone;
	}

	/**
	 *方法: 获得telephoneObtainDate
	 *@return: java.lang.String  telephoneObtainDate
	 */
	public java.lang.String getTelephoneObtainDate(){
		return this.telephoneObtainDate;
	}

	/**
	 *方法: 设置telephoneObtainDate
	 *@param: java.lang.String  telephoneObtainDate
	 */
	public void setTelephoneObtainDate(java.lang.String telephoneObtainDate){
		this.telephoneObtainDate = telephoneObtainDate;
	}

	/**
	 *方法: 获得phoneNumber
	 *@return: java.lang.String  phoneNumber
	 */
	public java.lang.String getPhoneNumber(){
		return this.phoneNumber;
	}

	/**
	 *方法: 设置phoneNumber
	 *@param: java.lang.String  phoneNumber
	 */
	public void setPhoneNumber(java.lang.String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	/**
	 *方法: 获得phoneNumberObtainDate
	 *@return: java.lang.String  phoneNumberObtainDate
	 */
	public java.lang.String getPhoneNumberObtainDate(){
		return this.phoneNumberObtainDate;
	}

	/**
	 *方法: 设置phoneNumberObtainDate
	 *@param: java.lang.String  phoneNumberObtainDate
	 */
	public void setPhoneNumberObtainDate(java.lang.String phoneNumberObtainDate){
		this.phoneNumberObtainDate = phoneNumberObtainDate;
	}

	/**
	 *方法: 获得email
	 *@return: java.lang.String  email
	 */
	public java.lang.String getEmail(){
		return this.email;
	}

	/**
	 *方法: 设置email
	 *@param: java.lang.String  email
	 */
	public void setEmail(java.lang.String email){
		this.email = email;
	}

	/**
	 *方法: 获得emailObtainDate
	 *@return: java.lang.String  emailObtainDate
	 */
	public java.lang.String getEmailObtainDate(){
		return this.emailObtainDate;
	}

	/**
	 *方法: 设置emailObtainDate
	 *@param: java.lang.String  emailObtainDate
	 */
	public void setEmailObtainDate(java.lang.String emailObtainDate){
		this.emailObtainDate = emailObtainDate;
	}

	/**
	 *方法: 获得contactsNameFirest
	 *@return: java.lang.String  contactsNameFirest
	 */
	public java.lang.String getContactsNameFirest(){
		return this.contactsNameFirest;
	}

	/**
	 *方法: 设置contactsNameFirest
	 *@param: java.lang.String  contactsNameFirest
	 */
	public void setContactsNameFirest(java.lang.String contactsNameFirest){
		this.contactsNameFirest = contactsNameFirest;
	}

	/**
	 *方法: 获得contactsRelationFirest
	 *@return: java.lang.String  contactsRelationFirest
	 */
	public java.lang.String getContactsRelationFirest(){
		return this.contactsRelationFirest;
	}

	/**
	 *方法: 设置contactsRelationFirest
	 *@param: java.lang.String  contactsRelationFirest
	 */
	public void setContactsRelationFirest(java.lang.String contactsRelationFirest){
		this.contactsRelationFirest = contactsRelationFirest;
	}

	/**
	 *方法: 获得contactsPhoneNumberFirest
	 *@return: java.lang.String  contactsPhoneNumberFirest
	 */
	public java.lang.String getContactsPhoneNumberFirest(){
		return this.contactsPhoneNumberFirest;
	}

	/**
	 *方法: 设置contactsPhoneNumberFirest
	 *@param: java.lang.String  contactsPhoneNumberFirest
	 */
	public void setContactsPhoneNumberFirest(java.lang.String contactsPhoneNumberFirest){
		this.contactsPhoneNumberFirest = contactsPhoneNumberFirest;
	}

	/**
	 *方法: 获得contactsObtainDateFirest
	 *@return: java.lang.String  contactsObtainDateFirest
	 */
	public java.lang.String getContactsObtainDateFirest(){
		return this.contactsObtainDateFirest;
	}

	/**
	 *方法: 设置contactsObtainDateFirest
	 *@param: java.lang.String  contactsObtainDateFirest
	 */
	public void setContactsObtainDateFirest(java.lang.String contactsObtainDateFirest){
		this.contactsObtainDateFirest = contactsObtainDateFirest;
	}

	/**
	 *方法: 获得loanApplyInfo
	 *@return: java.lang.String  loanApplyInfo
	 */
	public java.lang.String getLoanApplyInfo(){
		return this.loanApplyInfo;
	}

	/**
	 *方法: 设置loanApplyInfo
	 *@param: java.lang.String  loanApplyInfo
	 */
	public void setLoanApplyInfo(java.lang.String loanApplyInfo){
		this.loanApplyInfo = loanApplyInfo;
	}

	/**
	 *方法: 获得forOtherGuaranteeInfo
	 *@return: java.lang.String  forOtherGuaranteeInfo
	 */
	public java.lang.String getForOtherGuaranteeInfo(){
		return this.forOtherGuaranteeInfo;
	}

	/**
	 *方法: 设置forOtherGuaranteeInfo
	 *@param: java.lang.String  forOtherGuaranteeInfo
	 */
	public void setForOtherGuaranteeInfo(java.lang.String forOtherGuaranteeInfo){
		this.forOtherGuaranteeInfo = forOtherGuaranteeInfo;
	}

	/**
	 *方法: 获得queryInfo
	 *@return: java.lang.String  queryInfo
	 */
	public java.lang.String getQueryInfo(){
		return this.queryInfo;
	}

	/**
	 *方法: 设置queryInfo
	 *@param: java.lang.String  queryInfo
	 */
	public void setQueryInfo(java.lang.String queryInfo){
		this.queryInfo = queryInfo;
	}

	/**
	 *方法: 获得personalstatementInfo
	 *@return: java.lang.String  personalstatementInfo
	 */
	public java.lang.String getPersonalstatementInfo(){
		return this.personalstatementInfo;
	}

	/**
	 *方法: 设置personalstatementInfo
	 *@param: java.lang.String  personalstatementInfo
	 */
	public void setPersonalstatementInfo(java.lang.String personalstatementInfo){
		this.personalstatementInfo = personalstatementInfo;
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
	 *方法: 获得wifeName
	 *@return: java.lang.String  wifeName
	 */
	public java.lang.String getWifeName(){
		return this.wifeName;
	}

	/**
	 *方法: 设置wifeName
	 *@param: java.lang.String  wifeName
	 */
	public void setWifeName(java.lang.String wifeName){
		this.wifeName = wifeName;
	}

	/**
	 *方法: 获得wifeCertificatesType
	 *@return: java.lang.String  wifeCertificatesType
	 */
	public java.lang.String getWifeCertificatesType(){
		return this.wifeCertificatesType;
	}

	/**
	 *方法: 设置wifeCertificatesType
	 *@param: java.lang.String  wifeCertificatesType
	 */
	public void setWifeCertificatesType(java.lang.String wifeCertificatesType){
		this.wifeCertificatesType = wifeCertificatesType;
	}

	/**
	 *方法: 获得wifeCertificatesNumber
	 *@return: java.lang.String  wifeCertificatesNumber
	 */
	public java.lang.String getWifeCertificatesNumber(){
		return this.wifeCertificatesNumber;
	}

	/**
	 *方法: 设置wifeCertificatesNumber
	 *@param: java.lang.String  wifeCertificatesNumber
	 */
	public void setWifeCertificatesNumber(java.lang.String wifeCertificatesNumber){
		this.wifeCertificatesNumber = wifeCertificatesNumber;
	}

	/**
	 *方法: 获得wifeSex
	 *@return: java.lang.String  wifeSex
	 */
	public java.lang.String getWifeSex(){
		return this.wifeSex;
	}

	/**
	 *方法: 设置wifeSex
	 *@param: java.lang.String  wifeSex
	 */
	public void setWifeSex(java.lang.String wifeSex){
		this.wifeSex = wifeSex;
	}

	/**
	 *方法: 获得wifeBirthDate
	 *@return: java.lang.String  wifeBirthDate
	 */
	public java.lang.String getWifeBirthDate(){
		return this.wifeBirthDate;
	}

	/**
	 *方法: 设置wifeBirthDate
	 *@param: java.lang.String  wifeBirthDate
	 */
	public void setWifeBirthDate(java.lang.String wifeBirthDate){
		this.wifeBirthDate = wifeBirthDate;
	}

	/**
	 *方法: 获得wifeWorkInfo
	 *@return: java.lang.String  wifeWorkInfo
	 */
	public java.lang.String getWifeWorkInfo(){
		return this.wifeWorkInfo;
	}

	/**
	 *方法: 设置wifeWorkInfo
	 *@param: java.lang.String  wifeWorkInfo
	 */
	public void setWifeWorkInfo(java.lang.String wifeWorkInfo){
		this.wifeWorkInfo = wifeWorkInfo;
	}

	/**
	 *方法: 获得wifeWorkInfoDate
	 *@return: java.lang.String  wifeWorkInfoDate
	 */
	public java.lang.String getWifeWorkInfoDate(){
		return this.wifeWorkInfoDate;
	}

	/**
	 *方法: 设置wifeWorkInfoDate
	 *@param: java.lang.String  wifeWorkInfoDate
	 */
	public void setWifeWorkInfoDate(java.lang.String wifeWorkInfoDate){
		this.wifeWorkInfoDate = wifeWorkInfoDate;
	}

	/**
	 *方法: 获得wifeTel
	 *@return: java.lang.String  wifeTel
	 */
	public java.lang.String getWifeTel(){
		return this.wifeTel;
	}

	/**
	 *方法: 设置wifeTel
	 *@param: java.lang.String  wifeTel
	 */
	public void setWifeTel(java.lang.String wifeTel){
		this.wifeTel = wifeTel;
	}

	/**
	 *方法: 获得wifeTelDate
	 *@return: java.lang.String  wifeTelDate
	 */
	public java.lang.String getWifeTelDate(){
		return this.wifeTelDate;
	}

	/**
	 *方法: 设置wifeTelDate
	 *@param: java.lang.String  wifeTelDate
	 */
	public void setWifeTelDate(java.lang.String wifeTelDate){
		this.wifeTelDate = wifeTelDate;
	}

	/**
	 *方法: 获得contactsNameSecond
	 *@return: java.lang.String  contactsNameSecond
	 */
	public java.lang.String getContactsNameSecond(){
		return this.contactsNameSecond;
	}

	/**
	 *方法: 设置contactsNameSecond
	 *@param: java.lang.String  contactsNameSecond
	 */
	public void setContactsNameSecond(java.lang.String contactsNameSecond){
		this.contactsNameSecond = contactsNameSecond;
	}

	/**
	 *方法: 获得contactsRelationSecond
	 *@return: java.lang.String  contactsRelationSecond
	 */
	public java.lang.String getContactsRelationSecond(){
		return this.contactsRelationSecond;
	}

	/**
	 *方法: 设置contactsRelationSecond
	 *@param: java.lang.String  contactsRelationSecond
	 */
	public void setContactsRelationSecond(java.lang.String contactsRelationSecond){
		this.contactsRelationSecond = contactsRelationSecond;
	}

	/**
	 *方法: 获得contactsPhoneNumberSecond
	 *@return: java.lang.String  contactsPhoneNumberSecond
	 */
	public java.lang.String getContactsPhoneNumberSecond(){
		return this.contactsPhoneNumberSecond;
	}

	/**
	 *方法: 设置contactsPhoneNumberSecond
	 *@param: java.lang.String  contactsPhoneNumberSecond
	 */
	public void setContactsPhoneNumberSecond(java.lang.String contactsPhoneNumberSecond){
		this.contactsPhoneNumberSecond = contactsPhoneNumberSecond;
	}

	/**
	 *方法: 获得contactsObtainDateSecond
	 *@return: java.lang.String  contactsObtainDateSecond
	 */
	public java.lang.String getContactsObtainDateSecond(){
		return this.contactsObtainDateSecond;
	}

	/**
	 *方法: 设置contactsObtainDateSecond
	 *@param: java.lang.String  contactsObtainDateSecond
	 */
	public void setContactsObtainDateSecond(java.lang.String contactsObtainDateSecond){
		this.contactsObtainDateSecond = contactsObtainDateSecond;
	}

	/**
	 *方法: 获得loanCount
	 *@return: java.lang.String  loanCount
	 */
	public java.lang.String getLoanCount(){
		return this.loanCount;
	}

	/**
	 *方法: 设置loanCount
	 *@param: java.lang.String  loanCount
	 */
	public void setLoanCount(java.lang.String loanCount){
		this.loanCount = loanCount;
	}

	/**
	 *方法: 获得loanFirstDate
	 *@return: java.lang.String  loanFirstDate
	 */
	public java.lang.String getLoanFirstDate(){
		return this.loanFirstDate;
	}

	/**
	 *方法: 设置loanFirstDate
	 *@param: java.lang.String  loanFirstDate
	 */
	public void setLoanFirstDate(java.lang.String loanFirstDate){
		this.loanFirstDate = loanFirstDate;
	}

	/**
	 *方法: 获得creditMax
	 *@return: java.lang.String  creditMax
	 */
	public java.lang.String getCreditMax(){
		return this.creditMax;
	}

	/**
	 *方法: 设置creditMax
	 *@param: java.lang.String  creditMax
	 */
	public void setCreditMax(java.lang.String creditMax){
		this.creditMax = creditMax;
	}

	/**
	 *方法: 获得loanTotal
	 *@return: java.lang.String  loanTotal
	 */
	public java.lang.String getLoanTotal(){
		return this.loanTotal;
	}

	/**
	 *方法: 设置loanTotal
	 *@param: java.lang.String  loanTotal
	 */
	public void setLoanTotal(java.lang.String loanTotal){
		this.loanTotal = loanTotal;
	}

	/**
	 *方法: 获得loanOver
	 *@return: java.lang.String  loanOver
	 */
	public java.lang.String getLoanOver(){
		return this.loanOver;
	}

	/**
	 *方法: 设置loanOver
	 *@param: java.lang.String  loanOver
	 */
	public void setLoanOver(java.lang.String loanOver){
		this.loanOver = loanOver;
	}

	/**
	 *方法: 获得repaymentMonth
	 *@return: java.lang.String  repaymentMonth
	 */
	public java.lang.String getRepaymentMonth(){
		return this.repaymentMonth;
	}

	/**
	 *方法: 设置repaymentMonth
	 *@param: java.lang.String  repaymentMonth
	 */
	public void setRepaymentMonth(java.lang.String repaymentMonth){
		this.repaymentMonth = repaymentMonth;
	}

	/**
	 *方法: 获得overdueTotal
	 *@return: java.lang.String  overdueTotal
	 */
	public java.lang.String getOverdueTotal(){
		return this.overdueTotal;
	}

	/**
	 *方法: 设置overdueTotal
	 *@param: java.lang.String  overdueTotal
	 */
	public void setOverdueTotal(java.lang.String overdueTotal){
		this.overdueTotal = overdueTotal;
	}

	/**
	 *方法: 获得overdueMax
	 *@return: java.lang.String  overdueMax
	 */
	public java.lang.String getOverdueMax(){
		return this.overdueMax;
	}

	/**
	 *方法: 设置overdueMax
	 *@param: java.lang.String  overdueMax
	 */
	public void setOverdueMax(java.lang.String overdueMax){
		this.overdueMax = overdueMax;
	}

	/**
	 *方法: 获得overdueIssue
	 *@return: java.lang.String  overdueIssue
	 */
	public java.lang.String getOverdueIssue(){
		return this.overdueIssue;
	}

	/**
	 *方法: 设置overdueIssue
	 *@param: java.lang.String  overdueIssue
	 */
	public void setOverdueIssue(java.lang.String overdueIssue){
		this.overdueIssue = overdueIssue;
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
	 *方法: 获得error
	 *@return: java.lang.String  error
	 */
	public java.lang.String getError(){
		return this.error;
	}

	/**
	 *方法: 设置error
	 *@param: java.lang.String  error
	 */
	public void setError(java.lang.String error){
		this.error = error;
	}

	/**
	 *方法: 获得credMsg
	 *@return: java.lang.String  credMsg
	 */
	public java.lang.String getCredMsg(){
		return this.credMsg;
	}

	/**
	 *方法: 设置credMsg
	 *@param: java.lang.String  credMsg
	 */
	public void setCredMsg(java.lang.String credMsg){
		this.credMsg = credMsg;
	}

	/**
	 *方法: 获得sechMsg
	 *@return: java.lang.String  sechMsg
	 */
	public java.lang.String getSechMsg(){
		return this.sechMsg;
	}

	/**
	 *方法: 设置sechMsg
	 *@param: java.lang.String  sechMsg
	 */
	public void setSechMsg(java.lang.String sechMsg){
		this.sechMsg = sechMsg;
	}

	/**
	 *方法: 获得addrMsg
	 *@return: java.lang.String  addrMsg
	 */
	public java.lang.String getAddrMsg(){
		return this.addrMsg;
	}

	/**
	 *方法: 设置addrMsg
	 *@param: java.lang.String  addrMsg
	 */
	public void setAddrMsg(java.lang.String addrMsg){
		this.addrMsg = addrMsg;
	}

	/**
	 *方法: 获得spelMsg
	 *@return: java.lang.String  spelMsg
	 */
	public java.lang.String getSpelMsg(){
		return this.spelMsg;
	}

	/**
	 *方法: 设置spelMsg
	 *@param: java.lang.String  spelMsg
	 */
	public void setSpelMsg(java.lang.String spelMsg){
		this.spelMsg = spelMsg;
	}

	/**
	 *方法: 获得oterMsg
	 *@return: java.lang.String  oterMsg
	 */
	public java.lang.String getOterMsg(){
		return this.oterMsg;
	}

	/**
	 *方法: 设置oterMsg
	 *@param: java.lang.String  oterMsg
	 */
	public void setOterMsg(java.lang.String oterMsg){
		this.oterMsg = oterMsg;
	}

	/**
	 *方法: 获得workMsg
	 *@return: java.lang.String  workMsg
	 */
	public java.lang.String getWorkMsg(){
		return this.workMsg;
	}

	/**
	 *方法: 设置workMsg
	 *@param: java.lang.String  workMsg
	 */
	public void setWorkMsg(java.lang.String workMsg){
		this.workMsg = workMsg;
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

}