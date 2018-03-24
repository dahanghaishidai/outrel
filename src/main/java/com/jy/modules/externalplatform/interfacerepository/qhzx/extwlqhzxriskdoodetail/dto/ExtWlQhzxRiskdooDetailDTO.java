package com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdoodetail.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:前海征信风险度提示明细表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-06 16:03:24
 */
public class ExtWlQhzxRiskdooDetailDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键ID*/
	private Long id;

	/**证件号码*/
	private String idNo;

	/**证件类型*/
	private String idType;

	/**主体名称*/
	private String name;

	/**序列号*/
	private String seqNo;

	/**来源代码（A - 信贷逾期风险  B - 行政负面风险  99 - 权限不足）*/
	private String sourceId;

	/**风险得分*/
	private String rskScore;

	/**风险标记（2 - 被执行人 B1 - 失信被执行人 B3 - 交通严重违章 99 - 权限不足）*/
	private String rskMark;

	/**业务发生时间*/
	private String dataBuildTime;

	/**数据状态（99 - 权限不足 1 - 已验证 2 - 未验证 3 - 异议中）*/
	private String dataStatus;

	/**错误代码( 业务数据：E000000成功 其他失败)*/
	private String erCode;

	/**错误信息*/
	private String erMsg;

	/**风险度提示主表ID*/
	private Long fkRiskdooId;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

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
	 *方法: 获得idNo
	 *@return: java.lang.String  idNo
	 */
	public String getIdNo(){
		return this.idNo;
	}

	/**
	 *方法: 设置idNo
	 *@param: java.lang.String  idNo
	 */
	public void setIdNo(String idNo){
		this.idNo = idNo;
	}

	/**
	 *方法: 获得idType
	 *@return: java.lang.String  idType
	 */
	public String getIdType(){
		return this.idType;
	}

	/**
	 *方法: 设置idType
	 *@param: java.lang.String  idType
	 */
	public void setIdType(String idType){
		this.idType = idType;
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
	 *方法: 获得seqNo
	 *@return: java.lang.String  seqNo
	 */
	public String getSeqNo(){
		return this.seqNo;
	}

	/**
	 *方法: 设置seqNo
	 *@param: java.lang.String  seqNo
	 */
	public void setSeqNo(String seqNo){
		this.seqNo = seqNo;
	}

	/**
	 *方法: 获得sourceId
	 *@return: java.lang.String  sourceId
	 */
	public String getSourceId(){
		return this.sourceId;
	}

	/**
	 *方法: 设置sourceId
	 *@param: java.lang.String  sourceId
	 */
	public void setSourceId(String sourceId){
		this.sourceId = sourceId;
	}

	/**
	 *方法: 获得rskScore
	 *@return: java.lang.String  rskScore
	 */
	public String getRskScore(){
		return this.rskScore;
	}

	/**
	 *方法: 设置rskScore
	 *@param: java.lang.String  rskScore
	 */
	public void setRskScore(String rskScore){
		this.rskScore = rskScore;
	}

	/**
	 *方法: 获得rskMark
	 *@return: java.lang.String  rskMark
	 */
	public String getRskMark(){
		return this.rskMark;
	}

	/**
	 *方法: 设置rskMark
	 *@param: java.lang.String  rskMark
	 */
	public void setRskMark(String rskMark){
		this.rskMark = rskMark;
	}

	/**
	 *方法: 获得dataBuildTime
	 *@return: java.lang.String  dataBuildTime
	 */
	public String getDataBuildTime(){
		return this.dataBuildTime;
	}

	/**
	 *方法: 设置dataBuildTime
	 *@param: java.lang.String  dataBuildTime
	 */
	public void setDataBuildTime(String dataBuildTime){
		this.dataBuildTime = dataBuildTime;
	}

	/**
	 *方法: 获得dataStatus
	 *@return: java.lang.String  dataStatus
	 */
	public String getDataStatus(){
		return this.dataStatus;
	}

	/**
	 *方法: 设置dataStatus
	 *@param: java.lang.String  dataStatus
	 */
	public void setDataStatus(String dataStatus){
		this.dataStatus = dataStatus;
	}

	/**
	 *方法: 获得erCode
	 *@return: java.lang.String  erCode
	 */
	public String getErCode(){
		return this.erCode;
	}

	/**
	 *方法: 设置erCode
	 *@param: java.lang.String  erCode
	 */
	public void setErCode(String erCode){
		this.erCode = erCode;
	}

	/**
	 *方法: 获得erMsg
	 *@return: java.lang.String  erMsg
	 */
	public String getErMsg(){
		return this.erMsg;
	}

	/**
	 *方法: 设置erMsg
	 *@param: java.lang.String  erMsg
	 */
	public void setErMsg(String erMsg){
		this.erMsg = erMsg;
	}

	/**
	 *方法: 获得fkRiskdooId
	 *@return: java.lang.Long  fkRiskdooId
	 */
	public Long getFkRiskdooId(){
		return this.fkRiskdooId;
	}

	/**
	 *方法: 设置fkRiskdooId
	 *@param: java.lang.Long  fkRiskdooId
	 */
	public void setFkRiskdooId(Long fkRiskdooId){
		this.fkRiskdooId = fkRiskdooId;
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

}