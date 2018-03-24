--备份原表
create table jbpm4_form_info_20170812 as select * from jbpm4_form_info;

--清理原数据
delete from jbpm4_form_info where pro_def_key='creditAuditKey' or pro_def_key='reconsiderationKey';

--初始化数据
insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '信审专员初审', 'dojbpm/jbpmcreditaudit/prepareExecute/toSubAppInfoV1', '系统选择参与者', null, null, 'com.jy.modules.befloan.jbpm.partner.impl.ObatinIntoPartnerImpl', to_date('12-08-2017 10:39:27', 'dd-mm-yyyy hh24:mi:ss'), '第一次进件自动派单 获取信审专员初审 节点的历史任务处理人', null, '信审主管,信审经理,首席风险执行官', 'isJump', '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '信审主管', 'dojbpm/jbpmcreditaudit/prepareExecute/toSubAppInfoV1', '人工选择参与者', '角色', 'dk_wf_000', 'com.jy.modules.befloan.jbpm.partner.impl.OIPartner100Impl', to_date('12-08-2017 16:01:26', 'dd-mm-yyyy hh24:mi:ss'), '获取信审主管', null, '信审经理,首席风险执行官', 'isJump', '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '稽核审批5', 'dojbpm/jbpmcreditaudit/prepareExecute/toSubAppInfoV1', '系统选择参与者', null, null, 'com.jy.modules.befloan.jbpm.partner.impl.PMObatinCreditPartnerImpl', to_date('12-08-2017 10:43:58', 'dd-mm-yyyy hh24:mi:ss'), null, '信审专员初审,信审主管,信审经理', null, 'isBack', '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '稽核审批7', 'dojbpm/jbpmcreditaudit/prepareExecute/toSubAppInfoV1', '系统选择参与者', null, null, 'com.jy.modules.befloan.jbpm.partner.impl.PMObatinCreditPartnerImpl', to_date('12-08-2017 10:44:31', 'dd-mm-yyyy hh24:mi:ss'), null, '信审专员初审,信审主管,信审经理,首席风险执行官', null, 'isBack', '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '首席风险执行官', 'dojbpm/jbpmcreditaudit/prepareExecute/toSubAppInfoV1', '人工选择参与者', '角色', 'dk_wf_000', 'com.jy.modules.befloan.jbpm.partner.impl.OIPartner300Impl', to_date('12-08-2017 18:45:25', 'dd-mm-yyyy hh24:mi:ss'), '获得首席风险执行官', null, null, null, '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '稽核审批1', 'dojbpm/jbpmcreditaudit/prepareExecute/toSubAppInfoV1', '系统选择参与者', null, null, 'com.jy.modules.befloan.jbpm.partner.impl.PMObatinCreditPartnerImpl', to_date('12-08-2017 10:42:39', 'dd-mm-yyyy hh24:mi:ss'), null, '信审专员初审', null, 'isBack', '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '稽核审批2', 'dojbpm/jbpmcreditaudit/prepareExecute/toSubAppInfoV1', '系统选择参与者', null, null, 'com.jy.modules.befloan.jbpm.partner.impl.PMObatinCreditPartnerImpl', to_date('12-08-2017 10:42:47', 'dd-mm-yyyy hh24:mi:ss'), null, '信审专员初审', null, 'isBack', '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '稽核审批3', 'dojbpm/jbpmcreditaudit/prepareExecute/toSubAppInfoV1', '系统选择参与者', null, null, 'com.jy.modules.befloan.jbpm.partner.impl.PMObatinCreditPartnerImpl', to_date('12-08-2017 10:43:13', 'dd-mm-yyyy hh24:mi:ss'), null, '信审专员初审,信审主管', null, 'isBack', '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '稽核审批4', 'dojbpm/jbpmcreditaudit/prepareExecute/toSubAppInfoV1', '系统选择参与者', null, null, 'com.jy.modules.befloan.jbpm.partner.impl.PMObatinCreditPartnerImpl', to_date('12-08-2017 10:43:27', 'dd-mm-yyyy hh24:mi:ss'), null, '信审专员初审,信审主管', null, 'isBack', '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '信审专员2', 'dojbpm/jbpmcreditaudit/prepareExecute/toInvestigateV1', '系统选择参与者', null, null, 'com.jy.modules.befloan.jbpm.partner.impl.JYObatinCreditPartnerImpl', to_date('12-08-2017 21:17:28', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '信审经理', 'dojbpm/jbpmcreditaudit/prepareExecute/toSubAppInfoV1', '人工选择参与者', '角色', 'dk_wf_000', 'com.jy.modules.befloan.jbpm.partner.impl.OIPartner200Impl', to_date('12-08-2017 18:45:16', 'dd-mm-yyyy hh24:mi:ss'), '获得信审经理', null, null, null, '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '客服补充资料', 'dojbpm/jbpmcreditaudit/prepareExecute/toCustomerServiceV1', '系统选择参与者', '角色', null, 'com.jy.modules.befloan.jbpm.partner.impl.JYObatinHandlePartnerImpl', to_date('12-08-2017 18:45:46', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '客服补充资料_3', 'dojbpm/jbpmcreditaudit/prepareExecute/toCustomerServiceV1', '系统选择参与者', '角色', null, 'com.jy.modules.befloan.jbpm.partner.impl.JYObatinHandlePartnerImpl', to_date('12-08-2017 18:46:20', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '客服补充资料_4', 'dojbpm/jbpmcreditaudit/prepareExecute/toCustomerServiceV1', '系统选择参与者', '角色', null, 'com.jy.modules.befloan.jbpm.partner.impl.JYObatinHandlePartnerImpl', to_date('12-08-2017 18:46:40', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '稽核审批6', 'dojbpm/jbpmcreditaudit/prepareExecute/toSubAppInfoV1', '系统选择参与者', null, null, 'com.jy.modules.befloan.jbpm.partner.impl.PMObatinCreditPartnerImpl', to_date('12-08-2017 10:44:09', 'dd-mm-yyyy hh24:mi:ss'), null, '信审专员初审,信审主管,信审经理', null, 'isBack', '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '客服补充资料_2', 'dojbpm/jbpmcreditaudit/prepareExecute/toCustomerServiceV1', '系统选择参与者', '角色', null, 'com.jy.modules.befloan.jbpm.partner.impl.JYObatinHandlePartnerImpl', to_date('12-08-2017 18:46:01', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '信审专员3', 'dojbpm/jbpmcreditaudit/prepareExecute/toInvestigateV1', '系统选择参与者', '角色', null, 'com.jy.modules.befloan.jbpm.partner.impl.JYObatinCreditPartnerImpl', to_date('12-08-2017 18:47:19', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'creditAuditKey', '信审专员4', 'dojbpm/jbpmcreditaudit/prepareExecute/toInvestigateV1', '系统选择参与者', '角色', null, 'com.jy.modules.befloan.jbpm.partner.impl.JYObatinCreditPartnerImpl', to_date('12-08-2017 18:47:38', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, '1', '1');
