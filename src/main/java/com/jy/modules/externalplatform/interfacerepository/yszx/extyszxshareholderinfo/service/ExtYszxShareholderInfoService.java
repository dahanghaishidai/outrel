package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.dao.ExtYszxShareholderInfoDao;
import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.dto.ExtYszxShareholderInfoDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtYszxShareholderInfoService
 * @description: 定义  元素征信-企业股东信息 实现类
 * @author:  dell
 */
@Service("com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.service.ExtYszxShareholderInfoService")
public class ExtYszxShareholderInfoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtYszxShareholderInfoDao dao;

	/**
     * @author dell
     * @description: 分页查询 元素征信-企业股东信息列表
     * @date 2017-06-01 18:01:47
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtYszxShareholderInfoDTO> searchExtYszxShareholderInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtYszxShareholderInfoDTO> dataList =  dao.searchExtYszxShareholderInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author dell
     * @description: 按条件查询元素征信-企业股东信息列表
     * @date 2017-06-01 18:01:47
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtYszxShareholderInfoDTO> searchExtYszxShareholderInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtYszxShareholderInfoDTO> dataList = dao.searchExtYszxShareholderInfo(searchParams);
        return dataList;
    }
	/**
     * @author dell
     * @description: 查询元素征信-企业股东信息对象
     * @date 2017-06-01 18:01:47
     * @param id
     * @return
     * @throws
     */ 
	public ExtYszxShareholderInfoDTO queryExtYszxShareholderInfoByPrimaryKey(String id) throws Exception {
		
		ExtYszxShareholderInfoDTO dto = dao.findExtYszxShareholderInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtYszxShareholderInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtYszxShareholderInfo
     * @author dell
     * @description: 新增 元素征信-企业股东信息对象
     * @date 2017-06-01 18:01:47
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtYszxShareholderInfo(ExtYszxShareholderInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtYszxShareholderInfo(paramMap);
		
		ExtYszxShareholderInfoDTO resultDto = (ExtYszxShareholderInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtYszxShareholderInfo
     * @author dell
     * @description: 修改 元素征信-企业股东信息对象
     * @date 2017-06-01 18:01:47
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtYszxShareholderInfo(ExtYszxShareholderInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtYszxShareholderInfo(paramMap);
	}
	/**
     * @title: deleteExtYszxShareholderInfoByPrimaryKey
     * @author dell
     * @description: 删除 元素征信-企业股东信息,按主键
     * @date 2017-06-01 18:01:47
     * @param paramMap
     * @throws
     */ 
	public void deleteExtYszxShareholderInfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtYszxShareholderInfoByPrimaryKey(paramMap);
	}

}

