--1.修改表字段
alter table lb_t_online_audit_result modify (audit_conclusion VARCHAR2(200),AGREE_CODE  VARCHAR2(20),audit_level VARCHAR2(100));

alter table lb_t_online_audit_result add process_id VARCHAR2(50);

alter table LBT_ANTI_INVOKE_LOG modify invoke_type VARCHAR2(10);

alter table lbt_anti_operate_log add decision_result VARCHAR2(20);
comment on column lbt_anti_operate_log.decision_result is '反欺诈结论-决策结果';

alter table LB_T_RECONSIDERATION add if_attach_modify VARCHAR2(2);
comment on column LB_T_RECONSIDERATION.if_attach_modify  is '附件是否变更（Y：变更）';

alter table LB_T_RECONSIDERATION add instinct_inte_wait VARCHAR2(2);
comment on column LB_T_RECONSIDERATION.instinct_inte_wait is 'PM反欺诈人工处理状态（1：等待中、0：已反馈）';


--2.插入系统参数表
insert into sys_config (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_config.nextval, '反欺诈提报等待开关是否开启', 'instinct_wait_switch', 'yes', '1', '1', null);

insert into SYS_CONFIG (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_config.nextval, '质检提报等待开关是否开启', 'qc_instinct_wait_switch', 'yes', '1', '1', null);

insert into sys_config (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_config.nextval, '评分自动批拒贷开关是否开启', 'score_auto_switch', 'no', '1', '1', null);

insert into sys_config (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_config.nextval, 'PM调用开关是否开启', 'pm_call_switch', 'yes', '1', '1', null);

insert into sys_config (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_config.nextval, '复议申请时限(天数)', 'reconsider_time_limit', '5', '1', '1', null);

insert into sys_config (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_config.nextval, '复议三方接口时限(天数)', 'reconsider_three_data_limit', '5', '1', '1', null);

insert into sys_config (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_config.nextval, '三方接口配置信息接口10001', 'third_data_config_query_10001', 'http://172.19.100.232:8080/loan/api/externalplatform/queryInterfaceNoRest/extQueryInterfaceNo/v1', '1', '1', null);

insert into sys_config (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_config.nextval, '三方接口数据查询（外联平台）', 'third_data_interface_query_10002', 'http://172.19.100.232:8080/loan/api/externalplatform/interfaceRest/extInterface/v1', '1', '1', null);

insert into sys_config (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_config.nextval, '外联平台查询10000', 'third_data_interface_query_10000', 'http://172.19.100.232:8080/loan/api/externalplatform/extFuncPointRuleHitDetail/queryHitDetail/v1', '1', '1', null);

insert into Sys_Config (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_config.nextval, '配置表模块类型三方接口指标模型', 'third_data_module_type_1', 'thirdIndexModule', '1', '1', null);

insert into sys_config (id, config_name, config_code, config_value, config_type, validate_state, version)
values(seq_SYS_CONFIG.nextval, '配置表模块类型决策数据', 'decision_module_type_1', 'decisionModule', '1', '1', null);

insert into sys_config (id, config_name, config_code, config_value, config_type, validate_state, version)
values(seq_SYS_CONFIG.nextval, '配置表模块类型基础数据', 'decision_module_type_2', 'basemodule', '1', '1', null);

insert into sys_config (id, config_name, config_code, config_value, config_type, validate_state, version)
values(seq_SYS_CONFIG.nextval, '决策系统接口6001', 'loan_decision_interface_6001', 'http://172.19.101.246/GBG.DecTech.JYUCN.PM.WebApi/api/ProcessManager', '1', '1', null);

insert into sys_config (id, config_name, config_code, config_value, config_type, validate_state, version)
values(seq_SYS_CONFIG.nextval, '决策系统接口6004', 'loan_decision_interface_6004', 'http://172.19.101.246/GBG.DecTech.JYUCN.PM.WebApi/api/PMReferenceTable', '1', '1', null);

insert into sys_config (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_config.nextval, '派件分单开关（原规则）', 'into_distribute_switch', 'no', '1', '1', null);

insert into sys_config (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_config.nextval, '进件规则开关', 'intoCheck_switch', 'yes', '1', '1', null);

insert into sys_config (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION) 
values (seq_sys_config.nextval, '进件客户年龄', 'checkAge', '20-60', '1', '1', null);

