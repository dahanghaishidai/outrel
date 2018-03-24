package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dao.ExtHdMgBaseInfoDao;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dto.ExtHdPhoneBckLisDTO;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;


/**
 * @description: 手机黑名单
 * @author: sun
 */
@Service("com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.service.ExtHdPhoneBckLisInfoRstService")
public class ExtHdPhoneBckLisInfoRstService implements ExtSaveMessageDao {
	private static final Logger logger = LoggerFactory.getLogger(ExtHdPhoneBckLisInfoRstService.class);
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

	@Autowired
	ExtInterfaceLogService extInterfaceLogService;
	
	@Autowired
	private ExtHdMgBaseInfoDao baseInfoDao;
	

	@SuppressWarnings("all")
	public void saveMessage(Map<String, Object> map) {
		
		String isSuccess = "0"; //接口是否调用成功 "1"：成功 ， "0"：失败
		String retCode = ""; //接口返回码
        String fkBizId = "";//接口落地数据主表ID
		logger.info("---------------ExtHdPhoneBckLisInfoRstService 华道手机黑名单返回参数   results ： " + JSON.toJSONString(map));

		//日志信息
		ExtInterfaceLogDTO interfaceLogDto=(ExtInterfaceLogDTO) map.get("interfaceLogDto");
		
		String results = String.valueOf(map.get("result"));
		Map<String, Object> maps = new HashMap<String, Object>();
		try {

	        if(null == map.get("intoCustomerRefId")){
	            map.put("intoCustomerRefId", "");//非贷款系统调用，这个没有值
	        }
	        
			if (StringUtils.isNotEmpty(results)) {//有报文 返回
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
				interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());
				Map resultMap = (Map) JSONObject.parse(results);
				retCode = (String) resultMap.get("CODE");
				
				if("200".equals(String.valueOf(resultMap.get("CODE")))){
					isSuccess = "1";//补充设置接口调用成功，用于留存记录
					maps.put("CODE",resultMap.get("CODE"));
					maps.put("IS_BLACK",resultMap.get("IS_BLACK"));
					maps.put("INTO_CUST_REF_ID", map.get("intoCustomerRefId"));
					maps.put("CREATE_BY", Long.parseLong("-1"));
					maps.put("VALIDATE_STATE", ("1"));
					maps.put("dto", new ExtHdPhoneBckLisDTO());
					
					logger.info("---------------ExtHdCreditInfoRstService 数据落地的参数   maps ： " + JSON.toJSONString(maps));
					//数据插入华道手机黑名单信息表中
					baseInfoDao.insertExtHdWLPhoneBckLis(maps);
					ExtHdPhoneBckLisDTO dto = (ExtHdPhoneBckLisDTO)maps.get("dto");
					fkBizId = dto.getId().toString();
				}
				
			}else{
				//调用接口报错
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("华道手机黑名单返回报文为空！");
				
			}
		} catch (Exception ex) {
			JYLoggerUtil.error(this.getClass(), "===保存华道手机黑名单日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), ex);
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());//解析回参出错
			interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());
		}finally{
			try {
		    	interfaceLogDto.setRetBody(results);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt5(fkBizId);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存华道手机黑名单日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
		}

	}

}
