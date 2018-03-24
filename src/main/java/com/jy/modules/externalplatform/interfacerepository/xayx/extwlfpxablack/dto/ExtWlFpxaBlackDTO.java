package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxablack.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 * @className: ExtWlFpxaBlackDTO
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxablack.dto
 * @describe: EXT_WL_FPXA_BLACK
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 10:08
 **/
public class ExtWlFpxaBlackDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**创建人*/
	private Long createBy;

	/**修改人*/
	private Long modifyBy;

	/**欺诈风险表(或联系人信息)主键*/
	private Long fkRisklinkId;

	/**黑名单关联主表 risk:欺诈风险表 linkMan:联系人信息表*/
	private String linkType;

	/**危险名单类别（黑灰负）*/
	private String blackType;

	/**危险名单一级类别*/
	private String blackTypeOne;

	/**危险名单二级类别*/
	private String blackTypeTwo;

	/**危险名单类型（身份证号等）*/
	private String touchType;

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

	/**
	 *方法: 获得fkRisklinkId
	 *@return: java.lang.Long  fkRisklinkId
	 */
	public Long getFkRisklinkId(){
		return this.fkRisklinkId;
	}

	/**
	 *方法: 设置fkRisklinkId
	 *@param: java.lang.Long  fkRisklinkId
	 */
	public void setFkRisklinkId(Long fkRisklinkId){
		this.fkRisklinkId = fkRisklinkId;
	}

	/**
	 *方法: 获得linkType
	 *@return: java.lang.String  linkType
	 */
	public String getLinkType(){
		return this.linkType;
	}

	/**
	 *方法: 设置linkType
	 *@param: java.lang.String  linkType
	 */
	public void setLinkType(String linkType){
		this.linkType = linkType;
	}

	/**
	 *方法: 获得blackType
	 *@return: java.lang.String  blackType
	 */
	public String getBlackType(){
		return this.blackType;
	}

	/**
	 *方法: 设置blackType
	 *@param: java.lang.String  blackType
	 */
	public void setBlackType(String blackType){
		this.blackType = blackType;
	}

	/**
	 *方法: 获得blackTypeOne
	 *@return: java.lang.String  blackTypeOne
	 */
	public String getBlackTypeOne(){
		return this.blackTypeOne;
	}

	/**
	 *方法: 设置blackTypeOne
	 *@param: java.lang.String  blackTypeOne
	 */
	public void setBlackTypeOne(String blackTypeOne){
		this.blackTypeOne = blackTypeOne;
	}

	/**
	 *方法: 获得blackTypeTwo
	 *@return: java.lang.String  blackTypeTwo
	 */
	public String getBlackTypeTwo(){
		return this.blackTypeTwo;
	}

	/**
	 *方法: 设置blackTypeTwo
	 *@param: java.lang.String  blackTypeTwo
	 */
	public void setBlackTypeTwo(String blackTypeTwo){
		this.blackTypeTwo = blackTypeTwo;
	}

	/**
	 *方法: 获得touchType
	 *@return: java.lang.String  touchType
	 */
	public String getTouchType(){
		return this.touchType;
	}

	/**
	 *方法: 设置touchType
	 *@param: java.lang.String  touchType
	 */
	public void setTouchType(String touchType){
		this.touchType = touchType;
	}

}