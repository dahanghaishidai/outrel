package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardorgs.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardorgs.dto.ExtWlJxlMgIdcardorgsDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardorgs.dao.ExtWlJxlMgIdcardorgsDao;

/**
 * @classname: ExtWlJxlMgIdcardorgsService
 * @description: 定义  身份证号码存疑机构表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardorgs.service.ExtWlJxlMgIdcardorgsService")
public class ExtWlJxlMgIdcardorgsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgIdcardorgsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 身份证号码存疑机构表列表
     * @date 2017-12-14 13:57:28
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgIdcardorgsDTO> searchExtWlJxlMgIdcardorgsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgIdcardorgsDTO> dataList =  dao.searchExtWlJxlMgIdcardorgsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询身份证号码存疑机构表列表
     * @date 2017-12-14 13:57:28
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgIdcardorgsDTO> searchExtWlJxlMgIdcardorgs(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgIdcardorgsDTO> dataList = dao.searchExtWlJxlMgIdcardorgs(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询身份证号码存疑机构表对象
     * @date 2017-12-14 13:57:28
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgIdcardorgsDTO queryExtWlJxlMgIdcardorgsByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgIdcardorgsDTO dto = dao.findExtWlJxlMgIdcardorgsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgIdcardorgsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgIdcardorgs
     * @author Administrator
     * @description: 新增 身份证号码存疑机构表对象
     * @date 2017-12-14 13:57:28
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgIdcardorgs(ExtWlJxlMgIdcardorgsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgIdcardorgs(paramMap);
		
		ExtWlJxlMgIdcardorgsDTO resultDto = (ExtWlJxlMgIdcardorgsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgIdcardorgs
     * @author Administrator
     * @description: 修改 身份证号码存疑机构表对象
     * @date 2017-12-14 13:57:28
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgIdcardorgs(ExtWlJxlMgIdcardorgsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgIdcardorgs(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgIdcardorgsByPrimaryKey
     * @author Administrator
     * @description: 删除 身份证号码存疑机构表,按主键
     * @date 2017-12-14 13:57:28
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgIdcardorgsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgIdcardorgsByPrimaryKey(paramMap);
	}

}

