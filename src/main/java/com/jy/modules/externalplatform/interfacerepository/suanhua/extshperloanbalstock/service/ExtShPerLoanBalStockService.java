package com.jy.modules.externalplatform.interfacerepository.suanhua.extshperloanbalstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperloanbalstock.dao.ExtShPerLoanBalStockDao;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperloanbalstock.dto.ExtShPerLoanBalStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtShPerLoanBalStockService
 * @description: 定义  人行征信贷款余额信息详列 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhua.extshperloanbalstock.service.ExtShPerLoanBalStockService")
public class ExtShPerLoanBalStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtShPerLoanBalStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 人行征信贷款余额信息详列列表
     * @date 2017-06-12 14:56:02
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtShPerLoanBalStockDTO> searchExtShPerLoanBalStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtShPerLoanBalStockDTO> dataList =  dao.searchExtShPerLoanBalStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询人行征信贷款余额信息详列列表
     * @date 2017-06-12 14:56:02
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtShPerLoanBalStockDTO> searchExtShPerLoanBalStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtShPerLoanBalStockDTO> dataList = dao.searchExtShPerLoanBalStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询人行征信贷款余额信息详列对象
     * @date 2017-06-12 14:56:02
     * @param id
     * @return
     * @throws
     */ 
	public ExtShPerLoanBalStockDTO queryExtShPerLoanBalStockByPrimaryKey(String id) throws Exception {
		
		ExtShPerLoanBalStockDTO dto = dao.findExtShPerLoanBalStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtShPerLoanBalStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtShPerLoanBalStock
     * @author Administrator
     * @description: 新增 人行征信贷款余额信息详列对象
     * @date 2017-06-12 14:56:02
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtShPerLoanBalStock(ExtShPerLoanBalStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtShPerLoanBalStock(paramMap);
		
		ExtShPerLoanBalStockDTO resultDto = (ExtShPerLoanBalStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtShPerLoanBalStock
     * @author Administrator
     * @description: 修改 人行征信贷款余额信息详列对象
     * @date 2017-06-12 14:56:02
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtShPerLoanBalStock(ExtShPerLoanBalStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtShPerLoanBalStock(paramMap);
	}
	/**
     * @title: deleteExtShPerLoanBalStockByPrimaryKey
     * @author Administrator
     * @description: 删除 人行征信贷款余额信息详列,按主键
     * @date 2017-06-12 14:56:02
     * @param paramMap
     * @throws
     */ 
	public void deleteExtShPerLoanBalStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtShPerLoanBalStockByPrimaryKey(paramMap);
	}

	/**
	 * 新增 人行征信贷款余额信息详列
	 * @param dtoList
	 * @param fkPersonalReportId
	 * @return
	 */
	public Long insertExtShPersonLoanBalancesList(List<ExtShPerLoanBalStockDTO> dtoList, Long fkPersonDebtsId){
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", dtoList);
		paramMap.put("fkPersonDebtsId", fkPersonDebtsId);
		int count = dao.insertExtShPersonLoanBalancesList(paramMap);
		return (long) count;
	}
}

