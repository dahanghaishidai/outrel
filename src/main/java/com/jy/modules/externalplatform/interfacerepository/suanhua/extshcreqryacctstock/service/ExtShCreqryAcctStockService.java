package com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryacctstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryacctstock.dao.ExtShCreqryAcctStockDao;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryacctstock.dto.ExtShCreqryAcctStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtShCreqryAcctStockService
 * @description: 定义  算话征信贷款信息查询_合同信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryacctstock.service.ExtShCreqryAcctStockService")
public class ExtShCreqryAcctStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtShCreqryAcctStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话征信贷款信息查询_合同信息列表
     * @date 2017-06-09 10:01:36
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtShCreqryAcctStockDTO> searchExtShCreqryAcctStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtShCreqryAcctStockDTO> dataList =  dao.searchExtShCreqryAcctStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话征信贷款信息查询_合同信息列表
     * @date 2017-06-09 10:01:36
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtShCreqryAcctStockDTO> searchExtShCreqryAcctStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtShCreqryAcctStockDTO> dataList = dao.searchExtShCreqryAcctStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话征信贷款信息查询_合同信息对象
     * @date 2017-06-09 10:01:36
     * @param id
     * @return
     * @throws
     */ 
	public ExtShCreqryAcctStockDTO queryExtShCreqryAcctStockByPrimaryKey(String id) throws Exception {
		
		ExtShCreqryAcctStockDTO dto = dao.findExtShCreqryAcctStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtShCreqryAcctStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtShCreqryAcctStock
     * @author Administrator
     * @description: 新增 算话征信贷款信息查询_合同信息对象
     * @date 2017-06-09 10:01:36
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtShCreqryAcctStock(ExtShCreqryAcctStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtShCreqryAcctStock(paramMap);
		
		ExtShCreqryAcctStockDTO resultDto = (ExtShCreqryAcctStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtShCreqryAcctStock
     * @author Administrator
     * @description: 修改 算话征信贷款信息查询_合同信息对象
     * @date 2017-06-09 10:01:36
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtShCreqryAcctStock(ExtShCreqryAcctStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtShCreqryAcctStock(paramMap);
	}
	/**
     * @title: deleteExtShCreqryAcctStockByPrimaryKey
     * @author Administrator
     * @description: 删除 算话征信贷款信息查询_合同信息,按主键
     * @date 2017-06-09 10:01:36
     * @param paramMap
     * @throws
     */ 
	public void deleteExtShCreqryAcctStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtShCreqryAcctStockByPrimaryKey(paramMap);
	}

}

