package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconsulabel.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconsulabel.dto.ExtWlJxlMgConsuLabelDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconsulabel.dao.ExtWlJxlMgConsuLabelDao;

/**
 * @classname: ExtWlJxlMgConsuLabelService
 * @description: 定义  蜜罐消费标签信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconsulabel.service.ExtWlJxlMgConsuLabelService")
public class ExtWlJxlMgConsuLabelService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgConsuLabelDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 蜜罐消费标签信息列表
     * @date 2018-01-09 17:47:24
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgConsuLabelDTO> searchExtWlJxlMgConsuLabelByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgConsuLabelDTO> dataList =  dao.searchExtWlJxlMgConsuLabelByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询蜜罐消费标签信息列表
     * @date 2018-01-09 17:47:24
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgConsuLabelDTO> searchExtWlJxlMgConsuLabel(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgConsuLabelDTO> dataList = dao.searchExtWlJxlMgConsuLabel(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询蜜罐消费标签信息对象
     * @date 2018-01-09 17:47:24
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgConsuLabelDTO queryExtWlJxlMgConsuLabelByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgConsuLabelDTO dto = dao.findExtWlJxlMgConsuLabelByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgConsuLabelDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgConsuLabel
     * @author Administrator
     * @description: 新增 蜜罐消费标签信息对象
     * @date 2018-01-09 17:47:24
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgConsuLabel(ExtWlJxlMgConsuLabelDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgConsuLabel(paramMap);
		
		ExtWlJxlMgConsuLabelDTO resultDto = (ExtWlJxlMgConsuLabelDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgConsuLabel
     * @author Administrator
     * @description: 修改 蜜罐消费标签信息对象
     * @date 2018-01-09 17:47:24
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgConsuLabel(ExtWlJxlMgConsuLabelDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgConsuLabel(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgConsuLabelByPrimaryKey
     * @author Administrator
     * @description: 删除 蜜罐消费标签信息,按主键
     * @date 2018-01-09 17:47:24
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgConsuLabelByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgConsuLabelByPrimaryKey(paramMap);
	}

}

