package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmcreditanalysis.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmcreditanalysis.dto.ExtWlSmCreditAnalysisDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlSmCreditAnalysisDao
 * @description: 定义  数美文本信用分析服务 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlSmCreditAnalysisDao {
    
    /**
     * @author Administrator
     * @description: 分页查询数美文本信用分析服务
     * @date 2017-12-19 16:27:15
     * @param searchParams
     * @return
     */
    public List<ExtWlSmCreditAnalysisDTO> searchExtWlSmCreditAnalysisByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象数美文本信用分析服务
     * @date 2017-12-19 16:27:15
     * @param searchParams
     * @return
     */
    public List<ExtWlSmCreditAnalysisDTO> searchExtWlSmCreditAnalysis(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象数美文本信用分析服务
     * @date 2017-12-19 16:27:15
     * @param id
     * @return
     */
    public ExtWlSmCreditAnalysisDTO findExtWlSmCreditAnalysisByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象数美文本信用分析服务
     * @date 2017-12-19 16:27:15
     * @param paramMap
     * @return
     */
    public int insertExtWlSmCreditAnalysis(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象数美文本信用分析服务
     * @date 2017-12-19 16:27:15
     * @param paramMap
     */
    public void updateExtWlSmCreditAnalysis(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除数美文本信用分析服务
     * @date 2017-12-19 16:27:15
     * @param ids
     * @return
     */ 
    public void deleteExtWlSmCreditAnalysisByPrimaryKey(Map<String, Object> paramMap);
    
    
}
