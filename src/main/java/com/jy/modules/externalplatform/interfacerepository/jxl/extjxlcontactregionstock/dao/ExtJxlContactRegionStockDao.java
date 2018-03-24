package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactregionstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactregionstock.dto.ExtJxlContactRegionStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlContactRegionStockDao
 * @description: 定义  联系人区域汇总 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlContactRegionStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询联系人区域汇总
     * @date 2017-06-01 16:25:07
     * @param searchParams
     * @return
     */
    public List<ExtJxlContactRegionStockDTO> searchExtJxlContactRegionStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象联系人区域汇总
     * @date 2017-06-01 16:25:07
     * @param searchParams
     * @return
     */
    public List<ExtJxlContactRegionStockDTO> searchExtJxlContactRegionStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象联系人区域汇总
     * @date 2017-06-01 16:25:07
     * @param id
     * @return
     */
    public ExtJxlContactRegionStockDTO findExtJxlContactRegionStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象联系人区域汇总
     * @date 2017-06-01 16:25:07
     * @param paramMap
     * @return
     */
    public int insertExtJxlContactRegionStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象联系人区域汇总
     * @date 2017-06-01 16:25:07
     * @param paramMap
     */
    public void updateExtJxlContactRegionStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除联系人区域汇总
     * @date 2017-06-01 16:25:07
     * @param ids
     * @return
     */ 
    public void deleteExtJxlContactRegionStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
