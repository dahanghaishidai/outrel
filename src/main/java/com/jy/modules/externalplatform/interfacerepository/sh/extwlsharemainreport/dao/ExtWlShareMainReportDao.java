package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharemainreport.dto.ExtWlShareMainReportDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShareMainReportDao
 * @description: 定义  算话共享报告_主表信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShareMainReportDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_主表信息
     * @date 2017-12-07 19:52:37
     * @param searchParams
     * @return
     */
    public List<ExtWlShareMainReportDTO> searchExtWlShareMainReportByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_主表信息
     * @date 2017-12-07 19:52:37
     * @param searchParams
     * @return
     */
    public List<ExtWlShareMainReportDTO> searchExtWlShareMainReport(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_主表信息
     * @date 2017-12-07 19:52:37
     * @param id
     * @return
     */
    public ExtWlShareMainReportDTO findExtWlShareMainReportByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_主表信息
     * @date 2017-12-07 19:52:37
     * @param paramMap
     * @return
     */
    public int insertExtWlShareMainReport(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_主表信息
     * @date 2017-12-07 19:52:37
     * @param paramMap
     */
    public void updateExtWlShareMainReport(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_主表信息
     * @date 2017-12-07 19:52:37
     * @param ids
     * @return
     */ 
    public void deleteExtWlShareMainReportByPrimaryKey(Map<String, Object> paramMap);
    
    
}
