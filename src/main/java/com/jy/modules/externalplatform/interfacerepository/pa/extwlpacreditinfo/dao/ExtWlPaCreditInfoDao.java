package com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.pa.extwlpacreditinfo.dto.ExtWlPaCreditInfoDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlPaCreditInfoDao
 * @description: 定义  凭安信用信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlPaCreditInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询凭安信用信息表
     * @date 2018-01-08 10:55:24
     * @param searchParams
     * @return
     */
    public List<ExtWlPaCreditInfoDTO> searchExtWlPaCreditInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象凭安信用信息表
     * @date 2018-01-08 10:55:24
     * @param searchParams
     * @return
     */
    public List<ExtWlPaCreditInfoDTO> searchExtWlPaCreditInfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象凭安信用信息表
     * @date 2018-01-08 10:55:24
     * @param id
     * @return
     */
    public ExtWlPaCreditInfoDTO findExtWlPaCreditInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象凭安信用信息表
     * @date 2018-01-08 10:55:24
     * @param paramMap
     * @return
     */
    public int insertExtWlPaCreditInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象凭安信用信息表
     * @date 2018-01-08 10:55:24
     * @param paramMap
     */
    public void updateExtWlPaCreditInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除凭安信用信息表
     * @date 2018-01-08 10:55:24
     * @param ids
     * @return
     */ 
    public void deleteExtWlPaCreditInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
