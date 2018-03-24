package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawtrialprocedure.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawtrialprocedure.dto.ExtLawTrialProcedureDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawTrialProcedureDao
 * @description: 定义  汇法网企业审判流程公开表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawTrialProcedureDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网企业审判流程公开表
     * @date 2017-06-01 10:12:23
     * @param searchParams
     * @return
     */
    public List<ExtLawTrialProcedureDTO> searchExtLawTrialProcedureByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网企业审判流程公开表
     * @date 2017-06-01 10:12:23
     * @param searchParams
     * @return
     */
    public List<ExtLawTrialProcedureDTO> searchExtLawTrialProcedure(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网企业审判流程公开表
     * @date 2017-06-01 10:12:23
     * @param id
     * @return
     */
    public ExtLawTrialProcedureDTO findExtLawTrialProcedureByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网企业审判流程公开表
     * @date 2017-06-01 10:12:23
     * @param paramMap
     * @return
     */
    public int insertExtLawTrialProcedure(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网企业审判流程公开表
     * @date 2017-06-01 10:12:23
     * @param paramMap
     */
    public void updateExtLawTrialProcedure(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网企业审判流程公开表
     * @date 2017-06-01 10:12:23
     * @param ids
     * @return
     */ 
    public void deleteExtLawTrialProcedureByPrimaryKey(Map<String, Object> paramMap);
    
    
}
