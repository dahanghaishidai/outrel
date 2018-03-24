package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgseahisbyday.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgseahisbyday.dto.ExtWlJxlMgSeahisBydayDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgseahisbyday.dao.ExtWlJxlMgSeahisBydayDao;

/**
 * @classname: ExtWlJxlMgSeahisBydayService
 * @description: 定义  蜜罐历史查询记录 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgseahisbyday.service.ExtWlJxlMgSeahisBydayService")
public class ExtWlJxlMgSeahisBydayService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgSeahisBydayDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 蜜罐历史查询记录列表
     * @date 2018-01-09 17:47:01
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgSeahisBydayDTO> searchExtWlJxlMgSeahisBydayByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgSeahisBydayDTO> dataList =  dao.searchExtWlJxlMgSeahisBydayByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询蜜罐历史查询记录列表
     * @date 2018-01-09 17:47:01
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgSeahisBydayDTO> searchExtWlJxlMgSeahisByday(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgSeahisBydayDTO> dataList = dao.searchExtWlJxlMgSeahisByday(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询蜜罐历史查询记录对象
     * @date 2018-01-09 17:47:01
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgSeahisBydayDTO queryExtWlJxlMgSeahisBydayByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgSeahisBydayDTO dto = dao.findExtWlJxlMgSeahisBydayByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgSeahisBydayDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgSeahisByday
     * @author Administrator
     * @description: 新增 蜜罐历史查询记录对象
     * @date 2018-01-09 17:47:01
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgSeahisByday(ExtWlJxlMgSeahisBydayDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgSeahisByday(paramMap);
		
		ExtWlJxlMgSeahisBydayDTO resultDto = (ExtWlJxlMgSeahisBydayDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgSeahisByday
     * @author Administrator
     * @description: 修改 蜜罐历史查询记录对象
     * @date 2018-01-09 17:47:01
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgSeahisByday(ExtWlJxlMgSeahisBydayDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgSeahisByday(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgSeahisBydayByPrimaryKey
     * @author Administrator
     * @description: 删除 蜜罐历史查询记录,按主键
     * @date 2018-01-09 17:47:01
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgSeahisBydayByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgSeahisBydayByPrimaryKey(paramMap);
	}

}

