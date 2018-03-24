--新增数据库表脚本
--1.批贷额度权限配置角色表
create table LB_T_APPROVAL_QUOTA_ROLE_CONIF
(
  id                NUMBER(18) not null,
  role_id           NUMBER(18),
  role_name         VARCHAR2(50),
  operate_id        VARCHAR2(3000),
  operate_name      VARCHAR2(3500),
  appr_product_code VARCHAR2(3000),
  appr_product_name VARCHAR2(3500),
  approval_flag     NUMBER(2),
  refuse_flag       NUMBER(2),
  accredit_amount   NUMBER(20,6),
  validate_state    VARCHAR2(2) not null,
  create_time       TIMESTAMP(6),
  modify_time       TIMESTAMP(6),
  create_by         NUMBER(16),
  modify_by         NUMBER(16),
  operate_flow_key  VARCHAR2(50)
);
-- Add comments to the table 
comment on table LB_T_APPROVAL_QUOTA_ROLE_CONIF
  is '批贷额度权限配置角色表';
-- Add comments to the columns 
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.role_id
  is '角色id';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.role_name
  is '角色名称';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.operate_id
  is '操作员id';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.operate_name
  is '操作人姓名';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.appr_product_code
  is '产品类型';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.appr_product_name
  is '产品名称';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.approval_flag
  is '是否可批贷1代表是，0代表否';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.refuse_flag
  is '是否可拒贷1代表是，0代表否';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.accredit_amount
  is '授权额度';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.validate_state
  is '是否有效1代表是，0代表否';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.create_time
  is '创建时间';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.modify_time
  is '更新时间';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.create_by
  is '创建者';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.modify_by
  is '修改者';
comment on column LB_T_APPROVAL_QUOTA_ROLE_CONIF.operate_flow_key
  is '操作流程';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LB_T_APPROVAL_QUOTA_ROLE_CONIF
  add constraint PK_LB_T_APPROVAL_QUOTA_ROLE_CO primary key (ID);


--2.批贷额度权限配置人员表
create table LB_T_APPROVAL_QUOTA_OPER_CONIF
(
  id                           NUMBER(18) not null,
  operate_id                   NUMBER(18),
  operate_name                 VARCHAR2(100),
  appr_product_code            VARCHAR2(18),
  appr_product_name            VARCHAR2(200),
  fk_approval_quota_rol_cof_id NUMBER(18) not null,
  accredit_amount              NUMBER(20,6),
  approval_flag                NUMBER(2),
  refuse_flag                  NUMBER(2),
  create_time                  TIMESTAMP(6),
  modify_time                  TIMESTAMP(6),
  create_by                    NUMBER(16),
  modify_by                    NUMBER(16),
  validate_state               VARCHAR2(2) not null,
  operate_flow_key             VARCHAR2(50)
);
-- Add comments to the table 
comment on table LB_T_APPROVAL_QUOTA_OPER_CONIF
  is '批贷额度权限配置人员表';
-- Add comments to the columns 
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.operate_id
  is '操作员id';
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.operate_name
  is '操作人姓名';
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.appr_product_code
  is '产品类型';
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.appr_product_name
  is '产品名称';
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.fk_approval_quota_rol_cof_id
  is '批贷权限额度角色配置ID';
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.accredit_amount
  is '授权额度';
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.approval_flag
  is '是否可批贷1代表是，0代表否';
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.refuse_flag
  is '是否可拒贷1代表是，0代表否';
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.create_time
  is '创建时间';
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.modify_time
  is '更新时间';
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.create_by
  is '创建者';
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.modify_by
  is '修改者';
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.validate_state
  is '是否有效1代表是，0代表否';
comment on column LB_T_APPROVAL_QUOTA_OPER_CONIF.operate_flow_key
  is '操作流程';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LB_T_APPROVAL_QUOTA_OPER_CONIF
  add constraint PK_LB_T_APPROVAL_QUOTA_OPER_CO primary key (ID);
      

