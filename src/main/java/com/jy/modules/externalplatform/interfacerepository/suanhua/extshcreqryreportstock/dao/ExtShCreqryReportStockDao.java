package com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryreportstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryreportstock.dto.ExtShCreqryReportStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtShCreqryReportStockDao
 * @description: 定义  算话征信贷款信息查询报告 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtShCreqryReportStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话征信贷款信息查询报告
     * @date 2017-06-09 10:01:20
     * @param searchParams
     * @return
     */
    public List<ExtShCreqryReportStockDTO> searchExtShCreqryReportStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话征信贷款信息查询报告
     * @date 2017-06-09 10:01:20
     * @param searchParams
     * @return
     */
    public List<ExtShCreqryReportStockDTO> searchExtShCreqryReportStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话征信贷款信息查询报告
     * @date 2017-06-09 10:01:20
     * @param id
     * @return
     */
    public ExtShCreqryReportStockDTO findExtShCreqryReportStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话征信贷款信息查询报告
     * @date 2017-06-09 10:01:20
     * @param paramMap
     * @return
     */
    public int insertExtShCreqryReportStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话征信贷款信息查询报告
     * @date 2017-06-09 10:01:20
     * @param paramMap
     */
    public void updateExtShCreqryReportStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话征信贷款信息查询报告
     * @date 2017-06-09 10:01:20
     * @param ids
     * @return
     */ 
    public void deleteExtShCreqryReportStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
