package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcheckresult.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcheckresult.dto.ExtWlZxtCheckResultDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZxtCheckResultDao
 * @description: 定义  核身问答信息验证结果表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZxtCheckResultDao {
    
    /**
     * @author Administrator
     * @description: 分页查询核身问答信息验证结果表
     * @date 2017-12-12 20:13:10
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtCheckResultDTO> searchExtWlZxtCheckResultByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象核身问答信息验证结果表
     * @date 2017-12-12 20:13:10
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtCheckResultDTO> searchExtWlZxtCheckResult(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象核身问答信息验证结果表
     * @date 2017-12-12 20:13:10
     * @param id
     * @return
     */
    public ExtWlZxtCheckResultDTO findExtWlZxtCheckResultByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象核身问答信息验证结果表
     * @date 2017-12-12 20:13:10
     * @param paramMap
     * @return
     */
    public int insertExtWlZxtCheckResult(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象核身问答信息验证结果表
     * @date 2017-12-12 20:13:10
     * @param paramMap
     */
    public void updateExtWlZxtCheckResult(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除核身问答信息验证结果表
     * @date 2017-12-12 20:13:10
     * @param ids
     * @return
     */ 
    public void deleteExtWlZxtCheckResultByPrimaryKey(Map<String, Object> paramMap);
    
    
}
