package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtoverduectc.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:关联人-出现逾期黑名单次数
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-18 11:34:10
 */
public class ExtWlZxtOverdueCtCDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**模块查询状态表ID
*/
	private Long moduleFkId;

	/**关联人手机号
*/
	private String mobileNo;

	/**次数
*/
	private String count;

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
	 *方法: 获得count
	 *@return: java.lang.String  count
	 */
	public String getCount(){
		return this.count;
	}

	/**
	 *方法: 设置count
	 *@param: java.lang.String  count
	 */
	public void setCount(String count){
		this.count = count;
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