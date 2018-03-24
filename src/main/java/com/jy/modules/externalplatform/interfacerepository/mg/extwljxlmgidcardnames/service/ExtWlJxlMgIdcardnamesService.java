package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardnames.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardnames.dto.ExtWlJxlMgIdcardnamesDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardnames.dao.ExtWlJxlMgIdcardnamesDao;

/**
 * @classname: ExtWlJxlMgIdcardnamesService
 * @description: 定义  身份证号码存疑绑定其他姓名表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardnames.service.ExtWlJxlMgIdcardnamesService")
public class ExtWlJxlMgIdcardnamesService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgIdcardnamesDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 身份证号码存疑绑定其他姓名表列表
     * @date 2017-12-14 13:57:08
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgIdcardnamesDTO> searchExtWlJxlMgIdcardnamesByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgIdcardnamesDTO> dataList =  dao.searchExtWlJxlMgIdcardnamesByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询身份证号码存疑绑定其他姓名表列表
     * @date 2017-12-14 13:57:08
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgIdcardnamesDTO> searchExtWlJxlMgIdcardnames(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgIdcardnamesDTO> dataList = dao.searchExtWlJxlMgIdcardnames(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询身份证号码存疑绑定其他姓名表对象
     * @date 2017-12-14 13:57:08
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgIdcardnamesDTO queryExtWlJxlMgIdcardnamesByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgIdcardnamesDTO dto = dao.findExtWlJxlMgIdcardnamesByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgIdcardnamesDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgIdcardnames
     * @author Administrator
     * @description: 新增 身份证号码存疑绑定其他姓名表对象
     * @date 2017-12-14 13:57:08
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgIdcardnames(ExtWlJxlMgIdcardnamesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgIdcardnames(paramMap);
		
		ExtWlJxlMgIdcardnamesDTO resultDto = (ExtWlJxlMgIdcardnamesDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgIdcardnames
     * @author Administrator
     * @description: 修改 身份证号码存疑绑定其他姓名表对象
     * @date 2017-12-14 13:57:08
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgIdcardnames(ExtWlJxlMgIdcardnamesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgIdcardnames(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgIdcardnamesByPrimaryKey
     * @author Administrator
     * @description: 删除 身份证号码存疑绑定其他姓名表,按主键
     * @date 2017-12-14 13:57:08
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgIdcardnamesByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgIdcardnamesByPrimaryKey(paramMap);
	}

}

