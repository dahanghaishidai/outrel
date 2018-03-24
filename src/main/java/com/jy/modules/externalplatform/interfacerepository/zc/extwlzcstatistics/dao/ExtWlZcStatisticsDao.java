package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcstatistics.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcstatistics.dto.ExtWlZcStatisticsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZcStatisticsDao
 * @description: 定义  致诚统计次数表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZcStatisticsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询致诚统计次数表
     * @date 2017-12-07 13:40:09
     * @param searchParams
     * @return
     */
    public List<ExtWlZcStatisticsDTO> searchExtWlZcStatisticsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象致诚统计次数表
     * @date 2017-12-07 13:40:09
     * @param searchParams
     * @return
     */
    public List<ExtWlZcStatisticsDTO> searchExtWlZcStatistics(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象致诚统计次数表
     * @date 2017-12-07 13:40:09
     * @param id
     * @return
     */
    public ExtWlZcStatisticsDTO findExtWlZcStatisticsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象致诚统计次数表
     * @date 2017-12-07 13:40:09
     * @param paramMap
     * @return
     */
    public int insertExtWlZcStatistics(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象致诚统计次数表
     * @date 2017-12-07 13:40:09
     * @param paramMap
     */
    public void updateExtWlZcStatistics(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除致诚统计次数表
     * @date 2017-12-07 13:40:09
     * @param ids
     * @return
     */ 
    public void deleteExtWlZcStatisticsByPrimaryKey(Map<String, Object> paramMap);
    
    
}
