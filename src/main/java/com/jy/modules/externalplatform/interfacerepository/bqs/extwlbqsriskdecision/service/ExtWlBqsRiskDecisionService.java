package com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsriskdecision.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsriskdecision.dao.ExtWlBqsRiskDecisionDao;
import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsriskdecision.dto.ExtWlBqsRiskDecisionDTO;
import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsrulecontent.dto.ExtWlBqsRuleContentDTO;
import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsrulecontent.service.ExtWlBqsRuleContentService;
import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsruledetails.dto.ExtWlBqsRuleDetailsDTO;
import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsruledetails.service.ExtWlBqsRuleDetailsService;
import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsstrategyset.dto.ExtWlBqsStrategySetDTO;
import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsstrategyset.service.ExtWlBqsStrategySetService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @classname: ExtWlBqsRiskDecisionService
 * @description: 定义  白骑士反欺诈云风险决策（主表） 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsriskdecision.service.ExtWlBqsRiskDecisionService")
public class ExtWlBqsRiskDecisionService implements Serializable, ExtSaveMessageDao {

	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	@Autowired
	private ExtInterfaceLogService extInterfaceLogService;

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlBqsRiskDecisionDao dao;
	@Autowired
	private ExtWlBqsStrategySetService extWlBqsStrategySetService;
	@Autowired
	private ExtWlBqsRuleContentService extWlBqsRuleContentService;
	@Autowired
	private ExtWlBqsRuleDetailsService extWlBqsRuleDetailsService;

