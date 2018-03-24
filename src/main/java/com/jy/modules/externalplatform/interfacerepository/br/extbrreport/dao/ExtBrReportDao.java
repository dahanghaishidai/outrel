package com.jy.modules.externalplatform.interfacerepository.br.extbrreport.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.br.extbrreport.dto.ExtBrReportDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtBrReportDao
 * @description: 定义  百融个人评估表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtBrReportDao {
    
    /**
     * @author Administrator
     * @description: 分页查询百融个人评估表
     * @date 2017-06-07 15:56:28
     * @param searchParams
     * @return
     */
    public List<ExtBrReportDTO> searchExtBrReportByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象百融个人评估表
     * @date 2017-06-07 15:56:28
     * @param searchParams
     * @return
     */
    public List<ExtBrReportDTO> searchExtBrReport(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象百融个人评估表
     * @date 2017-06-07 15:56:28
     * @param id
     * @return
     */
    public ExtBrReportDTO findExtBrReportByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象百融个人评估表
     * @date 2017-06-07 15:56:28
     * @param paramMap
     * @return
     */
    public int insertExtBrReport(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象百融个人评估表
     * @date 2017-06-07 15:56:28
     * @param paramMap
     */
    public void updateExtBrReport(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除百融个人评估表
     * @date 2017-06-07 15:56:28
     * @param ids
     * @return
     */ 
    public void deleteExtBrReportByPrimaryKey(Map<String, Object> paramMap);
    
    
}
