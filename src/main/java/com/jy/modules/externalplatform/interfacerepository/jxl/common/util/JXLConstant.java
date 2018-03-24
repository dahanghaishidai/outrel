package com.jy.modules.externalplatform.interfacerepository.jxl.common.util;


public class JXLConstant {


    /**
     * 采集申请流程类型 process_code
     */
    public static final  String PROCESS_TYPE_CONTROL = "CONTROL";

    public static final  String PROCESS_TYPE_ERROR = "ERROR";
    
    public static final  String PROCESS_CODE = "process_code";
    
    /**
     * 数据有效型  1-有效；0-无效
     */
    public static final  String VALID_STATE = "1";
    
    public static final  String INVALID_STATE = "0";
    
    
    /**
     * 时间参量标识符
     */
    public static final int SECOND = 0;

    public static final int MINUTE = 1;

    public static final int HOUR = 2;
    
    public static final int DAY = 3;
    
    
    /**
     * 聚信立机构账号
     */
    public static final String JXL_ORG_ACCOUNT = "JXL_ORG_ACCOUNT";
    
    
    /**
     * 接口调用是否成功
     */ 
    public static final  String  SUCCESS = "success";
    
    public static final  String   CODE = "code";//错误码
    
    public static final  String  TOKEN = "token";//token
    
    public static final  String  TOKEN_SUCCESS_CODE = "65557";//生成token成功
    
    public static final  String  TRUE = "true";
    
    /**
     * 信息提示 
     */ 
    public static final  String  MESSAGE = "message";
    
    public static final  String  DATA_ACCESS_SUCCESS_TIP = "获取数据成功";
    

    /**
     * 返回报文节点信息 
     */ 
    public static final  String DATA = "data";//主体信息
    
    public static final  String NOTE = "note";//消息提示
    
    public static final  String RAW_DATA = "raw_data";//原始数据
    
    public static final  String MEMBERS = "members";
    
    public static final  String STATUS = "status";//接口调用状态
    
    public static final  String UPDATE_TIME = "update_time";//接口调用时间
    
    public static final  String ERROR_CODE = "error_code";//调用状态码
    
    public static final  String ERROR_MSG = "error_msg";//调用状态说明
    
    public static final  String TRANSACTIONS = "transactions";//交易信息
    
    public static final  String DETAILS = "details";//明细信息
    
    public static final  String BASIC = "basic";//基础信息
    
    public static final  String ADDRESS = "address";//地址信息
    
    public static final  String ITEMS = "items";//细则信息
    
    public static final  String CALLS = "calls";//呼叫信息
    
    public static final  String NETS = "nets";//上网信息
    
    public static final  String SMSES = "smses";//短信信息
    
    public static final  String REPORT_DATA = "report_data";//手机详单（报文数据）
    
    public static final  String REPORT = "report";
    
    public static final  String APP_POINT = "app_point";//申请表数据点
    
    public static final  String CHECK_POINTS = "check_points";//数据检查点
    
    public static final  String KEY_VALUE = "key_value";//申请表数据值
    
    public static final  String FINANCIAL_BLACKLIST = "financial_blacklist";//金融服务类机构黑名单
    
    public static final  String COURT_BLACKLIST = "court_blacklist";//法院黑名单
    
    public static final  String ARISED = "arised";//是否出现
    
    public static final  String BLACK_TYPE = "black_type";//黑名单机构类型
    
    /**
     * 调用状态（1-待调用；2-已完成；3-调用失败；4-终止流程）
     */
    public static final  String INVOKE_WAITING_STATE = "1";

    public static final  String INVOKE_SUCCESS_STATE = "2";
    
    public static final  String INVOKE_FAILED_STATE = "3";
    
    public static final  String INVOKE_STOP_STATE = "4";
    
    /**
     * 贷款类型
     */
    public static final String  HOUSING_LOAN_INFO = "1";//房贷
    
    public static final String  LOAN_INFO = "2";//其他贷款
    
