package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtnetbadp.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:个人/单位-网络负面舆情信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-18 15:07:21
 */
public class ExtWlZxtNetBadPDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**模块查询状态表ID
*/
	private Long moduleFkId;

	/**标题
*/
	private String title;

	/**关联人手机号
*/
	private String mobileNo;

	/**摘要
*/
	private String abstract_;

	/**链接
*/
	private String url;

	/**负面词
*/
	private String negKeyWord;

	/**匹配字段(身份证/手机号)
*/
	private String searchKey;

	/**时间戳
*/
	private String time;

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
	 *方法: 获得title
	 *@return: java.lang.String  title
	 */
	public String getTitle(){
		return this.title;
	}

	/**
	 *方法: 设置title
	 *@param: java.lang.String  title
	 */
	public void setTitle(String title){
		this.title = title;
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
	 *方法: 获得abstract
	 *@return: java.lang.String  abstract
	 */
	public String getAbstract_() {
		return abstract_;
	}

	/**
	 *方法: 设置abstract
	 *@param: java.lang.String  abstract
	 */
	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	/**
	 *方法: 获得url
	 *@return: java.lang.String  url
	 */
	public String getUrl(){
		return this.url;
	}

	/**
	 *方法: 设置url
	 *@param: java.lang.String  url
	 */
	public void setUrl(String url){
		this.url = url;
	}

	/**
	 *方法: 获得negKeyWord
	 *@return: java.lang.String  negKeyWord
	 */
	public String getNegKeyWord(){
		return this.negKeyWord;
	}

	/**
	 *方法: 设置negKeyWord
	 *@param: java.lang.String  negKeyWord
	 */
	public void setNegKeyWord(String negKeyWord){
		this.negKeyWord = negKeyWord;
	}

	/**
	 *方法: 获得searchKey
	 *@return: java.lang.String  searchKey
	 */
	public String getSearchKey(){
		return this.searchKey;
	}

	/**
	 *方法: 设置searchKey
	 *@param: java.lang.String  searchKey
	 */
	public void setSearchKey(String searchKey){
		this.searchKey = searchKey;
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