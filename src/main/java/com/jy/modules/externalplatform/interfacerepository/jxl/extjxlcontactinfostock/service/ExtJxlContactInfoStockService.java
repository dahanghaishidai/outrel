package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactinfostock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactinfostock.dao.ExtJxlContactInfoStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactinfostock.dto.ExtJxlContactInfoStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtJxlContactInfoStockService
 * @description: 定义  联系人信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactinfostock.service.ExtJxlContactInfoStockService")
public class ExtJxlContactInfoStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlContactInfoStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 联系人信息表列表
     * @date 2017-06-01 16:24:34
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlContactInfoStockDTO> searchExtJxlContactInfoStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlContactInfoStockDTO> dataList =  dao.searchExtJxlContactInfoStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询联系人信息表列表
     * @date 2017-06-01 16:24:34
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlContactInfoStockDTO> searchExtJxlContactInfoStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlContactInfoStockDTO> dataList = dao.searchExtJxlContactInfoStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询联系人信息表对象
     * @date 2017-06-01 16:24:34
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlContactInfoStockDTO queryExtJxlContactInfoStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlContactInfoStockDTO dto = dao.findExtJxlContactInfoStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlContactInfoStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlContactInfoStock
     * @author Administrator
     * @description: 新增 联系人信息表对象
     * @date 2017-06-01 16:24:34
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlContactInfoStock(ExtJxlContactInfoStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlContactInfoStock(paramMap);
		
		ExtJxlContactInfoStockDTO resultDto = (ExtJxlContactInfoStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlContactInfoStock
     * @author Administrator
     * @description: 修改 联系人信息表对象
     * @date 2017-06-01 16:24:34
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlContactInfoStock(ExtJxlContactInfoStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlContactInfoStock(paramMap);
	}
	/**
     * @title: deleteExtJxlContactInfoStockByPrimaryKey
     * @author Administrator
     * @description: 删除 联系人信息表,按主键
     * @date 2017-06-01 16:24:34
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlContactInfoStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlContactInfoStockByPrimaryKey(paramMap);
	}

}

