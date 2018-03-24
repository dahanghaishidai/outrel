package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacollection.service;

import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacollection.dao.ExtWlFpxaCollectionDao;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacollection.dto.ExtWlFpxaCollectionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: ExtWlFpxaCollectionService
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacollection.service
 * @describe: 定义  EXT_WL_FPXA_COLLECTION 实现类
 * @auther: huangxianchao
 * @date: 2018/1/15 0015
 * @time: 下午 7:55
 **/
@Service("com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacollection.service.ExtWlFpxaCollectionService")
public class ExtWlFpxaCollectionService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlFpxaCollectionDao dao;

	/**
	 * @methodName: insertExtWlFpxaCollection
	 * @param: [dto]
	 * @describe: 新增 EXT_WL_FPXA_COLLECTION对象
	 * @auther: huangxianchao
	 * @date: 2018/1/15 0015
	 * @time: 下午 7:55
	 **/
	@SuppressWarnings("all")
	public Long insertExtWlFpxaCollection(ExtWlFpxaCollectionDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlFpxaCollection(paramMap);
		
		ExtWlFpxaCollectionDTO resultDto = (ExtWlFpxaCollectionDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

}

