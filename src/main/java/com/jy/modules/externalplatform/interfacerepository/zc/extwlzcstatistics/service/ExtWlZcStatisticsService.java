package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcstatistics.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcstatistics.dto.ExtWlZcStatisticsDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcstatistics.dao.ExtWlZcStatisticsDao;

/**
 * @classname: ExtWlZcStatisticsService
 * @description: 定义  致诚统计次数表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zc.extwlzcstatistics.service.ExtWlZcStatisticsService")
public class ExtWlZcStatisticsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZcStatisticsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 致诚统计次数表列表
     * @date 2017-12-07 13:40:09
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZcStatisticsDTO> searchExtWlZcStatisticsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZcStatisticsDTO> dataList =  dao.searchExtWlZcStatisticsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询致诚统计次数表列表
     * @date 2017-12-07 13:40:09
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZcStatisticsDTO> searchExtWlZcStatistics(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZcStatisticsDTO> dataList = dao.searchExtWlZcStatistics(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询致诚统计次数表对象
     * @date 2017-12-07 13:40:09
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZcStatisticsDTO queryExtWlZcStatisticsByPrimaryKey(String id) throws Exception {
		
		ExtWlZcStatisticsDTO dto = dao.findExtWlZcStatisticsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZcStatisticsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZcStatistics
     * @author Administrator
     * @description: 新增 致诚统计次数表对象
     * @date 2017-12-07 13:40:09
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZcStatistics(ExtWlZcStatisticsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZcStatistics(paramMap);
		
		ExtWlZcStatisticsDTO resultDto = (ExtWlZcStatisticsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZcStatistics
     * @author Administrator
     * @description: 修改 致诚统计次数表对象
     * @date 2017-12-07 13:40:09
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlZcStatistics(ExtWlZcStatisticsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZcStatistics(paramMap);
	}
	/**
     * @title: deleteExtWlZcStatisticsByPrimaryKey
     * @author Administrator
     * @description: 删除 致诚统计次数表,按主键
     * @date 2017-12-07 13:40:09
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlZcStatisticsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZcStatisticsByPrimaryKey(paramMap);
	}

}

