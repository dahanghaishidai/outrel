package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtsearch.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtsearch.dto.ExtWlZxtSearchDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZxtSearchDao
 * @description: 定义  增信通信贷信息搜索主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZxtSearchDao {
    
    /**
     * @author Administrator
     * @description: 分页查询增信通信贷信息搜索主表
     * @date 2017-12-14 19:05:48
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtSearchDTO> searchExtWlZxtSearchByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象增信通信贷信息搜索主表
     * @date 2017-12-14 19:05:48
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtSearchDTO> searchExtWlZxtSearch(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象增信通信贷信息搜索主表
     * @date 2017-12-14 19:05:48
     * @param id
     * @return
     */
    public ExtWlZxtSearchDTO findExtWlZxtSearchByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象增信通信贷信息搜索主表
     * @date 2017-12-14 19:05:48
     * @param paramMap
     * @return
     */
    public int insertExtWlZxtSearch(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象增信通信贷信息搜索主表
     * @date 2017-12-14 19:05:48
     * @param paramMap
     */
    public void updateExtWlZxtSearch(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除增信通信贷信息搜索主表
     * @date 2017-12-14 19:05:48
     * @param ids
     * @return
     */ 
    public void deleteExtWlZxtSearchByPrimaryKey(Map<String, Object> paramMap);
    
    
}
