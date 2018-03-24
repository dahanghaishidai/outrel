package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlrecentneedstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlrecentneedstock.dto.ExtJxlRecentNeedStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlRecentNeedStockDao
 * @description: 定义  近期需求表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlRecentNeedStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询近期需求表
     * @date 2017-06-01 16:26:11
     * @param searchParams
     * @return
     */
    public List<ExtJxlRecentNeedStockDTO> searchExtJxlRecentNeedStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象近期需求表
     * @date 2017-06-01 16:26:11
     * @param searchParams
     * @return
     */
    public List<ExtJxlRecentNeedStockDTO> searchExtJxlRecentNeedStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象近期需求表
     * @date 2017-06-01 16:26:11
     * @param id
     * @return
     */
    public ExtJxlRecentNeedStockDTO findExtJxlRecentNeedStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象近期需求表
     * @date 2017-06-01 16:26:11
     * @param paramMap
     * @return
     */
    public int insertExtJxlRecentNeedStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象近期需求表
     * @date 2017-06-01 16:26:11
     * @param paramMap
     */
    public void updateExtJxlRecentNeedStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除近期需求表
     * @date 2017-06-01 16:26:11
     * @param ids
     * @return
     */ 
    public void deleteExtJxlRecentNeedStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
