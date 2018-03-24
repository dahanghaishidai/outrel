package com.jy.modules.externalplatform.interfacerepository.br.extbrreportassessment.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.br.extbrreportassessment.dto.ExtBrReportAssessmentDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtBrReportAssessmentDao
 * @description: 定义  百融风险评估 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtBrReportAssessmentDao {
    
    /**
     * @author Administrator
     * @description: 分页查询百融风险评估
     * @date 2017-06-07 15:57:03
     * @param searchParams
     * @return
     */
    public List<ExtBrReportAssessmentDTO> searchExtBrReportAssessmentByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象百融风险评估
     * @date 2017-06-07 15:57:03
     * @param searchParams
     * @return
     */
    public List<ExtBrReportAssessmentDTO> searchExtBrReportAssessment(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象百融风险评估
     * @date 2017-06-07 15:57:03
     * @param id
     * @return
     */
    public ExtBrReportAssessmentDTO findExtBrReportAssessmentByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象百融风险评估
     * @date 2017-06-07 15:57:03
     * @param paramMap
     * @return
     */
    public int insertExtBrReportAssessment(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象百融风险评估
     * @date 2017-06-07 15:57:03
     * @param paramMap
     */
    public void updateExtBrReportAssessment(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除百融风险评估
     * @date 2017-06-07 15:57:03
     * @param ids
     * @return
     */ 
    public void deleteExtBrReportAssessmentByPrimaryKey(Map<String, Object> paramMap);
    
    
}