--3.待处理件人工分配操作日志表
CREATE TABLE
    LB_T_HANDTASK_ALLOT_LOG
    (
        ID NUMBER(22) NOT NULL,
        TRANSFER_ID NUMBER(22),
        TRANSFER_NAME VARCHAR2(50),
        TRANSFER_COUNT NUMBER(22),
        ROLLOUT_ID NUMBER(22),
        ROLLOUT_NAME VARCHAR2(50),
        ROLLOUT_COUNT NUMBER(22),
        CREATE_TIME TIMESTAMP(6),
        CREATE_BY NUMBER(22),
        CREATE_NAME VARCHAR2(50),
        MODIFY_TIME TIMESTAMP(6),
        MODIFY_BY NUMBER(22),
        VALIDATE_STATE VARCHAR2(2) DEFAULT '1',
        CONSTRAINT PK_LB_T_HANDTASK_ALLOT_LOG PRIMARY KEY (ID)
    );
COMMENT ON COLUMN LB_T_HANDTASK_ALLOT_LOG.TRANSFER_ID
IS
    '转入方ID';
COMMENT ON COLUMN LB_T_HANDTASK_ALLOT_LOG.TRANSFER_NAME
IS
    '转入方';
COMMENT ON COLUMN LB_T_HANDTASK_ALLOT_LOG.TRANSFER_COUNT
IS
    '转入笔数';
COMMENT ON COLUMN LB_T_HANDTASK_ALLOT_LOG.ROLLOUT_ID
IS
    '转出方ID';
COMMENT ON COLUMN LB_T_HANDTASK_ALLOT_LOG.ROLLOUT_NAME
IS
    '转出方';
COMMENT ON COLUMN LB_T_HANDTASK_ALLOT_LOG.ROLLOUT_COUNT
IS
    '转出笔数';
COMMENT ON COLUMN LB_T_HANDTASK_ALLOT_LOG.CREATE_TIME
IS
    '创建时间';
COMMENT ON COLUMN LB_T_HANDTASK_ALLOT_LOG.CREATE_BY
IS
    '创建人ID';
COMMENT ON COLUMN LB_T_HANDTASK_ALLOT_LOG.CREATE_NAME
IS
    '创建人名称';
      
 
 
 
 
 
--4.上报批贷建议表
create table LB_T_UP_REPORT_COMMENT
(
  id                NUMBER(18) not null,
  fk_into_id        NUMBER(18) not null,
  present_info_desc VARCHAR2(1000),
  create_time       TIMESTAMP(6),
  create_by         VARCHAR2(20),
  modify_time       TIMESTAMP(6),
  modify_by         VARCHAR2(20),
  validate_state    VARCHAR2(2),
  is_view           VARCHAR2(2)
);
-- Add comments to the table 
comment on table LB_T_UP_REPORT_COMMENT
  is '上报批贷建议表';
-- Add comments to the columns 
comment on column LB_T_UP_REPORT_COMMENT.id
  is '主键';
comment on column LB_T_UP_REPORT_COMMENT.fk_into_id
  is '进件编号';
comment on column LB_T_UP_REPORT_COMMENT.present_info_desc
  is '批贷建议';
comment on column LB_T_UP_REPORT_COMMENT.create_time
  is '创建时间';
comment on column LB_T_UP_REPORT_COMMENT.create_by
  is '创建人';
comment on column LB_T_UP_REPORT_COMMENT.modify_time
  is '修改时间';
comment on column LB_T_UP_REPORT_COMMENT.modify_by
  is '修改人';
comment on column LB_T_UP_REPORT_COMMENT.validate_state
  is '数据有效性';
comment on column LB_T_UP_REPORT_COMMENT.is_view
  is '是否查看过';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LB_T_UP_REPORT_COMMENT
  add constraint PK_LB_T_UP_REPORT_COMMENT primary key (ID);

 
 
 