insert into sys_config (ID, CONFIG_NAME, CONFIG_CODE, CONFIG_VALUE, CONFIG_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_config.nextval, '有效产品查询（不分页）v2', 'productquery_url_v2', 'http://172.18.100.53:8080/masterdata/api/product/search/v2', '1', '1', null);


--6.修改表注解
comment on column LBT_ANTI_INVOKE_LOG.invoke_type is '1-一次调用   2-二次调用';

comment on column LB_T_INTO_INFO.ext2 is '转信审标志 1-转信审';

--拒绝进件门店
insert into sys_dict (ID, DICT_CODE, DICT_NAME, DICT_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_dict.nextval, 'DQ_INTOSAVE_NOTPERMIT_ORG', '拒绝进件门店', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '台州营业一部', '301000403', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '营口营业一部', '301000904', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '泰州营业一部', '301000207', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '宁波营业一部', '301000405', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '绍兴营业一部', '301000408', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '无锡营业一部', '301000504', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '威海营业一部', '301000804', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '潍坊营业一部', '301000808', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '重庆营业一部', '301001309', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '广州营业一部', '301001404', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '福州营业一部', '301001806', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '邯郸营业一部', '301002008', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '石家庄营业一部', '301002002', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_INTOSAVE_NOTPERMIT_ORG'), '淄博营业一部', '301000807', '2', '0', null);


--7.初始化数据字典项
insert into sys_dict (ID, DICT_CODE, DICT_NAME, DICT_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_dict.nextval, 'repeat_label', '决策报文重复label', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), 'Instinct触发规则', 'INS01_Rule_Triggered', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), 'Instinct触发规则详情', 'INS01_Description_Rule_Triggered', '2', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), 'Insinct来源库', 'INS01_Origination_Database', '3', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), 'Instinct匹配到的申请', 'INS01_Matched_AppKeys', '4', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '一次评分详情变量名', 'SCORE01_Character_Name', '5', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '一次评分详情变量得分', 'SCORE01_Character_Score', '6', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '二次Instinct触发规则', 'INS02_Rule_Triggered', '7', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '二次Instinct触发规则详情', 'INS02_Description_Rule_Triggered', '8', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '二次Insinct来源库', 'INS02_Origination_Database', '9', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '二次Instinct匹配到的申请', 'INS02_Matched_AppKeys', '10', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '二次评分详情变量名', 'SCORE02_Character_Name', '11', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '二次评分详情变量值', 'SCORE02_Character_Value', '12', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '二次评分详情变量得分', 'SCORE02_Character_Score', '13', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '一次评分详情变量值', 'SCORE01_Character_Value', '14', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '二次评分详情变量名', 'SCORE03_Character_Name', '15', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '三次评分详情变量值', 'SCORE03_Character_Value', '16', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '三次评分详情变量得分', 'SCORE03_Character_Score', '17', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '三次Instinct触发规则', 'INS03_Rule_Triggered', '18', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '三次Instinct触发规则详情', 'INS03_Description_Rule_Triggered', '19', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '三次Insinct来源库', 'INS03_Origination_Database', '20', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '三次Instinct匹配到的申请', 'INS03_Matched_AppKeys', '21', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '三次Instinct日志日期', 'INS03_Diary_Date', '22', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '三次Instinct日志时间', 'INS03_Diary_Time', '23', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '三次Instinct日志用户', 'INS03_Diary_User_Id', '24', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '三次Instinct日志内容', 'INS03_Diary_Note', '25', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '一次Instinct日志日期', 'INS01_Diary_Date', '26', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '一次Instinct日志时间', 'INS01_Diary_Time', '27', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '一次Instinct日志用户', 'INS01_Diary_User_Id', '28', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '一次Instinct日志内容', 'INS01_Diary_Note', '29', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '二次Instinct日志日期', 'INS03_Diary_Date', '30', '0', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '二次Instinct日志日期', 'INS02_Diary_Date', '31', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '二次Instinct日志时间', 'INS02_Diary_Time', '32', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '二次Instinct日志用户', 'INS02_Diary_User_Id', '33', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='repeat_label'), '二次Instinct日志内容', 'INS02_Diary_Note', '34', '1', null);



