package com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsstrategyset.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsstrategyset.dto.ExtWlBqsStrategySetDTO;
import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsstrategyset.dao.ExtWlBqsStrategySetDao;

/**
 * @classname: ExtWlBqsStrategySetService
 * @description: 定义  白骑士反欺诈云风险决策-策略集明细表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsstrategyset.service.ExtWlBqsStrategySetService")
public class ExtWlBqsStrategySetService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlBqsStrategySetDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 白骑士反欺诈云风险决策-策略集明细表列表
     * @date 2017-12-20 11:28:03
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBqsStrategySetDTO> searchExtWlBqsStrategySetByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBqsStrategySetDTO> dataList =  dao.searchExtWlBqsStrategySetByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询白骑士反欺诈云风险决策-策略集明细表列表
     * @date 2017-12-20 11:28:03
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBqsStrategySetDTO> searchExtWlBqsStrategySet(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBqsStrategySetDTO> dataList = dao.searchExtWlBqsStrategySet(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询白骑士反欺诈云风险决策-策略集明细表对象
     * @date 2017-12-20 11:28:03
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBqsStrategySetDTO queryExtWlBqsStrategySetByPrimaryKey(String id) throws Exception {
		
		ExtWlBqsStrategySetDTO dto = dao.findExtWlBqsStrategySetByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBqsStrategySetDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBqsStrategySet
     * @author Administrator
     * @description: 新增 白骑士反欺诈云风险决策-策略集明细表对象
     * @date 2017-12-20 11:28:03
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBqsStrategySet(ExtWlBqsStrategySetDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBqsStrategySet(paramMap);
		
		ExtWlBqsStrategySetDTO resultDto = (ExtWlBqsStrategySetDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBqsStrategySet
     * @author Administrator
     * @description: 修改 白骑士反欺诈云风险决策-策略集明细表对象
     * @date 2017-12-20 11:28:03
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlBqsStrategySet(ExtWlBqsStrategySetDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBqsStrategySet(paramMap);
	}
	/**
     * @title: deleteExtWlBqsStrategySetByPrimaryKey
     * @author Administrator
     * @description: 删除 白骑士反欺诈云风险决策-策略集明细表,按主键
     * @date 2017-12-20 11:28:03
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlBqsStrategySetByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBqsStrategySetByPrimaryKey(paramMap);
	}

}