-- 5.三方数据（含规则校验）接口日志表
CREATE TABLE
    LBT_THIRD_INTERFACE_LOG
    (
        ID NUMBER(18) NOT NULL,
        FRONT_TRANS_NO VARCHAR2(40),
        FRONT_TRANS_TIME TIMESTAMP(6),
        INTERFACE_NO VARCHAR2(6),
        BUSINESS_CODE VARCHAR2(5),
        RET_TIME TIMESTAMP(6),
        RET_CODE VARCHAR2(4),
        RET_MSG VARCHAR2(3000),
        FUNC_TYPE VARCHAR2(50),
        FUNC_POINT_TYPE VARCHAR2(50),
        CREATE_BY NUMBER(22),
        CREATE_TIME TIMESTAMP(6) DEFAULT SYSDATE,
        MODIFY_BY NUMBER(22),
        MODIFY_TIME TIMESTAMP(6),
        VALIDATE_STATE VARCHAR2(22) DEFAULT '1',
        PRIMARY KEY (ID)
    );
COMMENT ON TABLE LBT_THIRD_INTERFACE_LOG
IS
    '三方数据（含规则校验）接口日志表';
COMMENT ON COLUMN LBT_THIRD_INTERFACE_LOG.ID
IS
    '主键';
COMMENT ON COLUMN LBT_THIRD_INTERFACE_LOG.FRONT_TRANS_NO
IS
    '交易流水号';
COMMENT ON COLUMN LBT_THIRD_INTERFACE_LOG.FRONT_TRANS_TIME
IS
    '交易时间';
COMMENT ON COLUMN LBT_THIRD_INTERFACE_LOG.INTERFACE_NO
IS
    '接口编码';
COMMENT ON COLUMN LBT_THIRD_INTERFACE_LOG.BUSINESS_CODE
IS
    '业务编码';
COMMENT ON COLUMN LBT_THIRD_INTERFACE_LOG.RET_TIME
IS
    '返回时间';
COMMENT ON COLUMN LBT_THIRD_INTERFACE_LOG.RET_CODE
IS
    '返回码(200：成功  201：失败  500:异常)';
COMMENT ON COLUMN LBT_THIRD_INTERFACE_LOG.RET_MSG
IS
    '返回信息';
COMMENT ON COLUMN LBT_THIRD_INTERFACE_LOG.FUNC_TYPE
IS
    '功能类型编码';
COMMENT ON COLUMN LBT_THIRD_INTERFACE_LOG.FUNC_POINT_TYPE
IS
    '功能点编码';

 
-- 6.复议转信审对照表
create table LB_T_RECON_TO_CREDIT
(
  id             NUMBER(18) not null,
  reconsider_id  NUMBER(18),
  into_app_id    NUMBER(18),
  new_into_id    NUMBER(18),
  validate_state VARCHAR2(2),
  create_time    TIMESTAMP(6),
  create_by      VARCHAR2(20),
  modify_time    TIMESTAMP(6),
  modify_by      VARCHAR2(20)
);
-- Add comments to the table 
comment on table LB_T_RECON_TO_CREDIT
  is '复议转信审对照表';
-- Add comments to the columns 
comment on column LB_T_RECON_TO_CREDIT.id
  is '主键';
comment on column LB_T_RECON_TO_CREDIT.reconsider_id
  is '复议申请ID';
comment on column LB_T_RECON_TO_CREDIT.into_app_id
  is '进件编号';
comment on column LB_T_RECON_TO_CREDIT.new_into_id
  is '新进件编号';
comment on column LB_T_RECON_TO_CREDIT.validate_state
  is '有效状态（1-有效、0-无效，逻辑删除用）';
comment on column LB_T_RECON_TO_CREDIT.create_time
  is '创建时间';
comment on column LB_T_RECON_TO_CREDIT.create_by
  is '创建人(复议专员)';
comment on column LB_T_RECON_TO_CREDIT.modify_time
  is '最后修改时间';
