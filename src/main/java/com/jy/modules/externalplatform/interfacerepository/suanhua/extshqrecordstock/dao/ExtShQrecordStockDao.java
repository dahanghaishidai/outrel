package com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrecordstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshqrecordstock.dto.ExtShQrecordStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtShQrecordStockDao
 * @description: 定义  算话征信查询记录查询报告 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtShQrecordStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话征信查询记录查询报告
     * @date 2017-06-08 18:04:56
     * @param searchParams
     * @return
     */
    public List<ExtShQrecordStockDTO> searchExtShQrecordStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话征信查询记录查询报告
     * @date 2017-06-08 18:04:56
     * @param searchParams
     * @return
     */
    public List<ExtShQrecordStockDTO> searchExtShQrecordStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话征信查询记录查询报告
     * @date 2017-06-08 18:04:56
     * @param id
     * @return
     */
    public ExtShQrecordStockDTO findExtShQrecordStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话征信查询记录查询报告
     * @date 2017-06-08 18:04:56
     * @param paramMap
     * @return
     */
    public int insertExtShQrecordStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话征信查询记录查询报告
     * @date 2017-06-08 18:04:56
     * @param paramMap
     */
    public void updateExtShQrecordStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话征信查询记录查询报告
     * @date 2017-06-08 18:04:56
     * @param ids
     * @return
     */ 
    public void deleteExtShQrecordStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
