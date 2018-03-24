package com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsstrategyset.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.bqs.extwlbqsstrategyset.dto.ExtWlBqsStrategySetDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBqsStrategySetDao
 * @description: 定义  白骑士反欺诈云风险决策-策略集明细表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBqsStrategySetDao {
    
    /**
     * @author Administrator
     * @description: 分页查询白骑士反欺诈云风险决策-策略集明细表
     * @date 2017-12-20 11:28:03
     * @param searchParams
     * @return
     */
    public List<ExtWlBqsStrategySetDTO> searchExtWlBqsStrategySetByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象白骑士反欺诈云风险决策-策略集明细表
     * @date 2017-12-20 11:28:03
     * @param searchParams
     * @return
     */
    public List<ExtWlBqsStrategySetDTO> searchExtWlBqsStrategySet(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象白骑士反欺诈云风险决策-策略集明细表
     * @date 2017-12-20 11:28:03
     * @param id
     * @return
     */
    public ExtWlBqsStrategySetDTO findExtWlBqsStrategySetByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象白骑士反欺诈云风险决策-策略集明细表
     * @date 2017-12-20 11:28:03
     * @param paramMap
     * @return
     */
    public int insertExtWlBqsStrategySet(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象白骑士反欺诈云风险决策-策略集明细表
     * @date 2017-12-20 11:28:03
     * @param paramMap
     */
    public void updateExtWlBqsStrategySet(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除白骑士反欺诈云风险决策-策略集明细表
     * @date 2017-12-20 11:28:03
     * @param ids
     * @return
     */ 
    public void deleteExtWlBqsStrategySetByPrimaryKey(Map<String, Object> paramMap);
    
    
}
