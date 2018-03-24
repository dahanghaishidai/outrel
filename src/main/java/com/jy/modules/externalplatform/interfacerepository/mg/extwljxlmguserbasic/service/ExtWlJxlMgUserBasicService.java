package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserbasic.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserbasic.dto.ExtWlJxlMgUserBasicDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserbasic.dao.ExtWlJxlMgUserBasicDao;

/**
 * @classname: ExtWlJxlMgUserBasicService
 * @description: 定义  聚信立蜜罐用户基本信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserbasic.service.ExtWlJxlMgUserBasicService")
public class ExtWlJxlMgUserBasicService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgUserBasicDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 聚信立蜜罐用户基本信息列表
     * @date 2017-12-14 13:55:27
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgUserBasicDTO> searchExtWlJxlMgUserBasicByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgUserBasicDTO> dataList =  dao.searchExtWlJxlMgUserBasicByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询聚信立蜜罐用户基本信息列表
     * @date 2017-12-14 13:55:27
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgUserBasicDTO> searchExtWlJxlMgUserBasic(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgUserBasicDTO> dataList = dao.searchExtWlJxlMgUserBasic(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询聚信立蜜罐用户基本信息对象
     * @date 2017-12-14 13:55:27
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgUserBasicDTO queryExtWlJxlMgUserBasicByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgUserBasicDTO dto = dao.findExtWlJxlMgUserBasicByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgUserBasicDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgUserBasic
     * @author Administrator
     * @description: 新增 聚信立蜜罐用户基本信息对象
     * @date 2017-12-14 13:55:27
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgUserBasic(ExtWlJxlMgUserBasicDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgUserBasic(paramMap);
		
		ExtWlJxlMgUserBasicDTO resultDto = (ExtWlJxlMgUserBasicDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgUserBasic
     * @author Administrator
     * @description: 修改 聚信立蜜罐用户基本信息对象
     * @date 2017-12-14 13:55:27
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgUserBasic(ExtWlJxlMgUserBasicDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgUserBasic(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgUserBasicByPrimaryKey
     * @author Administrator
     * @description: 删除 聚信立蜜罐用户基本信息,按主键
     * @date 2017-12-14 13:55:27
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgUserBasicByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgUserBasicByPrimaryKey(paramMap);
	}

}

