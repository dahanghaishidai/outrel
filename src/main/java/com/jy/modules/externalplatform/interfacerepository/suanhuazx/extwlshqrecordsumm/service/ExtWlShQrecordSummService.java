package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordsumm.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordsumm.dto.ExtWlShQrecordSummDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordsumm.dao.ExtWlShQrecordSummDao;

/**
 * @classname: ExtWlShQrecordSummService
 * @description: 定义  算话人行原版(查询记录信息概要表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordsumm.service.ExtWlShQrecordSummService")
public class ExtWlShQrecordSummService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShQrecordSummDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行原版(查询记录信息概要表)列表
     * @date 2017-12-21 19:52:00
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShQrecordSummDTO> searchExtWlShQrecordSummByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShQrecordSummDTO> dataList =  dao.searchExtWlShQrecordSummByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行原版(查询记录信息概要表)列表
     * @date 2017-12-21 19:52:00
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShQrecordSummDTO> searchExtWlShQrecordSumm(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShQrecordSummDTO> dataList = dao.searchExtWlShQrecordSumm(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行原版(查询记录信息概要表)对象
     * @date 2017-12-21 19:52:00
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShQrecordSummDTO queryExtWlShQrecordSummByPrimaryKey(String id) throws Exception {
		
		ExtWlShQrecordSummDTO dto = dao.findExtWlShQrecordSummByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShQrecordSummDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShQrecordSumm
     * @author Administrator
     * @description: 新增 算话人行原版(查询记录信息概要表)对象
     * @date 2017-12-21 19:52:00
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShQrecordSumm(ExtWlShQrecordSummDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShQrecordSumm(paramMap);
		
		ExtWlShQrecordSummDTO resultDto = (ExtWlShQrecordSummDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShQrecordSumm
     * @author Administrator
     * @description: 修改 算话人行原版(查询记录信息概要表)对象
     * @date 2017-12-21 19:52:00
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShQrecordSumm(ExtWlShQrecordSummDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShQrecordSumm(paramMap);
	}
	/**
     * @title: deleteExtWlShQrecordSummByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行原版(查询记录信息概要表),按主键
     * @date 2017-12-21 19:52:00
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShQrecordSummByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShQrecordSummByPrimaryKey(paramMap);
	}

}

