package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcheckinfostock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcheckinfostock.dao.ExtJxlCheckInfoStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcheckinfostock.dto.ExtJxlCheckInfoStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtJxlCheckInfoStockService
 * @description: 定义  数据检查信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcheckinfostock.service.ExtJxlCheckInfoStockService")
public class ExtJxlCheckInfoStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlCheckInfoStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 数据检查信息列表
     * @date 2017-06-01 16:24:19
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlCheckInfoStockDTO> searchExtJxlCheckInfoStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlCheckInfoStockDTO> dataList =  dao.searchExtJxlCheckInfoStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询数据检查信息列表
     * @date 2017-06-01 16:24:19
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlCheckInfoStockDTO> searchExtJxlCheckInfoStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlCheckInfoStockDTO> dataList = dao.searchExtJxlCheckInfoStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询数据检查信息对象
     * @date 2017-06-01 16:24:19
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlCheckInfoStockDTO queryExtJxlCheckInfoStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlCheckInfoStockDTO dto = dao.findExtJxlCheckInfoStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlCheckInfoStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlCheckInfoStock
     * @author Administrator
     * @description: 新增 数据检查信息对象
     * @date 2017-06-01 16:24:19
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlCheckInfoStock(ExtJxlCheckInfoStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlCheckInfoStock(paramMap);
		
		ExtJxlCheckInfoStockDTO resultDto = (ExtJxlCheckInfoStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlCheckInfoStock
     * @author Administrator
     * @description: 修改 数据检查信息对象
     * @date 2017-06-01 16:24:19
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlCheckInfoStock(ExtJxlCheckInfoStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlCheckInfoStock(paramMap);
	}
	/**
     * @title: deleteExtJxlCheckInfoStockByPrimaryKey
     * @author Administrator
     * @description: 删除 数据检查信息,按主键
     * @date 2017-06-01 16:24:19
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlCheckInfoStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlCheckInfoStockByPrimaryKey(paramMap);
	}

}

