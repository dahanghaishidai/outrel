package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilestatus.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilestatus.dto.ExtWlPyzxMobileStatusDTO;
import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilestatus.dao.ExtWlPyzxMobileStatusDao;

/**
 * @className: ExtWlPyzxMobileStatusService
 * @package: com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilestatus.service
 * @describe: 定义  手机号码状态查询结果 实现类
 * @auther: 董康宁
 * @date: 2018/1/10
 * @time: 15:19
 */
@Service("com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilestatus.service.ExtWlPyzxMobileStatusService")
public class ExtWlPyzxMobileStatusService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlPyzxMobileStatusDao dao;


	/**
	 * @methodName: insertExtWlPyzxMobileStatus
	 * @param: [dto]
	 * @describe: 新增 手机号码状态查询结果对象
	 * @auther: 董康宁
	 * @date: 2018/1/10
	 * @time: 15:19
	 */
	@SuppressWarnings("all")
	public Long insertExtWlPyzxMobileStatus(ExtWlPyzxMobileStatusDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlPyzxMobileStatus(paramMap);
		
		ExtWlPyzxMobileStatusDTO resultDto = (ExtWlPyzxMobileStatusDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

}

