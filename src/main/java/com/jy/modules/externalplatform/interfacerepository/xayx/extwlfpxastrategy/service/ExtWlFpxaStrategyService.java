package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxastrategy.service;

import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxastrategy.dao.ExtWlFpxaStrategyDao;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxastrategy.dto.ExtWlFpxaStrategyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: ExtWlFpxaStrategyService
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxastrategy.service
 * @describe: 定义  EXT_WL_FPXA_STRATEGY 实现类
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 10:06
 **/
@Service("com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxastrategy.service.ExtWlFpxaStrategyService")
public class ExtWlFpxaStrategyService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlFpxaStrategyDao dao;


	/**
	 * @methodName: insertExtWlFpxaStrategy
	 * @param: [dto]
	 * @describe: 新增 EXT_WL_FPXA_STRATEGY对象
	 * @auther: huangxianchao
	 * @date: 2018/1/16 0016
	 * @time: 上午 10:06
	 **/
	@SuppressWarnings("all")
	public Long insertExtWlFpxaStrategy(ExtWlFpxaStrategyDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlFpxaStrategy(paramMap);
		
		ExtWlFpxaStrategyDTO resultDto = (ExtWlFpxaStrategyDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

}

