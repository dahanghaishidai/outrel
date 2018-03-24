package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonexe.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonexe.dto.ExtLawPersonExeDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawPersonExeDao
 * @description: 定义  汇法网个人执行信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawPersonExeDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网个人执行信息表
     * @date 2017-05-31 11:10:35
     * @param searchParams
     * @return
     */
    public List<ExtLawPersonExeDTO> searchExtLawPersonExeByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网个人执行信息表
     * @date 2017-05-31 11:10:35
     * @param searchParams
     * @return
     */
    public List<ExtLawPersonExeDTO> searchExtLawPersonExe(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网个人执行信息表
     * @date 2017-05-31 11:10:35
     * @param id
     * @return
     */
    public ExtLawPersonExeDTO findExtLawPersonExeByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网个人执行信息表
     * @date 2017-05-31 11:10:35
     * @param paramMap
     * @return
     */
    public int insertExtLawPersonExe(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网个人执行信息表
     * @date 2017-05-31 11:10:35
     * @param paramMap
     */
    public void updateExtLawPersonExe(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网个人执行信息表
     * @date 2017-05-31 11:10:35
     * @param ids
     * @return
     */ 
    public void deleteExtLawPersonExeByPrimaryKey(Map<String, Object> paramMap);
    
    
}
