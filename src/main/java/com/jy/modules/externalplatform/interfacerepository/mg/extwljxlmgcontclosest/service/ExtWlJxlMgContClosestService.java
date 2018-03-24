package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontclosest.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontclosest.dto.ExtWlJxlMgContClosestDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontclosest.dao.ExtWlJxlMgContClosestDao;

/**
 * @classname: ExtWlJxlMgContClosestService
 * @description: 定义  蜜罐与联系人的最大亲密度表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontclosest.service.ExtWlJxlMgContClosestService")
public class ExtWlJxlMgContClosestService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgContClosestDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 蜜罐与联系人的最大亲密度表列表
     * @date 2018-01-09 17:45:04
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgContClosestDTO> searchExtWlJxlMgContClosestByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgContClosestDTO> dataList =  dao.searchExtWlJxlMgContClosestByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询蜜罐与联系人的最大亲密度表列表
     * @date 2018-01-09 17:45:04
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgContClosestDTO> searchExtWlJxlMgContClosest(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgContClosestDTO> dataList = dao.searchExtWlJxlMgContClosest(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询蜜罐与联系人的最大亲密度表对象
     * @date 2018-01-09 17:45:04
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgContClosestDTO queryExtWlJxlMgContClosestByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgContClosestDTO dto = dao.findExtWlJxlMgContClosestByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgContClosestDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgContClosest
     * @author Administrator
     * @description: 新增 蜜罐与联系人的最大亲密度表对象
     * @date 2018-01-09 17:45:04
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgContClosest(ExtWlJxlMgContClosestDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgContClosest(paramMap);
		
		ExtWlJxlMgContClosestDTO resultDto = (ExtWlJxlMgContClosestDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgContClosest
     * @author Administrator
     * @description: 修改 蜜罐与联系人的最大亲密度表对象
     * @date 2018-01-09 17:45:04
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgContClosest(ExtWlJxlMgContClosestDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgContClosest(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgContClosestByPrimaryKey
     * @author Administrator
     * @description: 删除 蜜罐与联系人的最大亲密度表,按主键
     * @date 2018-01-09 17:45:04
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgContClosestByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgContClosestByPrimaryKey(paramMap);
	}

}

