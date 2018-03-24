package com.jy.modules.externalplatform.interfacerepository.zzc.extwlzzcblackresult.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zzc.extwlzzcblackresult.dto.ExtWlZzcBlackResultDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZzcBlackResultDao
 * @description: 定义  中智诚_黑名单查询表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZzcBlackResultDao {
    
    /**
     * @author Administrator
     * @description: 分页查询中智诚_黑名单查询表
     * @date 2017-12-18 11:09:25
     * @param searchParams
     * @return
     */
    public List<ExtWlZzcBlackResultDTO> searchExtWlZzcBlackResultByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象中智诚_黑名单查询表
     * @date 2017-12-18 11:09:25
     * @param searchParams
     * @return
     */
    public List<ExtWlZzcBlackResultDTO> searchExtWlZzcBlackResult(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象中智诚_黑名单查询表
     * @date 2017-12-18 11:09:25
     * @param id
     * @return
     */
    public ExtWlZzcBlackResultDTO findExtWlZzcBlackResultByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象中智诚_黑名单查询表
     * @date 2017-12-18 11:09:25
     * @param paramMap
     * @return
     */
    public int insertExtWlZzcBlackResult(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象中智诚_黑名单查询表
     * @date 2017-12-18 11:09:25
     * @param paramMap
     */
    public void updateExtWlZzcBlackResult(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除中智诚_黑名单查询表
     * @date 2017-12-18 11:09:25
     * @param ids
     * @return
     */ 
    public void deleteExtWlZzcBlackResultByPrimaryKey(Map<String, Object> paramMap);
    
    
}
