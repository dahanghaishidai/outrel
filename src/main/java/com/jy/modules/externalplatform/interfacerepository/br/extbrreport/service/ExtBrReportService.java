package com.jy.modules.externalplatform.interfacerepository.br.extbrreport.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import jodd.util.StringUtil;
import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.br.extbrreport.dao.ExtBrReportDao;
import com.jy.modules.externalplatform.interfacerepository.br.extbrreport.dto.ExtBrReportDTO;
import com.jy.modules.externalplatform.interfacerepository.br.extbrreportassessment.dto.ExtBrReportAssessmentDTO;
import com.jy.modules.externalplatform.interfacerepository.br.extbrreportassessment.service.ExtBrReportAssessmentService;
import com.jy.modules.externalplatform.interfacerepository.br.extbrreportlastweek.dto.ExtBrReportLastweekDTO;
import com.jy.modules.externalplatform.interfacerepository.br.extbrreportlastweek.service.ExtBrReportLastweekService;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.BaseDTO;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtBrReportService
 * @description: 定义  百融个人评估表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.br.extbrreport.service.ExtBrReportService")
public class ExtBrReportService implements ExtSaveMessageDao {
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    
	@Autowired
	private ExtBrReportDao dao;
	
	@Autowired
    private ExtBrReportAssessmentService brReportAssessmentService;
    
    @Autowired
    private ExtBrReportLastweekService brReportLastweekService;

