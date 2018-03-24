package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheckd.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheckd.dto.ExtWlTxskCheckDDTO;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheckd.dao.ExtWlTxskCheckDDao;

/**
 * @className: ExtWlTxskCheckDService
 * @package: com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheckd.service
 * @describe: 定义  个人信用验证详情表 实现类
 * @auther: 董康宁
 * @date: 2018/1/15
 * @time: 11:21
 */
@Service("com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheckd.service.ExtWlTxskCheckDService")
public class ExtWlTxskCheckDService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlTxskCheckDDao dao;


	/**
	 * @methodName: insertExtWlTxskCheckD
	 * @param: [dto]
	 * @describe: 新增 个人信用验证详情表对象
	 * @auther: 董康宁
	 * @date: 2018/1/15
	 * @time: 11:22
	 */
	@SuppressWarnings("all")
	public Long insertExtWlTxskCheckD(ExtWlTxskCheckDDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlTxskCheckD(paramMap);
		
		ExtWlTxskCheckDDTO resultDto = (ExtWlTxskCheckDDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

}

