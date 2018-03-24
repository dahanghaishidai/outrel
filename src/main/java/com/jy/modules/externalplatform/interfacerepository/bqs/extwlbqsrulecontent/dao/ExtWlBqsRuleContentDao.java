package com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsrulecontent.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsrulecontent.dto.ExtWlBqsRuleContentDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBqsRuleContentDao
 * @description: 定义  白骑士反欺诈云风险决策-规则内容表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBqsRuleContentDao {
    
    /**
     * @author Administrator
     * @description: 分页查询白骑士反欺诈云风险决策-规则内容表
     * @date 2017-12-20 11:28:22
     * @param searchParams
     * @return
     */
    public List<ExtWlBqsRuleContentDTO> searchExtWlBqsRuleContentByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象白骑士反欺诈云风险决策-规则内容表
     * @date 2017-12-20 11:28:22
     * @param searchParams
     * @return
     */
    public List<ExtWlBqsRuleContentDTO> searchExtWlBqsRuleContent(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象白骑士反欺诈云风险决策-规则内容表
     * @date 2017-12-20 11:28:22
     * @param id
     * @return
     */
    public ExtWlBqsRuleContentDTO findExtWlBqsRuleContentByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象白骑士反欺诈云风险决策-规则内容表
     * @date 2017-12-20 11:28:22
     * @param paramMap
     * @return
     */
    public int insertExtWlBqsRuleContent(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象白骑士反欺诈云风险决策-规则内容表
     * @date 2017-12-20 11:28:22
     * @param paramMap
     */
    public void updateExtWlBqsRuleContent(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除白骑士反欺诈云风险决策-规则内容表
     * @date 2017-12-20 11:28:22
     * @param ids
     * @return
     */ 
    public void deleteExtWlBqsRuleContentByPrimaryKey(Map<String, Object> paramMap);
    
    
}
