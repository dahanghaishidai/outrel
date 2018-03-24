package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcellbehaviorstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcellbehaviorstock.dao.ExtJxlCellBehaviorStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcellbehaviorstock.dto.ExtJxlCellBehaviorStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtJxlCellBehaviorStockService
 * @description: 定义  通话行为分析表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcellbehaviorstock.service.ExtJxlCellBehaviorStockService")
public class ExtJxlCellBehaviorStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlCellBehaviorStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 通话行为分析表列表
     * @date 2017-06-01 16:24:08
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlCellBehaviorStockDTO> searchExtJxlCellBehaviorStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlCellBehaviorStockDTO> dataList =  dao.searchExtJxlCellBehaviorStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询通话行为分析表列表
     * @date 2017-06-01 16:24:08
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlCellBehaviorStockDTO> searchExtJxlCellBehaviorStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlCellBehaviorStockDTO> dataList = dao.searchExtJxlCellBehaviorStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询通话行为分析表对象
     * @date 2017-06-01 16:24:08
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlCellBehaviorStockDTO queryExtJxlCellBehaviorStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlCellBehaviorStockDTO dto = dao.findExtJxlCellBehaviorStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlCellBehaviorStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlCellBehaviorStock
     * @author Administrator
     * @description: 新增 通话行为分析表对象
     * @date 2017-06-01 16:24:08
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlCellBehaviorStock(ExtJxlCellBehaviorStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlCellBehaviorStock(paramMap);
		
		ExtJxlCellBehaviorStockDTO resultDto = (ExtJxlCellBehaviorStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlCellBehaviorStock
     * @author Administrator
     * @description: 修改 通话行为分析表对象
     * @date 2017-06-01 16:24:08
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlCellBehaviorStock(ExtJxlCellBehaviorStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlCellBehaviorStock(paramMap);
	}
	/**
     * @title: deleteExtJxlCellBehaviorStockByPrimaryKey
     * @author Administrator
     * @description: 删除 通话行为分析表,按主键
     * @date 2017-06-01 16:24:08
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlCellBehaviorStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlCellBehaviorStockByPrimaryKey(paramMap);
	}

}

