package com.jy.modules.externalplatform.interfacerepository.sjt.extsjtassetsstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtassetsstock.dao.ExtSjtAssetsStockDao;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtassetsstock.dto.ExtSjtAssetsStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtSjtAssetsStockService
 * @description: 定义  数据堂个人消费报告资产指标 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sjt.extsjtassetsstock.service.ExtSjtAssetsStockService")
public class ExtSjtAssetsStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtSjtAssetsStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 数据堂个人消费报告资产指标列表
     * @date 2017-06-08 11:42:02
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtSjtAssetsStockDTO> searchExtSjtAssetsStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtSjtAssetsStockDTO> dataList =  dao.searchExtSjtAssetsStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询数据堂个人消费报告资产指标列表
     * @date 2017-06-08 11:42:02
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtSjtAssetsStockDTO> searchExtSjtAssetsStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtSjtAssetsStockDTO> dataList = dao.searchExtSjtAssetsStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询数据堂个人消费报告资产指标对象
     * @date 2017-06-08 11:42:02
     * @param id
     * @return
     * @throws
     */ 
	public ExtSjtAssetsStockDTO queryExtSjtAssetsStockByPrimaryKey(String id) throws Exception {
		
		ExtSjtAssetsStockDTO dto = dao.findExtSjtAssetsStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtSjtAssetsStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtSjtAssetsStock
     * @author Administrator
     * @description: 新增 数据堂个人消费报告资产指标对象
     * @date 2017-06-08 11:42:02
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtSjtAssetsStock(ExtSjtAssetsStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtSjtAssetsStock(paramMap);
		
		ExtSjtAssetsStockDTO resultDto = (ExtSjtAssetsStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtSjtAssetsStock
     * @author Administrator
     * @description: 修改 数据堂个人消费报告资产指标对象
     * @date 2017-06-08 11:42:02
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtSjtAssetsStock(ExtSjtAssetsStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtSjtAssetsStock(paramMap);
	}
	/**
     * @title: deleteExtSjtAssetsStockByPrimaryKey
     * @author Administrator
     * @description: 删除 数据堂个人消费报告资产指标,按主键
     * @date 2017-06-08 11:42:02
     * @param paramMap
     * @throws
     */ 
	public void deleteExtSjtAssetsStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtSjtAssetsStockByPrimaryKey(paramMap);
	}

}