comment on column LB_T_RECON_TO_CREDIT.modify_by
  is '最后修改人';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LB_T_RECON_TO_CREDIT
  add primary key (ID);

 
--7.决策系统接口日志表
create table LBT_DECISION_INTERFACE_LOG
(
  id            NUMBER(18) not null,
  req_trans_no  VARCHAR2(50),
  interface_no  VARCHAR2(20),
  business_code VARCHAR2(20),
  req_time      TIMESTAMP(6),
  ret_trans_no  VARCHAR2(50),
  ret_code      VARCHAR2(10),
  ret_msg       CLOB,
  ret_time      TIMESTAMP(6),
  req_body      CLOB,
  ret_body      CLOB
);
-- Add comments to the table 
comment on table LBT_DECISION_INTERFACE_LOG
  is '决策系统接口日志表';
-- Add comments to the columns 
comment on column LBT_DECISION_INTERFACE_LOG.id
  is '主键';
comment on column LBT_DECISION_INTERFACE_LOG.req_trans_no
  is '请求交易流水号';
comment on column LBT_DECISION_INTERFACE_LOG.interface_no
  is '接口编码';
comment on column LBT_DECISION_INTERFACE_LOG.business_code
  is '业务编码';
comment on column LBT_DECISION_INTERFACE_LOG.req_time
  is '请求时间';
comment on column LBT_DECISION_INTERFACE_LOG.ret_trans_no
  is '返回交易流水号';
comment on column LBT_DECISION_INTERFACE_LOG.ret_code
  is '返回码';
comment on column LBT_DECISION_INTERFACE_LOG.ret_msg
  is '返回信息';
comment on column LBT_DECISION_INTERFACE_LOG.ret_time
  is '返回时间';
comment on column LBT_DECISION_INTERFACE_LOG.req_body
  is '请求报文体';
comment on column LBT_DECISION_INTERFACE_LOG.ret_body
  is '返回报文体';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LBT_DECISION_INTERFACE_LOG
  add constraint PK_LBT_DECISION_INTERFACE_LOG primary key (ID);


--8.决策系统总评分表
create table LB_T_CARD_PMSCORE_TOTAL
(
  id                    NUMBER(19) not null,
  fk_into_id            NUMBER(19),
  fk_cust_id            NUMBER(19),
  now_flag              NUMBER(1),
  score                 VARCHAR2(10),
  grade                 VARCHAR2(5),
  decision              VARCHAR2(5),
  notice                VARCHAR2(50),
  recommended_terms     VARCHAR2(3),
  product_max_limit     NUMBER(18,2),
  score_max_limit       NUMBER(18,2),
  lti                   VARCHAR2(5),
  dti                   VARCHAR2(5),
  recommended_max_limit NUMBER(18,2),
  recommended_limit     NUMBER(18,2),
  recommended_limit2    NUMBER(18,2),
  extract_decision      VARCHAR2(5),
  create_by             NUMBER(16),
  create_time           TIMESTAMP(6),
  modify_by             NUMBER(16),
  modify_time           TIMESTAMP(6),
  validate_state        VARCHAR2(2)
);
-- Add comments to the table 
comment on table LB_T_CARD_PMSCORE_TOTAL
  is '决策系统总评分表';
-- Add comments to the columns 
comment on column LB_T_CARD_PMSCORE_TOTAL.id
  is '主键';
comment on column LB_T_CARD_PMSCORE_TOTAL.fk_into_id
  is '进件表主键';
comment on column LB_T_CARD_PMSCORE_TOTAL.fk_cust_id
  is '客户表主键';
comment on column LB_T_CARD_PMSCORE_TOTAL.now_flag
  is '评分次数：1.一次评分 2.二次平分 3.三次评分';
comment on column LB_T_CARD_PMSCORE_TOTAL.score
  is '评分得分';
comment on column LB_T_CARD_PMSCORE_TOTAL.grade
  is '评分等级';