	/**
     * @author Administrator
     * @description: 分页查询 百融个人评估表列表
     * @date 2017-06-07 15:56:28
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtBrReportDTO> searchExtBrReportByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtBrReportDTO> dataList =  dao.searchExtBrReportByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询百融个人评估表列表
     * @date 2017-06-07 15:56:28
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtBrReportDTO> searchExtBrReport(Map<String,Object> searchParams) throws Exception {
	    List<ExtBrReportDTO> dataList = dao.searchExtBrReport(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询百融个人评估表对象
     * @date 2017-06-07 15:56:28
     * @param id
     * @return
     * @throws
     */ 
	public ExtBrReportDTO queryExtBrReportByPrimaryKey(String id) throws Exception {
		
		ExtBrReportDTO dto = dao.findExtBrReportByPrimaryKey(id);
		
		if(dto == null) dto = new ExtBrReportDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtBrReport
     * @author Administrator
     * @description: 新增 百融个人评估表对象
     * @date 2017-06-07 15:56:28
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtBrReport(ExtBrReportDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtBrReport(paramMap);
		
		ExtBrReportDTO resultDto = (ExtBrReportDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtBrReport
     * @author Administrator
     * @description: 修改 百融个人评估表对象
     * @date 2017-06-07 15:56:28
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtBrReport(ExtBrReportDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtBrReport(paramMap);
	}
	/**
     * @title: deleteExtBrReportByPrimaryKey
     * @author Administrator
     * @description: 删除 百融个人评估表,按主键
     * @date 2017-06-07 15:56:28
     * @param paramMap
     * @throws
     */ 
	public void deleteExtBrReportByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtBrReportByPrimaryKey(paramMap);
	}

	/**
	 * 接收数据保存
	 * @param map
	 */
	public void saveMessage(Map<String,Object> map){
		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		String results=String.valueOf(map.get("result"));
		Map<String, Object> params=new HashMap<String,Object>();
		ExtBrReportDTO brReport = new ExtBrReportDTO();
		brReport.setProdCode(String.valueOf(map.get("prod")));
		brReport.setOrgCode(String.valueOf(map.get("org")));
		brReport.setSysCode(String.valueOf(map.get("sysCode")));
    	JSONObject jsonObj = null;
		try {
			if(StringUtils.isNotEmpty((CharSequence) map.get("result")) && !"null".equals(map.get("result"))){
				jsonObj = JSONObject.fromObject(map.get("result"));
				if(null!=jsonObj.get("retCode") && jsonObj.get("retCode").equals("500")){
					 brReport.setRetcode(InterfaceEnum.RET_CODE_6.getKey());
					 brReport.setErrormsg(String.valueOf(jsonObj.get("errorDesc")));
					 brReport.setRemark(String.valueOf(jsonObj.get("errorDesc")));
					 interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_6.getKey());
					 interfaceLogDto.setRetMsg(String.valueOf(jsonObj.get("errorDesc")));
					 params.put("dto", brReport);
					 dao.insertExtBrReport(params);
					 return;
				 }
				brReport.setCode(jsonObj.getString("code"));
	            if("00".equals(brReport.getCode())){	                
	                brReport.setSwiftNumber(jsonObj.getString("swift_number"));	               
	                JSONObject jsonAuthentication = jsonObj.getJSONObject("Authentication");
	                if(!jsonAuthentication.isEmpty()){
	                	brReport.setAuthenticationIdNum(jsonAuthentication.getString("id"));
	                	brReport.setAuthenticationPhone(jsonAuthentication.getString("cell"));
	                	brReport.setAuthenticationMail(jsonAuthentication.getString("mail"));
	                	brReport.setAuthenticationName(jsonAuthentication.getString("name"));
	                	brReport.setAuthenticationTelbiz(jsonAuthentication.getString("tel_biz"));
	                	brReport.setAuthenticationTelhome(jsonAuthentication.getString("tel_home"));
	                	brReport.setCoreRelation(jsonAuthentication.getString("key_relation"));
	                }	                
	                Iterator iter = null;	                
	                JSONObject jsonInternet = jsonObj.getJSONObject("Internet");
	                JSONObject jsonObjCity = JSONObject.fromObject(jsonInternet).getJSONObject("city");	                   

	                List<ExtBrReportLastweekDTO> brReportLastweeks = new ArrayList<ExtBrReportLastweekDTO>();
	                //对json数组进行循环
	                iter = jsonObjCity.keySet().iterator();   
	                while (iter.hasNext()) {
	                	ExtBrReportLastweekDTO brReportLastweek = new ExtBrReportLastweekDTO();
	                    String key = (String) iter.next();   
	                    String value = jsonObjCity.getString(key);  
	                    brReportLastweek.setOnlineType("city");
	                    brReportLastweek.setOnlineName(key);
	                    JSONObject jsonObjCityCountry = JSONObject.fromObject(value);
	                    brReportLastweek.setLastweekOnlineNum(jsonObjCityCountry.getString("lastweekdays"));
	                    brReportLastweek.setOnlineTotal(jsonObjCityCountry.getString("totaldays"));
	                    brReportLastweek.setLastOnline(jsonObjCityCountry.getString("lasttime"));
	                    brReportLastweeks.add(brReportLastweek);
	                }  
	        	                     
	                JSONObject jsonStability = jsonObj.getJSONObject("Stability");
	                   
	                 //对json数组进行循环
	                iter = jsonStability.keySet().iterator();   
	                while (iter.hasNext()) {   
	                    String key = (String) iter.next();   
	                    String value = jsonStability.getString(key);  
	                    if("cell".equals(key)){
	                       JSONObject jsonStabilityArr = JSONObject.fromObject(value);
	                       if(!jsonStabilityArr.isEmpty()){        
	                           brReport.setAuthenticationPhoneKey(jsonStabilityArr.getString("number"));
	                       }
	                   }else{
	                       JSONObject jsonStabilityArr = JSONObject.fromObject(value);
	                       if(!jsonStabilityArr.isEmpty()){
	                           if("id".equals(key)){
	                               brReport.setAuthenticationIdNumKey(jsonStabilityArr.getString("number"));
	                           }
	                           else if("mail".equals(key)){
	                               brReport.setAuthenticationMailKey(jsonStabilityArr.getString("number"));
	                           }
	                           else if("name".equals(key)){
	                               brReport.setAuthenticationNameKey(jsonStabilityArr.getString("number"));
	                           }
	                           else if("tel".equals(key)){
	                               brReport.setAuthenticationTelephoneKey(jsonStabilityArr.getString("number"));
	                           }               
	                           else if("addr".equals(key)){
	                               brReport.setAuthenticationAddrKey(jsonStabilityArr.getString("number"));
	                           }             
	                       }
	                   }
	                } 
	                
	                JSONObject jsonConsumption = jsonObj.getJSONObject("Consumption");	                   	                   
	                 //对json数组进行循环
	                iter = jsonConsumption.keySet().iterator();   
	                List<ExtBrReportAssessmentDTO> brReportAssessments = new ArrayList<ExtBrReportAssessmentDTO>();
	                while (iter.hasNext()) {  
	                   String key = (String) iter.next();   
	                   String value = jsonConsumption.getString(key); 
	                   JSONObject jsonMonthMap = JSONObject.fromObject(value);
	                   if("level".equals(key)){
	                       Iterator iterlevel = jsonMonthMap.keySet().iterator();
	                       while (iterlevel.hasNext()) {   
	                           String keylevel = (String) iterlevel.next();   
	                           String valuelevel = jsonMonthMap.getString(keylevel); 
	                           for(ExtBrReportAssessmentDTO brReportAssessment : brReportAssessments){
	                               if(keylevel.equals(brReportAssessment.getProName()) && "month12".equals(brReportAssessment.getProType())){
	                                   brReportAssessment.setTop(valuelevel);
	                               }
	                           }
	                       }
	                   }
	                   else{
	                       Iterator iter1 = jsonMonthMap.keySet().iterator(); 
	                       while (iter1.hasNext()) {   
	                    	   ExtBrReportAssessmentDTO brReportAssessment = new ExtBrReportAssessmentDTO();
	                           brReportAssessment.setProType(key);
	                           brReportAssessment.setType("1"); // 1：消费能力评估/2：信贷申请统计/3：阅读兴趣
	                           String key1 = (String) iter1.next();   
	                           String value1 = jsonMonthMap.getString(key1);  
	                           brReportAssessment.setProName(key1);
	                           JSONObject jsonStabilityArr1 = JSONObject.fromObject(value1);
	                           if(!jsonStabilityArr1.isEmpty()){
	                               brReportAssessment.setTotalNum(jsonStabilityArr1.getString("visits"));
	                               brReportAssessment.setConsumeNum(jsonStabilityArr1.getString("number"));
	                               brReportAssessment.setTotalMoney(jsonStabilityArr1.getString("pay"));
	                           }
	                           brReportAssessments.add(brReportAssessment);
	                       } 
	                   }
	                }
	        	        
	               JSONObject jsonApplyLoan = jsonObj.getJSONObject("ApplyLoan");
	                //对json数组进行循环
	               iter = jsonApplyLoan.keySet().iterator();   
	               while (iter.hasNext()) {  
	                  String key = (String) iter.next();   
	                  String value = jsonApplyLoan.getString(key);  
	                  JSONObject jsonMonthMap = JSONObject.fromObject(value);
	                  Iterator iter1 = jsonMonthMap.keySet().iterator(); 
	                  while (iter1.hasNext()) {   
	                      String key1 = (String) iter1.next();   
	                      String value1 = jsonMonthMap.getString(key1);  
	                      if("gid".equalsIgnoreCase(key1)){
	                          continue;
	                      }
	                      JSONObject jsonStabilityArr1 = JSONObject.fromObject(value1);
	                      Iterator iter2 = jsonStabilityArr1.keySet().iterator(); 
	                      while (iter2.hasNext()) {   
	                    	  ExtBrReportAssessmentDTO brReportAssessment = new ExtBrReportAssessmentDTO();
	                    	  brReportAssessment.setProType(key);
	                    	  brReportAssessment.setType("2"); // 1：消费能力评估/2：信贷申请统计/3：阅读兴趣
	                    	  brReportAssessment.setProName(key1);
	                    	  String key2 = (String) iter2.next(); 
	                          String value2 = jsonStabilityArr1.getString(key2);  	                    	  
	                          brReportAssessment.setIsBank(key2);	                          
	                          JSONObject jsonStabilityArr2 = JSONObject.fromObject(value2);
	                          
		                      if(!jsonStabilityArr2.isEmpty()){
		                          brReportAssessment.setSelfApplyNum(jsonStabilityArr2.getString("selfnumber"));
		                          brReportAssessment.setTotalApplyNum(jsonStabilityArr2.getString("allnumber"));
		                          brReportAssessment.setApplyedNum(jsonStabilityArr2.getString("orgnumber"));
		                      } 
		                      brReportAssessments.add(brReportAssessment);
	                      }
	                  }
	               }
	                	               
	               JSONObject jsonOnline = jsonObj.getJSONObject("Online");
	               iter = jsonOnline.keySet().iterator();   
	               while (iter.hasNext()) { 	                   
	                  String key = (String) iter.next();   
	                  String value = jsonOnline.getString(key);  
	                  JSONObject jsonMonthMap = JSONObject.fromObject(value);
	                  Iterator iter1 = jsonMonthMap.keySet().iterator(); 
	                  while (iter1.hasNext()) {   
	                	  ExtBrReportLastweekDTO brReportLastweek = new ExtBrReportLastweekDTO();
	                      brReportLastweek.setOnlineType(key);
	                      String key1 = (String) iter1.next();   
	                      String value1 = jsonMonthMap.getString(key1);  
	                      brReportLastweek.setOnlineName(key1);
	                      JSONObject jsonStabilityArr1 = JSONObject.fromObject(value1);
	                      if(!jsonStabilityArr1.isEmpty()){
	                          brReportLastweek.setLastweekOnlineNum(jsonStabilityArr1.getString("lastweekdays"));
	                          brReportLastweek.setOnlineTotal(jsonStabilityArr1.getString("totaldays"));
	                          brReportLastweek.setLastOnline(jsonStabilityArr1.getString("lasttime"));
	                      } 
	                      brReportLastweeks.add(brReportLastweek);
	                  }
	               }
	               brReport.setBrReportLastweeks(brReportLastweeks);
	               	                
	               JSONObject jsonScore = jsonObj.getJSONObject("Score");
	               JSONObject jsonRuleResult = jsonObj.getJSONObject("RuleResult");	                   
	               JSONObject jsonTitle = jsonObj.getJSONObject("Title");
	               if(!jsonTitle.isEmpty()){
	            	   brReport.setCompanyLevel(jsonTitle.getString("title"));
	               }
	                	                   
	               JSONObject jsonAssets = jsonObj.getJSONObject("Assets");
	               if(!jsonAssets.isEmpty()){
	            	   brReport.setAssessmentHouse(jsonAssets.getString("house"));
	            	   brReport.setAssessmentCar(jsonAssets.getString("car"));
	            	   brReport.setAssessmentMoney(jsonAssets.getString("fin"));
	            	   brReport.setAssessmentWealthType(jsonAssets.getString("wealth"));
	               }
	                	                
	               JSONObject jsonMedia = jsonObj.getJSONObject("Media");
	               //对json数组进行循环
	              iter = jsonMedia.keySet().iterator();   
	              while (iter.hasNext()) {  
	                 String key = (String) iter.next();   
	                 String value = jsonMedia.getString(key);  
	                 JSONObject jsonMonthMap = JSONObject.fromObject(value);
	                 Iterator iter1 = jsonMonthMap.keySet().iterator(); 
	                 while (iter1.hasNext()) {   
	                	 ExtBrReportAssessmentDTO brReportAssessment = new ExtBrReportAssessmentDTO();
	                     brReportAssessment.setProType(key);
	                     brReportAssessment.setType("3"); // 1：消费能力评估/2：信贷申请统计/3：阅读兴趣
	                     String key1 = (String) iter1.next();   
	                     String value1 = jsonMonthMap.getString(key1);  
	                     brReportAssessment.setProName(key1);
	                     JSONObject jsonStabilityArr1 = JSONObject.fromObject(value1);
	                     if(!jsonStabilityArr1.isEmpty()){
	                         brReportAssessment.setTotalNum(jsonStabilityArr1.getString("visitdays"));
	                     }
	                     brReportAssessments.add(brReportAssessment);
	                 } 
	              }
	              brReport.setBrReportAssessments(brReportAssessments);
	                   
	               JSONObject jsonBrand = jsonObj.getJSONObject("Brand");
	               iter = jsonBrand.keySet().iterator();   
	               while (iter.hasNext()) {  	                   
	                   String key = (String) iter.next();   
	                   String value = jsonBrand.getString(key); 
	                   
	                   if("top1".equals(key)){
	                       brReport.setInterestOne(value);
	                   }
	                   else if("top2".equals(key)){
	                       brReport.setInterestTwo(value);
	                   }
	                   else if("top3".equals(key)){
	                       brReport.setInterestThree(value);
	                   }
	                   else if("top4".equals(key)){
	                       brReport.setInterestFour(value);
	                   }
	                   else if("top5".equals(key)){
	                       brReport.setInterestFive(value);
	                   }
	               }
	               brReport.setRetcode(InterfaceEnum.RET_CODE_1.getKey());
				   brReport.setRemark("调用百融征信接口查有");	
				   interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
				   interfaceLogDto.setRetMsg("调用百融征信接口查有！");
	               Long brReportId = this.insertExtBrReport(brReport);
	               
	               if(brReportLastweeks.size() > 0){
	            	   for(ExtBrReportLastweekDTO brReportLastweek : brReportLastweeks){
	            		   brReportLastweek.setBrReportId(brReportId);
	            		   brReportLastweekService.insertExtBrReportLastweek(brReportLastweek);
	            	   }
	            	   brReport.setLastweekMsg(InterfaceEnum.RET_MSG.getKey());
	            	   this.updateExtBrReport(brReport);
	               }
	               if(brReportAssessments.size() > 0){
	            	   for(ExtBrReportAssessmentDTO brReportAssessment : brReportAssessments){
	            		   brReportAssessment.setBrReportId(brReportId);
	            		   brReportAssessmentService.insertExtBrReportAssessment(brReportAssessment);
	            	   }
	            	   brReport.setAssessmentMsg(InterfaceEnum.RET_MSG.getKey());
	            	   this.updateExtBrReport(brReport);
	               }
	               
	            }else{
	            	brReport.setRetcode(InterfaceEnum.RET_CODE_2.getKey());
				    brReport.setErrormsg("调用百融征信接口查无");
				    brReport.setRemark("调用百融征信接口查无");
				    interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_2.getKey());
					interfaceLogDto.setRetMsg("调用百融征信接口查无！");
					params.put("dto", brReport);
					dao.insertExtBrReport(params);
	            }
			}else{				
			     brReport.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
			     brReport.setErrormsg("调用百融征信接口报错");
			     brReport.setRemark("调用百融征信接口报错");	
			     interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				 interfaceLogDto.setRetMsg("调用百融征信接口报错！");
				 params.put("dto", brReport);
				 dao.insertExtBrReport(params);
			 }
		} catch (Exception ex) {
			  JYLoggerUtil.error(this.getClass(), "===调用百融征信解析回参异常===进件日志ID:"+String.valueOf(map.get("interfaceId")),ex);
			  String msg = ex.getMessage();
			  if(StringUtil.isNotEmpty(msg)){
				  if(msg.contains("A JSONObject text must begin with '{' at character 1 of")){
					  brReport.setRetcode(InterfaceEnum.RET_CODE_3.getKey());
					  brReport.setErrormsg("调用百融征信接口异常请求返回，请联系IT解决");
					  brReport.setRemark("调用百融征信接口调用报错");
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
					  interfaceLogDto.setRetMsg("调用百融征信接口异常请求返回，请联系IT解决");
				 }else{
					  brReport.setRetcode(InterfaceEnum.RET_CODE_4.getKey());
					  if(msg.length() > 2000){
						  brReport.setErrormsg("调用百融征信接口返回信息解析出错:"+msg.substring(0,2000));
						  interfaceLogDto.setRetMsg("调用百融征信接口返回信息解析出错:"+msg.substring(0,2000));
					  }else{
						  brReport.setErrormsg("调用百融征信接口返回信息解析出错:"+msg);
						  interfaceLogDto.setRetMsg("调用百融征信接口返回信息解析出错:"+msg);
					  }
					  brReport.setRemark("调用百融征信接口返回信息解析出错");
					  interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());
				 }
			  }
			  params.put("dto",brReport);
			  dao.insertExtBrReport(params);
		}finally{
			try {
				interfaceLogDto.setRetBody(results);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
				brReport.setInterfaceId(String.valueOf(keyId));
				this.updateExtBrReport(brReport);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
	
}

