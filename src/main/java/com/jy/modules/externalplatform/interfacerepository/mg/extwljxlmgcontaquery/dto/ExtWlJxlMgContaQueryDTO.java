package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontaquery.dto;

import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:蜜罐联系人的查询历史表
 *@author Administrator
 *@version 1.0,
 *@date 2018-01-09 17:46:36
 */
public class ExtWlJxlMgContaQueryDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private Long id;

	/**蜜罐ID*/
	private String userGridId;

	/**recent_active_time前半年内主动联系的人的最近一次查询时间*/
	private Long toRecentQueryTime;

	/**recent_active_time前半年内被动联系的人的最近一次查询时间*/
	private Long beRecentQueryTime;

	/**to_recent_query_time前半月内主动联系的人的查询次数*/
	private Long toQueryCnt05;

	/**be_recent_query_time前半月内被动联系的人的查询次数*/
	private Long beQueryCnt05;

	/**contacts_recent_query_time前半月内联系人的查询次数*/
	private Long queryCnt05;

	/**to_recent_query_time前1月内主动联系的人的查询次数*/
	private Long toQueryCnt1;

	/**be_recent_query_time前1月内被动联系的人的查询次数*/
	private Long beQueryCnt1;

	/**contacts_recent_query_time前1月内联系人的查询次数*/
	private Long queryCnt1;

	/**to_recent_query_time前2月内主动联系的人的查询次数*/
	private Long toQueryCnt2;

	/**be_recent_query_time前2月内被动联系的人的查询次数*/
	private Long beQueryCnt2;

	/**contacts_recent_query_time前2月内联系人的查询次数*/
	private Long queryCnt2;

	/**to_recent_query_time前3月内主动联系的人的查询次数*/
	private Long toQueryCnt3;

	/**be_recent_query_time前3月内被动联系的人的查询次数*/
	private Long beQueryCnt3;

	/**contacts_recent_query_time前3月内联系人的查询次数*/
	private Long queryCnt3;

	/**to_recent_query_time前6月内主动联系的人的查询次数*/
	private Long toQueryCnt6;

	/**be_recent_query_time前6月内被动联系的人的查询次数*/
	private Long beQueryCnt6;

	/**contacts_recent_query_time前6月内联系人的查询次数*/
	private Long queryCnt6;

	/**to_recent_query_time前9月内主动联系的人的查询次数*/
	private Long toQueryCnt9;

	/**be_recent_query_time前9月内被动联系的人的查询次数*/
	private Long beQueryCnt9;

	/**contacts_recent_query_time前9月内联系人的查询次数*/
	private Long queryCnt9;

	/**to_recent_query_time前12月内主动联系的人的查询次数*/
	private Long toQueryCnt12;

	/**be_recent_query_time前12月内被动联系的人的查询次数*/
	private Long beQueryCnt12;

	/**contacts_recent_query_time前12月内联系人的查询次数*/
	private Long queryCnt12;

	/**to_recent_query_time前半月内主动联系的人的查询机构数*/
	private Long toOrgCnt05;

	/**be_recent_query_time前半月内被动联系的人的查询机构数*/
	private Long beOrgCnt05;

	/**contacts_recent_query_time前半月内联系人的查询机构数*/
	private Long orgCnt05;

	/**to_recent_query_time前1月内主动联系的人的查询机构数*/
	private Long toOrgCnt1;

	/**be_recent_query_time前1月内被动联系的人的查询机构数*/
	private Long beOrgCnt1;

	/**contacts_recent_query_time前1月内联系人的查询机构数*/
	private Long orgCnt1;

	/**to_recent_query_time前2月内主动联系的人的查询机构数*/
	private Long toOrgCnt2;

	/**be_recent_query_time前2月内被动联系的人的查询机构数*/
	private Long beOrgCnt2;

	/**contacts_recent_query_time前2月内联系人的查询机构数*/
	private Long orgCnt2;

	/**to_recent_query_time前3月内主动联系的人的查询机构数*/
	private Long toOrgCnt3;

	/**be_recent_query_time前3月内被动联系的人的查询机构数*/
	private Long beOrgCnt3;

	/**contacts_recent_query_time前3月内联系人的查询机构数*/
	private Long orgCnt3;

	/**to_recent_query_time前6月内主动联系的人的查询机构数*/
	private Long toOrgCnt6;

	/**be_recent_query_time前6月内被动联系的人的查询机构数*/
	private Long beOrgCnt6;

	/**contacts_recent_query_time前6月内联系人的查询机构数*/
	private Long orgCnt6;

	/**to_recent_query_time前9月内主动联系的人的查询机构数*/
	private Long toOrgCnt9;

	/**be_recent_query_time前9月内被动联系的人的查询机构数*/
	private Long beOrgCnt9;

	/**contacts_recent_query_time前9月内联系人的查询机构数*/
	private Long orgCnt9;

	/**to_recent_query_time前12月内主动联系的人的查询机构数*/
	private Long toOrgCnt12;

	/**be_recent_query_time前12月内被动联系的人的查询机构数*/
	private Long beOrgCnt12;

	/**contacts_recent_query_time前12月内联系人的查询机构数*/
	private Long orgCnt12;

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
	 *方法: 获得toRecentQueryTime
	 *@return: java.lang.Long  toRecentQueryTime
	 */
	public Long getToRecentQueryTime(){
		return this.toRecentQueryTime;
	}

	/**
	 *方法: 设置toRecentQueryTime
	 *@param: java.lang.Long  toRecentQueryTime
	 */
	public void setToRecentQueryTime(Long toRecentQueryTime){
		this.toRecentQueryTime = toRecentQueryTime;
	}

	/**
	 *方法: 获得beRecentQueryTime
	 *@return: java.lang.Long  beRecentQueryTime
	 */
	public Long getBeRecentQueryTime(){
		return this.beRecentQueryTime;
	}

	/**
	 *方法: 设置beRecentQueryTime
	 *@param: java.lang.Long  beRecentQueryTime
	 */
	public void setBeRecentQueryTime(Long beRecentQueryTime){
		this.beRecentQueryTime = beRecentQueryTime;
	}

	/**
	 *方法: 获得toQueryCnt05
	 *@return: java.lang.Long  toQueryCnt05
	 */
	public Long getToQueryCnt05(){
		return this.toQueryCnt05;
	}

	/**
	 *方法: 设置toQueryCnt05
	 *@param: java.lang.Long  toQueryCnt05
	 */
	public void setToQueryCnt05(Long toQueryCnt05){
		this.toQueryCnt05 = toQueryCnt05;
	}

	/**
	 *方法: 获得beQueryCnt05
	 *@return: java.lang.Long  beQueryCnt05
	 */
	public Long getBeQueryCnt05(){
		return this.beQueryCnt05;
	}

	/**
	 *方法: 设置beQueryCnt05
	 *@param: java.lang.Long  beQueryCnt05
	 */
	public void setBeQueryCnt05(Long beQueryCnt05){
		this.beQueryCnt05 = beQueryCnt05;
	}

	/**
	 *方法: 获得queryCnt05
	 *@return: java.lang.Long  queryCnt05
	 */
	public Long getQueryCnt05(){
		return this.queryCnt05;
	}

	/**
	 *方法: 设置queryCnt05
	 *@param: java.lang.Long  queryCnt05
	 */
	public void setQueryCnt05(Long queryCnt05){
		this.queryCnt05 = queryCnt05;
	}

	/**
	 *方法: 获得toQueryCnt1
	 *@return: java.lang.Long  toQueryCnt1
	 */
	public Long getToQueryCnt1(){
		return this.toQueryCnt1;
	}

	/**
	 *方法: 设置toQueryCnt1
	 *@param: java.lang.Long  toQueryCnt1
	 */
	public void setToQueryCnt1(Long toQueryCnt1){
		this.toQueryCnt1 = toQueryCnt1;
	}

	/**
	 *方法: 获得beQueryCnt1
	 *@return: java.lang.Long  beQueryCnt1
	 */
	public Long getBeQueryCnt1(){
		return this.beQueryCnt1;
	}

	/**
	 *方法: 设置beQueryCnt1
	 *@param: java.lang.Long  beQueryCnt1
	 */
	public void setBeQueryCnt1(Long beQueryCnt1){
		this.beQueryCnt1 = beQueryCnt1;
	}

	/**
	 *方法: 获得queryCnt1
	 *@return: java.lang.Long  queryCnt1
	 */
	public Long getQueryCnt1(){
		return this.queryCnt1;
	}

	/**
	 *方法: 设置queryCnt1
	 *@param: java.lang.Long  queryCnt1
	 */
	public void setQueryCnt1(Long queryCnt1){
		this.queryCnt1 = queryCnt1;
	}

	/**
	 *方法: 获得toQueryCnt2
	 *@return: java.lang.Long  toQueryCnt2
	 */
	public Long getToQueryCnt2(){
		return this.toQueryCnt2;
	}

	/**
	 *方法: 设置toQueryCnt2
	 *@param: java.lang.Long  toQueryCnt2
	 */
	public void setToQueryCnt2(Long toQueryCnt2){
		this.toQueryCnt2 = toQueryCnt2;
	}

	/**
	 *方法: 获得beQueryCnt2
	 *@return: java.lang.Long  beQueryCnt2
	 */
	public Long getBeQueryCnt2(){
		return this.beQueryCnt2;
	}

	/**
	 *方法: 设置beQueryCnt2
	 *@param: java.lang.Long  beQueryCnt2
	 */
	public void setBeQueryCnt2(Long beQueryCnt2){
		this.beQueryCnt2 = beQueryCnt2;
	}

	/**
	 *方法: 获得queryCnt2
	 *@return: java.lang.Long  queryCnt2
	 */
	public Long getQueryCnt2(){
		return this.queryCnt2;
	}

	/**
	 *方法: 设置queryCnt2
	 *@param: java.lang.Long  queryCnt2
	 */
	public void setQueryCnt2(Long queryCnt2){
		this.queryCnt2 = queryCnt2;
	}

	/**
	 *方法: 获得toQueryCnt3
	 *@return: java.lang.Long  toQueryCnt3
	 */
	public Long getToQueryCnt3(){
		return this.toQueryCnt3;
	}

	/**
	 *方法: 设置toQueryCnt3
	 *@param: java.lang.Long  toQueryCnt3
	 */
	public void setToQueryCnt3(Long toQueryCnt3){
		this.toQueryCnt3 = toQueryCnt3;
	}

	/**
	 *方法: 获得beQueryCnt3
	 *@return: java.lang.Long  beQueryCnt3
	 */
	public Long getBeQueryCnt3(){
		return this.beQueryCnt3;
	}

	/**
	 *方法: 设置beQueryCnt3
	 *@param: java.lang.Long  beQueryCnt3
	 */
	public void setBeQueryCnt3(Long beQueryCnt3){
		this.beQueryCnt3 = beQueryCnt3;
	}

	/**
	 *方法: 获得queryCnt3
	 *@return: java.lang.Long  queryCnt3
	 */
	public Long getQueryCnt3(){
		return this.queryCnt3;
	}

	/**
	 *方法: 设置queryCnt3
	 *@param: java.lang.Long  queryCnt3
	 */
	public void setQueryCnt3(Long queryCnt3){
		this.queryCnt3 = queryCnt3;
	}

	/**
	 *方法: 获得toQueryCnt6
	 *@return: java.lang.Long  toQueryCnt6
	 */
	public Long getToQueryCnt6(){
		return this.toQueryCnt6;
	}

	/**
	 *方法: 设置toQueryCnt6
	 *@param: java.lang.Long  toQueryCnt6
	 */
	public void setToQueryCnt6(Long toQueryCnt6){
		this.toQueryCnt6 = toQueryCnt6;
	}

	/**
	 *方法: 获得beQueryCnt6
	 *@return: java.lang.Long  beQueryCnt6
	 */
	public Long getBeQueryCnt6(){
		return this.beQueryCnt6;
	}

	/**
	 *方法: 设置beQueryCnt6
	 *@param: java.lang.Long  beQueryCnt6
	 */
	public void setBeQueryCnt6(Long beQueryCnt6){
		this.beQueryCnt6 = beQueryCnt6;
	}

	/**
	 *方法: 获得queryCnt6
	 *@return: java.lang.Long  queryCnt6
	 */
	public Long getQueryCnt6(){
		return this.queryCnt6;
	}

	/**
	 *方法: 设置queryCnt6
	 *@param: java.lang.Long  queryCnt6
	 */
	public void setQueryCnt6(Long queryCnt6){
		this.queryCnt6 = queryCnt6;
	}

	/**
	 *方法: 获得toQueryCnt9
	 *@return: java.lang.Long  toQueryCnt9
	 */
	public Long getToQueryCnt9(){
		return this.toQueryCnt9;
	}

	/**
	 *方法: 设置toQueryCnt9
	 *@param: java.lang.Long  toQueryCnt9
	 */
	public void setToQueryCnt9(Long toQueryCnt9){
		this.toQueryCnt9 = toQueryCnt9;
	}

	/**
	 *方法: 获得beQueryCnt9
	 *@return: java.lang.Long  beQueryCnt9
	 */
	public Long getBeQueryCnt9(){
		return this.beQueryCnt9;
	}

	/**
	 *方法: 设置beQueryCnt9
	 *@param: java.lang.Long  beQueryCnt9
	 */
	public void setBeQueryCnt9(Long beQueryCnt9){
		this.beQueryCnt9 = beQueryCnt9;
	}

	/**
	 *方法: 获得queryCnt9
	 *@return: java.lang.Long  queryCnt9
	 */
	public Long getQueryCnt9(){
		return this.queryCnt9;
	}

	/**
	 *方法: 设置queryCnt9
	 *@param: java.lang.Long  queryCnt9
	 */
	public void setQueryCnt9(Long queryCnt9){
		this.queryCnt9 = queryCnt9;
	}

	/**
	 *方法: 获得toQueryCnt12
	 *@return: java.lang.Long  toQueryCnt12
	 */
	public Long getToQueryCnt12(){
		return this.toQueryCnt12;
	}

	/**
	 *方法: 设置toQueryCnt12
	 *@param: java.lang.Long  toQueryCnt12
	 */
	public void setToQueryCnt12(Long toQueryCnt12){
		this.toQueryCnt12 = toQueryCnt12;
	}

	/**
	 *方法: 获得beQueryCnt12
	 *@return: java.lang.Long  beQueryCnt12
	 */
	public Long getBeQueryCnt12(){
		return this.beQueryCnt12;
	}

	/**
	 *方法: 设置beQueryCnt12
	 *@param: java.lang.Long  beQueryCnt12
	 */
	public void setBeQueryCnt12(Long beQueryCnt12){
		this.beQueryCnt12 = beQueryCnt12;
	}

	/**
	 *方法: 获得queryCnt12
	 *@return: java.lang.Long  queryCnt12
	 */
	public Long getQueryCnt12(){
		return this.queryCnt12;
	}

	/**
	 *方法: 设置queryCnt12
	 *@param: java.lang.Long  queryCnt12
	 */
	public void setQueryCnt12(Long queryCnt12){
		this.queryCnt12 = queryCnt12;
	}

	/**
	 *方法: 获得toOrgCnt05
	 *@return: java.lang.Long  toOrgCnt05
	 */
	public Long getToOrgCnt05(){
		return this.toOrgCnt05;
	}

	/**
	 *方法: 设置toOrgCnt05
	 *@param: java.lang.Long  toOrgCnt05
	 */
	public void setToOrgCnt05(Long toOrgCnt05){
		this.toOrgCnt05 = toOrgCnt05;
	}

	/**
	 *方法: 获得beOrgCnt05
	 *@return: java.lang.Long  beOrgCnt05
	 */
	public Long getBeOrgCnt05(){
		return this.beOrgCnt05;
	}

	/**
	 *方法: 设置beOrgCnt05
	 *@param: java.lang.Long  beOrgCnt05
	 */
	public void setBeOrgCnt05(Long beOrgCnt05){
		this.beOrgCnt05 = beOrgCnt05;
	}

	/**
	 *方法: 获得orgCnt05
	 *@return: java.lang.Long  orgCnt05
	 */
	public Long getOrgCnt05(){
		return this.orgCnt05;
	}

	/**
	 *方法: 设置orgCnt05
	 *@param: java.lang.Long  orgCnt05
	 */
	public void setOrgCnt05(Long orgCnt05){
		this.orgCnt05 = orgCnt05;
	}

	/**
	 *方法: 获得toOrgCnt1
	 *@return: java.lang.Long  toOrgCnt1
	 */
	public Long getToOrgCnt1(){
		return this.toOrgCnt1;
	}

	/**
	 *方法: 设置toOrgCnt1
	 *@param: java.lang.Long  toOrgCnt1
	 */
	public void setToOrgCnt1(Long toOrgCnt1){
		this.toOrgCnt1 = toOrgCnt1;
	}

	/**
	 *方法: 获得beOrgCnt1
	 *@return: java.lang.Long  beOrgCnt1
	 */
	public Long getBeOrgCnt1(){
		return this.beOrgCnt1;
	}

	/**
	 *方法: 设置beOrgCnt1
	 *@param: java.lang.Long  beOrgCnt1
	 */
	public void setBeOrgCnt1(Long beOrgCnt1){
		this.beOrgCnt1 = beOrgCnt1;
	}

	/**
	 *方法: 获得orgCnt1
	 *@return: java.lang.Long  orgCnt1
	 */
	public Long getOrgCnt1(){
		return this.orgCnt1;
	}

	/**
	 *方法: 设置orgCnt1
	 *@param: java.lang.Long  orgCnt1
	 */
	public void setOrgCnt1(Long orgCnt1){
		this.orgCnt1 = orgCnt1;
	}

	/**
	 *方法: 获得toOrgCnt2
	 *@return: java.lang.Long  toOrgCnt2
	 */
	public Long getToOrgCnt2(){
		return this.toOrgCnt2;
	}

	/**
	 *方法: 设置toOrgCnt2
	 *@param: java.lang.Long  toOrgCnt2
	 */
	public void setToOrgCnt2(Long toOrgCnt2){
		this.toOrgCnt2 = toOrgCnt2;
	}

	/**
	 *方法: 获得beOrgCnt2
	 *@return: java.lang.Long  beOrgCnt2
	 */
	public Long getBeOrgCnt2(){
		return this.beOrgCnt2;
	}

	/**
	 *方法: 设置beOrgCnt2
	 *@param: java.lang.Long  beOrgCnt2
	 */
	public void setBeOrgCnt2(Long beOrgCnt2){
		this.beOrgCnt2 = beOrgCnt2;
	}

	/**
	 *方法: 获得orgCnt2
	 *@return: java.lang.Long  orgCnt2
	 */
	public Long getOrgCnt2(){
		return this.orgCnt2;
	}

	/**
	 *方法: 设置orgCnt2
	 *@param: java.lang.Long  orgCnt2
	 */
	public void setOrgCnt2(Long orgCnt2){
		this.orgCnt2 = orgCnt2;
	}

	/**
	 *方法: 获得toOrgCnt3
	 *@return: java.lang.Long  toOrgCnt3
	 */
	public Long getToOrgCnt3(){
		return this.toOrgCnt3;
	}

	/**
	 *方法: 设置toOrgCnt3
	 *@param: java.lang.Long  toOrgCnt3
	 */
	public void setToOrgCnt3(Long toOrgCnt3){
		this.toOrgCnt3 = toOrgCnt3;
	}

	/**
	 *方法: 获得beOrgCnt3
	 *@return: java.lang.Long  beOrgCnt3
	 */
	public Long getBeOrgCnt3(){
		return this.beOrgCnt3;
	}

	/**
	 *方法: 设置beOrgCnt3
	 *@param: java.lang.Long  beOrgCnt3
	 */
	public void setBeOrgCnt3(Long beOrgCnt3){
		this.beOrgCnt3 = beOrgCnt3;
	}

	/**
	 *方法: 获得orgCnt3
	 *@return: java.lang.Long  orgCnt3
	 */
	public Long getOrgCnt3(){
		return this.orgCnt3;
	}

	/**
	 *方法: 设置orgCnt3
	 *@param: java.lang.Long  orgCnt3
	 */
	public void setOrgCnt3(Long orgCnt3){
		this.orgCnt3 = orgCnt3;
	}

	/**
	 *方法: 获得toOrgCnt6
	 *@return: java.lang.Long  toOrgCnt6
	 */
	public Long getToOrgCnt6(){
		return this.toOrgCnt6;
	}

	/**
	 *方法: 设置toOrgCnt6
	 *@param: java.lang.Long  toOrgCnt6
	 */
	public void setToOrgCnt6(Long toOrgCnt6){
		this.toOrgCnt6 = toOrgCnt6;
	}

	/**
	 *方法: 获得beOrgCnt6
	 *@return: java.lang.Long  beOrgCnt6
	 */
	public Long getBeOrgCnt6(){
		return this.beOrgCnt6;
	}

	/**
	 *方法: 设置beOrgCnt6
	 *@param: java.lang.Long  beOrgCnt6
	 */
	public void setBeOrgCnt6(Long beOrgCnt6){
		this.beOrgCnt6 = beOrgCnt6;
	}

	/**
	 *方法: 获得orgCnt6
	 *@return: java.lang.Long  orgCnt6
	 */
	public Long getOrgCnt6(){
		return this.orgCnt6;
	}

	/**
	 *方法: 设置orgCnt6
	 *@param: java.lang.Long  orgCnt6
	 */
	public void setOrgCnt6(Long orgCnt6){
		this.orgCnt6 = orgCnt6;
	}

	/**
	 *方法: 获得toOrgCnt9
	 *@return: java.lang.Long  toOrgCnt9
	 */
	public Long getToOrgCnt9(){
		return this.toOrgCnt9;
	}

	/**
	 *方法: 设置toOrgCnt9
	 *@param: java.lang.Long  toOrgCnt9
	 */
	public void setToOrgCnt9(Long toOrgCnt9){
		this.toOrgCnt9 = toOrgCnt9;
	}

	/**
	 *方法: 获得beOrgCnt9
	 *@return: java.lang.Long  beOrgCnt9
	 */
	public Long getBeOrgCnt9(){
		return this.beOrgCnt9;
	}

	/**
	 *方法: 设置beOrgCnt9
	 *@param: java.lang.Long  beOrgCnt9
	 */
	public void setBeOrgCnt9(Long beOrgCnt9){
		this.beOrgCnt9 = beOrgCnt9;
	}

	/**
	 *方法: 获得orgCnt9
	 *@return: java.lang.Long  orgCnt9
	 */
	public Long getOrgCnt9(){
		return this.orgCnt9;
	}

	/**
	 *方法: 设置orgCnt9
	 *@param: java.lang.Long  orgCnt9
	 */
	public void setOrgCnt9(Long orgCnt9){
		this.orgCnt9 = orgCnt9;
	}

	/**
	 *方法: 获得toOrgCnt12
	 *@return: java.lang.Long  toOrgCnt12
	 */
	public Long getToOrgCnt12(){
		return this.toOrgCnt12;
	}

	/**
	 *方法: 设置toOrgCnt12
	 *@param: java.lang.Long  toOrgCnt12
	 */
	public void setToOrgCnt12(Long toOrgCnt12){
		this.toOrgCnt12 = toOrgCnt12;
	}

	/**
	 *方法: 获得beOrgCnt12
	 *@return: java.lang.Long  beOrgCnt12
	 */
	public Long getBeOrgCnt12(){
		return this.beOrgCnt12;
	}

	/**
	 *方法: 设置beOrgCnt12
	 *@param: java.lang.Long  beOrgCnt12
	 */
	public void setBeOrgCnt12(Long beOrgCnt12){
		this.beOrgCnt12 = beOrgCnt12;
	}

	/**
	 *方法: 获得orgCnt12
	 *@return: java.lang.Long  orgCnt12
	 */
	public Long getOrgCnt12(){
		return this.orgCnt12;
	}

	/**
	 *方法: 设置orgCnt12
	 *@param: java.lang.Long  orgCnt12
	 */
	public void setOrgCnt12(Long orgCnt12){
		this.orgCnt12 = orgCnt12;
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