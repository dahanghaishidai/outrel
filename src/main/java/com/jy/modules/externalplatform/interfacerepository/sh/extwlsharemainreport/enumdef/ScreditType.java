package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.enumdef;

import org.apache.commons.lang3.StringUtils;

/**
 * @description: 业务类型枚举值
 */
public enum ScreditType {
	CASH_LOAN("cash", "信用贷款"),
	CIRCLE("circle", "循环租赁业务 "), 
	LEASE("lease", "融资租赁业务"),
	ESTATE_LOAN("estate", "房产抵押贷款"),
	CAR_LOAN("car", "车辆抵押贷款 "), 
	OTHER("other","其他业务");
	private String key;
	private String value;

	private ScreditType(String key, String value) {
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

		for (ScreditType s : values()) {
			if (s.getKey().equals(key)) {
				value = s.getValue();
				break;
			}
		}
		return value;
	}
}
