package com.jy.modules.externalplatform.interfacerepository.br.extbrreportassessment.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:百融风险评估
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-07 15:57:03
 */
public class ExtBrReportAssessmentDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**BR_REPORT_ID*/
	private java.lang.Long brReportId;

	/**OPTLOCK*/
	private java.lang.Long optlock;

	/**过去3/6/12个月*/
	private java.lang.String proType;

	/**总浏览次数*/
	private java.lang.String totalNum;

	/**总消费次数*/
	private java.lang.String consumeNum;

	/**消费总额*/
	private java.lang.String totalMoney;

	/**最大单月消费额*/
	private java.lang.String maxMonthMoney;

	/**购买力排名*/
	private java.lang.String top;

	/**1：消费能力评估/2：信贷申请统计/3：阅读兴趣*/
	private java.lang.String type;

	/**本机构申请次数*/
	private java.lang.String selfApplyNum;

	/**总申请次数*/
	private java.lang.String totalApplyNum;

	/**申请过的机构数*/
	private java.lang.String applyedNum;

	/**名称*/
	private java.lang.String proName;

	/**IS_BANK*/
	private java.lang.String isBank;

	/**CREATE_TIME*/
	private java.sql.Timestamp createTime;

	/**CREATE_BY*/
	private java.lang.String createBy;

	/**MODIFY_TIME*/
	private java.sql.Timestamp modifyTime;

	/**MODIFY_BY*/
	private java.lang.String modifyBy;

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
	 *方法: 获得brReportId
	 *@return: java.lang.Long  brReportId
	 */
	public java.lang.Long getBrReportId(){
		return this.brReportId;
	}

	/**
	 *方法: 设置brReportId
	 *@param: java.lang.Long  brReportId
	 */
	public void setBrReportId(java.lang.Long brReportId){
		this.brReportId = brReportId;
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
	 *方法: 获得proType
	 *@return: java.lang.String  proType
	 */
	public java.lang.String getProType(){
		return this.proType;
	}

	/**
	 *方法: 设置proType
	 *@param: java.lang.String  proType
	 */
	public void setProType(java.lang.String proType){
		this.proType = proType;
	}

	/**
	 *方法: 获得totalNum
	 *@return: java.lang.String  totalNum
	 */
	public java.lang.String getTotalNum(){
		return this.totalNum;
	}

	/**
	 *方法: 设置totalNum
	 *@param: java.lang.String  totalNum
	 */
	public void setTotalNum(java.lang.String totalNum){
		this.totalNum = totalNum;
	}

	/**
	 *方法: 获得consumeNum
	 *@return: java.lang.String  consumeNum
	 */
	public java.lang.String getConsumeNum(){
		return this.consumeNum;
	}

	/**
	 *方法: 设置consumeNum
	 *@param: java.lang.String  consumeNum
	 */
	public void setConsumeNum(java.lang.String consumeNum){
		this.consumeNum = consumeNum;
	}

	/**
	 *方法: 获得totalMoney
	 *@return: java.lang.String  totalMoney
	 */
	public java.lang.String getTotalMoney(){
		return this.totalMoney;
	}

	/**
	 *方法: 设置totalMoney
	 *@param: java.lang.String  totalMoney
	 */
	public void setTotalMoney(java.lang.String totalMoney){
		this.totalMoney = totalMoney;
	}

	/**
	 *方法: 获得maxMonthMoney
	 *@return: java.lang.String  maxMonthMoney
	 */
	public java.lang.String getMaxMonthMoney(){
		return this.maxMonthMoney;
	}

	/**
	 *方法: 设置maxMonthMoney
	 *@param: java.lang.String  maxMonthMoney
	 */
	public void setMaxMonthMoney(java.lang.String maxMonthMoney){
		this.maxMonthMoney = maxMonthMoney;
	}

	/**
	 *方法: 获得top
	 *@return: java.lang.String  top
	 */
	public java.lang.String getTop(){
		return this.top;
	}

	/**
	 *方法: 设置top
	 *@param: java.lang.String  top
	 */
	public void setTop(java.lang.String top){
		this.top = top;
	}

	/**
	 *方法: 获得type
	 *@return: java.lang.String  type
	 */
	public java.lang.String getType(){
		return this.type;
	}

	/**
	 *方法: 设置type
	 *@param: java.lang.String  type
	 */
	public void setType(java.lang.String type){
		this.type = type;
	}

	/**
	 *方法: 获得selfApplyNum
	 *@return: java.lang.String  selfApplyNum
	 */
	public java.lang.String getSelfApplyNum(){
		return this.selfApplyNum;
	}

	/**
	 *方法: 设置selfApplyNum
	 *@param: java.lang.String  selfApplyNum
	 */
	public void setSelfApplyNum(java.lang.String selfApplyNum){
		this.selfApplyNum = selfApplyNum;
	}

	/**
	 *方法: 获得totalApplyNum
	 *@return: java.lang.String  totalApplyNum
	 */
	public java.lang.String getTotalApplyNum(){
		return this.totalApplyNum;
	}

	/**
	 *方法: 设置totalApplyNum
	 *@param: java.lang.String  totalApplyNum
	 */
	public void setTotalApplyNum(java.lang.String totalApplyNum){
		this.totalApplyNum = totalApplyNum;
	}

	/**
	 *方法: 获得applyedNum
	 *@return: java.lang.String  applyedNum
	 */
	public java.lang.String getApplyedNum(){
		return this.applyedNum;
	}

	/**
	 *方法: 设置applyedNum
	 *@param: java.lang.String  applyedNum
	 */
	public void setApplyedNum(java.lang.String applyedNum){
		this.applyedNum = applyedNum;
	}

	/**
	 *方法: 获得proName
	 *@return: java.lang.String  proName
	 */
	public java.lang.String getProName(){
		return this.proName;
	}

	/**
	 *方法: 设置proName
	 *@param: java.lang.String  proName
	 */
	public void setProName(java.lang.String proName){
		this.proName = proName;
	}

	/**
	 *方法: 获得isBank
	 *@return: java.lang.String  isBank
	 */
	public java.lang.String getIsBank(){
		return this.isBank;
	}

	/**
	 *方法: 设置isBank
	 *@param: java.lang.String  isBank
	 */
	public void setIsBank(java.lang.String isBank){
		this.isBank = isBank;
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

}