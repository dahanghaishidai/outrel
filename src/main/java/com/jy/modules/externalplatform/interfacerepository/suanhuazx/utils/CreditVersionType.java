package com.jy.modules.externalplatform.interfacerepository.suanhuazx.utils;

import org.apache.commons.lang3.StringUtils;


/**
* 征信版本类型枚举类
*/ 
public enum CreditVersionType {
    
	REPORT_RISK("1","report_risk"),//算话人行个人信用报告(风险报告)
	REPORT("2","report"),//算话人行个人信用报告(原始报告)
	REPORT_STRUCTURE("3","report_structure");//算话人行个人信用报告(结构化报告)
	

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
    private CreditVersionType(String key, String value) {
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

        for (CreditVersionType s : values()) {
            if (s.getKey().equals(key)) {
                value = s.getValue();
                break;
            }
        }
        return value;
    }

}
