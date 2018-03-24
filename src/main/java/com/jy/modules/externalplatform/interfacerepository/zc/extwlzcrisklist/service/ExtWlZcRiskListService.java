package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcrisklist.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcrisklist.dto.ExtWlZcRiskListDTO;
import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcrisklist.dao.ExtWlZcRiskListDao;

/**
 * @classname: ExtWlZcRiskListService
 * @description: 定义  致诚风险名单结果 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zc.extwlzcrisklist.service.ExtWlZcRiskListService")
public class ExtWlZcRiskListService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZcRiskListDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 致诚风险名单结果列表
     * @date 2017-12-07 13:39:56
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZcRiskListDTO> searchExtWlZcRiskListByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZcRiskListDTO> dataList =  dao.searchExtWlZcRiskListByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询致诚风险名单结果列表
     * @date 2017-12-07 13:39:56
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZcRiskListDTO> searchExtWlZcRiskList(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZcRiskListDTO> dataList = dao.searchExtWlZcRiskList(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询致诚风险名单结果对象
     * @date 2017-12-07 13:39:56
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZcRiskListDTO queryExtWlZcRiskListByPrimaryKey(String id) throws Exception {
		
		ExtWlZcRiskListDTO dto = dao.findExtWlZcRiskListByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZcRiskListDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZcRiskList
     * @author Administrator
     * @description: 新增 致诚风险名单结果对象
     * @date 2017-12-07 13:39:56
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZcRiskList(ExtWlZcRiskListDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZcRiskList(paramMap);
		
		ExtWlZcRiskListDTO resultDto = (ExtWlZcRiskListDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZcRiskList
     * @author Administrator
     * @description: 修改 致诚风险名单结果对象
     * @date 2017-12-07 13:39:56
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlZcRiskList(ExtWlZcRiskListDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZcRiskList(paramMap);
	}
	/**
     * @title: deleteExtWlZcRiskListByPrimaryKey
     * @author Administrator
     * @description: 删除 致诚风险名单结果,按主键
     * @date 2017-12-07 13:39:56
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlZcRiskListByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZcRiskListByPrimaryKey(paramMap);
	}
    public void batchInsertResults(List<ExtWlZcRiskListDTO> resultList) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("resultList", resultList);     
        dao.batchInsertResults(paramMap);
    }

}

