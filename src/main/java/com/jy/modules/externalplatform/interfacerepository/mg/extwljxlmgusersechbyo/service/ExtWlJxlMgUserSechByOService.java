package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusersechbyo.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusersechbyo.dto.ExtWlJxlMgUserSechByODTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusersechbyo.dao.ExtWlJxlMgUserSechByODao;

/**
 * @classname: ExtWlJxlMgUserSechByOService
 * @description: 定义  用户被机构查询历史 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusersechbyo.service.ExtWlJxlMgUserSechByOService")
public class ExtWlJxlMgUserSechByOService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgUserSechByODao dao;

	/**
     * @author Administrator
     * @description: 分页查询 用户被机构查询历史列表
     * @date 2017-12-14 13:54:03
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgUserSechByODTO> searchExtWlJxlMgUserSechByOByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgUserSechByODTO> dataList =  dao.searchExtWlJxlMgUserSechByOByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询用户被机构查询历史列表
     * @date 2017-12-14 13:54:03
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgUserSechByODTO> searchExtWlJxlMgUserSechByO(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgUserSechByODTO> dataList = dao.searchExtWlJxlMgUserSechByO(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询用户被机构查询历史对象
     * @date 2017-12-14 13:54:03
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgUserSechByODTO queryExtWlJxlMgUserSechByOByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgUserSechByODTO dto = dao.findExtWlJxlMgUserSechByOByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgUserSechByODTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgUserSechByO
     * @author Administrator
     * @description: 新增 用户被机构查询历史对象
     * @date 2017-12-14 13:54:03
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgUserSechByO(ExtWlJxlMgUserSechByODTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgUserSechByO(paramMap);
		
		ExtWlJxlMgUserSechByODTO resultDto = (ExtWlJxlMgUserSechByODTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgUserSechByO
     * @author Administrator
     * @description: 修改 用户被机构查询历史对象
     * @date 2017-12-14 13:54:03
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgUserSechByO(ExtWlJxlMgUserSechByODTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgUserSechByO(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgUserSechByOByPrimaryKey
     * @author Administrator
     * @description: 删除 用户被机构查询历史,按主键
     * @date 2017-12-14 13:54:03
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgUserSechByOByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgUserSechByOByPrimaryKey(paramMap);
	}

}

