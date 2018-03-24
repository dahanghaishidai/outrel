package com.jy.modules.externalplatform.interfacerepository.suanhua.extshperreportstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperreportstock.dto.ExtShPerReportStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtShPerReportStockDao
 * @description: 定义  人行征信报告主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtShPerReportStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询人行征信报告主表
     * @date 2017-06-12 14:55:15
     * @param searchParams
     * @return
     */
    public List<ExtShPerReportStockDTO> searchExtShPerReportStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象人行征信报告主表
     * @date 2017-06-12 14:55:15
     * @param searchParams
     * @return
     */
    public List<ExtShPerReportStockDTO> searchExtShPerReportStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象人行征信报告主表
     * @date 2017-06-12 14:55:15
     * @param id
     * @return
     */
    public ExtShPerReportStockDTO findExtShPerReportStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象人行征信报告主表
     * @date 2017-06-12 14:55:15
     * @param paramMap
     * @return
     */
    public int insertExtShPerReportStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象人行征信报告主表
     * @date 2017-06-12 14:55:15
     * @param paramMap
     */
    public void updateExtShPerReportStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除人行征信报告主表
     * @date 2017-06-12 14:55:15
     * @param ids
     * @return
     */ 
    public void deleteExtShPerReportStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
