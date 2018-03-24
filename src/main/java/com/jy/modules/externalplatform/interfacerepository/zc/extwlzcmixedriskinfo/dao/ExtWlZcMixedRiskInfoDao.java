package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmixedriskinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmixedriskinfo.dto.ExtWlZcMixedRiskInfoDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZcMixedRiskInfoDao
 * @description: 定义  致诚查询反欺诈信息主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZcMixedRiskInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询致诚查询反欺诈信息主表
     * @date 2017-12-07 13:39:29
     * @param searchParams
     * @return
     */
    public List<ExtWlZcMixedRiskInfoDTO> searchExtWlZcMixedRiskInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象致诚查询反欺诈信息主表
     * @date 2017-12-07 13:39:29
     * @param searchParams
     * @return
     */
    public List<ExtWlZcMixedRiskInfoDTO> searchExtWlZcMixedRiskInfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象致诚查询反欺诈信息主表
     * @date 2017-12-07 13:39:29
     * @param id
     * @return
     */
    public ExtWlZcMixedRiskInfoDTO findExtWlZcMixedRiskInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象致诚查询反欺诈信息主表
     * @date 2017-12-07 13:39:29
     * @param paramMap
     * @return
     */
    public int insertExtWlZcMixedRiskInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象致诚查询反欺诈信息主表
     * @date 2017-12-07 13:39:29
     * @param paramMap
     */
    public void updateExtWlZcMixedRiskInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除致诚查询反欺诈信息主表
     * @date 2017-12-07 13:39:29
     * @param ids
     * @return
     */ 
    public void deleteExtWlZcMixedRiskInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
