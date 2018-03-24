package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklenddetail.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:多重借贷查询数据详情表
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-12 17:01:33
 */
public class ExtWlTxskLendDetailDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**多重借贷查询数据表主键*/
	private Long fkMultiId;

	/**详情类型（信贷平台注册详情/贷款申请详情/贷款放款详情/贷款驳回详情/逾期平台详情查询/欠款查询）
*/
	private String detailType;

	/**平台类型
*/
	private String type;

	/**平台代码
*/
	private String code;

	/**注册/申请/放款/驳回时间
*/
	private String time;

	/**申请/放款金额
*/
	private String appLoanAmount;

	/**申请结果  目前返回空,预留字段
*/
	private String appResult;

	/**逾期次数
*/
	private String counts;

	/**逾期/欠款金额区间
*/
	private String money;

	/**创建时间
*/
	private java.sql.Timestamp createTime;

	/**修改时间
*/
	private java.sql.Timestamp updateTime;

	/**创建人
*/
	private Long createBy;

	/**修改人
*/
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
	 *方法: 获得fkMultiId
	 *@return: java.lang.Long  fkMultiId
	 */
	public Long getFkMultiId(){
		return this.fkMultiId;
	}

	/**
	 *方法: 设置fkMultiId
	 *@param: java.lang.Long  fkMultiId
	 */
	public void setFkMultiId(Long fkMultiId){
		this.fkMultiId = fkMultiId;
	}

	/**
	 *方法: 获得detailType
	 *@return: java.lang.String  detailType
	 */
	public String getDetailType(){
		return this.detailType;
	}

	/**
	 *方法: 设置detailType
	 *@param: java.lang.String  detailType
	 */
	public void setDetailType(String detailType){
		this.detailType = detailType;
	}

	/**
	 *方法: 获得type
	 *@return: java.lang.String  type
	 */
	public String getType(){
		return this.type;
	}

	/**
	 *方法: 设置type
	 *@param: java.lang.String  type
	 */
	public void setType(String type){
		this.type = type;
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
	 *方法: 获得time
	 *@return: java.lang.String  time
	 */
	public String getTime(){
		return this.time;
	}

	/**
	 *方法: 设置time
	 *@param: java.lang.String  time
	 */
	public void setTime(String time){
		this.time = time;
	}

	/**
	 *方法: 获得appLoanAmount
	 *@return: java.lang.String  appLoanAmount
	 */
	public String getAppLoanAmount(){
		return this.appLoanAmount;
	}

	/**
	 *方法: 设置appLoanAmount
	 *@param: java.lang.String  appLoanAmount
	 */
	public void setAppLoanAmount(String appLoanAmount){
		this.appLoanAmount = appLoanAmount;
	}

	/**
	 *方法: 获得appResult
	 *@return: java.lang.String  appResult
	 */
	public String getAppResult(){
		return this.appResult;
	}

	/**
	 *方法: 设置appResult
	 *@param: java.lang.String  appResult
	 */
	public void setAppResult(String appResult){
		this.appResult = appResult;
	}

	/**
	 *方法: 获得counts
	 *@return: java.lang.String  counts
	 */
	public String getCounts(){
		return this.counts;
	}

	/**
	 *方法: 设置counts
	 *@param: java.lang.String  counts
	 */
	public void setCounts(String counts){
		this.counts = counts;
	}

	/**
	 *方法: 获得money
	 *@return: java.lang.String  money
	 */
	public String getMoney(){
		return this.money;
	}

	/**
	 *方法: 设置money
	 *@param: java.lang.String  money
	 */
	public void setMoney(String money){
		this.money = money;
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
	 *方法: 获得updateTime
	 *@return: java.sql.Timestamp  updateTime
	 */
	public java.sql.Timestamp getUpdateTime(){
		return this.updateTime;
	}

	/**
	 *方法: 设置updateTime
	 *@param: java.sql.Timestamp  updateTime
	 */
	public void setUpdateTime(java.sql.Timestamp updateTime){
		this.updateTime = updateTime;
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