package com.jy.modules.externalplatform.interfacerepository.sjt.extsjtdetailstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtdetailstock.dao.ExtSjtDetailStockDao;
import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtdetailstock.dto.ExtSjtDetailStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtSjtDetailStockService
 * @description: 定义  数据堂个人消费报告明细信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sjt.extsjtdetailstock.service.ExtSjtDetailStockService")
public class ExtSjtDetailStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtSjtDetailStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 数据堂个人消费报告明细信息列表
     * @date 2017-06-08 11:42:16
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtSjtDetailStockDTO> searchExtSjtDetailStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtSjtDetailStockDTO> dataList =  dao.searchExtSjtDetailStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询数据堂个人消费报告明细信息列表
     * @date 2017-06-08 11:42:16
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtSjtDetailStockDTO> searchExtSjtDetailStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtSjtDetailStockDTO> dataList = dao.searchExtSjtDetailStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询数据堂个人消费报告明细信息对象
     * @date 2017-06-08 11:42:16
     * @param id
     * @return
     * @throws
     */ 
	public ExtSjtDetailStockDTO queryExtSjtDetailStockByPrimaryKey(String id) throws Exception {
		
		ExtSjtDetailStockDTO dto = dao.findExtSjtDetailStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtSjtDetailStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtSjtDetailStock
     * @author Administrator
     * @description: 新增 数据堂个人消费报告明细信息对象
     * @date 2017-06-08 11:42:16
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtSjtDetailStock(ExtSjtDetailStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtSjtDetailStock(paramMap);
		
		ExtSjtDetailStockDTO resultDto = (ExtSjtDetailStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtSjtDetailStock
     * @author Administrator
     * @description: 修改 数据堂个人消费报告明细信息对象
     * @date 2017-06-08 11:42:16
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtSjtDetailStock(ExtSjtDetailStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtSjtDetailStock(paramMap);
	}
	/**
     * @title: deleteExtSjtDetailStockByPrimaryKey
     * @author Administrator
     * @description: 删除 数据堂个人消费报告明细信息,按主键
     * @date 2017-06-08 11:42:16
     * @param paramMap
     * @throws
     */ 
	public void deleteExtSjtDetailStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtSjtDetailStockByPrimaryKey(paramMap);
	}
	public Object batchInsertExtSjtCreditDetailInfo(List<ExtSjtDetailStockDTO> batchList) {
		// TODO Auto-generated method stub
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("batchList", batchList);
		
		return dao.batchInsertExtSjtCreditDetailInfo(paramMap);
	}

}

