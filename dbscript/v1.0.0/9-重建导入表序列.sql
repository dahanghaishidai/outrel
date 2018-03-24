create or replace procedure BalanceSEQ_PM is
   v_seqName   varchar2(200);
   v_tablename varchar2(200);
   v_num       number := 0;
   v_maxID     number := 0;
   v_sqlStr    varchar2(500);
   v_pkey varchar2(200);
 begin


   declare
     Cursor cur_seq is

select a.object_name, a.table_name, cu.COLUMN_NAME
  from user_cons_columns cu,
       user_constraints au,
       (select object_name,
               substr(object_name, 5, length(object_name) - 4) AS table_name
        
          from user_objects
         where object_type = 'SEQUENCE'
           and object_name like 'SEQ%') a
 where cu.constraint_name = au.constraint_name
   and au.constraint_type = 'P'
   and au.table_name = a.table_name
   AND A.table_name IN ('EXT_INDEX_MODULE_TYPE',
                        'SYS_RULE_LIST',
                        'SYS_RULE_WHEN_CONFIG',
                        'LBT_DECISION_MODULE_TYPE',
                        'LBT_DECISION_SQL_CONF');
   begin
     open cur_seq;
     loop
       fetch cur_seq
         into v_seqName, v_tablename,v_pkey;
         
         exit when cur_seq%notfound;
       begin
    
         v_sqlStr := 'select max('||v_pkey||')+10 from ' || v_tablename;

         execute immediate v_sqlStr into v_maxID;
         v_maxID := nvl(v_maxID, 0);
         v_sqlStr:='drop SEQUENCE  '||v_seqName;
         
        execute immediate v_sqlStr;
          dbms_output.put_line(v_sqlStr);
      
          v_sqlStr := 'CREATE SEQUENCE  '|| v_seqName ||' INCREMENT BY'|| ' 1 START WITH ' ||v_maxID ||' MAXVALUE 9999999999999999999999999999    NOCYCLE CACHE 20 NOORDER';
         execute immediate v_sqlStr;
           dbms_output.put_line(v_sqlStr);
          Exception
         when others then
           dbms_output.put_line(v_sqlStr || ' execute exception');
           null;
         end;
      
     end loop;
     close cur_seq;

   Exception
     when others then
       null;
       if cur_seq%isopen then
         close cur_seq;
       end if;
   end;

 end BalanceSEQ_PM;
