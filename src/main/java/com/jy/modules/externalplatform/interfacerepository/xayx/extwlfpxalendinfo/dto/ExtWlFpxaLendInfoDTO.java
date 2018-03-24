package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalendinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 * @className: ExtWlFpxaLendInfoDTO
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalendinfo.dto
 * @describe: EXT_WL_FPXA_LEND_INFO
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 9:49
 **/
public class ExtWlFpxaLendInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**小爱有信基本信息表主键*/
	private Long fkId;

	/**是否有贷款申请 1:有/2:无/3:未知(-)*/
	private String haveLoanApply;

	/**审批状态 1:批贷已放款/2:拒贷/3:借款人放弃申请/4:审核中/5:待放款/6:未知(-)*/
	private String applyStatus;

	/**申请城市*/
	private String applyCity;

	/**贷款申请时间*/
	private String lendsTime;

	/**账号注册 1:有/2:无/3:未知(-)*/
	private String haveApply;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp updateTime;

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
	 *方法: 获得haveLoanApply
	 *@return: java.lang.String  haveLoanApply
	 */
	public String getHaveLoanApply(){
		return this.haveLoanApply;
	}

	/**
	 *方法: 设置haveLoanApply
	 *@param: java.lang.String  haveLoanApply
	 */
	public void setHaveLoanApply(String haveLoanApply){
		this.haveLoanApply = haveLoanApply;
	}

	/**
	 *方法: 获得applyStatus
	 *@return: java.lang.String  applyStatus
	 */
	public String getApplyStatus(){
		return this.applyStatus;
	}

	/**
	 *方法: 设置applyStatus
	 *@param: java.lang.String  applyStatus
	 */
	public void setApplyStatus(String applyStatus){
		this.applyStatus = applyStatus;
	}

	/**
	 *方法: 获得applyCity
	 *@return: java.lang.String  applyCity
	 */
	public String getApplyCity(){
		return this.applyCity;
	}

	/**
	 *方法: 设置applyCity
	 *@param: java.lang.String  applyCity
	 */
	public void setApplyCity(String applyCity){
		this.applyCity = applyCity;
	}

	/**
	 *方法: 获得lendsTime
	 *@return: java.lang.String  lendsTime
	 */
	public String getLendsTime(){
		return this.lendsTime;
	}

	/**
	 *方法: 设置lendsTime
	 *@param: java.lang.String  lendsTime
	 */
	public void setLendsTime(String lendsTime){
		this.lendsTime = lendsTime;
	}

	/**
	 *方法: 获得haveApply
	 *@return: java.lang.String  haveApply
	 */
	public String getHaveApply(){
		return this.haveApply;
	}

	/**
	 *方法: 设置haveApply
	 *@param: java.lang.String  haveApply
	 */
	public void setHaveApply(String haveApply){
		this.haveApply = haveApply;
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