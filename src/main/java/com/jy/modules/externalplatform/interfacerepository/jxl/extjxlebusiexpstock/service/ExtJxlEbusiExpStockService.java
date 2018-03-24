package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlebusiexpstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlebusiexpstock.dao.ExtJxlEbusiExpStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlebusiexpstock.dto.ExtJxlEbusiExpStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtJxlEbusiExpStockService
 * @description: 定义  电商月消费表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxlebusiexpstock.service.ExtJxlEbusiExpStockService")
public class ExtJxlEbusiExpStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlEbusiExpStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 电商月消费表列表
     * @date 2017-06-01 16:25:51
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlEbusiExpStockDTO> searchExtJxlEbusiExpStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlEbusiExpStockDTO> dataList =  dao.searchExtJxlEbusiExpStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询电商月消费表列表
     * @date 2017-06-01 16:25:51
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlEbusiExpStockDTO> searchExtJxlEbusiExpStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlEbusiExpStockDTO> dataList = dao.searchExtJxlEbusiExpStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询电商月消费表对象
     * @date 2017-06-01 16:25:51
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlEbusiExpStockDTO queryExtJxlEbusiExpStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlEbusiExpStockDTO dto = dao.findExtJxlEbusiExpStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlEbusiExpStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlEbusiExpStock
     * @author Administrator
     * @description: 新增 电商月消费表对象
     * @date 2017-06-01 16:25:51
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlEbusiExpStock(ExtJxlEbusiExpStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlEbusiExpStock(paramMap);
		
		ExtJxlEbusiExpStockDTO resultDto = (ExtJxlEbusiExpStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlEbusiExpStock
     * @author Administrator
     * @description: 修改 电商月消费表对象
     * @date 2017-06-01 16:25:51
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlEbusiExpStock(ExtJxlEbusiExpStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlEbusiExpStock(paramMap);
	}
	/**
     * @title: deleteExtJxlEbusiExpStockByPrimaryKey
     * @author Administrator
     * @description: 删除 电商月消费表,按主键
     * @date 2017-06-01 16:25:51
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlEbusiExpStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlEbusiExpStockByPrimaryKey(paramMap);
	}

}

