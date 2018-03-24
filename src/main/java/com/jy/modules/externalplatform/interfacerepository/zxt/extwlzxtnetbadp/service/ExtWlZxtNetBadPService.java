package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtnetbadp.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtnetbadp.dto.ExtWlZxtNetBadPDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtnetbadp.dao.ExtWlZxtNetBadPDao;

/**
 * @classname: ExtWlZxtNetBadPService
 * @description: 定义  个人/单位-网络负面舆情信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtnetbadp.service.ExtWlZxtNetBadPService")
public class ExtWlZxtNetBadPService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZxtNetBadPDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 个人/单位-网络负面舆情信息列表
     * @date 2017-12-18 15:07:21
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZxtNetBadPDTO> searchExtWlZxtNetBadPByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZxtNetBadPDTO> dataList =  dao.searchExtWlZxtNetBadPByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询个人/单位-网络负面舆情信息列表
     * @date 2017-12-18 15:07:21
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtNetBadPDTO> searchExtWlZxtNetBadP(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZxtNetBadPDTO> dataList = dao.searchExtWlZxtNetBadP(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询个人/单位-网络负面舆情信息对象
     * @date 2017-12-18 15:07:21
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZxtNetBadPDTO queryExtWlZxtNetBadPByPrimaryKey(String id) throws Exception {
		
		ExtWlZxtNetBadPDTO dto = dao.findExtWlZxtNetBadPByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZxtNetBadPDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZxtNetBadP
     * @author Administrator
     * @description: 新增 个人/单位-网络负面舆情信息对象
     * @date 2017-12-18 15:07:21
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZxtNetBadP(ExtWlZxtNetBadPDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZxtNetBadP(paramMap);
		
		ExtWlZxtNetBadPDTO resultDto = (ExtWlZxtNetBadPDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZxtNetBadP
     * @author Administrator
     * @description: 修改 个人/单位-网络负面舆情信息对象
     * @date 2017-12-18 15:07:21
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlZxtNetBadP(ExtWlZxtNetBadPDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZxtNetBadP(paramMap);
	}
	/**
     * @title: deleteExtWlZxtNetBadPByPrimaryKey
     * @author Administrator
     * @description: 删除 个人/单位-网络负面舆情信息,按主键
     * @date 2017-12-18 15:07:21
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlZxtNetBadPByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZxtNetBadPByPrimaryKey(paramMap);
	}

}