    /**
     * 逾期状态
     */
    public static final String  NO_OVERDUE_STATUS = "1";//未逾期状态
    
    public static final String  OVERDUE_STATUS = "2";//逾期状态
    
    /**
     * 查询记录类型
     */
    public static final String PERSONAL_QUERY_RECORD = "1";// 个人查询记录

    public static final String INSTITUTION_QUERY_RECORD = "2";//机构查询记录
    
    
    /**
     * 请求用户数据成功
     */
    public static final String QUERY_SUCESS_CODE = "31200";
    
    
    /**
     * 聚信立央行征信采集申请接口
     */
    public static final String JXL_CREDIT_APPLY = "jxl_credit_apply";
    
    
    /**
     * 聚信立央行征信采集接口
     */
    public static final String JXL_CREDIT_ACCESS = "jxl_credit_access";
    
    /**
     * 聚信立信息采集有效期设置开关
     */
    public static final String JXL_EFFECTIVE_PERIOD_SWITCH = "jxl_access_effective_switch";
    
    /**
     * 聚信立央行征信报告有效期(天)
     */
    public static final String JXL_CREDIT_REPORT_EFFECTIVE_PERIOD = "jxl_credit_report_effective_period";
    
    
    /**
     * 逗号分隔符
     */ 
    public  static final String COMMA_SEPARATOR = ",";
    
    
    /**
     * 控制开关开启状态
     */ 
    public  static final String YES ="yes";
    
    
    
    
    /**
     * 聚信立信息采集时限控制总开关
     */ 
    public  static final String JXL_TIME_LIMIT_SWITCH ="jxl_time_limit_switch";
    
    
    /**
     * 聚信立失败调用限制次数总开关
     */ 
    public  static final String JXL_LIMIT_TIMES_SWITCH ="jxl_limit_times_switch"; 
    
    
    /**
     * 聚信立失败调用限制次数（次数）
     */ 
    public  static final String JXL_FAIL_INVOKE_LIMIT_TIMES ="jxl_fail_invoke_limit_times";
    
    
    /**
     * 聚信立央行征信采集时限（小时）
     */
    public  static final String JXL_CREDIT_ACCESS_TIME_LIMIT ="jxl_credit_access_time_limit";
    
    /**
     * 聚信立商业保险采集时限（分钟）
     */
    public  static final String JXL_INS_ACCESS_TIME_LIMIT ="jxl_ins_access_time_limit";
   
    
    /**
     * 聚信立互联网资信采集时限（分钟）
     */
    public  static final String JXL_IC_ACCESS_TIME_LIMIT ="jxl_ic_access_time_limit";
    
     
    
    /**
     * 聚信立获取社保省市县地区信息(天)
     */
    public  static final String JXL_ACESS_CITIES_TIME_LIMIT ="jxl_acess_cities_time_limit";
    
    
    /**
     * 聚信立地址联动信息类型  
     */
    public static final String SOCIAL_INSURANCE ="1";//社保
    
    public static final String HOUSE_FUND ="2";//公积金
    
    public static final String JXL_ACESS_SI_CITIES ="jxl_acess_si_cities";//获取社保省市县地区信息接口
    
    public static final String JXL_ACESS_HF_CITIES ="jxl_acess_hf_cities";//获取公积金省市县地区信息接口

    
    /**
     * 聚信立获取社保（公积金）登陆方式及表单接口
     */
    public static final String JXL_ACCESS_SI_LOGIN_FORMS = "jxl_access_si_login_forms";//获取社保登陆方式及表单接口

    public static final String JXL_ACCESS_HF_LOGIN_FORMS = "jxl_access_hf_login_forms";//获取公积金登陆方式及表单接口
    
    public static final String REGION_CODE = "region_code";
    
    
    /**
     * 聚信立提交社保（公积金）采集申请接口
     */
    public static final String JXL_SI_APPLY = "jxl_si_apply";//提交社保采集申请接口

    public static final String JXL_HF_APPLY = "jxl_hf_apply";//提交公积金采集申请接口

