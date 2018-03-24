package com.jy.modules.externalplatform.interfacerepository.br.extwlbrcusscore.dto;

import org.apache.commons.lang3.StringUtils;

public enum BrCusScoreEnum {
	RET_CODE_00("00","操作成功"),
	RET_CODE_100001("100001","程序错误"),
	RET_CODE_100002("100002","匹配结果为空"),
	RET_CODE_100003("100003","必选key值缺失或不合法"),
	RET_CODE_100004("100004","商户不存在或用户名错误"),
	RET_CODE_100005("100005","登陆密码不正确"),
	RET_CODE_100006("100006","请求参数格式错误"),
	RET_CODE_100007("100007","Tokenid过期"),
	RET_CODE_100008("100008","客户端api调用码不能为空"),
	RET_CODE_100009("100009","IP地址错误"),
	RET_CODE_100010("100010","超出当天访问次数"),
	RET_CODE_100011("100011","账户停用"),
	RET_CODE_100012("100012","请求套餐为空"),
	RET_CODE_1000015("1000015","请求参数其他错误"),
	RET_CODE_1000016("1000016","捕获请求json异常，无法解析的错误"),
	RET_CODE_200000("200000","内部延迟")
	;


	private String key;
	private String value;

	private BrCusScoreEnum(String key, String value) {
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
	 * @methodName: getValueByKey
	 * @param: [key]
	 * @describe: 根据key获取对应的value
	 * @auther: 董康宁
	 * @date: 2017/12/20
	 * @time: 10:02
	 */
	public static String getValueByKey(String key) {
		String value = null;

		if (StringUtils.isEmpty(key)) {
			return value;
		}

		for (BrCusScoreEnum s : values()) {
			if (s.getKey().equals(key)) {
				value = s.getValue();
				break;
			}
		}
		return value;
	}
}
