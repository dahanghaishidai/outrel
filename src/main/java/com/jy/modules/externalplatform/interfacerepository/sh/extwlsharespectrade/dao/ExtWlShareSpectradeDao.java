package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharespectrade.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharespectrade.dto.ExtWlShareSpectradeDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShareSpectradeDao
 * @description: 定义  算话共享报告_异常交易信息列表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShareSpectradeDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_异常交易信息列表
     * @date 2017-12-07 19:53:42
     * @param searchParams
     * @return
     */
    public List<ExtWlShareSpectradeDTO> searchExtWlShareSpectradeByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_异常交易信息列表
     * @date 2017-12-07 19:53:42
     * @param searchParams
     * @return
     */
    public List<ExtWlShareSpectradeDTO> searchExtWlShareSpectrade(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_异常交易信息列表
     * @date 2017-12-07 19:53:42
     * @param id
     * @return
     */
    public ExtWlShareSpectradeDTO findExtWlShareSpectradeByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_异常交易信息列表
     * @date 2017-12-07 19:53:42
     * @param paramMap
     * @return
     */
    public int insertExtWlShareSpectrade(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_异常交易信息列表
     * @date 2017-12-07 19:53:42
     * @param paramMap
     */
    public void updateExtWlShareSpectrade(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_异常交易信息列表
     * @date 2017-12-07 19:53:42
     * @param ids
     * @return
     */ 
    public void deleteExtWlShareSpectradeByPrimaryKey(Map<String, Object> paramMap);

    public int insertExtWlShareSpectradeList(Map<String, Object> paramMap);
    
    
}
