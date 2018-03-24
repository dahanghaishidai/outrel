package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtphonebad.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtphonebad.dto.ExtWlZxtPhoneBadDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtphonebad.dao.ExtWlZxtPhoneBadDao;

/**
 * @classname: ExtWlZxtPhoneBadService
 * @description: 定义  个人/关联人-手机号码负面标注信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtphonebad.service.ExtWlZxtPhoneBadService")
public class ExtWlZxtPhoneBadService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZxtPhoneBadDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 个人/关联人-手机号码负面标注信息列表
     * @date 2017-12-18 11:33:44
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZxtPhoneBadDTO> searchExtWlZxtPhoneBadByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZxtPhoneBadDTO> dataList =  dao.searchExtWlZxtPhoneBadByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询个人/关联人-手机号码负面标注信息列表
     * @date 2017-12-18 11:33:44
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtPhoneBadDTO> searchExtWlZxtPhoneBad(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZxtPhoneBadDTO> dataList = dao.searchExtWlZxtPhoneBad(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询个人/关联人-手机号码负面标注信息对象
     * @date 2017-12-18 11:33:44
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZxtPhoneBadDTO queryExtWlZxtPhoneBadByPrimaryKey(String id) throws Exception {
		
		ExtWlZxtPhoneBadDTO dto = dao.findExtWlZxtPhoneBadByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZxtPhoneBadDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZxtPhoneBad
     * @author Administrator
     * @description: 新增 个人/关联人-手机号码负面标注信息对象
     * @date 2017-12-18 11:33:44
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZxtPhoneBad(ExtWlZxtPhoneBadDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZxtPhoneBad(paramMap);
		
		ExtWlZxtPhoneBadDTO resultDto = (ExtWlZxtPhoneBadDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZxtPhoneBad
     * @author Administrator
     * @description: 修改 个人/关联人-手机号码负面标注信息对象
     * @date 2017-12-18 11:33:44
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlZxtPhoneBad(ExtWlZxtPhoneBadDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZxtPhoneBad(paramMap);
	}
	/**
     * @title: deleteExtWlZxtPhoneBadByPrimaryKey
     * @author Administrator
     * @description: 删除 个人/关联人-手机号码负面标注信息,按主键
     * @date 2017-12-18 11:33:44
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlZxtPhoneBadByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZxtPhoneBadByPrimaryKey(paramMap);
	}

}

