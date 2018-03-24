package com.jy.modules.externalplatform.interfacerepository.sjt.extsjttransbehaviorstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.sjt.extsjttransbehaviorstock.dao.ExtSjtTransBehaviorStockDao;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjttransbehaviorstock.dto.ExtSjtTransBehaviorStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtSjtTransBehaviorStockService
 * @description: 定义  交易行为特征信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sjt.extsjttransbehaviorstock.service.ExtSjtTransBehaviorStockService")
public class ExtSjtTransBehaviorStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtSjtTransBehaviorStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 交易行为特征信息列表
     * @date 2017-06-08 11:42:28
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtSjtTransBehaviorStockDTO> searchExtSjtTransBehaviorStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtSjtTransBehaviorStockDTO> dataList =  dao.searchExtSjtTransBehaviorStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询交易行为特征信息列表
     * @date 2017-06-08 11:42:28
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtSjtTransBehaviorStockDTO> searchExtSjtTransBehaviorStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtSjtTransBehaviorStockDTO> dataList = dao.searchExtSjtTransBehaviorStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询交易行为特征信息对象
     * @date 2017-06-08 11:42:28
     * @param id
     * @return
     * @throws
     */ 
	public ExtSjtTransBehaviorStockDTO queryExtSjtTransBehaviorStockByPrimaryKey(String id) throws Exception {
		
		ExtSjtTransBehaviorStockDTO dto = dao.findExtSjtTransBehaviorStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtSjtTransBehaviorStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtSjtTransBehaviorStock
     * @author Administrator
     * @description: 新增 交易行为特征信息对象
     * @date 2017-06-08 11:42:28
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtSjtTransBehaviorStock(ExtSjtTransBehaviorStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtSjtTransBehaviorStock(paramMap);
		
		ExtSjtTransBehaviorStockDTO resultDto = (ExtSjtTransBehaviorStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtSjtTransBehaviorStock
     * @author Administrator
     * @description: 修改 交易行为特征信息对象
     * @date 2017-06-08 11:42:28
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtSjtTransBehaviorStock(ExtSjtTransBehaviorStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtSjtTransBehaviorStock(paramMap);
	}
	/**
     * @title: deleteExtSjtTransBehaviorStockByPrimaryKey
     * @author Administrator
     * @description: 删除 交易行为特征信息,按主键
     * @date 2017-06-08 11:42:28
     * @param paramMap
     * @throws
     */ 
	public void deleteExtSjtTransBehaviorStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtSjtTransBehaviorStockByPrimaryKey(paramMap);
	}

}

