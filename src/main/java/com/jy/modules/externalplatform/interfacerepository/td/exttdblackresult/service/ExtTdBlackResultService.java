package com.jy.modules.externalplatform.interfacerepository.td.exttdblackresult.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jodd.util.StringUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.td.exttdblackhitrules.dto.ExtTdBlackHitRulesDTO;
import com.jy.modules.externalplatform.interfacerepository.td.exttdblackhitrules.service.ExtTdBlackHitRulesService;
import com.jy.modules.externalplatform.interfacerepository.td.exttdblackresult.dao.ExtTdBlackResultDao;
import com.jy.modules.externalplatform.interfacerepository.td.exttdblackresult.dto.ExtTdBlackResultDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtTdBlackResultService
 * @description: 定义  同盾黑名单查询结果表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.td.exttdblackresult.service.ExtTdBlackResultService")
public class ExtTdBlackResultService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
	@Autowired
	private ExtTdBlackResultDao dao;
	@Autowired
	private ExtTdBlackHitRulesService extTdBlackHitRulesService;

	/**
     * @author Administrator
     * @description: 分页查询 同盾黑名单查询结果表列表
     * @date 2017-06-02 14:55:58
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtTdBlackResultDTO> searchExtTdBlackResultByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtTdBlackResultDTO> dataList =  dao.searchExtTdBlackResultByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询同盾黑名单查询结果表列表
     * @date 2017-06-02 14:55:58
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtTdBlackResultDTO> searchExtTdBlackResult(Map<String,Object> searchParams) throws Exception {
	    List<ExtTdBlackResultDTO> dataList = dao.searchExtTdBlackResult(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询同盾黑名单查询结果表对象
     * @date 2017-06-02 14:55:58
     * @param id
     * @return
     * @throws
     */ 
	public ExtTdBlackResultDTO queryExtTdBlackResultByPrimaryKey(String id) throws Exception {
		
		ExtTdBlackResultDTO dto = dao.findExtTdBlackResultByPrimaryKey(id);
		
		if(dto == null) dto = new ExtTdBlackResultDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtTdBlackResult
     * @author Administrator
     * @description: 新增 同盾黑名单查询结果表对象
     * @date 2017-06-02 14:55:58
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtTdBlackResult(ExtTdBlackResultDTO dto,ExtInterfaceLogDTO interfaceLogDto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		dto.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
	    dto.setRemark("调用同盾黑名单接口查有");
		interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
		interfaceLogDto.setRetMsg("调用同盾黑名单接口查有");
		paramMap.put("dto", dto);
		
		int count = dao.insertExtTdBlackResult(paramMap);
		
		ExtTdBlackResultDTO resultDto = (ExtTdBlackResultDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtTdBlackResult
     * @author Administrator
     * @description: 修改 同盾黑名单查询结果表对象
     * @date 2017-06-02 14:55:58
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtTdBlackResult(ExtTdBlackResultDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtTdBlackResult(paramMap);
	}
	/**
     * @title: deleteExtTdBlackResultByPrimaryKey
     * @author Administrator
     * @description: 删除 同盾黑名单查询结果表,按主键
     * @date 2017-06-02 14:55:58
     * @param paramMap
     * @throws
     */ 
	public void deleteExtTdBlackResultByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtTdBlackResultByPrimaryKey(paramMap);
	}

	/**
	 * 接收数据保存
	 * @param map
	 */
	public void saveMessage(Map<String,Object> map){
		String isSuccess = "0";//是否调用成功 1：成功 0：失败
        String retCode = "";//接口返回码
        String retMsg = "";//接口返回信息
        String fkBizId = "";// 关联字段
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results=String.valueOf(map.get("result"));
		Map<String, Object> params=new HashMap<String,Object>();
		ExtTdBlackResultDTO dto = new ExtTdBlackResultDTO();
		dto.setProdCode(String.valueOf(map.get("prod")));
		dto.setOrgCode(String.valueOf(map.get("org")));
		dto.setSysCode(String.valueOf(map.get("sysCode")));
		dto.setCardId(String.valueOf(map.get("id_number")));
    	String finalDecision = null;
    	String finalScore = null;
    	String policySetName = null;
    	String treatResult = null;
    	String treatErrorCode = null;
    	String errorMessage = null;
    	JSONObject json = null;
    	try {
			try {
				if(StringUtils.isNotEmpty((CharSequence) map.get("result")) && !"null".equals(map.get("result"))){
					json = JSONObject.fromObject(map.get("result"));
					if(null!=json.get("retCode") && json.get("retCode").equals("500")){
						 dto.setRetcode(InterfaceEnum.RET_CODE_6.getKey());
						 dto.setErrormsg(String.valueOf(json.get("errorDesc")));
						 dto.setRemark(String.valueOf(json.get("errorDesc")));
						 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_6.getKey());
						 interfaceLogDto.setRetMsg(String.valueOf(json.get("errorDesc")));
						 params.put("dto", dto);
						 dao.insertExtTdBlackResult(params);
						 params.clear();
						 return;
					 }
					finalDecision = json.getString("final_decision");
					finalScore = json.getString("final_score");
					policySetName = json.getString("policy_set_name");
					treatResult = json.getString("success");
					if(null != json.get("success")){
						retCode = json.get("success").toString();
					}
					treatErrorCode = json.has("reason_code")?json.getString("reason_code"):null;				
				}else{				
				     dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
				     dto.setErrormsg("调用同盾黑名单接口报错");
				     dto.setRemark("调用同盾黑名单接口报错");
				     interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					 interfaceLogDto.setRetMsg("调用同盾黑名单接口报错");
					 params.put("dto", dto);
					 dao.insertExtTdBlackResult(params);
					 params.clear();
					 return;
				 }
			} catch (Exception ex) {
				  JYLoggerUtil.error(this.getClass(), "===调用同盾黑名单解析回参异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
				  String msg = ex.getMessage();
				  if(StringUtil.isNotEmpty(msg)){
					  if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
						  dto.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
						  dto.setErrormsg("调用同盾黑名单接口异常请求返回，请联系IT解决");
						  dto.setRemark("调用同盾黑名单接口调用报错");
						  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
						  interfaceLogDto.setRetMsg("调用同盾黑名单接口异常请求返回，请联系IT解决");
					 }else{
						  dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
						  if(msg.length() > 2000){
							  dto.setErrormsg("调用同盾黑名单接口返回信息解析出错:"+msg.substring(0,2000));
							  interfaceLogDto.setRetMsg("调用同盾黑名单接口返回信息解析出错:"+msg.substring(0,2000));
						  }else{
							  dto.setErrormsg("调用同盾黑名单接口返回信息解析出错:"+msg);
							  interfaceLogDto.setRetMsg("调用同盾黑名单接口返回信息解析出错:"+msg);
						  }
						  dto.setRemark("调用同盾黑名单接口返回信息解析出错");
						  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
					 }
				  }
				  params.put("dto",dto);
				  dao.insertExtTdBlackResult(params);
				  params.clear();
				  return;
			}
			try {
	    		//记录查询请求
				dto.setFinalDecision(finalDecision);
				dto.setFinalScore(finalScore);
				dto.setPolicySetName(policySetName);
				dto.setRepMessage("");
				dto.setRespMessage(String.valueOf(map.get("result")));
				dto.setTreatResult(treatResult);
				if("true".equals(treatResult)){//"success" 查询状态(true:成功调用, false:未成功)
					isSuccess = "1";//补充设置接口成功调用，用于留存数据
					dto.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
					dto.setRemark("调用同盾黑名单接口查有");
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					interfaceLogDto.setRetMsg("调用同盾黑名单接口查有");
				}else{
					dto.setRetcode(InterfaceEnum.RET_CODE_5.getKey());
					dto.setErrormsg("调用同盾黑名单接口返回错误信息");
					dto.setRemark("调用同盾黑名单接口返回错误信息");
					errorMessage="调用同盾黑名单接口返回错误信息";
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg("调用同盾黑名单接口返回错误信息");
				}
				dto.setTreatErrorCode(treatErrorCode);
				dto.setErrorMessage(errorMessage);
			    
				Long tdBlackResultId = this.insertExtTdBlackResult(dto,interfaceLogDto);
				if( null != tdBlackResultId){
					fkBizId = String.valueOf(tdBlackResultId);
				}
				
				try {
					//解析命中的明细规则并保存
					if(json!=null && json.has("hit_rules")) {
						List<ExtTdBlackHitRulesDTO> hitRuleList = new ArrayList<ExtTdBlackHitRulesDTO>();
				    	ExtTdBlackHitRulesDTO hitRuleDto = null;
						JSONArray hitRules = json.getJSONArray("hit_rules");
						for(int i=0;i<hitRules.size();i++) {
							JSONObject ruleJson = hitRules.getJSONObject(i);
							hitRuleDto = new ExtTdBlackHitRulesDTO();
							hitRuleDto.setRuleId(ruleJson.getString("id"));
							hitRuleDto.setRuleName(ruleJson.getString("name"));
							hitRuleDto.setRuleDecision(ruleJson.getString("decision"));
							hitRuleDto.setRuleScore(ruleJson.getString("score"));							
							hitRuleList.add(hitRuleDto);
						}
						if(hitRuleList.size()>0) {
							//批量保存
							extTdBlackHitRulesService.batchInsertExtTdBlackHitRules(hitRuleList, tdBlackResultId);
						}
					}
				} catch (Exception e) {
					JYLoggerUtil.error(this.getClass(), "===保存TD黑名单明细规则异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),e);
					  String msg = e.getMessage();
					  if(StringUtil.isNotEmpty(msg)){
						  dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
						  if(msg.length() > 2000){
							  dto.setErrormsg("保存TD黑名单明细规则出错:"+msg.substring(0,2000));
							  interfaceLogDto.setRetMsg("保存TD黑名单明细规则出错:"+msg.substring(0,2000));
						  }else{
							  dto.setErrormsg("保存TD黑名单明细规则出错:"+msg);
							  interfaceLogDto.setRetMsg("保存TD黑名单明细规则出错:"+msg);
						  }
						  dto.setRemark("保存TD黑名单明细规则出错");
						  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
					  }
					  params.put("dto",dto);
					  dao.insertExtTdBlackResult(params);
					  params.clear();
				}
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存TD黑名单查询结果异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),e);
				  String msg = e.getMessage();
				  if(StringUtil.isNotEmpty(msg)){
					  dto.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					  if(msg.length() > 2000){
						  dto.setErrormsg("保存TD黑名单查询结果出错:"+msg.substring(0,2000));
						  interfaceLogDto.setRetMsg("保存TD黑名单查询结果出错:"+msg.substring(0,2000));
					  }else{
						  dto.setErrormsg("保存TD黑名单查询结果出错:"+msg);
						  interfaceLogDto.setRetMsg("保存TD黑名单查询结果出错:"+msg);
					  }
					  dto.setRemark("保存TD黑名单查询结果");
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
				  }
				  params.put("dto",dto);
				  dao.insertExtTdBlackResult(params);
				  params.clear();
			}
    	}catch (Exception exx) {
    		exx.printStackTrace();
    	}finally{
			try {
				interfaceLogDto.setRetBody(results);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
				interfaceLogDto.setExt5(fkBizId);
                
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				dto.setInterfaceId(String.valueOf(keyId));
				this.updateExtTdBlackResult(dto);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

