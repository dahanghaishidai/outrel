
--第一步   保存备份数据(jbpm4_biz_tab, lb_t_into_info, jbpm4_task, jbpm4_variable, jbpm4_execution)
create table jbpm4_biz_tab_20170812 as select * from jbpm4_biz_tab;
create table lb_t_into_info_20170812 as select * from lb_t_into_info;
create table jbpm4_task_20170812 as select * from jbpm4_task;
create table jbpm4_variable_20170812 as select * from jbpm4_variable;
create table jbpm4_execution_20170812 as select * from jbpm4_execution;
create table lb_t_into_au_re_20170812 as select * from lb_t_into_audit_result;

--第二步   创建清理表，临时保存要清理的业务数据关联信息
create table Pm_t_ClearWorkFlow
(
  app_into_id               VARCHAR2(50),
  execution_id_                VARCHAR2(100), 
  biz_type                  VARCHAR2(50), 
  biz_id                    NUMBER(18), 
  biz_inf_id                VARCHAR2(50)
);
insert into Pm_t_ClearWorkFlow
select b.biz_inf_name as app_into_id, 
       b.pro_instance_id as execution_id_,
       b.biz_type , 
       b.id ,
       b.biz_inf_id
from jbpm4_biz_tab b 
where b.validate_state='1'
      and b.biz_type in('1000', '1001', '1002')
    and exists (select 1 from jbpm4_task t where t.execution_id_ = b.pro_instance_id  ) 
     and exists (select 1 from lb_t_into_info t where t.id = biz_inf_name)
     --and biz_inf_name = '120150218044'
     ;
commit;
   
--第三步 终止信审流程、复议流程、稽核流程
--根据processID删除流程数据
delete from jbpm4_task where execution_id_ in (
          select  execution_id_ from Pm_t_ClearWorkFlow
);
delete from jbpm4_variable v where v.execution_ in (select e.dbid_ from jbpm4_execution e where e.id_ in (select  execution_id_ from Pm_t_ClearWorkFlow));
delete from jbpm4_variable v where v.exesys_ in (select e.dbid_ from jbpm4_execution e where e.id_ in (select  execution_id_ from Pm_t_ClearWorkFlow));
delete from jbpm4_execution e where e.id_ in ( select  execution_id_ from Pm_t_ClearWorkFlow );
commit;


--第四步 更新进件状态 （信审、复议、稽核）
--4.1 信审、稽核
update lb_t_into_info set Audite_State = '1300', modify_time = systimestamp
 where id in (
      select  app_into_id from Pm_t_ClearWorkFlow where biz_type in ('1000', '1002')
);
--4.2 复议
update lb_t_into_info i 
set i.Audite_State = (
                        select l.into_state 
                             from lb_t_reconsideration l 
                             where l.id = ( select max(rt.id) from lb_t_reconsideration rt where rt.into_app_id = i.id) 
                     ),  modify_time = systimestamp
where id in (
            select  app_into_id from Pm_t_ClearWorkFlow where biz_type in ('1001')
);
update lb_t_reconsideration l set l.recon_app_no = null, l.modify_time = systimestamp  where id in (select biz_inf_id from Pm_t_ClearWorkFlow );
commit;


--第五步 删除妨碍流程重新发起的数据  jbpm4_biz_tab  (信审、复议、稽核)
delete from jbpm4_biz_tab b where b.id in (
         select  biz_id from Pm_t_ClearWorkFlow
);
commit;
delete from lb_t_into_audit_result r where r.process_id in (
         select  execution_id_ from Pm_t_ClearWorkFlow
);
commit;   
     
--最后，清理临时表(暂缓清理)
/*
--drop table Pm_t_ClearWorkFlow;
--drop table jbpm4_biz_tab_20170812;
--drop table lb_t_into_info_20170812;
--drop table jbpm4_task_20170812;
--drop table jbpm4_variable_20170812;
--drop table jbpm4_execution_20170812;
--drop table lb_t_into_au_re_20170812;
*/ 
     