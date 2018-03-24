package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryhistory.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryhistory.dto.ExtWlZcQueryHistoryDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZcQueryHistoryDao
 * @description: 定义  致诚查询历史表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZcQueryHistoryDao {
    
    /**
     * @author Administrator
     * @description: 分页查询致诚查询历史表
     * @date 2017-12-07 13:40:15
     * @param searchParams
     * @return
     */
    public List<ExtWlZcQueryHistoryDTO> searchExtWlZcQueryHistoryByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象致诚查询历史表
     * @date 2017-12-07 13:40:15
     * @param searchParams
     * @return
     */
    public List<ExtWlZcQueryHistoryDTO> searchExtWlZcQueryHistory(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象致诚查询历史表
     * @date 2017-12-07 13:40:15
     * @param id
     * @return
     */
    public ExtWlZcQueryHistoryDTO findExtWlZcQueryHistoryByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象致诚查询历史表
     * @date 2017-12-07 13:40:15
     * @param paramMap
     * @return
     */
    public int insertExtWlZcQueryHistory(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象致诚查询历史表
     * @date 2017-12-07 13:40:15
     * @param paramMap
     */
    public void updateExtWlZcQueryHistory(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除致诚查询历史表
     * @date 2017-12-07 13:40:15
     * @param ids
     * @return
     */ 
    public void deleteExtWlZcQueryHistoryByPrimaryKey(Map<String, Object> paramMap);

    public void batchInsertHistory(Map<String, Object> paramMap);
    
    
}