insert into sys_dict (ID, DICT_CODE, DICT_NAME, DICT_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_dict.nextval, 'DQ_DECISIONFRAUD_COLUMN_TYPE', '决策模块类型', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_DECISIONFRAUD_COLUMN_TYPE'), '决策类型', 'decisionModule', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_DECISIONFRAUD_COLUMN_TYPE'), '基础数据', 'basemodule', '2', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_DECISIONFRAUD_COLUMN_TYPE'), '三方接口指标模型', 'thirdIndexModule', '3', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code='DQ_DECISIONFRAUD_COLUMN_TYPE'), '进件规则指标模型', 'intoInfoModule', '4', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict.nextval, (select id from sys_dict where dict_code = 'DQ_AUDITSTATE'), '评分拒绝', '2700', '26', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict.nextval, (select id from sys_dict where dict_code = 'DQ_AUDITSTATE'), '审核结束-评分拒绝', '3370', '27', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict.nextval, (select id from sys_dict where dict_code = 'DQ_AUDITSTATE'), '审核结束-反欺诈拒绝', '3360', '25', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict.nextval, (select id from sys_dict where dict_code = 'DQ_AUDITSTATE'), '审核中-稽核审批', '2800', '28', '1', null);


insert into sys_dict (ID, DICT_CODE, DICT_NAME, DICT_TYPE, VALIDATE_STATE, VERSION)
values (seq_sys_dict.nextval, 'DQ_PRESENT_REASON', '反欺诈提报原因', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code ='DQ_PRESENT_REASON'), '疑非在职', 'F001', '1', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code ='DQ_PRESENT_REASON'), '疑公司不存在', 'F002', '2', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code ='DQ_PRESENT_REASON'), '疑个人伪冒', 'F003', '3', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code ='DQ_PRESENT_REASON'), '疑高风险个人', 'F004', '4', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code ='DQ_PRESENT_REASON'), '疑公司伪冒', 'F005', '5', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code ='DQ_PRESENT_REASON'), '疑高风险公司', 'F006', '6', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code ='DQ_PRESENT_REASON'), '疑代办公司进件', 'F007', '7', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code ='DQ_PRESENT_REASON'), '疑附件资料虚假', 'F008', '8', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code ='DQ_PRESENT_REASON'), '疑文件伪造', 'F009', '9', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code ='DQ_PRESENT_REASON'), '公安/其他渠道获取不良记录', 'F010', '10', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code ='DQ_PRESENT_REASON'), '有风险客户经理', 'F011', '11', '1', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code ='DQ_PRESENT_REASON'), '有风险客户经理', 'F011', '12', '0', null);

insert into sys_dict_detail (ID, DICT_ID, DICT_DETAIL_NAME, DICT_DETAIL_VALUE, ORDER_BY, VALIDATE_STATE, VERSION)
values (seq_sys_dict_detail.nextval, (select id from sys_dict a where a.dict_code ='DQ_PRESENT_REASON'), '贷后排查高风险公司/借款人', 'F012', '12', '1', null);


--8.资源

--资源
insert into sys_resource (ID, RESOURE_NAME, RESOURE_TYPE, RESOURE_URL, PERMISSION, PARENT_ID, PARENT_IDS, APP_ID, VALIDATE_STATE, VERSION)
values (seq_sys_resource.nextval, '决策管理', 'module', '', '', (select id from sys_resource where resoure_name =  '信审管理'), '', null, '1', 1);

insert into sys_resource (ID, RESOURE_NAME, RESOURE_TYPE, RESOURE_URL, PERMISSION, PARENT_ID, PARENT_IDS, APP_ID, VALIDATE_STATE, VERSION)
values (seq_sys_resource.nextval, '模块类型管理', 'url', '/lbtDecisionModuleType/prepareExecute/toQueryPage', '', (select id from sys_resource where resoure_name =  '决策管理'), '', null, '1', 2);

insert into sys_resource (ID, RESOURE_NAME, RESOURE_TYPE, RESOURE_URL, PERMISSION, PARENT_ID, PARENT_IDS, APP_ID, VALIDATE_STATE, VERSION)
values (seq_sys_resource.nextval, '业务查询管理', 'url', '/lbtDecisionSqlConf/prepareExecute/toQueryPage', '', (select id from sys_resource where resoure_name =  '决策管理'), '', null, '1', 2);

