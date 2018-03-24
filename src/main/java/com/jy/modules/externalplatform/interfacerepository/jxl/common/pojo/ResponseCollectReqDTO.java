package com.jy.modules.externalplatform.interfacerepository.jxl.common.pojo;

import java.io.Serializable;

/**
 * @description: 提供聚信立采集申请返回报文公共类
 */
public class ResponseCollectReqDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 接口调用是否成功 */
	private boolean success;

	/** 消息提示 */
	private String message;

	/** 响应内容对象 */
	private ResponseDataDTO data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ResponseDataDTO getData() {
		return data;
	}

	public void setData(ResponseDataDTO data) {
		this.data = data;
	}
}