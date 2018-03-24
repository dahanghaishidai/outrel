package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jy.modules.extbiz.in.interfaceMethod.dao.ExtSaveResponseMsgDao;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dao.ExtHdMgBaseInfoDao;


/**
 * @description: 手机黑名单
 * @author: sun
 */
@Service("com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.service.ExtHdPhoneBckLisInfoWLProcesser")
public class ExtHdPhoneBckLisInfoWLProcesser implements ExtSaveResponseMsgDao {
	private static final Logger logger = LoggerFactory.getLogger(ExtHdPhoneBckLisInfoWLProcesser.class);

	@Autowired
	private ExtHdMgBaseInfoDao baseInfoDao;

	@SuppressWarnings("all")
	public void saveMessage(Map<String, Object> map) {
		logger.info("---------------ExtHdPhoneBckLisInfoWLProcesser 华道手机黑名单返回参数   results ： " + JSON.toJSONString(map));
		String results = (String) map.get("result");
		if (null != results) {
			Map resultMap = (Map) JSONObject.parse(results);

			Map<String, Object> maps = new HashMap<String, Object>();
			maps.put("CODE",resultMap.get("CODE"));
			maps.put("IS_BLACK",resultMap.get("IS_BLACK"));
			maps.put("INTO_CUST_REF_ID", map.get("intoCustomerRefId"));
			maps.put("CREATE_BY", Long.parseLong("-1"));
			maps.put("VALIDATE_STATE", ("1"));

			logger.info("---------------ExtHdPhoneBckLisInfoWLProcesser 数据落地的参数   maps ： " + JSON.toJSONString(maps));
			baseInfoDao.insertExtHdPhoneBckLis(maps);

		}

	}

}
