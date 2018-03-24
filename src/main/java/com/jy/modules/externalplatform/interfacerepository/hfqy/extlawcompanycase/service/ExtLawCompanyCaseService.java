package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycase.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycase.dao.ExtLawCompanyCaseDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycase.dto.ExtLawCompanyCaseDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawCompanyCaseService
 * @description: 定义  汇法网企业案例信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycase.service.ExtLawCompanyCaseService")
public class ExtLawCompanyCaseService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawCompanyCaseDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网企业案例信息表列表
     * @date 2017-06-01 10:10:52
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawCompanyCaseDTO> searchExtLawCompanyCaseByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawCompanyCaseDTO> dataList =  dao.searchExtLawCompanyCaseByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网企业案例信息表列表
     * @date 2017-06-01 10:10:52
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawCompanyCaseDTO> searchExtLawCompanyCase(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawCompanyCaseDTO> dataList = dao.searchExtLawCompanyCase(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网企业案例信息表对象
     * @date 2017-06-01 10:10:52
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawCompanyCaseDTO queryExtLawCompanyCaseByPrimaryKey(String id) throws Exception {
		
		ExtLawCompanyCaseDTO dto = dao.findExtLawCompanyCaseByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawCompanyCaseDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawCompanyCase
     * @author Administrator
     * @description: 新增 汇法网企业案例信息表对象
     * @date 2017-06-01 10:10:52
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawCompanyCase(ExtLawCompanyCaseDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawCompanyCase(paramMap);
		
		ExtLawCompanyCaseDTO resultDto = (ExtLawCompanyCaseDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawCompanyCase
     * @author Administrator
     * @description: 修改 汇法网企业案例信息表对象
     * @date 2017-06-01 10:10:52
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawCompanyCase(ExtLawCompanyCaseDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawCompanyCase(paramMap);
	}
	/**
     * @title: deleteExtLawCompanyCaseByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网企业案例信息表,按主键
     * @date 2017-06-01 10:10:52
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawCompanyCaseByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawCompanyCaseByPrimaryKey(paramMap);
	}

}

