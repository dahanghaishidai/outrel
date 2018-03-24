package com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrdetailstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrdetailstock.dto.ExtShQrDetailStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtShQrDetailStockDao
 * @description: 定义  算话征信查询记录查询详细 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtShQrDetailStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话征信查询记录查询详细
     * @date 2017-06-08 18:05:13
     * @param searchParams
     * @return
     */
    public List<ExtShQrDetailStockDTO> searchExtShQrDetailStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话征信查询记录查询详细
     * @date 2017-06-08 18:05:13
     * @param searchParams
     * @return
     */
    public List<ExtShQrDetailStockDTO> searchExtShQrDetailStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话征信查询记录查询详细
     * @date 2017-06-08 18:05:13
     * @param id
     * @return
     */
    public ExtShQrDetailStockDTO findExtShQrDetailStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话征信查询记录查询详细
     * @date 2017-06-08 18:05:13
     * @param paramMap
     * @return
     */
    public int insertExtShQrDetailStock(Map<String, Object> paramMap);
    
    
    /**
     * @author Administrator
     * @description: 批量新增对象算话征信查询记录查询详细
     * @date 2017-06-08 18:05:13
     * @param paramMap
     * @return
     */
    public int insertExtShQrDetailStockList(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话征信查询记录查询详细
     * @date 2017-06-08 18:05:13
     * @param paramMap
     */
    public void updateExtShQrDetailStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话征信查询记录查询详细
     * @date 2017-06-08 18:05:13
     * @param ids
     * @return
     */ 
    public void deleteExtShQrDetailStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
