package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawtrialprocedure.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawtrialprocedure.dao.ExtLawTrialProcedureDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawtrialprocedure.dto.ExtLawTrialProcedureDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawTrialProcedureService
 * @description: 定义  汇法网企业审判流程公开表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfqy.extlawtrialprocedure.service.ExtLawTrialProcedureService")
public class ExtLawTrialProcedureService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawTrialProcedureDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网企业审判流程公开表列表
     * @date 2017-06-01 10:12:23
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawTrialProcedureDTO> searchExtLawTrialProcedureByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawTrialProcedureDTO> dataList =  dao.searchExtLawTrialProcedureByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网企业审判流程公开表列表
     * @date 2017-06-01 10:12:23
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawTrialProcedureDTO> searchExtLawTrialProcedure(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawTrialProcedureDTO> dataList = dao.searchExtLawTrialProcedure(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网企业审判流程公开表对象
     * @date 2017-06-01 10:12:23
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawTrialProcedureDTO queryExtLawTrialProcedureByPrimaryKey(String id) throws Exception {
		
		ExtLawTrialProcedureDTO dto = dao.findExtLawTrialProcedureByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawTrialProcedureDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawTrialProcedure
     * @author Administrator
     * @description: 新增 汇法网企业审判流程公开表对象
     * @date 2017-06-01 10:12:23
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawTrialProcedure(ExtLawTrialProcedureDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawTrialProcedure(paramMap);
		
		ExtLawTrialProcedureDTO resultDto = (ExtLawTrialProcedureDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawTrialProcedure
     * @author Administrator
     * @description: 修改 汇法网企业审判流程公开表对象
     * @date 2017-06-01 10:12:23
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawTrialProcedure(ExtLawTrialProcedureDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawTrialProcedure(paramMap);
	}
	/**
     * @title: deleteExtLawTrialProcedureByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网企业审判流程公开表,按主键
     * @date 2017-06-01 10:12:23
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawTrialProcedureByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawTrialProcedureByPrimaryKey(paramMap);
	}

}

