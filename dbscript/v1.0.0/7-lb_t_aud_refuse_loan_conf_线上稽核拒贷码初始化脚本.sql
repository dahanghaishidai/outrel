
insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (0, 'ROOT', '拒贷参数(稽核)', -1, '1', 1, '根节点');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (2, 'A1', '规定', 0, '1', 1, '规定');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (3, 'A2', '工具使用', 0, '1', 2, '工具使用');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (4, 'A101', '辱骂客户，与客户产生激烈言辞对峙，引起客户不满情绪', 2, '1', 101, 'A101');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (5, 'A102', '编造报告：未进行调查或录音得知调查内容与报告不一致，报告明显为编造', 2, '1', 102, 'A102');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (6, 'A103', '明显诱导申请人或联系人向限制性行业或限制性用途上靠拢，并对申请人做拒贷处理', 2, '1', 103, 'A103');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (7, 'A104', '向客户透露我公司审核标准及其他内部审核流程', 2, '1', 104, 'A104');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (8, 'A105', '向客户承诺批核时间、金额等', 2, '1', 105, 'A105');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (9, 'A106', '向非相关联系人透露申请人私人信息，引起申请人不满', 2, '1', 106, 'A106');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (10, 'A107', '未以公司名义进行调查，为排除异常信息情况除外', 2, '1', 107, 'A107');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (11, 'A108', '向被调查人透漏申请人办理借款业务或提供申请人办理贷款业务，此项含变相透漏', 2, '1', 108, 'A108');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (12, 'A201', '未正确使用静音功能，通话/通话等待过程中，吃东西、唱歌、与他人谈论与工作无关的事情等导致异常声音出现。', 3, '1', 201, 'A201');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (13, 'B1', '系统提示信息', 0, '1', 3, 'B1');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (14, 'B101', '内部匹配信息异常，未正确关注及处理', 13, '1', 101, 'B101');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (15, 'B102', '历史借贷信息异常，未正确关注及处理', 13, '1', 102, 'B102');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (16, 'B103', '上海资信信息异常，未正确关注及处理', 13, '1', 103, 'B103');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (17, 'B104', '上海资信接口异常，未备注查询结果', 13, '1', 104, 'B104');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (18, 'B105', '反欺诈备注风险提示信息，未正确关注及处理', 13, '1', 105, 'B105');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (19, 'B106', '门店备注的提示信息未正确关注及处理', 13, '1', 106, 'B106');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (20, 'B107', '元素显示自营信息，未正确关注及处理，影响审批结果', 13, '1', 107, 'B107');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (21, 'B108', '汇法网有执行，达到拒绝标准，未关注', 13, '1', 108, 'B108');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (22, 'B109', '汇法网有失信、案例、税务、催欠公告等信息，未正确关注处理', 13, '1', 109, 'B109');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (23, 'B110', '汇法网有执行，未达到拒绝标准，照会未核实', 13, '1', 110, 'B110');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (24, 'B2', '人法网', 0, '1', 4, 'B2');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (25, 'B3', '工商网', 0, '1', 5, 'B3');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (26, 'B4', '资料认定', 0, '1', 6, 'B4');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (27, 'C1', '三方调查', 0, '1', 7, 'C1');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (28, 'C2', '收入/负债', 0, '1', 8, 'C2');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (29, 'C3', '电话调查', 0, '1', 9, 'C3');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (30, 'C4', '批贷', 0, '1', 10, 'C4');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (31, 'C5', '拒贷', 0, '1', 11, 'C5');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (32, 'D1', '系统处理', 0, '1', 12, 'D1');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (33, 'D2', '沟通技巧及态度', 0, '1', 13, 'D2');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (34, 'E1', '临时政策', 0, '1', 14, 'E1');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (35, 'E101', '不符合现行的临时政策审批标准', 34, '1', 101, 'E101');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (36, 'E102', '短期执行规范期间，批贷情况不符常规执行规范的，短规批号未记录/记录错误', 34, '1', 102, 'E102');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (37, 'D201', '电核态度生硬、冷淡或过于谄、说脏话', 33, '1', 201, 'D201');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (38, 'D202', '开头语、结束语不完整', 33, '1', 202, 'D202');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (39, 'D203', '未使用敬称，如您，您好', 33, '1', 203, 'D203');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (40, 'D204', '抢话、无原因让客户等待，或接听者配合的情况下，无故主动挂断电话', 33, '1', 204, 'D204');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (41, 'D205', '在客户明确告知不方便接听电话，稍后拨打时，强迫申请人进行沟通', 33, '1', 205, 'D205');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (42, 'D206', '因任何原因，导致客户投诉，经审核，投诉成功', 33, '1', 206, 'D206');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (43, 'D207', '报告对申请人的综合评价不够客观、对异常信息判断不够准确', 33, '1', 207, 'D207');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (44, 'D101', '电核报告/初定报告未按要求的位置进行记录', 32, '1', 101, 'D101');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (45, 'D102', '初定报告不完整或不正确，影响终审批贷', 32, '1', 102, 'D102');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (46, 'D103', '初定报告不正确、不完整，不影响终审批贷', 32, '1', 103, 'D103');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (47, 'D104', '报告错别字5个以上', 32, '1', 104, 'D104');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (48, 'D105', '回退处理不恰当，可一次性补充资料的情况，分多次补充', 32, '1', 105, 'D105');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (49, 'D106', '回退补件不合理', 32, '1', 106, 'D106');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (50, 'D107', '回退门店补件描述不明确、有歧义、不规范', 32, '1', 107, 'D107');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (51, 'D108', '系统应作点选的未做点选处理、点选错误或信息粘取错误', 32, '1', 108, 'D108');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (52, 'D109', '未输入审核界面对应的“核算月收入”字段', 32, '1', 109, 'D109');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (53, 'D110', '系统录入的联系方式错误，未关注及更改', 32, '1', 110, 'D110');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (54, 'B201', '查错/未查询申请人、配偶人法网，含本人及爱人名下的公司', 24, '1', 201, 'B201');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (55, 'B202', '人法网有执行，未达到拒绝标准（执行中金额小于1000)，照会未核实	', 24, '1', 202, 'B202');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (56, 'B203', '人法网有执行，达到拒绝标准，未关注', 24, '1', 203, 'B203');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (57, 'B301', '已查工商网，对异常信息未关注及正确处理', 25, '1', 301, 'B301');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (58, 'B302', '未查询/错误查询工商网（申请人所在单位含爱人为公司法人或股东）	', 25, '1', 302, 'B302');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (59, 'B401', '系统中客户信息录入错误，未正确关注及处理', 26, '1', 401, 'B401');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (60, 'B402', '各产品必附资料不全，未关注', 26, '1', 402, 'B402');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (61, 'B403', '各产品必附资料无效或失效，未关注', 26, '1', 403, 'B403');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (62, 'C101', '联系电话，未进行第三方核查', 27, '1', 101, 'C101');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (63, 'C102', '资料审核、调查中获取的其它联系电话，未进行有效拨打、查询及录入', 27, '1', 102, 'C102');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (64, 'C103', '针对电话三方网查或核实中出现的异常，未正确关注及处理', 27, '1', 103, 'C103');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (65, 'C201', '工资核算收入错误且金额大于200元', 28, '1', 201, 'C201');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (66, 'C202', '个人储蓄流水收入核算错误且金额大于正确值的10%。', 28, '1', 202, 'C202');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (67, 'C203', '负债（人行、上海资信、流水及照会告知）核算错误且金额大于500元。	', 28, '1', 203, 'C203');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (68, 'C501', '拒绝不合理', 31, '1', 501, 'C501');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (69, 'C502', '拒绝不严谨', 31, '1', 502, 'C502');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (70, 'C503', '一级/二级拒绝原因选错		', 31, '1', 503, 'C503');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (71, 'C401', '批贷不合理', 30, '1', 401, 'C401');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (72, 'C402', '未按大纲操作或执行规范批贷', 30, '1', 402, 'C402');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (73, 'C403', '批贷产品、类型、期限和金额明显错误', 30, '1', 403, 'C403');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (74, 'C405', '通过核准码选错', 30, '1', 405, 'C405');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (75, 'C301', '照会未核申请表是否本人填写、签字', 29, '1', 301, 'C301');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (76, 'C302', '未确认客户身份（18位身份证号/生日+属相/身份证后4位）', 29, '1', 302, 'C302');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (77, 'C303', '照会未核申请人借款用途、可承受月还金额、其它机构借款等信息', 29, '1', 303, 'C303');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (78, 'C304', '未进行还款账户提示', 29, '1', 304, 'C304');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (79, 'C305', '其它未按照执行规范规定的必核信息核实', 29, '1', 305, 'C305');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (80, 'C306', '电核均采用封闭式询问', 29, '1', 306, 'C306');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (81, 'C307', '引导式询问', 29, '1', 307, 'C307');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (82, 'C308', '报告未记录异常点及排查情况，影响审批结果', 29, '1', 308, 'C308');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (83, 'C309', '报告记录与录音明显不符', 29, '1', 309, 'C309');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (84, 'C310', '错误核对申请人或联系人姓名或其他有效信息（不含虚假测试），且整通面审或调查电话均未纠正', 29, '1', 310, 'C310');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (85, 'C311', '在调查正常的情况下进行虚假测试', 29, '1', 311, 'C311');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (86, 'C312', '拨打申请表联系方式无效，与本人核实更正后，仍拨打无效电话进行审核', 29, '1', 312, 'C312');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (87, 'C313', '三方不一致电话未优先拨打', 29, '1', 313, 'C313');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (88, 'C314', '电话调查数量不够', 29, '1', 314, 'C314');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (89, 'C315', '调查时间、次数不符合执行规范要求（包括循环贷和补件调查）', 29, '1', 315, 'C315');

insert into lb_t_aud_refuse_loan_conf (ID, REFUSE_CODE, REFUSE_REASON, PARENT_ID, VALIDATE_STATE, SHOW_ORDER, EXPLANATION)
values (90, 'C316', '资料/电话调查中出现的异常点未有效关注并排查	', 29, '1', 316, 'C316');