insert into sys_resource (ID, RESOURE_NAME, RESOURE_TYPE, RESOURE_URL, PERMISSION, PARENT_ID, PARENT_IDS, APP_ID, VALIDATE_STATE, VERSION)
values (seq_sys_resource.nextval, '批贷建议新增', 'button', null, 'befloan/creditaudit/lbtupreportcomment/queryLbTUpReportComment:add', (select id from sys_resource where resoure_name = '监控流程'), (select parent_ids || '/' || id from sys_resource where resoure_name = '监控流程'), null, '1', 1);

insert into sys_resource (ID, RESOURE_NAME, RESOURE_TYPE, RESOURE_URL, PERMISSION, PARENT_ID, PARENT_IDS, APP_ID, VALIDATE_STATE, VERSION)
values (seq_sys_resource.nextval, '稽核代码参数配置', 'url', '/lbTAudRefuseLoanConf/prepareExecute/toQueryPage', null, (select parent_id from sys_resource where resoure_name = '拒贷参数配置'), (select parent_ids from sys_resource where resoure_name = '拒贷参数配置'), null, '1', 1);

insert into sys_resource (ID, RESOURE_NAME, RESOURE_TYPE, RESOURE_URL, PERMISSION, PARENT_ID, PARENT_IDS, APP_ID, VALIDATE_STATE, VERSION)
values (seq_sys_resource.nextval, '反欺诈提报记录查询', 'url', '/lbtAntiToHuman/prepareExecute/toQueryPage', null, (select id from sys_resource where resoure_name = '进件管理'), (select parent_ids || '/' || id from sys_resource where resoure_name = '进件管理'), null, '1', 1);

insert into sys_resource (ID, RESOURE_NAME, RESOURE_TYPE, RESOURE_URL, PERMISSION, PARENT_ID, PARENT_IDS, APP_ID, VALIDATE_STATE, VERSION)
values (seq_sys_resource.nextval, '批贷权限额度配置', 'url', 'approvalQuot/prepareExecute/toQueryPage', null, (select id from sys_resource where resoure_name = '业务权限管理'), (select parent_ids|| '/' || id from sys_resource where resoure_name = '业务权限管理'), null, '1', 1);

insert into sys_resource (ID, RESOURE_NAME, RESOURE_TYPE, RESOURE_URL, PERMISSION, PARENT_ID, PARENT_IDS, APP_ID, VALIDATE_STATE, VERSION)
values (seq_sys_resource.nextval, '业务处理监控', 'url', 'handelMonitor/prepareExecute/serviceHandelMonitor', null, (select id from sys_resource where RESOURE_NAME='进件管理'), (select parent_ids|| '/' || id from sys_resource where resoure_name = '进件管理'),  null,'1', 1);

insert into sys_resource (ID, RESOURE_NAME, RESOURE_TYPE, RESOURE_URL, PERMISSION, PARENT_ID, PARENT_IDS, APP_ID, VALIDATE_STATE, VERSION)
values (seq_sys_resource.nextval, '审批业务监控', 'url', 'approveBusiness/prepareExecute/toQueryPage', null, (select id from sys_resource where RESOURE_NAME='业务处理监控'), (select parent_ids|| '/' || id from sys_resource where resoure_name = '业务处理监控'), null, '1', 1);

insert into sys_resource (ID, RESOURE_NAME, RESOURE_TYPE, RESOURE_URL, PERMISSION, PARENT_ID, PARENT_IDS, APP_ID, VALIDATE_STATE, VERSION)
values (seq_sys_resource.nextval, '签约处理监控', 'url', 'handelMonitor/prepareExecute/serviceHandelMonitor', null, (select id from sys_resource where RESOURE_NAME='业务处理监控'), (select parent_ids|| '/' || id from sys_resource where resoure_name = '业务处理监控'), null, '1', 1);

insert into sys_resource (ID, RESOURE_NAME, RESOURE_TYPE, RESOURE_URL, PERMISSION, PARENT_ID, PARENT_IDS, APP_ID, VALIDATE_STATE, VERSION)
values (seq_sys_resource.nextval, '待处理件人工分配', 'url', 'handTask/prepareExecute/toQueryPage', null, (select id from sys_resource where RESOURE_NAME='业务处理监控'), (select parent_ids|| '/' || id from sys_resource where resoure_name = '业务处理监控'), null, '1', 1);

