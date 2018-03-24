package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpoiinfo.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpoiinfo.dto.ExtWlSmPoiInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpoiinfo.dao.ExtWlSmPoiInfoDao;

/**
 * @classname: ExtWlSmPoiInfoService
 * @description: 定义  数美黄页服务信息(外联平台表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpoiinfo.service.ExtWlSmPoiInfoService")
public class ExtWlSmPoiInfoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlSmPoiInfoDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 数美黄页服务信息(外联平台表)列表
     * @date 2017-09-26 14:27:07
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlSmPoiInfoDTO> searchExtWlSmPoiInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlSmPoiInfoDTO> dataList =  dao.searchExtWlSmPoiInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询数美黄页服务信息(外联平台表)列表
     * @date 2017-09-26 14:27:07
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlSmPoiInfoDTO> searchExtWlSmPoiInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlSmPoiInfoDTO> dataList = dao.searchExtWlSmPoiInfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询数美黄页服务信息(外联平台表)对象
     * @date 2017-09-26 14:27:07
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlSmPoiInfoDTO queryExtWlSmPoiInfoByPrimaryKey(String id) throws Exception {
		
		ExtWlSmPoiInfoDTO dto = dao.findExtWlSmPoiInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlSmPoiInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlSmPoiInfo
     * @author Administrator
     * @description: 新增 数美黄页服务信息(外联平台表)对象
     * @date 2017-09-26 14:27:07
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlSmPoiInfo(ExtWlSmPoiInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);

        if(null != dto.getIntoCustRefId() && StringUtils.isNotEmpty(dto.getIntoCustRefId().toString()) && StringUtils.isNotEmpty(dto.getPhone())){
            
            dao.updateExtWlSmPoiInfoByIntocustid(paramMap);
        }
        
        
		int count = dao.insertExtWlSmPoiInfo(paramMap);
		
		ExtWlSmPoiInfoDTO resultDto = (ExtWlSmPoiInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlSmPoiInfo
     * @author Administrator
     * @description: 修改 数美黄页服务信息(外联平台表)对象
     * @date 2017-09-26 14:27:07
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlSmPoiInfo(ExtWlSmPoiInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlSmPoiInfo(paramMap);
	}
	/**
     * @title: deleteExtWlSmPoiInfoByPrimaryKey
     * @author Administrator
     * @description: 删除 数美黄页服务信息(外联平台表),按主键
     * @date 2017-09-26 14:27:07
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlSmPoiInfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlSmPoiInfoByPrimaryKey(paramMap);
	}

}

