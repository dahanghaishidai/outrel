package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserblacklist.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserblacklist.dto.ExtWlJxlMgUserBlacklistDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserblacklist.dao.ExtWlJxlMgUserBlacklistDao;

/**
 * @classname: ExtWlJxlMgUserBlacklistService
 * @description: 定义  聚信立蜜罐黑名单信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserblacklist.service.ExtWlJxlMgUserBlacklistService")
public class ExtWlJxlMgUserBlacklistService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgUserBlacklistDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 聚信立蜜罐黑名单信息列表
     * @date 2017-12-14 13:54:39
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgUserBlacklistDTO> searchExtWlJxlMgUserBlacklistByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgUserBlacklistDTO> dataList =  dao.searchExtWlJxlMgUserBlacklistByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询聚信立蜜罐黑名单信息列表
     * @date 2017-12-14 13:54:39
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgUserBlacklistDTO> searchExtWlJxlMgUserBlacklist(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgUserBlacklistDTO> dataList = dao.searchExtWlJxlMgUserBlacklist(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询聚信立蜜罐黑名单信息对象
     * @date 2017-12-14 13:54:39
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgUserBlacklistDTO queryExtWlJxlMgUserBlacklistByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgUserBlacklistDTO dto = dao.findExtWlJxlMgUserBlacklistByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgUserBlacklistDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgUserBlacklist
     * @author Administrator
     * @description: 新增 聚信立蜜罐黑名单信息对象
     * @date 2017-12-14 13:54:39
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgUserBlacklist(ExtWlJxlMgUserBlacklistDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgUserBlacklist(paramMap);
		
		ExtWlJxlMgUserBlacklistDTO resultDto = (ExtWlJxlMgUserBlacklistDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgUserBlacklist
     * @author Administrator
     * @description: 修改 聚信立蜜罐黑名单信息对象
     * @date 2017-12-14 13:54:39
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgUserBlacklist(ExtWlJxlMgUserBlacklistDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgUserBlacklist(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgUserBlacklistByPrimaryKey
     * @author Administrator
     * @description: 删除 聚信立蜜罐黑名单信息,按主键
     * @date 2017-12-14 13:54:39
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgUserBlacklistByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgUserBlacklistByPrimaryKey(paramMap);
	}

}

