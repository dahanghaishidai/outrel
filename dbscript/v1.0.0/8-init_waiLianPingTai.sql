truncate table ext_sys_management;

insert into ext_sys_management (ID, SYS_CODE, SYS_NAME, VALIDATE_STATE, CREATE_BY, CREATE_TIME, MODIFY_BY, MODIFY_TIME)
values (seq_ext_sys_management.nextval, 'loan', '贷款系统', '1', 1, sysdate, null, null);

commit;


truncate table ext_function_type;

insert into ext_function_type (ID, FUNC_TYPE, FUNC_TYPE_CODE, FUNC_TYPE_NAME, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, TYPE_LEVEL, SYS_CODE, CREATE_BY, CREATE_TIME, MODIFY_BY, MODIFY_TIME)
values (seq_ext_function_type.nextval, 'ROOT', 'intoCheckModule', '进件管理', 0, '1', 1, 1, 'loan', null, null, null, null);
commit;

insert into ext_function_type (ID, FUNC_TYPE, FUNC_TYPE_CODE, FUNC_TYPE_NAME, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, TYPE_LEVEL, SYS_CODE, CREATE_BY, CREATE_TIME, MODIFY_BY, MODIFY_TIME)
values (seq_ext_function_type.nextval, 'intoCheckModule', 'intoQcSubmit', '进件交叉质检提交', (select id from ext_function_type where FUNC_TYPE_CODE = 'intoCheckModule'), '1', 1, 2, 'loan', 1, sysdate, null, null);

insert into ext_function_type (ID, FUNC_TYPE, FUNC_TYPE_CODE, FUNC_TYPE_NAME, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, TYPE_LEVEL, SYS_CODE, CREATE_BY, CREATE_TIME, MODIFY_BY, MODIFY_TIME)
values (seq_ext_function_type.nextval, 'intoCheckModule', 'cusReconsiderSubmit', '客户复议提交', (select id from ext_function_type where FUNC_TYPE_CODE = 'intoCheckModule'), '1', 2, 2, 'loan', 1, sysdate, null, null);

insert into ext_function_type (ID, FUNC_TYPE, FUNC_TYPE_CODE, FUNC_TYPE_NAME, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, TYPE_LEVEL, SYS_CODE, CREATE_BY, CREATE_TIME, MODIFY_BY, MODIFY_TIME)
values (seq_ext_function_type.nextval, 'intoCheckModule', 'intoInitCheck', '进件硬规则', (select id from ext_function_type where FUNC_TYPE_CODE = 'intoCheckModule'), '1', 3, 2, 'loan', 1,sysdate, null, null);


commit;




truncate table ext_function_interface_ref;

insert into ext_function_interface_ref (ID, FUNC_TYPE_CODE, INTERFACE_NO, VALIDATE_STATE, CREATE_TIME, CREATE_BY, MODIFY_TIME, MODIFY_BY, PRIORITY, RULE_GROUP_CODE, CONF_TYPE)
values (seq_ext_function_interface_ref.nextval, 'cusReconsiderSubmit', 'HFW01_7001_01', '1', sysdate, null,null, '1', '1', '002001', '1');

insert into ext_function_interface_ref (ID, FUNC_TYPE_CODE, INTERFACE_NO, VALIDATE_STATE, CREATE_TIME, CREATE_BY, MODIFY_TIME, MODIFY_BY, PRIORITY, RULE_GROUP_CODE, CONF_TYPE)
values (seq_ext_function_interface_ref.nextval, 'cusReconsiderSubmit', 'HFW01_7001_02', '1', sysdate, null, null, '1', '2', '002001', '1');

insert into ext_function_interface_ref (ID, FUNC_TYPE_CODE, INTERFACE_NO, VALIDATE_STATE, CREATE_TIME, CREATE_BY, MODIFY_TIME, MODIFY_BY, PRIORITY, RULE_GROUP_CODE, CONF_TYPE)
values (seq_ext_function_interface_ref.nextval, 'cusReconsiderSubmit', 'QHZXCREDOO_8007', '1', sysdate, null, null, '1', '3', '002001', '1');

