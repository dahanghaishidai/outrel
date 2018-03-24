package com.jy.modules.externalplatform.interfacerepository.jxl.extjxltripinfostock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxltripinfostock.dto.ExtJxlTripInfoStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlTripInfoStockDao
 * @description: 定义  出行分析表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlTripInfoStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询出行分析表
     * @date 2017-06-01 16:26:22
     * @param searchParams
     * @return
     */
    public List<ExtJxlTripInfoStockDTO> searchExtJxlTripInfoStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象出行分析表
     * @date 2017-06-01 16:26:22
     * @param searchParams
     * @return
     */
    public List<ExtJxlTripInfoStockDTO> searchExtJxlTripInfoStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象出行分析表
     * @date 2017-06-01 16:26:22
     * @param id
     * @return
     */
    public ExtJxlTripInfoStockDTO findExtJxlTripInfoStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象出行分析表
     * @date 2017-06-01 16:26:22
     * @param paramMap
     * @return
     */
    public int insertExtJxlTripInfoStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象出行分析表
     * @date 2017-06-01 16:26:22
     * @param paramMap
     */
    public void updateExtJxlTripInfoStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除出行分析表
     * @date 2017-06-01 16:26:22
     * @param ids
     * @return
     */ 
    public void deleteExtJxlTripInfoStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
