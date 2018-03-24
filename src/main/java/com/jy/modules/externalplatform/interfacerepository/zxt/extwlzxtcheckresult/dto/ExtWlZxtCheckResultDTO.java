package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcheckresult.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:核身问答信息验证结果表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-12 20:13:10
 */
public class ExtWlZxtCheckResultDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**核身ID号，32位随机数。
*/
	private String verId;

	/**状态码*/
	private String status;

	/**核身练习人时的备注信息
*/
	private String message;

	/**核身借款人的结果代码
*/
	private String lenderResult;

	/**核身借款人的结果信息
*/
	private String lenderResultMsg;

	/**核身借款人答对题数
*/
	private String lenderAnserRight;

	/**核身借款人答错题数
*/
	private String lenderAnserWorry;

	/**核身联系人的结果代码
*/
	private String contactResult;

	/**核身联系人的结果信息
*/
	private String contactResultMsg;

	/**核身联系人答对题数
*/
	private String contactAnserRight;

	/**核身联系人答错题数
*/
	private String contactAnserWorry;

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
	 *方法: 获得lenderResult
	 *@return: java.lang.String  lenderResult
	 */
	public String getLenderResult(){
		return this.lenderResult;
	}

	/**
	 *方法: 设置lenderResult
	 *@param: java.lang.String  lenderResult
	 */
	public void setLenderResult(String lenderResult){
		this.lenderResult = lenderResult;
	}

	/**
	 *方法: 获得lenderResultMsg
	 *@return: java.lang.String  lenderResultMsg
	 */
	public String getLenderResultMsg(){
		return this.lenderResultMsg;
	}

	/**
	 *方法: 设置lenderResultMsg
	 *@param: java.lang.String  lenderResultMsg
	 */
	public void setLenderResultMsg(String lenderResultMsg){
		this.lenderResultMsg = lenderResultMsg;
	}

	/**
	 *方法: 获得lenderAnserRight
	 *@return: java.lang.String  lenderAnserRight
	 */
	public String getLenderAnserRight(){
		return this.lenderAnserRight;
	}

	/**
	 *方法: 设置lenderAnserRight
	 *@param: java.lang.String  lenderAnserRight
	 */
	public void setLenderAnserRight(String lenderAnserRight){
		this.lenderAnserRight = lenderAnserRight;
	}

	/**
	 *方法: 获得lenderAnserWorry
	 *@return: java.lang.String  lenderAnserWorry
	 */
	public String getLenderAnserWorry(){
		return this.lenderAnserWorry;
	}

	/**
	 *方法: 设置lenderAnserWorry
	 *@param: java.lang.String  lenderAnserWorry
	 */
	public void setLenderAnserWorry(String lenderAnserWorry){
		this.lenderAnserWorry = lenderAnserWorry;
	}

	/**
	 *方法: 获得contactResult
	 *@return: java.lang.String  contactResult
	 */
	public String getContactResult(){
		return this.contactResult;
	}

	/**
	 *方法: 设置contactResult
	 *@param: java.lang.String  contactResult
	 */
	public void setContactResult(String contactResult){
		this.contactResult = contactResult;
	}

	/**
	 *方法: 获得contactResultMsg
	 *@return: java.lang.String  contactResultMsg
	 */
	public String getContactResultMsg(){
		return this.contactResultMsg;
	}

	/**
	 *方法: 设置contactResultMsg
	 *@param: java.lang.String  contactResultMsg
	 */
	public void setContactResultMsg(String contactResultMsg){
		this.contactResultMsg = contactResultMsg;
	}

	/**
	 *方法: 获得contactAnserRight
	 *@return: java.lang.String  contactAnserRight
	 */
	public String getContactAnserRight(){
		return this.contactAnserRight;
	}

	/**
	 *方法: 设置contactAnserRight
	 *@param: java.lang.String  contactAnserRight
	 */
	public void setContactAnserRight(String contactAnserRight){
		this.contactAnserRight = contactAnserRight;
	}

	/**
	 *方法: 获得contactAnserWorry
	 *@return: java.lang.String  contactAnserWorry
	 */
	public String getContactAnserWorry(){
		return this.contactAnserWorry;
	}

	/**
	 *方法: 设置contactAnserWorry
	 *@param: java.lang.String  contactAnserWorry
	 */
	public void setContactAnserWorry(String contactAnserWorry){
		this.contactAnserWorry = contactAnserWorry;
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