package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

import com.jy.modules.externalplatform.interfacerepository.jxl.common.pojo.RequestCollectReqDTO;


@Validated
public class RequestCreditInvestDTO  extends RequestCollectReqDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@NotBlank(message = "央行征信网站账号account不能为空")
	private String account;
    
	@NotBlank(message = "央行征信网站密码password不能为空")
    private String password;
    
	@NotBlank(message = "央行征信发送的验证码captcha不能为空")
    private String captcha;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = captcha;
	}
}
