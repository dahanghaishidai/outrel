package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxablack.service;

import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxablack.dao.ExtWlFpxaBlackDao;
import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxablack.dto.ExtWlFpxaBlackDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @className: ExtWlFpxaBlackService
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxablack.service
 * @describe: 定义  EXT_WL_FPXA_BLACK 实现类
 * @auther: huangxianchao
 * @date: 2018/1/15 0015
 * @time: 下午 7:50
 **/
@Service("com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxablack.service.ExtWlFpxaBlackService")
public class ExtWlFpxaBlackService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlFpxaBlackDao dao;




	/**
	 * @methodName: insertExtWlFpxaBlack
	 * @param: [dto]
	 * @describe: 新增 EXT_WL_FPXA_BLACK对象
	 * @auther: huangxianchao
	 * @date: 2018/1/15 0015
	 * @time: 下午 7:50
	 **/
	@SuppressWarnings("all")
	public Long insertExtWlFpxaBlack(ExtWlFpxaBlackDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlFpxaBlack(paramMap);
		
		ExtWlFpxaBlackDTO resultDto = (ExtWlFpxaBlackDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}



}

