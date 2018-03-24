package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanytax.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanytax.dto.ExtLawCompanyTaxDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawCompanyTaxDao
 * @description: 定义  汇法网企业税务信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawCompanyTaxDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网企业税务信息表
     * @date 2017-06-01 10:11:13
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyTaxDTO> searchExtLawCompanyTaxByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网企业税务信息表
     * @date 2017-06-01 10:11:13
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyTaxDTO> searchExtLawCompanyTax(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网企业税务信息表
     * @date 2017-06-01 10:11:13
     * @param id
     * @return
     */
    public ExtLawCompanyTaxDTO findExtLawCompanyTaxByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网企业税务信息表
     * @date 2017-06-01 10:11:13
     * @param paramMap
     * @return
     */
    public int insertExtLawCompanyTax(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网企业税务信息表
     * @date 2017-06-01 10:11:13
     * @param paramMap
     */
    public void updateExtLawCompanyTax(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网企业税务信息表
     * @date 2017-06-01 10:11:13
     * @param ids
     * @return
     */ 
    public void deleteExtLawCompanyTaxByPrimaryKey(Map<String, Object> paramMap);
    
    
}
