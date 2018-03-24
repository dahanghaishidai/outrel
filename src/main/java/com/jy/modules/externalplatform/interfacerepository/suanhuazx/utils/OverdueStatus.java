package com.jy.modules.externalplatform.interfacerepository.suanhuazx.utils;

import org.apache.commons.lang3.StringUtils;


/**
* 逾期状态枚举类
*/ 
public enum OverdueStatus {
    
	NO_OVERDUE_STATUS(SuanhuaConstant.NO_OVERDUE_DETAILS,SuanhuaConstant.NO_OVERDUE_STATUS), //未逾期
	OVERDUE_STATUS(SuanhuaConstant.OVERDUE_DETAILS,SuanhuaConstant.OVERDUE_STATUS);//逾期

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
    private OverdueStatus(String key, String value) {
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

        for (OverdueStatus s : values()) {
            if (s.getKey().equals(key)) {
                value = s.getValue();
                break;
            }
        }
        return value;
    }

}
