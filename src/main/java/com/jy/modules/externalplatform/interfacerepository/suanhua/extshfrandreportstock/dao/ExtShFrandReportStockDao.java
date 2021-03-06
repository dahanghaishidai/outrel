package com.jy.modules.externalplatform.interfacerepository.suanhua.extshfrandreportstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshfrandreportstock.dto.ExtShFrandReportStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtShFrandReportStockDao
 * @description: 定义  算话反欺诈报告 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  dell
 */
@MyBatisRepository
public interface ExtShFrandReportStockDao {
    
    /**
     * @author dell
     * @description: 分页查询算话反欺诈报告
     * @date 2017-06-12 11:31:37
     * @param searchParams
     * @return
     */
    public List<ExtShFrandReportStockDTO> searchExtShFrandReportStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author dell
     * @description:查询对象算话反欺诈报告
     * @date 2017-06-12 11:31:37
     * @param searchParams
     * @return
     */
    public List<ExtShFrandReportStockDTO> searchExtShFrandReportStock(Map<String,Object> searchParams);

    /**
     * @author dell
     * @description:查询对象算话反欺诈报告
     * @date 2017-06-12 11:31:37
     * @param id
     * @return
     */
    public ExtShFrandReportStockDTO findExtShFrandReportStockByPrimaryKey(String id);
    
    /**
     * @author dell
     * @description: 新增对象算话反欺诈报告
     * @date 2017-06-12 11:31:37
     * @param paramMap
     * @return
     */
    public int insertExtShFrandReportStock(Map<String, Object> paramMap);
    
    /**
     * @author dell
     * @description: 更新对象算话反欺诈报告
     * @date 2017-06-12 11:31:37
     * @param paramMap
     */
    public void updateExtShFrandReportStock(Map<String, Object> paramMap);
     
    /**
     * @author dell
     * @description: 按主键删除算话反欺诈报告
     * @date 2017-06-12 11:31:37
     * @param ids
     * @return
     */ 
    public void deleteExtShFrandReportStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
