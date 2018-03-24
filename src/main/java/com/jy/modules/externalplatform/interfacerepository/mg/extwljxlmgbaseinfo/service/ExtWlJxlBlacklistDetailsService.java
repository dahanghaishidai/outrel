package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto.ExtWlJxlBlacklistDetailsDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dao.ExtWlJxlBlacklistDetailsDao;

/**
 * @classname: ExtWlJxlBlacklistDetailsService
 * @description: 定义  聚信立蜜罐黑名单详情 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.service.ExtWlJxlBlacklistDetailsService")
public class ExtWlJxlBlacklistDetailsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlBlacklistDetailsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 聚信立蜜罐黑名单详情列表
     * @date 2017-12-14 16:22:23
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlBlacklistDetailsDTO> searchExtWlJxlBlacklistDetailsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlBlacklistDetailsDTO> dataList =  dao.searchExtWlJxlBlacklistDetailsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询聚信立蜜罐黑名单详情列表
     * @date 2017-12-14 16:22:23
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlBlacklistDetailsDTO> searchExtWlJxlBlacklistDetails(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlBlacklistDetailsDTO> dataList = dao.searchExtWlJxlBlacklistDetails(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询聚信立蜜罐黑名单详情对象
     * @date 2017-12-14 16:22:23
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlBlacklistDetailsDTO queryExtWlJxlBlacklistDetailsByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlBlacklistDetailsDTO dto = dao.findExtWlJxlBlacklistDetailsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlBlacklistDetailsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlBlacklistDetails
     * @author Administrator
     * @description: 新增 聚信立蜜罐黑名单详情对象
     * @date 2017-12-14 16:22:23
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlBlacklistDetails(ExtWlJxlBlacklistDetailsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlBlacklistDetails(paramMap);
		
		ExtWlJxlBlacklistDetailsDTO resultDto = (ExtWlJxlBlacklistDetailsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlBlacklistDetails
     * @author Administrator
     * @description: 修改 聚信立蜜罐黑名单详情对象
     * @date 2017-12-14 16:22:23
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlBlacklistDetails(ExtWlJxlBlacklistDetailsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlBlacklistDetails(paramMap);
	}
	/**
     * @title: deleteExtWlJxlBlacklistDetailsByPrimaryKey
     * @author Administrator
     * @description: 删除 聚信立蜜罐黑名单详情,按主键
     * @date 2017-12-14 16:22:23
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlBlacklistDetailsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlBlacklistDetailsByPrimaryKey(paramMap);
	}

}

