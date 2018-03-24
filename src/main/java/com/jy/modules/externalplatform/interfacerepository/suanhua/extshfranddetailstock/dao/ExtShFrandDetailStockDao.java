package com.jy.modules.externalplatform.interfacerepository.suanhua.extshfranddetailstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshfranddetailstock.dto.ExtShFrandDetailStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtShFrandDetailStockDao
 * @description: 定义  算话反欺诈报告明细表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  dell
 */
@MyBatisRepository
public interface ExtShFrandDetailStockDao {
    
    /**
     * @author dell
     * @description: 分页查询算话反欺诈报告明细表
     * @date 2017-06-12 11:33:06
     * @param searchParams
     * @return
     */
    public List<ExtShFrandDetailStockDTO> searchExtShFrandDetailStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author dell
     * @description:查询对象算话反欺诈报告明细表
     * @date 2017-06-12 11:33:06
     * @param searchParams
     * @return
     */
    public List<ExtShFrandDetailStockDTO> searchExtShFrandDetailStock(Map<String,Object> searchParams);

    /**
     * @author dell
     * @description:查询对象算话反欺诈报告明细表
     * @date 2017-06-12 11:33:06
     * @param id
     * @return
     */
    public ExtShFrandDetailStockDTO findExtShFrandDetailStockByPrimaryKey(String id);
    
    /**
     * @author dell
     * @description: 新增对象算话反欺诈报告明细表
     * @date 2017-06-12 11:33:06
     * @param paramMap
     * @return
     */
    public int insertExtShFrandDetailStock(Map<String, Object> paramMap);
    
    /**
     * @author dell
     * @description: 更新对象算话反欺诈报告明细表
     * @date 2017-06-12 11:33:06
     * @param paramMap
     */
    public void updateExtShFrandDetailStock(Map<String, Object> paramMap);
     
    /**
     * @author dell
     * @description: 按主键删除算话反欺诈报告明细表
     * @date 2017-06-12 11:33:06
     * @param ids
     * @return
     */ 
    public void deleteExtShFrandDetailStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
