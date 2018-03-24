package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanytax.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanytax.dao.ExtLawCompanyTaxDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanytax.dto.ExtLawCompanyTaxDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawCompanyTaxService
 * @description: 定义  汇法网企业税务信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanytax.service.ExtLawCompanyTaxService")
public class ExtLawCompanyTaxService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawCompanyTaxDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网企业税务信息表列表
     * @date 2017-06-01 10:11:13
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawCompanyTaxDTO> searchExtLawCompanyTaxByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawCompanyTaxDTO> dataList =  dao.searchExtLawCompanyTaxByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网企业税务信息表列表
     * @date 2017-06-01 10:11:13
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawCompanyTaxDTO> searchExtLawCompanyTax(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawCompanyTaxDTO> dataList = dao.searchExtLawCompanyTax(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网企业税务信息表对象
     * @date 2017-06-01 10:11:13
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawCompanyTaxDTO queryExtLawCompanyTaxByPrimaryKey(String id) throws Exception {
		
		ExtLawCompanyTaxDTO dto = dao.findExtLawCompanyTaxByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawCompanyTaxDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawCompanyTax
     * @author Administrator
     * @description: 新增 汇法网企业税务信息表对象
     * @date 2017-06-01 10:11:13
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawCompanyTax(ExtLawCompanyTaxDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawCompanyTax(paramMap);
		
		ExtLawCompanyTaxDTO resultDto = (ExtLawCompanyTaxDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawCompanyTax
     * @author Administrator
     * @description: 修改 汇法网企业税务信息表对象
     * @date 2017-06-01 10:11:13
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawCompanyTax(ExtLawCompanyTaxDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawCompanyTax(paramMap);
	}
	/**
     * @title: deleteExtLawCompanyTaxByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网企业税务信息表,按主键
     * @date 2017-06-01 10:11:13
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawCompanyTaxByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawCompanyTaxByPrimaryKey(paramMap);
	}

}

