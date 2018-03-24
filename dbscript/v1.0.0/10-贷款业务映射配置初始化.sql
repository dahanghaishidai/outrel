--1.创建存储过程
create or replace procedure pro_loan_vm_rule_mapping(role1 in varchar2,
                                                     role2 in varchar2) is
begin

    declare
        x          varchar2(50);
        y          varchar2(50);
        z          varchar2(50);
        v_errinfo  varchar2(2000);
        v_errcode  varchar2(50);
        mappingid  number;
        mappingprv number;
    
        cursor C_PARAMETERS is
            select t1.user_no as MAP_KEY
              from sys_user t1
              left join sys_role_user t2
                on t2.target_id = t1.id
               and t2.VALIDATE_STATE = '1'
              left join sys_role t6
                on t6.id = t2.role_id
               and t6.VALIDATE_STATE = '1'
             where t1.VALIDATE_STATE = '1'
               and (t6.role_name = role1 || '经理' or t6.role_name = role2);
    
        cursor C_MEDIIMME is
            select *
              from (select t1.user_no as MAP_VALUE
                      from sys_user t1
                      left join sys_role_user t2
                        on t2.target_id = t1.id
                       and t2.VALIDATE_STATE = '1'
                      left join sys_role t6
                        on t6.id = t2.role_id
                       and t6.VALIDATE_STATE = '1'
                     where t1.VALIDATE_STATE = '1'
                       and t6.role_name = role1 || '主管') T;
    
        cursor C_ATTACHE is
            select t1.user_no as MAP_VALUE
              from sys_user t1
              left join sys_role_user t2
                on t2.target_id = t1.id
               and t2.VALIDATE_STATE = '1'
              left join sys_role t6
                on t6.id = t2.role_id
               and t6.VALIDATE_STATE = '1'
             where t1.VALIDATE_STATE = '1'
               and t6.role_name = role1 || '专员';
    
    begin
        for oneID in C_PARAMETERS loop
            x := oneID."MAP_KEY";
            for twoID in C_MEDIIMME loop
                y          := twoID."MAP_VALUE";
                mappingprv := seq_loan_vmrule_mapping.nextval;
                insert into LOAN_VMRULE_MAPPING
                    (ID,
                     MAP_TYPE,
                     MAP_KEY,
                     MAP_VALUE,
                     ORG_TYPE,
                     CREATE_TIME,
                     CREATE_BY)
                values
                    (mappingprv, '1', x, y, 'LOAN', sysdate, x);
                insert into loan_vmdata_priv
                    (id,
                     user_id,
                     owner_id,
                     org_id,
                     biz_id,
                     org_type,
                     create_time,
                     create_by,
                     vmrule_mapping_id)
                values
                    (seq_loan_vmdata_priv.nextval,
                     x,
                     null,
                     (select t3.id
                        from sys_user t1, sys_org_user t2, sys_org t3
                       where t2.user_id = t1.id
                         and t2.VALIDATE_STATE = '1'
                         and t3.id = t2.org_id
                         and t3.VALIDATE_STATE = '1'
                         and t1.id = x),
                     null,
                     'LOAN',
                     sysdate,
                     x,
                     mappingprv);
                --dbms_output.put_line('信审经理 x is:' || x || '信审主管 y is:' || y);
                for threeID in C_ATTACHE loop
                    z := threeID."MAP_VALUE";
                   -- dbms_output.put_line('信审经理 x is:' || x || '信审专员 z is:' || z);
                    mappingid := seq_loan_vmrule_mapping.nextval;
                    insert into LOAN_VMRULE_MAPPING
                        (ID,
                         MAP_TYPE,
                         MAP_KEY,
                         MAP_VALUE,
                         ORG_TYPE,
                         CREATE_TIME,
                         CREATE_BY)
                    values
                        (mappingid, '1', x, z, 'LOAN', sysdate, x);
                
                    insert into loan_vmdata_priv
                        (id,
                         user_id,
                         owner_id,
                         org_id,
                         biz_id,
                         org_type,
                         create_time,
                         create_by,
                         vmrule_mapping_id)
                    values
                        (seq_loan_vmdata_priv.nextval,
                         x,
                         null,
                         (select t3.id
                            from sys_user t1, sys_org_user t2, sys_org t3
                           where t2.user_id = t1.id
                             and t2.VALIDATE_STATE = '1'
                             and t3.id = t2.org_id
                             and t3.VALIDATE_STATE = '1'
                             and t1.id = x),
                         null,
                         'LOAN',
                         sysdate,
                         x,
                         mappingid);
                
                end loop;
                commit;
            end loop;
        
        end loop;
    
    exception
        when others then
            begin
                v_errcode := sqlcode;
                v_errinfo := sqlerrm;
                rollback;
                insert into LA_T_DUNASSIGN_LOG
                    (ID, BATCH_NO, ERR_MESSAGE, INSERT_TIME)
                values
                    (SEQ_LA_T_DUNASSIGN_LOG.NEXTVAL,
                     '',
                     'error:' || ' 待处理件人工分配 ' || ' ' || v_errcode ||
                     v_errinfo,
                     sysdate);
                commit;
            end;
    end;
end;


--2.执行存储过程
exec pro_loan_vm_rule_mapping ('信审一室','首席风险执行官（信审）');

exec pro_loan_vm_rule_mapping ('信审二室','首席风险执行官（信审）');