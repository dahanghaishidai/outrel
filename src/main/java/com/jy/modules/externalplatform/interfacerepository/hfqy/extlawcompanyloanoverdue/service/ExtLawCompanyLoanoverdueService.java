package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyloanoverdue.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyloanoverdue.dao.ExtLawCompanyLoanoverdueDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyloanoverdue.dto.ExtLawCompanyLoanoverdueDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawCompanyLoanoverdueService
 * @description: 定义  汇法网企业网贷逾期表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyloanoverdue.service.ExtLawCompanyLoanoverdueService")
public class ExtLawCompanyLoanoverdueService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawCompanyLoanoverdueDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网企业网贷逾期表列表
     * @date 2017-06-01 10:11:37
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawCompanyLoanoverdueDTO> searchExtLawCompanyLoanoverdueByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawCompanyLoanoverdueDTO> dataList =  dao.searchExtLawCompanyLoanoverdueByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网企业网贷逾期表列表
     * @date 2017-06-01 10:11:37
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawCompanyLoanoverdueDTO> searchExtLawCompanyLoanoverdue(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawCompanyLoanoverdueDTO> dataList = dao.searchExtLawCompanyLoanoverdue(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网企业网贷逾期表对象
     * @date 2017-06-01 10:11:37
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawCompanyLoanoverdueDTO queryExtLawCompanyLoanoverdueByPrimaryKey(String id) throws Exception {
		
		ExtLawCompanyLoanoverdueDTO dto = dao.findExtLawCompanyLoanoverdueByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawCompanyLoanoverdueDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawCompanyLoanoverdue
     * @author Administrator
     * @description: 新增 汇法网企业网贷逾期表对象
     * @date 2017-06-01 10:11:37
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawCompanyLoanoverdue(ExtLawCompanyLoanoverdueDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawCompanyLoanoverdue(paramMap);
		
		ExtLawCompanyLoanoverdueDTO resultDto = (ExtLawCompanyLoanoverdueDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawCompanyLoanoverdue
     * @author Administrator
     * @description: 修改 汇法网企业网贷逾期表对象
     * @date 2017-06-01 10:11:37
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawCompanyLoanoverdue(ExtLawCompanyLoanoverdueDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawCompanyLoanoverdue(paramMap);
	}
	/**
     * @title: deleteExtLawCompanyLoanoverdueByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网企业网贷逾期表,按主键
     * @date 2017-06-01 10:11:37
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawCompanyLoanoverdueByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawCompanyLoanoverdueByPrimaryKey(paramMap);
	}

}

