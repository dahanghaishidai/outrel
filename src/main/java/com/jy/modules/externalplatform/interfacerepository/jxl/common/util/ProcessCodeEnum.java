package com.jy.modules.externalplatform.interfacerepository.jxl.common.util;

import org.apache.commons.lang3.StringUtils;


/**
* 流程码枚举类
*/ 
public enum ProcessCodeEnum {
    
    SUBMIT_CAPTCHA("1","SUBMIT_CAPTCHA"),//提交短信验证码 
    RESEND_CAPTCHA("2","RESEND_CAPTCHA"),//重发短信验证码
    SUBMIT_QUERY_PWD("3","SUBMIT_QUERY_PWD"),//提交查询密码【仅北京移动会出现】
    SUBMIT_RESET_PWD("4","SUBMIT_RESET_PWD"),//提交短信验证码
    RESEND_RESET_PWD_CAPTCHA("5","RESEND_RESET_PWD_CAPTCHA"),//重发短信验证码

    PROCESS_CODE_10003("10003", "密码错误"),//用户重新请求采集接口
    PROCESS_CODE_10008("10008", "开始采集行为数据"),//结束采集交互流程
    PROCESS_CODE_30000("30000", "错误信息");//网络异常、非接口可控的错误信息（建议结束流程）
    
    private String key;
    private String value;
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    private ProcessCodeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }
    
    /**
     * @description: 根据key获取对应的value
     * @return
     */
    public static String getValueByKey(String key) {
        String value = null;

        if (StringUtils.isEmpty(key)) {
            return value;
        }

        for (ProcessCodeEnum s : values()) {
            if (s.getKey().equals(key)) {
                value = s.getValue();
                break;
            }
        }
        return value;
    }

}
