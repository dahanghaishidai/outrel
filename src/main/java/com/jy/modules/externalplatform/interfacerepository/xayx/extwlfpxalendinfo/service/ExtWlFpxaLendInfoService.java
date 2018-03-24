package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalendinfo.service;

import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalendinfo.dao.ExtWlFpxaLendInfoDao;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalendinfo.dto.ExtWlFpxaLendInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: ExtWlFpxaLendInfoService
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalendinfo.service
 * @describe: 定义  EXT_WL_FPXA_LEND_INFO 实现类
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 9:49
 **/
@Service("com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalendinfo.service.ExtWlFpxaLendInfoService")
public class ExtWlFpxaLendInfoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlFpxaLendInfoDao dao;


	/**
	 * @methodName: insertExtWlFpxaLendInfo
	 * @param: [dto]
	 * @describe: 新增 EXT_WL_FPXA_LEND_INFO对象
	 * @auther: huangxianchao
	 * @date: 2018/1/16 0016
	 * @time: 上午 9:50
	 **/
	@SuppressWarnings("all")
	public Long insertExtWlFpxaLendInfo(ExtWlFpxaLendInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlFpxaLendInfo(paramMap);
		
		ExtWlFpxaLendInfoDTO resultDto = (ExtWlFpxaLendInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}



}

