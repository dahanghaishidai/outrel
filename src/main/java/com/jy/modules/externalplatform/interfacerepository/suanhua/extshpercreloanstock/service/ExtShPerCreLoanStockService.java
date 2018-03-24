package com.jy.modules.externalplatform.interfacerepository.suanhua.extshpercreloanstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshpercreloanstock.dao.ExtShPerCreLoanStockDao;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshpercreloanstock.dto.ExtShPerCreLoanStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtShPerCreLoanStockService
 * @description: 定义  人行征信信贷信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhua.extshpercreloanstock.service.ExtShPerCreLoanStockService")
public class ExtShPerCreLoanStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtShPerCreLoanStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 人行征信信贷信息列表
     * @date 2017-06-12 14:56:14
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtShPerCreLoanStockDTO> searchExtShPerCreLoanStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtShPerCreLoanStockDTO> dataList =  dao.searchExtShPerCreLoanStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询人行征信信贷信息列表
     * @date 2017-06-12 14:56:14
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtShPerCreLoanStockDTO> searchExtShPerCreLoanStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtShPerCreLoanStockDTO> dataList = dao.searchExtShPerCreLoanStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询人行征信信贷信息对象
     * @date 2017-06-12 14:56:14
     * @param id
     * @return
     * @throws
     */ 
	public ExtShPerCreLoanStockDTO queryExtShPerCreLoanStockByPrimaryKey(String id) throws Exception {
		
		ExtShPerCreLoanStockDTO dto = dao.findExtShPerCreLoanStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtShPerCreLoanStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtShPerCreLoanStock
     * @author Administrator
     * @description: 新增 人行征信信贷信息对象
     * @date 2017-06-12 14:56:14
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtShPerCreLoanStock(ExtShPerCreLoanStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtShPerCreLoanStock(paramMap);
		
		ExtShPerCreLoanStockDTO resultDto = (ExtShPerCreLoanStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtShPerCreLoanStock
     * @author Administrator
     * @description: 修改 人行征信信贷信息对象
     * @date 2017-06-12 14:56:14
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtShPerCreLoanStock(ExtShPerCreLoanStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtShPerCreLoanStock(paramMap);
	}
	/**
     * @title: deleteExtShPerCreLoanStockByPrimaryKey
     * @author Administrator
     * @description: 删除 人行征信信贷信息,按主键
     * @date 2017-06-12 14:56:14
     * @param paramMap
     * @throws
     */ 
	public void deleteExtShPerCreLoanStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtShPerCreLoanStockByPrimaryKey(paramMap);
	}

}

