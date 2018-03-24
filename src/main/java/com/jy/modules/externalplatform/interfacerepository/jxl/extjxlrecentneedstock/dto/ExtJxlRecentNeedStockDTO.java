package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlrecentneedstock.dto;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldemandsinfostock.dto.ExtJxlDemandsInfoStockDTO;
import com.jy.platform.core.common.BaseDTO;
/**
 *@Description:近期需求表
 *@author Administrator
 *@version 1.0,
 *@date 2017-06-01 16:26:11
 */
public class ExtJxlRecentNeedStockDTO extends BaseDTO{

	private static final long serialVersionUID = 1L;

	/**主键*/
	private java.lang.Long id;

	/**申请人信息(JXL)id*/
	private java.lang.Long fkJxlCustInfoId;

	/**需求类型*/
	private java.lang.String req_type;

	/**对该需求的主叫总次数*/
	private java.lang.Long call_out_cnt;

	/**对该需求的被叫总次数*/
	private java.lang.Long call_in_cnt;

	/**对该需求的主叫总时长（秒）*/
	private java.lang.Long call_out_time;

	/**对该需求的被叫总时长（秒）*/
	private java.lang.Long call_in_time;

	/**需求发生的月份*/
	private java.lang.String req_mth;
	
	private List<ExtJxlDemandsInfoStockDTO> demands_info;
	
	private Map<String, Object> req_call_min;
	
	private Map<String, Object> req_call_cnt;

	/**创建时间*/
	private java.sql.Timestamp createTime;

	/**修改时间*/
	private java.sql.Timestamp modifyTime;
	
	public java.sql.Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.sql.Timestamp createTime) {
		this.createTime = createTime;
	}

	public java.sql.Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(java.sql.Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	/**
	 *方法: 获得id
	 *@return: java.lang.Long  id
	 */
	public java.lang.Long getId(){
		return this.id;
	}

	/**
	 *方法: 设置id
	 *@param: java.lang.Long  id
	 */
	public void setId(java.lang.Long id){
		this.id = id;
	}

	/**
	 *方法: 获得fkJxlCustInfoId
	 *@return: java.lang.Long  fkJxlCustInfoId
	 */
	public java.lang.Long getFkJxlCustInfoId(){
		return this.fkJxlCustInfoId;
	}

	/**
	 *方法: 设置fkJxlCustInfoId
	 *@param: java.lang.Long  fkJxlCustInfoId
	 */
	public void setFkJxlCustInfoId(java.lang.Long fkJxlCustInfoId){
		this.fkJxlCustInfoId = fkJxlCustInfoId;
	}

	public java.lang.String getReq_type() {
		return req_type;
	}

	public void setReq_type(java.lang.String req_type) {
		this.req_type = req_type;
	}

	public java.lang.Long getCall_out_cnt() {
		return call_out_cnt;
	}

	public void setCall_out_cnt(java.lang.Long call_out_cnt) {
		this.call_out_cnt = call_out_cnt;
	}

	public java.lang.Long getCall_in_cnt() {
		return call_in_cnt;
	}

	public void setCall_in_cnt(java.lang.Long call_in_cnt) {
		this.call_in_cnt = call_in_cnt;
	}

	public java.lang.Long getCall_out_time() {
		return call_out_time;
	}

	public void setCall_out_time(java.lang.Long call_out_time) {
		this.call_out_time = call_out_time;
	}

	public java.lang.Long getCall_in_time() {
		return call_in_time;
	}

	public void setCall_in_time(java.lang.Long call_in_time) {
		this.call_in_time = call_in_time;
	}

	public java.lang.String getReq_mth() {
		return req_mth;
	}

	public void setReq_mth(java.lang.String req_mth) {
		this.req_mth = req_mth;
	}

	public List<ExtJxlDemandsInfoStockDTO> getDemands_info() {
		return demands_info;
	}

	public void setDemands_info(List<ExtJxlDemandsInfoStockDTO> demands_info) {
		this.demands_info = demands_info;
	}

	public Map<String, Object> getReq_call_min() {
		return req_call_min;
	}

	public void setReq_call_min(Map<String, Object> req_call_min) {
		this.req_call_min = req_call_min;
	}

	public Map<String, Object> getReq_call_cnt() {
		return req_call_cnt;
	}

	public void setReq_call_cnt(Map<String, Object> req_call_cnt) {
		this.req_call_cnt = req_call_cnt;
	}


}