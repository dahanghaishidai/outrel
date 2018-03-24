package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrpunishments.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话人行结构化版(行政处罚记录表)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-21 19:56:07
 */
public class ExtWlShSrPunishmentsDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**征信主表ID*/
	private Long fkReportId;

	/**信息详情*/
	private String original;

	/**处罚机构*/
	private String organization;

	/**文书编号*/
	private String docketNo;

	/**是否行政复议*/
	private String reconsiderationFlag;

	/**行政复议结果*/
	private String reconsideration;

	/**处罚内容*/
	private String punishmentContent;

	/**处罚金额*/
	private String punishmentAmount;

	/**处罚生效时间*/
	private String punishmentEffective;

	/**处罚截止时间*/
	private String punishmentDeadline;

	/**是否失败(0-成功;1-失败)*/
	private String isfail;

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
	 *方法: 获得fkReportId
	 *@return: java.lang.Long  fkReportId
	 */
	public Long getFkReportId(){
		return this.fkReportId;
	}

	/**
	 *方法: 设置fkReportId
	 *@param: java.lang.Long  fkReportId
	 */
	public void setFkReportId(Long fkReportId){
		this.fkReportId = fkReportId;
	}

	/**
	 *方法: 获得original
	 *@return: java.lang.String  original
	 */
	public String getOriginal(){
		return this.original;
	}

	/**
	 *方法: 设置original
	 *@param: java.lang.String  original
	 */
	public void setOriginal(String original){
		this.original = original;
	}

	/**
	 *方法: 获得organization
	 *@return: java.lang.String  organization
	 */
	public String getOrganization(){
		return this.organization;
	}

	/**
	 *方法: 设置organization
	 *@param: java.lang.String  organization
	 */
	public void setOrganization(String organization){
		this.organization = organization;
	}

	/**
	 *方法: 获得docketNo
	 *@return: java.lang.String  docketNo
	 */
	public String getDocketNo(){
		return this.docketNo;
	}

	/**
	 *方法: 设置docketNo
	 *@param: java.lang.String  docketNo
	 */
	public void setDocketNo(String docketNo){
		this.docketNo = docketNo;
	}

	/**
	 *方法: 获得reconsiderationFlag
	 *@return: java.lang.String  reconsiderationFlag
	 */
	public String getReconsiderationFlag(){
		return this.reconsiderationFlag;
	}

	/**
	 *方法: 设置reconsiderationFlag
	 *@param: java.lang.String  reconsiderationFlag
	 */
	public void setReconsiderationFlag(String reconsiderationFlag){
		this.reconsiderationFlag = reconsiderationFlag;
	}

	/**
	 *方法: 获得reconsideration
	 *@return: java.lang.String  reconsideration
	 */
	public String getReconsideration(){
		return this.reconsideration;
	}

	/**
	 *方法: 设置reconsideration
	 *@param: java.lang.String  reconsideration
	 */
	public void setReconsideration(String reconsideration){
		this.reconsideration = reconsideration;
	}

	/**
	 *方法: 获得punishmentContent
	 *@return: java.lang.String  punishmentContent
	 */
	public String getPunishmentContent(){
		return this.punishmentContent;
	}

	/**
	 *方法: 设置punishmentContent
	 *@param: java.lang.String  punishmentContent
	 */
	public void setPunishmentContent(String punishmentContent){
		this.punishmentContent = punishmentContent;
	}

	/**
	 *方法: 获得punishmentAmount
	 *@return: java.lang.String  punishmentAmount
	 */
	public String getPunishmentAmount(){
		return this.punishmentAmount;
	}

	/**
	 *方法: 设置punishmentAmount
	 *@param: java.lang.String  punishmentAmount
	 */
	public void setPunishmentAmount(String punishmentAmount){
		this.punishmentAmount = punishmentAmount;
	}

	/**
	 *方法: 获得punishmentEffective
	 *@return: java.lang.String  punishmentEffective
	 */
	public String getPunishmentEffective(){
		return this.punishmentEffective;
	}

	/**
	 *方法: 设置punishmentEffective
	 *@param: java.lang.String  punishmentEffective
	 */
	public void setPunishmentEffective(String punishmentEffective){
		this.punishmentEffective = punishmentEffective;
	}

	/**
	 *方法: 获得punishmentDeadline
	 *@return: java.lang.String  punishmentDeadline
	 */
	public String getPunishmentDeadline(){
		return this.punishmentDeadline;
	}

	/**
	 *方法: 设置punishmentDeadline
	 *@param: java.lang.String  punishmentDeadline
	 */
	public void setPunishmentDeadline(String punishmentDeadline){
		this.punishmentDeadline = punishmentDeadline;
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