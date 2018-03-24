package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmalagentphone.service;
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
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmalagentphone.dto.ExtWlSmMalagentPhoneDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @classname: ExtWlSmMalagentPhoneProcesser
 * @description: 定义  数美金融中介识别信息(外联平台表) 数据落地
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmalagentphone.service.ExtWlSmMalagentPhoneProcesser")
public class ExtWlSmMalagentPhoneProcesser implements ExtSaveMessageDao {

    private static final long serialVersionUID = 1L;
    
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

    @Autowired
    @Qualifier("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmalagentphone.service.ExtWlSmMalagentPhoneService")
    private ExtWlSmMalagentPhoneService service;

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
                String bizPhone = String.valueOf(map.get("phone"));
                String intoCustomerRefId = String.valueOf(map.get("intoCustomerRefId"));
                
                interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
				interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
                
                Map retMap = JSON.parseObject(jsonString); 
                if(null != retMap.get("code"))
                    retCode = String.valueOf(retMap.get("code"));//补充设置接口返回码，用于留存记录
                if(null != retMap.get("message"))
                    retMsg = String.valueOf(retMap.get("message"));//补充设置接口返回信息，用于留存记录
                if(null != retMap.get("code") && "1100".equals(retMap.get("code").toString())){
                	isSuccess = "1";
                    ExtWlSmMalagentPhoneDTO dto = new ExtWlSmMalagentPhoneDTO();
                    dto.setPhone(bizPhone);
                    if(StringUtils.isNotEmpty(intoCustomerRefId)){//该值为空，则不是贷款系统调用的该接口
                        dto.setIntoCustRefId(Long.parseLong(intoCustomerRefId));
                    }
                    dto.setMatch(retMap.get("match").toString());//该电话号码的黄页信息 （code 为 1100时存在）
                    if(null != retMap.get("tags")){
                        dto.setTags(retMap.get("tags").toString());
                    }
                    dto.setCreateBy(Long.parseLong("-1"));
                    
                    Long keyId = service.insertExtWlSmMalagentPhone(dto);
                    fkBizId = keyId.toString();
                }else{
                	//返回错误信息
                	interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_5.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_5.getValue());
                }
            }else{
            	//调用接口报错
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("数美金融中介识别信息返回报文为空！");
            }
        }
        catch (Exception e) {
        	JYLoggerUtil.error(this.getClass(), "===保存数美金融中介识别信息日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
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
				JYLoggerUtil.error(this.getClass(), "===保存数美金融中介识别信息日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
        }
    }
    

    public void testSaveMethod(){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("bizPhone", "18911156478");
        map.put("intoCustomerRefId", "80002659472");
        map.put("result", "{\"code\":1100,\"message\":\"成功\",\"match\":1,\"tags\": [\"loan\"]}");
        
        saveMessage(map);
    }
}

