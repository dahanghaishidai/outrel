package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmixedriskinfo.dto;

import com.jy.platform.core.common.BaseDTO;

public class ResponseMixedRiskDTO extends BaseDTO{
	
	private static final long serialVersionUID = 1L;
	
	/**返回信息*/
	private String message;

	/**返回编码*/
	private String errorCode;
	
	/**数据主体*/
	private ExtWlZcMixedRiskInfoDTO data;

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

	public ExtWlZcMixedRiskInfoDTO getData() {
		return data;
	}

	public void setData(ExtWlZcMixedRiskInfoDTO data) {
		this.data = data;
	}

}
