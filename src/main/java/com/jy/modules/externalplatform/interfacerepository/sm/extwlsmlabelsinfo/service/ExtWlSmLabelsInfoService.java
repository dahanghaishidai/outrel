package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmlabelsinfo.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmlabelsinfo.dto.ExtWlSmLabelsInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmlabelsinfo.dao.ExtWlSmLabelsInfoDao;

/**
 * @classname: ExtWlSmLabelsInfoService
 * @description: 定义  数美手机号码标签服务信息(外联平台表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmlabelsinfo.service.ExtWlSmLabelsInfoService")
public class ExtWlSmLabelsInfoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlSmLabelsInfoDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 数美手机号码标签服务信息(外联平台表)列表
     * @date 2017-09-26 14:27:00
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlSmLabelsInfoDTO> searchExtWlSmLabelsInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlSmLabelsInfoDTO> dataList =  dao.searchExtWlSmLabelsInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询数美手机号码标签服务信息(外联平台表)列表
     * @date 2017-09-26 14:27:00
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlSmLabelsInfoDTO> searchExtWlSmLabelsInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlSmLabelsInfoDTO> dataList = dao.searchExtWlSmLabelsInfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询数美手机号码标签服务信息(外联平台表)对象
     * @date 2017-09-26 14:27:00
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlSmLabelsInfoDTO queryExtWlSmLabelsInfoByPrimaryKey(String id) throws Exception {
		
		ExtWlSmLabelsInfoDTO dto = dao.findExtWlSmLabelsInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlSmLabelsInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlSmLabelsInfo
     * @author Administrator
     * @description: 新增 数美手机号码标签服务信息(外联平台表)对象
     * @date 2017-09-26 14:27:00
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlSmLabelsInfo(ExtWlSmLabelsInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);

        if(null != dto.getIntoCustRefId() && StringUtils.isNotEmpty(dto.getIntoCustRefId().toString()) && StringUtils.isNotEmpty(dto.getPhone())){

            dao.updateExtWlSmLabelsInfoByIntocustid(paramMap);
        }
        
		int count = dao.insertExtWlSmLabelsInfo(paramMap);
		
		ExtWlSmLabelsInfoDTO resultDto = (ExtWlSmLabelsInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlSmLabelsInfo
     * @author Administrator
     * @description: 修改 数美手机号码标签服务信息(外联平台表)对象
     * @date 2017-09-26 14:27:00
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlSmLabelsInfo(ExtWlSmLabelsInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlSmLabelsInfo(paramMap);
	}
	/**
     * @title: deleteExtWlSmLabelsInfoByPrimaryKey
     * @author Administrator
     * @description: 删除 数美手机号码标签服务信息(外联平台表),按主键
     * @date 2017-09-26 14:27:00
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlSmLabelsInfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlSmLabelsInfoByPrimaryKey(paramMap);
	}

}