	/**
     * @author Administrator
     * @description: 分页查询 白骑士反欺诈云风险决策（主表）列表
     * @date 2017-12-20 11:27:23
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBqsRiskDecisionDTO> searchExtWlBqsRiskDecisionByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBqsRiskDecisionDTO> dataList =  dao.searchExtWlBqsRiskDecisionByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询白骑士反欺诈云风险决策（主表）列表
     * @date 2017-12-20 11:27:23
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBqsRiskDecisionDTO> searchExtWlBqsRiskDecision(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBqsRiskDecisionDTO> dataList = dao.searchExtWlBqsRiskDecision(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询白骑士反欺诈云风险决策（主表）对象
     * @date 2017-12-20 11:27:23
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBqsRiskDecisionDTO queryExtWlBqsRiskDecisionByPrimaryKey(String id) throws Exception {
		
		ExtWlBqsRiskDecisionDTO dto = dao.findExtWlBqsRiskDecisionByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBqsRiskDecisionDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBqsRiskDecision
     * @author Administrator
     * @description: 新增 白骑士反欺诈云风险决策（主表）对象
     * @date 2017-12-20 11:27:23
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBqsRiskDecision(ExtWlBqsRiskDecisionDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBqsRiskDecision(paramMap);
		
		ExtWlBqsRiskDecisionDTO resultDto = (ExtWlBqsRiskDecisionDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBqsRiskDecision
     * @author Administrator
     * @description: 修改 白骑士反欺诈云风险决策（主表）对象
     * @date 2017-12-20 11:27:23
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlBqsRiskDecision(ExtWlBqsRiskDecisionDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBqsRiskDecision(paramMap);
	}
	/**
     * @title: deleteExtWlBqsRiskDecisionByPrimaryKey
     * @author Administrator
     * @description: 删除 白骑士反欺诈云风险决策（主表）,按主键
     * @date 2017-12-20 11:27:23
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlBqsRiskDecisionByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBqsRiskDecisionByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 白骑士反欺诈云风险决策 接口数据落地
	 * @auther: huangxianchao
	 * @date: 2017/12/20 0020
	 * @time: 上午 11:33
	 **/
	@Override
	public void saveMessage(Map<String, Object> map) {
		String isSuccess = "0";
		String retCode = "";
		String retMsg = "";
		String fkBizId = "";

		//日志信息
		ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results = (String)map.get("result");

		try{
			if(null == map.get("intoCustomerRefId")){
				map.put("intoCustomerRefId", "");//非贷款系统调用，这个没有值
			}
			if (StringUtils.isNotEmpty(results)){//有报文返回
				ExtWlBqsRiskDecisionDTO riskDecisionDto = new ExtWlBqsRiskDecisionDTO();
				if (null == map.get("intoCustomerRefId")){
					riskDecisionDto.setIntoCustRefId(Long.parseLong(map.get("intoCustomerRefId").toString()));
				}

				JSONObject retOb = JSONObject.parseObject(results);
				if (null != retOb.get("resultCode")){
					riskDecisionDto.setResultCode(retOb.get("resultCode").toString());
					retCode = retOb.get("resultCode").toString();
				}
				if (null != retOb.get("resultDesc")){
					riskDecisionDto.setResultDesc(retOb.get("resultDesc").toString());
					retMsg = retOb.get("resultDesc").toString();
				}
				if (null != retOb.get("flowNo")){
					riskDecisionDto.setFlowNo(retOb.get("flowNo").toString());

				}
				if (null != retOb.get("finalDecision")){

					riskDecisionDto.setFinalDecision(retOb.get("finalDecision").toString());
				}
				if (null != retOb.get("finalScore")){

					riskDecisionDto.setFinalScore(retOb.get("finalScore").toString());
				}

				Long keyId = this.insertExtWlBqsRiskDecision(riskDecisionDto);
				if (null != keyId){
					fkBizId = String.valueOf(keyId);
				}

				if ("BQS000".equals(retCode)){//调用成功
					isSuccess = "1";
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());

					//保存策略集合
					if (null != retOb.get("strategySet")){
						JSONArray strategySet = JSONObject.parseArray(retOb.get("strategySet").toString());
						if (null != strategySet && strategySet.size() > 0){
							for (int i = 0; i < strategySet.size(); i++) {
								if (null != strategySet.get(i)){
									JSONObject strategy = JSONObject.parseObject(strategySet.get(i).toString());
									ExtWlBqsStrategySetDTO strategySetDto = new ExtWlBqsStrategySetDTO();
									//保存关联ID
									strategySetDto.setRiskDescId(keyId);
									if (null != strategy.get("strategyName")){
										strategySetDto.setStrategyName(strategy.get("strategyName").toString());
									}
									if (null != strategy.get("strategyId")){
										strategySetDto.setStrategyId(strategy.get("strategyId").toString());
									}
									if (null != strategy.get("strategyDecision")){
										strategySetDto.setStrategyDecision(strategy.get("strategyDecision").toString());
									}
									if (null != strategy.get("strategyMode")){
										strategySetDto.setStrategyMode(strategy.get("strategyMode").toString());
									}
									if (null != strategy.get("strategyScore")){
										strategySetDto.setStrategyScore(strategy.get("strategyScore").toString());
									}
									if (null != strategy.get("rejectValue")){
										strategySetDto.setRejectValue(strategy.get("rejectValue").toString());
									}
									if (null != strategy.get("reviewValue")){
										strategySetDto.setReviewValue(strategy.get("reviewValue").toString());
									}
									if (null != strategy.get("riskType")){
										strategySetDto.setRiskType(strategy.get("riskType").toString());
									}
									if (null != strategy.get("tips")){
										strategySetDto.setTips(strategy.get("tips").toString());
									}
									//插入数据
									Long strategySetId = extWlBqsStrategySetService.insertExtWlBqsStrategySet(strategySetDto);

									//保存规则内容数据
									if (null != strategy.get("hitRules")){
										JSONArray hitRules = JSONObject.parseArray(strategy.get("hitRules").toString());
										if (null != hitRules && hitRules.size() > 0){
											for (int j = 0; j < hitRules.size(); j++) {
												if (null != hitRules.get(j)){
													JSONObject hitRule = JSONObject.parseObject(hitRules.get(j).toString());
													ExtWlBqsRuleContentDTO ruleContentDto = new ExtWlBqsRuleContentDTO();
													//保存关联ID
													ruleContentDto.setStrategySetId(strategySetId);
													if (null != hitRule.get("ruleName")){
														ruleContentDto.setRuleName(hitRule.get("ruleName").toString());
													}
													if (null != hitRule.get("ruleId")){
														ruleContentDto.setRuleId(hitRule.get("ruleId").toString());
													}
													if (null != hitRule.get("score")){
														ruleContentDto.setScore(hitRule.get("score").toString());
													}
													if (null != hitRule.get("decision")){
														ruleContentDto.setDecision(hitRule.get("decision").toString());
													}
													if (null != hitRule.get("memo")){
														ruleContentDto.setMemo(hitRule.get("memo").toString());
													}
													if (null != hitRule.get("template")){
														ruleContentDto.setTemplateType(hitRule.get("template").toString());
													}
													//插入数据
													Long ruleContentId = extWlBqsRuleContentService.insertExtWlBqsRuleContent(ruleContentDto);

													//保存规则明细 数据
													if (null != hitRule.get("detail")){
														JSONArray details = JSONObject.parseArray(hitRule.get("detail").toString());
														if (null != details && details.size() > 0){
															for (int k = 0; k < details.size(); k++) {
																if (null != details.get(k)){
																	JSONObject detail = JSONObject.parseObject(details.get(k).toString());
																	ExtWlBqsRuleDetailsDTO ruleDetailsDto = new ExtWlBqsRuleDetailsDTO();
																	//插入关联ID
																	ruleDetailsDto.setRuleContentId(ruleContentId);
																	if (null != detail.get("firstType")){
																		ruleDetailsDto.setFirstType(detail.get("firstType").toString());
																	}
																	if (null != detail.get("grade")){
																		ruleDetailsDto.setGrade(detail.get("grade").toString());
																	}
																	if (null != detail.get("secondType")){
																		ruleDetailsDto.setSecondType(detail.get("secondType").toString());
																	}
																	if (null != detail.get("name")){
																		ruleDetailsDto.setName(detail.get("name").toString());
																	}
																	if (null != detail.get("type")){
																		ruleDetailsDto.setType(detail.get("type").toString());
																	}
																	if (null != detail.get("value")){
																		ruleDetailsDto.setValue(detail.get("value").toString());
																	}
																	//插入数据
																	extWlBqsRuleDetailsService.insertExtWlBqsRuleDetails(ruleDetailsDto);

																}

															}
														}

													}

												}
											}

										}
									}

								}

							}
						}

					}

				}else {
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg("调用白骑士反欺诈云风险决策返回错误信息");
				}

			}else{//无报文返回

				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("调用白骑士反欺诈云风险决策查无");
			}

		}catch (Exception e){
			JYLoggerUtil.error(this.getClass(), "===保存白骑士反欺诈云风险决策日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());//解析回参出错
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());

		}finally {
			try {

				interfaceLogDto.setRetBody(results);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
				interfaceLogDto.setExt4(retMsg);
				interfaceLogDto.setExt5(fkBizId);//管理主表ID
				extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);

			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存白骑士反欺诈云风险决策日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}

		}

	}
}

