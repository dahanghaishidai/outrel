package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmultiloan.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmultiloan.dto.ExtWlSmMultiloanDTO;
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmultiloan.dao.ExtWlSmMultiloanDao;

/**
 * @classname: ExtWlSmMultiloanService
 * @description: 定义  数美多平台借贷服务信息(外联平台表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmultiloan.service.ExtWlSmMultiloanService")
public class ExtWlSmMultiloanService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlSmMultiloanDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 数美多平台借贷服务信息(外联平台表)列表
     * @date 2017-09-26 14:26:38
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlSmMultiloanDTO> searchExtWlSmMultiloanByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlSmMultiloanDTO> dataList =  dao.searchExtWlSmMultiloanByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询数美多平台借贷服务信息(外联平台表)列表
     * @date 2017-09-26 14:26:38
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlSmMultiloanDTO> searchExtWlSmMultiloan(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlSmMultiloanDTO> dataList = dao.searchExtWlSmMultiloan(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询数美多平台借贷服务信息(外联平台表)对象
     * @date 2017-09-26 14:26:38
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlSmMultiloanDTO queryExtWlSmMultiloanByPrimaryKey(String id) throws Exception {
		
		ExtWlSmMultiloanDTO dto = dao.findExtWlSmMultiloanByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlSmMultiloanDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlSmMultiloan
     * @author Administrator
     * @description: 新增 数美多平台借贷服务信息(外联平台表)对象
     * @date 2017-09-26 14:26:38
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlSmMultiloan(ExtWlSmMultiloanDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);

		if(null != dto.getIntoCustRefId() && StringUtils.isNotEmpty(dto.getIntoCustRefId().toString())){
		    dao.updateExtWlSmMultiloanByIntocustid(paramMap);
	    }
		 
		int count = dao.insertExtWlSmMultiloan(paramMap);
		
		ExtWlSmMultiloanDTO resultDto = (ExtWlSmMultiloanDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlSmMultiloan
     * @author Administrator
     * @description: 修改 数美多平台借贷服务信息(外联平台表)对象
     * @date 2017-09-26 14:26:38
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlSmMultiloan(ExtWlSmMultiloanDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlSmMultiloan(paramMap);
	}
	/**
     * @title: deleteExtWlSmMultiloanByPrimaryKey
     * @author Administrator
     * @description: 删除 数美多平台借贷服务信息(外联平台表),按主键
     * @date 2017-09-26 14:26:38
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlSmMultiloanByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlSmMultiloanByPrimaryKey(paramMap);
	}

}

