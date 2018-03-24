package com.jy.modules.externalplatform.interfacerepository.suanhuazx.utils;


/**
*  针对算话人行个人信用报告提供相应结构变量
*/ 
public abstract class SuanhuaConstant {


	public static final  String SUCCESS = "success";
	
	public static final  String ERRORS = "errors";
	
	public static final  String REPORT = "report";
	
	public static final  String ERROR_DESC ="errorDesc";
	
	public static final  String REPORT_RISK = "report_risk";
	
	public static final  String REPORT_STRUCTURE = "report_structure";
	
    public static final  String REPORT_EXTEND = "report_extend";
    
    public static final  String REPORTINFO = "reportinfo";
    
    public static final  String PERSONALINFO = "personalinfo";
    
    public static final  String CREDIT_RECORD = "creditRecord";
    
    public static final  String PUBLIC_RECORD = "publicRecord";
    
    public static final  String QUERY_RECORD = "queryRecord";
    
    public static final  String INTRO = "intro";
    
    public static final  String DETAIL = "detail";
    
    public static final  String SUMMARY = "summary";
    
    /**
     * 逾期状态
     */
    public static final String  NO_OVERDUE_STATUS = "0";//未逾期状态
    
    public static final String  OVERDUE_STATUS = "1";//逾期状态
    
    public static final String  NO_OVERDUE_DETAILS = "noOverdueDetails";//未逾期状态
    
    public static final String  OVERDUE_DETAILS = "overdueDetails";//逾期详情
    
    /**
     * 公共记录
     */
	public static final String TAX = "tax";// 欠税记录
	
	public static final String JUDGMENT = "judgment";// 民事判决记录
	
	public static final String ENFORCEMENT = "enforcement";// 强制执行记录
	
	public static final String PUNISHMENT = "punishment";// 行政处罚记录
	
	public static final String TELECOM = "telecom";// 电信欠费信息
	
	
    public static final String ORGANIZATION = "organization";//机构
	
	public static final String INDIVIDUAL = "individual";//个人
	
	public static final String ORGANIZATION_QUERY = "1";//机构查询
	
	public static final String INDIVIDUAL_QUERY = "2";//个人查询
	
	
	/**
     * 机构化报告
     */
    public static final String BASIC = "basic";//基础信息
    
    public static final String GENERAL = "general";//汇总信息
    
    public static final String ASSETS = "assets";//资产处置信息列表
    
    public static final String COMPENSATES = "compensates";//保证人代偿信息列表
    
    public static final String GUARANTEES = "guarantees";//为他人担保信息列表
    
    public static final String CREDITS = "credits";//信用卡列表
    
    public static final String LOANS = "loans";//贷款列表
    
    public static final String TAXS = "taxs";//欠税记录列表
    
    public static final String JUDGMENTS = "judgments";//民事判决记录列表
    
    public static final String ENFORCEMENTS = "enforcements";//强制执行记录表
    
    public static final String PUNISHMENTS = "punishments";//行政处罚记录表
    
    public static final String TELECOMS = "telecoms";//电信欠费信息表
    
    public static final String TRACES = "traces";//查询记录表
    
    public static final String TRUE = "true";
    
    public static final String PROCESS_SUCCESS_CODE = "00";//流程成功返回码
    
    /**
     * 调用状态（1-待调用；2-已完成；3-调用失败；4-终止流程）
     */
    public static final  String INVOKE_WAITING_STATE = "1";

    public static final  String INVOKE_SUCCESS_STATE = "2";
    
    public static final  String INVOKE_FAILED_STATE = "3";
    
    public static final  String INVOKE_STOP_STATE = "4";
    
    
    /**
     * 算话信息采集时限控制总开关
     */ 
    public  static final String SH_TIME_LIMIT_SWITCH ="sh_time_limit_switch";
    
    
    /**
     * 算话失败调用限制次数总开关
     */ 
    public  static final String SH_LIMIT_TIMES_SWITCH ="sh_limit_times_switch"; 
    
    
    /**
     * 算话失败调用限制次数（次数）
     */ 
    public  static final String SH_FAIL_INVOKE_LIMIT_TIMES ="sh_fail_invoke_limit_times";
    

    /**
     * 算话央行征信采集时限（分钟）
     */
    public static final String SH_CREDIT_ACCESS_TIME_LIMIT = "sh_credit_access_time_limit";
    
    /**
     * 时间参量标识符
     */
    public static final int SECOND = 0;

    public static final int MINUTE = 1;

    public static final int HOUR = 2;
    
    public static final int DAY = 3;
    
    /**
     * 控制开关开启状态
     */ 
    public  static final String YES ="yes";
    
    
    
    
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