comment on column LB_T_CARD_PMSCORE_TOTAL.decision
  is '评分审核决策';
comment on column LB_T_CARD_PMSCORE_TOTAL.notice
  is '评分补充信息';
comment on column LB_T_CARD_PMSCORE_TOTAL.recommended_terms
  is '评分系统推荐分期';
comment on column LB_T_CARD_PMSCORE_TOTAL.product_max_limit
  is '评分产品批贷额度上限';
comment on column LB_T_CARD_PMSCORE_TOTAL.score_max_limit
  is '评分评分批贷额度上限';
comment on column LB_T_CARD_PMSCORE_TOTAL.lti
  is '评分LTI';
comment on column LB_T_CARD_PMSCORE_TOTAL.dti
  is '评分DTI';
comment on column LB_T_CARD_PMSCORE_TOTAL.recommended_max_limit
  is '评分推荐额度上限';
comment on column LB_T_CARD_PMSCORE_TOTAL.recommended_limit
  is '评分推荐额度';
comment on column LB_T_CARD_PMSCORE_TOTAL.recommended_limit2
  is '评分推荐额度2';
comment on column LB_T_CARD_PMSCORE_TOTAL.extract_decision
  is '评分抽取决策';
comment on column LB_T_CARD_PMSCORE_TOTAL.create_by
  is '创建人';
comment on column LB_T_CARD_PMSCORE_TOTAL.create_time
  is '创建时间';
comment on column LB_T_CARD_PMSCORE_TOTAL.modify_by
  is '修改人';
comment on column LB_T_CARD_PMSCORE_TOTAL.modify_time
  is '修改时间';
comment on column LB_T_CARD_PMSCORE_TOTAL.validate_state
  is '是否有效1.有效 0.无效';

alter table LB_T_CARD_PMSCORE_TOTAL
  add constraint PK_LB_T_CARD_PMSCORE_TOTAL primary key (ID);

--9.决策评分详情表
create table LB_T_CARD_PMSCORE_DETAIL
(
  id             NUMBER(19) not null,
  fk_tatal_id    NUMBER(19),
  score_name     VARCHAR2(100),
  score          NUMBER(18,2),
  score_detail   VARCHAR2(100),
  create_by      NUMBER(16),
  create_time    TIMESTAMP(6),
  modify_by      NUMBER(16),
  modify_time    TIMESTAMP(6),
  validate_state VARCHAR2(2)
);
-- Add comments to the table 
comment on table LB_T_CARD_PMSCORE_DETAIL
  is '决策评分详情表';
-- Add comments to the columns 
comment on column LB_T_CARD_PMSCORE_DETAIL.id
  is '主键';
comment on column LB_T_CARD_PMSCORE_DETAIL.fk_tatal_id
  is '总评分ID';
comment on column LB_T_CARD_PMSCORE_DETAIL.score_name
  is '评分详情字段名';
comment on column LB_T_CARD_PMSCORE_DETAIL.score
  is '评分值';
comment on column LB_T_CARD_PMSCORE_DETAIL.score_detail
  is '评分详情';
comment on column LB_T_CARD_PMSCORE_DETAIL.create_by
  is '创建人';
comment on column LB_T_CARD_PMSCORE_DETAIL.create_time
  is '创建时间';
comment on column LB_T_CARD_PMSCORE_DETAIL.modify_by
  is '修改人';
comment on column LB_T_CARD_PMSCORE_DETAIL.modify_time
  is '修改时间';
comment on column LB_T_CARD_PMSCORE_DETAIL.validate_state
  is '是否有效1.有效 0.无效';
alter table LB_T_CARD_PMSCORE_DETAIL
  add constraint PK_LB_T_CARD_PMSCORE_DETAIL primary key (ID);


