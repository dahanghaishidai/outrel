package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompany.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompany.dto.ExtLawCompanyDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawCompanyDao
 * @description: 定义  汇法网企业信息主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawCompanyDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网企业信息主表
     * @date 2017-06-01 10:10:26
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyDTO> searchExtLawCompanyByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网企业信息主表
     * @date 2017-06-01 10:10:26
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyDTO> searchExtLawCompany(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网企业信息主表
     * @date 2017-06-01 10:10:26
     * @param id
     * @return
     */
    public ExtLawCompanyDTO findExtLawCompanyByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网企业信息主表
     * @date 2017-06-01 10:10:26
     * @param paramMap
     * @return
     */
    public int insertExtLawCompany(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网企业信息主表
     * @date 2017-06-01 10:10:26
     * @param paramMap
     */
    public void updateExtLawCompany(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网企业信息主表
     * @date 2017-06-01 10:10:26
     * @param ids
     * @return
     */ 
    public void deleteExtLawCompanyByPrimaryKey(Map<String, Object> paramMap);
    
    
}
