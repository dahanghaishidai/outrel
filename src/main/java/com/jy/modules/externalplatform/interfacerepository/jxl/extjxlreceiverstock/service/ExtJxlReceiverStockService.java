package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlreceiverstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlreceiverstock.dao.ExtJxlReceiverStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlreceiverstock.dto.ExtJxlReceiverStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtJxlReceiverStockService
 * @description: 定义  收货人表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxlreceiverstock.service.ExtJxlReceiverStockService")
public class ExtJxlReceiverStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlReceiverStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 收货人表列表
     * @date 2017-06-01 16:26:01
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlReceiverStockDTO> searchExtJxlReceiverStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlReceiverStockDTO> dataList =  dao.searchExtJxlReceiverStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询收货人表列表
     * @date 2017-06-01 16:26:01
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlReceiverStockDTO> searchExtJxlReceiverStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlReceiverStockDTO> dataList = dao.searchExtJxlReceiverStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询收货人表对象
     * @date 2017-06-01 16:26:01
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlReceiverStockDTO queryExtJxlReceiverStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlReceiverStockDTO dto = dao.findExtJxlReceiverStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlReceiverStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlReceiverStock
     * @author Administrator
     * @description: 新增 收货人表对象
     * @date 2017-06-01 16:26:01
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlReceiverStock(ExtJxlReceiverStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlReceiverStock(paramMap);
		
		ExtJxlReceiverStockDTO resultDto = (ExtJxlReceiverStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlReceiverStock
     * @author Administrator
     * @description: 修改 收货人表对象
     * @date 2017-06-01 16:26:01
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlReceiverStock(ExtJxlReceiverStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlReceiverStock(paramMap);
	}
	/**
     * @title: deleteExtJxlReceiverStockByPrimaryKey
     * @author Administrator
     * @description: 删除 收货人表,按主键
     * @date 2017-06-01 16:26:01
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlReceiverStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlReceiverStockByPrimaryKey(paramMap);
	}

}

