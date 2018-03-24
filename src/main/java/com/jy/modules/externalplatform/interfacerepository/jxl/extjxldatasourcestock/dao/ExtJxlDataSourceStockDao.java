package com.jy.modules.externalplatform.interfacerepository.jxl.extjxldatasourcestock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldatasourcestock.dto.ExtJxlDataSourceStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlDataSourceStockDao
 * @description: 定义  绑定数据源信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlDataSourceStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询绑定数据源信息
     * @date 2017-06-01 16:25:17
     * @param searchParams
     * @return
     */
    public List<ExtJxlDataSourceStockDTO> searchExtJxlDataSourceStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象绑定数据源信息
     * @date 2017-06-01 16:25:17
     * @param searchParams
     * @return
     */
    public List<ExtJxlDataSourceStockDTO> searchExtJxlDataSourceStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象绑定数据源信息
     * @date 2017-06-01 16:25:17
     * @param id
     * @return
     */
    public ExtJxlDataSourceStockDTO findExtJxlDataSourceStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象绑定数据源信息
     * @date 2017-06-01 16:25:17
     * @param paramMap
     * @return
     */
    public int insertExtJxlDataSourceStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象绑定数据源信息
     * @date 2017-06-01 16:25:17
     * @param paramMap
     */
    public void updateExtJxlDataSourceStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除绑定数据源信息
     * @date 2017-06-01 16:25:17
     * @param ids
     * @return
     */ 
    public void deleteExtJxlDataSourceStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