--菜单
insert into sys_menu (ID, MENU_CODE, MENU_NAME, MENU_ICON, MENU_URL, PARENT_ID, ORDER_BY, VALIDATE_STATE, APP_ID, VERSION, RESOURCE_ID)
values (seq_sys_menu.nextval, 'jcgl', '决策管理', 'jcgl', '', (select id from sys_menu where menu_name =  '信审管理'), '11', '1', 0, null, (select id from sys_resource where resoure_name =  '决策管理'));

insert into sys_menu (ID, MENU_CODE, MENU_NAME, MENU_ICON, MENU_URL, PARENT_ID, ORDER_BY, VALIDATE_STATE, APP_ID, VERSION, RESOURCE_ID)
values (seq_sys_menu.nextval, 'jcgl01', '模型类型管理', 'jcgl01', '', (select id from sys_menu where menu_name =  '决策管理'), '1', '1', 0, null, (select id from sys_resource where resoure_name =  '模块类型管理' and RESOURE_URL='/lbtDecisionModuleType/prepareExecute/toQueryPage'));

insert into sys_menu (ID, MENU_CODE, MENU_NAME, MENU_ICON, MENU_URL, PARENT_ID, ORDER_BY, VALIDATE_STATE, APP_ID, VERSION, RESOURCE_ID)
values (seq_sys_menu.nextval, 'jcgl02', '业务查询管理', 'jcgl02', '', (select id from sys_menu where menu_name =  '决策管理'), '2', '1', 0, null, (select id from sys_resource where resoure_name =  '业务查询管理' and RESOURE_URL='/lbtDecisionSqlConf/prepareExecute/toQueryPage'));


insert into sys_menu (ID, MENU_CODE, MENU_NAME, MENU_ICON, MENU_URL, PARENT_ID, ORDER_BY, VALIDATE_STATE, APP_ID, VERSION, RESOURCE_ID)
values (seq_sys_menu.nextval, 'jdcspzjh', '稽核代码参数配置', 'jdcspzjh', null, (select id from sys_menu where menu_name =  '系统管理'), (select order_by + 1 from sys_menu where menu_name =  '稽核代码参数配置'), '1', null, 0, (select id from sys_resource where resoure_name =  '拒贷参数配置(稽核)'));

insert into sys_menu (ID, MENU_CODE, MENU_NAME, MENU_ICON, MENU_URL, PARENT_ID, ORDER_BY, VALIDATE_STATE, APP_ID, VERSION, RESOURCE_ID)
values (seq_sys_menu.nextval, 'jjtbjlcx', '反欺诈提报记录查询', 'jjtbjlcx', null, (select id from sys_menu where menu_name =  '进件管理'), (select order_by + 1 from sys_menu where menu_name =  '进件冻结记录查询'), '1', null, 0, (select id from sys_resource where resoure_name =  '反欺诈提报记录查询'));

insert into sys_menu (ID, MENU_CODE, MENU_NAME, MENU_ICON, MENU_URL, PARENT_ID, ORDER_BY, VALIDATE_STATE, APP_ID, VERSION, RESOURCE_ID)
values (seq_sys_menu.nextval, '230100', '批贷权限额度配置', '1', null, (select id from sys_menu t where t.menu_name='系统管理'), (select ORDER_BY + 100 from sys_menu t where t.menu_name='系统管理'), '1', null, 1, (select id from sys_resource where resoure_name =  '批贷权限额度配置'));

insert into sys_menu (ID, MENU_CODE, MENU_NAME, MENU_ICON, MENU_URL, PARENT_ID, ORDER_BY, VALIDATE_STATE, APP_ID, VERSION, RESOURCE_ID)
values (seq_sys_menu.nextval, '1101568', '业务处理监控', '1', null, (select id from sys_menu t where t.menu_name='进件管理'), (select t.ORDER_BY + 200 from sys_menu t where t.menu_name='进件管理'), '1', null, 1, (select id from sys_resource where resoure_name =  '业务处理监控'));

