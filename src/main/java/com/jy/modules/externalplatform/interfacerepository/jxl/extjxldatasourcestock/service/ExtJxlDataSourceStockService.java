package com.jy.modules.externalplatform.interfacerepository.jxl.extjxldatasourcestock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldatasourcestock.dao.ExtJxlDataSourceStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldatasourcestock.dto.ExtJxlDataSourceStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtJxlDataSourceStockService
 * @description: 定义  绑定数据源信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxldatasourcestock.service.ExtJxlDataSourceStockService")
public class ExtJxlDataSourceStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlDataSourceStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 绑定数据源信息列表
     * @date 2017-06-01 16:25:17
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlDataSourceStockDTO> searchExtJxlDataSourceStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlDataSourceStockDTO> dataList =  dao.searchExtJxlDataSourceStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询绑定数据源信息列表
     * @date 2017-06-01 16:25:17
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlDataSourceStockDTO> searchExtJxlDataSourceStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlDataSourceStockDTO> dataList = dao.searchExtJxlDataSourceStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询绑定数据源信息对象
     * @date 2017-06-01 16:25:17
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlDataSourceStockDTO queryExtJxlDataSourceStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlDataSourceStockDTO dto = dao.findExtJxlDataSourceStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlDataSourceStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlDataSourceStock
     * @author Administrator
     * @description: 新增 绑定数据源信息对象
     * @date 2017-06-01 16:25:17
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlDataSourceStock(ExtJxlDataSourceStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlDataSourceStock(paramMap);
		
		ExtJxlDataSourceStockDTO resultDto = (ExtJxlDataSourceStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlDataSourceStock
     * @author Administrator
     * @description: 修改 绑定数据源信息对象
     * @date 2017-06-01 16:25:17
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlDataSourceStock(ExtJxlDataSourceStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlDataSourceStock(paramMap);
	}
	/**
     * @title: deleteExtJxlDataSourceStockByPrimaryKey
     * @author Administrator
     * @description: 删除 绑定数据源信息,按主键
     * @date 2017-06-01 16:25:17
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlDataSourceStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlDataSourceStockByPrimaryKey(paramMap);
	}

}

