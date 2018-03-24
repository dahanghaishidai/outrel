package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonloanoverdue.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonloanoverdue.dao.ExtLawPersonLoanoverdueDao;
import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonloanoverdue.dto.ExtLawPersonLoanoverdueDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawPersonLoanoverdueService
 * @description: 定义  汇法网个人网贷逾期表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonloanoverdue.service.ExtLawPersonLoanoverdueService")
public class ExtLawPersonLoanoverdueService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawPersonLoanoverdueDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网个人网贷逾期表列表
     * @date 2017-05-31 11:11:13
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawPersonLoanoverdueDTO> searchExtLawPersonLoanoverdueByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawPersonLoanoverdueDTO> dataList =  dao.searchExtLawPersonLoanoverdueByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网个人网贷逾期表列表
     * @date 2017-05-31 11:11:13
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawPersonLoanoverdueDTO> searchExtLawPersonLoanoverdue(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawPersonLoanoverdueDTO> dataList = dao.searchExtLawPersonLoanoverdue(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网个人网贷逾期表对象
     * @date 2017-05-31 11:11:13
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawPersonLoanoverdueDTO queryExtLawPersonLoanoverdueByPrimaryKey(String id) throws Exception {
		
		ExtLawPersonLoanoverdueDTO dto = dao.findExtLawPersonLoanoverdueByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawPersonLoanoverdueDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawPersonLoanoverdue
     * @author Administrator
     * @description: 新增 汇法网个人网贷逾期表对象
     * @date 2017-05-31 11:11:13
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawPersonLoanoverdue(ExtLawPersonLoanoverdueDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawPersonLoanoverdue(paramMap);
		
		ExtLawPersonLoanoverdueDTO resultDto = (ExtLawPersonLoanoverdueDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawPersonLoanoverdue
     * @author Administrator
     * @description: 修改 汇法网个人网贷逾期表对象
     * @date 2017-05-31 11:11:13
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawPersonLoanoverdue(ExtLawPersonLoanoverdueDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawPersonLoanoverdue(paramMap);
	}
	/**
     * @title: deleteExtLawPersonLoanoverdueByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网个人网贷逾期表,按主键
     * @date 2017-05-31 11:11:13
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawPersonLoanoverdueByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawPersonLoanoverdueByPrimaryKey(paramMap);
	}

}

