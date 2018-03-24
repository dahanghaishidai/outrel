package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontaquery.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontaquery.dto.ExtWlJxlMgContaQueryDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontaquery.dao.ExtWlJxlMgContaQueryDao;

/**
 * @classname: ExtWlJxlMgContaQueryService
 * @description: 定义  蜜罐联系人的查询历史表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontaquery.service.ExtWlJxlMgContaQueryService")
public class ExtWlJxlMgContaQueryService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgContaQueryDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 蜜罐联系人的查询历史表列表
     * @date 2018-01-09 17:46:36
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgContaQueryDTO> searchExtWlJxlMgContaQueryByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgContaQueryDTO> dataList =  dao.searchExtWlJxlMgContaQueryByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询蜜罐联系人的查询历史表列表
     * @date 2018-01-09 17:46:36
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgContaQueryDTO> searchExtWlJxlMgContaQuery(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgContaQueryDTO> dataList = dao.searchExtWlJxlMgContaQuery(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询蜜罐联系人的查询历史表对象
     * @date 2018-01-09 17:46:36
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgContaQueryDTO queryExtWlJxlMgContaQueryByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgContaQueryDTO dto = dao.findExtWlJxlMgContaQueryByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgContaQueryDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgContaQuery
     * @author Administrator
     * @description: 新增 蜜罐联系人的查询历史表对象
     * @date 2018-01-09 17:46:36
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgContaQuery(ExtWlJxlMgContaQueryDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgContaQuery(paramMap);
		
		ExtWlJxlMgContaQueryDTO resultDto = (ExtWlJxlMgContaQueryDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgContaQuery
     * @author Administrator
     * @description: 修改 蜜罐联系人的查询历史表对象
     * @date 2018-01-09 17:46:36
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgContaQuery(ExtWlJxlMgContaQueryDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgContaQuery(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgContaQueryByPrimaryKey
     * @author Administrator
     * @description: 删除 蜜罐联系人的查询历史表,按主键
     * @date 2018-01-09 17:46:36
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgContaQueryByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgContaQueryByPrimaryKey(paramMap);
	}

}

