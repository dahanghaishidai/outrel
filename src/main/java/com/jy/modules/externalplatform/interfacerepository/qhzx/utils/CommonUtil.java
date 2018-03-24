package com.jy.modules.externalplatform.interfacerepository.qhzx.utils;

import java.util.Date;

import com.alibaba.fastjson.JSONObject;
import com.jy.modules.common.util.DateUtil;

/**
 * @description: 前海征信接口-工具类
 * @author xujunqi
 * @date: 2015年10月15日 下午2:39:22
 */
public class CommonUtil {
	/**
	 * 报送状态
	 * 1:未报送, 2:已报送
	 */
	public static String[] REPORT_STATE = new String[]{"0","1","2"};
	
	/**
	 * 记录状态
	 * 1:待报送, 2:报送失败, 3:报送成功
	 */
	public static String[] RECORD_STATE = new String[]{"0","1","2","3"};
	
	/**
	 * 任务状态
	 * 1:初始化, 2:确认发送, 9:已完成
	 */
	public static String[] TASK_STATE = new String[]{"0","1","2","3","4","5","6","7","8","9"};
	
	//任务执行结果:成功
	public static String TASK_EXECUTE_SUCC = "S";
	
	//任务执行结果:失败
	public static String TASK_EXECUTE_FAIL = "F";

	/**
	 * 日志对应的业务类型
	 * 1:生成数据, 2:发送报文
	 */
	public static String[] LOG_BIZ_TYPE = new String[]{"0","1","2"};
	
	//单个报文最大记录数
	public static int MSG_MAX_RECORDS_SIZE = 50;
	
	/**
	 * @author xujunqi
	 * @description: 组装前海征信报文-头信息节点
	 * @date 2015年10月15日 下午2:39:37
	 * @return
	 */
	public static String makeupHeader(String transNo) throws Exception {
		String transDate = DateUtil.getDateToStringInfo(new Date());
		JSONObject json = new JSONObject();
		json.put("transNo", transNo);
		json.put("transDate", transDate);
		json.put("authDate", transDate);
		return json.toString();
	}
	
	/**
	 * @author xujunqi
	 * @description: 组装前海征信报文-头信息节点
	 * @date 2015年10月16日 下午4:02:05
	 * @return
	 * @throws Exception
	 */
	public static String makeupHeader() throws Exception {
		return makeupHeader(generateTransNo());
	}
	
	/**
	 * @author xujunqi
	 * @description: 生成请求流水号
	 * @date 2015年10月15日 下午3:57:55
	 * @return
	 */
	public synchronized static String generateTransNo() {
		//return "JYTN" + new StringBuffer().append(new Date().getTime()).append(Math.round(Math.random() * 1000));
		return "JYTN" + new StringBuffer().append(System.nanoTime());
	}
	
	/**
	 * @author xujunqi
	 * @description: 
	 * @date 2015年10月15日 下午4:09:03
	 * @return
	 */
	public synchronized static String generateBatchNo() {
		return "JYBN" + new StringBuffer().append(new Date().getTime()).append(Math.round(Math.random() * 1000));
	}
}
