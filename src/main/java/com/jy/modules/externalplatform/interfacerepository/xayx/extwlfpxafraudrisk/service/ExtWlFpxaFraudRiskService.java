package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxafraudrisk.service;

import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxafraudrisk.dao.ExtWlFpxaFraudRiskDao;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxafraudrisk.dto.ExtWlFpxaFraudRiskDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: ExtWlFpxaFraudRiskService
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxafraudrisk.service
 * @describe: 定义  EXT_WL_FPXA_FRAUD_RISK 实现类
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 9:47
 **/
@Service("com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxafraudrisk.service.ExtWlFpxaFraudRiskService")
public class ExtWlFpxaFraudRiskService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlFpxaFraudRiskDao dao;


	/**
	 * @methodName: insertExtWlFpxaFraudRisk
	 * @param: [dto]
	 * @describe: 新增 EXT_WL_FPXA_FRAUD_RISK对象
	 * @auther: huangxianchao
	 * @date: 2018/1/16 0016
	 * @time: 上午 9:47
	 **/
	@SuppressWarnings("all")
	public Long insertExtWlFpxaFraudRisk(ExtWlFpxaFraudRiskDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlFpxaFraudRisk(paramMap);
		
		ExtWlFpxaFraudRiskDTO resultDto = (ExtWlFpxaFraudRiskDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

}

