package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.service;

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
import com.jy.modules.extbiz.in.interfaceMethod.dao.ExtSaveResponseMsgDao;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dao.ExtHdMgBaseInfoDao;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.dto.HdConstant;

/**
 * @description: 华道信贷信息
 * @author: sun
 */
@Service("com.jy.modules.externalplatform.interfacerepository.yszx.extyszxhdinfo.service.ExtHdCreditInfoWLProcesser")
public class ExtHdCreditInfoWLProcesser implements ExtSaveResponseMsgDao {
	private static final Logger logger = LoggerFactory.getLogger(ExtHdCreditInfoWLProcesser.class);

	@Autowired
	private ExtHdMgBaseInfoDao extHdMgBaseInfoDao;

	@SuppressWarnings("all")
	public void saveMessage(Map<String, Object> map) {
		String results = (String) map.get("result");
		logger.info("---------------ExtHdCreditInfoWLProcesser 华道信贷返回参数   results ： " + JSON.toJSONString(results));
		if (null != results) {

			Map resultMap = (Map) JSONObject.parse(results);
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

			logger.info("---------------ExtHdCreditInfoWLProcesser 数据落地的参数   maps ： " + JSON.toJSONString(maps));
			extHdMgBaseInfoDao.insertExtHdCreditInfo(maps);

		}

	}

}
