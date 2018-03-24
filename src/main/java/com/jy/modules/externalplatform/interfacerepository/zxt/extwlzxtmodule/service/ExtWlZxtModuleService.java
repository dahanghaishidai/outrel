package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtmodule.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtmodule.dto.ExtWlZxtModuleDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtmodule.dao.ExtWlZxtModuleDao;

/**
 * @classname: ExtWlZxtModuleService
 * @description: 定义  模块查询状态表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtmodule.service.ExtWlZxtModuleService")
public class ExtWlZxtModuleService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZxtModuleDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 模块查询状态表列表
     * @date 2017-12-14 19:06:01
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZxtModuleDTO> searchExtWlZxtModuleByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZxtModuleDTO> dataList =  dao.searchExtWlZxtModuleByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询模块查询状态表列表
     * @date 2017-12-14 19:06:01
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtModuleDTO> searchExtWlZxtModule(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZxtModuleDTO> dataList = dao.searchExtWlZxtModule(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询模块查询状态表对象
     * @date 2017-12-14 19:06:01
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZxtModuleDTO queryExtWlZxtModuleByPrimaryKey(String id) throws Exception {
		
		ExtWlZxtModuleDTO dto = dao.findExtWlZxtModuleByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZxtModuleDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZxtModule
     * @author Administrator
     * @description: 新增 模块查询状态表对象
     * @date 2017-12-14 19:06:01
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZxtModule(ExtWlZxtModuleDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZxtModule(paramMap);
		
		ExtWlZxtModuleDTO resultDto = (ExtWlZxtModuleDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZxtModule
     * @author Administrator
     * @description: 修改 模块查询状态表对象
     * @date 2017-12-14 19:06:01
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlZxtModule(ExtWlZxtModuleDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZxtModule(paramMap);
	}
	/**
     * @title: deleteExtWlZxtModuleByPrimaryKey
     * @author Administrator
     * @description: 删除 模块查询状态表,按主键
     * @date 2017-12-14 19:06:01
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlZxtModuleByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZxtModuleByPrimaryKey(paramMap);
	}

}

