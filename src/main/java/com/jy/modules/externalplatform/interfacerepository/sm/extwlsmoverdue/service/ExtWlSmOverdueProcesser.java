package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmoverdue.service;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmoverdue.dto.ExtWlSmOverdueDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtWlSmOverdueProcesser
 * @description: 定义  数美逾期黑名单服务信息(外联平台表) 数据落地
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmoverdue.service.ExtWlSmOverdueProcesser")
public class ExtWlSmOverdueProcesser implements ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
    
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

    @Autowired
    @Qualifier("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmoverdue.service.ExtWlSmOverdueService")
    private ExtWlSmOverdueService service;
    
    /**
     * 数美逾期黑名单服务信息 接口数据落地
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
                
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
				interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
                
                Map retMap = JSON.parseObject(jsonString); 
                if(null != retMap.get("code"))
                    retCode = String.valueOf(retMap.get("code"));//补充设置接口返回码，用于留存记录
                if(null != retMap.get("message"))
                    retMsg = String.valueOf(retMap.get("message"));//补充设置接口返回信息，用于留存记录
                if(null != retMap.get("code") && "1100".equals(retMap.get("code").toString())){//该 IMEI 的逾期历史记录 （code 为 1100时存在）
                    isSuccess = "1";//补充设置接口调用成功，用于留存记录
                    Map detail = (Map) retMap.get("detail");
                    
                    ExtWlSmOverdueDTO dto = new ExtWlSmOverdueDTO();
                    if(StringUtils.isNotEmpty(intoCustomerRefId)){//该值为空，则不是贷款系统调用的该接口
                        dto.setIntoCustRefId(Long.parseLong(intoCustomerRefId));
                    }
                    dto.setCreateBy(Long.parseLong("-1"));
                    
                    if(null != detail.get("in_black"))
                        dto.setInBlack(detail.get("in_black").toString());
                    if (null != detail.get("in_grey"))
                        dto.setInGrey(detail.get("in_grey").toString());
                    if (null != detail.get("itfin_loan_overdues"))
                        dto.setOverdues(detail.get("itfin_loan_overdues").toString());
                    if (null != detail.get("itfin_loan_overdue_duration"))
                        dto.setOverdueDuration(detail.get("itfin_loan_overdue_duration").toString());
                    if (null != detail.get("itfin_loan_overdues_7d"))
                        dto.setOverdues7d(detail.get("itfin_loan_overdues_7d").toString());
                    if (null != detail.get("itfin_loan_overdue_duration_7d"))
                        dto.setOverdueDuration7d(detail.get("itfin_loan_overdue_duration_7d").toString());
                    if (null != detail.get("itfin_loan_overdues_30d"))
                        dto.setOverdues30d(detail.get("itfin_loan_overdues_30d").toString());
                    if (null != detail.get("itfin_loan_overdue_duration_30d"))
                        dto.setOverdueDuration30d(detail.get("itfin_loan_overdue_duration_30d").toString());
                    if (null != detail.get("itfin_loan_overdues_60d"))
                        dto.setOverdues60d(detail.get("itfin_loan_overdues_60d").toString());
                    if (null != detail.get("itfin_loan_overdue_duration_60d"))
                        dto.setOverdueDuration60d(detail.get("itfin_loan_overdue_duration_60d").toString());
                    if (null != detail.get("itfin_loan_overdues_90d"))
                        dto.setOverdues90d(detail.get("itfin_loan_overdues_90d").toString());
                    if (null != detail.get("itfin_loan_overdue_duration_90d"))
                        dto.setOverdueDuration90d(detail.get("itfin_loan_overdue_duration_90d").toString());
                    if (null != detail.get("itfin_loan_overdues_180d"))
                        dto.setOverdues180d(detail.get("itfin_loan_overdues_180d").toString());
                    if (null != detail.get("itfin_loan_overdue_duration_180d"))
                        dto.setOverdueDuration180d(detail.get("itfin_loan_overdue_duration_180d").toString());
                    
                    Long keyId = service.insertExtWlSmOverdue(dto);
                    fkBizId = keyId.toString();
                }else{//返回错误信息
                	interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
                }
                
            }else{
            	//调用接口报错
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("数美逾期黑名单服务信息返回报文为空！");
            }
        }
        catch (Exception e) {
        	JYLoggerUtil.error(this.getClass(), "===保存数美逾期黑名单服务信息日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());//解析回参出错
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());
        }finally{
        	try {
		    	interfaceLogDto.setRetBody(jsonString);
                interfaceLogDto.setExt2(isSuccess);
                interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt4(retMsg);
                interfaceLogDto.setExt5(fkBizId);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存数美逾期黑名单服务信息日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
        }
    }
    
    

    public void testSaveMethod(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("intoCustomerRefId", "80002659472");
        map.put("result", "{\"code\":1100,\"message\":\"成功\",\"detail\":{\"in_black\":0,\"in_grey\":1,\"itfin_loan_overdues\":2,\"itfin_loan_overdue_duration\":\"M2\",\"itfin_loan_overdues_7d\":3,\"itfin_loan_overdue_duration_7d\":\"M3\",\"itfin_loan_overdues_30d\":4,\"itfin_loan_overdue_duration_30d\":\"M4\",\"itfin_loan_overdues_60d\":5,\"itfin_loan_overdue_duration_60d\":\"M5\",\"itfin_loan_overdues_90d\":6,\"itfin_loan_overdue_duration_90d\":\"M6\",\"itfin_loan_overdues_180d\":7,\"itfin_loan_overdue_duration_180d\":\"M7\"}}");
        
        saveMessage(map);
    }
}