--10.反欺诈业务提报表
create table LBT_ANTI_TO_HUMAN
(
  id                   NUMBER(16) not null,
  into_app_id          VARCHAR2(50),
  reason               VARCHAR2(2000),
  create_by            NUMBER(16),
  create_time          TIMESTAMP(6),
  anti_remark          VARCHAR2(2000),
  anti_operate         VARCHAR2(20),
  anti_time            TIMESTAMP(6),
  modify_by            NUMBER(16),
  modify_time          TIMESTAMP(6),
  validate_state       VARCHAR2(2),
  state                VARCHAR2(2),
  remark               VARCHAR2(2000),
  anti_user            VARCHAR2(20),
  anti_result          VARCHAR2(20),
  anti_decision        VARCHAR2(3),
  anti_decision_reason VARCHAR2(50)
);
-- Add comments to the table 
comment on table LBT_ANTI_TO_HUMAN
  is '反欺诈业务提报表';
-- Add comments to the columns 
comment on column LBT_ANTI_TO_HUMAN.id
  is '主键ID';
comment on column LBT_ANTI_TO_HUMAN.into_app_id
  is '进件编号';
comment on column LBT_ANTI_TO_HUMAN.reason
  is '提报原因';
comment on column LBT_ANTI_TO_HUMAN.create_by
  is '提报人';
comment on column LBT_ANTI_TO_HUMAN.create_time
  is '提报时间';
comment on column LBT_ANTI_TO_HUMAN.anti_remark
  is '反欺诈备注信息';
comment on column LBT_ANTI_TO_HUMAN.anti_operate
  is '反欺诈备注人';
comment on column LBT_ANTI_TO_HUMAN.anti_time
  is '反欺诈备注时间';
comment on column LBT_ANTI_TO_HUMAN.modify_by
  is '修改人';
comment on column LBT_ANTI_TO_HUMAN.modify_time
  is '修改时间';
comment on column LBT_ANTI_TO_HUMAN.validate_state
  is '是否有效 1.有效 0.无效';
comment on column LBT_ANTI_TO_HUMAN.state
  is '反欺诈人工是否处理 0.否 1.是';
comment on column LBT_ANTI_TO_HUMAN.remark
  is '提报备注信息';
comment on column LBT_ANTI_TO_HUMAN.anti_user
  is '反欺诈处理人';
comment on column LBT_ANTI_TO_HUMAN.anti_result
  is '反欺诈处理结果';
comment on column LBT_ANTI_TO_HUMAN.anti_decision
  is '反欺诈决策结果';
comment on column LBT_ANTI_TO_HUMAN.anti_decision_reason
  is '反欺诈决策原因';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LBT_ANTI_TO_HUMAN
  add constraint PK_LBT_ANTI_TO_HUMAN primary key (ID);



-- 11.拒贷参数(稽核)
create table LB_T_AUD_REFUSE_LOAN_CONF
(
  id             NUMBER not null,
  refuse_code    VARCHAR2(10),
  refuse_reason  VARCHAR2(200),
  parent_id      NUMBER(18),
  validate_state VARCHAR2(1),
  show_order     NUMBER(8),
  explanation    VARCHAR2(1000)
);
-- Add comments to the table 
comment on table LB_T_AUD_REFUSE_LOAN_CONF
  is '拒贷参数(稽核)';
-- Add comments to the columns 
comment on column LB_T_AUD_REFUSE_LOAN_CONF.id
  is 'id';
comment on column LB_T_AUD_REFUSE_LOAN_CONF.refuse_code
  is '拒绝代码';
comment on column LB_T_AUD_REFUSE_LOAN_CONF.refuse_reason
  is '拒绝原因';
comment on column LB_T_AUD_REFUSE_LOAN_CONF.parent_id
  is '父节点ID';
comment on column LB_T_AUD_REFUSE_LOAN_CONF.validate_state
  is '有效性状态，1有效，0无效';
comment on column LB_T_AUD_REFUSE_LOAN_CONF.show_order
  is '同级别的展示顺序';
comment on column LB_T_AUD_REFUSE_LOAN_CONF.explanation
  is '定义解释';
