package com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryrepaystock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryrepaystock.dto.ExtShCreqryRepayStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtShCreqryRepayStockDao
 * @description: 定义  算话征信贷款信息查询_还款信息列表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtShCreqryRepayStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话征信贷款信息查询_还款信息列表
     * @date 2017-06-09 10:02:10
     * @param searchParams
     * @return
     */
    public List<ExtShCreqryRepayStockDTO> searchExtShCreqryRepayStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话征信贷款信息查询_还款信息列表
     * @date 2017-06-09 10:02:10
     * @param searchParams
     * @return
     */
    public List<ExtShCreqryRepayStockDTO> searchExtShCreqryRepayStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话征信贷款信息查询_还款信息列表
     * @date 2017-06-09 10:02:10
     * @param id
     * @return
     */
    public ExtShCreqryRepayStockDTO findExtShCreqryRepayStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话征信贷款信息查询_还款信息列表
     * @date 2017-06-09 10:02:10
     * @param paramMap
     * @return
     */
    public int insertExtShCreqryRepayStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话征信贷款信息查询_还款信息列表
     * @date 2017-06-09 10:02:10
     * @param paramMap
     */
    public void updateExtShCreqryRepayStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话征信贷款信息查询_还款信息列表
     * @date 2017-06-09 10:02:10
     * @param ids
     * @return
     */ 
    public void deleteExtShCreqryRepayStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
