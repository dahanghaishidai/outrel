package com.jy.modules.externalplatform.interfacerepository.jxl.extjxldeliveraddressstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldeliveraddressstock.dao.ExtJxlDeliverAddressStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldeliveraddressstock.dto.ExtJxlDeliverAddressStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtJxlDeliverAddressStockService
 * @description: 定义  送货地址列表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxldeliveraddressstock.service.ExtJxlDeliverAddressStockService")
public class ExtJxlDeliverAddressStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlDeliverAddressStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 送货地址列表列表
     * @date 2017-06-01 16:25:28
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlDeliverAddressStockDTO> searchExtJxlDeliverAddressStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlDeliverAddressStockDTO> dataList =  dao.searchExtJxlDeliverAddressStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询送货地址列表列表
     * @date 2017-06-01 16:25:28
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlDeliverAddressStockDTO> searchExtJxlDeliverAddressStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlDeliverAddressStockDTO> dataList = dao.searchExtJxlDeliverAddressStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询送货地址列表对象
     * @date 2017-06-01 16:25:28
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlDeliverAddressStockDTO queryExtJxlDeliverAddressStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlDeliverAddressStockDTO dto = dao.findExtJxlDeliverAddressStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlDeliverAddressStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlDeliverAddressStock
     * @author Administrator
     * @description: 新增 送货地址列表对象
     * @date 2017-06-01 16:25:28
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlDeliverAddressStock(ExtJxlDeliverAddressStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlDeliverAddressStock(paramMap);
		
		ExtJxlDeliverAddressStockDTO resultDto = (ExtJxlDeliverAddressStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlDeliverAddressStock
     * @author Administrator
     * @description: 修改 送货地址列表对象
     * @date 2017-06-01 16:25:28
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlDeliverAddressStock(ExtJxlDeliverAddressStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlDeliverAddressStock(paramMap);
	}
	/**
     * @title: deleteExtJxlDeliverAddressStockByPrimaryKey
     * @author Administrator
     * @description: 删除 送货地址列表,按主键
     * @date 2017-06-01 16:25:28
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlDeliverAddressStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlDeliverAddressStockByPrimaryKey(paramMap);
	}

}

