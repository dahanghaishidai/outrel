package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxcorporateinfo.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxcorporateinfo.dao.ExtYszxCorporateInfoDao;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxcorporateinfo.dto.ExtYszxCorporateInfoDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtYszxCorporateInfoService
 * @description: 定义  元素征信-企业法人信息 实现类
 * @author:  dell
 */
@Service("com.jy.modules.externalplatform.interfacerepository.yszx.extyszxcorporateinfo.service.ExtYszxCorporateInfoService")
public class ExtYszxCorporateInfoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtYszxCorporateInfoDao dao;

	/**
     * @author dell
     * @description: 分页查询 元素征信-企业法人信息列表
     * @date 2017-06-01 18:02:16
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtYszxCorporateInfoDTO> searchExtYszxCorporateInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtYszxCorporateInfoDTO> dataList =  dao.searchExtYszxCorporateInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author dell
     * @description: 按条件查询元素征信-企业法人信息列表
     * @date 2017-06-01 18:02:16
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtYszxCorporateInfoDTO> searchExtYszxCorporateInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtYszxCorporateInfoDTO> dataList = dao.searchExtYszxCorporateInfo(searchParams);
        return dataList;
    }
	/**
     * @author dell
     * @description: 查询元素征信-企业法人信息对象
     * @date 2017-06-01 18:02:16
     * @param id
     * @return
     * @throws
     */ 
	public ExtYszxCorporateInfoDTO queryExtYszxCorporateInfoByPrimaryKey(String id) throws Exception {
		
		ExtYszxCorporateInfoDTO dto = dao.findExtYszxCorporateInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtYszxCorporateInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtYszxCorporateInfo
     * @author dell
     * @description: 新增 元素征信-企业法人信息对象
     * @date 2017-06-01 18:02:16
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtYszxCorporateInfo(ExtYszxCorporateInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtYszxCorporateInfo(paramMap);
		
		ExtYszxCorporateInfoDTO resultDto = (ExtYszxCorporateInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtYszxCorporateInfo
     * @author dell
     * @description: 修改 元素征信-企业法人信息对象
     * @date 2017-06-01 18:02:16
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtYszxCorporateInfo(ExtYszxCorporateInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtYszxCorporateInfo(paramMap);
	}
	/**
     * @title: deleteExtYszxCorporateInfoByPrimaryKey
     * @author dell
     * @description: 删除 元素征信-企业法人信息,按主键
     * @date 2017-06-01 18:02:16
     * @param paramMap
     * @throws
     */ 
	public void deleteExtYszxCorporateInfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtYszxCorporateInfoByPrimaryKey(paramMap);
	}

}

