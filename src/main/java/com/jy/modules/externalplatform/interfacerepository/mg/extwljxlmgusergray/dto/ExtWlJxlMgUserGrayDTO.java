package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusergray.dto;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcongrscore.dto.ExtWlJxlMgConGrScoreDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconreladist.dto.ExtWlJxlMgConReladistDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontactrfm.dto.ExtWlJxlMgContactRfmDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontaquery.dto.ExtWlJxlMgContaQueryDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontclosest.dto.ExtWlJxlMgContClosestDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontnumsta.dto.ExtWlJxlMgContNumStaDTO;
import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:聚信立蜜罐用户灰度分数信息
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-09 18:55:54
 */
public class ExtWlJxlMgUserGrayDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**USER_GRID_ID*/
	private String userGridId;

	/**直接联系人在黑名单的数量*/
	private Long contactsClass1BlacklistCnt;

	/**灰度手机号码*/
	private String userPhone;

	/**引起占比=引起二阶黑名单人数/一阶联系人总数*/
	private Long contactsRouterRatio;

	/**间接联系人在黑名单的数量*/
	private Long contactsClass2BlacklistCnt;

	/**引起二阶黑名单人数*/
	private Long contactsRouterCnt;

	/**一阶联系人总数*/
	private Long contactsClass1Cnt;

	/**手机号码灰度分数*/
	private Float phoneGrayScore;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**创建人*/
	private Long createBy;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;

	/**修改人*/
	private Long modifyBy;

	/**是否种子号，即是否成功产生过蜜蜂报告，1或0*/
	private String hasReport;

	/**最近活跃时间;种子号为最近蜜蜂报告时间，非种子号为最近通话时间*/
	private Long recentActiveTime;

	/**社交活跃度；作为主叫，主动关注他人的活跃度综合评价，取值（0,100）；仅为被叫，活跃度为0*/
	private Float socialLiveness;

	/**社交影响力；作为被叫，被他人关注的影响力综合评价，取值（0,100）；仅为主叫，影响力为0*/
	private Float socialInfluence;


	private ExtWlJxlMgConGrScoreDTO contactsGrayScore;
	private ExtWlJxlMgConReladistDTO contactsRelationDistribution;
	private ExtWlJxlMgContactRfmDTO contactsRfm;
	private ExtWlJxlMgContaQueryDTO contactsQuery;
	private ExtWlJxlMgContClosestDTO contactsClosest;
	private ExtWlJxlMgContNumStaDTO contactsNumberStatistic;

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
	 *方法: 获得contactsClass1BlacklistCnt
	 *@return: java.lang.Long  contactsClass1BlacklistCnt
	 */
	public Long getContactsClass1BlacklistCnt(){
		return this.contactsClass1BlacklistCnt;
	}

	/**
	 *方法: 设置contactsClass1BlacklistCnt
	 *@param: java.lang.Long  contactsClass1BlacklistCnt
	 */
	public void setContactsClass1BlacklistCnt(Long contactsClass1BlacklistCnt){
		this.contactsClass1BlacklistCnt = contactsClass1BlacklistCnt;
	}

	/**
	 *方法: 获得userPhone
	 *@return: java.lang.String  userPhone
	 */
	public String getUserPhone(){
		return this.userPhone;
	}

	/**
	 *方法: 设置userPhone
	 *@param: java.lang.String  userPhone
	 */
	public void setUserPhone(String userPhone){
		this.userPhone = userPhone;
	}

	/**
	 *方法: 获得contactsRouterRatio
	 *@return: java.lang.Long  contactsRouterRatio
	 */
	public Long getContactsRouterRatio(){
		return this.contactsRouterRatio;
	}

	/**
	 *方法: 设置contactsRouterRatio
	 *@param: java.lang.Long  contactsRouterRatio
	 */
	public void setContactsRouterRatio(Long contactsRouterRatio){
		this.contactsRouterRatio = contactsRouterRatio;
	}

	/**
	 *方法: 获得contactsClass2BlacklistCnt
	 *@return: java.lang.Long  contactsClass2BlacklistCnt
	 */
	public Long getContactsClass2BlacklistCnt(){
		return this.contactsClass2BlacklistCnt;
	}

	/**
	 *方法: 设置contactsClass2BlacklistCnt
	 *@param: java.lang.Long  contactsClass2BlacklistCnt
	 */
	public void setContactsClass2BlacklistCnt(Long contactsClass2BlacklistCnt){
		this.contactsClass2BlacklistCnt = contactsClass2BlacklistCnt;
	}

	/**
	 *方法: 获得contactsRouterCnt
	 *@return: java.lang.Long  contactsRouterCnt
	 */
	public Long getContactsRouterCnt(){
		return this.contactsRouterCnt;
	}

	/**
	 *方法: 设置contactsRouterCnt
	 *@param: java.lang.Long  contactsRouterCnt
	 */
	public void setContactsRouterCnt(Long contactsRouterCnt){
		this.contactsRouterCnt = contactsRouterCnt;
	}

	/**
	 *方法: 获得contactsClass1Cnt
	 *@return: java.lang.Long  contactsClass1Cnt
	 */
	public Long getContactsClass1Cnt(){
		return this.contactsClass1Cnt;
	}

	/**
	 *方法: 设置contactsClass1Cnt
	 *@param: java.lang.Long  contactsClass1Cnt
	 */
	public void setContactsClass1Cnt(Long contactsClass1Cnt){
		this.contactsClass1Cnt = contactsClass1Cnt;
	}

	/**
	 *方法: 获得phoneGrayScore
	 *@return: java.lang.Float  phoneGrayScore
	 */
	public Float getPhoneGrayScore(){
		return this.phoneGrayScore;
	}

	/**
	 *方法: 设置phoneGrayScore
	 *@param: java.lang.Float  phoneGrayScore
	 */
	public void setPhoneGrayScore(Float phoneGrayScore){
		this.phoneGrayScore = phoneGrayScore;
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
	 *方法: 获得hasReport
	 *@return: java.lang.String  hasReport
	 */
	public String getHasReport(){
		return this.hasReport;
	}

	/**
	 *方法: 设置hasReport
	 *@param: java.lang.String  hasReport
	 */
	public void setHasReport(String hasReport){
		this.hasReport = hasReport;
	}

	/**
	 *方法: 获得recentActiveTime
	 *@return: java.lang.Long  recentActiveTime
	 */
	public Long getRecentActiveTime(){
		return this.recentActiveTime;
	}

	/**
	 *方法: 设置recentActiveTime
	 *@param: java.lang.Long  recentActiveTime
	 */
	public void setRecentActiveTime(Long recentActiveTime){
		this.recentActiveTime = recentActiveTime;
	}

	/**
	 *方法: 获得socialLiveness
	 *@return: java.lang.Float  socialLiveness
	 */
	public Float getSocialLiveness(){
		return this.socialLiveness;
	}

	/**
	 *方法: 设置socialLiveness
	 *@param: java.lang.Float  socialLiveness
	 */
	public void setSocialLiveness(Float socialLiveness){
		this.socialLiveness = socialLiveness;
	}

	/**
	 *方法: 获得socialInfluence
	 *@return: java.lang.Float  socialInfluence
	 */
	public Float getSocialInfluence(){
		return this.socialInfluence;
	}

	/**
	 *方法: 设置socialInfluence
	 *@param: java.lang.Float  socialInfluence
	 */
	public void setSocialInfluence(Float socialInfluence){
		this.socialInfluence = socialInfluence;
	}

	public ExtWlJxlMgConGrScoreDTO getContactsGrayScore() {
		return contactsGrayScore;
	}

	public void setContactsGrayScore(ExtWlJxlMgConGrScoreDTO contactsGrayScore) {
		this.contactsGrayScore = contactsGrayScore;
	}

	public ExtWlJxlMgConReladistDTO getContactsRelationDistribution() {
		return contactsRelationDistribution;
	}

	public void setContactsRelationDistribution(ExtWlJxlMgConReladistDTO contactsRelationDistribution) {
		this.contactsRelationDistribution = contactsRelationDistribution;
	}

	public ExtWlJxlMgContactRfmDTO getContactsRfm() {
		return contactsRfm;
	}

	public void setContactsRfm(ExtWlJxlMgContactRfmDTO contactsRfm) {
		this.contactsRfm = contactsRfm;
	}

	public ExtWlJxlMgContaQueryDTO getContactsQuery() {
		return contactsQuery;
	}

	public void setContactsQuery(ExtWlJxlMgContaQueryDTO contactsQuery) {
		this.contactsQuery = contactsQuery;
	}

	public ExtWlJxlMgContClosestDTO getContactsClosest() {
		return contactsClosest;
	}

	public void setContactsClosest(ExtWlJxlMgContClosestDTO contactsClosest) {
		this.contactsClosest = contactsClosest;
	}

	public ExtWlJxlMgContNumStaDTO getContactsNumberStatistic() {
		return contactsNumberStatistic;
	}

	public void setContactsNumberStatistic(ExtWlJxlMgContNumStaDTO contactsNumberStatistic) {
		this.contactsNumberStatistic = contactsNumberStatistic;
	}
}