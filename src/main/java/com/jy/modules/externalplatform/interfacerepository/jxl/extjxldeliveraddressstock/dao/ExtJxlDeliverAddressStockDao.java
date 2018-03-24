package com.jy.modules.externalplatform.interfacerepository.jxl.extjxldeliveraddressstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldeliveraddressstock.dto.ExtJxlDeliverAddressStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlDeliverAddressStockDao
 * @description: 定义  送货地址列表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlDeliverAddressStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询送货地址列表
     * @date 2017-06-01 16:25:28
     * @param searchParams
     * @return
     */
    public List<ExtJxlDeliverAddressStockDTO> searchExtJxlDeliverAddressStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象送货地址列表
     * @date 2017-06-01 16:25:28
     * @param searchParams
     * @return
     */
    public List<ExtJxlDeliverAddressStockDTO> searchExtJxlDeliverAddressStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象送货地址列表
     * @date 2017-06-01 16:25:28
     * @param id
     * @return
     */
    public ExtJxlDeliverAddressStockDTO findExtJxlDeliverAddressStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象送货地址列表
     * @date 2017-06-01 16:25:28
     * @param paramMap
     * @return
     */
    public int insertExtJxlDeliverAddressStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象送货地址列表
     * @date 2017-06-01 16:25:28
     * @param paramMap
     */
    public void updateExtJxlDeliverAddressStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除送货地址列表
     * @date 2017-06-01 16:25:28
     * @param ids
     * @return
     */ 
    public void deleteExtJxlDeliverAddressStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
