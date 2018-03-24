package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcheckinfostock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcheckinfostock.dto.ExtJxlCheckInfoStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlCheckInfoStockDao
 * @description: 定义  数据检查信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlCheckInfoStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询数据检查信息
     * @date 2017-06-01 16:24:19
     * @param searchParams
     * @return
     */
    public List<ExtJxlCheckInfoStockDTO> searchExtJxlCheckInfoStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象数据检查信息
     * @date 2017-06-01 16:24:19
     * @param searchParams
     * @return
     */
    public List<ExtJxlCheckInfoStockDTO> searchExtJxlCheckInfoStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象数据检查信息
     * @date 2017-06-01 16:24:19
     * @param id
     * @return
     */
    public ExtJxlCheckInfoStockDTO findExtJxlCheckInfoStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象数据检查信息
     * @date 2017-06-01 16:24:19
     * @param paramMap
     * @return
     */
    public int insertExtJxlCheckInfoStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象数据检查信息
     * @date 2017-06-01 16:24:19
     * @param paramMap
     */
    public void updateExtJxlCheckInfoStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除数据检查信息
     * @date 2017-06-01 16:24:19
     * @param ids
     * @return
     */ 
    public void deleteExtJxlCheckInfoStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
