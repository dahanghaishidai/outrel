package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.enumdef;

import org.apache.commons.lang3.StringUtils;

/**
 * @description: 异常交易类型枚举值
 */
public enum SpecTradeType {
	EXTENDS("extends", "展期(延期)"),
	ANGENTS("angents", "担保人代还 "), 
	LEASE("leases", "以资抵债"),
	OVER30("over30", "逾期1-29天"),
	OVER60("over60", "逾期30-59天 "),
	OVER90("over90", "逾期60-89天 "),
	OVERL("overL","长期拖欠(90天以上)"),
	ILLEGAL("illegal", "法律诉讼(已判决生效)"), 
	CHEAT("cheat", "诈骗"),
    ADVANCE("advance","提前还款"), 
    OTHER("other", "其他");

	private String key;
	private String value;

	private SpecTradeType(String key, String value) {
		this.key = key;
		this.value = value;
	}

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
	
	/**
	* @title: getValueByKey
	* @author:陈东栋
	* @description: 根据key获取对应的value
	* @date 2017年7月11日 下午9:03:05
	* @param key
	* @return
	* @throws 
	*/ 
	public static String getValueByKey(String key) {
		String value = null;

		if (StringUtils.isEmpty(key)) {
			return value;
		}

		for (SpecTradeType s : values()) {
			if (s.getKey().equals(key)) {
				value = s.getValue();
				break;
			}
		}
		return value;
	}
}
