
--初始化数据
insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'reconsiderationKey', '客服发起', 'dojbpm/jbpmReconsideration/prepareExecute/customerServiceV1', '系统选择参与者', null, null, '1', to_date('12-08-2017 18:32:44', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'reconsiderationKey', '复议专员审核', 'dojbpm/jbpmReconsideration/prepareExecute/toSupplementV1', '系统选择参与者', null, null, '1', to_date('12-08-2017 16:06:17', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, '1', '1');

insert into jbpm4_form_info (ID, PRO_DEF_KEY, PRO_ACTIVITY_NAME, PRO_ACTIVITY_FORM, PARTICIPATOR_TYPE, PART_TYPE, OTHER_PARAMS, RULE_INFO, CREATE_TIME, REMARK, EXT1, EXT2, EXT3, PRO_LEVEL, VALIDATE_STATE)
values (seq_jbpm4_form_info.nextval, 'reconsiderationKey', '复议主管审批', 'dojbpm/jbpmReconsideration/prepareExecute/toSupplementV1', '人工选择参与者', '角色', 'dk_wf_000', 'com.jy.modules.befloan.jbpm.partner.impl.ORPartner200Impl', to_date('12-08-2017 15:26:19', 'dd-mm-yyyy hh24:mi:ss'), null, null, null, null, '1', '1');
