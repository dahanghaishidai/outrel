package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto;

import com.jy.platform.core.common.BaseDTO;

public class RequestMes2Dto extends BaseDTO{
	private static final long serialVersionUID = 1L;
	
	/**业务类型编号*/
	private String tx;

	private ExtWlZcqueryInfoDTO data;

	public String getTx() {
		return tx;
	}

	public void setTx(String tx) {
		this.tx = tx;
	}

	public ExtWlZcqueryInfoDTO getData() {
		return data;
	}

	public void setData(ExtWlZcqueryInfoDTO data) {
		this.data = data;
	}
	
}
