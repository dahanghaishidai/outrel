package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxeducationcheck.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:鹏元征信（学历核查结果表）
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-10 13:52:00
 */
public class ExtWlPyzxEducationCheckDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**进件客户关联主键*/
	private Long fkIntoCustId;

	/**姓名*/
	private String name;

	/**证件号码*/
	private String documentNo;

	/**学历证编号*/
	private String levelNo;

	/**毕业年份*/
	private String graduateTime;

	/**毕业院校*/
	private String college;

	/**学历层次*/
	private String collegeLevel;

	/**姓名 核查结果:一致；不一致,可能为空*/
	private String nameCheckResult;

	/**证件号码 核查结果:一致；不一致,可能为空*/
	private String documentNoCheckResult;

	/**学历证编号 核查结果:一致；不一致,可能为空*/
	private String levelNoCheckResult;

	/**毕业时间 核查结果:一致；不一致,可能为空*/
	private String graduateTimeCheckResult;

	/**毕业院校 核查结果:一致；不一致,可能为空*/
	private String collegeCheckResult;

	/**毕业层次 核查结果:一致；不一致,可能为空*/
	private String collegeLevelCheckResult;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**创建人*/
	private Long createBy;

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
	 *方法: 获得fkIntoCustId
	 *@return: java.lang.Long  fkIntoCustId
	 */
	public Long getFkIntoCustId(){
		return this.fkIntoCustId;
	}

	/**
	 *方法: 设置fkIntoCustId
	 *@param: java.lang.Long  fkIntoCustId
	 */
	public void setFkIntoCustId(Long fkIntoCustId){
		this.fkIntoCustId = fkIntoCustId;
	}

	/**
	 *方法: 获得name
	 *@return: java.lang.String  name
	 */
	public String getName(){
		return this.name;
	}

	/**
	 *方法: 设置name
	 *@param: java.lang.String  name
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 *方法: 获得documentNo
	 *@return: java.lang.String  documentNo
	 */
	public String getDocumentNo(){
		return this.documentNo;
	}

	/**
	 *方法: 设置documentNo
	 *@param: java.lang.String  documentNo
	 */
	public void setDocumentNo(String documentNo){
		this.documentNo = documentNo;
	}

	/**
	 *方法: 获得levelNo
	 *@return: java.lang.String  levelNo
	 */
	public String getLevelNo(){
		return this.levelNo;
	}

	/**
	 *方法: 设置levelNo
	 *@param: java.lang.String  levelNo
	 */
	public void setLevelNo(String levelNo){
		this.levelNo = levelNo;
	}

	/**
	 *方法: 获得graduateTime
	 *@return: java.lang.String  graduateTime
	 */
	public String getGraduateTime(){
		return this.graduateTime;
	}

	/**
	 *方法: 设置graduateTime
	 *@param: java.lang.String  graduateTime
	 */
	public void setGraduateTime(String graduateTime){
		this.graduateTime = graduateTime;
	}

	/**
	 *方法: 获得college
	 *@return: java.lang.String  college
	 */
	public String getCollege(){
		return this.college;
	}

	/**
	 *方法: 设置college
	 *@param: java.lang.String  college
	 */
	public void setCollege(String college){
		this.college = college;
	}

	/**
	 *方法: 获得collegeLevel
	 *@return: java.lang.String  collegeLevel
	 */
	public String getCollegeLevel(){
		return this.collegeLevel;
	}

	/**
	 *方法: 设置collegeLevel
	 *@param: java.lang.String  collegeLevel
	 */
	public void setCollegeLevel(String collegeLevel){
		this.collegeLevel = collegeLevel;
	}

	/**
	 *方法: 获得nameCheckResult
	 *@return: java.lang.String  nameCheckResult
	 */
	public String getNameCheckResult(){
		return this.nameCheckResult;
	}

	/**
	 *方法: 设置nameCheckResult
	 *@param: java.lang.String  nameCheckResult
	 */
	public void setNameCheckResult(String nameCheckResult){
		this.nameCheckResult = nameCheckResult;
	}

	/**
	 *方法: 获得documentNoCheckResult
	 *@return: java.lang.String  documentNoCheckResult
	 */
	public String getDocumentNoCheckResult(){
		return this.documentNoCheckResult;
	}

	/**
	 *方法: 设置documentNoCheckResult
	 *@param: java.lang.String  documentNoCheckResult
	 */
	public void setDocumentNoCheckResult(String documentNoCheckResult){
		this.documentNoCheckResult = documentNoCheckResult;
	}

	/**
	 *方法: 获得levelNoCheckResult
	 *@return: java.lang.String  levelNoCheckResult
	 */
	public String getLevelNoCheckResult(){
		return this.levelNoCheckResult;
	}

	/**
	 *方法: 设置levelNoCheckResult
	 *@param: java.lang.String  levelNoCheckResult
	 */
	public void setLevelNoCheckResult(String levelNoCheckResult){
		this.levelNoCheckResult = levelNoCheckResult;
	}

	/**
	 *方法: 获得graduateTimeCheckResult
	 *@return: java.lang.String  graduateTimeCheckResult
	 */
	public String getGraduateTimeCheckResult(){
		return this.graduateTimeCheckResult;
	}

	/**
	 *方法: 设置graduateTimeCheckResult
	 *@param: java.lang.String  graduateTimeCheckResult
	 */
	public void setGraduateTimeCheckResult(String graduateTimeCheckResult){
		this.graduateTimeCheckResult = graduateTimeCheckResult;
	}

	/**
	 *方法: 获得collegeCheckResult
	 *@return: java.lang.String  collegeCheckResult
	 */
	public String getCollegeCheckResult(){
		return this.collegeCheckResult;
	}

	/**
	 *方法: 设置collegeCheckResult
	 *@param: java.lang.String  collegeCheckResult
	 */
	public void setCollegeCheckResult(String collegeCheckResult){
		this.collegeCheckResult = collegeCheckResult;
	}

	/**
	 *方法: 获得collegeLevelCheckResult
	 *@return: java.lang.String  collegeLevelCheckResult
	 */
	public String getCollegeLevelCheckResult(){
		return this.collegeLevelCheckResult;
	}

	/**
	 *方法: 设置collegeLevelCheckResult
	 *@param: java.lang.String  collegeLevelCheckResult
	 */
	public void setCollegeLevelCheckResult(String collegeLevelCheckResult){
		this.collegeLevelCheckResult = collegeLevelCheckResult;
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

}