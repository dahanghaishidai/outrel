package com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.service;

import com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.dto.ExtWlPaCreditInfoDTO;
import com.jy.platform.core.common.BaseDTO;

public class RequestPaDto extends BaseDTO {

    private static final long serialVersionUID = 1L;

    /** 返回信息 */
    private String message;

    /** 返回编码 */
    private String result;

    private ExtWlPaCreditInfoDTO[] data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ExtWlPaCreditInfoDTO[] getData() {
        return data;
    }

    public void setData(ExtWlPaCreditInfoDTO[] data) {
        this.data = data;
    }

}
