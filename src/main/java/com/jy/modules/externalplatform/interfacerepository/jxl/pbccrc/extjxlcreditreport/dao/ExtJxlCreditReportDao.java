package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditreport.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditreport.dto.ExtJxlCreditReportDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlCreditReportDao
 * @description: 定义  聚信立央行征信报告 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  dell
 */
@MyBatisRepository
public interface ExtJxlCreditReportDao {
    
    
    /**
     * @author dell
     * @description:查询对象聚信立央行征信报告
     * @date 2017-08-24 20:48:31
     * @param searchParams
     * @return
     */
    public List<ExtJxlCreditReportDTO> searchExtJxlCreditReport(Map<String,Object> searchParams);
    
    /**
     * @author dell
     * @description: 新增对象聚信立央行征信报告
     * @date 2017-08-24 20:48:31
     * @param paramMap
     * @return
     */
    public int insertExtJxlCreditReport(Map<String, Object> paramMap);
    
    /**
     * 更新对象聚信立央行征信报告
     * @param paramMap
     */
    public void updateExtJxlCreditReport(Map<String, Object> paramMap);
    
}
