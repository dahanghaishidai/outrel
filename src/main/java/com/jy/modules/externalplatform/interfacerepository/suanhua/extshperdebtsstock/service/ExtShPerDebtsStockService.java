package com.jy.modules.externalplatform.interfacerepository.suanhua.extshperdebtsstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperdebtsstock.dao.ExtShPerDebtsStockDao;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperdebtsstock.dto.ExtShPerDebtsStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtShPerDebtsStockService
 * @description: 定义  人行征信负债情况 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhua.extshperdebtsstock.service.ExtShPerDebtsStockService")
public class ExtShPerDebtsStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtShPerDebtsStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 人行征信负债情况列表
     * @date 2017-06-12 14:55:48
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtShPerDebtsStockDTO> searchExtShPerDebtsStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtShPerDebtsStockDTO> dataList =  dao.searchExtShPerDebtsStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询人行征信负债情况列表
     * @date 2017-06-12 14:55:48
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtShPerDebtsStockDTO> searchExtShPerDebtsStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtShPerDebtsStockDTO> dataList = dao.searchExtShPerDebtsStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询人行征信负债情况对象
     * @date 2017-06-12 14:55:48
     * @param id
     * @return
     * @throws
     */ 
	public ExtShPerDebtsStockDTO queryExtShPerDebtsStockByPrimaryKey(String id) throws Exception {
		
		ExtShPerDebtsStockDTO dto = dao.findExtShPerDebtsStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtShPerDebtsStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtShPerDebtsStock
     * @author Administrator
     * @description: 新增 人行征信负债情况对象
     * @date 2017-06-12 14:55:48
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtShPerDebtsStock(ExtShPerDebtsStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtShPerDebtsStock(paramMap);
		
		ExtShPerDebtsStockDTO resultDto = (ExtShPerDebtsStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtShPerDebtsStock
     * @author Administrator
     * @description: 修改 人行征信负债情况对象
     * @date 2017-06-12 14:55:48
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtShPerDebtsStock(ExtShPerDebtsStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtShPerDebtsStock(paramMap);
	}
	/**
     * @title: deleteExtShPerDebtsStockByPrimaryKey
     * @author Administrator
     * @description: 删除 人行征信负债情况,按主键
     * @date 2017-06-12 14:55:48
     * @param paramMap
     * @throws
     */ 
	public void deleteExtShPerDebtsStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtShPerDebtsStockByPrimaryKey(paramMap);
	}

}

