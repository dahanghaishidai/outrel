package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneorgs.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneorgs.dto.ExtWlJxlMgPhoneorgsDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneorgs.dao.ExtWlJxlMgPhoneorgsDao;

/**
 * @classname: ExtWlJxlMgPhoneorgsService
 * @description: 定义  手机号码存疑其机构表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneorgs.service.ExtWlJxlMgPhoneorgsService")
public class ExtWlJxlMgPhoneorgsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgPhoneorgsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 手机号码存疑其机构表列表
     * @date 2017-12-14 13:58:39
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgPhoneorgsDTO> searchExtWlJxlMgPhoneorgsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgPhoneorgsDTO> dataList =  dao.searchExtWlJxlMgPhoneorgsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询手机号码存疑其机构表列表
     * @date 2017-12-14 13:58:39
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgPhoneorgsDTO> searchExtWlJxlMgPhoneorgs(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgPhoneorgsDTO> dataList = dao.searchExtWlJxlMgPhoneorgs(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询手机号码存疑其机构表对象
     * @date 2017-12-14 13:58:39
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgPhoneorgsDTO queryExtWlJxlMgPhoneorgsByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgPhoneorgsDTO dto = dao.findExtWlJxlMgPhoneorgsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgPhoneorgsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgPhoneorgs
     * @author Administrator
     * @description: 新增 手机号码存疑其机构表对象
     * @date 2017-12-14 13:58:39
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgPhoneorgs(ExtWlJxlMgPhoneorgsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgPhoneorgs(paramMap);
		
		ExtWlJxlMgPhoneorgsDTO resultDto = (ExtWlJxlMgPhoneorgsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgPhoneorgs
     * @author Administrator
     * @description: 修改 手机号码存疑其机构表对象
     * @date 2017-12-14 13:58:39
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgPhoneorgs(ExtWlJxlMgPhoneorgsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgPhoneorgs(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgPhoneorgsByPrimaryKey
     * @author Administrator
     * @description: 删除 手机号码存疑其机构表,按主键
     * @date 2017-12-14 13:58:39
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgPhoneorgsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgPhoneorgsByPrimaryKey(paramMap);
	}

}

