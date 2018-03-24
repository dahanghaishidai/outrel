package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcqueryinfo.dto.ExtWlZcqueryInfoDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZcqueryInfoDao
 * @description: 定义  致诚查询贷款信息主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZcqueryInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询致诚查询贷款信息主表
     * @date 2017-12-07 13:40:03
     * @param searchParams
     * @return
     */
    public List<ExtWlZcqueryInfoDTO> searchExtWlZcqueryInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象致诚查询贷款信息主表
     * @date 2017-12-07 13:40:03
     * @param searchParams
     * @return
     */
    public List<ExtWlZcqueryInfoDTO> searchExtWlZcqueryInfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象致诚查询贷款信息主表
     * @date 2017-12-07 13:40:03
     * @param id
     * @return
     */
    public ExtWlZcqueryInfoDTO findExtWlZcqueryInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象致诚查询贷款信息主表
     * @date 2017-12-07 13:40:03
     * @param paramMap
     * @return
     */
    public int insertExtWlZcqueryInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象致诚查询贷款信息主表
     * @date 2017-12-07 13:40:03
     * @param paramMap
     */
    public void updateExtWlZcqueryInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除致诚查询贷款信息主表
     * @date 2017-12-07 13:40:03
     * @param ids
     * @return
     */ 
    public void deleteExtWlZcqueryInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
