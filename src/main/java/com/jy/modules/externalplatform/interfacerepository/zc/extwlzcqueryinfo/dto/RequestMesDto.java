package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto;

import com.jy.platform.core.common.BaseDTO;

public class RequestMesDto extends BaseDTO{
	
	private static final long serialVersionUID = 1L;
	
	/**返回信息*/
	private String message;

	/**返回编码*/
	private String errorCode;
	
	private RequestMes2Dto params;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public RequestMes2Dto getParams() {
		return params;
	}

	public void setParams(RequestMes2Dto params) {
		this.params = params;
	}
}
