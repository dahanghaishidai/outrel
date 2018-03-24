package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtvalidation.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:核身问答信息获取主表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-12 20:13:53
 */
public class ExtWlZxtValidationDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**进件客户关联ID
*/
	private Long intoCustRefId;

	/**核身ID号，32位随机数。
*/
	private String verId;

	/**核身结果代码
*/
	private String result;

	/**核身结果信息
*/
	private String message;

	/**创建时间
*/
	private java.sql.Timestamp createTime1;

	/**修改时间
*/
	private java.sql.Timestamp updateTime1;

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
	 *方法: 获得verId
	 *@return: java.lang.String  verId
	 */
	public String getVerId(){
		return this.verId;
	}

	/**
	 *方法: 设置verId
	 *@param: java.lang.String  verId
	 */
	public void setVerId(String verId){
		this.verId = verId;
	}

	/**
	 *方法: 获得result
	 *@return: java.lang.String  result
	 */
	public String getResult(){
		return this.result;
	}

	/**
	 *方法: 设置result
	 *@param: java.lang.String  result
	 */
	public void setResult(String result){
		this.result = result;
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
	 *方法: 获得createTime1
	 *@return: java.sql.Timestamp  createTime1
	 */
	public java.sql.Timestamp getCreateTime1(){
		return this.createTime1;
	}

	/**
	 *方法: 设置createTime1
	 *@param: java.sql.Timestamp  createTime1
	 */
	public void setCreateTime1(java.sql.Timestamp createTime1){
		this.createTime1 = createTime1;
	}

	/**
	 *方法: 获得updateTime1
	 *@return: java.sql.Timestamp  updateTime1
	 */
	public java.sql.Timestamp getUpdateTime1(){
		return this.updateTime1;
	}

	/**
	 *方法: 设置updateTime1
	 *@param: java.sql.Timestamp  updateTime1
	 */
	public void setUpdateTime1(java.sql.Timestamp updateTime1){
		this.updateTime1 = updateTime1;
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