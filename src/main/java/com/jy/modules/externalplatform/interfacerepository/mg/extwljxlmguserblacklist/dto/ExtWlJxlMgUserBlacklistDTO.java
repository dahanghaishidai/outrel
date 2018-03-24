package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserblacklist.dto;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto.ExtWlJxlBlacklistDetailsDTO;
import com.jy.platform.core.common.BaseDTO;

import java.util.List;

/**
 *@Description:聚信立蜜罐黑名单信息
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-14 13:54:39
 */
public class ExtWlJxlMgUserBlacklistDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**蜜罐id*/
	private String userGridId;

	/**姓名和手机是否在黑名单*/
	private String blacklistNameWithPhone;

	/**身份证和姓名是否在黑名单*/
	private String blacklistNameWithIdcard;

	/**黑名单分类*/
	private List<String> blacklistCategory;

	/**黑名单分类*/
	private String blacklistCategoryStr;

	//姓名和手机黑名单信息更新时间数据库
	private String blacklistUpdateTimeNamePhone;
	//身份证和姓名黑名单信息更新时间报文
	private String blacklistUpdateTimeNameIdcard;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private Long createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**修改人*/
	private Long modifyBy;

	/**UPDATE_TIME_NAME_PHONE*/
	private String updateTimeNamePhone;

	/**UPDATE_TIME_NAME_IDCARD*/
	private String updateTimeNameIdcard;

	//黑名单详情
	private List<ExtWlJxlBlacklistDetailsDTO> blacklistDetails;

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
	 *方法: 获得userGridId
	 *@return: java.lang.String  userGridId
	 */
	public String getUserGridId(){
		return this.userGridId;
	}

	/**
	 *方法: 设置userGridId
	 *@param: java.lang.String  userGridId
	 */
	public void setUserGridId(String userGridId){
		this.userGridId = userGridId;
	}

	/**
	 *方法: 获得blacklistNameWithPhone
	 *@return: java.lang.String  blacklistNameWithPhone
	 */
	public String getBlacklistNameWithPhone(){
		return this.blacklistNameWithPhone;
	}

	/**
	 *方法: 设置blacklistNameWithPhone
	 *@param: java.lang.String  blacklistNameWithPhone
	 */
	public void setBlacklistNameWithPhone(String blacklistNameWithPhone){
		this.blacklistNameWithPhone = blacklistNameWithPhone;
	}

	/**
	 *方法: 获得blacklistNameWithIdcard
	 *@return: java.lang.String  blacklistNameWithIdcard
	 */
	public String getBlacklistNameWithIdcard(){
		return this.blacklistNameWithIdcard;
	}

	/**
	 *方法: 设置blacklistNameWithIdcard
	 *@param: java.lang.String  blacklistNameWithIdcard
	 */
	public void setBlacklistNameWithIdcard(String blacklistNameWithIdcard){
		this.blacklistNameWithIdcard = blacklistNameWithIdcard;
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
	 *方法: 获得updateTimeNamePhone
	 *@return: java.lang.String  updateTimeNamePhone
	 */
	public String getUpdateTimeNamePhone(){
		return this.updateTimeNamePhone;
	}

	/**
	 *方法: 设置updateTimeNamePhone
	 *@param: java.lang.String  updateTimeNamePhone
	 */
	public void setUpdateTimeNamePhone(String updateTimeNamePhone){
		this.updateTimeNamePhone = updateTimeNamePhone;
	}

	/**
	 *方法: 获得updateTimeNameIdcard
	 *@return: java.lang.String  updateTimeNameIdcard
	 */
	public String getUpdateTimeNameIdcard(){
		return this.updateTimeNameIdcard;
	}

	/**
	 *方法: 设置updateTimeNameIdcard
	 *@param: java.lang.String  updateTimeNameIdcard
	 */
	public void setUpdateTimeNameIdcard(String updateTimeNameIdcard){
		this.updateTimeNameIdcard = updateTimeNameIdcard;
	}

	public String getBlacklistUpdateTimeNamePhone() {
		return blacklistUpdateTimeNamePhone;
	}

	public void setBlacklistUpdateTimeNamePhone(String blacklistUpdateTimeNamePhone) {
		this.blacklistUpdateTimeNamePhone = blacklistUpdateTimeNamePhone;
	}

	public String getBlacklistUpdateTimeNameIdcard() {
		return blacklistUpdateTimeNameIdcard;
	}

	public void setBlacklistUpdateTimeNameIdcard(String blacklistUpdateTimeNameIdcard) {
		this.blacklistUpdateTimeNameIdcard = blacklistUpdateTimeNameIdcard;
	}

	public List<ExtWlJxlBlacklistDetailsDTO> getBlacklistDetails() {
		return blacklistDetails;
	}

	public void setBlacklistDetails(List<ExtWlJxlBlacklistDetailsDTO> blacklistDetails) {
		this.blacklistDetails = blacklistDetails;
	}

	public List<String> getBlacklistCategory() {
		return blacklistCategory;
	}

	public void setBlacklistCategory(List<String> blacklistCategory) {
		this.blacklistCategory = blacklistCategory;
	}

	public String getBlacklistCategoryStr() {
		return blacklistCategoryStr;
	}

	public void setBlacklistCategoryStr(String blacklistCategoryStr) {
		this.blacklistCategoryStr = blacklistCategoryStr;
	}
}