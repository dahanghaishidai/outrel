package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcallinfostock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcallinfostock.dto.ExtJxlCallInfoStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlCallInfoStockDao
 * @description: 定义  呼叫信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlCallInfoStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询呼叫信息表
     * @date 2017-06-01 16:23:53
     * @param searchParams
     * @return
     */
    public List<ExtJxlCallInfoStockDTO> searchExtJxlCallInfoStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象呼叫信息表
     * @date 2017-06-01 16:23:53
     * @param searchParams
     * @return
     */
    public List<ExtJxlCallInfoStockDTO> searchExtJxlCallInfoStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象呼叫信息表
     * @date 2017-06-01 16:23:53
     * @param id
     * @return
     */
    public ExtJxlCallInfoStockDTO findExtJxlCallInfoStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象呼叫信息表
     * @date 2017-06-01 16:23:53
     * @param paramMap
     * @return
     */
    public int insertExtJxlCallInfoStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象呼叫信息表
     * @date 2017-06-01 16:23:53
     * @param paramMap
     */
    public void updateExtJxlCallInfoStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除呼叫信息表
     * @date 2017-06-01 16:23:53
     * @param ids
     * @return
     */ 
    public void deleteExtJxlCallInfoStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
