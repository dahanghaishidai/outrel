package com.jy.modules.externalplatform.interfacerepository.td.extwltdhitrules.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.td.extwltdhitrules.dto.ExtWlTdHitRulesDTO;
import com.jy.modules.externalplatform.interfacerepository.td.extwltdhitrules.dao.ExtWlTdHitRulesDao;

/**
 * @className: ExtWlTdHitRulesService
 * @package: com.jy.modules.externalplatform.interfacerepository.td.extwltdhitrules.service
 * @describe: 定义  同盾_TDRC决策引擎命中规则详情表 实现类
 * @auther: 董康宁
 * @date: 2017/12/21
 * @time: 10:31
 */
@Service("com.jy.modules.externalplatform.interfacerepository.td.extwltdhitrules.service.ExtWlTdHitRulesService")
public class ExtWlTdHitRulesService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlTdHitRulesDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 同盾_TDRC决策引擎命中规则详情表列表
     * @date 2017-12-21 10:30:40
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlTdHitRulesDTO> searchExtWlTdHitRulesByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlTdHitRulesDTO> dataList =  dao.searchExtWlTdHitRulesByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询同盾_TDRC决策引擎命中规则详情表列表
     * @date 2017-12-21 10:30:40
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlTdHitRulesDTO> searchExtWlTdHitRules(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlTdHitRulesDTO> dataList = dao.searchExtWlTdHitRules(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询同盾_TDRC决策引擎命中规则详情表对象
     * @date 2017-12-21 10:30:40
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlTdHitRulesDTO queryExtWlTdHitRulesByPrimaryKey(String id) throws Exception {
		
		ExtWlTdHitRulesDTO dto = dao.findExtWlTdHitRulesByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlTdHitRulesDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlTdHitRules
     * @author Administrator
     * @description: 新增 同盾_TDRC决策引擎命中规则详情表对象
     * @date 2017-12-21 10:30:40
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlTdHitRules(ExtWlTdHitRulesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlTdHitRules(paramMap);
		
		ExtWlTdHitRulesDTO resultDto = (ExtWlTdHitRulesDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlTdHitRules
     * @author Administrator
     * @description: 修改 同盾_TDRC决策引擎命中规则详情表对象
     * @date 2017-12-21 10:30:40
     * @param dto
     * @return
     * @throws
     */
	public void updateExtWlTdHitRules(ExtWlTdHitRulesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlTdHitRules(paramMap);
	}
	/**
     * @title: deleteExtWlTdHitRulesByPrimaryKey
     * @author Administrator
     * @description: 删除 同盾_TDRC决策引擎命中规则详情表,按主键
     * @date 2017-12-21 10:30:40
     * @param baseDto, ids
     * @throws
     */ 
	public void deleteExtWlTdHitRulesByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlTdHitRulesByPrimaryKey(paramMap);
	}

}

