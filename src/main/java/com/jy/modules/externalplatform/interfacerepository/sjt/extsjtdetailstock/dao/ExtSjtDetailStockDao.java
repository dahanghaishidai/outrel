package com.jy.modules.externalplatform.interfacerepository.sjt.extsjtdetailstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sjt.extsjtdetailstock.dto.ExtSjtDetailStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtSjtDetailStockDao
 * @description: 定义  数据堂个人消费报告明细信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtSjtDetailStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询数据堂个人消费报告明细信息
     * @date 2017-06-08 11:42:16
     * @param searchParams
     * @return
     */
    public List<ExtSjtDetailStockDTO> searchExtSjtDetailStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象数据堂个人消费报告明细信息
     * @date 2017-06-08 11:42:16
     * @param searchParams
     * @return
     */
    public List<ExtSjtDetailStockDTO> searchExtSjtDetailStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象数据堂个人消费报告明细信息
     * @date 2017-06-08 11:42:16
     * @param id
     * @return
     */
    public ExtSjtDetailStockDTO findExtSjtDetailStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象数据堂个人消费报告明细信息
     * @date 2017-06-08 11:42:16
     * @param paramMap
     * @return
     */
    public int insertExtSjtDetailStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象数据堂个人消费报告明细信息
     * @date 2017-06-08 11:42:16
     * @param paramMap
     */
    public void updateExtSjtDetailStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除数据堂个人消费报告明细信息
     * @date 2017-06-08 11:42:16
     * @param ids
     * @return
     */ 
    public void deleteExtSjtDetailStockByPrimaryKey(Map<String, Object> paramMap);

	public Object batchInsertExtSjtCreditDetailInfo(Map<String, Object> paramMap);
    
    
}
