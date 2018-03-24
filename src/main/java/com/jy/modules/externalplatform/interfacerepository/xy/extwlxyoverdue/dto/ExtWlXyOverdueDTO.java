package com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverdue.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:新颜逾期信息表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-12 16:16:58
 */
public class ExtWlXyOverdueDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**进件客户关联编号
*/
	private Long intoCustRefId;

	/**查询结果码
*/
	private String code;

	/**查询结果描述
*/
	private String retDesc;

	/**商户订单号
*/
	private String transId;

	/**交易流水号
*/
	private String tradeNo;

	/**是否收费 Y：收费 N：不收费*/
	private String fee;

	/**身份证号*/
	private String idNo;

	/**姓名*/
	private String idName;

	/**逾期机构数*/
	private String memberCount;

	/**逾期订单数*/
	private String orderCount;

	/**负债金额 单位:元*/
	private String debtAmount;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long modifyBy;

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
	 *方法: 获得intoCustRefId
	 *@return: java.lang.Long  intoCustRefId
	 */
	public Long getIntoCustRefId(){
		return this.intoCustRefId;
	}

	/**
	 *方法: 设置intoCustRefId
	 *@param: java.lang.Long  intoCustRefId
	 */
	public void setIntoCustRefId(Long intoCustRefId){
		this.intoCustRefId = intoCustRefId;
	}

	/**
	 *方法: 获得code
	 *@return: java.lang.String  code
	 */
	public String getCode(){
		return this.code;
	}

	/**
	 *方法: 设置code
	 *@param: java.lang.String  code
	 */
	public void setCode(String code){
		this.code = code;
	}

	/**
	 *方法: 获得retDesc
	 *@return: java.lang.String  retDesc
	 */
	public String getRetDesc(){
		return this.retDesc;
	}

	/**
	 *方法: 设置retDesc
	 *@param: java.lang.String  retDesc
	 */
	public void setRetDesc(String retDesc){
		this.retDesc = retDesc;
	}

	/**
	 *方法: 获得transId
	 *@return: java.lang.String  transId
	 */
	public String getTransId(){
		return this.transId;
	}

	/**
	 *方法: 设置transId
	 *@param: java.lang.String  transId
	 */
	public void setTransId(String transId){
		this.transId = transId;
	}

	/**
	 *方法: 获得tradeNo
	 *@return: java.lang.String  tradeNo
	 */
	public String getTradeNo(){
		return this.tradeNo;
	}

	/**
	 *方法: 设置tradeNo
	 *@param: java.lang.String  tradeNo
	 */
	public void setTradeNo(String tradeNo){
		this.tradeNo = tradeNo;
	}

	/**
	 *方法: 获得fee
	 *@return: java.lang.String  fee
	 */
	public String getFee(){
		return this.fee;
	}

	/**
	 *方法: 设置fee
	 *@param: java.lang.String  fee
	 */
	public void setFee(String fee){
		this.fee = fee;
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
	 *方法: 获得idName
	 *@return: java.lang.String  idName
	 */
	public String getIdName(){
		return this.idName;
	}

	/**
	 *方法: 设置idName
	 *@param: java.lang.String  idName
	 */
	public void setIdName(String idName){
		this.idName = idName;
	}

	/**
	 *方法: 获得memberCount
	 *@return: java.lang.String  memberCount
	 */
	public String getMemberCount(){
		return this.memberCount;
	}

	/**
	 *方法: 设置memberCount
	 *@param: java.lang.String  memberCount
	 */
	public void setMemberCount(String memberCount){
		this.memberCount = memberCount;
	}

	/**
	 *方法: 获得orderCount
	 *@return: java.lang.String  orderCount
	 */
	public String getOrderCount(){
		return this.orderCount;
	}

	/**
	 *方法: 设置orderCount
	 *@param: java.lang.String  orderCount
	 */
	public void setOrderCount(String orderCount){
		this.orderCount = orderCount;
	}

	/**
	 *方法: 获得debtAmount
	 *@return: java.lang.String  debtAmount
	 */
	public String getDebtAmount(){
		return this.debtAmount;
	}

	/**
	 *方法: 设置debtAmount
	 *@param: java.lang.String  debtAmount
	 */
	public void setDebtAmount(String debtAmount){
		this.debtAmount = debtAmount;
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

}