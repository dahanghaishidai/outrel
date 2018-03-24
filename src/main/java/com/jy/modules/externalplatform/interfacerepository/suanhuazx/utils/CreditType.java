package com.jy.modules.externalplatform.interfacerepository.suanhuazx.utils;

import org.apache.commons.lang3.StringUtils;

public enum CreditType {

	CREDIT_CARD("creditCard", "1"), // 1-信用卡
	MORTGAGE("mortgage", "2"), // 2-购房贷款
	OTHER_LOAN("otherLoan", "3"), // 3-其他贷款
	ASSET_DISPOSAL("assetDisposal", "4"), // 4-资产处置信息
	COMPENSATE("compensate", "5"), // 5-保证人代偿信息
	GUARANTEE("guarantee", "6");// 6-为他人担保信息

	
	
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
    private CreditType(String key, String value) {
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

        for (CreditType s : values()) {
            if (s.getKey().equals(key)) {
                value = s.getValue();
                break;
            }
        }
        return value;
    }

}
