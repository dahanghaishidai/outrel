package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphonenames.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphonenames.dto.ExtWlJxlMgPhonenamesDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphonenames.dao.ExtWlJxlMgPhonenamesDao;

/**
 * @classname: ExtWlJxlMgPhonenamesService
 * @description: 定义  手机号码存疑绑定其他姓名表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphonenames.service.ExtWlJxlMgPhonenamesService")
public class ExtWlJxlMgPhonenamesService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgPhonenamesDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 手机号码存疑绑定其他姓名表列表
     * @date 2017-12-14 13:58:13
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgPhonenamesDTO> searchExtWlJxlMgPhonenamesByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgPhonenamesDTO> dataList =  dao.searchExtWlJxlMgPhonenamesByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询手机号码存疑绑定其他姓名表列表
     * @date 2017-12-14 13:58:13
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgPhonenamesDTO> searchExtWlJxlMgPhonenames(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgPhonenamesDTO> dataList = dao.searchExtWlJxlMgPhonenames(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询手机号码存疑绑定其他姓名表对象
     * @date 2017-12-14 13:58:13
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgPhonenamesDTO queryExtWlJxlMgPhonenamesByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgPhonenamesDTO dto = dao.findExtWlJxlMgPhonenamesByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgPhonenamesDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgPhonenames
     * @author Administrator
     * @description: 新增 手机号码存疑绑定其他姓名表对象
     * @date 2017-12-14 13:58:13
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgPhonenames(ExtWlJxlMgPhonenamesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgPhonenames(paramMap);
		
		ExtWlJxlMgPhonenamesDTO resultDto = (ExtWlJxlMgPhonenamesDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgPhonenames
     * @author Administrator
     * @description: 修改 手机号码存疑绑定其他姓名表对象
     * @date 2017-12-14 13:58:13
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgPhonenames(ExtWlJxlMgPhonenamesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgPhonenames(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgPhonenamesByPrimaryKey
     * @author Administrator
     * @description: 删除 手机号码存疑绑定其他姓名表,按主键
     * @date 2017-12-14 13:58:13
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgPhonenamesByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgPhonenamesByPrimaryKey(paramMap);
	}

}

