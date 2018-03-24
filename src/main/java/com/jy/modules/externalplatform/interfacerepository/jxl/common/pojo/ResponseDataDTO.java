package com.jy.modules.externalplatform.interfacerepository.jxl.common.pojo;

import java.io.Serializable;

/**
 * @description: 提供聚信立采集申请返回报文公共类
 */
public class ResponseDataDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	/** 流程类型 CONTROL/ERROR */
	private java.lang.String type;

	/** 流程码说明 */
	private java.lang.String content;

	/** 流程码 10003-密码错误; 10008-开始采集行为数据; 30000-错误信息 */
	private java.lang.Long processCode;

	/** 采集token */
	private java.lang.String token;

	/** 是否已处理完成 */
	private boolean finish;

	public java.lang.String getType() {
		return type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	public java.lang.String getContent() {
		return content;
	}

	public void setContent(java.lang.String content) {
		this.content = content;
	}

	public java.lang.Long getProcessCode() {
		return processCode;
	}

	public void setProcessCode(java.lang.Long processCode) {
		this.processCode = processCode;
	}

	public java.lang.String getToken() {
		return token;
	}

	public void setToken(java.lang.String token) {
		this.token = token;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}
}