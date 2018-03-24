package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklendmulti.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:多重借贷查询数据表
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-12 17:01:21
 */
public class ExtWlTxskLendMultiDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**多重借贷查询主表主键
*/
	private Long fkId;

	/**返回状态
*/
	private String status;

	/**返回状态描述
*/
	private String statusDesc;

	/**电话
*/
	private String phone;

	/**省份
*/
	private String province;

	/**城市
*/
	private String city;

	/**查询周期
*/
	private String cycle;

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
	 *方法: 获得statusDesc
	 *@return: java.lang.String  statusDesc
	 */
	public String getStatusDesc(){
		return this.statusDesc;
	}

	/**
	 *方法: 设置statusDesc
	 *@param: java.lang.String  statusDesc
	 */
	public void setStatusDesc(String statusDesc){
		this.statusDesc = statusDesc;
	}

	/**
	 *方法: 获得phone
	 *@return: java.lang.String  phone
	 */
	public String getPhone(){
		return this.phone;
	}

	/**
	 *方法: 设置phone
	 *@param: java.lang.String  phone
	 */
	public void setPhone(String phone){
		this.phone = phone;
	}

	/**
	 *方法: 获得province
	 *@return: java.lang.String  province
	 */
	public String getProvince(){
		return this.province;
	}

	/**
	 *方法: 设置province
	 *@param: java.lang.String  province
	 */
	public void setProvince(String province){
		this.province = province;
	}

	/**
	 *方法: 获得city
	 *@return: java.lang.String  city
	 */
	public String getCity(){
		return this.city;
	}

	/**
	 *方法: 设置city
	 *@param: java.lang.String  city
	 */
	public void setCity(String city){
		this.city = city;
	}

	/**
	 *方法: 获得cycle
	 *@return: java.lang.String  cycle
	 */
	public String getCycle(){
		return this.cycle;
	}

	/**
	 *方法: 设置cycle
	 *@param: java.lang.String  cycle
	 */
	public void setCycle(String cycle){
		this.cycle = cycle;
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