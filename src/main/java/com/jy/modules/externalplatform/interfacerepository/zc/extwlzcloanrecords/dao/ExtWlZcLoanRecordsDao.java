package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcloanrecords.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcloanrecords.dto.ExtWlZcLoanRecordsDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZcLoanRecordsDao
 * @description: 定义  致诚借款记录历史表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZcLoanRecordsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询致诚借款记录历史表
     * @date 2017-12-07 13:40:21
     * @param searchParams
     * @return
     */
    public List<ExtWlZcLoanRecordsDTO> searchExtWlZcLoanRecordsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象致诚借款记录历史表
     * @date 2017-12-07 13:40:21
     * @param searchParams
     * @return
     */
    public List<ExtWlZcLoanRecordsDTO> searchExtWlZcLoanRecords(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象致诚借款记录历史表
     * @date 2017-12-07 13:40:21
     * @param id
     * @return
     */
    public ExtWlZcLoanRecordsDTO findExtWlZcLoanRecordsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象致诚借款记录历史表
     * @date 2017-12-07 13:40:21
     * @param paramMap
     * @return
     */
    public int insertExtWlZcLoanRecords(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象致诚借款记录历史表
     * @date 2017-12-07 13:40:21
     * @param paramMap
     */
    public void updateExtWlZcLoanRecords(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除致诚借款记录历史表
     * @date 2017-12-07 13:40:21
     * @param ids
     * @return
     */ 
    public void deleteExtWlZcLoanRecordsByPrimaryKey(Map<String, Object> paramMap);

    public void batchInsertLoanRecords(Map<String, Object> paramMap);
    
    
}
