package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlebusiexpstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlebusiexpstock.dto.ExtJxlEbusiExpStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlEbusiExpStockDao
 * @description: 定义  电商月消费表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlEbusiExpStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询电商月消费表
     * @date 2017-06-01 16:25:51
     * @param searchParams
     * @return
     */
    public List<ExtJxlEbusiExpStockDTO> searchExtJxlEbusiExpStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象电商月消费表
     * @date 2017-06-01 16:25:51
     * @param searchParams
     * @return
     */
    public List<ExtJxlEbusiExpStockDTO> searchExtJxlEbusiExpStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象电商月消费表
     * @date 2017-06-01 16:25:51
     * @param id
     * @return
     */
    public ExtJxlEbusiExpStockDTO findExtJxlEbusiExpStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象电商月消费表
     * @date 2017-06-01 16:25:51
     * @param paramMap
     * @return
     */
    public int insertExtJxlEbusiExpStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象电商月消费表
     * @date 2017-06-01 16:25:51
     * @param paramMap
     */
    public void updateExtJxlEbusiExpStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除电商月消费表
     * @date 2017-06-01 16:25:51
     * @param ids
     * @return
     */ 
    public void deleteExtJxlEbusiExpStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
