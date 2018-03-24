package com.jy.modules.externalplatform.interfacerepository.suanhua.extshperoverduesstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperoverduesstock.dao.ExtShPerOverduesStockDao;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperoverduesstock.dto.ExtShPerOverduesStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtShPerOverduesStockService
 * @description: 定义  人行征信逾期情况 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhua.extshperoverduesstock.service.ExtShPerOverduesStockService")
public class ExtShPerOverduesStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtShPerOverduesStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 人行征信逾期情况列表
     * @date 2017-06-12 14:55:31
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtShPerOverduesStockDTO> searchExtShPerOverduesStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtShPerOverduesStockDTO> dataList =  dao.searchExtShPerOverduesStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询人行征信逾期情况列表
     * @date 2017-06-12 14:55:31
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtShPerOverduesStockDTO> searchExtShPerOverduesStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtShPerOverduesStockDTO> dataList = dao.searchExtShPerOverduesStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询人行征信逾期情况对象
     * @date 2017-06-12 14:55:31
     * @param id
     * @return
     * @throws
     */ 
	public ExtShPerOverduesStockDTO queryExtShPerOverduesStockByPrimaryKey(String id) throws Exception {
		
		ExtShPerOverduesStockDTO dto = dao.findExtShPerOverduesStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtShPerOverduesStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtShPerOverduesStock
     * @author Administrator
     * @description: 新增 人行征信逾期情况对象
     * @date 2017-06-12 14:55:31
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtShPerOverduesStock(ExtShPerOverduesStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtShPerOverduesStock(paramMap);
		
		ExtShPerOverduesStockDTO resultDto = (ExtShPerOverduesStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtShPerOverduesStock
     * @author Administrator
     * @description: 修改 人行征信逾期情况对象
     * @date 2017-06-12 14:55:31
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtShPerOverduesStock(ExtShPerOverduesStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtShPerOverduesStock(paramMap);
	}
	/**
     * @title: deleteExtShPerOverduesStockByPrimaryKey
     * @author Administrator
     * @description: 删除 人行征信逾期情况,按主键
     * @date 2017-06-12 14:55:31
     * @param paramMap
     * @throws
     */ 
	public void deleteExtShPerOverduesStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtShPerOverduesStockByPrimaryKey(paramMap);
	}

}

