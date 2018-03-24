package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxreportinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:元素征信主表信息
 *@author dell
 *@version 1.0,
 *@date 2017-06-01 18:02:29
 */
public class ExtYszxReportInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**ID*/
	private java.lang.Long id;

	/**产品编码*/
	private java.lang.String prodCode;

	/**机构编码*/
	private java.lang.String orgCode;

	/**系统编码*/
	private java.lang.String sysCode;

	/**法人信息标志*/
	private java.lang.String corporateMsg;

	/**股东信息标志*/
	private java.lang.String shareholderMsg;

	/**返回码 1：查有 2：查无 3：查询报错 4：解析错误*/
	private java.lang.String retCode;

	/**返回错误信息*/
	private java.lang.String errorMsg;

	/**接口日志ID*/
	private java.lang.String interfaceId;

	/**新增时间*/
	private java.sql.Timestamp createTime;

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
	 *方法: 获得corporateMsg
	 *@return: java.lang.String  corporateMsg
	 */
	public java.lang.String getCorporateMsg(){
		return this.corporateMsg;
	}

	/**
	 *方法: 设置corporateMsg
	 *@param: java.lang.String  corporateMsg
	 */
	public void setCorporateMsg(java.lang.String corporateMsg){
		this.corporateMsg = corporateMsg;
	}

	/**
	 *方法: 获得shareholderMsg
	 *@return: java.lang.String  shareholderMsg
	 */
	public java.lang.String getShareholderMsg(){
		return this.shareholderMsg;
	}

	/**
	 *方法: 设置shareholderMsg
	 *@param: java.lang.String  shareholderMsg
	 */
	public void setShareholderMsg(java.lang.String shareholderMsg){
		this.shareholderMsg = shareholderMsg;
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