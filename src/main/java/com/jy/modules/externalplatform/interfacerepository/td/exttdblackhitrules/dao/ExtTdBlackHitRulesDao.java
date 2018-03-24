package com.jy.modules.externalplatform.interfacerepository.td.exttdblackhitrules.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.td.exttdblackhitrules.dto.ExtTdBlackHitRulesDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtTdBlackHitRulesDao
 * @description: 定义  同盾黑名单命中规则明细表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtTdBlackHitRulesDao {
    
    /**
     * @author Administrator
     * @description: 分页查询同盾黑名单命中规则明细表
     * @date 2017-06-02 14:56:08
     * @param searchParams
     * @return
     */
    public List<ExtTdBlackHitRulesDTO> searchExtTdBlackHitRulesByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象同盾黑名单命中规则明细表
     * @date 2017-06-02 14:56:08
     * @param searchParams
     * @return
     */
    public List<ExtTdBlackHitRulesDTO> searchExtTdBlackHitRules(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象同盾黑名单命中规则明细表
     * @date 2017-06-02 14:56:08
     * @param id
     * @return
     */
    public ExtTdBlackHitRulesDTO findExtTdBlackHitRulesByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象同盾黑名单命中规则明细表
     * @date 2017-06-02 14:56:08
     * @param paramMap
     * @return
     */
    public int insertExtTdBlackHitRules(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象同盾黑名单命中规则明细表
     * @date 2017-06-02 14:56:08
     * @param paramMap
     */
    public void updateExtTdBlackHitRules(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除同盾黑名单命中规则明细表
     * @date 2017-06-02 14:56:08
     * @param ids
     * @return
     */ 
    public void deleteExtTdBlackHitRulesByPrimaryKey(Map<String, Object> paramMap);

    /**
     * 批量保存
     * @param paramMap
     */
	public void batchInsertExtTdBlackHitRules(Map<String, Object> paramMap);
    
    
}
