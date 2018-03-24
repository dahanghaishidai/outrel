package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtidentifyloss.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtidentifyloss.dto.ExtWlZxtIdentifyLossDTO;
import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtidentifyloss.dao.ExtWlZxtIdentifyLossDao;

/**
 * @classname: ExtWlZxtIdentifyLossService
 * @description: 定义  身份证挂失信息 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtidentifyloss.service.ExtWlZxtIdentifyLossService")
public class ExtWlZxtIdentifyLossService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlZxtIdentifyLossDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 身份证挂失信息列表
     * @date 2017-12-18 11:33:56
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlZxtIdentifyLossDTO> searchExtWlZxtIdentifyLossByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlZxtIdentifyLossDTO> dataList =  dao.searchExtWlZxtIdentifyLossByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询身份证挂失信息列表
     * @date 2017-12-18 11:33:56
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlZxtIdentifyLossDTO> searchExtWlZxtIdentifyLoss(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlZxtIdentifyLossDTO> dataList = dao.searchExtWlZxtIdentifyLoss(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询身份证挂失信息对象
     * @date 2017-12-18 11:33:56
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlZxtIdentifyLossDTO queryExtWlZxtIdentifyLossByPrimaryKey(String id) throws Exception {
		
		ExtWlZxtIdentifyLossDTO dto = dao.findExtWlZxtIdentifyLossByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlZxtIdentifyLossDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlZxtIdentifyLoss
     * @author Administrator
     * @description: 新增 身份证挂失信息对象
     * @date 2017-12-18 11:33:56
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlZxtIdentifyLoss(ExtWlZxtIdentifyLossDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlZxtIdentifyLoss(paramMap);
		
		ExtWlZxtIdentifyLossDTO resultDto = (ExtWlZxtIdentifyLossDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlZxtIdentifyLoss
     * @author Administrator
     * @description: 修改 身份证挂失信息对象
     * @date 2017-12-18 11:33:56
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlZxtIdentifyLoss(ExtWlZxtIdentifyLossDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlZxtIdentifyLoss(paramMap);
	}
	/**
     * @title: deleteExtWlZxtIdentifyLossByPrimaryKey
     * @author Administrator
     * @description: 删除 身份证挂失信息,按主键
     * @date 2017-12-18 11:33:56
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlZxtIdentifyLossByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlZxtIdentifyLossByPrimaryKey(paramMap);
	}

}

