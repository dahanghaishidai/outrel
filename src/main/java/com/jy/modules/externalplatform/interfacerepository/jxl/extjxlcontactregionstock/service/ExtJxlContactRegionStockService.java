package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactregionstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactregionstock.dao.ExtJxlContactRegionStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactregionstock.dto.ExtJxlContactRegionStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtJxlContactRegionStockService
 * @description: 定义  联系人区域汇总 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactregionstock.service.ExtJxlContactRegionStockService")
public class ExtJxlContactRegionStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlContactRegionStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 联系人区域汇总列表
     * @date 2017-06-01 16:25:07
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlContactRegionStockDTO> searchExtJxlContactRegionStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlContactRegionStockDTO> dataList =  dao.searchExtJxlContactRegionStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询联系人区域汇总列表
     * @date 2017-06-01 16:25:07
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlContactRegionStockDTO> searchExtJxlContactRegionStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlContactRegionStockDTO> dataList = dao.searchExtJxlContactRegionStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询联系人区域汇总对象
     * @date 2017-06-01 16:25:07
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlContactRegionStockDTO queryExtJxlContactRegionStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlContactRegionStockDTO dto = dao.findExtJxlContactRegionStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlContactRegionStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlContactRegionStock
     * @author Administrator
     * @description: 新增 联系人区域汇总对象
     * @date 2017-06-01 16:25:07
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlContactRegionStock(ExtJxlContactRegionStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlContactRegionStock(paramMap);
		
		ExtJxlContactRegionStockDTO resultDto = (ExtJxlContactRegionStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlContactRegionStock
     * @author Administrator
     * @description: 修改 联系人区域汇总对象
     * @date 2017-06-01 16:25:07
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlContactRegionStock(ExtJxlContactRegionStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlContactRegionStock(paramMap);
	}
	/**
     * @title: deleteExtJxlContactRegionStockByPrimaryKey
     * @author Administrator
     * @description: 删除 联系人区域汇总,按主键
     * @date 2017-06-01 16:25:07
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlContactRegionStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlContactRegionStockByPrimaryKey(paramMap);
	}

}

