package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactliststock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactliststock.dao.ExtJxlContactListStockDao;
import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactliststock.dto.ExtJxlContactListStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtJxlContactListStockService
 * @description: 定义  运营商联系人列表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactliststock.service.ExtJxlContactListStockService")
public class ExtJxlContactListStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtJxlContactListStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 运营商联系人列表列表
     * @date 2017-06-01 16:24:57
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtJxlContactListStockDTO> searchExtJxlContactListStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtJxlContactListStockDTO> dataList =  dao.searchExtJxlContactListStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询运营商联系人列表列表
     * @date 2017-06-01 16:24:57
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtJxlContactListStockDTO> searchExtJxlContactListStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtJxlContactListStockDTO> dataList = dao.searchExtJxlContactListStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询运营商联系人列表对象
     * @date 2017-06-01 16:24:57
     * @param id
     * @return
     * @throws
     */ 
	public ExtJxlContactListStockDTO queryExtJxlContactListStockByPrimaryKey(String id) throws Exception {
		
		ExtJxlContactListStockDTO dto = dao.findExtJxlContactListStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtJxlContactListStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtJxlContactListStock
     * @author Administrator
     * @description: 新增 运营商联系人列表对象
     * @date 2017-06-01 16:24:57
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtJxlContactListStock(ExtJxlContactListStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtJxlContactListStock(paramMap);
		
		ExtJxlContactListStockDTO resultDto = (ExtJxlContactListStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtJxlContactListStock
     * @author Administrator
     * @description: 修改 运营商联系人列表对象
     * @date 2017-06-01 16:24:57
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtJxlContactListStock(ExtJxlContactListStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtJxlContactListStock(paramMap);
	}
	/**
     * @title: deleteExtJxlContactListStockByPrimaryKey
     * @author Administrator
     * @description: 删除 运营商联系人列表,按主键
     * @date 2017-06-01 16:24:57
     * @param paramMap
     * @throws
     */ 
	public void deleteExtJxlContactListStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtJxlContactListStockByPrimaryKey(paramMap);
	}

}