insert into ext_function_interface_ref (ID, FUNC_TYPE_CODE, INTERFACE_NO, VALIDATE_STATE, CREATE_TIME, CREATE_BY, MODIFY_TIME, MODIFY_BY, PRIORITY, RULE_GROUP_CODE, CONF_TYPE)
values (seq_ext_function_interface_ref.nextval, 'cusReconsiderSubmit', 'YSZX01_8010', '1', sysdate, null, null, '1', '4', '002001', '1');

insert into ext_function_interface_ref (ID, FUNC_TYPE_CODE, INTERFACE_NO, VALIDATE_STATE, CREATE_TIME, CREATE_BY, MODIFY_TIME, MODIFY_BY, PRIORITY, RULE_GROUP_CODE, CONF_TYPE)
values (seq_ext_function_interface_ref.nextval, 'cusReconsiderSubmit', 'SH_QUERY_FRAUD', '1',sysdate,null, null, '1', '5', '002002', '1');

insert into ext_function_interface_ref (ID, FUNC_TYPE_CODE, INTERFACE_NO, VALIDATE_STATE, CREATE_TIME, CREATE_BY, MODIFY_TIME, MODIFY_BY, PRIORITY, RULE_GROUP_CODE, CONF_TYPE)
values (seq_ext_function_interface_ref.nextval, 'intoQcSubmit', 'HFW01_7001_01', '1', sysdate, null, null, '1', '1', '002001', '1');

insert into ext_function_interface_ref (ID, FUNC_TYPE_CODE, INTERFACE_NO, VALIDATE_STATE, CREATE_TIME, CREATE_BY, MODIFY_TIME, MODIFY_BY, PRIORITY, RULE_GROUP_CODE, CONF_TYPE)
values (seq_ext_function_interface_ref.nextval, 'intoQcSubmit', 'HFW01_7001_02', '1', sysdate, null, null, '1', '2', '002001', '1');

insert into ext_function_interface_ref (ID, FUNC_TYPE_CODE, INTERFACE_NO, VALIDATE_STATE, CREATE_TIME, CREATE_BY, MODIFY_TIME, MODIFY_BY, PRIORITY, RULE_GROUP_CODE, CONF_TYPE)
values (seq_ext_function_interface_ref.nextval, 'intoQcSubmit', 'QHZXCREDOO_8007', '1', sysdate,null, null, '1', '3', '002001', '1');

insert into ext_function_interface_ref (ID, FUNC_TYPE_CODE, INTERFACE_NO, VALIDATE_STATE, CREATE_TIME, CREATE_BY, MODIFY_TIME, MODIFY_BY, PRIORITY, RULE_GROUP_CODE, CONF_TYPE)
values (seq_ext_function_interface_ref.nextval, 'intoQcSubmit', 'YSZX01_8010', '1', sysdate, null, null, '1', '4', '002001', '1');

insert into ext_function_interface_ref (ID, FUNC_TYPE_CODE, INTERFACE_NO, VALIDATE_STATE, CREATE_TIME, CREATE_BY, MODIFY_TIME, MODIFY_BY, PRIORITY, RULE_GROUP_CODE, CONF_TYPE)
values (seq_ext_function_interface_ref.nextval, 'intoQcSubmit', 'SH_QUERY_FRAUD', '1',sysdate,null, null, '1', '5', '002002', '1');

insert into ext_function_interface_ref (ID, FUNC_TYPE_CODE, INTERFACE_NO, VALIDATE_STATE, CREATE_TIME, CREATE_BY, MODIFY_TIME, MODIFY_BY, PRIORITY, RULE_GROUP_CODE, CONF_TYPE)
values (seq_ext_function_interface_ref.nextval, 'intoInitCheck', null, '1', sysdate,null, null, '1', null, '002003', '2');


commit;



truncate table ext_invoke_filter_rule;

insert into ext_invoke_filter_rule (ID, SYS_CODE, IS_PRO_LIMIT, IS_STORE_LIMIT, VALID_TERM_STARTDATE, VALID_TERM_ENDDATE, VALIDATE_STATE, REMARK, CREATE_TIME, CREATE_BY, MODIFY_TIME, MODIFY_BY)
values (seq_ext_invoke_filter_rule.nextval, 'loan', '0', '0', to_date('30-06-2017', 'dd-mm-yyyy'), to_date('07-08-2020', 'dd-mm-yyyy'), '1', null, sysdate, 1, null, null);

commit;