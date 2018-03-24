package com.jy.modules.externalplatform.interfacerepository.suanhua.extshfrandreportstock.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话反欺诈报告
 *@author dell
 *@version 1.0,
 *@date 2017-06-12 11:31:37
 */
public class ExtShFrandReportStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**产品编码*/
	private java.lang.String prodCode;

	/**机构编码*/
	private java.lang.String orgCode;

	/**系统编码*/
	private java.lang.String sysCode;

	/**业务流水*/
	private java.lang.String appNum;

	/**业务类型*/
	private java.lang.String frdCheckType;

	/**申请日期*/
	private java.util.Date appDate;

	/**算话流水*/
	private java.lang.String appNo;

	/**数据校验结果*/
	private java.lang.String appValid;

	/**数据校验信息*/
	private java.lang.String errMsg;

	/**核定结果分数*/
	private java.lang.String appRst;

	/**核定结果备注*/
	private java.lang.String appRstRemark;

	/**人脸识别结果*/
	private java.lang.String appFaceRst;

	/**涉诉黑名单*/
	private java.lang.String appBlackRst;

	/**执行状态  0成功1错误2警告*/
	private java.lang.String appStatus;

	/**申请数据警告*/
	private java.lang.String appWarn;

	/**申请数据警告描述*/
	private java.lang.String appWarnInfo;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**数据有效性*/
	private java.lang.String validateState;

	/**客户ID*/
	private java.lang.Long custId;

	/**欺诈预警*/
	private java.lang.String stanFrdLevel;

	/**身份证号与姓名是否匹配（1  匹配   2  不匹配    3  无此号码）*/
	private java.lang.String stanIdNameMatch;

	/**身份证号是否涉及黑名单（1  是   2否）*/
	private java.lang.String stanStatusB001;

	/**是否涉及不良信息（1  是   2否）*/
	private java.lang.String stanStatus3007;

	/**裁判文书数量*/
	private java.lang.String stan6001Cpws;

	/**执行公告数量*/
	private java.lang.String stan6001Zxgg;

	/**失信公告数量*/
	private java.lang.String stan6001Sxgg;

	/**开庭公告数量*/
	private java.lang.String stan6001Ktgg;

	/**法院公告数量*/
	private java.lang.String stan6001Fygg;

	/**网贷黑名单数量*/
	private java.lang.String stan6001Wdhmd;

	/**家庭电话查得地址*/
	private java.lang.String stan3004Address;

	/**家庭电话查得名称*/
	private java.lang.String stan3004Name;

	/**公司电话查得名称*/
	private java.lang.String stan3004EmpName;

	/**公司电话查得地址*/
	private java.lang.String stan3004EmpAddress;

	/**欠费标识*/
	private java.lang.String stan3005Hfbalsign;

	/**运营商*/
	private java.lang.String stan3005Telecomoperator;

	/**在网时长，在网时长,返回具体时长或月份范围,有汉字等单位,例如：12-24月*/
	private java.lang.String stan3005Onlinetimes;

	/**月均联系电话数量*/
	private java.lang.String stan8007AMonthlyContacts;

	/**日均通话次数*/
	private java.lang.String stan8007ADailycalltimes;

	/**标记（标记手机号是否有特殊标记,例如：骚扰电话、快递电话、中介电话等）*/
	private java.lang.String stan8007ALabel;

	/**与联系人1之间关系密切度（0 -未知 ;  1 -密切 ; 2-一般 ; 3-无关系）*/
	private java.lang.String stan8007Intimacy1;

	/**与联系人2之间关系密切度（0-未知 1-密切 2-一般;  3-无关系）*/
	private java.lang.String stan8007Intimacy2;

	/**外部服务执行状态（0- 执行成功;1 - 余额不足，无接口服务结果，可执行反欺诈服务; 2 - 服务权限问题，无接口服务结果，可执行反欺诈服务;  3 - 其他问题，
  ）*/
	private java.lang.String stanExternalStatus;

	/**联系人手机号冗余，及冗余的数量*/
	private java.lang.String stanCellCsPhoneCheck;

	/**该申请人填写申请信息非法或无业务含义*/
	private java.lang.String stanAppInvalid;

	/**欺诈风险评级*/
	private java.lang.String stanRiskRate;

	/**该申请人填写居住地址与单位地址是否冗余*/
	private java.lang.String homeEmpAddrCheck;

	/**该申请人填写居住电话与单位电话是否冗余*/
	private java.lang.String homeEmpPhoneCheck;

	/**G1信息标志*/
	private java.lang.String g1Msg;

	/**返回码 1：查有 2：查无 3：查询报错 4：解析错误*/
	private java.lang.String retCode;

	/**错误信息*/
	private java.lang.String errorMsg;

	/**接口日志ID*/
	private java.lang.String interfaceId;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**备注*/
	private java.lang.String remark;

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
	 *方法: 获得appNum
	 *@return: java.lang.String  appNum
	 */
	public java.lang.String getAppNum(){
		return this.appNum;
	}

	/**
	 *方法: 设置appNum
	 *@param: java.lang.String  appNum
	 */
	public void setAppNum(java.lang.String appNum){
		this.appNum = appNum;
	}

	/**
	 *方法: 获得frdCheckType
	 *@return: java.lang.String  frdCheckType
	 */
	public java.lang.String getFrdCheckType(){
		return this.frdCheckType;
	}

	/**
	 *方法: 设置frdCheckType
	 *@param: java.lang.String  frdCheckType
	 */
	public void setFrdCheckType(java.lang.String frdCheckType){
		this.frdCheckType = frdCheckType;
	}

	/**
	 *方法: 获得appDate
	 *@return: java.util.Date  appDate
	 */
	public java.util.Date getAppDate(){
		return this.appDate;
	}

	/**
	 *方法: 设置appDate
	 *@param: java.util.Date  appDate
	 */
	public void setAppDate(java.util.Date appDate){
		this.appDate = appDate;
	}

	/**
	 *方法: 获得appNo
	 *@return: java.lang.String  appNo
	 */
	public java.lang.String getAppNo(){
		return this.appNo;
	}

	/**
	 *方法: 设置appNo
	 *@param: java.lang.String  appNo
	 */
	public void setAppNo(java.lang.String appNo){
		this.appNo = appNo;
	}

	/**
	 *方法: 获得appValid
	 *@return: java.lang.String  appValid
	 */
	public java.lang.String getAppValid(){
		return this.appValid;
	}

	/**
	 *方法: 设置appValid
	 *@param: java.lang.String  appValid
	 */
	public void setAppValid(java.lang.String appValid){
		this.appValid = appValid;
	}

	/**
	 *方法: 获得errMsg
	 *@return: java.lang.String  errMsg
	 */
	public java.lang.String getErrMsg(){
		return this.errMsg;
	}

	/**
	 *方法: 设置errMsg
	 *@param: java.lang.String  errMsg
	 */
	public void setErrMsg(java.lang.String errMsg){
		this.errMsg = errMsg;
	}

	/**
	 *方法: 获得appRst
	 *@return: java.lang.Long  appRst
	 */
	public java.lang.String getAppRst(){
		return this.appRst;
	}

	/**
	 *方法: 设置appRst
	 *@param: java.lang.Long  appRst
	 */
	public void setAppRst(java.lang.String appRst){
		this.appRst = appRst;
	}

	/**
	 *方法: 获得appRstRemark
	 *@return: java.lang.String  appRstRemark
	 */
	public java.lang.String getAppRstRemark(){
		return this.appRstRemark;
	}

	/**
	 *方法: 设置appRstRemark
	 *@param: java.lang.String  appRstRemark
	 */
	public void setAppRstRemark(java.lang.String appRstRemark){
		this.appRstRemark = appRstRemark;
	}

	/**
	 *方法: 获得appFaceRst
	 *@return: java.lang.String  appFaceRst
	 */
	public java.lang.String getAppFaceRst(){
		return this.appFaceRst;
	}

	/**
	 *方法: 设置appFaceRst
	 *@param: java.lang.String  appFaceRst
	 */
	public void setAppFaceRst(java.lang.String appFaceRst){
		this.appFaceRst = appFaceRst;
	}

	/**
	 *方法: 获得appBlackRst
	 *@return: java.lang.String  appBlackRst
	 */
	public java.lang.String getAppBlackRst(){
		return this.appBlackRst;
	}

	/**
	 *方法: 设置appBlackRst
	 *@param: java.lang.String  appBlackRst
	 */
	public void setAppBlackRst(java.lang.String appBlackRst){
		this.appBlackRst = appBlackRst;
	}

	/**
	 *方法: 获得appStatus
	 *@return: java.lang.String  appStatus
	 */
	public java.lang.String getAppStatus(){
		return this.appStatus;
	}

	/**
	 *方法: 设置appStatus
	 *@param: java.lang.String  appStatus
	 */
	public void setAppStatus(java.lang.String appStatus){
		this.appStatus = appStatus;
	}

	/**
	 *方法: 获得appWarn
	 *@return: java.lang.String  appWarn
	 */
	public java.lang.String getAppWarn(){
		return this.appWarn;
	}

	/**
	 *方法: 设置appWarn
	 *@param: java.lang.String  appWarn
	 */
	public void setAppWarn(java.lang.String appWarn){
		this.appWarn = appWarn;
	}

	/**
	 *方法: 获得appWarnInfo
	 *@return: java.lang.String  appWarnInfo
	 */
	public java.lang.String getAppWarnInfo(){
		return this.appWarnInfo;
	}

	/**
	 *方法: 设置appWarnInfo
	 *@param: java.lang.String  appWarnInfo
	 */
	public void setAppWarnInfo(java.lang.String appWarnInfo){
		this.appWarnInfo = appWarnInfo;
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
	 *方法: 获得validateState
	 *@return: java.lang.String  validateState
	 */
	public java.lang.String getValidateState(){
		return this.validateState;
	}

	/**
	 *方法: 设置validateState
	 *@param: java.lang.String  validateState
	 */
	public void setValidateState(java.lang.String validateState){
		this.validateState = validateState;
	}

	/**
	 *方法: 获得custId
	 *@return: java.lang.Long  custId
	 */
	public java.lang.Long getCustId(){
		return this.custId;
	}

	/**
	 *方法: 设置custId
	 *@param: java.lang.Long  custId
	 */
	public void setCustId(java.lang.Long custId){
		this.custId = custId;
	}

	/**
	 *方法: 获得stanFrdLevel
	 *@return: java.lang.String  stanFrdLevel
	 */
	public java.lang.String getStanFrdLevel(){
		return this.stanFrdLevel;
	}

	/**
	 *方法: 设置stanFrdLevel
	 *@param: java.lang.String  stanFrdLevel
	 */
	public void setStanFrdLevel(java.lang.String stanFrdLevel){
		this.stanFrdLevel = stanFrdLevel;
	}

	/**
	 *方法: 获得stanIdNameMatch
	 *@return: java.lang.String  stanIdNameMatch
	 */
	public java.lang.String getStanIdNameMatch(){
		return this.stanIdNameMatch;
	}

	/**
	 *方法: 设置stanIdNameMatch
	 *@param: java.lang.String  stanIdNameMatch
	 */
	public void setStanIdNameMatch(java.lang.String stanIdNameMatch){
		this.stanIdNameMatch = stanIdNameMatch;
	}

	/**
	 *方法: 获得stanStatusB001
	 *@return: java.lang.String  stanStatusB001
	 */
	public java.lang.String getStanStatusB001(){
		return this.stanStatusB001;
	}

	/**
	 *方法: 设置stanStatusB001
	 *@param: java.lang.String  stanStatusB001
	 */
	public void setStanStatusB001(java.lang.String stanStatusB001){
		this.stanStatusB001 = stanStatusB001;
	}

	/**
	 *方法: 获得stanStatus3007
	 *@return: java.lang.String  stanStatus3007
	 */
	public java.lang.String getStanStatus3007(){
		return this.stanStatus3007;
	}

	/**
	 *方法: 设置stanStatus3007
	 *@param: java.lang.String  stanStatus3007
	 */
	public void setStanStatus3007(java.lang.String stanStatus3007){
		this.stanStatus3007 = stanStatus3007;
	}

	/**
	 *方法: 获得stan6001Cpws
	 *@return: java.lang.String  stan6001Cpws
	 */
	public java.lang.String getStan6001Cpws(){
		return this.stan6001Cpws;
	}

	/**
	 *方法: 设置stan6001Cpws
	 *@param: java.lang.String  stan6001Cpws
	 */
	public void setStan6001Cpws(java.lang.String stan6001Cpws){
		this.stan6001Cpws = stan6001Cpws;
	}

	/**
	 *方法: 获得stan6001Zxgg
	 *@return: java.lang.String  stan6001Zxgg
	 */
	public java.lang.String getStan6001Zxgg(){
		return this.stan6001Zxgg;
	}

	/**
	 *方法: 设置stan6001Zxgg
	 *@param: java.lang.String  stan6001Zxgg
	 */
	public void setStan6001Zxgg(java.lang.String stan6001Zxgg){
		this.stan6001Zxgg = stan6001Zxgg;
	}

	/**
	 *方法: 获得stan6001Sxgg
	 *@return: java.lang.String  stan6001Sxgg
	 */
	public java.lang.String getStan6001Sxgg(){
		return this.stan6001Sxgg;
	}

	/**
	 *方法: 设置stan6001Sxgg
	 *@param: java.lang.String  stan6001Sxgg
	 */
	public void setStan6001Sxgg(java.lang.String stan6001Sxgg){
		this.stan6001Sxgg = stan6001Sxgg;
	}

	/**
	 *方法: 获得stan6001Ktgg
	 *@return: java.lang.String  stan6001Ktgg
	 */
	public java.lang.String getStan6001Ktgg(){
		return this.stan6001Ktgg;
	}

	/**
	 *方法: 设置stan6001Ktgg
	 *@param: java.lang.String  stan6001Ktgg
	 */
	public void setStan6001Ktgg(java.lang.String stan6001Ktgg){
		this.stan6001Ktgg = stan6001Ktgg;
	}

	/**
	 *方法: 获得stan6001Fygg
	 *@return: java.lang.String  stan6001Fygg
	 */
	public java.lang.String getStan6001Fygg(){
		return this.stan6001Fygg;
	}

	/**
	 *方法: 设置stan6001Fygg
	 *@param: java.lang.String  stan6001Fygg
	 */
	public void setStan6001Fygg(java.lang.String stan6001Fygg){
		this.stan6001Fygg = stan6001Fygg;
	}

	/**
	 *方法: 获得stan6001Wdhmd
	 *@return: java.lang.String  stan6001Wdhmd
	 */
	public java.lang.String getStan6001Wdhmd(){
		return this.stan6001Wdhmd;
	}

	/**
	 *方法: 设置stan6001Wdhmd
	 *@param: java.lang.String  stan6001Wdhmd
	 */
	public void setStan6001Wdhmd(java.lang.String stan6001Wdhmd){
		this.stan6001Wdhmd = stan6001Wdhmd;
	}

	/**
	 *方法: 获得stan3004Address
	 *@return: java.lang.String  stan3004Address
	 */
	public java.lang.String getStan3004Address(){
		return this.stan3004Address;
	}

	/**
	 *方法: 设置stan3004Address
	 *@param: java.lang.String  stan3004Address
	 */
	public void setStan3004Address(java.lang.String stan3004Address){
		this.stan3004Address = stan3004Address;
	}

	/**
	 *方法: 获得stan3004Name
	 *@return: java.lang.String  stan3004Name
	 */
	public java.lang.String getStan3004Name(){
		return this.stan3004Name;
	}

	/**
	 *方法: 设置stan3004Name
	 *@param: java.lang.String  stan3004Name
	 */
	public void setStan3004Name(java.lang.String stan3004Name){
		this.stan3004Name = stan3004Name;
	}

	/**
	 *方法: 获得stan3004EmpName
	 *@return: java.lang.String  stan3004EmpName
	 */
	public java.lang.String getStan3004EmpName(){
		return this.stan3004EmpName;
	}

	/**
	 *方法: 设置stan3004EmpName
	 *@param: java.lang.String  stan3004EmpName
	 */
	public void setStan3004EmpName(java.lang.String stan3004EmpName){
		this.stan3004EmpName = stan3004EmpName;
	}

	/**
	 *方法: 获得stan3004EmpAddress
	 *@return: java.lang.String  stan3004EmpAddress
	 */
	public java.lang.String getStan3004EmpAddress(){
		return this.stan3004EmpAddress;
	}

	/**
	 *方法: 设置stan3004EmpAddress
	 *@param: java.lang.String  stan3004EmpAddress
	 */
	public void setStan3004EmpAddress(java.lang.String stan3004EmpAddress){
		this.stan3004EmpAddress = stan3004EmpAddress;
	}

	/**
	 *方法: 获得stan3005Hfbalsign
	 *@return: java.lang.String  stan3005Hfbalsign
	 */
	public java.lang.String getStan3005Hfbalsign(){
		return this.stan3005Hfbalsign;
	}

	/**
	 *方法: 设置stan3005Hfbalsign
	 *@param: java.lang.String  stan3005Hfbalsign
	 */
	public void setStan3005Hfbalsign(java.lang.String stan3005Hfbalsign){
		this.stan3005Hfbalsign = stan3005Hfbalsign;
	}

	/**
	 *方法: 获得stan3005Telecomoperator
	 *@return: java.lang.String  stan3005Telecomoperator
	 */
	public java.lang.String getStan3005Telecomoperator(){
		return this.stan3005Telecomoperator;
	}

	/**
	 *方法: 设置stan3005Telecomoperator
	 *@param: java.lang.String  stan3005Telecomoperator
	 */
	public void setStan3005Telecomoperator(java.lang.String stan3005Telecomoperator){
		this.stan3005Telecomoperator = stan3005Telecomoperator;
	}

	/**
	 *方法: 获得stan3005Onlinetimes
	 *@return: java.lang.String  stan3005Onlinetimes
	 */
	public java.lang.String getStan3005Onlinetimes(){
		return this.stan3005Onlinetimes;
	}

	/**
	 *方法: 设置stan3005Onlinetimes
	 *@param: java.lang.String  stan3005Onlinetimes
	 */
	public void setStan3005Onlinetimes(java.lang.String stan3005Onlinetimes){
		this.stan3005Onlinetimes = stan3005Onlinetimes;
	}

	/**
	 *方法: 获得stan8007AMonthlyContacts
	 *@return: java.lang.String  stan8007AMonthlyContacts
	 */
	public java.lang.String getStan8007AMonthlyContacts(){
		return this.stan8007AMonthlyContacts;
	}

	/**
	 *方法: 设置stan8007AMonthlyContacts
	 *@param: java.lang.String  stan8007AMonthlyContacts
	 */
	public void setStan8007AMonthlyContacts(java.lang.String stan8007AMonthlyContacts){
		this.stan8007AMonthlyContacts = stan8007AMonthlyContacts;
	}

	/**
	 *方法: 获得stan8007ADailycalltimes
	 *@return: java.lang.String  stan8007ADailycalltimes
	 */
	public java.lang.String getStan8007ADailycalltimes(){
		return this.stan8007ADailycalltimes;
	}

	/**
	 *方法: 设置stan8007ADailycalltimes
	 *@param: java.lang.String  stan8007ADailycalltimes
	 */
	public void setStan8007ADailycalltimes(java.lang.String stan8007ADailycalltimes){
		this.stan8007ADailycalltimes = stan8007ADailycalltimes;
	}

	/**
	 *方法: 获得stan8007ALabel
	 *@return: java.lang.String  stan8007ALabel
	 */
	public java.lang.String getStan8007ALabel(){
		return this.stan8007ALabel;
	}

	/**
	 *方法: 设置stan8007ALabel
	 *@param: java.lang.String  stan8007ALabel
	 */
	public void setStan8007ALabel(java.lang.String stan8007ALabel){
		this.stan8007ALabel = stan8007ALabel;
	}

	/**
	 *方法: 获得stan8007Intimacy1
	 *@return: java.lang.String  stan8007Intimacy1
	 */
	public java.lang.String getStan8007Intimacy1(){
		return this.stan8007Intimacy1;
	}

	/**
	 *方法: 设置stan8007Intimacy1
	 *@param: java.lang.String  stan8007Intimacy1
	 */
	public void setStan8007Intimacy1(java.lang.String stan8007Intimacy1){
		this.stan8007Intimacy1 = stan8007Intimacy1;
	}

	/**
	 *方法: 获得stan8007Intimacy2
	 *@return: java.lang.String  stan8007Intimacy2
	 */
	public java.lang.String getStan8007Intimacy2(){
		return this.stan8007Intimacy2;
	}

	/**
	 *方法: 设置stan8007Intimacy2
	 *@param: java.lang.String  stan8007Intimacy2
	 */
	public void setStan8007Intimacy2(java.lang.String stan8007Intimacy2){
		this.stan8007Intimacy2 = stan8007Intimacy2;
	}

	/**
	 *方法: 获得stanExternalStatus
	 *@return: java.lang.String  stanExternalStatus
	 */
	public java.lang.String getStanExternalStatus(){
		return this.stanExternalStatus;
	}

	/**
	 *方法: 设置stanExternalStatus
	 *@param: java.lang.String  stanExternalStatus
	 */
	public void setStanExternalStatus(java.lang.String stanExternalStatus){
		this.stanExternalStatus = stanExternalStatus;
	}

	/**
	 *方法: 获得stanCellCsPhoneCheck
	 *@return: java.lang.String  stanCellCsPhoneCheck
	 */
	public java.lang.String getStanCellCsPhoneCheck(){
		return this.stanCellCsPhoneCheck;
	}

	/**
	 *方法: 设置stanCellCsPhoneCheck
	 *@param: java.lang.String  stanCellCsPhoneCheck
	 */
	public void setStanCellCsPhoneCheck(java.lang.String stanCellCsPhoneCheck){
		this.stanCellCsPhoneCheck = stanCellCsPhoneCheck;
	}

	/**
	 *方法: 获得stanAppInvalid
	 *@return: java.lang.String  stanAppInvalid
	 */
	public java.lang.String getStanAppInvalid(){
		return this.stanAppInvalid;
	}

	/**
	 *方法: 设置stanAppInvalid
	 *@param: java.lang.String  stanAppInvalid
	 */
	public void setStanAppInvalid(java.lang.String stanAppInvalid){
		this.stanAppInvalid = stanAppInvalid;
	}

	/**
	 *方法: 获得stanRiskRate
	 *@return: java.lang.String  stanRiskRate
	 */
	public java.lang.String getStanRiskRate(){
		return this.stanRiskRate;
	}

	/**
	 *方法: 设置stanRiskRate
	 *@param: java.lang.String  stanRiskRate
	 */
	public void setStanRiskRate(java.lang.String stanRiskRate){
		this.stanRiskRate = stanRiskRate;
	}

	/**
	 *方法: 获得homeEmpAddrCheck
	 *@return: java.lang.String  homeEmpAddrCheck
	 */
	public java.lang.String getHomeEmpAddrCheck(){
		return this.homeEmpAddrCheck;
	}

	/**
	 *方法: 设置homeEmpAddrCheck
	 *@param: java.lang.String  homeEmpAddrCheck
	 */
	public void setHomeEmpAddrCheck(java.lang.String homeEmpAddrCheck){
		this.homeEmpAddrCheck = homeEmpAddrCheck;
	}

	/**
	 *方法: 获得homeEmpPhoneCheck
	 *@return: java.lang.String  homeEmpPhoneCheck
	 */
	public java.lang.String getHomeEmpPhoneCheck(){
		return this.homeEmpPhoneCheck;
	}

	/**
	 *方法: 设置homeEmpPhoneCheck
	 *@param: java.lang.String  homeEmpPhoneCheck
	 */
	public void setHomeEmpPhoneCheck(java.lang.String homeEmpPhoneCheck){
		this.homeEmpPhoneCheck = homeEmpPhoneCheck;
	}

	/**
	 *方法: 获得g1Msg
	 *@return: java.lang.String  g1Msg
	 */
	public java.lang.String getG1Msg(){
		return this.g1Msg;
	}

	/**
	 *方法: 设置g1Msg
	 *@param: java.lang.String  g1Msg
	 */
	public void setG1Msg(java.lang.String g1Msg){
		this.g1Msg = g1Msg;
	}

	/**
	 *方法: 获得retCode
	 *@return: java.lang.String  retCode
	 */
	public java.lang.String getRetCode(){
		return this.retCode;
	}

	/**
	 *方法: 设置retCode
	 *@param: java.lang.String  retCode
	 */
	public void setRetCode(java.lang.String retCode){
		this.retCode = retCode;
	}

	/**
	 *方法: 获得errorMsg
	 *@return: java.lang.String  errorMsg
	 */
	public java.lang.String getErrorMsg(){
		return this.errorMsg;
	}

	/**
	 *方法: 设置errorMsg
	 *@param: java.lang.String  errorMsg
	 */
	public void setErrorMsg(java.lang.String errorMsg){
		this.errorMsg = errorMsg;
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

}