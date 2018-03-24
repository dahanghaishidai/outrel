package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersondishonesty.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersondishonesty.dto.ExtLawPersonDishonestyDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawPersonDishonestyDao
 * @description: 定义  汇法网个人失信信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawPersonDishonestyDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网个人失信信息表
     * @date 2017-05-31 11:11:04
     * @param searchParams
     * @return
     */
    public List<ExtLawPersonDishonestyDTO> searchExtLawPersonDishonestyByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网个人失信信息表
     * @date 2017-05-31 11:11:04
     * @param searchParams
     * @return
     */
    public List<ExtLawPersonDishonestyDTO> searchExtLawPersonDishonesty(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网个人失信信息表
     * @date 2017-05-31 11:11:04
     * @param id
     * @return
     */
    public ExtLawPersonDishonestyDTO findExtLawPersonDishonestyByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网个人失信信息表
     * @date 2017-05-31 11:11:04
     * @param paramMap
     * @return
     */
    public int insertExtLawPersonDishonesty(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网个人失信信息表
     * @date 2017-05-31 11:11:04
     * @param paramMap
     */
    public void updateExtLawPersonDishonesty(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网个人失信信息表
     * @date 2017-05-31 11:11:04
     * @param ids
     * @return
     */ 
    public void deleteExtLawPersonDishonestyByPrimaryKey(Map<String, Object> paramMap);
    
    
}
