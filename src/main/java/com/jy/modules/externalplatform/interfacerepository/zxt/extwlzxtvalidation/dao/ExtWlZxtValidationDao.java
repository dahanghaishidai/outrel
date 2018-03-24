package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtvalidation.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtvalidation.dto.ExtWlZxtValidationDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZxtValidationDao
 * @description: 定义  核身问答信息获取主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZxtValidationDao {
    
    /**
     * @author Administrator
     * @description: 分页查询核身问答信息获取主表
     * @date 2017-12-12 20:13:53
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtValidationDTO> searchExtWlZxtValidationByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象核身问答信息获取主表
     * @date 2017-12-12 20:13:53
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtValidationDTO> searchExtWlZxtValidation(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象核身问答信息获取主表
     * @date 2017-12-12 20:13:53
     * @param id
     * @return
     */
    public ExtWlZxtValidationDTO findExtWlZxtValidationByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象核身问答信息获取主表
     * @date 2017-12-12 20:13:53
     * @param paramMap
     * @return
     */
    public int insertExtWlZxtValidation(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象核身问答信息获取主表
     * @date 2017-12-12 20:13:53
     * @param paramMap
     */
    public void updateExtWlZxtValidation(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除核身问答信息获取主表
     * @date 2017-12-12 20:13:53
     * @param ids
     * @return
     */ 
    public void deleteExtWlZxtValidationByPrimaryKey(Map<String, Object> paramMap);
    
    
}
