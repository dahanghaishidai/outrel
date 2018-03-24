package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcnetworkanalysis.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:致诚社交关系网数据表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-07 13:39:42
 */
public class ExtWlZcNetworkAnalysisDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**主表主键*/
	private String keyId;

	/**性别*/
	private String gender;

	/**性别码*/
	private String genderCode;

	/**年龄*/
	private String age;

	/**身份证号归属地*/
	private String idNoLocation;

	/**手机号码归属地*/
	private String mobileLocation;

	/**手机运营商*/
	private String mobileOperator;

	/**一阶联系人黑名单个数*/
	private String firstOrderBlackCnt;

	/**一阶联系人逾期个数 ：当前逾期天数大于等于4天*/
	private String firstOrderOverdueCnt;

	/**一阶联系人逾期m3+个数:历史逾期天数大于等于90天，包含逾期还清*/
	private String firstOrderM3Cnt;

	/**一阶联系人黑名单数占比*/
	private String firstOrderBlackRate;

	/**一阶联系人逾期占比*/
	private String firstOrderOverdueRate;

	/**二阶联系人黑名单个数*/
	private String secondOrderBlackCnt;

	/**二阶联系人逾期个数*/
	private String secondOrderOverdueCnt;

	/**二阶联系人逾期m3+个数:历史逾期天数大于等于90天，包含逾期还清*/
	private String secondOrderM3Cnt;

	/**主叫联系人数*/
	private String activeCallCnt;

	/**主叫联系人黑名单个数*/
	private String activeCallBlackCnt;

	/**主叫联系人逾期个数*/
	private String activeCallOverdueCnt;

	/**夜间通话人数：24点到5点*/
	private String nightCallCnt;

	/**夜间通话次数：24点到5点*/
	private String nightCallNum;

	/**夜间通话秒数：24点到5点*/
	private String nightCallSeconds;

	/**与虚拟号码通话人数*/
	private String fictionCallCnt;

	/**与虚拟号码通话次数*/
	private String fictionCallNum;

	/**与虚拟号码通话秒数*/
	private String fictionCallSeconds;

	/**异地通话人数*/
	private String remoteCallCnt;

	/**异地通话次数*/
	private String remoteCallNum;

	/**异地通话秒数*/
	private String remoteCallSeconds;

	/**与澳门通话人数*/
	private String macaoCallCnt;

	/**与澳门通话次数*/
	private String macaoCallNum;

	/**与澳门通话秒数*/
	private String macaoCallSeconds;

	/**与银行或同行通话总次数*/
	private String loanCallNum;

	/**与银行或同行通话总秒数*/
	private String loanCallSeconds;

	/**与法院通话次数*/
	private String courtCallNum;

	/**与律师通话次数*/
	private String lawyerCallNum;

	/**创建人*/
	private Long createBy;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改人*/
	private Long modifyBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**数据有效性(1：有效，0：无效)*/
	private String validateState;

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
	 *方法: 获得keyId
	 *@return: java.lang.String  keyId
	 */
	public String getKeyId(){
		return this.keyId;
	}

	/**
	 *方法: 设置keyId
	 *@param: java.lang.String  keyId
	 */
	public void setKeyId(String keyId){
		this.keyId = keyId;
	}

	/**
	 *方法: 获得gender
	 *@return: java.lang.String  gender
	 */
	public String getGender(){
		return this.gender;
	}

	/**
	 *方法: 设置gender
	 *@param: java.lang.String  gender
	 */
	public void setGender(String gender){
		this.gender = gender;
	}

	/**
	 *方法: 获得genderCode
	 *@return: java.lang.String  genderCode
	 */
	public String getGenderCode(){
		return this.genderCode;
	}

	/**
	 *方法: 设置genderCode
	 *@param: java.lang.String  genderCode
	 */
	public void setGenderCode(String genderCode){
		this.genderCode = genderCode;
	}

	/**
	 *方法: 获得age
	 *@return: java.lang.String  age
	 */
	public String getAge(){
		return this.age;
	}

	/**
	 *方法: 设置age
	 *@param: java.lang.String  age
	 */
	public void setAge(String age){
		this.age = age;
	}

	/**
	 *方法: 获得idNoLocation
	 *@return: java.lang.String  idNoLocation
	 */
	public String getIdNoLocation(){
		return this.idNoLocation;
	}

	/**
	 *方法: 设置idNoLocation
	 *@param: java.lang.String  idNoLocation
	 */
	public void setIdNoLocation(String idNoLocation){
		this.idNoLocation = idNoLocation;
	}

	/**
	 *方法: 获得mobileLocation
	 *@return: java.lang.String  mobileLocation
	 */
	public String getMobileLocation(){
		return this.mobileLocation;
	}

	/**
	 *方法: 设置mobileLocation
	 *@param: java.lang.String  mobileLocation
	 */
	public void setMobileLocation(String mobileLocation){
		this.mobileLocation = mobileLocation;
	}

	/**
	 *方法: 获得mobileOperator
	 *@return: java.lang.String  mobileOperator
	 */
	public String getMobileOperator(){
		return this.mobileOperator;
	}

	/**
	 *方法: 设置mobileOperator
	 *@param: java.lang.String  mobileOperator
	 */
	public void setMobileOperator(String mobileOperator){
		this.mobileOperator = mobileOperator;
	}

	/**
	 *方法: 获得firstOrderBlackCnt
	 *@return: java.lang.String  firstOrderBlackCnt
	 */
	public String getFirstOrderBlackCnt(){
		return this.firstOrderBlackCnt;
	}

	/**
	 *方法: 设置firstOrderBlackCnt
	 *@param: java.lang.String  firstOrderBlackCnt
	 */
	public void setFirstOrderBlackCnt(String firstOrderBlackCnt){
		this.firstOrderBlackCnt = firstOrderBlackCnt;
	}

	/**
	 *方法: 获得firstOrderOverdueCnt
	 *@return: java.lang.String  firstOrderOverdueCnt
	 */
	public String getFirstOrderOverdueCnt(){
		return this.firstOrderOverdueCnt;
	}

	/**
	 *方法: 设置firstOrderOverdueCnt
	 *@param: java.lang.String  firstOrderOverdueCnt
	 */
	public void setFirstOrderOverdueCnt(String firstOrderOverdueCnt){
		this.firstOrderOverdueCnt = firstOrderOverdueCnt;
	}

	/**
	 *方法: 获得firstOrderM3Cnt
	 *@return: java.lang.String  firstOrderM3Cnt
	 */
	public String getFirstOrderM3Cnt(){
		return this.firstOrderM3Cnt;
	}

	/**
	 *方法: 设置firstOrderM3Cnt
	 *@param: java.lang.String  firstOrderM3Cnt
	 */
	public void setFirstOrderM3Cnt(String firstOrderM3Cnt){
		this.firstOrderM3Cnt = firstOrderM3Cnt;
	}

	/**
	 *方法: 获得firstOrderBlackRate
	 *@return: java.lang.String  firstOrderBlackRate
	 */
	public String getFirstOrderBlackRate(){
		return this.firstOrderBlackRate;
	}

	/**
	 *方法: 设置firstOrderBlackRate
	 *@param: java.lang.String  firstOrderBlackRate
	 */
	public void setFirstOrderBlackRate(String firstOrderBlackRate){
		this.firstOrderBlackRate = firstOrderBlackRate;
	}

	/**
	 *方法: 获得firstOrderOverdueRate
	 *@return: java.lang.String  firstOrderOverdueRate
	 */
	public String getFirstOrderOverdueRate(){
		return this.firstOrderOverdueRate;
	}

	/**
	 *方法: 设置firstOrderOverdueRate
	 *@param: java.lang.String  firstOrderOverdueRate
	 */
	public void setFirstOrderOverdueRate(String firstOrderOverdueRate){
		this.firstOrderOverdueRate = firstOrderOverdueRate;
	}

	/**
	 *方法: 获得secondOrderBlackCnt
	 *@return: java.lang.String  secondOrderBlackCnt
	 */
	public String getSecondOrderBlackCnt(){
		return this.secondOrderBlackCnt;
	}

	/**
	 *方法: 设置secondOrderBlackCnt
	 *@param: java.lang.String  secondOrderBlackCnt
	 */
	public void setSecondOrderBlackCnt(String secondOrderBlackCnt){
		this.secondOrderBlackCnt = secondOrderBlackCnt;
	}

	/**
	 *方法: 获得secondOrderOverdueCnt
	 *@return: java.lang.String  secondOrderOverdueCnt
	 */
	public String getSecondOrderOverdueCnt(){
		return this.secondOrderOverdueCnt;
	}

	/**
	 *方法: 设置secondOrderOverdueCnt
	 *@param: java.lang.String  secondOrderOverdueCnt
	 */
	public void setSecondOrderOverdueCnt(String secondOrderOverdueCnt){
		this.secondOrderOverdueCnt = secondOrderOverdueCnt;
	}

	/**
	 *方法: 获得secondOrderM3Cnt
	 *@return: java.lang.String  secondOrderM3Cnt
	 */
	public String getSecondOrderM3Cnt(){
		return this.secondOrderM3Cnt;
	}

	/**
	 *方法: 设置secondOrderM3Cnt
	 *@param: java.lang.String  secondOrderM3Cnt
	 */
	public void setSecondOrderM3Cnt(String secondOrderM3Cnt){
		this.secondOrderM3Cnt = secondOrderM3Cnt;
	}

	/**
	 *方法: 获得activeCallCnt
	 *@return: java.lang.String  activeCallCnt
	 */
	public String getActiveCallCnt(){
		return this.activeCallCnt;
	}

	/**
	 *方法: 设置activeCallCnt
	 *@param: java.lang.String  activeCallCnt
	 */
	public void setActiveCallCnt(String activeCallCnt){
		this.activeCallCnt = activeCallCnt;
	}

	/**
	 *方法: 获得activeCallBlackCnt
	 *@return: java.lang.String  activeCallBlackCnt
	 */
	public String getActiveCallBlackCnt(){
		return this.activeCallBlackCnt;
	}

	/**
	 *方法: 设置activeCallBlackCnt
	 *@param: java.lang.String  activeCallBlackCnt
	 */
	public void setActiveCallBlackCnt(String activeCallBlackCnt){
		this.activeCallBlackCnt = activeCallBlackCnt;
	}

	/**
	 *方法: 获得activeCallOverdueCnt
	 *@return: java.lang.String  activeCallOverdueCnt
	 */
	public String getActiveCallOverdueCnt(){
		return this.activeCallOverdueCnt;
	}

	/**
	 *方法: 设置activeCallOverdueCnt
	 *@param: java.lang.String  activeCallOverdueCnt
	 */
	public void setActiveCallOverdueCnt(String activeCallOverdueCnt){
		this.activeCallOverdueCnt = activeCallOverdueCnt;
	}

	/**
	 *方法: 获得nightCallCnt
	 *@return: java.lang.String  nightCallCnt
	 */
	public String getNightCallCnt(){
		return this.nightCallCnt;
	}

	/**
	 *方法: 设置nightCallCnt
	 *@param: java.lang.String  nightCallCnt
	 */
	public void setNightCallCnt(String nightCallCnt){
		this.nightCallCnt = nightCallCnt;
	}

	/**
	 *方法: 获得nightCallNum
	 *@return: java.lang.String  nightCallNum
	 */
	public String getNightCallNum(){
		return this.nightCallNum;
	}

	/**
	 *方法: 设置nightCallNum
	 *@param: java.lang.String  nightCallNum
	 */
	public void setNightCallNum(String nightCallNum){
		this.nightCallNum = nightCallNum;
	}

	/**
	 *方法: 获得nightCallSeconds
	 *@return: java.lang.String  nightCallSeconds
	 */
	public String getNightCallSeconds(){
		return this.nightCallSeconds;
	}

	/**
	 *方法: 设置nightCallSeconds
	 *@param: java.lang.String  nightCallSeconds
	 */
	public void setNightCallSeconds(String nightCallSeconds){
		this.nightCallSeconds = nightCallSeconds;
	}

	/**
	 *方法: 获得fictionCallCnt
	 *@return: java.lang.String  fictionCallCnt
	 */
	public String getFictionCallCnt(){
		return this.fictionCallCnt;
	}

	/**
	 *方法: 设置fictionCallCnt
	 *@param: java.lang.String  fictionCallCnt
	 */
	public void setFictionCallCnt(String fictionCallCnt){
		this.fictionCallCnt = fictionCallCnt;
	}

	/**
	 *方法: 获得fictionCallNum
	 *@return: java.lang.String  fictionCallNum
	 */
	public String getFictionCallNum(){
		return this.fictionCallNum;
	}

	/**
	 *方法: 设置fictionCallNum
	 *@param: java.lang.String  fictionCallNum
	 */
	public void setFictionCallNum(String fictionCallNum){
		this.fictionCallNum = fictionCallNum;
	}

	/**
	 *方法: 获得fictionCallSeconds
	 *@return: java.lang.String  fictionCallSeconds
	 */
	public String getFictionCallSeconds(){
		return this.fictionCallSeconds;
	}

	/**
	 *方法: 设置fictionCallSeconds
	 *@param: java.lang.String  fictionCallSeconds
	 */
	public void setFictionCallSeconds(String fictionCallSeconds){
		this.fictionCallSeconds = fictionCallSeconds;
	}

	/**
	 *方法: 获得remoteCallCnt
	 *@return: java.lang.String  remoteCallCnt
	 */
	public String getRemoteCallCnt(){
		return this.remoteCallCnt;
	}

	/**
	 *方法: 设置remoteCallCnt
	 *@param: java.lang.String  remoteCallCnt
	 */
	public void setRemoteCallCnt(String remoteCallCnt){
		this.remoteCallCnt = remoteCallCnt;
	}

	/**
	 *方法: 获得remoteCallNum
	 *@return: java.lang.String  remoteCallNum
	 */
	public String getRemoteCallNum(){
		return this.remoteCallNum;
	}

	/**
	 *方法: 设置remoteCallNum
	 *@param: java.lang.String  remoteCallNum
	 */
	public void setRemoteCallNum(String remoteCallNum){
		this.remoteCallNum = remoteCallNum;
	}

	/**
	 *方法: 获得remoteCallSeconds
	 *@return: java.lang.String  remoteCallSeconds
	 */
	public String getRemoteCallSeconds(){
		return this.remoteCallSeconds;
	}

	/**
	 *方法: 设置remoteCallSeconds
	 *@param: java.lang.String  remoteCallSeconds
	 */
	public void setRemoteCallSeconds(String remoteCallSeconds){
		this.remoteCallSeconds = remoteCallSeconds;
	}

	/**
	 *方法: 获得macaoCallCnt
	 *@return: java.lang.String  macaoCallCnt
	 */
	public String getMacaoCallCnt(){
		return this.macaoCallCnt;
	}

	/**
	 *方法: 设置macaoCallCnt
	 *@param: java.lang.String  macaoCallCnt
	 */
	public void setMacaoCallCnt(String macaoCallCnt){
		this.macaoCallCnt = macaoCallCnt;
	}

	/**
	 *方法: 获得macaoCallNum
	 *@return: java.lang.String  macaoCallNum
	 */
	public String getMacaoCallNum(){
		return this.macaoCallNum;
	}

	/**
	 *方法: 设置macaoCallNum
	 *@param: java.lang.String  macaoCallNum
	 */
	public void setMacaoCallNum(String macaoCallNum){
		this.macaoCallNum = macaoCallNum;
	}

	/**
	 *方法: 获得macaoCallSeconds
	 *@return: java.lang.String  macaoCallSeconds
	 */
	public String getMacaoCallSeconds(){
		return this.macaoCallSeconds;
	}

	/**
	 *方法: 设置macaoCallSeconds
	 *@param: java.lang.String  macaoCallSeconds
	 */
	public void setMacaoCallSeconds(String macaoCallSeconds){
		this.macaoCallSeconds = macaoCallSeconds;
	}

	/**
	 *方法: 获得loanCallNum
	 *@return: java.lang.String  loanCallNum
	 */
	public String getLoanCallNum(){
		return this.loanCallNum;
	}

	/**
	 *方法: 设置loanCallNum
	 *@param: java.lang.String  loanCallNum
	 */
	public void setLoanCallNum(String loanCallNum){
		this.loanCallNum = loanCallNum;
	}

	/**
	 *方法: 获得loanCallSeconds
	 *@return: java.lang.String  loanCallSeconds
	 */
	public String getLoanCallSeconds(){
		return this.loanCallSeconds;
	}

	/**
	 *方法: 设置loanCallSeconds
	 *@param: java.lang.String  loanCallSeconds
	 */
	public void setLoanCallSeconds(String loanCallSeconds){
		this.loanCallSeconds = loanCallSeconds;
	}

	/**
	 *方法: 获得courtCallNum
	 *@return: java.lang.String  courtCallNum
	 */
	public String getCourtCallNum(){
		return this.courtCallNum;
	}

	/**
	 *方法: 设置courtCallNum
	 *@param: java.lang.String  courtCallNum
	 */
	public void setCourtCallNum(String courtCallNum){
		this.courtCallNum = courtCallNum;
	}

	/**
	 *方法: 获得lawyerCallNum
	 *@return: java.lang.String  lawyerCallNum
	 */
	public String getLawyerCallNum(){
		return this.lawyerCallNum;
	}

	/**
	 *方法: 设置lawyerCallNum
	 *@param: java.lang.String  lawyerCallNum
	 */
	public void setLawyerCallNum(String lawyerCallNum){
		this.lawyerCallNum = lawyerCallNum;
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

}