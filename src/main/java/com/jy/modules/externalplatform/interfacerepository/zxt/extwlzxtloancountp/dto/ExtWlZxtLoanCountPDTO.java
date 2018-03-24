package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtloancountp.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:同业借贷申请次数(A501/A502/A503/B202)
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-18 16:03:04
 */
public class ExtWlZxtLoanCountPDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**模块查询状态表ID
*/
	private Long moduleFkId;

	/**机构类型
*/
	private String orgBizType;

	/**关联人手机号
*/
	private String mobileNo;

	/**近 7 天申请次数
*/
	private String inLatest7Dates;

	/**近 30 天申请次数
*/
	private String inLatest30Dates;

	/**近 90 天申请次数
*/
	private String inLatest90Dates;

	/**近 180 天申请次数
*/
	private String inLatest180Dates;

	/**最近一次申请时间
*/
	private String recentlyDate;

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
	 *方法: 获得moduleFkId
	 *@return: java.lang.Long  moduleFkId
	 */
	public Long getModuleFkId(){
		return this.moduleFkId;
	}

	/**
	 *方法: 设置moduleFkId
	 *@param: java.lang.Long  moduleFkId
	 */
	public void setModuleFkId(Long moduleFkId){
		this.moduleFkId = moduleFkId;
	}

	/**
	 *方法: 获得orgBizType
	 *@return: java.lang.String  orgBizType
	 */
	public String getOrgBizType(){
		return this.orgBizType;
	}

	/**
	 *方法: 设置orgBizType
	 *@param: java.lang.String  orgBizType
	 */
	public void setOrgBizType(String orgBizType){
		this.orgBizType = orgBizType;
	}

	/**
	 *方法: 获得mobileNo
	 *@return: java.lang.String  mobileNo
	 */
	public String getMobileNo(){
		return this.mobileNo;
	}

	/**
	 *方法: 设置mobileNo
	 *@param: java.lang.String  mobileNo
	 */
	public void setMobileNo(String mobileNo){
		this.mobileNo = mobileNo;
	}

	/**
	 *方法: 获得inLatest7Dates
	 *@return: java.lang.String  inLatest7Dates
	 */
	public String getInLatest7Dates(){
		return this.inLatest7Dates;
	}

	/**
	 *方法: 设置inLatest7Dates
	 *@param: java.lang.String  inLatest7Dates
	 */
	public void setInLatest7Dates(String inLatest7Dates){
		this.inLatest7Dates = inLatest7Dates;
	}

	/**
	 *方法: 获得inLatest30Dates
	 *@return: java.lang.String  inLatest30Dates
	 */
	public String getInLatest30Dates(){
		return this.inLatest30Dates;
	}

	/**
	 *方法: 设置inLatest30Dates
	 *@param: java.lang.String  inLatest30Dates
	 */
	public void setInLatest30Dates(String inLatest30Dates){
		this.inLatest30Dates = inLatest30Dates;
	}

	/**
	 *方法: 获得inLatest90Dates
	 *@return: java.lang.String  inLatest90Dates
	 */
	public String getInLatest90Dates(){
		return this.inLatest90Dates;
	}

	/**
	 *方法: 设置inLatest90Dates
	 *@param: java.lang.String  inLatest90Dates
	 */
	public void setInLatest90Dates(String inLatest90Dates){
		this.inLatest90Dates = inLatest90Dates;
	}

	/**
	 *方法: 获得inLatest180Dates
	 *@return: java.lang.String  inLatest180Dates
	 */
	public String getInLatest180Dates(){
		return this.inLatest180Dates;
	}

	/**
	 *方法: 设置inLatest180Dates
	 *@param: java.lang.String  inLatest180Dates
	 */
	public void setInLatest180Dates(String inLatest180Dates){
		this.inLatest180Dates = inLatest180Dates;
	}

	/**
	 *方法: 获得recentlyDate
	 *@return: java.lang.String  recentlyDate
	 */
	public String getRecentlyDate(){
		return this.recentlyDate;
	}

	/**
	 *方法: 设置recentlyDate
	 *@param: java.lang.String  recentlyDate
	 */
	public void setRecentlyDate(String recentlyDate){
		this.recentlyDate = recentlyDate;
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