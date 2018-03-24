package com.jy.modules.externalplatform.interfacerepository.suanhua.extshperloanbalstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshperloanbalstock.dto.ExtShPerLoanBalStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtShPerLoanBalStockDao
 * @description: 定义  人行征信贷款余额信息详列 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtShPerLoanBalStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询人行征信贷款余额信息详列
     * @date 2017-06-12 14:56:02
     * @param searchParams
     * @return
     */
    public List<ExtShPerLoanBalStockDTO> searchExtShPerLoanBalStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象人行征信贷款余额信息详列
     * @date 2017-06-12 14:56:02
     * @param searchParams
     * @return
     */
    public List<ExtShPerLoanBalStockDTO> searchExtShPerLoanBalStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象人行征信贷款余额信息详列
     * @date 2017-06-12 14:56:02
     * @param id
     * @return
     */
    public ExtShPerLoanBalStockDTO findExtShPerLoanBalStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象人行征信贷款余额信息详列
     * @date 2017-06-12 14:56:02
     * @param paramMap
     * @return
     */
    public int insertExtShPerLoanBalStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象人行征信贷款余额信息详列
     * @date 2017-06-12 14:56:02
     * @param paramMap
     */
    public void updateExtShPerLoanBalStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除人行征信贷款余额信息详列
     * @date 2017-06-12 14:56:02
     * @param ids
     * @return
     */ 
    public void deleteExtShPerLoanBalStockByPrimaryKey(Map<String, Object> paramMap);

	public int insertExtShPersonLoanBalancesList(Map<String, Object> paramMap);
    
    
}
