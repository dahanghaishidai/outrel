package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dto;

import java.util.Date;

import com.jy.platform.core.common.BaseDTO;

public class ExtHdPhoneBckLisDTO extends BaseDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3231735759278237630L;
	private Long id;
	private String intoCustRefId;
	private String code;// 状态
	private String isBlack;// 黑名单
	private String validateState;
	private Date createTime;
	private Date modifyTime;
	private String createBy;
	private String modifyBy;
	private String remark;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIntoCustRefId() {
		return intoCustRefId;
	}

	public void setIntoCustRefId(String intoCustRefId) {
		this.intoCustRefId = intoCustRefId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIsBlack() {
		return isBlack;
	}

	public void setIsBlack(String isBlack) {
		this.isBlack = isBlack;
	}

	public String getValidateState() {
		return validateState;
	}

	public void setValidateState(String validateState) {
		this.validateState = validateState;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
