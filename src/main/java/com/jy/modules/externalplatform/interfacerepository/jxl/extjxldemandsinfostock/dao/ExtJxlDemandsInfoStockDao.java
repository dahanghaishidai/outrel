package com.jy.modules.externalplatform.interfacerepository.jxl.extjxldemandsinfostock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxldemandsinfostock.dto.ExtJxlDemandsInfoStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlDemandsInfoStockDao
 * @description: 定义  需求信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlDemandsInfoStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询需求信息表
     * @date 2017-06-01 16:25:40
     * @param searchParams
     * @return
     */
    public List<ExtJxlDemandsInfoStockDTO> searchExtJxlDemandsInfoStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象需求信息表
     * @date 2017-06-01 16:25:40
     * @param searchParams
     * @return
     */
    public List<ExtJxlDemandsInfoStockDTO> searchExtJxlDemandsInfoStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象需求信息表
     * @date 2017-06-01 16:25:40
     * @param id
     * @return
     */
    public ExtJxlDemandsInfoStockDTO findExtJxlDemandsInfoStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象需求信息表
     * @date 2017-06-01 16:25:40
     * @param paramMap
     * @return
     */
    public int insertExtJxlDemandsInfoStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象需求信息表
     * @date 2017-06-01 16:25:40
     * @param paramMap
     */
    public void updateExtJxlDemandsInfoStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除需求信息表
     * @date 2017-06-01 16:25:40
     * @param ids
     * @return
     */ 
    public void deleteExtJxlDemandsInfoStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
