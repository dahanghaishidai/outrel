package com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsruledetails.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsruledetails.dto.ExtWlBqsRuleDetailsDTO;
import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsruledetails.dao.ExtWlBqsRuleDetailsDao;

/**
 * @classname: ExtWlBqsRuleDetailsService
 * @description: 定义  白骑士反欺诈云风险决策-规则明细表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsruledetails.service.ExtWlBqsRuleDetailsService")
public class ExtWlBqsRuleDetailsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlBqsRuleDetailsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 白骑士反欺诈云风险决策-规则明细表列表
     * @date 2017-12-20 11:28:54
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBqsRuleDetailsDTO> searchExtWlBqsRuleDetailsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBqsRuleDetailsDTO> dataList =  dao.searchExtWlBqsRuleDetailsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询白骑士反欺诈云风险决策-规则明细表列表
     * @date 2017-12-20 11:28:54
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBqsRuleDetailsDTO> searchExtWlBqsRuleDetails(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBqsRuleDetailsDTO> dataList = dao.searchExtWlBqsRuleDetails(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询白骑士反欺诈云风险决策-规则明细表对象
     * @date 2017-12-20 11:28:54
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBqsRuleDetailsDTO queryExtWlBqsRuleDetailsByPrimaryKey(String id) throws Exception {
		
		ExtWlBqsRuleDetailsDTO dto = dao.findExtWlBqsRuleDetailsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBqsRuleDetailsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBqsRuleDetails
     * @author Administrator
     * @description: 新增 白骑士反欺诈云风险决策-规则明细表对象
     * @date 2017-12-20 11:28:54
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBqsRuleDetails(ExtWlBqsRuleDetailsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBqsRuleDetails(paramMap);
		
		ExtWlBqsRuleDetailsDTO resultDto = (ExtWlBqsRuleDetailsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBqsRuleDetails
     * @author Administrator
     * @description: 修改 白骑士反欺诈云风险决策-规则明细表对象
     * @date 2017-12-20 11:28:54
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlBqsRuleDetails(ExtWlBqsRuleDetailsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBqsRuleDetails(paramMap);
	}
	/**
     * @title: deleteExtWlBqsRuleDetailsByPrimaryKey
     * @author Administrator
     * @description: 删除 白骑士反欺诈云风险决策-规则明细表,按主键
     * @date 2017-12-20 11:28:54
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlBqsRuleDetailsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBqsRuleDetailsByPrimaryKey(paramMap);
	}

}