-- Create/Recreate primary, unique and foreign key constraints 
alter table LB_T_AUD_REFUSE_LOAN_CONF
  add constraint PK_LB_T_AUD_REFUSE_LOAN_CONF primary key (ID);
-- Create/Recreate indexes 
create index IDX_LB_T_AUD_REFUSE_LOAN_CODE on LB_T_AUD_REFUSE_LOAN_CONF (REFUSE_CODE);

--12.待处理件人员分配日累计表
CREATE TABLE LB_T_PERSON_ALLOT_MULATE
    (
        ID NUMBER(22) NOT NULL,
        ROLE_NAME VARCHAR2(64),
        USER_ID NUMBER(22),
        ALLOT_AMOT NUMBER(10),
        ALLOT_DATE DATE,
        CREATE_BY NUMBER(22),
        CREATE_TIME TIMESTAMP(6) DEFAULT SYSDATE,
        MODIFY_BY NUMBER(22),
        MODIFY_TIME TIMESTAMP(6),
        VALIDATE_STATE VARCHAR2(2) DEFAULT '1',
        CONSTRAINT PK_LB_T_PERSON_ALLOT_MULATE PRIMARY KEY (ID)
    );
COMMENT ON COLUMN LB_T_PERSON_ALLOT_MULATE.ROLE_NAME
IS
    '角色名称';
COMMENT ON COLUMN LB_T_PERSON_ALLOT_MULATE.USER_ID
IS
    '用户ID';
COMMENT ON COLUMN LB_T_PERSON_ALLOT_MULATE.USER_NAME
IS
    '用户名称';
COMMENT ON COLUMN LB_T_PERSON_ALLOT_MULATE.ALLOT_AMOT
IS
    '分配数量';
COMMENT ON COLUMN LB_T_PERSON_ALLOT_MULATE.ALLOT_DATE
IS
    '分配日期';
COMMENT ON COLUMN LB_T_PERSON_ALLOT_MULATE.CREATE_BY
IS
    '创建人';
COMMENT ON COLUMN LB_T_PERSON_ALLOT_MULATE.CREATE_TIME
IS
    '创建时间';
COMMENT ON COLUMN LB_T_PERSON_ALLOT_MULATE.MODIFY_BY
IS
    '修改人';
COMMENT ON COLUMN LB_T_PERSON_ALLOT_MULATE.MODIFY_TIME
IS
    '修改时间';
COMMENT ON COLUMN LB_T_PERSON_ALLOT_MULATE.VALIDATE_STATE
IS
    '是否有效';

 
 --13. 决策系统接口日志表备份表
create table LBT_DECISION_INTERFACE_LOG_HIS
(
  id            NUMBER(18) not null,
  req_trans_no  VARCHAR2(50),
  interface_no  VARCHAR2(20),
  business_code VARCHAR2(20),
  req_time      TIMESTAMP(6),
  ret_trans_no  VARCHAR2(50),
  ret_code      VARCHAR2(10),
  ret_msg       CLOB,
  ret_time      TIMESTAMP(6),
  req_body      CLOB,
  ret_body      CLOB
);
-- Add comments to the table 
comment on table LBT_DECISION_INTERFACE_LOG_HIS
  is '决策系统接口日志表';
-- Add comments to the columns 
comment on column LBT_DECISION_INTERFACE_LOG_HIS.id
  is '主键';
comment on column LBT_DECISION_INTERFACE_LOG_HIS.req_trans_no
  is '请求交易流水号';
comment on column LBT_DECISION_INTERFACE_LOG_HIS.interface_no
  is '接口编码';
comment on column LBT_DECISION_INTERFACE_LOG_HIS.business_code
  is '业务编码';
comment on column LBT_DECISION_INTERFACE_LOG_HIS.req_time
  is '请求时间';
comment on column LBT_DECISION_INTERFACE_LOG_HIS.ret_trans_no
  is '返回交易流水号';
