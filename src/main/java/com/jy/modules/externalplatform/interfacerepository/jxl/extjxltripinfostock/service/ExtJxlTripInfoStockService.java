package com.jy.modules.externalplatform.interfacerepository.jxl.extjxltripinfostock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxltripinfostock.dao.ExtJxlTripInfoStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxltripinfostock.dto.ExtJxlTripInfoStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtJxlTripInfoStockService
 * @description: 定义  出行分析表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxltripinfostock.service.ExtJxlTripInfoStockService")
public class ExtJxlTripInfoStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlTripInfoStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 出行分析表列表
     * @date 2017-06-01 16:26:22
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlTripInfoStockDTO> searchExtJxlTripInfoStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlTripInfoStockDTO> dataList =  dao.searchExtJxlTripInfoStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询出行分析表列表
     * @date 2017-06-01 16:26:22
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlTripInfoStockDTO> searchExtJxlTripInfoStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlTripInfoStockDTO> dataList = dao.searchExtJxlTripInfoStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询出行分析表对象
     * @date 2017-06-01 16:26:22
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlTripInfoStockDTO queryExtJxlTripInfoStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlTripInfoStockDTO dto = dao.findExtJxlTripInfoStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlTripInfoStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlTripInfoStock
     * @author Administrator
     * @description: 新增 出行分析表对象
     * @date 2017-06-01 16:26:22
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlTripInfoStock(ExtJxlTripInfoStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlTripInfoStock(paramMap);
		
		ExtJxlTripInfoStockDTO resultDto = (ExtJxlTripInfoStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlTripInfoStock
     * @author Administrator
     * @description: 修改 出行分析表对象
     * @date 2017-06-01 16:26:22
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlTripInfoStock(ExtJxlTripInfoStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlTripInfoStock(paramMap);
	}
	/**
     * @title: deleteExtJxlTripInfoStockByPrimaryKey
     * @author Administrator
     * @description: 删除 出行分析表,按主键
     * @date 2017-06-01 16:26:22
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlTripInfoStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlTripInfoStockByPrimaryKey(paramMap);
	}

}

