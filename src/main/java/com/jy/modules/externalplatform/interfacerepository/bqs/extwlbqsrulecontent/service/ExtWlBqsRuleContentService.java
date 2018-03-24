package com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsrulecontent.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsrulecontent.dto.ExtWlBqsRuleContentDTO;
import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsrulecontent.dao.ExtWlBqsRuleContentDao;

/**
 * @classname: ExtWlBqsRuleContentService
 * @description: 定义  白骑士反欺诈云风险决策-规则内容表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsrulecontent.service.ExtWlBqsRuleContentService")
public class ExtWlBqsRuleContentService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlBqsRuleContentDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 白骑士反欺诈云风险决策-规则内容表列表
     * @date 2017-12-20 11:28:22
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlBqsRuleContentDTO> searchExtWlBqsRuleContentByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlBqsRuleContentDTO> dataList =  dao.searchExtWlBqsRuleContentByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询白骑士反欺诈云风险决策-规则内容表列表
     * @date 2017-12-20 11:28:22
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlBqsRuleContentDTO> searchExtWlBqsRuleContent(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlBqsRuleContentDTO> dataList = dao.searchExtWlBqsRuleContent(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询白骑士反欺诈云风险决策-规则内容表对象
     * @date 2017-12-20 11:28:22
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlBqsRuleContentDTO queryExtWlBqsRuleContentByPrimaryKey(String id) throws Exception {
		
		ExtWlBqsRuleContentDTO dto = dao.findExtWlBqsRuleContentByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlBqsRuleContentDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlBqsRuleContent
     * @author Administrator
     * @description: 新增 白骑士反欺诈云风险决策-规则内容表对象
     * @date 2017-12-20 11:28:22
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlBqsRuleContent(ExtWlBqsRuleContentDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlBqsRuleContent(paramMap);
		
		ExtWlBqsRuleContentDTO resultDto = (ExtWlBqsRuleContentDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlBqsRuleContent
     * @author Administrator
     * @description: 修改 白骑士反欺诈云风险决策-规则内容表对象
     * @date 2017-12-20 11:28:22
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlBqsRuleContent(ExtWlBqsRuleContentDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlBqsRuleContent(paramMap);
	}
	/**
     * @title: deleteExtWlBqsRuleContentByPrimaryKey
     * @author Administrator
     * @description: 删除 白骑士反欺诈云风险决策-规则内容表,按主键
     * @date 2017-12-20 11:28:22
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlBqsRuleContentByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlBqsRuleContentByPrimaryKey(paramMap);
	}

}

