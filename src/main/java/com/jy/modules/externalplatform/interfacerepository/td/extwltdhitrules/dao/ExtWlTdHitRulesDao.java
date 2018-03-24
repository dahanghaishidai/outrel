package com.jy.modules.externalplatform.interfacerepository.td.extwltdhitrules.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.td.extwltdhitrules.dto.ExtWlTdHitRulesDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlTdHitRulesDao
 * @description: 定义  同盾_TDRC决策引擎命中规则详情表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlTdHitRulesDao {
    
    /**
     * @author Administrator
     * @description: 分页查询同盾_TDRC决策引擎命中规则详情表
     * @date 2017-12-21 10:30:40
     * @param searchParams
     * @return
     */
    public List<ExtWlTdHitRulesDTO> searchExtWlTdHitRulesByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象同盾_TDRC决策引擎命中规则详情表
     * @date 2017-12-21 10:30:40
     * @param searchParams
     * @return
     */
    public List<ExtWlTdHitRulesDTO> searchExtWlTdHitRules(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象同盾_TDRC决策引擎命中规则详情表
     * @date 2017-12-21 10:30:40
     * @param id
     * @return
     */
    public ExtWlTdHitRulesDTO findExtWlTdHitRulesByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象同盾_TDRC决策引擎命中规则详情表
     * @date 2017-12-21 10:30:40
     * @param paramMap
     * @return
     */
    public int insertExtWlTdHitRules(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象同盾_TDRC决策引擎命中规则详情表
     * @date 2017-12-21 10:30:40
     * @param paramMap
     */
    public void updateExtWlTdHitRules(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除同盾_TDRC决策引擎命中规则详情表
     * @date 2017-12-21 10:30:40
     * @param ids
     * @return
     */ 
    public void deleteExtWlTdHitRulesByPrimaryKey(Map<String, Object> paramMap);
    
    
}
