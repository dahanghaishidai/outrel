package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcallinfostock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcallinfostock.dao.ExtJxlCallInfoStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcallinfostock.dto.ExtJxlCallInfoStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtJxlCallInfoStockService
 * @description: 定义  呼叫信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcallinfostock.service.ExtJxlCallInfoStockService")
public class ExtJxlCallInfoStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlCallInfoStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 呼叫信息表列表
     * @date 2017-06-01 16:23:53
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlCallInfoStockDTO> searchExtJxlCallInfoStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlCallInfoStockDTO> dataList =  dao.searchExtJxlCallInfoStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询呼叫信息表列表
     * @date 2017-06-01 16:23:53
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlCallInfoStockDTO> searchExtJxlCallInfoStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlCallInfoStockDTO> dataList = dao.searchExtJxlCallInfoStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询呼叫信息表对象
     * @date 2017-06-01 16:23:53
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlCallInfoStockDTO queryExtJxlCallInfoStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlCallInfoStockDTO dto = dao.findExtJxlCallInfoStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlCallInfoStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlCallInfoStock
     * @author Administrator
     * @description: 新增 呼叫信息表对象
     * @date 2017-06-01 16:23:53
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlCallInfoStock(ExtJxlCallInfoStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlCallInfoStock(paramMap);
		
		ExtJxlCallInfoStockDTO resultDto = (ExtJxlCallInfoStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlCallInfoStock
     * @author Administrator
     * @description: 修改 呼叫信息表对象
     * @date 2017-06-01 16:23:53
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlCallInfoStock(ExtJxlCallInfoStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlCallInfoStock(paramMap);
	}
	/**
     * @title: deleteExtJxlCallInfoStockByPrimaryKey
     * @author Administrator
     * @description: 删除 呼叫信息表,按主键
     * @date 2017-06-01 16:23:53
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlCallInfoStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlCallInfoStockByPrimaryKey(paramMap);
	}

}

