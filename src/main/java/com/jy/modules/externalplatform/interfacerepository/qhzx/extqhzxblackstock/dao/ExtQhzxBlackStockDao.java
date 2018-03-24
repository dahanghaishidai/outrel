package com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxblackstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.qhzx.extqhzxblackstock.dto.ExtQhzxBlackStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtQhzxBlackStockDao
 * @description: 定义  前海征信黑名单查询结果表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtQhzxBlackStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询前海征信黑名单查询结果表
     * @date 2017-06-07 17:28:40
     * @param searchParams
     * @return
     */
    public List<ExtQhzxBlackStockDTO> searchExtQhzxBlackStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象前海征信黑名单查询结果表
     * @date 2017-06-07 17:28:40
     * @param searchParams
     * @return
     */
    public List<ExtQhzxBlackStockDTO> searchExtQhzxBlackStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象前海征信黑名单查询结果表
     * @date 2017-06-07 17:28:40
     * @param id
     * @return
     */
    public ExtQhzxBlackStockDTO findExtQhzxBlackStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象前海征信黑名单查询结果表
     * @date 2017-06-07 17:28:40
     * @param paramMap
     * @return
     */
    public int insertExtQhzxBlackStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象前海征信黑名单查询结果表
     * @date 2017-06-07 17:28:40
     * @param paramMap
     */
    public void updateExtQhzxBlackStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除前海征信黑名单查询结果表
     * @date 2017-06-07 17:28:40
     * @param ids
     * @return
     */ 
    public void deleteExtQhzxBlackStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
