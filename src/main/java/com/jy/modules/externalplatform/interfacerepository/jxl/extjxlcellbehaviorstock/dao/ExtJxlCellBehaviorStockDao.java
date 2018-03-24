package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcellbehaviorstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcellbehaviorstock.dto.ExtJxlCellBehaviorStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlCellBehaviorStockDao
 * @description: 定义  通话行为分析表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlCellBehaviorStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询通话行为分析表
     * @date 2017-06-01 16:24:08
     * @param searchParams
     * @return
     */
    public List<ExtJxlCellBehaviorStockDTO> searchExtJxlCellBehaviorStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象通话行为分析表
     * @date 2017-06-01 16:24:08
     * @param searchParams
     * @return
     */
    public List<ExtJxlCellBehaviorStockDTO> searchExtJxlCellBehaviorStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象通话行为分析表
     * @date 2017-06-01 16:24:08
     * @param id
     * @return
     */
    public ExtJxlCellBehaviorStockDTO findExtJxlCellBehaviorStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象通话行为分析表
     * @date 2017-06-01 16:24:08
     * @param paramMap
     * @return
     */
    public int insertExtJxlCellBehaviorStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象通话行为分析表
     * @date 2017-06-01 16:24:08
     * @param paramMap
     */
    public void updateExtJxlCellBehaviorStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除通话行为分析表
     * @date 2017-06-01 16:24:08
     * @param ids
     * @return
     */ 
    public void deleteExtJxlCellBehaviorStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
