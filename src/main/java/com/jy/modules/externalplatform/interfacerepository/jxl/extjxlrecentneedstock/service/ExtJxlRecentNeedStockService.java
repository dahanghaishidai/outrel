package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlrecentneedstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlrecentneedstock.dao.ExtJxlRecentNeedStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlrecentneedstock.dto.ExtJxlRecentNeedStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtJxlRecentNeedStockService
 * @description: 定义  近期需求表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxlrecentneedstock.service.ExtJxlRecentNeedStockService")
public class ExtJxlRecentNeedStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlRecentNeedStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 近期需求表列表
     * @date 2017-06-01 16:26:11
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlRecentNeedStockDTO> searchExtJxlRecentNeedStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlRecentNeedStockDTO> dataList =  dao.searchExtJxlRecentNeedStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询近期需求表列表
     * @date 2017-06-01 16:26:11
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlRecentNeedStockDTO> searchExtJxlRecentNeedStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlRecentNeedStockDTO> dataList = dao.searchExtJxlRecentNeedStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询近期需求表对象
     * @date 2017-06-01 16:26:11
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlRecentNeedStockDTO queryExtJxlRecentNeedStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlRecentNeedStockDTO dto = dao.findExtJxlRecentNeedStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlRecentNeedStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlRecentNeedStock
     * @author Administrator
     * @description: 新增 近期需求表对象
     * @date 2017-06-01 16:26:11
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlRecentNeedStock(ExtJxlRecentNeedStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlRecentNeedStock(paramMap);
		
		ExtJxlRecentNeedStockDTO resultDto = (ExtJxlRecentNeedStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlRecentNeedStock
     * @author Administrator
     * @description: 修改 近期需求表对象
     * @date 2017-06-01 16:26:11
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlRecentNeedStock(ExtJxlRecentNeedStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlRecentNeedStock(paramMap);
	}
	/**
     * @title: deleteExtJxlRecentNeedStockByPrimaryKey
     * @author Administrator
     * @description: 删除 近期需求表,按主键
     * @date 2017-06-01 16:26:11
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlRecentNeedStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlRecentNeedStockByPrimaryKey(paramMap);
	}

}