insert into sys_menu (ID, MENU_CODE, MENU_NAME, MENU_ICON, MENU_URL, PARENT_ID, ORDER_BY, VALIDATE_STATE, APP_ID, VERSION, RESOURCE_ID)
values (seq_sys_menu.nextval, '110156810', '审批业务监控', '1', null, (select id from sys_menu t where t.menu_name='业务处理监控'), (select t.ORDER_BY + 210 from sys_menu t where t.menu_name='业务处理监控'), '1', null, 1, (select id from sys_resource where resoure_name =  '审批业务监控'));

insert into sys_menu (ID, MENU_CODE, MENU_NAME, MENU_ICON, MENU_URL, PARENT_ID, ORDER_BY, VALIDATE_STATE, APP_ID, VERSION, RESOURCE_ID)
values (seq_sys_menu.nextval, '110156820', '签约处理监控', '1', null, (select id from sys_menu t where t.menu_name='业务处理监控'), (select t.ORDER_BY + 220 from sys_menu t where t.menu_name='业务处理监控'), '1', null, 1, (select id from sys_resource where resoure_name =  '签约处理监控'));

insert into sys_menu (ID, MENU_CODE, MENU_NAME, MENU_ICON, MENU_URL, PARENT_ID, ORDER_BY, VALIDATE_STATE, APP_ID, VERSION, RESOURCE_ID)
values (seq_sys_menu.nextval, '110166820', '待处理件人工分配', '1', null, (select id from sys_menu t where t.menu_name='业务处理监控'), (select t.ORDER_BY + 230 from sys_menu t where t.menu_name='业务处理监控'), '1', null, 1, (select id from sys_resource where resoure_name =  '待处理件人工分配'));



---9.初始化批贷额度配置角色表 
INSERT
INTO
    lb_t_approval_quota_role_conif x1
    (
        x1.id,
        x1.role_id,
        x1.role_name,
        x1.operate_id,
        x1.operate_name,
        x1.appr_product_code,
        x1.appr_product_name,
        x1.approval_flag,
        x1.refuse_flag,
        x1.accredit_amount,
        x1.validate_state,
        x1.create_time,
        x1.operate_flow_key
    )
SELECT
    SEQ_LB_T_APAL_QTA_RLE_CFG.nextval,
    role_code,
    role_name,
    user_id,
    user_name,
    product_code,
    product_name,
    1,1,
    max_credit_audit_amount,
    1,
    SYSDATE,
    'creditAuditKey' AS operate_flow_key
FROM
    (
        SELECT
            role_code,
            role_name,
            MAX(user_id)                 AS user_id,
            MAX(user_name)               AS user_name,
            MAX(product_code)            AS product_code,
            MAX(product_name)            AS product_name,
            MAX(max_credit_audit_amount) AS max_credit_audit_amount
        FROM
            (
                SELECT
                    MIN(t1.max_credit_audit_amount) AS max_credit_audit_amount ,
                    ''                              AS user_id,
                    ''                              AS user_name,
                    ''                              AS product_code,
                    ''                              AS product_name,
                    t6.id                           AS role_code,
                    t6.role_name
                FROM
                    lb_t_audit_max_amount_conf t1
                INNER JOIN
                    sys_user t2
                ON
                    t1.fk_user_id = t2.user_no
                INNER JOIN
                    sys_role_user t3
                ON
                    t3.target_id=t2.id
                AND t3.VALIDATE_STATE='1'
                INNER JOIN
                    sys_role t6
                ON
                    t6.id=t3.role_id
                AND t6.VALIDATE_STATE='1'
                AND t6.role_type=2
                GROUP BY
                    t6.id,
                    t6.role_name
                UNION ALL
                SELECT
                    0                                                   AS max_credit_audit_amount ,
                    TO_CHAR(wmsys.wm_concat(DISTINCT(t2.id)))           AS user_id,
                    TO_CHAR(wmsys.wm_concat(DISTINCT(t2.user_name)))    AS user_name,
                    TO_CHAR(wmsys.wm_concat(DISTINCT(t7.product_code))) AS product_code,
                    TO_CHAR(wmsys.wm_concat(DISTINCT(t7.product_name))) AS product_name,
                    t6.id                                               AS role_code,
                    t6.role_name
                FROM
                    lb_t_audit_max_amount_conf t1
                INNER JOIN
                    sys_user t2
                ON
                    t1.fk_user_id = t2.user_no
                INNER JOIN
                    sys_role_user t3
                ON
                    t3.target_id=t2.id
                AND t3.VALIDATE_STATE='1'
                INNER JOIN
                    sys_role t6
                ON
                    t6.id=t3.role_id
                AND t6.VALIDATE_STATE='1'
                AND t6.role_type=2
                INNER JOIN
                    lb_t_product_conf t7
                ON
                    t1.fk_pro_conf_id=t7.product_code
                GROUP BY
                    t6.id,
                    t6.role_name ) a
        GROUP BY
            role_code,
            role_name);


