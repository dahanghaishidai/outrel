package com.jy.modules.externalplatform.interfacerepository.sjt.extsjtassetsstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtassetsstock.dto.ExtSjtAssetsStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtSjtAssetsStockDao
 * @description: 定义  数据堂个人消费报告资产指标 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtSjtAssetsStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询数据堂个人消费报告资产指标
     * @date 2017-06-08 11:42:02
     * @param searchParams
     * @return
     */
    public List<ExtSjtAssetsStockDTO> searchExtSjtAssetsStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象数据堂个人消费报告资产指标
     * @date 2017-06-08 11:42:02
     * @param searchParams
     * @return
     */
    public List<ExtSjtAssetsStockDTO> searchExtSjtAssetsStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象数据堂个人消费报告资产指标
     * @date 2017-06-08 11:42:02
     * @param id
     * @return
     */
    public ExtSjtAssetsStockDTO findExtSjtAssetsStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象数据堂个人消费报告资产指标
     * @date 2017-06-08 11:42:02
     * @param paramMap
     * @return
     */
    public int insertExtSjtAssetsStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象数据堂个人消费报告资产指标
     * @date 2017-06-08 11:42:02
     * @param paramMap
     */
    public void updateExtSjtAssetsStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除数据堂个人消费报告资产指标
     * @date 2017-06-08 11:42:02
     * @param ids
     * @return
     */ 
    public void deleteExtSjtAssetsStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
