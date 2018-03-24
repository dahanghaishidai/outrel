package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlsummary.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlsummary.dto.ExtJxlSummaryDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlSummaryDao
 * @description: 定义  聚信立央行征信报告（汇总信息表） 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  dell
 */
@MyBatisRepository
public interface ExtJxlSummaryDao {
    
    /**
     * @author dell
     * @description:查询对象聚信立央行征信报告（汇总信息表）
     * @date 2017-08-24 21:00:37
     * @param searchParams
     * @return
     */
    public List<ExtJxlSummaryDTO> searchExtJxlSummary(Map<String,Object> searchParams);

    
    /**
     * @author dell
     * @description: 批量新增对象聚信立央行征信报告（汇总信息表）
     * @date 2017-08-24 21:00:37
     * @param paramMap
     * @return
     */
    public int insertExtJxlSummaryList(Map<String, Object> paramMap);
    
    
}
