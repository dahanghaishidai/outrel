package com.jy.modules.externalplatform.interfacerepository.suanhua.extshperoverduesstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperoverduesstock.dto.ExtShPerOverduesStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtShPerOverduesStockDao
 * @description: 定义  人行征信逾期情况 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtShPerOverduesStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询人行征信逾期情况
     * @date 2017-06-12 14:55:31
     * @param searchParams
     * @return
     */
    public List<ExtShPerOverduesStockDTO> searchExtShPerOverduesStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象人行征信逾期情况
     * @date 2017-06-12 14:55:31
     * @param searchParams
     * @return
     */
    public List<ExtShPerOverduesStockDTO> searchExtShPerOverduesStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象人行征信逾期情况
     * @date 2017-06-12 14:55:31
     * @param id
     * @return
     */
    public ExtShPerOverduesStockDTO findExtShPerOverduesStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象人行征信逾期情况
     * @date 2017-06-12 14:55:31
     * @param paramMap
     * @return
     */
    public int insertExtShPerOverduesStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象人行征信逾期情况
     * @date 2017-06-12 14:55:31
     * @param paramMap
     */
    public void updateExtShPerOverduesStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除人行征信逾期情况
     * @date 2017-06-12 14:55:31
     * @param ids
     * @return
     */ 
    public void deleteExtShPerOverduesStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