comment on column LBT_DECISION_INTERFACE_LOG_HIS.ret_code
  is '返回码';
comment on column LBT_DECISION_INTERFACE_LOG_HIS.ret_msg
  is '返回信息';
comment on column LBT_DECISION_INTERFACE_LOG_HIS.ret_time
  is '返回时间';
comment on column LBT_DECISION_INTERFACE_LOG_HIS.req_body
  is '请求报文体';
comment on column LBT_DECISION_INTERFACE_LOG_HIS.ret_body
  is '返回报文体';
  
 
--1.批贷额度权限配置角色表序列
CREATE SEQUENCE SEQ_LB_T_APAL_QTA_RLE_CFG 
INCREMENT BY 1 START WITH 1 
MAXVALUE 9999999999999999999999999999 
MINVALUE 1 
NOCYCLE CACHE 20 NOORDER ;

--2.批贷额度权限配置人员产品表序列
CREATE SEQUENCE SEQ_LB_T_APAL_QTA_OPER_CFG 
INCREMENT BY 1 START WITH 1 
MAXVALUE 9999999999999999999999999999 
MINVALUE 1 
NOCYCLE CACHE 20 NOORDER ;

--3.待处理件人工分配操作日志表序列
CREATE SEQUENCE SEQ_LB_T_HANDTASK_ALLOT_LOG
INCREMENT BY 1 START WITH 1 
MAXVALUE 9999999999999999999999999999 
MINVALUE 1 
NOCYCLE CACHE 20 NOORDER  ; 

--4.上报批贷建议表序列
create sequence seq_LB_T_UP_REPORT_COMMENT
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1;

--5.三方数据（含规则校验）接口日志表序列
create sequence seq_LBT_THIRD_INTERFACE_LOG
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1;

--6.决策系统接口日志表序列
create sequence SEQ_LBT_DECISION_INTERFACE_LOG
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1;

--7.决策模块类型表序列
create sequence  SEQ_LBT_DECISION_MODULE_TYPE
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1;

--8.决策查询配置表序列
create sequence   seq_LBT_DECISION_SQL_CONF
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1;

--9.决策系统总评分表序列
create sequence seq_LB_T_CARD_PMSCORE_TOTAL
minvalue 1
maxvalue 999999999999999999999999999
start with 1
increment by 1
cache 100;

--10.决策评分详情表序列
create sequence seq_LB_T_CARD_PMSCORE_DETAIL
minvalue 1
maxvalue 999999999999999999999999999
start with 1
increment by 1
cache 100;

--11.反欺诈业务提报表序列
create sequence SEQ_LBT_ANTI_TO_HUMAN
minvalue 1
maxvalue 999999999999999999999999999
start with 1
increment by 1
nocache;

--12.拒贷参数(稽核)表序列
create sequence seq_LB_T_AUD_REFUSE_LOAN_CONF
minvalue 1
maxvalue 9999999999999999999999999999
start with 100
increment by 1;

--13.待处理件人员分配日累计表序列
CREATE SEQUENCE SEQ_LB_T_PERSON_ALLOT_MULATE 
INCREMENT BY 1 START WITH 1 
MAXVALUE 9999999999999999999999999999 
MINVALUE 1 
NOCYCLE CACHE 20 NOORDER ;


--根据地区编码获取省份函数(创建函数)
create or replace function getProvince(areaCode in varchar2) return varchar2 is

province varchar2(60);
parent_id number;
v_areaCode varchar2(60);
x number;
begin
  x:=0;
  parent_id:=0;
  v_areaCode :=areaCode;
  while x<1 loop

  select  a.area_name into province  from sys_area a where a.area_code=v_areaCode;
  select   a.parent_id into parent_id from sys_area a where a.area_code=v_areaCode;

  if parent_id<=0 then x:=1;
   else v_areaCode:=parent_id;
  end if; 
  end loop;

  return( province);

end;
 