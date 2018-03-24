package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycase.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycase.dto.ExtLawCompanyCaseDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawCompanyCaseDao
 * @description: 定义  汇法网企业案例信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawCompanyCaseDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网企业案例信息表
     * @date 2017-06-01 10:10:52
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyCaseDTO> searchExtLawCompanyCaseByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网企业案例信息表
     * @date 2017-06-01 10:10:52
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyCaseDTO> searchExtLawCompanyCase(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网企业案例信息表
     * @date 2017-06-01 10:10:52
     * @param id
     * @return
     */
    public ExtLawCompanyCaseDTO findExtLawCompanyCaseByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网企业案例信息表
     * @date 2017-06-01 10:10:52
     * @param paramMap
     * @return
     */
    public int insertExtLawCompanyCase(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网企业案例信息表
     * @date 2017-06-01 10:10:52
     * @param paramMap
     */
    public void updateExtLawCompanyCase(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网企业案例信息表
     * @date 2017-06-01 10:10:52
     * @param ids
     * @return
     */ 
    public void deleteExtLawCompanyCaseByPrimaryKey(Map<String, Object> paramMap);
    
    
}
