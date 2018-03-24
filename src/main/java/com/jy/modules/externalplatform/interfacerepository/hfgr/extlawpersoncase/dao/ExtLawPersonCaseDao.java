package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncase.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncase.dto.ExtLawPersonCaseDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawPersonCaseDao
 * @description: 定义  汇法网个人案例信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawPersonCaseDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网个人案例信息表
     * @date 2017-05-31 11:10:01
     * @param searchParams
     * @return
     */
    public List<ExtLawPersonCaseDTO> searchExtLawPersonCaseByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网个人案例信息表
     * @date 2017-05-31 11:10:01
     * @param searchParams
     * @return
     */
    public List<ExtLawPersonCaseDTO> searchExtLawPersonCase(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网个人案例信息表
     * @date 2017-05-31 11:10:01
     * @param id
     * @return
     */
    public ExtLawPersonCaseDTO findExtLawPersonCaseByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网个人案例信息表
     * @date 2017-05-31 11:10:01
     * @param paramMap
     * @return
     */
    public int insertExtLawPersonCase(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网个人案例信息表
     * @date 2017-05-31 11:10:01
     * @param paramMap
     */
    public void updateExtLawPersonCase(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网个人案例信息表
     * @date 2017-05-31 11:10:01
     * @param ids
     * @return
     */ 
    public void deleteExtLawPersonCaseByPrimaryKey(Map<String, Object> paramMap);
    
    
}
