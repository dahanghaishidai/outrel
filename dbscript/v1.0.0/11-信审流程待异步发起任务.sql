 select * from biz_asyn_job t where t.job_state='2'; 
 
 create table biz_asyn_job_20170812 as select * from biz_asyn_job t where t.job_state='2';
 
 update biz_asyn_job t set t.job_state='9',t.end_time=sysdate,t.error_remark='信审待异步发起流程业务手动终止' where　t.job_state='2';