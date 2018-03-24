package com.jy.modules.common;

public class ARIConstant {

	public static final String RET_CODE_SUC = "200";// 200：推送成功
	public static final String RET_CODE_FAIL = "201";//201：推送失败
	public static final String RET_CODE_ERROR = "500";//500:推送异常
	
	public static final String ERROR_CODE_SUC = "0000";//0000:查询成功
	public static final String ERROR_CODE_FAIL = "0001";//0001:查询成功无数据
	public static final String ERROR_CODE_FAIL1 = "4009";//4009:用户调用参数错误
	public static final String ERROR_CODE_ERROR = "5000";//5000:出现系统错误
	
	public static final String TX = "202";//业务编码
	public static final String VERSION = "v3";//版本号
	public static final String[] ADUIT = {"1100","1150","1200","1300","1600","2100","2200","2300","2400","2500","3100","3200","3700","4100","5100","5200","5300","5700","1050","1020","1025","1030"};//审批中
	public static final String[] REFUSE ={"1400","3900","3300","3500","2600","5500","3350","2600","3800"};//拒贷
	public static final String[] GIVE_UP ={"1500","3400","3600","5600"};//放弃
	
	public static final String BAIDU_RET_CODE_SUC = "0";// 0：推送成功
}
