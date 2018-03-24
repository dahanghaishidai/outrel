package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegatived.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegatived.dto.ExtWlTxskNegativeDDTO;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegatived.dao.ExtWlTxskNegativeDDao;

/**
 * @className: ExtWlTxskNegativeDService
 * @package: com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegatived.service
 * @describe: 定义  负面信息查询详情表 实现类
 * @auther: 董康宁
 * @date: 2018/1/19
 * @time: 13:57
 */
@Service("com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegatived.service.ExtWlTxskNegativeDService")
public class ExtWlTxskNegativeDService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlTxskNegativeDDao dao;


	/**
	 * @className: ExtWlTxskNegativeDService
	 * @package: com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegatived.service
	 * @describe: 新增 负面信息查询详情表对象
	 * @auther: 董康宁
	 * @date: 2018/1/19
	 * @time: 13:58
	 */
	@SuppressWarnings("all")
	public Long insertExtWlTxskNegativeD(ExtWlTxskNegativeDDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlTxskNegativeD(paramMap);
		
		ExtWlTxskNegativeDDTO resultDto = (ExtWlTxskNegativeDDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

}

