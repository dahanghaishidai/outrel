package com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.dto.ExtWlPaCreditInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.dao.ExtWlPaCreditInfoDao;

/**
 * @classname: ExtWlPaCreditInfoService
 * @description: 定义  凭安信用信息表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.service.ExtWlPaCreditInfoService")
public class ExtWlPaCreditInfoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlPaCreditInfoDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 凭安信用信息表列表
     * @date 2018-01-08 10:55:24
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlPaCreditInfoDTO> searchExtWlPaCreditInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlPaCreditInfoDTO> dataList =  dao.searchExtWlPaCreditInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询凭安信用信息表列表
     * @date 2018-01-08 10:55:24
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlPaCreditInfoDTO> searchExtWlPaCreditInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlPaCreditInfoDTO> dataList = dao.searchExtWlPaCreditInfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询凭安信用信息表对象
     * @date 2018-01-08 10:55:24
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlPaCreditInfoDTO queryExtWlPaCreditInfoByPrimaryKey(String id) throws Exception {
		
		ExtWlPaCreditInfoDTO dto = dao.findExtWlPaCreditInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlPaCreditInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlPaCreditInfo
     * @author Administrator
     * @description: 新增 凭安信用信息表对象
     * @date 2018-01-08 10:55:24
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlPaCreditInfo(ExtWlPaCreditInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlPaCreditInfo(paramMap);
		
		ExtWlPaCreditInfoDTO resultDto = (ExtWlPaCreditInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlPaCreditInfo
     * @author Administrator
     * @description: 修改 凭安信用信息表对象
     * @date 2018-01-08 10:55:24
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlPaCreditInfo(ExtWlPaCreditInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlPaCreditInfo(paramMap);
	}
	/**
     * @title: deleteExtWlPaCreditInfoByPrimaryKey
     * @author Administrator
     * @description: 删除 凭安信用信息表,按主键
     * @date 2018-01-08 10:55:24
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlPaCreditInfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlPaCreditInfoByPrimaryKey(paramMap);
	}

}

