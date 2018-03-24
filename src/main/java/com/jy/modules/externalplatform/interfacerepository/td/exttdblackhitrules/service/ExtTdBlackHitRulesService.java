package com.jy.modules.externalplatform.interfacerepository.td.exttdblackhitrules.service;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.modules.externalplatform.interfacerepository.td.exttdblackhitrules.dao.ExtTdBlackHitRulesDao;
import com.jy.modules.externalplatform.interfacerepository.td.exttdblackhitrules.dto.ExtTdBlackHitRulesDTO;
import com.jy.platform.core.common.BaseDTO;

/**
 * @classname: ExtTdBlackHitRulesService
 * @description: 定义  同盾黑名单命中规则明细表 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.td.exttdblackhitrules.service.ExtTdBlackHitRulesService")
public class ExtTdBlackHitRulesService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtTdBlackHitRulesDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 同盾黑名单命中规则明细表列表
     * @date 2017-06-02 14:56:08
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtTdBlackHitRulesDTO> searchExtTdBlackHitRulesByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtTdBlackHitRulesDTO> dataList =  dao.searchExtTdBlackHitRulesByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询同盾黑名单命中规则明细表列表
     * @date 2017-06-02 14:56:08
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtTdBlackHitRulesDTO> searchExtTdBlackHitRules(Map<String,Object> searchParams) throws Exception {
	    List<ExtTdBlackHitRulesDTO> dataList = dao.searchExtTdBlackHitRules(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询同盾黑名单命中规则明细表对象
     * @date 2017-06-02 14:56:08
     * @param id
     * @return
     * @throws
     */ 
	public ExtTdBlackHitRulesDTO queryExtTdBlackHitRulesByPrimaryKey(String id) throws Exception {
		
		ExtTdBlackHitRulesDTO dto = dao.findExtTdBlackHitRulesByPrimaryKey(id);
		
		if(dto == null) dto = new ExtTdBlackHitRulesDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtTdBlackHitRules
     * @author Administrator
     * @description: 新增 同盾黑名单命中规则明细表对象
     * @date 2017-06-02 14:56:08
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtTdBlackHitRules(ExtTdBlackHitRulesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtTdBlackHitRules(paramMap);
		
		ExtTdBlackHitRulesDTO resultDto = (ExtTdBlackHitRulesDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtTdBlackHitRules
     * @author Administrator
     * @description: 修改 同盾黑名单命中规则明细表对象
     * @date 2017-06-02 14:56:08
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtTdBlackHitRules(ExtTdBlackHitRulesDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtTdBlackHitRules(paramMap);
	}
	/**
     * @title: deleteExtTdBlackHitRulesByPrimaryKey
     * @author Administrator
     * @description: 删除 同盾黑名单命中规则明细表,按主键
     * @date 2017-06-02 14:56:08
     * @param paramMap
     * @throws
     */ 
	public void deleteExtTdBlackHitRulesByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtTdBlackHitRulesByPrimaryKey(paramMap);
	}

	/**
	 * @author xianglp
	 * @description: 批量保存同盾黑名单命中的明细规则
	 * @date 2017年6月2日 下午2:01:55
	 * @param dataList
	 * @param fkTdBlackResultId
	 * @throws Exception
	 */
	@SuppressWarnings("all")
	public void batchInsertExtTdBlackHitRules(List<ExtTdBlackHitRulesDTO> dataList, Long fkTdBlackResultId) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dataList", dataList);
		paramMap.put("fkTdBlackResultId", fkTdBlackResultId);

		dao.batchInsertExtTdBlackHitRules(paramMap);
	}
}

