package com.jy.modules.externalplatform.interfacerepository.jxl.common.pojo;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;


@Validated
public class RequestCollectReqDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "客户姓名name不能为空")
	private String name;
	
	@NotBlank(message = "手机号码cellPhoneNum不能为空")
	private String cellPhoneNum;
	
	@NotBlank(message = "身份证号码idCardNum不能为空")
	private String idCardNum;
	
	@NotNull(message = "咨询编号consultId不能为空")
	private java.lang.Long consultId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhoneNum() {
		return cellPhoneNum;
	}

	public void setCellPhoneNum(String cellPhoneNum) {
		this.cellPhoneNum = cellPhoneNum;
	}

	public String getIdCardNum() {
		return idCardNum;
	}

	public void setIdCardNum(String idCardNum) {
		this.idCardNum = idCardNum;
	}

	public java.lang.Long getConsultId() {
		return consultId;
	}

	public void setConsultId(java.lang.Long consultId) {
		this.consultId = consultId;
	}
	
}
