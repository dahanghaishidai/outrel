package com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxcredoostock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxcredoostock.dto.ExtQhzxCredooStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtQhzxCredooStockDao
 * @description: 定义  好信度数据表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  dell
 */
@MyBatisRepository
public interface ExtQhzxCredooStockDao {
    
    /**
     * @author dell
     * @description: 分页查询好信度数据表
     * @date 2017-06-05 10:36:40
     * @param searchParams
     * @return
     */
    public List<ExtQhzxCredooStockDTO> searchExtQhzxCredooStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author dell
     * @description:查询对象好信度数据表
     * @date 2017-06-05 10:36:40
     * @param searchParams
     * @return
     */
    public List<ExtQhzxCredooStockDTO> searchExtQhzxCredooStock(Map<String,Object> searchParams);

    /**
     * @author dell
     * @description:查询对象好信度数据表
     * @date 2017-06-05 10:36:40
     * @param id
     * @return
     */
    public ExtQhzxCredooStockDTO findExtQhzxCredooStockByPrimaryKey(String id);
    
    /**
     * @author dell
     * @description: 新增对象好信度数据表
     * @date 2017-06-05 10:36:40
     * @param paramMap
     * @return
     */
    public int insertExtQhzxCredooStock(Map<String, Object> paramMap);
     
}
