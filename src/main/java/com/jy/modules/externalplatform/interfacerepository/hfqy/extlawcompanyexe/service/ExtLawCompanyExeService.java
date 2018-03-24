package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyexe.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyexe.dao.ExtLawCompanyExeDao;
import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyexe.dto.ExtLawCompanyExeDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtLawCompanyExeService
 * @description: 定义  汇法网企业执行信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyexe.service.ExtLawCompanyExeService")
public class ExtLawCompanyExeService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtLawCompanyExeDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 汇法网企业执行信息表列表
     * @date 2017-06-01 10:10:40
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtLawCompanyExeDTO> searchExtLawCompanyExeByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtLawCompanyExeDTO> dataList =  dao.searchExtLawCompanyExeByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询汇法网企业执行信息表列表
     * @date 2017-06-01 10:10:40
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtLawCompanyExeDTO> searchExtLawCompanyExe(Map<String,Object> searchParams) throws Exception {
	    List<ExtLawCompanyExeDTO> dataList = dao.searchExtLawCompanyExe(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询汇法网企业执行信息表对象
     * @date 2017-06-01 10:10:40
     * @param id
     * @return
     * @throws
     */ 
	public ExtLawCompanyExeDTO queryExtLawCompanyExeByPrimaryKey(String id) throws Exception {
		
		ExtLawCompanyExeDTO dto = dao.findExtLawCompanyExeByPrimaryKey(id);
		
		if(dto == null) dto = new ExtLawCompanyExeDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtLawCompanyExe
     * @author Administrator
     * @description: 新增 汇法网企业执行信息表对象
     * @date 2017-06-01 10:10:40
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtLawCompanyExe(ExtLawCompanyExeDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtLawCompanyExe(paramMap);
		
		ExtLawCompanyExeDTO resultDto = (ExtLawCompanyExeDTO) paramMap.get("dto");
		Long keyId = resultDto.getKeyid();
		return keyId;
	}
	/**
     * @title: updateExtLawCompanyExe
     * @author Administrator
     * @description: 修改 汇法网企业执行信息表对象
     * @date 2017-06-01 10:10:40
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtLawCompanyExe(ExtLawCompanyExeDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtLawCompanyExe(paramMap);
	}
	/**
     * @title: deleteExtLawCompanyExeByPrimaryKey
     * @author Administrator
     * @description: 删除 汇法网企业执行信息表,按主键
     * @date 2017-06-01 10:10:40
     * @param paramMap
     * @throws
     */ 
	public void deleteExtLawCompanyExeByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtLawCompanyExeByPrimaryKey(paramMap);
	}

}

