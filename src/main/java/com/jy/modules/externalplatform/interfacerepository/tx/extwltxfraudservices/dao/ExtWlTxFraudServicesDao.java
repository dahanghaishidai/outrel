package com.jy.modules.externalplatform.interfacerepository.tx.extwltxfraudservices.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.tx.extwltxfraudservices.dto.ExtWlTxFraudServicesDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlTxFraudServicesDao
 * @description: 定义  腾讯_反欺诈服务(主表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlTxFraudServicesDao {
    
    /**
     * @author Administrator
     * @description: 分页查询腾讯_反欺诈服务(主表)
     * @date 2017-12-18 15:22:08
     * @param searchParams
     * @return
     */
    public List<ExtWlTxFraudServicesDTO> searchExtWlTxFraudServicesByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象腾讯_反欺诈服务(主表)
     * @date 2017-12-18 15:22:08
     * @param searchParams
     * @return
     */
    public List<ExtWlTxFraudServicesDTO> searchExtWlTxFraudServices(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象腾讯_反欺诈服务(主表)
     * @date 2017-12-18 15:22:08
     * @param id
     * @return
     */
    public ExtWlTxFraudServicesDTO findExtWlTxFraudServicesByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象腾讯_反欺诈服务(主表)
     * @date 2017-12-18 15:22:08
     * @param paramMap
     * @return
     */
    public int insertExtWlTxFraudServices(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象腾讯_反欺诈服务(主表)
     * @date 2017-12-18 15:22:08
     * @param paramMap
     */
    public void updateExtWlTxFraudServices(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除腾讯_反欺诈服务(主表)
     * @date 2017-12-18 15:22:08
     * @param ids
     * @return
     */ 
    public void deleteExtWlTxFraudServicesByPrimaryKey(Map<String, Object> paramMap);
    
    
}
