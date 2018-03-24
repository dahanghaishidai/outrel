package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalinkmaninfo.service;

import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalinkmaninfo.dao.ExtWlFpxaLinkManInfoDao;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalinkmaninfo.dto.ExtWlFpxaLinkManInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: ExtWlFpxaLinkManInfoService
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalinkmaninfo.service
 * @describe: 定义  EXT_WL_FPXA_LINK_MAN_INFO 实现类
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 9:52
 **/
@Service("com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalinkmaninfo.service.ExtWlFpxaLinkManInfoService")
public class ExtWlFpxaLinkManInfoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlFpxaLinkManInfoDao dao;

	/**
	 * @methodName: insertExtWlFpxaLinkManInfo
	 * @param: [dto]
	 * @describe: 新增 EXT_WL_FPXA_LINK_MAN_INFO对象
	 * @auther: huangxianchao
	 * @date: 2018/1/16 0016
	 * @time: 上午 10:01
	 **/
	@SuppressWarnings("all")
	public Long insertExtWlFpxaLinkManInfo(ExtWlFpxaLinkManInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlFpxaLinkManInfo(paramMap);
		
		ExtWlFpxaLinkManInfoDTO resultDto = (ExtWlFpxaLinkManInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

}

