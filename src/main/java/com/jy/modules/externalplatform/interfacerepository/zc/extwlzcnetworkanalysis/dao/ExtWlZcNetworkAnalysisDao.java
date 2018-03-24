package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcnetworkanalysis.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcnetworkanalysis.dto.ExtWlZcNetworkAnalysisDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZcNetworkAnalysisDao
 * @description: 定义  致诚社交关系网数据表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZcNetworkAnalysisDao {
    
    /**
     * @author Administrator
     * @description: 分页查询致诚社交关系网数据表
     * @date 2017-12-07 13:39:42
     * @param searchParams
     * @return
     */
    public List<ExtWlZcNetworkAnalysisDTO> searchExtWlZcNetworkAnalysisByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象致诚社交关系网数据表
     * @date 2017-12-07 13:39:42
     * @param searchParams
     * @return
     */
    public List<ExtWlZcNetworkAnalysisDTO> searchExtWlZcNetworkAnalysis(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象致诚社交关系网数据表
     * @date 2017-12-07 13:39:42
     * @param id
     * @return
     */
    public ExtWlZcNetworkAnalysisDTO findExtWlZcNetworkAnalysisByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象致诚社交关系网数据表
     * @date 2017-12-07 13:39:42
     * @param paramMap
     * @return
     */
    public int insertExtWlZcNetworkAnalysis(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象致诚社交关系网数据表
     * @date 2017-12-07 13:39:42
     * @param paramMap
     */
    public void updateExtWlZcNetworkAnalysis(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除致诚社交关系网数据表
     * @date 2017-12-07 13:39:42
     * @param ids
     * @return
     */ 
    public void deleteExtWlZcNetworkAnalysisByPrimaryKey(Map<String, Object> paramMap);
    
    
}
