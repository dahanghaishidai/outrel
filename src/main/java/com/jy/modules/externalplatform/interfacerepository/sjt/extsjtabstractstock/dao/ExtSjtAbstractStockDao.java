package com.jy.modules.externalplatform.interfacerepository.sjt.extsjtabstractstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtabstractstock.dto.ExtSjtAbstractStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtSjtAbstractStockDao
 * @description: 定义  数据堂个人消费报告摘要信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtSjtAbstractStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询数据堂个人消费报告摘要信息
     * @date 2017-06-08 11:41:50
     * @param searchParams
     * @return
     */
    public List<ExtSjtAbstractStockDTO> searchExtSjtAbstractStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象数据堂个人消费报告摘要信息
     * @date 2017-06-08 11:41:50
     * @param searchParams
     * @return
     */
    public List<ExtSjtAbstractStockDTO> searchExtSjtAbstractStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象数据堂个人消费报告摘要信息
     * @date 2017-06-08 11:41:50
     * @param id
     * @return
     */
    public ExtSjtAbstractStockDTO findExtSjtAbstractStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象数据堂个人消费报告摘要信息
     * @date 2017-06-08 11:41:50
     * @param paramMap
     * @return
     */
    public int insertExtSjtAbstractStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象数据堂个人消费报告摘要信息
     * @date 2017-06-08 11:41:50
     * @param paramMap
     */
    public void updateExtSjtAbstractStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除数据堂个人消费报告摘要信息
     * @date 2017-06-08 11:41:50
     * @param ids
     * @return
     */ 
    public void deleteExtSjtAbstractStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
