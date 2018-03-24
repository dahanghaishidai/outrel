package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacontrctstatus.service;

import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacontrctstatus.dao.ExtWlFpxaContrctStatusDao;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacontrctstatus.dto.ExtWlFpxaContrctStatusDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: ExtWlFpxaContrctStatusService
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacontrctstatus.service
 * @describe: 定义  EXT_WL_FPXA_CONTRCT_STATUS 实现类
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 9:34
 **/
@Service("com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacontrctstatus.service.ExtWlFpxaContrctStatusService")
public class ExtWlFpxaContrctStatusService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlFpxaContrctStatusDao dao;


	/**
	 * @methodName: insertExtWlFpxaContrctStatus
	 * @param: [dto]
	 * @describe: 新增 EXT_WL_FPXA_CONTRCT_STATUS对象
	 * @auther: huangxianchao
	 * @date: 2018/1/16 0016
	 * @time: 上午 9:34
	 **/
	@SuppressWarnings("all")
	public Long insertExtWlFpxaContrctStatus(ExtWlFpxaContrctStatusDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlFpxaContrctStatus(paramMap);
		
		ExtWlFpxaContrctStatusDTO resultDto = (ExtWlFpxaContrctStatusDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

}

