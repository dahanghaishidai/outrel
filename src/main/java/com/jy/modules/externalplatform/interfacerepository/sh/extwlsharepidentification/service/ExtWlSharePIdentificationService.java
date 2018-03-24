package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepidentification.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepidentification.dto.ExtWlSharePIdentificationDTO;
import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepidentification.dao.ExtWlSharePIdentificationDao;

/**
 * @classname: ExtWlSharePIdentificationService
 * @description: 定义  算话共享报告_身份信息概要(身份信息) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepidentification.service.ExtWlSharePIdentificationService")
public class ExtWlSharePIdentificationService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlSharePIdentificationDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话共享报告_身份信息概要(身份信息)列表
     * @date 2017-12-07 19:52:47
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlSharePIdentificationDTO> searchExtWlSharePIdentificationByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlSharePIdentificationDTO> dataList =  dao.searchExtWlSharePIdentificationByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话共享报告_身份信息概要(身份信息)列表
     * @date 2017-12-07 19:52:47
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlSharePIdentificationDTO> searchExtWlSharePIdentification(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlSharePIdentificationDTO> dataList = dao.searchExtWlSharePIdentification(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话共享报告_身份信息概要(身份信息)对象
     * @date 2017-12-07 19:52:47
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlSharePIdentificationDTO queryExtWlSharePIdentificationByPrimaryKey(String id) throws Exception {
		
		ExtWlSharePIdentificationDTO dto = dao.findExtWlSharePIdentificationByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlSharePIdentificationDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlSharePIdentification
     * @author Administrator
     * @description: 新增 算话共享报告_身份信息概要(身份信息)对象
     * @date 2017-12-07 19:52:47
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlSharePIdentification(ExtWlSharePIdentificationDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlSharePIdentification(paramMap);
		
		ExtWlSharePIdentificationDTO resultDto = (ExtWlSharePIdentificationDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlSharePIdentification
     * @author Administrator
     * @description: 修改 算话共享报告_身份信息概要(身份信息)对象
     * @date 2017-12-07 19:52:47
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlSharePIdentification(ExtWlSharePIdentificationDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlSharePIdentification(paramMap);
	}
	/**
     * @title: deleteExtWlSharePIdentificationByPrimaryKey
     * @author Administrator
     * @description: 删除 算话共享报告_身份信息概要(身份信息),按主键
     * @date 2017-12-07 19:52:47
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlSharePIdentificationByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlSharePIdentificationByPrimaryKey(paramMap);
	}

}

