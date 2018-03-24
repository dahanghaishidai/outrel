package com.jy.modules.externalplatform.interfacerepository.jxl.extjxldemandsinfostock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldemandsinfostock.dao.ExtJxlDemandsInfoStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldemandsinfostock.dto.ExtJxlDemandsInfoStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtJxlDemandsInfoStockService
 * @description: 定义  需求信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxldemandsinfostock.service.ExtJxlDemandsInfoStockService")
public class ExtJxlDemandsInfoStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlDemandsInfoStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 需求信息表列表
     * @date 2017-06-01 16:25:40
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlDemandsInfoStockDTO> searchExtJxlDemandsInfoStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlDemandsInfoStockDTO> dataList =  dao.searchExtJxlDemandsInfoStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询需求信息表列表
     * @date 2017-06-01 16:25:40
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlDemandsInfoStockDTO> searchExtJxlDemandsInfoStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlDemandsInfoStockDTO> dataList = dao.searchExtJxlDemandsInfoStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询需求信息表对象
     * @date 2017-06-01 16:25:40
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlDemandsInfoStockDTO queryExtJxlDemandsInfoStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlDemandsInfoStockDTO dto = dao.findExtJxlDemandsInfoStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlDemandsInfoStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlDemandsInfoStock
     * @author Administrator
     * @description: 新增 需求信息表对象
     * @date 2017-06-01 16:25:40
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlDemandsInfoStock(ExtJxlDemandsInfoStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlDemandsInfoStock(paramMap);
		
		ExtJxlDemandsInfoStockDTO resultDto = (ExtJxlDemandsInfoStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlDemandsInfoStock
     * @author Administrator
     * @description: 修改 需求信息表对象
     * @date 2017-06-01 16:25:40
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlDemandsInfoStock(ExtJxlDemandsInfoStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlDemandsInfoStock(paramMap);
	}
	/**
     * @title: deleteExtJxlDemandsInfoStockByPrimaryKey
     * @author Administrator
     * @description: 删除 需求信息表,按主键
     * @date 2017-06-01 16:25:40
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlDemandsInfoStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlDemandsInfoStockByPrimaryKey(paramMap);
	}

}

