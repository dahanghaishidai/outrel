package com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyinfo.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.td.extwltdhitrules.dto.ExtWlTdHitRulesDTO;
import com.jy.modules.externalplatform.interfacerepository.td.extwltdhitrules.service.ExtWlTdHitRulesService;
import com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyinfo.dao.ExtWlTdPolicyInfoDao;
import com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyinfo.dto.ExtWlTdPolicyInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyset.dto.ExtWlTdPolicySetDTO;
import com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyset.service.ExtWlTdPolicySetService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: ExtWlTdPolicyInfoService
 * @package: com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyinfo.service
 * @describe: 定义  同盾_TDRC决策引擎信息主表 实现类
 * @auther: 董康宁
 * @date: 2017/12/20
 * @time: 20:34
 */
@Service("com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyinfo.service.ExtWlTdPolicyInfoService")
public class ExtWlTdPolicyInfoService implements Serializable, ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;

    @Autowired
    ExtInterfaceLogService extInterfaceLogService;

    @Autowired
    ExtWlTdPolicySetService extWlTdPolicySetService;

    @Autowired
    ExtWlTdHitRulesService extWlTdHitRulesService;

    @Autowired
	private ExtWlTdPolicyInfoDao dao;



	/**
	 * @methodName: insertExtWlTdPolicyInfo
	 * @param: [dto]
	 * @describe: 新增 同盾_TDRC决策引擎信息主表对象
	 * @auther: huangxianchao
	 * @date: 2018/1/25 0025
	 * @time: 上午 10:34
	 **/
	@SuppressWarnings("all")
	public Long insertExtWlTdPolicyInfo(ExtWlTdPolicyInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlTdPolicyInfo(paramMap);
		
		ExtWlTdPolicyInfoDTO resultDto = (ExtWlTdPolicyInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}


	/**
	 * @methodName: saveMessage
	 * @param: [map]
	 * @describe: 同盾_TDRC决策引擎（征信分数） 数据落地
	 * @auther: huangxianchao
	 * @date: 2018/1/25 0025
	 * @time: 上午 10:35
	 **/
    @Override
    public void saveMessage(Map<String, Object> map) {
        String isSuccess = "0";//是否调用成功  1：成功 0：失败
        String retCode = "";//接口返回码
        String retMsg = "";//接口返回信息
        String fkBizId = "";//接口落地数据主表ID
        //日志信息
        ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
        String result = String.valueOf(map.get("result"));

        try {

            if(StringUtils.isEmpty(result)){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("查询同盾_TDRC决策引擎查询获取接口返回报文为空！");
            }else if(result.contains("Read timed out")){
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
                interfaceLogDto.setRetMsg("查询同盾_TDRC决策引擎查询获取接口 访问超时！");
            }else{

                //将返回报文转换为jsonObject 对象
                JSONObject resultJson = JSONObject.parseObject(result);

                //设置 返回码
                retCode = resultJson.getString("success");//返回码
                if(null != resultJson.get("reason_code"))
                    retMsg = resultJson.getString("reason_code");//success为false的情况下对应错误码


                //true 查询成功
                if("true".equals(retCode)){
                    isSuccess = "1";

                    //保存 同盾_TDRC决策引擎
                    ExtWlTdPolicyInfoDTO dto = new ExtWlTdPolicyInfoDTO();
                    dto.setSuccess(retCode);
                    dto.setReasonCode(retMsg);
                    dto.setSeqId(resultJson.getString("seq_id"));//本次调用产生的唯一性SequenceID
                    dto.setSpendTime(resultJson.getLongValue("spend_time"));//本次调用在服务端的执行时间(毫秒)
                    dto.setFinalDecision(resultJson.getString("final_decision"));//风险决策结果(Accept、Review、Reject三种值)
                    dto.setFinalScore(resultJson.getLongValue("final_score"));//风险决策分数(范围1~65535)
                    dto.setPolicySetName(resultJson.getString("policy_set_name"));//策略集名称
                    dto.setPolicyName(resultJson.getString("policy_name"));//与policy_set中的policy_name内容相同，为了向前兼容
                    dto.setRiskType(resultJson.getString("risk_type"));//风险类型
                    dto.setCreateBy(-1L);

                    //插入 同盾_TDRC决策引擎主表
                    Long keyId  = this.insertExtWlTdPolicyInfo(dto);
                    if(null != keyId)
                        fkBizId = keyId.toString();

                    // 保存 命中规则
                    if(null != resultJson.get("hit_rules")){

                        JSONArray hitRulesArray = resultJson.getJSONArray("hit_rules");
                        saveHitRules(hitRulesArray,keyId,null,"hit");
                    }

                    // 保存 命中策略集
                    if(null != resultJson.get("policy_set")){

                        JSONArray policySetArray = resultJson.getJSONArray("policy_set");
                        for(int i = 0; i < policySetArray.size(); i ++){
                            JSONObject policySetObj = policySetArray.getJSONObject(i);

                            //同盾_TDRC决策引擎命中策略集表
                            ExtWlTdPolicySetDTO setDTO = new ExtWlTdPolicySetDTO();
                            setDTO.setFkPolicyId(keyId);
                            setDTO.setPolicyDecision(policySetObj.getString("policy_decision"));
                            setDTO.setRiskType(policySetObj.getString("risk_type"));
                            setDTO.setPolicyMode(policySetObj.getString("policy_mode"));
                            setDTO.setPolicyName(policySetObj.getString("policy_name"));
                            setDTO.setPolicyScore(policySetObj.getLongValue("policy_score"));
                            setDTO.setPolicyUuid(policySetObj.getString("policy_uuid"));
                            setDTO.setCreateBy(-1L);

                            Long fkPoSetId = extWlTdPolicySetService.insertExtWlTdPolicySet(setDTO);
                            if (null != policySetObj.get("hit_rules")){
                                JSONArray policySetHitRulesArray = policySetObj.getJSONArray("hit_rules");
                                //同盾_TDRC决策引擎命中命中规则详情表
                                saveHitRules(policySetHitRulesArray,null, fkPoSetId,"policy");
                            }
                        }
                    }

                    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
                    interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());

                }else{

                    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
                    interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
                }
            }

        } catch (Exception ex) {
            JYLoggerUtil.error(this.getClass(), "===查询同盾_TDRC决策引擎查询获取接口异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), ex);
            interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
            interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());

        } finally{
            try {
                interfaceLogDto.setRetBody(result);
                interfaceLogDto.setExt2(isSuccess);
                interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt4(retMsg);
                interfaceLogDto.setExt5(fkBizId);
                Long keyId = extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
            } catch (Exception e) {
                JYLoggerUtil.error(this.getClass(), "===保存同盾_TDRC决策引擎查询获取日志异常===接口交易流水号:"+interfaceLogDto.getReqTransNo(), e);
            }
        }
    }
    
    /**
     * @methodName: saveHitRules
     * @param: [jsonObject, hitPolicy]
     * @describe: 保存同盾_TDRC决策引擎命中规则详情
     * @auther: huangxianchao
     * @date: 2018/1/24 0024
     * @time: 下午 4:42
     **/
    private void saveHitRules(JSONArray hitRulesArray, Long fkPolicyId, Long fkPoSetId, String hitPolicy) throws Exception{

        for(int i = 0; i < hitRulesArray.size(); i ++){
            JSONObject hitRulesObj = hitRulesArray.getJSONObject(i);

            ExtWlTdHitRulesDTO hitRulesDTO = new ExtWlTdHitRulesDTO();
            hitRulesDTO.setFkPolicyId(fkPolicyId);
            hitRulesDTO.setFkPoSetId(fkPoSetId);
            hitRulesDTO.setHitPolicy(hitPolicy);
            hitRulesDTO.setRetId(hitRulesObj.getString("id"));
            hitRulesDTO.setParentUuid(hitRulesObj.getString("parentUuid"));
            hitRulesDTO.setName(hitRulesObj.getString("name"));
            hitRulesDTO.setScore(hitRulesObj.getLongValue("score"));
            hitRulesDTO.setUuid(hitRulesObj.getString("uuid"));
            hitRulesDTO.setDecision(hitRulesObj.getString("decision"));
            hitRulesDTO.setCreateBy(-1L);

            extWlTdHitRulesService.insertExtWlTdHitRules(hitRulesDTO);
        }

    }
    
}

