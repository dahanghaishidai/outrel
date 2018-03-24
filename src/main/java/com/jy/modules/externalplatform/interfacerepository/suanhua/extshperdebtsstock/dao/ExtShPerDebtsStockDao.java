package com.jy.modules.externalplatform.interfacerepository.suanhua.extshperdebtsstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperdebtsstock.dto.ExtShPerDebtsStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtShPerDebtsStockDao
 * @description: 定义  人行征信负债情况 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtShPerDebtsStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询人行征信负债情况
     * @date 2017-06-12 14:55:48
     * @param searchParams
     * @return
     */
    public List<ExtShPerDebtsStockDTO> searchExtShPerDebtsStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象人行征信负债情况
     * @date 2017-06-12 14:55:48
     * @param searchParams
     * @return
     */
    public List<ExtShPerDebtsStockDTO> searchExtShPerDebtsStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象人行征信负债情况
     * @date 2017-06-12 14:55:48
     * @param id
     * @return
     */
    public ExtShPerDebtsStockDTO findExtShPerDebtsStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象人行征信负债情况
     * @date 2017-06-12 14:55:48
     * @param paramMap
     * @return
     */
    public int insertExtShPerDebtsStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象人行征信负债情况
     * @date 2017-06-12 14:55:48
     * @param paramMap
     */
    public void updateExtShPerDebtsStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除人行征信负债情况
     * @date 2017-06-12 14:55:48
     * @param ids
     * @return
     */ 
    public void deleteExtShPerDebtsStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
