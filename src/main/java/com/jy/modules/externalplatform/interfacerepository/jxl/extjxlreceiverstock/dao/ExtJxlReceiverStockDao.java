package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlreceiverstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlreceiverstock.dto.ExtJxlReceiverStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlReceiverStockDao
 * @description: 定义  收货人表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlReceiverStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询收货人表
     * @date 2017-06-01 16:26:01
     * @param searchParams
     * @return
     */
    public List<ExtJxlReceiverStockDTO> searchExtJxlReceiverStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象收货人表
     * @date 2017-06-01 16:26:01
     * @param searchParams
     * @return
     */
    public List<ExtJxlReceiverStockDTO> searchExtJxlReceiverStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象收货人表
     * @date 2017-06-01 16:26:01
     * @param id
     * @return
     */
    public ExtJxlReceiverStockDTO findExtJxlReceiverStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象收货人表
     * @date 2017-06-01 16:26:01
     * @param paramMap
     * @return
     */
    public int insertExtJxlReceiverStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象收货人表
     * @date 2017-06-01 16:26:01
     * @param paramMap
     */
    public void updateExtJxlReceiverStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除收货人表
     * @date 2017-06-01 16:26:01
     * @param ids
     * @return
     */ 
    public void deleteExtJxlReceiverStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
