package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonalreport.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonalreport.dto.ExtWlShPersonalReportDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShPersonalReportDao
 * @description: 定义  算话人行征信报告主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShPersonalReportDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行征信报告主表
     * @date 2017-12-21 19:47:29
     * @param searchParams
     * @return
     */
    public List<ExtWlShPersonalReportDTO> searchExtWlShPersonalReportByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行征信报告主表
     * @date 2017-12-21 19:47:29
     * @param searchParams
     * @return
     */
    public List<ExtWlShPersonalReportDTO> searchExtWlShPersonalReport(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行征信报告主表
     * @date 2017-12-21 19:47:29
     * @param id
     * @return
     */
    public ExtWlShPersonalReportDTO findExtWlShPersonalReportByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行征信报告主表
     * @date 2017-12-21 19:47:29
     * @param paramMap
     * @return
     */
    public int insertExtWlShPersonalReport(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行征信报告主表
     * @date 2017-12-21 19:47:29
     * @param paramMap
     */
    public void updateExtWlShPersonalReport(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行征信报告主表
     * @date 2017-12-21 19:47:29
     * @param ids
     * @return
     */ 
    public void deleteExtWlShPersonalReportByPrimaryKey(Map<String, Object> paramMap);
    
    
}
