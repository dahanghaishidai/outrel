package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardphones.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardphones.dto.ExtWlJxlMgIdcardphonesDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardphones.dao.ExtWlJxlMgIdcardphonesDao;

/**
 * @classname: ExtWlJxlMgIdcardphonesService
 * @description: 定义  身份证号码存疑绑定其他手机表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardphones.service.ExtWlJxlMgIdcardphonesService")
public class ExtWlJxlMgIdcardphonesService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgIdcardphonesDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 身份证号码存疑绑定其他手机表列表
     * @date 2017-12-14 13:56:42
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgIdcardphonesDTO> searchExtWlJxlMgIdcardphonesByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgIdcardphonesDTO> dataList =  dao.searchExtWlJxlMgIdcardphonesByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询身份证号码存疑绑定其他手机表列表
     * @date 2017-12-14 13:56:42
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgIdcardphonesDTO> searchExtWlJxlMgIdcardphones(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgIdcardphonesDTO> dataList = dao.searchExtWlJxlMgIdcardphones(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询身份证号码存疑绑定其他手机表对象
     * @date 2017-12-14 13:56:42
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgIdcardphonesDTO queryExtWlJxlMgIdcardphonesByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgIdcardphonesDTO dto = dao.findExtWlJxlMgIdcardphonesByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgIdcardphonesDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgIdcardphones
     * @author Administrator
     * @description: 新增 身份证号码存疑绑定其他手机表对象
     * @date 2017-12-14 13:56:42
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgIdcardphones(ExtWlJxlMgIdcardphonesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgIdcardphones(paramMap);
		
		ExtWlJxlMgIdcardphonesDTO resultDto = (ExtWlJxlMgIdcardphonesDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgIdcardphones
     * @author Administrator
     * @description: 修改 身份证号码存疑绑定其他手机表对象
     * @date 2017-12-14 13:56:42
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgIdcardphones(ExtWlJxlMgIdcardphonesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgIdcardphones(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgIdcardphonesByPrimaryKey
     * @author Administrator
     * @description: 删除 身份证号码存疑绑定其他手机表,按主键
     * @date 2017-12-14 13:56:42
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgIdcardphonesByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgIdcardphonesByPrimaryKey(paramMap);
	}

}

