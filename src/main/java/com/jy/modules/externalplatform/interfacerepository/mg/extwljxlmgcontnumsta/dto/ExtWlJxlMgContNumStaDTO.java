package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontnumsta.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:蜜罐联系人数表
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-09 17:44:13
 */
public class ExtWlJxlMgContNumStaDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**USER_GRID_ID*/
	private String userGridId;

	/**主动联系人数*/
	private Long cntToAll;

	/**被动联系人数*/
	private Long cntBeAll;

	/**一阶联系人总数，前两项合并去重*/
	private Long cntAll;

	/**引起黑名单的一阶联系人数（一阶联系人中与黑号有联系的人数）*/
	private Long cntRouter;

	/**引起黑名单的一阶联系人占比（cnt_router/cnt_all）*/
	private Float routerRatio;

	/**主动联系的黑号数*/
	private Long cntToBlack;

	/**被动联系的黑号数*/
	private Long cntBeBlack;

	/**一阶联系(直接联系)黑号总数，前两项合并去重*/
	private Long cntBlack;

	/**cnt_black/cnt_all*/
	private Float blackRatio;

	/**二阶联系(间接联系)黑号总数，联系人的黑号联系人，并排除一阶联系的黑号*/
	private Long cntBlack2;

	/**主动联系人中曾为申请人的人数*/
	private Long cntToApplied;

	/**被动联系人中曾为申请人的人数*/
	private Long cntBeApplied;

	/**联系人曾为申请人的人数，前两项合并去重*/
	private Long cntApplied;

	/**cnt_to_all 在群体中的百分位，取值（0,1）*/
	private Float pctCntToAll;

	/**cnt_be_all 在群体中的百分位，取值（0,1）*/
	private Float pctCntBeAll;

	/**cnt_all 在群体中的百分位，取值（0,1）*/
	private Float pctCntAll;

	/**cnt_router 在群体中的百分位，取值（0,1）*/
	private Float pctCntRouter;

	/**cnt_router/cnt_all 在群体中的百分位，取值（0,1）*/
	private Float pctRouterRatio;

	/**cnt_to_black 在群体中的百分位，取值（0,1）*/
	private Float pctCntToBlack;

	/**cnt_be_black 在群体中的百分位，取值（0,1）*/
	private Float pctCntBeBlack;

	/**cnt_black 在群体中的百分位，取值（0,1）*/
	private Float pctCntBlack;

	/**cnt_black/cnt_all 在群体中的百分位，取值（0,1）*/
	private Float pctBlackRatio;

	/**cnt_black2  在群体中的百分位，取值（0,1）*/
	private Float pctCntBlack2;

	/**cnt_to_applied 在群体中的百分位，取值（0,1）*/
	private Float pctCntToApplied;

	/**cnt_be_applied 在群体中的百分位，取值（0,1）*/
	private Float pctCntBeApplied;

	/**cnt_applied 在群体中的百分位，取值（0,1）*/
	private Float pctCntApplied;

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
	 *方法: 获得cntToAll
	 *@return: java.lang.Long  cntToAll
	 */
	public Long getCntToAll(){
		return this.cntToAll;
	}

	/**
	 *方法: 设置cntToAll
	 *@param: java.lang.Long  cntToAll
	 */
	public void setCntToAll(Long cntToAll){
		this.cntToAll = cntToAll;
	}

	/**
	 *方法: 获得cntBeAll
	 *@return: java.lang.Long  cntBeAll
	 */
	public Long getCntBeAll(){
		return this.cntBeAll;
	}

	/**
	 *方法: 设置cntBeAll
	 *@param: java.lang.Long  cntBeAll
	 */
	public void setCntBeAll(Long cntBeAll){
		this.cntBeAll = cntBeAll;
	}

	/**
	 *方法: 获得cntAll
	 *@return: java.lang.Long  cntAll
	 */
	public Long getCntAll(){
		return this.cntAll;
	}

	/**
	 *方法: 设置cntAll
	 *@param: java.lang.Long  cntAll
	 */
	public void setCntAll(Long cntAll){
		this.cntAll = cntAll;
	}

	/**
	 *方法: 获得cntRouter
	 *@return: java.lang.Long  cntRouter
	 */
	public Long getCntRouter(){
		return this.cntRouter;
	}

	/**
	 *方法: 设置cntRouter
	 *@param: java.lang.Long  cntRouter
	 */
	public void setCntRouter(Long cntRouter){
		this.cntRouter = cntRouter;
	}

	/**
	 *方法: 获得routerRatio
	 *@return: java.lang.Float  routerRatio
	 */
	public Float getRouterRatio(){
		return this.routerRatio;
	}

	/**
	 *方法: 设置routerRatio
	 *@param: java.lang.Float  routerRatio
	 */
	public void setRouterRatio(Float routerRatio){
		this.routerRatio = routerRatio;
	}

	/**
	 *方法: 获得cntToBlack
	 *@return: java.lang.Long  cntToBlack
	 */
	public Long getCntToBlack(){
		return this.cntToBlack;
	}

	/**
	 *方法: 设置cntToBlack
	 *@param: java.lang.Long  cntToBlack
	 */
	public void setCntToBlack(Long cntToBlack){
		this.cntToBlack = cntToBlack;
	}

	/**
	 *方法: 获得cntBeBlack
	 *@return: java.lang.Long  cntBeBlack
	 */
	public Long getCntBeBlack(){
		return this.cntBeBlack;
	}

	/**
	 *方法: 设置cntBeBlack
	 *@param: java.lang.Long  cntBeBlack
	 */
	public void setCntBeBlack(Long cntBeBlack){
		this.cntBeBlack = cntBeBlack;
	}

	/**
	 *方法: 获得cntBlack
	 *@return: java.lang.Long  cntBlack
	 */
	public Long getCntBlack(){
		return this.cntBlack;
	}

	/**
	 *方法: 设置cntBlack
	 *@param: java.lang.Long  cntBlack
	 */
	public void setCntBlack(Long cntBlack){
		this.cntBlack = cntBlack;
	}

	/**
	 *方法: 获得blackRatio
	 *@return: java.lang.Float  blackRatio
	 */
	public Float getBlackRatio(){
		return this.blackRatio;
	}

	/**
	 *方法: 设置blackRatio
	 *@param: java.lang.Float  blackRatio
	 */
	public void setBlackRatio(Float blackRatio){
		this.blackRatio = blackRatio;
	}

	/**
	 *方法: 获得cntBlack2
	 *@return: java.lang.Long  cntBlack2
	 */
	public Long getCntBlack2(){
		return this.cntBlack2;
	}

	/**
	 *方法: 设置cntBlack2
	 *@param: java.lang.Long  cntBlack2
	 */
	public void setCntBlack2(Long cntBlack2){
		this.cntBlack2 = cntBlack2;
	}

	/**
	 *方法: 获得cntToApplied
	 *@return: java.lang.Long  cntToApplied
	 */
	public Long getCntToApplied(){
		return this.cntToApplied;
	}

	/**
	 *方法: 设置cntToApplied
	 *@param: java.lang.Long  cntToApplied
	 */
	public void setCntToApplied(Long cntToApplied){
		this.cntToApplied = cntToApplied;
	}

	/**
	 *方法: 获得cntBeApplied
	 *@return: java.lang.Long  cntBeApplied
	 */
	public Long getCntBeApplied(){
		return this.cntBeApplied;
	}

	/**
	 *方法: 设置cntBeApplied
	 *@param: java.lang.Long  cntBeApplied
	 */
	public void setCntBeApplied(Long cntBeApplied){
		this.cntBeApplied = cntBeApplied;
	}

	/**
	 *方法: 获得cntApplied
	 *@return: java.lang.Long  cntApplied
	 */
	public Long getCntApplied(){
		return this.cntApplied;
	}

	/**
	 *方法: 设置cntApplied
	 *@param: java.lang.Long  cntApplied
	 */
	public void setCntApplied(Long cntApplied){
		this.cntApplied = cntApplied;
	}

	/**
	 *方法: 获得pctCntToAll
	 *@return: java.lang.Float  pctCntToAll
	 */
	public Float getPctCntToAll(){
		return this.pctCntToAll;
	}

	/**
	 *方法: 设置pctCntToAll
	 *@param: java.lang.Float  pctCntToAll
	 */
	public void setPctCntToAll(Float pctCntToAll){
		this.pctCntToAll = pctCntToAll;
	}

	/**
	 *方法: 获得pctCntBeAll
	 *@return: java.lang.Float  pctCntBeAll
	 */
	public Float getPctCntBeAll(){
		return this.pctCntBeAll;
	}

	/**
	 *方法: 设置pctCntBeAll
	 *@param: java.lang.Float  pctCntBeAll
	 */
	public void setPctCntBeAll(Float pctCntBeAll){
		this.pctCntBeAll = pctCntBeAll;
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
	 *方法: 获得pctCntRouter
	 *@return: java.lang.Float  pctCntRouter
	 */
	public Float getPctCntRouter(){
		return this.pctCntRouter;
	}

	/**
	 *方法: 设置pctCntRouter
	 *@param: java.lang.Float  pctCntRouter
	 */
	public void setPctCntRouter(Float pctCntRouter){
		this.pctCntRouter = pctCntRouter;
	}

	/**
	 *方法: 获得pctRouterRatio
	 *@return: java.lang.Float  pctRouterRatio
	 */
	public Float getPctRouterRatio(){
		return this.pctRouterRatio;
	}

	/**
	 *方法: 设置pctRouterRatio
	 *@param: java.lang.Float  pctRouterRatio
	 */
	public void setPctRouterRatio(Float pctRouterRatio){
		this.pctRouterRatio = pctRouterRatio;
	}

	/**
	 *方法: 获得pctCntToBlack
	 *@return: java.lang.Float  pctCntToBlack
	 */
	public Float getPctCntToBlack(){
		return this.pctCntToBlack;
	}

	/**
	 *方法: 设置pctCntToBlack
	 *@param: java.lang.Float  pctCntToBlack
	 */
	public void setPctCntToBlack(Float pctCntToBlack){
		this.pctCntToBlack = pctCntToBlack;
	}

	/**
	 *方法: 获得pctCntBeBlack
	 *@return: java.lang.Float  pctCntBeBlack
	 */
	public Float getPctCntBeBlack(){
		return this.pctCntBeBlack;
	}

	/**
	 *方法: 设置pctCntBeBlack
	 *@param: java.lang.Float  pctCntBeBlack
	 */
	public void setPctCntBeBlack(Float pctCntBeBlack){
		this.pctCntBeBlack = pctCntBeBlack;
	}

	/**
	 *方法: 获得pctCntBlack
	 *@return: java.lang.Float  pctCntBlack
	 */
	public Float getPctCntBlack(){
		return this.pctCntBlack;
	}

	/**
	 *方法: 设置pctCntBlack
	 *@param: java.lang.Float  pctCntBlack
	 */
	public void setPctCntBlack(Float pctCntBlack){
		this.pctCntBlack = pctCntBlack;
	}

	/**
	 *方法: 获得pctBlackRatio
	 *@return: java.lang.Float  pctBlackRatio
	 */
	public Float getPctBlackRatio(){
		return this.pctBlackRatio;
	}

	/**
	 *方法: 设置pctBlackRatio
	 *@param: java.lang.Float  pctBlackRatio
	 */
	public void setPctBlackRatio(Float pctBlackRatio){
		this.pctBlackRatio = pctBlackRatio;
	}

	/**
	 *方法: 获得pctCntBlack2
	 *@return: java.lang.Float  pctCntBlack2
	 */
	public Float getPctCntBlack2(){
		return this.pctCntBlack2;
	}

	/**
	 *方法: 设置pctCntBlack2
	 *@param: java.lang.Float  pctCntBlack2
	 */
	public void setPctCntBlack2(Float pctCntBlack2){
		this.pctCntBlack2 = pctCntBlack2;
	}

	/**
	 *方法: 获得pctCntToApplied
	 *@return: java.lang.Float  pctCntToApplied
	 */
	public Float getPctCntToApplied(){
		return this.pctCntToApplied;
	}

	/**
	 *方法: 设置pctCntToApplied
	 *@param: java.lang.Float  pctCntToApplied
	 */
	public void setPctCntToApplied(Float pctCntToApplied){
		this.pctCntToApplied = pctCntToApplied;
	}

	/**
	 *方法: 获得pctCntBeApplied
	 *@return: java.lang.Float  pctCntBeApplied
	 */
	public Float getPctCntBeApplied(){
		return this.pctCntBeApplied;
	}

	/**
	 *方法: 设置pctCntBeApplied
	 *@param: java.lang.Float  pctCntBeApplied
	 */
	public void setPctCntBeApplied(Float pctCntBeApplied){
		this.pctCntBeApplied = pctCntBeApplied;
	}

	/**
	 *方法: 获得pctCntApplied
	 *@return: java.lang.Float  pctCntApplied
	 */
	public Float getPctCntApplied(){
		return this.pctCntApplied;
	}

	/**
	 *方法: 设置pctCntApplied
	 *@param: java.lang.Float  pctCntApplied
	 */
	public void setPctCntApplied(Float pctCntApplied){
		this.pctCntApplied = pctCntApplied;
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