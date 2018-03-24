package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgseahisbyday.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:蜜罐历史查询记录
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-09 17:47:01
 */
public class ExtWlJxlMgSeahisBydayDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**蜜罐ID*/
	private String userGridId;

	/**历史查询标识*/
	private String dayNum;

	/**查询次数*/
	private Long cnt;

	/**现金贷查询次数*/
	private Long cntCash;

	/**信用卡代还查询次数*/
	private Long cntCc;

	/**消费分期查询次数*/
	private Long cntCf;

	/**查询机构数*/
	private Long cntOrg;

	/**现金贷查询机构数*/
	private Long cntOrgCash;

	/**信用卡代还查询机构数*/
	private Long cntOrgCc;

	/**消费分期查询机构数*/
	private Long cntOrgCf;

	/**查询次数在总体查询分布中的百分位*/
	private Float pctCntAll;

	/**查询次数在现金贷查询分布中的百分位*/
	private Float pctCntCash;

	/**查询次数在信用卡代还查询分布中的百分位*/
	private Float pctCntCc;

	/**查询次数在消费分期查询分布中的百分位*/
	private Float pctCntCf;

	/**查询机构数在总体查询分布中的百分位*/
	private Float pctCntOrgAll;

	/**查询机构数在现金贷查询分布中的百分位*/
	private Float pctCntOrgCash;

	/**查询机构数在信用卡代还查询分布中的百分位*/
	private Float pctCntOrgCc;

	/**查询机构数在消费分期查询分布中的百分位*/
	private Float pctCntOrgCf;

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
	 *方法: 获得dayNum
	 *@return: java.lang.String  dayNum
	 */
	public String getDayNum(){
		return this.dayNum;
	}

	/**
	 *方法: 设置dayNum
	 *@param: java.lang.String  dayNum
	 */
	public void setDayNum(String dayNum){
		this.dayNum = dayNum;
	}

	/**
	 *方法: 获得cnt
	 *@return: java.lang.Long  cnt
	 */
	public Long getCnt(){
		return this.cnt;
	}

	/**
	 *方法: 设置cnt
	 *@param: java.lang.Long  cnt
	 */
	public void setCnt(Long cnt){
		this.cnt = cnt;
	}

	/**
	 *方法: 获得cntCash
	 *@return: java.lang.Long  cntCash
	 */
	public Long getCntCash(){
		return this.cntCash;
	}

	/**
	 *方法: 设置cntCash
	 *@param: java.lang.Long  cntCash
	 */
	public void setCntCash(Long cntCash){
		this.cntCash = cntCash;
	}

	/**
	 *方法: 获得cntCc
	 *@return: java.lang.Long  cntCc
	 */
	public Long getCntCc(){
		return this.cntCc;
	}

	/**
	 *方法: 设置cntCc
	 *@param: java.lang.Long  cntCc
	 */
	public void setCntCc(Long cntCc){
		this.cntCc = cntCc;
	}

	/**
	 *方法: 获得cntCf
	 *@return: java.lang.Long  cntCf
	 */
	public Long getCntCf(){
		return this.cntCf;
	}

	/**
	 *方法: 设置cntCf
	 *@param: java.lang.Long  cntCf
	 */
	public void setCntCf(Long cntCf){
		this.cntCf = cntCf;
	}

	/**
	 *方法: 获得cntOrg
	 *@return: java.lang.Long  cntOrg
	 */
	public Long getCntOrg(){
		return this.cntOrg;
	}

	/**
	 *方法: 设置cntOrg
	 *@param: java.lang.Long  cntOrg
	 */
	public void setCntOrg(Long cntOrg){
		this.cntOrg = cntOrg;
	}

	/**
	 *方法: 获得cntOrgCash
	 *@return: java.lang.Long  cntOrgCash
	 */
	public Long getCntOrgCash(){
		return this.cntOrgCash;
	}

	/**
	 *方法: 设置cntOrgCash
	 *@param: java.lang.Long  cntOrgCash
	 */
	public void setCntOrgCash(Long cntOrgCash){
		this.cntOrgCash = cntOrgCash;
	}

	/**
	 *方法: 获得cntOrgCc
	 *@return: java.lang.Long  cntOrgCc
	 */
	public Long getCntOrgCc(){
		return this.cntOrgCc;
	}

	/**
	 *方法: 设置cntOrgCc
	 *@param: java.lang.Long  cntOrgCc
	 */
	public void setCntOrgCc(Long cntOrgCc){
		this.cntOrgCc = cntOrgCc;
	}

	/**
	 *方法: 获得cntOrgCf
	 *@return: java.lang.Long  cntOrgCf
	 */
	public Long getCntOrgCf(){
		return this.cntOrgCf;
	}

	/**
	 *方法: 设置cntOrgCf
	 *@param: java.lang.Long  cntOrgCf
	 */
	public void setCntOrgCf(Long cntOrgCf){
		this.cntOrgCf = cntOrgCf;
	}

	/**
	 *方法: 获得pctCntAll
	 *@return: java.lang.Float  pctCntAll
	 */
	public Float getPctCntAll(){
		return this.pctCntAll;
	}

	/**
	 *方法: 设置pctCntAll
	 *@param: java.lang.Float  pctCntAll
	 */
	public void setPctCntAll(Float pctCntAll){
		this.pctCntAll = pctCntAll;
	}

	/**
	 *方法: 获得pctCntCash
	 *@return: java.lang.Float  pctCntCash
	 */
	public Float getPctCntCash(){
		return this.pctCntCash;
	}

	/**
	 *方法: 设置pctCntCash
	 *@param: java.lang.Float  pctCntCash
	 */
	public void setPctCntCash(Float pctCntCash){
		this.pctCntCash = pctCntCash;
	}

	/**
	 *方法: 获得pctCntCc
	 *@return: java.lang.Float  pctCntCc
	 */
	public Float getPctCntCc(){
		return this.pctCntCc;
	}

	/**
	 *方法: 设置pctCntCc
	 *@param: java.lang.Float  pctCntCc
	 */
	public void setPctCntCc(Float pctCntCc){
		this.pctCntCc = pctCntCc;
	}

	/**
	 *方法: 获得pctCntCf
	 *@return: java.lang.Float  pctCntCf
	 */
	public Float getPctCntCf(){
		return this.pctCntCf;
	}

	/**
	 *方法: 设置pctCntCf
	 *@param: java.lang.Float  pctCntCf
	 */
	public void setPctCntCf(Float pctCntCf){
		this.pctCntCf = pctCntCf;
	}

	/**
	 *方法: 获得pctCntOrgAll
	 *@return: java.lang.Float  pctCntOrgAll
	 */
	public Float getPctCntOrgAll(){
		return this.pctCntOrgAll;
	}

	/**
	 *方法: 设置pctCntOrgAll
	 *@param: java.lang.Float  pctCntOrgAll
	 */
	public void setPctCntOrgAll(Float pctCntOrgAll){
		this.pctCntOrgAll = pctCntOrgAll;
	}

	/**
	 *方法: 获得pctCntOrgCash
	 *@return: java.lang.Float  pctCntOrgCash
	 */
	public Float getPctCntOrgCash(){
		return this.pctCntOrgCash;
	}

	/**
	 *方法: 设置pctCntOrgCash
	 *@param: java.lang.Float  pctCntOrgCash
	 */
	public void setPctCntOrgCash(Float pctCntOrgCash){
		this.pctCntOrgCash = pctCntOrgCash;
	}

	/**
	 *方法: 获得pctCntOrgCc
	 *@return: java.lang.Float  pctCntOrgCc
	 */
	public Float getPctCntOrgCc(){
		return this.pctCntOrgCc;
	}

	/**
	 *方法: 设置pctCntOrgCc
	 *@param: java.lang.Float  pctCntOrgCc
	 */
	public void setPctCntOrgCc(Float pctCntOrgCc){
		this.pctCntOrgCc = pctCntOrgCc;
	}

	/**
	 *方法: 获得pctCntOrgCf
	 *@return: java.lang.Float  pctCntOrgCf
	 */
	public Float getPctCntOrgCf(){
		return this.pctCntOrgCf;
	}

	/**
	 *方法: 设置pctCntOrgCf
	 *@param: java.lang.Float  pctCntOrgCf
	 */
	public void setPctCntOrgCf(Float pctCntOrgCf){
		this.pctCntOrgCf = pctCntOrgCf;
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