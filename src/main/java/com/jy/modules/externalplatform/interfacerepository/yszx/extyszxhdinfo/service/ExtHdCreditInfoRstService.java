package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dao.ExtHdMgBaseInfoDao;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dto.ExtHdCreditInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dto.ExtHdPhoneBckLisDTO;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dto.HdConstant;
import com.jy.modules.externalplatform.interfacerest.dao.ExtSaveMessageDao;
import com.jy.modules.externalplatform.interfacerest.dto.ExtInterfaceLogDTO;
import com.jy.modules.externalplatform.interfacerest.service.ExtInterfaceLogService;
import com.jy.modules.externalplatform.interfacerest.utils.InterfaceEnum;
import com.jy.platform.core.common.JYLoggerUtil;

/**
 * @description: 华道信贷信息
 * @author: sun
 */
@Service("com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.service.ExtHdCreditInfoRstService")
public class ExtHdCreditInfoRstService implements ExtSaveMessageDao {
	private static final Logger logger = LoggerFactory.getLogger(ExtHdCreditInfoRstService.class);
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	@Autowired
	ExtInterfaceLogService extInterfaceLogService;

	@Autowired
	private ExtHdMgBaseInfoDao extHdMgBaseInfoDao;

	@SuppressWarnings("all")
	public void saveMessage(Map<String, Object> map) {
		String isSuccess = "0"; //接口是否调用成功 "1"：成功 ， "0"：失败
		String retCode = ""; //接口返回码
		String retMsg = ""; //接口返回信息
        String fkBizId = "";//接口落地数据主表ID
		String results = (String) map.get("result");
		//测试报文
//		results = "{\"CODE\":\"200\",\"KEY\":\"1396*****86\",\"PROVINCE\":\"福建\",\"CITY\":\"福州\",\"CYCLE\":\"2015-06-21--2017-06-21\",\"EXISTS\":\"4\",\"RESULTS\":[{\"TYPE\":\"EMR001\",\"REGISTERNUM\":\"1\"},{\"TYPE\":\"EMR002\",\"DATA\":[{\"P_TYPE\":\"1\",\"PLATFORMCODE\":\"PT1000035\",\"REGISTERTIME\":\"2016/3/140:00:00\"},{\"P_TYPE\":\"1\",\"PLATFORMCODE\":\"PT1000036\",\"REGISTERTIME\":\"2016/3/140:00:00\"},{\"P_TYPE\":\"0\",\"PLATFORMCODE\":\"PT1000037\",\"REGISTERTIME\":\"2016/3/140:00:00\"}]},{\"TYPE\":\"EMR003\",\"LOANNUM\":\"1\"},{\"TYPE\":\"EMR004\",\"DATA\":[{\"P_TYPE\":\"0\",\"PLATFORMCODE\":\"PT1000035\",\"APPLICATIONTIME\":\"2016/3/140:00:00\",\"APPLICATIONAMOUNT\":\"0W～0.2W\",\"APPLICATIONRESULT\":\"yes\"},{\"P_TYPE\":\"0\",\"PLATFORMCODE\":\"PT1000036\",\"APPLICATIONTIME\":\"2016/3/140:00:00\",\"APPLICATIONAMOUNT\":\"0W～0.2W\",\"APPLICATIONRESULT\":\"yes\"},{\"P_TYPE\":\"0\",\"PLATFORMCODE\":\"PT1000038\",\"APPLICATIONTIME\":\"2016/3/140:00:00\",\"APPLICATIONAMOUNT\":\"0W～0.2W\",\"APPLICATIONRESULT\":\"yes\"}]},{\"TYPE\":\"EMR005\",\"RESULTNUM\":\"32\",\"PASSES\":\"10\",\"REJECTED\":\"12\"},{\"TYPE\":\"EMR006\",\"LOANLENDERSNUM\":\"1\"},{\"TYPE\":\"EMR007\",\"DATA\":[{\"P_TYPE\":\"0\",\"PLATFORMCODE\":\"PT1000036\",\"LOANLENDERSTIME\":\"2016/3/140:00:00\",\"LOANLENDERSAMOUNT\":\"0W～0.2W\"},{\"P_TYPE\":\"0\",\"PLATFORMCODE\":\"PT1000037\",\"LOANLENDERSTIME\":\"2016/3/140:00:00\",\"LOANLENDERSAMOUNT\":\"0W～0.2W\"},{\"P_TYPE\":\"0\",\"PLATFORMCODE\":\"PT1000038\",\"LOANLENDERSTIME\":\"2016/3/140:00:00\",\"LOANLENDERSAMOUNT\":\"0W～0.2W\"}]},{\"TYPE\":\"EMR008\",\"LOANREJECTIONNUM\":\"1\"},{\"TYPE\":\"EMR009\",\"DATA\":[{\"P_TYPE\":\"0\",\"PLATFORMCODE\":\"PT1000036\",\"REJECTIONTIME\":\"2016/3/140:00:00\"},{\"P_TYPE\":\"0\",\"PLATFORMCODE\":\"PT1000037\",\"REJECTIONTIME\":\"2016/3/140:00:00\"},{\"P_TYPE\":\"0\",\"PLATFORMCODE\":\"PT1000038\",\"REJECTIONTIME\":\"2016/3/140:00:00\"}]},{\"TYPE\":\"EMR010\",\"COUNTS\":\"284\",\"MONEY\":\"0W～0.2W\"},{\"TYPE\":\"EMR011\",\"COUNTS\":\"284\",\"MONEY\":\"0W～0.2W\"},{\"TYPE\":\"EMR012\",\"DATA\":[{\"PLATFORM\":\"PT1000036\",\"COUNTS\":\"284\",\"MONEY\":\"0W～0.2W\",\"D_TIME\":\"2016-04-10\"},{\"PLATFORM\":\"PT1000287\",\"COUNTS\":\"12\",\"MONEY\":\"0W～0.2W\",\"D_TIME\":\"2016-04-10\"},{\"PLATFORM\":\"PT1000038\",\"COUNTS\":\"60\",\"MONEY\":\"0W～0.2W\",\"D_TIME\":\"2016-04-10\"}]},{\"TYPE\":\"EMR013\",\"DATA\":[{\"PLATFORM\":\"PT1000038\",\"MONEY\":\"0W～0.2W\"}]}]}";
		logger.info("---------------ExtHdCreditInfoRstService 华道信贷返回参数   results ： " + JSON.toJSONString(results));
		// 日志信息
		ExtInterfaceLogDTO interfaceLogDto = (ExtInterfaceLogDTO) map.get("interfaceLogDto");

        if(null == map.get("intoCustomerRefId")){
            map.put("intoCustomerRefId", "");//非贷款系统调用，这个没有值
        }
		try {
			if (null != results) {
				Map resultMap = (Map) JSONObject.parse(results);
				retCode = (String) resultMap.get("CODE");
				
				if("200".equals((String) resultMap.get("CODE"))){
					isSuccess = "1"; //补充设置接口调用成功，用于留存记录
					List<Map> extHdMgMap = (List<Map>) resultMap.get("RESULTS");
					Map<String, Object> maps = new HashMap<String, Object>();
					if (null != extHdMgMap) {
						for (Map extHdMg : extHdMgMap) {
							if (!StringUtils.isEmpty(extHdMg.get("REGISTERNUM"))) {
								maps.put("REGISTERNUM", extHdMg.get("REGISTERNUM"));
							}
							if (!StringUtils.isEmpty(extHdMg.get("LOANNUM"))) {
								maps.put("LOANNUM", extHdMg.get("LOANNUM"));
							}
							if (!StringUtils.isEmpty(extHdMg.get("PASSES"))) {
								maps.put("PASSES", extHdMg.get("PASSES"));
							}
							if (!StringUtils.isEmpty(extHdMg.get("REJECTED"))) {
								maps.put("REJECTED", extHdMg.get("REJECTED"));
							}
							if (!StringUtils.isEmpty(extHdMg.get("RESULTNUM"))) {
								maps.put("RESULTNUM", extHdMg.get("RESULTNUM"));
							}
							if (!StringUtils.isEmpty(extHdMg.get("LOANLENDERSNUM"))) {
								maps.put("LOANLENDERSNUM", extHdMg.get("LOANLENDERSNUM"));
							}
							if (!StringUtils.isEmpty(extHdMg.get("LOANREJECTIONNUM"))) {
								maps.put("LOANREJECTIONNUM", extHdMg.get("LOANREJECTIONNUM"));
							}
							if (!StringUtils.isEmpty(extHdMg.get("COUNTS"))) {
								maps.put("COUNTS", extHdMg.get("COUNTS"));
							}
							if (!StringUtils.isEmpty(extHdMg.get("MONEY"))) {
								maps.put("MONEY", extHdMg.get("MONEY"));
							}
							if (HdConstant.LOAN_PLANT_DETAIL.equals(extHdMg.get("TYPE"))) {
								maps.put("LOAN_PLANT_DETAIL", JSON.toJSONString(extHdMg.get("DATA")));
							} else if (HdConstant.LOAN_APPLY_DETAIL.equals(extHdMg.get("TYPE"))) {
								maps.put("LOAN_APPLY_DETAIL", JSON.toJSONString(extHdMg.get("DATA")));
							} else if (HdConstant.LOAN_GRANT_DETAIL.equals(extHdMg.get("TYPE"))) {
								maps.put("LOAN_GRANT_DETAIL", JSON.toJSONString(extHdMg.get("DATA")));
							} else if (HdConstant.LOAN_REGECT_DETAIL.equals(extHdMg.get("TYPE"))) {
								maps.put("LOAN_REGECT_DETAIL", JSON.toJSONString(extHdMg.get("DATA")));
							} else if (HdConstant.LOAN_OVERDUE_DETAIL.equals(extHdMg.get("TYPE"))) {
								maps.put("LOAN_OVERDUE_DETAIL", JSON.toJSONString(extHdMg.get("DATA")));
							} else if (HdConstant.LOAN_DEBAT_DETAIL.equals(extHdMg.get("TYPE"))) {
								maps.put("LOAN_DEBAT_DETAIL", JSON.toJSONString(extHdMg.get("DATA")));
							}

						}
					}

					maps.put("INTO_APP_ID", map.get("intoId"));
					maps.put("INTO_CUST_REF_ID", map.get("intoCustomerRefId"));
					maps.put("CREATE_BY", Long.parseLong("-1"));
					maps.put("VALIDATE_STATE", ("1"));
                    maps.put("dto", new ExtHdCreditInfoDTO());
					
					interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_1.getKey());
					interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_1.getValue());

					logger.info("---------------ExtHdCreditInfoRstService 数据落地的参数   maps ： " + JSON.toJSONString(maps));
					//添加数据
					extHdMgBaseInfoDao.insertExtHdWLCreditInfo(maps);
					ExtHdCreditInfoDTO dto = (ExtHdCreditInfoDTO)maps.get("dto");
                    fkBizId = dto.getId().toString();
				}
				

			}else if(StringUtils.isEmpty(results)||"null".equals(results)){
				interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_3.getKey());
				interfaceLogDto.setRetMsg("华道信贷信息返回报文为空！");
			}
		} catch (Exception e) {
			interfaceLogDto.setRetCode(InterfaceEnum.RET_CODE_4.getKey());//解析回参出错
			 interfaceLogDto.setRetMsg(InterfaceEnum.RET_CODE_4.getValue());
			 JYLoggerUtil.error(this.getClass(), "===保存华道信贷信息日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
		}finally{
			try {
				//
		    	interfaceLogDto.setRetBody(results);
				interfaceLogDto.setExt2(isSuccess);
				interfaceLogDto.setExt3(retCode);
                interfaceLogDto.setExt5(fkBizId);
				Long keyId =extInterfaceLogService.insertExtInterfaceLog(interfaceLogDto);
			} catch (Exception e) {
				JYLoggerUtil.error(this.getClass(), "===保存华道信贷信息日志异常===接口日志ID:"+String.valueOf(map.get("interfaceId")), e);
			}
		}

	}

}
