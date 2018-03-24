package com.jy.modules.externalplatform.interfacerepository.sjt.extsjttransbehaviorstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sjt.extsjttransbehaviorstock.dto.ExtSjtTransBehaviorStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtSjtTransBehaviorStockDao
 * @description: 定义  交易行为特征信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtSjtTransBehaviorStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询交易行为特征信息
     * @date 2017-06-08 11:42:28
     * @param searchParams
     * @return
     */
    public List<ExtSjtTransBehaviorStockDTO> searchExtSjtTransBehaviorStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象交易行为特征信息
     * @date 2017-06-08 11:42:28
     * @param searchParams
     * @return
     */
    public List<ExtSjtTransBehaviorStockDTO> searchExtSjtTransBehaviorStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象交易行为特征信息
     * @date 2017-06-08 11:42:28
     * @param id
     * @return
     */
    public ExtSjtTransBehaviorStockDTO findExtSjtTransBehaviorStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象交易行为特征信息
     * @date 2017-06-08 11:42:28
     * @param paramMap
     * @return
     */
    public int insertExtSjtTransBehaviorStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象交易行为特征信息
     * @date 2017-06-08 11:42:28
     * @param paramMap
     */
    public void updateExtSjtTransBehaviorStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除交易行为特征信息
     * @date 2017-06-08 11:42:28
     * @param ids
     * @return
     */ 
    public void deleteExtSjtTransBehaviorStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
