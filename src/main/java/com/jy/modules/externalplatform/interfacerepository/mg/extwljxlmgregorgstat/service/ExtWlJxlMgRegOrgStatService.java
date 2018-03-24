package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgregorgstat.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgregorgstat.dto.ExtWlJxlMgRegOrgStatDTO;
import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgregorgstat.dao.ExtWlJxlMgRegOrgStatDao;

/**
 * @classname: ExtWlJxlMgRegOrgStatService
 * @description: 定义  聚信立蜜罐用户注册信息情况 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgregorgstat.service.ExtWlJxlMgRegOrgStatService")
public class ExtWlJxlMgRegOrgStatService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlJxlMgRegOrgStatDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 聚信立蜜罐用户注册信息情况列表
     * @date 2017-12-14 13:55:52
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlJxlMgRegOrgStatDTO> searchExtWlJxlMgRegOrgStatByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlJxlMgRegOrgStatDTO> dataList =  dao.searchExtWlJxlMgRegOrgStatByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询聚信立蜜罐用户注册信息情况列表
     * @date 2017-12-14 13:55:52
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlJxlMgRegOrgStatDTO> searchExtWlJxlMgRegOrgStat(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlJxlMgRegOrgStatDTO> dataList = dao.searchExtWlJxlMgRegOrgStat(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询聚信立蜜罐用户注册信息情况对象
     * @date 2017-12-14 13:55:52
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlJxlMgRegOrgStatDTO queryExtWlJxlMgRegOrgStatByPrimaryKey(String id) throws Exception {
		
		ExtWlJxlMgRegOrgStatDTO dto = dao.findExtWlJxlMgRegOrgStatByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlJxlMgRegOrgStatDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlJxlMgRegOrgStat
     * @author Administrator
     * @description: 新增 聚信立蜜罐用户注册信息情况对象
     * @date 2017-12-14 13:55:52
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlJxlMgRegOrgStat(ExtWlJxlMgRegOrgStatDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlJxlMgRegOrgStat(paramMap);
		
		ExtWlJxlMgRegOrgStatDTO resultDto = (ExtWlJxlMgRegOrgStatDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlJxlMgRegOrgStat
     * @author Administrator
     * @description: 修改 聚信立蜜罐用户注册信息情况对象
     * @date 2017-12-14 13:55:52
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlJxlMgRegOrgStat(ExtWlJxlMgRegOrgStatDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlJxlMgRegOrgStat(paramMap);
	}
	/**
     * @title: deleteExtWlJxlMgRegOrgStatByPrimaryKey
     * @author Administrator
     * @description: 删除 聚信立蜜罐用户注册信息情况,按主键
     * @date 2017-12-14 13:55:52
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlJxlMgRegOrgStatByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlJxlMgRegOrgStatByPrimaryKey(paramMap);
	}

}

