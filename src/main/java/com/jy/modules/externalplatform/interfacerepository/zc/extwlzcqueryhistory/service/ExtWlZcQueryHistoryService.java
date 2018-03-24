package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryhistory.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryhistory.dto.ExtWlZcQueryHistoryDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryhistory.dao.ExtWlZcQueryHistoryDao;

/**
 * @classname: ExtWlZcQueryHistoryService
 * @description: 定义  致诚查询历史表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryhistory.service.ExtWlZcQueryHistoryService")
public class ExtWlZcQueryHistoryService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZcQueryHistoryDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 致诚查询历史表列表
     * @date 2017-12-07 13:40:15
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZcQueryHistoryDTO> searchExtWlZcQueryHistoryByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZcQueryHistoryDTO> dataList =  dao.searchExtWlZcQueryHistoryByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询致诚查询历史表列表
     * @date 2017-12-07 13:40:15
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZcQueryHistoryDTO> searchExtWlZcQueryHistory(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZcQueryHistoryDTO> dataList = dao.searchExtWlZcQueryHistory(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询致诚查询历史表对象
     * @date 2017-12-07 13:40:15
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZcQueryHistoryDTO queryExtWlZcQueryHistoryByPrimaryKey(String id) throws Exception {
		
		ExtWlZcQueryHistoryDTO dto = dao.findExtWlZcQueryHistoryByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZcQueryHistoryDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZcQueryHistory
     * @author Administrator
     * @description: 新增 致诚查询历史表对象
     * @date 2017-12-07 13:40:15
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZcQueryHistory(ExtWlZcQueryHistoryDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZcQueryHistory(paramMap);
		
		ExtWlZcQueryHistoryDTO resultDto = (ExtWlZcQueryHistoryDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZcQueryHistory
     * @author Administrator
     * @description: 修改 致诚查询历史表对象
     * @date 2017-12-07 13:40:15
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlZcQueryHistory(ExtWlZcQueryHistoryDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZcQueryHistory(paramMap);
	}
	/**
     * @title: deleteExtWlZcQueryHistoryByPrimaryKey
     * @author Administrator
     * @description: 删除 致诚查询历史表,按主键
     * @date 2017-12-07 13:40:15
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlZcQueryHistoryByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZcQueryHistoryByPrimaryKey(paramMap);
	}
	/**
     * 批量保存致诚查询历史信息
     * @param historyList
     */
    public void batchInsertHistory(List<ExtWlZcQueryHistoryDTO> historyList) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("historyList", historyList);       
        dao.batchInsertHistory(paramMap);
    }
    
}

