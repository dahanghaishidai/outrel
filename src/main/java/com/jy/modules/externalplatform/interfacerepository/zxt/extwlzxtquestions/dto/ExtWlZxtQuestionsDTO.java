package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtquestions.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:核身问答信息表
 *@author Administrator
 *@version 1.0,
 *@date 2017-12-13 10:20:17
 */
public class ExtWlZxtQuestionsDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键
*/
	private Long id;

	/**核身ID号，32位随机数。
*/
	private String verId;

	/**数据类别
*/
	private String dataType;

	/**问题的ID号，32位随机数
*/
	private String answerId;

	/**问题题干
*/
	private String question;

	/**问题类型： 1：问答题 ； 2：选择题
*/
	private String queStyle;

	/**答案信息（备选）
*/
	private String answers;

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
	 *方法: 获得dataType
	 *@return: java.lang.String  dataType
	 */
	public String getDataType(){
		return this.dataType;
	}

	/**
	 *方法: 设置dataType
	 *@param: java.lang.String  dataType
	 */
	public void setDataType(String dataType){
		this.dataType = dataType;
	}

	/**
	 *方法: 获得answerId
	 *@return: java.lang.String  answerId
	 */
	public String getAnswerId(){
		return this.answerId;
	}

	/**
	 *方法: 设置answerId
	 *@param: java.lang.String  answerId
	 */
	public void setAnswerId(String answerId){
		this.answerId = answerId;
	}

	/**
	 *方法: 获得question
	 *@return: java.lang.String  question
	 */
	public String getQuestion(){
		return this.question;
	}

	/**
	 *方法: 设置question
	 *@param: java.lang.String  question
	 */
	public void setQuestion(String question){
		this.question = question;
	}

	/**
	 *方法: 获得queStyle
	 *@return: java.lang.String  queStyle
	 */
	public String getQueStyle(){
		return this.queStyle;
	}

	/**
	 *方法: 设置queStyle
	 *@param: java.lang.String  queStyle
	 */
	public void setQueStyle(String queStyle){
		this.queStyle = queStyle;
	}

	/**
	 *方法: 获得answers
	 *@return: java.lang.String  answers
	 */
	public String getAnswers(){
		return this.answers;
	}

	/**
	 *方法: 设置answers
	 *@param: java.lang.String  answers
	 */
	public void setAnswers(String answers){
		this.answers = answers;
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