--10.初始化批贷额度产品人员额度配置
INSERT
INTO
    LB_T_APPROVAL_QUOTA_OPER_CONIF
    (
        ID,
        OPERATE_ID,
        OPERATE_NAME,
        APPR_PRODUCT_CODE,
        APPR_PRODUCT_NAME,
        FK_APPROVAL_QUOTA_ROL_COF_ID,
        ACCREDIT_AMOUNT,
        APPROVAL_FLAG,
        REFUSE_FLAG,
        CREATE_TIME,
        VALIDATE_STATE,
        OPERATE_FLOW_KEY
    )
SELECT
    SEQ_LB_T_APAL_QTA_OPER_CFG.nextval,
    user_no,
    user_name,
    product_code,
    product_name,
    id,
    max_credit_audit_amount,
    1,
    1,
    SYSDATE,
    1,
    'creditAuditKey'
FROM
    (
        SELECT
            t2.user_no ,
            t2.user_name,
            t7.product_code,
            t7.product_name,
            t8.id,
            t1.max_credit_audit_amount
        FROM
            lb_t_audit_max_amount_conf t1
        INNER JOIN
            sys_user t2
        ON
            t1.fk_user_id = t2.user_no
        INNER JOIN
            sys_role_user t3
        ON
            t3.target_id=t2.id
        AND t3.VALIDATE_STATE='1'
        INNER JOIN
            sys_role t6
        ON
            t6.id=t3.role_id
        AND t6.VALIDATE_STATE='1'
        AND t6.role_type=2
        INNER JOIN
            lb_t_product_conf t7
        ON
            t1.fk_pro_conf_id=t7.product_code
        INNER JOIN
            LB_T_APPROVAL_QUOTA_ROLE_CONIF t8
        ON
            t8.role_id=t6.id
        ORDER BY
            t8.id);




--5.修改表数据(无modify_time字段，需要在PL/SQL上执行)
update sys_dict_detail set validate_state='0' where dict_detail_name='线上稽核审批' and dict_detail_value='1002';

update sys_config set config_name = '流程时效超时后自动执行' where config_code = 'flow_overtime_stopprocess';

--修改月还款/月租金验证
  update lb_t_need_required t
   set t.check_chinese_name = '月还款/月租金',
       t.check_other        = 'function(){
  var dtohomeType = $("#dtohomeType").val();
  var dtohMonPayment = $("#dtohMonPayment").val();
  if("2,3,4".indexOf(dtohomeType) > -1 && dtohMonPayment <= 0) {
    return "月还款/月租金不能为空!";
  }else{
    $("#dtohMonPayment").removeClass("nullError");
  }
  var regExp = /^([1-9]\d{2,})(\.?\d{0,2})?$/;

  if(dtohMonPayment!="" && !regExp.test(dtohMonPayment )) {
    return "请输入大于100的金额, 最多保留2位小数!";
  }
  return "";
}'
 where t.Check_Name = 'dtohMonPayment'
   and t.check_type = '500';
   
--修改月还款/月租金验证   
  update lb_t_need_required t
   set t.check_chinese_name = '住宅类型',
       t.check_other        = 'function(obj){
  var dtohomeType =$(obj).val();
  var linkObj=$("#dtohMonPayment");
  var dtohMonPayment = linkObj.val();
  if("2,3,4".indexOf(dtohomeType) > -1) {
    linkObj.removeAttr("disabled");
    if(dtohMonPayment <= 0) {
      setNullCss(linkObj,"月还款/月租金不能为空!");
    }
  }else{
    removeNullCss(linkObj);
    linkObj.attr("disabled","true");
    linkObj.val("");
    $("#dtohMonPayment").removeClass("checkError");
  }

   return "";
}'
 where t.Check_Name = 'dtohomeType'
   and t.check_type = '500';