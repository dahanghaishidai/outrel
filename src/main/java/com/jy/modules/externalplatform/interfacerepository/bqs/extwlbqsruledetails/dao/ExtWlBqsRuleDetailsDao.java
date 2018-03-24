package com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsruledetails.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsruledetails.dto.ExtWlBqsRuleDetailsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBqsRuleDetailsDao
 * @description: 定义  白骑士反欺诈云风险决策-规则明细表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBqsRuleDetailsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询白骑士反欺诈云风险决策-规则明细表
     * @date 2017-12-20 11:28:54
     * @param searchParams
     * @return
     */
    public List<ExtWlBqsRuleDetailsDTO> searchExtWlBqsRuleDetailsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象白骑士反欺诈云风险决策-规则明细表
     * @date 2017-12-20 11:28:54
     * @param searchParams
     * @return
     */
    public List<ExtWlBqsRuleDetailsDTO> searchExtWlBqsRuleDetails(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象白骑士反欺诈云风险决策-规则明细表
     * @date 2017-12-20 11:28:54
     * @param id
     * @return
     */
    public ExtWlBqsRuleDetailsDTO findExtWlBqsRuleDetailsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象白骑士反欺诈云风险决策-规则明细表
     * @date 2017-12-20 11:28:54
     * @param paramMap
     * @return
     */
    public int insertExtWlBqsRuleDetails(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象白骑士反欺诈云风险决策-规则明细表
     * @date 2017-12-20 11:28:54
     * @param paramMap
     */
    public void updateExtWlBqsRuleDetails(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除白骑士反欺诈云风险决策-规则明细表
     * @date 2017-12-20 11:28:54
     * @param ids
     * @return
     */ 
    public void deleteExtWlBqsRuleDetailsByPrimaryKey(Map<String, Object> paramMap);
    
    
}
