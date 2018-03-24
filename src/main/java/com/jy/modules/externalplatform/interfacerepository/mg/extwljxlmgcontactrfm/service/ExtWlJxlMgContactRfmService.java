package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontactrfm.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontactrfm.dto.ExtWlJxlMgContactRfmDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontactrfm.dao.ExtWlJxlMgContactRfmDao;

/**
 * @classname: ExtWlJxlMgContactRfmService
 * @description: 定义  EXT_WL_JXL_MG_CONTACT_RFM 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontactrfm.service.ExtWlJxlMgContactRfmService")
public class ExtWlJxlMgContactRfmService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgContactRfmDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 EXT_WL_JXL_MG_CONTACT_RFM列表
     * @date 2018-01-09 17:44:42
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgContactRfmDTO> searchExtWlJxlMgContactRfmByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgContactRfmDTO> dataList =  dao.searchExtWlJxlMgContactRfmByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询EXT_WL_JXL_MG_CONTACT_RFM列表
     * @date 2018-01-09 17:44:42
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgContactRfmDTO> searchExtWlJxlMgContactRfm(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgContactRfmDTO> dataList = dao.searchExtWlJxlMgContactRfm(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询EXT_WL_JXL_MG_CONTACT_RFM对象
     * @date 2018-01-09 17:44:42
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgContactRfmDTO queryExtWlJxlMgContactRfmByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgContactRfmDTO dto = dao.findExtWlJxlMgContactRfmByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgContactRfmDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgContactRfm
     * @author Administrator
     * @description: 新增 EXT_WL_JXL_MG_CONTACT_RFM对象
     * @date 2018-01-09 17:44:42
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgContactRfm(ExtWlJxlMgContactRfmDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgContactRfm(paramMap);
		
		ExtWlJxlMgContactRfmDTO resultDto = (ExtWlJxlMgContactRfmDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgContactRfm
     * @author Administrator
     * @description: 修改 EXT_WL_JXL_MG_CONTACT_RFM对象
     * @date 2018-01-09 17:44:42
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgContactRfm(ExtWlJxlMgContactRfmDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgContactRfm(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgContactRfmByPrimaryKey
     * @author Administrator
     * @description: 删除 EXT_WL_JXL_MG_CONTACT_RFM,按主键
     * @date 2018-01-09 17:44:42
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgContactRfmByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgContactRfmByPrimaryKey(paramMap);
	}

}

