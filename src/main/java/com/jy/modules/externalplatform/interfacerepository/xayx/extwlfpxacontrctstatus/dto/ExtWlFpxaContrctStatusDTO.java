package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacontrctstatus.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 * @className: ExtWlFpxaContrctStatusDTO
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacontrctstatus.dto
 * @describe: ExtWlFpxaContrctStatusDTO
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 9:36
 **/
public class ExtWlFpxaContrctStatusDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long modifyBy;

	/**小爱有信基本信息表主键*/
	private Long fkId;

	/**放款时间*/
	private String lendedTime;

	/**总期数 数值*/
	private Long totalPeriod;

	/**已还期数*/
	private Long repayedPeriod;

	/**已还本金总额 为金额区间*/
	private String repayedPricipal;

	/**最近一次还款时间*/
	private String recentRepayedDate;

	/**当前逾期期数*/
	private Long currentOverduePeriods;

	/**当前逾期金额 为金额区间*/
	private String recentRepaymentMoney;

	/**应还款金额*/
	private String principal;

	/**历史是否贷款逾期 1:有/2:无/3:未知(-)*/
	private String overDue;

	/**当前逾期  1:有/2:无/3:未知(-)*/
	private String currentDue;

	/**历史最长逾期时间*/
	private String maxOverDueDays;

	/**消费分期是否逾期 0:为逾期 1:逾期 空：无结果*/
	private String installmentOverdue;

	/**车贷是否逾期  0:为逾期 1:逾期 空：无结果*/
	private String carLoanOverdue;

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

	/**
	 *方法: 获得fkId
	 *@return: java.lang.Long  fkId
	 */
	public Long getFkId(){
		return this.fkId;
	}

	/**
	 *方法: 设置fkId
	 *@param: java.lang.Long  fkId
	 */
	public void setFkId(Long fkId){
		this.fkId = fkId;
	}

	/**
	 *方法: 获得lendedTime
	 *@return: java.lang.String  lendedTime
	 */
	public String getLendedTime(){
		return this.lendedTime;
	}

	/**
	 *方法: 设置lendedTime
	 *@param: java.lang.String  lendedTime
	 */
	public void setLendedTime(String lendedTime){
		this.lendedTime = lendedTime;
	}

	/**
	 *方法: 获得totalPeriod
	 *@return: java.lang.Long  totalPeriod
	 */
	public Long getTotalPeriod(){
		return this.totalPeriod;
	}

	/**
	 *方法: 设置totalPeriod
	 *@param: java.lang.Long  totalPeriod
	 */
	public void setTotalPeriod(Long totalPeriod){
		this.totalPeriod = totalPeriod;
	}

	/**
	 *方法: 获得repayedPeriod
	 *@return: java.lang.Long  repayedPeriod
	 */
	public Long getRepayedPeriod(){
		return this.repayedPeriod;
	}

	/**
	 *方法: 设置repayedPeriod
	 *@param: java.lang.Long  repayedPeriod
	 */
	public void setRepayedPeriod(Long repayedPeriod){
		this.repayedPeriod = repayedPeriod;
	}

	/**
	 *方法: 获得repayedPricipal
	 *@return: java.lang.String  repayedPricipal
	 */
	public String getRepayedPricipal(){
		return this.repayedPricipal;
	}

	/**
	 *方法: 设置repayedPricipal
	 *@param: java.lang.String  repayedPricipal
	 */
	public void setRepayedPricipal(String repayedPricipal){
		this.repayedPricipal = repayedPricipal;
	}

	/**
	 *方法: 获得recentRepayedDate
	 *@return: java.lang.String  recentRepayedDate
	 */
	public String getRecentRepayedDate(){
		return this.recentRepayedDate;
	}

	/**
	 *方法: 设置recentRepayedDate
	 *@param: java.lang.String  recentRepayedDate
	 */
	public void setRecentRepayedDate(String recentRepayedDate){
		this.recentRepayedDate = recentRepayedDate;
	}

	/**
	 *方法: 获得currentOverduePeriods
	 *@return: java.lang.Long  currentOverduePeriods
	 */
	public Long getCurrentOverduePeriods(){
		return this.currentOverduePeriods;
	}

	/**
	 *方法: 设置currentOverduePeriods
	 *@param: java.lang.Long  currentOverduePeriods
	 */
	public void setCurrentOverduePeriods(Long currentOverduePeriods){
		this.currentOverduePeriods = currentOverduePeriods;
	}

	/**
	 *方法: 获得recentRepaymentMoney
	 *@return: java.lang.String  recentRepaymentMoney
	 */
	public String getRecentRepaymentMoney(){
		return this.recentRepaymentMoney;
	}

	/**
	 *方法: 设置recentRepaymentMoney
	 *@param: java.lang.String  recentRepaymentMoney
	 */
	public void setRecentRepaymentMoney(String recentRepaymentMoney){
		this.recentRepaymentMoney = recentRepaymentMoney;
	}

	/**
	 *方法: 获得principal
	 *@return: java.lang.String  principal
	 */
	public String getPrincipal(){
		return this.principal;
	}

	/**
	 *方法: 设置principal
	 *@param: java.lang.String  principal
	 */
	public void setPrincipal(String principal){
		this.principal = principal;
	}

	/**
	 *方法: 获得overDue
	 *@return: java.lang.String  overDue
	 */
	public String getOverDue(){
		return this.overDue;
	}

	/**
	 *方法: 设置overDue
	 *@param: java.lang.String  overDue
	 */
	public void setOverDue(String overDue){
		this.overDue = overDue;
	}

	/**
	 *方法: 获得currentDue
	 *@return: java.lang.String  currentDue
	 */
	public String getCurrentDue(){
		return this.currentDue;
	}

	/**
	 *方法: 设置currentDue
	 *@param: java.lang.String  currentDue
	 */
	public void setCurrentDue(String currentDue){
		this.currentDue = currentDue;
	}

	/**
	 *方法: 获得maxOverDueDays
	 *@return: java.lang.String  maxOverDueDays
	 */
	public String getMaxOverDueDays(){
		return this.maxOverDueDays;
	}

	/**
	 *方法: 设置maxOverDueDays
	 *@param: java.lang.String  maxOverDueDays
	 */
	public void setMaxOverDueDays(String maxOverDueDays){
		this.maxOverDueDays = maxOverDueDays;
	}

	/**
	 *方法: 获得installmentOverdue
	 *@return: java.lang.String  installmentOverdue
	 */
	public String getInstallmentOverdue(){
		return this.installmentOverdue;
	}

	/**
	 *方法: 设置installmentOverdue
	 *@param: java.lang.String  installmentOverdue
	 */
	public void setInstallmentOverdue(String installmentOverdue){
		this.installmentOverdue = installmentOverdue;
	}

	/**
	 *方法: 获得carLoanOverdue
	 *@return: java.lang.String  carLoanOverdue
	 */
	public String getCarLoanOverdue(){
		return this.carLoanOverdue;
	}

	/**
	 *方法: 设置carLoanOverdue
	 *@param: java.lang.String  carLoanOverdue
	 */
	public void setCarLoanOverdue(String carLoanOverdue){
		this.carLoanOverdue = carLoanOverdue;
	}

}