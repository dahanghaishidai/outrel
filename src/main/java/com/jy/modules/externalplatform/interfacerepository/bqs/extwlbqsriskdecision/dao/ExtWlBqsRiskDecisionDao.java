package com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsriskdecision.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsriskdecision.dto.ExtWlBqsRiskDecisionDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBqsRiskDecisionDao
 * @description: 定义  白骑士反欺诈云风险决策（主表） 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBqsRiskDecisionDao {
    
    /**
     * @author Administrator
     * @description: 分页查询白骑士反欺诈云风险决策（主表）
     * @date 2017-12-20 11:27:23
     * @param searchParams
     * @return
     */
    public List<ExtWlBqsRiskDecisionDTO> searchExtWlBqsRiskDecisionByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象白骑士反欺诈云风险决策（主表）
     * @date 2017-12-20 11:27:23
     * @param searchParams
     * @return
     */
    public List<ExtWlBqsRiskDecisionDTO> searchExtWlBqsRiskDecision(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象白骑士反欺诈云风险决策（主表）
     * @date 2017-12-20 11:27:23
     * @param id
     * @return
     */
    public ExtWlBqsRiskDecisionDTO findExtWlBqsRiskDecisionByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象白骑士反欺诈云风险决策（主表）
     * @date 2017-12-20 11:27:23
     * @param paramMap
     * @return
     */
    public int insertExtWlBqsRiskDecision(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象白骑士反欺诈云风险决策（主表）
     * @date 2017-12-20 11:27:23
     * @param paramMap
     */
    public void updateExtWlBqsRiskDecision(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除白骑士反欺诈云风险决策（主表）
     * @date 2017-12-20 11:27:23
     * @param ids
     * @return
     */ 
    public void deleteExtWlBqsRiskDecisionByPrimaryKey(Map<String, Object> paramMap);
    
    
}
