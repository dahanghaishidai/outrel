package com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrecordstock.dto;

import java.util.List;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrdetailstock.dto.ExtShQrDetailStockDTO;
import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:算话征信查询记录查询报告
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-08 18:04:56
 */
public class ExtShQrecordStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**查询机构数*/
	private java.lang.Long orgCount;

	/**查询次数*/
	private java.lang.Long queryCount;

	/**最近3个月查询机构数*/
	private java.lang.Long orgCountM3;

	/**最近3个月查询次数*/
	private java.lang.Long queryCountM3;

	/**最近6个月查询机构数*/
	private java.lang.Long orgCountM6;

	/**最近6个月查询次数*/
	private java.lang.Long queryCountM6;
	
	/**是否有详细信息*/
	private java.lang.String detailMsg;

	/**创建时间*/
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

	
	private String errors ;
	/**查询记录明细列表**/
	private List<ExtShQrDetailStockDTO> details ;

	public List<ExtShQrDetailStockDTO> getDetails() {
		return details;
	}

	public void setDetails(List<ExtShQrDetailStockDTO> details) {
		this.details = details;
	}
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
	 *方法: 获得orgCount
	 *@return: java.lang.Long  orgCount
	 */
	public java.lang.Long getOrgCount(){
		return this.orgCount;
	}

	/**
	 *方法: 设置orgCount
	 *@param: java.lang.Long  orgCount
	 */
	public void setOrgCount(java.lang.Long orgCount){
		this.orgCount = orgCount;
	}

	/**
	 *方法: 获得queryCount
	 *@return: java.lang.Long  queryCount
	 */
	public java.lang.Long getQueryCount(){
		return this.queryCount;
	}

	/**
	 *方法: 设置queryCount
	 *@param: java.lang.Long  queryCount
	 */
	public void setQueryCount(java.lang.Long queryCount){
		this.queryCount = queryCount;
	}

	/**
	 *方法: 获得orgCountM3
	 *@return: java.lang.Long  orgCountM3
	 */
	public java.lang.Long getOrgCountM3(){
		return this.orgCountM3;
	}

	/**
	 *方法: 设置orgCountM3
	 *@param: java.lang.Long  orgCountM3
	 */
	public void setOrgCountM3(java.lang.Long orgCountM3){
		this.orgCountM3 = orgCountM3;
	}

	/**
	 *方法: 获得queryCountM3
	 *@return: java.lang.Long  queryCountM3
	 */
	public java.lang.Long getQueryCountM3(){
		return this.queryCountM3;
	}

	/**
	 *方法: 设置queryCountM3
	 *@param: java.lang.Long  queryCountM3
	 */
	public void setQueryCountM3(java.lang.Long queryCountM3){
		this.queryCountM3 = queryCountM3;
	}

	/**
	 *方法: 获得orgCountM6
	 *@return: java.lang.Long  orgCountM6
	 */
	public java.lang.Long getOrgCountM6(){
		return this.orgCountM6;
	}

	/**
	 *方法: 设置orgCountM6
	 *@param: java.lang.Long  orgCountM6
	 */
	public void setOrgCountM6(java.lang.Long orgCountM6){
		this.orgCountM6 = orgCountM6;
	}

	/**
	 *方法: 获得queryCountM6
	 *@return: java.lang.Long  queryCountM6
	 */
	public java.lang.Long getQueryCountM6(){
		return this.queryCountM6;
	}

	/**
	 *方法: 设置queryCountM6
	 *@param: java.lang.Long  queryCountM6
	 */
	public void setQueryCountM6(java.lang.Long queryCountM6){
		this.queryCountM6 = queryCountM6;
	}

	public java.lang.String getDetailMsg() {
		return detailMsg;
	}

	public void setDetailMsg(java.lang.String detailMsg) {
		this.detailMsg = detailMsg;
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

	public String getErrors() {
		return errors;
	}

	public void setErrors(String errors) {
		this.errors = errors;
	}

}