    /**
     * 聚信立社保（公积金）数据有效期(天)
     */
    public static final String JXL_SIHF_DATA_EFFECTIVE_PERIOD = "jxl_sihf_data_effective_period";
    
    /**
     * 聚信立获取社保（公积金）原始数据接口
     */
    public static final String JXL_ACCESS_SI_RAW_DATA = "jxl_access_si_raw_data";// 获取社保原始数据接口

    public static final String JXL_ACCESS_HF_RAW_DATA = "jxl_access_hf_raw_data";// 获取公积金原始数据接口

    public static final String JXL_SIHF_ACCESS_TIME_LIMIT = "jxl_sihf_access_time_limit";//聚信立社保(公积金)采集时限(小时)

    
    /**
     * 聚信立互联网资信相关静态变量
     * 
     */
    public static final String  ELECTRONIC_BUSINESS = "1";//电商
    
    public static final String  MOBILE_COMMUNICATIONS_CORPORATION = "2";//移动运营商
    
    public static final String  MOBILE_PHONE_LIST = "3";//手机详单
    
    public static final String  INSURANCE = "4";//保险
    
    public static final String  TAO_BAO = "5";//淘宝
    

    public static final String JXL_ACCESS_EB_DATASOURCES = "jxl_access_eb_datasources";// 聚信立获取电商数据源接口
    
    public static final String JXL_ACCESS_INS_DATASOURCES = "jxl_access_ins_datasources";// 聚信立获取保险数据源接口

    public static final String JXL_ACCESS_DATASOURCES_TIME_LIMIT = "jxl_access_datasources_time_limit";//聚信立获取数据源时限(天)
    
    public static final String JXL_ACCESS_IC_RECEIPT = "jxl_access_ic_receipt";//聚信立获取互联网资信回执信息接口
    
    public static final String JXL_IC_DATASOURCES_APPLY = "jxl_ic_datasources_apply";//提交互联网资信数据源采集请求接口

    public static final String JXL_IC_RESET_PWD_APPLY = "jxl_ic_reset_pwd_apply";//互联网资信提交重置密码请求接口
    
    public static final String JXL_ACCESS_EB_RAW_DATA = "jxl_access_eb_raw_data";// 聚信立获取电商原始数据接口
    
    public static final String JXL_ACCESS_MC_RAW_DATA = "jxl_access_mc_raw_data";// 聚信立获取移动运营商原始数据接口
    
    public static final String JXL_ACCESS_ML_RAW_DATA = "jxl_access_ml_raw_data";// 聚信立获取手机详单(用户报告)数据接口
    
    public static final String JXL_INS_APPLY = "jxl_ins_apply";//聚信立提交商业保险数据采集请求接口
    
    public static final String JXL_ACCESS_INS_RAW_DATA = "jxl_access_ins_raw_data";//聚信立获取商业保险原始数据接口
    
    public static final String JXL_TB_APPLY = "jxl_tb_apply";//聚信立提交淘宝申请接口
    
    public static final String JXL_TB_TWO_BAR_DATA = "jxl_tb_two_bar_data";//聚信立获取淘宝二维码接口
    
    public static final String JXL_TB_TWO_BAR_ECHO = "jxl_tb_two_bar_echo";//聚信立获取淘宝二维码响应接口
    
    public static final String JXL_ACCESS_TB_RAW_DATA = "jxl_access_tb_raw_data";//聚信立获取淘宝原始数据接口
    
    public static final String JXL_JIKE_INVOKE_SWITCH = "jxl_jike_invoke_switch";//聚信立即刻采集调用开关
    
    
    
    /**
    * @title: getJobStateStr
    * @description: 获取定时任务调用的状态
    * @date 2017年9月1日 下午2:55:50
    * @return
    * @throws 
    */ 
    public static String getJobStateStr() {
        StringBuffer  jobState = new  StringBuffer();
        jobState.append(INVOKE_WAITING_STATE).append(",");
        jobState.append(INVOKE_FAILED_STATE);
        return jobState.toString();
    }
    
 }