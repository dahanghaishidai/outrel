package com.jy.modules.externalplatform.interfacerepository.suanhua.extshfranddetailstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshfranddetailstock.dao.ExtShFrandDetailStockDao;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshfranddetailstock.dto.ExtShFrandDetailStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtShFrandDetailStockService
 * @description: 定义  算话反欺诈报告明细表 实现类
 * @author:  dell
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhua.extshfranddetailstock.service.ExtShFrandDetailStockService")
public class ExtShFrandDetailStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtShFrandDetailStockDao dao;

	/**
     * @author dell
     * @description: 分页查询 算话反欺诈报告明细表列表
     * @date 2017-06-12 11:33:06
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtShFrandDetailStockDTO> searchExtShFrandDetailStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtShFrandDetailStockDTO> dataList =  dao.searchExtShFrandDetailStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author dell
     * @description: 按条件查询算话反欺诈报告明细表列表
     * @date 2017-06-12 11:33:06
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtShFrandDetailStockDTO> searchExtShFrandDetailStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtShFrandDetailStockDTO> dataList = dao.searchExtShFrandDetailStock(searchParams);
        return dataList;
    }
	/**
     * @author dell
     * @description: 查询算话反欺诈报告明细表对象
     * @date 2017-06-12 11:33:06
     * @param id
     * @return
     * @throws
     */ 
	public ExtShFrandDetailStockDTO queryExtShFrandDetailStockByPrimaryKey(String id) throws Exception {
		
		ExtShFrandDetailStockDTO dto = dao.findExtShFrandDetailStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtShFrandDetailStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtShFrandDetailStock
     * @author dell
     * @description: 新增 算话反欺诈报告明细表对象
     * @date 2017-06-12 11:33:06
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtShFrandDetailStock(ExtShFrandDetailStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtShFrandDetailStock(paramMap);
		
		ExtShFrandDetailStockDTO resultDto = (ExtShFrandDetailStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtShFrandDetailStock
     * @author dell
     * @description: 修改 算话反欺诈报告明细表对象
     * @date 2017-06-12 11:33:06
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtShFrandDetailStock(ExtShFrandDetailStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtShFrandDetailStock(paramMap);
	}
	/**
     * @title: deleteExtShFrandDetailStockByPrimaryKey
     * @author dell
     * @description: 删除 算话反欺诈报告明细表,按主键
     * @date 2017-06-12 11:33:06
     * @param paramMap
     * @throws
     */ 
	public void deleteExtShFrandDetailStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtShFrandDetailStockByPrimaryKey(paramMap);
	}

}

