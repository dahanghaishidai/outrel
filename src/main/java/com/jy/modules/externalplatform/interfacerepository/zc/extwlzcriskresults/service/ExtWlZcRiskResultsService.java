package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcriskresults.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcriskresults.dto.ExtWlZcRiskResultsDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcriskresults.dao.ExtWlZcRiskResultsDao;

/**
 * @classname: ExtWlZcRiskResultsService
 * @description: 定义  致诚风险项记录表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zc.extwlzcriskresults.service.ExtWlZcRiskResultsService")
public class ExtWlZcRiskResultsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZcRiskResultsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 致诚风险项记录表列表
     * @date 2017-12-07 13:40:28
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZcRiskResultsDTO> searchExtWlZcRiskResultsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZcRiskResultsDTO> dataList =  dao.searchExtWlZcRiskResultsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询致诚风险项记录表列表
     * @date 2017-12-07 13:40:28
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZcRiskResultsDTO> searchExtWlZcRiskResults(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZcRiskResultsDTO> dataList = dao.searchExtWlZcRiskResults(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询致诚风险项记录表对象
     * @date 2017-12-07 13:40:28
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZcRiskResultsDTO queryExtWlZcRiskResultsByPrimaryKey(String id) throws Exception {
		
		ExtWlZcRiskResultsDTO dto = dao.findExtWlZcRiskResultsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZcRiskResultsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZcRiskResults
     * @author Administrator
     * @description: 新增 致诚风险项记录表对象
     * @date 2017-12-07 13:40:28
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZcRiskResults(ExtWlZcRiskResultsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZcRiskResults(paramMap);
		
		ExtWlZcRiskResultsDTO resultDto = (ExtWlZcRiskResultsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZcRiskResults
     * @author Administrator
     * @description: 修改 致诚风险项记录表对象
     * @date 2017-12-07 13:40:28
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlZcRiskResults(ExtWlZcRiskResultsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZcRiskResults(paramMap);
	}
	/**
     * @title: deleteExtWlZcRiskResultsByPrimaryKey
     * @author Administrator
     * @description: 删除 致诚风险项记录表,按主键
     * @date 2017-12-07 13:40:28
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlZcRiskResultsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZcRiskResultsByPrimaryKey(paramMap);
	}
    public void batchInsertRiskResults(List<ExtWlZcRiskResultsDTO> riskResultsList) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("riskResultsList", riskResultsList);       
        dao.batchInsertRiskResults(paramMap);
    }

}

