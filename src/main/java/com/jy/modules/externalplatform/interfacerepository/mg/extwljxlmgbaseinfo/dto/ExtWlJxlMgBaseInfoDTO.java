package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:聚信立蜜罐主表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-14 13:56:25
 */
public class ExtWlJxlMgBaseInfoDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键id*/
	private Long id;

	/**蜜罐id*/
	private String userGridId;

	/**响应信息*/
	private String message;

	/**响应码 */
	private String code;

	/**数据集合*/
	private String data;

	/**接口耗时（毫秒）*/
	private Long spendTime;

	/**是否有效*/
	private String validState;

	/**机构查询总数量*/
	private Long searchedOrgCnt;

	/**注册总数量*/
	private Long registerCnt;

	/**USERNAME*/
	private String username;

	/**IDCARD*/
	private String idcard;

	/**INTOID*/
	private String intoid;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private Long createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**修改人*/
	private Long modifyBy;

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
	 *方法: 获得data
	 *@return: java.lang.String  data
	 */
	public String getData(){
		return this.data;
	}

	/**
	 *方法: 设置data
	 *@param: java.lang.String  data
	 */
	public void setData(String data){
		this.data = data;
	}

	/**
	 *方法: 获得spendTime
	 *@return: java.lang.Long  spendTime
	 */
	public Long getSpendTime(){
		return this.spendTime;
	}

	/**
	 *方法: 设置spendTime
	 *@param: java.lang.Long  spendTime
	 */
	public void setSpendTime(Long spendTime){
		this.spendTime = spendTime;
	}

	/**
	 *方法: 获得validState
	 *@return: java.lang.String  validState
	 */
	public String getValidState(){
		return this.validState;
	}

	/**
	 *方法: 设置validState
	 *@param: java.lang.String  validState
	 */
	public void setValidState(String validState){
		this.validState = validState;
	}

	/**
	 *方法: 获得searchedOrgCnt
	 *@return: java.lang.Long  searchedOrgCnt
	 */
	public Long getSearchedOrgCnt(){
		return this.searchedOrgCnt;
	}

	/**
	 *方法: 设置searchedOrgCnt
	 *@param: java.lang.Long  searchedOrgCnt
	 */
	public void setSearchedOrgCnt(Long searchedOrgCnt){
		this.searchedOrgCnt = searchedOrgCnt;
	}

	/**
	 *方法: 获得registerCnt
	 *@return: java.lang.Long  registerCnt
	 */
	public Long getRegisterCnt(){
		return this.registerCnt;
	}

	/**
	 *方法: 设置registerCnt
	 *@param: java.lang.Long  registerCnt
	 */
	public void setRegisterCnt(Long registerCnt){
		this.registerCnt = registerCnt;
	}

	/**
	 *方法: 获得username
	 *@return: java.lang.String  username
	 */
	public String getUsername(){
		return this.username;
	}

	/**
	 *方法: 设置username
	 *@param: java.lang.String  username
	 */
	public void setUsername(String username){
		this.username = username;
	}

	/**
	 *方法: 获得idcard
	 *@return: java.lang.String  idcard
	 */
	public String getIdcard(){
		return this.idcard;
	}

	/**
	 *方法: 设置idcard
	 *@param: java.lang.String  idcard
	 */
	public void setIdcard(String idcard){
		this.idcard = idcard;
	}

	/**
	 *方法: 获得intoid
	 *@return: java.lang.String  intoid
	 */
	public String getIntoid(){
		return this.intoid;
	}

	/**
	 *方法: 设置intoid
	 *@param: java.lang.String  intoid
	 */
	public void setIntoid(String intoid){
		this.intoid = intoid;
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

}