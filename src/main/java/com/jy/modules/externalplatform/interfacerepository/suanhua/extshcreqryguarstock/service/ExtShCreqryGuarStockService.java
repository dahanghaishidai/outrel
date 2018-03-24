package com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryguarstock.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryguarstock.dao.ExtShCreqryGuarStockDao;
import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryguarstock.dto.ExtShCreqryGuarStockDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtShCreqryGuarStockService
 * @description: 定义  算话征信贷款信息查询_担保信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryguarstock.service.ExtShCreqryGuarStockService")
public class ExtShCreqryGuarStockService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtShCreqryGuarStockDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话征信贷款信息查询_担保信息列表
     * @date 2017-06-09 10:01:47
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtShCreqryGuarStockDTO> searchExtShCreqryGuarStockByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtShCreqryGuarStockDTO> dataList =  dao.searchExtShCreqryGuarStockByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话征信贷款信息查询_担保信息列表
     * @date 2017-06-09 10:01:47
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtShCreqryGuarStockDTO> searchExtShCreqryGuarStock(Map<String,Object> searchParams) throws Exception {
	    List<ExtShCreqryGuarStockDTO> dataList = dao.searchExtShCreqryGuarStock(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话征信贷款信息查询_担保信息对象
     * @date 2017-06-09 10:01:47
     * @param id
     * @return
     * @throws
     */ 
	public ExtShCreqryGuarStockDTO queryExtShCreqryGuarStockByPrimaryKey(String id) throws Exception {
		
		ExtShCreqryGuarStockDTO dto = dao.findExtShCreqryGuarStockByPrimaryKey(id);
		
		if(dto == null) dto = new ExtShCreqryGuarStockDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtShCreqryGuarStock
     * @author Administrator
     * @description: 新增 算话征信贷款信息查询_担保信息对象
     * @date 2017-06-09 10:01:47
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtShCreqryGuarStock(ExtShCreqryGuarStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtShCreqryGuarStock(paramMap);
		
		ExtShCreqryGuarStockDTO resultDto = (ExtShCreqryGuarStockDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtShCreqryGuarStock
     * @author Administrator
     * @description: 修改 算话征信贷款信息查询_担保信息对象
     * @date 2017-06-09 10:01:47
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtShCreqryGuarStock(ExtShCreqryGuarStockDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtShCreqryGuarStock(paramMap);
	}
	/**
     * @title: deleteExtShCreqryGuarStockByPrimaryKey
     * @author Administrator
     * @description: 删除 算话征信贷款信息查询_担保信息,按主键
     * @date 2017-06-09 10:01:47
     * @param paramMap
     * @throws
     */ 
	public void deleteExtShCreqryGuarStockByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtShCreqryGuarStockByPrimaryKey(paramMap);
	}

}

