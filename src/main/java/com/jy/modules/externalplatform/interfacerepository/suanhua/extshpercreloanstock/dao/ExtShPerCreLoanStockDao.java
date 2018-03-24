package com.jy.modules.externalplatform.interfacerepository.suanhua.extshpercreloanstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshpercreloanstock.dto.ExtShPerCreLoanStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtShPerCreLoanStockDao
 * @description: 定义  人行征信信贷信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtShPerCreLoanStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询人行征信信贷信息
     * @date 2017-06-12 14:56:14
     * @param searchParams
     * @return
     */
    public List<ExtShPerCreLoanStockDTO> searchExtShPerCreLoanStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象人行征信信贷信息
     * @date 2017-06-12 14:56:14
     * @param searchParams
     * @return
     */
    public List<ExtShPerCreLoanStockDTO> searchExtShPerCreLoanStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象人行征信信贷信息
     * @date 2017-06-12 14:56:14
     * @param id
     * @return
     */
    public ExtShPerCreLoanStockDTO findExtShPerCreLoanStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象人行征信信贷信息
     * @date 2017-06-12 14:56:14
     * @param paramMap
     * @return
     */
    public int insertExtShPerCreLoanStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象人行征信信贷信息
     * @date 2017-06-12 14:56:14
     * @param paramMap
     */
    public void updateExtShPerCreLoanStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除人行征信信贷信息
     * @date 2017-06-12 14:56:14
     * @param ids
     * @return
     */ 
    public void deleteExtShPerCreLoanStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
