package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsinfo.dto;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsresult.dto.ExtWlBaiduLbsResultDTO;
import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:百度金融LBS地址校验主表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-08 15:26:55
 */
public class ExtWlBaiduLbsInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**进件编号*/
	private String intoId;

	/**请求编码*/
	private String requestId;

	/**返回编码*/
	private String status;

	/**返回错误信息*/
	private String message;

	/**姓名*/
	private String realName;

	/**证件类型*/
	private String idType;

	/**证件号码*/
	private String idNo;

	/**手机号*/
	private String cellPhone;

	/**百度账号*/
	private String baiduAccount;

	/**设备号*/
	private String imei;

	/**固定地址是否是常访地*/
	private String visitFrequencyLevel;

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
	
	private ExtWlBaiduLbsResultDTO[] home_address_list;
	private ExtWlBaiduLbsResultDTO[] home_bdcom_address_list;
	private ExtWlBaiduLbsResultDTO[] company_address_list;
	private ExtWlBaiduLbsResultDTO[] company_bdhome_address_list;
	private ExtWlBaiduLbsResultDTO[] receiver_address_list;
	private ExtWlBaiduLbsResultDTO[] home_company_address_list;
	private ExtWlBaiduLbsResultDTO[] home_busShop_address_list;
	private ExtWlBaiduLbsResultDTO[] com_busShop_address_list;
	private FixAddressDTO[] fix_address_list;

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
	 *方法: 获得intoId
	 *@return: java.lang.String  intoId
	 */
	public String getIntoId(){
		return this.intoId;
	}

	/**
	 *方法: 设置intoId
	 *@param: java.lang.String  intoId
	 */
	public void setIntoId(String intoId){
		this.intoId = intoId;
	}

	/**
	 *方法: 获得requestId
	 *@return: java.lang.String  requestId
	 */
	public String getRequestId(){
		return this.requestId;
	}

	/**
	 *方法: 设置requestId
	 *@param: java.lang.String  requestId
	 */
	public void setRequestId(String requestId){
		this.requestId = requestId;
	}

	/**
	 *方法: 获得status
	 *@return: java.lang.String  status
	 */
	public String getStatus(){
		return this.status;
	}

	/**
	 *方法: 设置status
	 *@param: java.lang.String  status
	 */
	public void setStatus(String status){
		this.status = status;
	}

	/**
	 *方法: 获得message
	 *@return: java.lang.String  message
	 */
	public String getMessage(){
		return this.message;
	}

	/**
	 *方法: 设置message
	 *@param: java.lang.String  message
	 */
	public void setMessage(String message){
		this.message = message;
	}

	/**
	 *方法: 获得realName
	 *@return: java.lang.String  realName
	 */
	public String getRealName(){
		return this.realName;
	}

	/**
	 *方法: 设置realName
	 *@param: java.lang.String  realName
	 */
	public void setRealName(String realName){
		this.realName = realName;
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
	 *方法: 获得cellPhone
	 *@return: java.lang.String  cellPhone
	 */
	public String getCellPhone(){
		return this.cellPhone;
	}

	/**
	 *方法: 设置cellPhone
	 *@param: java.lang.String  cellPhone
	 */
	public void setCellPhone(String cellPhone){
		this.cellPhone = cellPhone;
	}

	/**
	 *方法: 获得baiduAccount
	 *@return: java.lang.String  baiduAccount
	 */
	public String getBaiduAccount(){
		return this.baiduAccount;
	}

	/**
	 *方法: 设置baiduAccount
	 *@param: java.lang.String  baiduAccount
	 */
	public void setBaiduAccount(String baiduAccount){
		this.baiduAccount = baiduAccount;
	}

	/**
	 *方法: 获得imei
	 *@return: java.lang.String  imei
	 */
	public String getImei(){
		return this.imei;
	}

	/**
	 *方法: 设置imei
	 *@param: java.lang.String  imei
	 */
	public void setImei(String imei){
		this.imei = imei;
	}

	/**
	 *方法: 获得visitFrequencyLevel
	 *@return: java.lang.String  visitFrequencyLevel
	 */
	public String getVisitFrequencyLevel(){
		return this.visitFrequencyLevel;
	}

	/**
	 *方法: 设置visitFrequencyLevel
	 *@param: java.lang.String  visitFrequencyLevel
	 */
	public void setVisitFrequencyLevel(String visitFrequencyLevel){
		this.visitFrequencyLevel = visitFrequencyLevel;
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

	public ExtWlBaiduLbsResultDTO[] getHome_address_list() {
		return home_address_list;
	}

	public void setHome_address_list(ExtWlBaiduLbsResultDTO[] home_address_list) {
		this.home_address_list = home_address_list;
	}

	public ExtWlBaiduLbsResultDTO[] getHome_bdcom_address_list() {
		return home_bdcom_address_list;
	}

	public void setHome_bdcom_address_list(
			ExtWlBaiduLbsResultDTO[] home_bdcom_address_list) {
		this.home_bdcom_address_list = home_bdcom_address_list;
	}

	public ExtWlBaiduLbsResultDTO[] getCompany_address_list() {
		return company_address_list;
	}

	public void setCompany_address_list(
			ExtWlBaiduLbsResultDTO[] company_address_list) {
		this.company_address_list = company_address_list;
	}

	public ExtWlBaiduLbsResultDTO[] getCompany_bdhome_address_list() {
		return company_bdhome_address_list;
	}

	public void setCompany_bdhome_address_list(
			ExtWlBaiduLbsResultDTO[] company_bdhome_address_list) {
		this.company_bdhome_address_list = company_bdhome_address_list;
	}

	public ExtWlBaiduLbsResultDTO[] getReceiver_address_list() {
		return receiver_address_list;
	}

	public void setReceiver_address_list(
			ExtWlBaiduLbsResultDTO[] receiver_address_list) {
		this.receiver_address_list = receiver_address_list;
	}

	public ExtWlBaiduLbsResultDTO[] getHome_company_address_list() {
		return home_company_address_list;
	}

	public void setHome_company_address_list(
			ExtWlBaiduLbsResultDTO[] home_company_address_list) {
		this.home_company_address_list = home_company_address_list;
	}

	public ExtWlBaiduLbsResultDTO[] getHome_busShop_address_list() {
		return home_busShop_address_list;
	}

	public void setHome_busShop_address_list(
			ExtWlBaiduLbsResultDTO[] home_busShop_address_list) {
		this.home_busShop_address_list = home_busShop_address_list;
	}

	public ExtWlBaiduLbsResultDTO[] getCom_busShop_address_list() {
		return com_busShop_address_list;
	}

	public void setCom_busShop_address_list(
			ExtWlBaiduLbsResultDTO[] com_busShop_address_list) {
		this.com_busShop_address_list = com_busShop_address_list;
	}

	public FixAddressDTO[] getFix_address_list() {
		return fix_address_list;
	}

	public void setFix_address_list(FixAddressDTO[] fix_address_list) {
		this.fix_address_list = fix_address_list;
	}

}