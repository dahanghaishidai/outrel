package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourtnoprom.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourtnoprom.dto.ExtWlZxtCourtNoPromDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourtnoprom.dao.ExtWlZxtCourtNoPromDao;

/**
 * @classname: ExtWlZxtCourtNoPromService
 * @description: 定义  个人/单位-法院失信被执行信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourtnoprom.service.ExtWlZxtCourtNoPromService")
public class ExtWlZxtCourtNoPromService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZxtCourtNoPromDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 个人/单位-法院失信被执行信息列表
     * @date 2017-12-18 11:33:37
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZxtCourtNoPromDTO> searchExtWlZxtCourtNoPromByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZxtCourtNoPromDTO> dataList =  dao.searchExtWlZxtCourtNoPromByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询个人/单位-法院失信被执行信息列表
     * @date 2017-12-18 11:33:37
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtCourtNoPromDTO> searchExtWlZxtCourtNoProm(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZxtCourtNoPromDTO> dataList = dao.searchExtWlZxtCourtNoProm(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询个人/单位-法院失信被执行信息对象
     * @date 2017-12-18 11:33:37
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZxtCourtNoPromDTO queryExtWlZxtCourtNoPromByPrimaryKey(String id) throws Exception {
		
		ExtWlZxtCourtNoPromDTO dto = dao.findExtWlZxtCourtNoPromByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZxtCourtNoPromDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZxtCourtNoProm
     * @author Administrator
     * @description: 新增 个人/单位-法院失信被执行信息对象
     * @date 2017-12-18 11:33:37
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZxtCourtNoProm(ExtWlZxtCourtNoPromDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZxtCourtNoProm(paramMap);
		
		ExtWlZxtCourtNoPromDTO resultDto = (ExtWlZxtCourtNoPromDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZxtCourtNoProm
     * @author Administrator
     * @description: 修改 个人/单位-法院失信被执行信息对象
     * @date 2017-12-18 11:33:37
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlZxtCourtNoProm(ExtWlZxtCourtNoPromDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZxtCourtNoProm(paramMap);
	}
	/**
     * @title: deleteExtWlZxtCourtNoPromByPrimaryKey
     * @author Administrator
     * @description: 删除 个人/单位-法院失信被执行信息,按主键
     * @date 2017-12-18 11:33:37
     * @param baseDto,ids
     * @throws
     */ 
	public void deleteExtWlZxtCourtNoPromByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZxtCourtNoPromByPrimaryKey(paramMap);
	}

}

