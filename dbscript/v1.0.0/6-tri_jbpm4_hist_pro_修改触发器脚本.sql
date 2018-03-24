create or replace trigger tri_jbpm4_hist_pro
/*
* 触发 保存 进件 主表 流程信息 信息
* created by chengang
* 2015-05-21
*
*/

before  insert or update
on jbpm4_hist_procinst
for each row
declare


begin

  if( instr(:new.id_,'creditAuditKey.') >0 or instr(:new.id_,'carLoanAuditKey.') >0 or instr(:new.id_,'houseLoanAuditKey.') >0 ) then
      
      --线上稽核 并入信审流程，这里单独区分
      if(instr(:new.endactivity_ ,'稽核审批')>0 and instr(:new.id_,'creditAuditKey.') >0) then
          --线上稽核
          if(:new.end_ is not null) then
                update lb_t_into_info t2 set t2.online_end = :new.end_
                ,t2.one_end = :new.end_
                ,t2.AUTDIT_END_TIME = :new.end_
                where t2.id in(select t1.biz_inf_name from jbpm4_biz_tab t1 where t1.pro_instance_id = :new.id_);
                
          else
                update lb_t_into_info t2 set t2.online_start = :new.start_
                ,t2.AUTDIT_END_TIME =''
                where t2.id in(select t1.biz_inf_name from jbpm4_biz_tab t1 where t1.pro_instance_id = :new.id_);
          end if;
          
          --流程进入稽核，这时需要补充设置 信审员和终审员,同下面原来信审一样
          ---信审初审
          update lb_t_into_info t2 set t2.cre_user_id=( select t.assignee_  from jbpm4_hist_task t
                        where t.dbid_ =(
                        select ha1.htask_
                               from jbpm4_hist_actinst ha1 where 1=1
                               and ha1.execution_ = :new.id_
                               and ha1.start_  =(select max(ha.start_ ) from jbpm4_hist_actinst ha
                               where 1=1
                               and instr(ha.activity_name_ ,'信审专员') >0
                               and ha.class_='task'
                               and ha.execution_ = :new.id_)
                        )
                     ) ,
                     t2.cre_org_id=(
                               select (select u.org_id from sys_org_user  u where u.validate_state='1' and u.user_id = t.assignee_ and rownum < 2)
                               from jbpm4_hist_task t
                        where t.dbid_ =( select ha1.htask_
                               from jbpm4_hist_actinst ha1 where 1=1
                               and ha1.execution_ = :new.id_
                               and ha1.start_  =(select max(ha.start_ ) from jbpm4_hist_actinst ha
                               where 1=1
                               and instr(ha.activity_name_ ,'信审专员') >0
                               and ha.class_='task'
                               and ha.execution_ = :new.id_)
                        )
                     )

            where t2.id in(select t1.biz_inf_name from jbpm4_biz_tab t1 where t1.pro_instance_id = :new.id_);


            --信审终审
            update lb_t_into_info t2 set t2.CRE_LAST_USER=( select t.assignee_  from jbpm4_hist_task t
                        where t.dbid_ =(
                        select ha1.htask_
                               from jbpm4_hist_actinst ha1 where 1=1
                               and ha1.execution_ = :new.id_
                               and ha1.start_  =(select max(ha.start_ ) from jbpm4_hist_actinst ha
                               where 1=1
                               and (    instr(ha.activity_name_ ,'主管')>0
                                    or instr(ha.activity_name_ ,'经理')>0
                                    or instr(ha.activity_name_ ,'首席')>0
                                    or instr(ha.activity_name_ ,'总监')>0
                                )
                                and ha.class_='task'
                               and ha.execution_ = :new.id_)
                        )
                     )
            where t2.id in(select t1.biz_inf_name from jbpm4_biz_tab t1 where t1.pro_instance_id = :new.id_);
      else
          --信审流程(非稽核部分) 、车贷审批审批
          if(:new.end_ is not null) then
              update lb_t_into_info t2 set t2.one_end = :new.end_
              ,t2.AUTDIT_END_TIME = :new.end_
              where t2.id in(select t1.biz_inf_name from jbpm4_biz_tab t1 where t1.pro_instance_id = :new.id_);

              ---信审初审
              update lb_t_into_info t2 set t2.cre_user_id=( select t.assignee_  from jbpm4_hist_task t
                              where t.dbid_ =(
                              select ha1.htask_
                                     from jbpm4_hist_actinst ha1 where 1=1
                                     and ha1.execution_ = :new.id_
                                     and ha1.start_  =(select max(ha.start_ ) from jbpm4_hist_actinst ha
                                     where 1=1
                                     and instr(ha.activity_name_ ,'信审专员') >0
                                     and ha.class_='task'
                                     and ha.execution_ = :new.id_)
                              )
                           ) ,
                           t2.cre_org_id=(
                                     select (select u.org_id from sys_org_user  u where u.validate_state='1' and u.user_id = t.assignee_ and rownum < 2)
                                     from jbpm4_hist_task t
                              where t.dbid_ =( select ha1.htask_
                                     from jbpm4_hist_actinst ha1 where 1=1
                                     and ha1.execution_ = :new.id_
                                     and ha1.start_  =(select max(ha.start_ ) from jbpm4_hist_actinst ha
                                     where 1=1
                                     and instr(ha.activity_name_ ,'信审专员') >0
                                     and ha.class_='task'
                                     and ha.execution_ = :new.id_)
                              )
                           )

              where t2.id in(select t1.biz_inf_name from jbpm4_biz_tab t1 where t1.pro_instance_id = :new.id_);


              --信审终审
              update lb_t_into_info t2 set t2.CRE_LAST_USER=( select t.assignee_  from jbpm4_hist_task t
                              where t.dbid_ =(
                              select ha1.htask_
                                     from jbpm4_hist_actinst ha1 where 1=1
                                     and ha1.execution_ = :new.id_
                                     and ha1.start_  =(select max(ha.start_ ) from jbpm4_hist_actinst ha
                                     where 1=1
                                     and (    instr(ha.activity_name_ ,'主管')>0
                                          or instr(ha.activity_name_ ,'经理')>0
                                          or instr(ha.activity_name_ ,'首席')>0
                                          or instr(ha.activity_name_ ,'总监')>0
                                      )
                                      and ha.class_='task'
                                     and ha.execution_ = :new.id_)
                              )
                           )
              where t2.id in(select t1.biz_inf_name from jbpm4_biz_tab t1 where t1.pro_instance_id = :new.id_);


          else
              update lb_t_into_info t2 set t2.one_start = :new.start_
              where t2.id in(select t1.biz_inf_name from jbpm4_biz_tab t1 where t1.pro_instance_id = :new.id_);
          end if;
      end if;

  elsif (instr(:new.id_,'reconsiderationKey.') >0 ) then
    --客户复议审批
    if(:new.end_ is not null) then
          update lb_t_into_info t2 set t2.reaudit_end = :new.end_
          ,t2.AUTDIT_END_TIME = :new.end_
          where t2.id in(select t1.biz_inf_name from jbpm4_biz_tab t1 where t1.pro_instance_id = :new.id_);

          --复议终审
          update lb_t_into_info t2 set t2.REC_AUDIT_USER=( select t.assignee_  from jbpm4_hist_task t
                          where t.dbid_ =(
                          select ha1.htask_
                                 from jbpm4_hist_actinst ha1 where 1=1
                                 and ha1.execution_ = :new.id_
                                 and ha1.start_  =(select max(ha.start_ ) from jbpm4_hist_actinst ha
                                 where 1=1
                                 and (    instr(ha.activity_name_ ,'主管')>0
                                      or instr(ha.activity_name_ ,'经理')>0
                                      or instr(ha.activity_name_ ,'首席')>0
                                      or instr(ha.activity_name_ ,'总监')>0
                                  )
                                  and ha.class_='task'
                                 and ha.execution_ = :new.id_)
                          )
                       )

          where t2.id in(select t1.biz_inf_name from jbpm4_biz_tab t1 where t1.pro_instance_id = :new.id_);

    else
          update lb_t_into_info t2 set t2.reaudit_start = :new.start_
          ,t2.AUTDIT_END_TIME =''
          where t2.id in(select t1.biz_inf_name from jbpm4_biz_tab t1 where t1.pro_instance_id = :new.id_);
    end if;

  else
        --dbms_output.put_line('-----no update ------');
        update lb_t_into_info t2 set t2.id = '-1' where t2.id='-1';
  end if;
--- 查询 该流程是否有 主流程
-- 修正 数据
update lb_t_into_info t1 set t1.autdit_end_time=''

where t1.id in( select t.id from lb_t_into_info t
    where 1= 1
    and t.autdit_end_time is not null
    and t.online_end  is null
    and t.online_start is not null
);

exception when others then
--dbms_output.put_line('-----tri_jbpm4_hist_pro------');
   insert into lb_t_transfer_log(id,req_trans_no,interface_no,req_time,ret_time,ret_msg)
   select seq_lb_t_transfer_log.nextval,sys_guid(),'0000',systimestamp,systimestamp,'tri_jbpm4_hist_pro' from dual;
end;
