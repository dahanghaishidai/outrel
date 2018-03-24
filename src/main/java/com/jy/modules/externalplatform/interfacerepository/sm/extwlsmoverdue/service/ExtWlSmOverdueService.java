package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmoverdue.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmoverdue.dto.ExtWlSmOverdueDTO;
import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmoverdue.dao.ExtWlSmOverdueDao;

/**
 * @classname: ExtWlSmOverdueService
 * @description: 定义  数美逾期黑名单服务信息(外联平台表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.sm.extwlsmoverdue.service.ExtWlSmOverdueService")
public class ExtWlSmOverdueService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlSmOverdueDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 数美逾期黑名单服务信息(外联平台表)列表
     * @date 2017-09-26 14:26:46
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlSmOverdueDTO> searchExtWlSmOverdueByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlSmOverdueDTO> dataList =  dao.searchExtWlSmOverdueByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询数美逾期黑名单服务信息(外联平台表)列表
     * @date 2017-09-26 14:26:46
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlSmOverdueDTO> searchExtWlSmOverdue(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlSmOverdueDTO> dataList = dao.searchExtWlSmOverdue(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询数美逾期黑名单服务信息(外联平台表)对象
     * @date 2017-09-26 14:26:46
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlSmOverdueDTO queryExtWlSmOverdueByPrimaryKey(String id) throws Exception {
		
		ExtWlSmOverdueDTO dto = dao.findExtWlSmOverdueByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlSmOverdueDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlSmOverdue
     * @author Administrator
     * @description: 新增 数美逾期黑名单服务信息(外联平台表)对象
     * @date 2017-09-26 14:26:46
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlSmOverdue(ExtWlSmOverdueDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		if(null != dto.getIntoCustRefId() && StringUtils.isNotEmpty(dto.getIntoCustRefId().toString()))
		    dao.updateExtWlSmOverdueByInfocustid(paramMap);
        
		int count = dao.insertExtWlSmOverdue(paramMap);
		
		ExtWlSmOverdueDTO resultDto = (ExtWlSmOverdueDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlSmOverdue
     * @author Administrator
     * @description: 修改 数美逾期黑名单服务信息(外联平台表)对象
     * @date 2017-09-26 14:26:46
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlSmOverdue(ExtWlSmOverdueDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlSmOverdue(paramMap);
	}
	/**
     * @title: deleteExtWlSmOverdueByPrimaryKey
     * @author Administrator
     * @description: 删除 数美逾期黑名单服务信息(外联平台表),按主键
     * @date 2017-09-26 14:26:46
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlSmOverdueByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlSmOverdueByPrimaryKey(paramMap);
	}

}

