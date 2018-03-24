package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneidcards.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneidcards.dto.ExtWlJxlMgPhoneidcardsDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneidcards.dao.ExtWlJxlMgPhoneidcardsDao;

/**
 * @classname: ExtWlJxlMgPhoneidcardsService
 * @description: 定义  手机号码存疑绑定其他身份证号表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneidcards.service.ExtWlJxlMgPhoneidcardsService")
public class ExtWlJxlMgPhoneidcardsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgPhoneidcardsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 手机号码存疑绑定其他身份证号表列表
     * @date 2017-12-14 13:57:55
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgPhoneidcardsDTO> searchExtWlJxlMgPhoneidcardsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgPhoneidcardsDTO> dataList =  dao.searchExtWlJxlMgPhoneidcardsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询手机号码存疑绑定其他身份证号表列表
     * @date 2017-12-14 13:57:55
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgPhoneidcardsDTO> searchExtWlJxlMgPhoneidcards(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgPhoneidcardsDTO> dataList = dao.searchExtWlJxlMgPhoneidcards(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询手机号码存疑绑定其他身份证号表对象
     * @date 2017-12-14 13:57:55
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgPhoneidcardsDTO queryExtWlJxlMgPhoneidcardsByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgPhoneidcardsDTO dto = dao.findExtWlJxlMgPhoneidcardsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgPhoneidcardsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgPhoneidcards
     * @author Administrator
     * @description: 新增 手机号码存疑绑定其他身份证号表对象
     * @date 2017-12-14 13:57:55
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgPhoneidcards(ExtWlJxlMgPhoneidcardsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgPhoneidcards(paramMap);
		
		ExtWlJxlMgPhoneidcardsDTO resultDto = (ExtWlJxlMgPhoneidcardsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgPhoneidcards
     * @author Administrator
     * @description: 修改 手机号码存疑绑定其他身份证号表对象
     * @date 2017-12-14 13:57:55
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgPhoneidcards(ExtWlJxlMgPhoneidcardsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgPhoneidcards(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgPhoneidcardsByPrimaryKey
     * @author Administrator
     * @description: 删除 手机号码存疑绑定其他身份证号表,按主键
     * @date 2017-12-14 13:57:55
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgPhoneidcardsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgPhoneidcardsByPrimaryKey(paramMap);
	}

}

