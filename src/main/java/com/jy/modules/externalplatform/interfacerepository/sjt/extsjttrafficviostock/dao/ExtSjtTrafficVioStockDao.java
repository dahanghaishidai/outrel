package com.jy.modules.externalplatform.interfacerepository.sjt.extsjttrafficviostock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sjt.extsjttrafficviostock.dto.ExtSjtTrafficVioStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtSjtTrafficVioStockDao
 * @description: 定义  数据堂交通违章信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtSjtTrafficVioStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询数据堂交通违章信息
     * @date 2017-06-08 16:48:11
     * @param searchParams
     * @return
     */
    public List<ExtSjtTrafficVioStockDTO> searchExtSjtTrafficVioStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象数据堂交通违章信息
     * @date 2017-06-08 16:48:11
     * @param searchParams
     * @return
     */
    public List<ExtSjtTrafficVioStockDTO> searchExtSjtTrafficVioStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象数据堂交通违章信息
     * @date 2017-06-08 16:48:11
     * @param id
     * @return
     */
    public ExtSjtTrafficVioStockDTO findExtSjtTrafficVioStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象数据堂交通违章信息
     * @date 2017-06-08 16:48:11
     * @param paramMap
     * @return
     */
    public int insertExtSjtTrafficVioStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象数据堂交通违章信息
     * @date 2017-06-08 16:48:11
     * @param paramMap
     */
    public void updateExtSjtTrafficVioStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除数据堂交通违章信息
     * @date 2017-06-08 16:48:11
     * @param ids
     * @return
     */ 
    public void deleteExtSjtTrafficVioStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
