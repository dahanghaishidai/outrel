package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcnetworkanalysis.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcnetworkanalysis.dto.ExtWlZcNetworkAnalysisDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcnetworkanalysis.dao.ExtWlZcNetworkAnalysisDao;

/**
 * @classname: ExtWlZcNetworkAnalysisService
 * @description: 定义  致诚社交关系网数据表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zc.extwlzcnetworkanalysis.service.ExtWlZcNetworkAnalysisService")
public class ExtWlZcNetworkAnalysisService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZcNetworkAnalysisDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 致诚社交关系网数据表列表
     * @date 2017-12-07 13:39:42
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZcNetworkAnalysisDTO> searchExtWlZcNetworkAnalysisByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZcNetworkAnalysisDTO> dataList =  dao.searchExtWlZcNetworkAnalysisByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询致诚社交关系网数据表列表
     * @date 2017-12-07 13:39:42
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZcNetworkAnalysisDTO> searchExtWlZcNetworkAnalysis(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZcNetworkAnalysisDTO> dataList = dao.searchExtWlZcNetworkAnalysis(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询致诚社交关系网数据表对象
     * @date 2017-12-07 13:39:42
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZcNetworkAnalysisDTO queryExtWlZcNetworkAnalysisByPrimaryKey(String id) throws Exception {
		
		ExtWlZcNetworkAnalysisDTO dto = dao.findExtWlZcNetworkAnalysisByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZcNetworkAnalysisDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZcNetworkAnalysis
     * @author Administrator
     * @description: 新增 致诚社交关系网数据表对象
     * @date 2017-12-07 13:39:42
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZcNetworkAnalysis(ExtWlZcNetworkAnalysisDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZcNetworkAnalysis(paramMap);
		
		ExtWlZcNetworkAnalysisDTO resultDto = (ExtWlZcNetworkAnalysisDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZcNetworkAnalysis
     * @author Administrator
     * @description: 修改 致诚社交关系网数据表对象
     * @date 2017-12-07 13:39:42
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlZcNetworkAnalysis(ExtWlZcNetworkAnalysisDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZcNetworkAnalysis(paramMap);
	}
	/**
     * @title: deleteExtWlZcNetworkAnalysisByPrimaryKey
     * @author Administrator
     * @description: 删除 致诚社交关系网数据表,按主键
     * @date 2017-12-07 13:39:42
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlZcNetworkAnalysisByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZcNetworkAnalysisByPrimaryKey(paramMap);
	}

}

