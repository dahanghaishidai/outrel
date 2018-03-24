package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklendmulti.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklendmulti.dto.ExtWlTxskLendMultiDTO;
import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklendmulti.dao.ExtWlTxskLendMultiDao;

/**
 * @className: ExtWlTxskLendMultiService
 * @package: com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklendmulti.service
 * @describe: 定义  多重借贷查询数据表 实现类
 * @auther: 董康宁
 * @date: 2018/1/12
 * @time: 17:07
 */
@Service("com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklendmulti.service.ExtWlTxskLendMultiService")
public class ExtWlTxskLendMultiService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlTxskLendMultiDao dao;


	/**
	 * @methodName: insertExtWlTxskLendMulti
	 * @param: [dto]
	 * @describe: 新增 多重借贷查询数据表对象
	 * @auther: 董康宁
	 * @date: 2018/1/12
	 * @time: 17:07
	 */
	@SuppressWarnings("all")
	public Long insertExtWlTxskLendMulti(ExtWlTxskLendMultiDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlTxskLendMulti(paramMap);
		
		ExtWlTxskLendMultiDTO resultDto = (ExtWlTxskLendMultiDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}

}

