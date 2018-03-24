package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusergray.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusergray.dto.ExtWlJxlMgUserGrayDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusergray.dao.ExtWlJxlMgUserGrayDao;

/**
 * @classname: ExtWlJxlMgUserGrayService
 * @description: 定义  聚信立蜜罐用户灰度分数信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusergray.service.ExtWlJxlMgUserGrayService")
public class ExtWlJxlMgUserGrayService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgUserGrayDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 聚信立蜜罐用户灰度分数信息列表
     * @date 2017-12-14 13:55:02
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgUserGrayDTO> searchExtWlJxlMgUserGrayByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgUserGrayDTO> dataList =  dao.searchExtWlJxlMgUserGrayByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询聚信立蜜罐用户灰度分数信息列表
     * @date 2017-12-14 13:55:02
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgUserGrayDTO> searchExtWlJxlMgUserGray(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgUserGrayDTO> dataList = dao.searchExtWlJxlMgUserGray(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询聚信立蜜罐用户灰度分数信息对象
     * @date 2017-12-14 13:55:02
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgUserGrayDTO queryExtWlJxlMgUserGrayByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgUserGrayDTO dto = dao.findExtWlJxlMgUserGrayByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgUserGrayDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgUserGray
     * @author Administrator
     * @description: 新增 聚信立蜜罐用户灰度分数信息对象
     * @date 2017-12-14 13:55:02
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgUserGray(ExtWlJxlMgUserGrayDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgUserGray(paramMap);
		
		ExtWlJxlMgUserGrayDTO resultDto = (ExtWlJxlMgUserGrayDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgUserGray
     * @author Administrator
     * @description: 修改 聚信立蜜罐用户灰度分数信息对象
     * @date 2017-12-14 13:55:02
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgUserGray(ExtWlJxlMgUserGrayDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgUserGray(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgUserGrayByPrimaryKey
     * @author Administrator
     * @description: 删除 聚信立蜜罐用户灰度分数信息,按主键
     * @date 2017-12-14 13:55:02
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgUserGrayByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgUserGrayByPrimaryKey(paramMap);
	}

}

