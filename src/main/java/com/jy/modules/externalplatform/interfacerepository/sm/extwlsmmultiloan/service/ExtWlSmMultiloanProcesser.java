package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmultiloan.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmultiloan.dto.ExtWlSmMultiloanDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtWlSmMultiloanProcesser
 * @description: 定义  数美多平台借贷服务信息(外联平台表) 数据落地
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmultiloan.service.ExtWlSmMultiloanProcesser")
public class ExtWlSmMultiloanProcesser implements ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
    
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
    
    @Autowired
    @Qualifier("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmultiloan.service.ExtWlSmMultiloanService")
    private ExtWlSmMultiloanService service;

    /**
     * 数美多平台借贷服务信息 接口数据落地
     */
    @Override
    public void saveMessage(Map<String, Object> map) {
    	String isSuccess = "0"; //接口是否调用成功 "1"：成功 ， "0"：失败
		String retCode = ""; //接口返回码
		String retMsg = ""; //接口返回信息
        String fkBizId = "";//接口落地数据主表ID
    	//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		
		String jsonString = "";
        try {

            if(null == map.get("intoCustomerRefId")){
                map.put("intoCustomerRefId", "");//非贷款系统调用，这个没有值
            }
            if(null != map.get("result")){
                jsonString= String.valueOf(map.get("result"));
                String intoCustomerRefId = String.valueOf(map.get("intoCustomerRefId"));
                
                Map retMap = JSON.parseObject(jsonString); 
                if(null != retMap.get("code"))
                    retCode = retMap.get("code").toString();//设置补充接口返回码，用于留存记录
                retMsg = (String) retMap.get("message");//补充设置接口返回信息，用于留存记录
                if(null != retMap.get("code") && "1100".equals(retMap.get("code").toString())){//该手机号的借贷平台数 （code 为 1100时存在）
                	isSuccess = "1"; //补充设置接口调用成功，用了留存记录
                	interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
    				interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
    				
                    Map detail = (Map) retMap.get("detail");
                    
                    ExtWlSmMultiloanDTO dto = new ExtWlSmMultiloanDTO();
                   
                    if(StringUtils.isNotEmpty(intoCustomerRefId)){//该值为空，则不是贷款系统调用的该接口
                        dto.setIntoCustRefId(Long.parseLong(intoCustomerRefId));
                    }
                    dto.setCreateBy(Long.parseLong("-1"));
                    //设置数据有效
                    dto.setValidateState("1");
                    if(null != detail.get("itfin_registers"))
                        dto.setItfinRegisters(detail.get("itfin_registers").toString());
                    if (null != detail.get("itfin_loan_applications"))
                        dto.setItfinLoanApplications(detail.get("itfin_loan_applications").toString());
                    if (null != detail.get("itfin_loan_refuses"))
                        dto.setItfinLoanRefuses(detail.get("itfin_loan_refuses").toString());
                    if (null != detail.get("itfin_loan_queries"))
                        dto.setItfinLoanQueries(detail.get("itfin_loan_queries").toString());
                    if (null != detail.get("itfin_loan_approvals"))
                        dto.setItfinLoanApprovals(detail.get("itfin_loan_approvals").toString());
                    if (null != detail.get("itfin_registers_7d"))
                        dto.setItfinRegisters7d(detail.get("itfin_registers_7d").toString());
                    if (null != detail.get("itfin_loan_applications_7d"))
                        dto.setItfinLoanApplications7d(detail.get("itfin_loan_applications_7d").toString());
                    if (null != detail.get("itfin_loan_refuses_7d"))
                        dto.setItfinLoanRefuses7d(detail.get("itfin_loan_refuses_7d").toString());
                    if (null != detail.get("itfin_loan_queries_7d"))
                        dto.setItfinLoanQueries7d(detail.get("itfin_loan_queries_7d").toString());
                    if (null != detail.get("itfin_loan_approvals_7d"))
                        dto.setItfinLoanApprovals7d(detail.get("itfin_loan_approvals_7d").toString());
                    if (null != detail.get("itfin_registers_30d"))
                        dto.setItfinRegisters30d(detail.get("itfin_registers_30d").toString());
                    if (null != detail.get("itfin_loan_applications_30d"))
                        dto.setItfinLoanApplications30d(detail.get("itfin_loan_applications_30d").toString());
                    if (null != detail.get("itfin_loan_refuses_30d"))
                        dto.setItfinLoanRefuses30d(detail.get("itfin_loan_refuses_30d").toString());
                    if (null != detail.get("itfin_loan_queries_30d"))
                        dto.setItfinLoanQueries30d(detail.get("itfin_loan_queries_30d").toString());
                    if (null != detail.get("itfin_loan_approvals_30d"))
                        dto.setItfinLoanApprovals30d(detail.get("itfin_loan_approvals_30d").toString());
                    if (null != detail.get("itfin_registers_60d"))
                        dto.setItfinRegisters60d(detail.get("itfin_registers_60d").toString());
                    if (null != detail.get("itfin_loan_applications_60d"))
                        dto.setItfinLoanApplications60d(detail.get("itfin_loan_applications_60d").toString());
                    if (null != detail.get("itfin_loan_refuses_60d"))
                        dto.setItfinLoanRefuses60d(detail.get("itfin_loan_refuses_60d").toString());
                    if (null != detail.get("itfin_loan_queries_60d"))
                        dto.setItfinLoanQueries60d(detail.get("itfin_loan_queries_60d").toString());
                    if (null != detail.get("itfin_loan_approvals_60d"))
                        dto.setItfinLoanApprovals60d(detail.get("itfin_loan_approvals_60d").toString());
                    if (null != detail.get("itfin_registers_90d"))
                        dto.setItfinRegisters90d(detail.get("itfin_registers_90d").toString());
                    if (null != detail.get("itfin_loan_applications_90d"))
                        dto.setItfinLoanApplications90d(detail.get("itfin_loan_applications_90d").toString());
                    if (null != detail.get("itfin_loan_refuses_90d"))
                        dto.setItfinLoanRefuses90d(detail.get("itfin_loan_refuses_90d").toString());
                    if (null != detail.get("itfin_loan_queries_90d"))
                        dto.setItfinLoanQueries90d(detail.get("itfin_loan_queries_90d").toString());
                    if (null != detail.get("itfin_loan_approvals_90d"))
                        dto.setItfinLoanApprovals90d(detail.get("itfin_loan_approvals_90d").toString());
                    if (null != detail.get("itfin_registers_180d"))
                        dto.setItfinRegisters180d(detail.get("itfin_registers_180d").toString());
                    if (null != detail.get("itfin_loan_applications_180d"))
                        dto.setItfinLoanApplications180d(detail.get("itfin_loan_applications_180d").toString());
                    if (null != detail.get("itfin_loan_refuses_180d"))
                        dto.setItfinLoanRefuses180d(detail.get("itfin_loan_refuses_180d").toString());
                    if (null != detail.get("itfin_loan_queries_180d"))
                        dto.setItfinLoanQueries180d(detail.get("itfin_loan_queries_180d").toString());
                    if (null != detail.get("itfin_loan_approvals_180d"))
                        dto.setItfinLoanApprovals180d(detail.get("itfin_loan_approvals_180d").toString());
                    
                    Long keyId = service.insertExtWlSmMultiloan(dto);
                    fkBizId = keyId.toString();
                }
                
            }else{
            	//调用接口报错
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("数美多平台借贷服务信息返回报文为空！");
            }
        }catch (Exception e) {
        	JYLoggerUtil.error(this.getClass(), "===保存数美多平台借贷服务信息日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());//解析回参出错
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());
        }finally{
        	try {
		    	interfaceLogDto.setRetBody(jsonString);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt4(retMsg);
                interfaceLogDto.setExt5(fkBizId);
				Long keyId = extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存数美多平台借贷服务信息日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
        }
    }

    //测试数据落地
    public void testSaveMethod(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("intoCustomerRefId", "80002659472");
        
        Map detailMap = new HashMap();
        detailMap.put("itfin_registers", 1);
        detailMap.put("itfin_loan_applications", 2);
        detailMap.put("itfin_loan_refuses", 3);
        detailMap.put("itfin_loan_queries", 4);
        detailMap.put("itfin_loan_approvals", 5);
        detailMap.put("itfin_registers_7d", 6);
        detailMap.put("itfin_loan_applications_7d", 7);
        detailMap.put("itfin_loan_refuses_7d", 8);
        detailMap.put("itfin_loan_queries_7d", 9);
        detailMap.put("itfin_loan_approvals_7d", 10);
        detailMap.put("itfin_registers_30d", 11);
        detailMap.put("itfin_loan_applications_30d", 12);
        detailMap.put("itfin_loan_refuses_30d", 13);
        detailMap.put("itfin_loan_queries_30d", 14);
        detailMap.put("itfin_loan_approvals_30d", 15);
        detailMap.put("itfin_registers_60d", 16);
        detailMap.put("itfin_loan_applications_60d", 17);
        detailMap.put("itfin_loan_refuses_60d", 18);
        detailMap.put("itfin_loan_queries_60d", 19);
        detailMap.put("itfin_loan_approvals_60d", 20);
        detailMap.put("itfin_registers_90d", 21);
        detailMap.put("itfin_loan_applications_90d", 22);
        detailMap.put("itfin_loan_refuses_90d", 23);
        detailMap.put("itfin_loan_queries_90d", 24);
        detailMap.put("itfin_loan_approvals_90d", 25);
        detailMap.put("itfin_registers_180d", 26);
        detailMap.put("itfin_loan_applications_180d", 27);
        detailMap.put("itfin_loan_refuses_180d", 28);
        detailMap.put("itfin_loan_queries_180d", 29);
        detailMap.put("itfin_loan_approvals_180d", 30);

        
        Map jsonMap = new HashMap();
        jsonMap.put("code", 1100);
        jsonMap.put("message", "成功");
        jsonMap.put("detail", detailMap);
        
        map.put("result", JSONObject.fromObject(jsonMap).toString());
        
        saveMessage(map);
    }

}

