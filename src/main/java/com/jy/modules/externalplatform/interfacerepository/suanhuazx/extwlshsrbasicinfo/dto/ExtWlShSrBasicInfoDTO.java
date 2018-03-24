package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrbasicinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行结构化版(征信主表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:53:07
 */
public class ExtWlShSrBasicInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**机构号*/
	private String orgId;

	/**操作人员ID*/
	private String operatorId;

	/**人行报告编号*/
	private String reportSn;

	/**查询时间*/
	private String queryTime;

	/**报告时间*/
	private String reportTime;

	/**证件类型*/
	private String idtype;

	/**证件号*/
	private String idno;

	/**姓名*/
	private String idname;

	/**婚姻状态*/
	private String marital;

	/**无资产处置信息(0-无;1-)*/
	private String assetFlag;

	/**无保证人代偿信息(0-无;1-)*/
	private String compensateFlag;

	/**无信用卡信息(0-无;1-)*/
	private String creditFlag;

	/**无贷款信息(0-无;1-)*/
	private String loanFlag;

	/**无为他人担保信息(0-无;1-)*/
	private String guaranteeFlag;

	/**无欠税记录(0-无;1-)*/
	private String taxFlag;

	/**无民事判决记录(0-无;1-)*/
	private String judgmentFlag;

	/**无强制执行记录(0-无;1-)*/
	private String enforcementFlag;

	/**无行政处罚记录(0-无;1-)*/
	private String punishmentFlag;

	/**无电信欠费信息(0-无;1-)*/
	private String telecomFlag;

	/**身份信息核对结果(0-缺失值;1-姓名一致，身份证不一致;2-姓名不一致，身份证一致;3-姓名和身份证都一致;4-姓名和身份证都不一致;-1-姓名和身份证都不一致)*/
	private String checks;

	/**是否失败(0-成功;1-失败)*/
	private String isfail;

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
	 *方法: 获得orgId
	 *@return: java.lang.String  orgId
	 */
	public String getOrgId(){
		return this.orgId;
	}

	/**
	 *方法: 设置orgId
	 *@param: java.lang.String  orgId
	 */
	public void setOrgId(String orgId){
		this.orgId = orgId;
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
	 *方法: 获得reportSn
	 *@return: java.lang.String  reportSn
	 */
	public String getReportSn(){
		return this.reportSn;
	}

	/**
	 *方法: 设置reportSn
	 *@param: java.lang.String  reportSn
	 */
	public void setReportSn(String reportSn){
		this.reportSn = reportSn;
	}

	/**
	 *方法: 获得queryTime
	 *@return: java.lang.String  queryTime
	 */
	public String getQueryTime(){
		return this.queryTime;
	}

	/**
	 *方法: 设置queryTime
	 *@param: java.lang.String  queryTime
	 */
	public void setQueryTime(String queryTime){
		this.queryTime = queryTime;
	}

	/**
	 *方法: 获得reportTime
	 *@return: java.lang.String  reportTime
	 */
	public String getReportTime(){
		return this.reportTime;
	}

	/**
	 *方法: 设置reportTime
	 *@param: java.lang.String  reportTime
	 */
	public void setReportTime(String reportTime){
		this.reportTime = reportTime;
	}

	/**
	 *方法: 获得idtype
	 *@return: java.lang.String  idtype
	 */
	public String getIdtype(){
		return this.idtype;
	}

	/**
	 *方法: 设置idtype
	 *@param: java.lang.String  idtype
	 */
	public void setIdtype(String idtype){
		this.idtype = idtype;
	}

	/**
	 *方法: 获得idno
	 *@return: java.lang.String  idno
	 */
	public String getIdno(){
		return this.idno;
	}

	/**
	 *方法: 设置idno
	 *@param: java.lang.String  idno
	 */
	public void setIdno(String idno){
		this.idno = idno;
	}

	/**
	 *方法: 获得idname
	 *@return: java.lang.String  idname
	 */
	public String getIdname(){
		return this.idname;
	}

	/**
	 *方法: 设置idname
	 *@param: java.lang.String  idname
	 */
	public void setIdname(String idname){
		this.idname = idname;
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
	 *方法: 获得assetFlag
	 *@return: java.lang.String  assetFlag
	 */
	public String getAssetFlag(){
		return this.assetFlag;
	}

	/**
	 *方法: 设置assetFlag
	 *@param: java.lang.String  assetFlag
	 */
	public void setAssetFlag(String assetFlag){
		this.assetFlag = assetFlag;
	}

	/**
	 *方法: 获得compensateFlag
	 *@return: java.lang.String  compensateFlag
	 */
	public String getCompensateFlag(){
		return this.compensateFlag;
	}

	/**
	 *方法: 设置compensateFlag
	 *@param: java.lang.String  compensateFlag
	 */
	public void setCompensateFlag(String compensateFlag){
		this.compensateFlag = compensateFlag;
	}

	/**
	 *方法: 获得creditFlag
	 *@return: java.lang.String  creditFlag
	 */
	public String getCreditFlag(){
		return this.creditFlag;
	}

	/**
	 *方法: 设置creditFlag
	 *@param: java.lang.String  creditFlag
	 */
	public void setCreditFlag(String creditFlag){
		this.creditFlag = creditFlag;
	}

	/**
	 *方法: 获得loanFlag
	 *@return: java.lang.String  loanFlag
	 */
	public String getLoanFlag(){
		return this.loanFlag;
	}

	/**
	 *方法: 设置loanFlag
	 *@param: java.lang.String  loanFlag
	 */
	public void setLoanFlag(String loanFlag){
		this.loanFlag = loanFlag;
	}

	/**
	 *方法: 获得guaranteeFlag
	 *@return: java.lang.String  guaranteeFlag
	 */
	public String getGuaranteeFlag(){
		return this.guaranteeFlag;
	}

	/**
	 *方法: 设置guaranteeFlag
	 *@param: java.lang.String  guaranteeFlag
	 */
	public void setGuaranteeFlag(String guaranteeFlag){
		this.guaranteeFlag = guaranteeFlag;
	}

	/**
	 *方法: 获得taxFlag
	 *@return: java.lang.String  taxFlag
	 */
	public String getTaxFlag(){
		return this.taxFlag;
	}

	/**
	 *方法: 设置taxFlag
	 *@param: java.lang.String  taxFlag
	 */
	public void setTaxFlag(String taxFlag){
		this.taxFlag = taxFlag;
	}

	/**
	 *方法: 获得judgmentFlag
	 *@return: java.lang.String  judgmentFlag
	 */
	public String getJudgmentFlag(){
		return this.judgmentFlag;
	}

	/**
	 *方法: 设置judgmentFlag
	 *@param: java.lang.String  judgmentFlag
	 */
	public void setJudgmentFlag(String judgmentFlag){
		this.judgmentFlag = judgmentFlag;
	}

	/**
	 *方法: 获得enforcementFlag
	 *@return: java.lang.String  enforcementFlag
	 */
	public String getEnforcementFlag(){
		return this.enforcementFlag;
	}

	/**
	 *方法: 设置enforcementFlag
	 *@param: java.lang.String  enforcementFlag
	 */
	public void setEnforcementFlag(String enforcementFlag){
		this.enforcementFlag = enforcementFlag;
	}

	/**
	 *方法: 获得punishmentFlag
	 *@return: java.lang.String  punishmentFlag
	 */
	public String getPunishmentFlag(){
		return this.punishmentFlag;
	}

	/**
	 *方法: 设置punishmentFlag
	 *@param: java.lang.String  punishmentFlag
	 */
	public void setPunishmentFlag(String punishmentFlag){
		this.punishmentFlag = punishmentFlag;
	}

	/**
	 *方法: 获得telecomFlag
	 *@return: java.lang.String  telecomFlag
	 */
	public String getTelecomFlag(){
		return this.telecomFlag;
	}

	/**
	 *方法: 设置telecomFlag
	 *@param: java.lang.String  telecomFlag
	 */
	public void setTelecomFlag(String telecomFlag){
		this.telecomFlag = telecomFlag;
	}

	/**
	 *方法: 获得checks
	 *@return: java.lang.String  checks
	 */
	public String getChecks(){
		return this.checks;
	}

	/**
	 *方法: 设置checks
	 *@param: java.lang.String  checks
	 */
	public void setChecks(String checks){
		this.checks = checks;
	}

	/**
	 *方法: 获得isfail
	 *@return: java.lang.String  isfail
	 */
	public String getIsfail(){
		return this.isfail;
	}

	/**
	 *方法: 设置isfail
	 *@param: java.lang.String  isfail
	 */
	public void setIsfail(String isfail){
		this.isfail = isfail;
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

}