package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcriskresults.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcriskresults.dto.ExtWlZcRiskResultsDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZcRiskResultsDao
 * @description: 定义  致诚风险项记录表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZcRiskResultsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询致诚风险项记录表
     * @date 2017-12-07 13:40:28
     * @param searchParams
     * @return
     */
    public List<ExtWlZcRiskResultsDTO> searchExtWlZcRiskResultsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象致诚风险项记录表
     * @date 2017-12-07 13:40:28
     * @param searchParams
     * @return
     */
    public List<ExtWlZcRiskResultsDTO> searchExtWlZcRiskResults(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象致诚风险项记录表
     * @date 2017-12-07 13:40:28
     * @param id
     * @return
     */
    public ExtWlZcRiskResultsDTO findExtWlZcRiskResultsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象致诚风险项记录表
     * @date 2017-12-07 13:40:28
     * @param paramMap
     * @return
     */
    public int insertExtWlZcRiskResults(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象致诚风险项记录表
     * @date 2017-12-07 13:40:28
     * @param paramMap
     */
    public void updateExtWlZcRiskResults(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除致诚风险项记录表
     * @date 2017-12-07 13:40:28
     * @param ids
     * @return
     */ 
    public void deleteExtWlZcRiskResultsByPrimaryKey(Map<String, Object> paramMap);

    public void batchInsertRiskResults(Map<String, Object> paramMap);
    
    
}
