package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduinfo.dto;

import com.jy.platform.core.common.BaseDTO;

/**
 * @className: RequestBaiDuDto
 * @package: com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduinfo.dto
 * @describe: 百度金融接口返回结果实体类
 * @auther: huangxianchao
 * @date: 2017/12/14 0014
 * @time: 上午 9:44
 **/
public class RequestBaiDuDto extends BaseDTO {

    private static final long serialVersionUID = 1L;

    /** 返回信息 */
    private String retCode;

    /** 返回编码 */
    private String retMsg;

    private ExtWlBaiduInfoDTO result;

    
    public String getRetCode() {
        return retCode;
    }

    
    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    
    public String getRetMsg() {
        return retMsg;
    }

    
    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    
    public ExtWlBaiduInfoDTO getResult() {
        return result;
    }

    
    public void setResult(ExtWlBaiduInfoDTO result) {
        this.result = result;
    }

    
}
