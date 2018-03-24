package com.jy.modules.externalplatform.interfacerepository.pa.extwlpainfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.pa.extwlpainfo.dto.ExtWlPaInfoDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlPaInfoDao
 * @description: 定义  凭安信用主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlPaInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询凭安信用主表
     * @date 2018-01-08 10:55:15
     * @param searchParams
     * @return
     */
    public List<ExtWlPaInfoDTO> searchExtWlPaInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象凭安信用主表
     * @date 2018-01-08 10:55:15
     * @param searchParams
     * @return
     */
    public List<ExtWlPaInfoDTO> searchExtWlPaInfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象凭安信用主表
     * @date 2018-01-08 10:55:15
     * @param id
     * @return
     */
    public ExtWlPaInfoDTO findExtWlPaInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象凭安信用主表
     * @date 2018-01-08 10:55:15
     * @param paramMap
     * @return
     */
    public int insertExtWlPaInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象凭安信用主表
     * @date 2018-01-08 10:55:15
     * @param paramMap
     */
    public void updateExtWlPaInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除凭安信用主表
     * @date 2018-01-08 10:55:15
     * @param ids
     * @return
     */ 
    public void deleteExtWlPaInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
