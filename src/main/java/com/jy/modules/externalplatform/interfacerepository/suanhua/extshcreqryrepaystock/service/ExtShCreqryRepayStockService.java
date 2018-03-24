package com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryrepaystock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryrepaystock.dao.ExtShCreqryRepayStockDao;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryrepaystock.dto.ExtShCreqryRepayStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtShCreqryRepayStockService
 * @description: 定义  算话征信贷款信息查询_还款信息列表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryrepaystock.service.ExtShCreqryRepayStockService")
public class ExtShCreqryRepayStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtShCreqryRepayStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话征信贷款信息查询_还款信息列表列表
     * @date 2017-06-09 10:02:10
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtShCreqryRepayStockDTO> searchExtShCreqryRepayStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtShCreqryRepayStockDTO> dataList =  dao.searchExtShCreqryRepayStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话征信贷款信息查询_还款信息列表列表
     * @date 2017-06-09 10:02:10
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtShCreqryRepayStockDTO> searchExtShCreqryRepayStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtShCreqryRepayStockDTO> dataList = dao.searchExtShCreqryRepayStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话征信贷款信息查询_还款信息列表对象
     * @date 2017-06-09 10:02:10
     * @param id
     * @return
     * @throws
     */ 
	public ExtShCreqryRepayStockDTO queryExtShCreqryRepayStockByPrimaryKey(String id) throws Exception {
		
		ExtShCreqryRepayStockDTO dto = dao.findExtShCreqryRepayStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtShCreqryRepayStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtShCreqryRepayStock
     * @author Administrator
     * @description: 新增 算话征信贷款信息查询_还款信息列表对象
     * @date 2017-06-09 10:02:10
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtShCreqryRepayStock(ExtShCreqryRepayStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtShCreqryRepayStock(paramMap);
		
		ExtShCreqryRepayStockDTO resultDto = (ExtShCreqryRepayStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtShCreqryRepayStock
     * @author Administrator
     * @description: 修改 算话征信贷款信息查询_还款信息列表对象
     * @date 2017-06-09 10:02:10
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtShCreqryRepayStock(ExtShCreqryRepayStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtShCreqryRepayStock(paramMap);
	}
	/**
     * @title: deleteExtShCreqryRepayStockByPrimaryKey
     * @author Administrator
     * @description: 删除 算话征信贷款信息查询_还款信息列表,按主键
     * @date 2017-06-09 10:02:10
     * @param paramMap
     * @throws
     */ 
	public void deleteExtShCreqryRepayStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtShCreqryRepayStockByPrimaryKey(paramMap);
	}

}

