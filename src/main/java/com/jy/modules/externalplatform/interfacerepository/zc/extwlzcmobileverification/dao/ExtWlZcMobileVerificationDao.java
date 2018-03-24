package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmobileverification.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcmobileverification.dto.ExtWlZcMobileVerificationDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZcMobileVerificationDao
 * @description: 定义  致诚手机验证结果表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZcMobileVerificationDao {
    
    /**
     * @author Administrator
     * @description: 分页查询致诚手机验证结果表
     * @date 2017-12-07 13:39:50
     * @param searchParams
     * @return
     */
    public List<ExtWlZcMobileVerificationDTO> searchExtWlZcMobileVerificationByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象致诚手机验证结果表
     * @date 2017-12-07 13:39:50
     * @param searchParams
     * @return
     */
    public List<ExtWlZcMobileVerificationDTO> searchExtWlZcMobileVerification(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象致诚手机验证结果表
     * @date 2017-12-07 13:39:50
     * @param id
     * @return
     */
    public ExtWlZcMobileVerificationDTO findExtWlZcMobileVerificationByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象致诚手机验证结果表
     * @date 2017-12-07 13:39:50
     * @param paramMap
     * @return
     */
    public int insertExtWlZcMobileVerification(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象致诚手机验证结果表
     * @date 2017-12-07 13:39:50
     * @param paramMap
     */
    public void updateExtWlZcMobileVerification(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除致诚手机验证结果表
     * @date 2017-12-07 13:39:50
     * @param ids
     * @return
     */ 
    public void deleteExtWlZcMobileVerificationByPrimaryKey(Map<String, Object> paramMap);

    public void batchInsertVerification(Map<String, Object> paramMap);
    
    
}
