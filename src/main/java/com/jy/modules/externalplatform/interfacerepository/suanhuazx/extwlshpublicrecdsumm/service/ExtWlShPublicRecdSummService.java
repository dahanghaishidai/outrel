package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpublicrecdsumm.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpublicrecdsumm.dto.ExtWlShPublicRecdSummDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpublicrecdsumm.dao.ExtWlShPublicRecdSummDao;

/**
 * @classname: ExtWlShPublicRecdSummService
 * @description: 定义  算话人行原版(公共记录概要表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpublicrecdsumm.service.ExtWlShPublicRecdSummService")
public class ExtWlShPublicRecdSummService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShPublicRecdSummDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行原版(公共记录概要表)列表
     * @date 2017-12-21 19:51:15
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShPublicRecdSummDTO> searchExtWlShPublicRecdSummByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShPublicRecdSummDTO> dataList =  dao.searchExtWlShPublicRecdSummByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行原版(公共记录概要表)列表
     * @date 2017-12-21 19:51:15
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShPublicRecdSummDTO> searchExtWlShPublicRecdSumm(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShPublicRecdSummDTO> dataList = dao.searchExtWlShPublicRecdSumm(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行原版(公共记录概要表)对象
     * @date 2017-12-21 19:51:15
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShPublicRecdSummDTO queryExtWlShPublicRecdSummByPrimaryKey(String id) throws Exception {
		
		ExtWlShPublicRecdSummDTO dto = dao.findExtWlShPublicRecdSummByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShPublicRecdSummDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShPublicRecdSumm
     * @author Administrator
     * @description: 新增 算话人行原版(公共记录概要表)对象
     * @date 2017-12-21 19:51:15
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShPublicRecdSumm(ExtWlShPublicRecdSummDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShPublicRecdSumm(paramMap);
		
		ExtWlShPublicRecdSummDTO resultDto = (ExtWlShPublicRecdSummDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShPublicRecdSumm
     * @author Administrator
     * @description: 修改 算话人行原版(公共记录概要表)对象
     * @date 2017-12-21 19:51:15
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShPublicRecdSumm(ExtWlShPublicRecdSummDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShPublicRecdSumm(paramMap);
	}
	/**
     * @title: deleteExtWlShPublicRecdSummByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行原版(公共记录概要表),按主键
     * @date 2017-12-21 19:51:15
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShPublicRecdSummByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShPublicRecdSummByPrimaryKey(paramMap);
	}

}

