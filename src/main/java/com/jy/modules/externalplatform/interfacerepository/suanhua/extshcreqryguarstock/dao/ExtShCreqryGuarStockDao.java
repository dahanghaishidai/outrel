package com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryguarstock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhua.extshcreqryguarstock.dto.ExtShCreqryGuarStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtShCreqryGuarStockDao
 * @description: 定义  算话征信贷款信息查询_担保信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtShCreqryGuarStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话征信贷款信息查询_担保信息
     * @date 2017-06-09 10:01:47
     * @param searchParams
     * @return
     */
    public List<ExtShCreqryGuarStockDTO> searchExtShCreqryGuarStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话征信贷款信息查询_担保信息
     * @date 2017-06-09 10:01:47
     * @param searchParams
     * @return
     */
    public List<ExtShCreqryGuarStockDTO> searchExtShCreqryGuarStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话征信贷款信息查询_担保信息
     * @date 2017-06-09 10:01:47
     * @param id
     * @return
     */
    public ExtShCreqryGuarStockDTO findExtShCreqryGuarStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话征信贷款信息查询_担保信息
     * @date 2017-06-09 10:01:47
     * @param paramMap
     * @return
     */
    public int insertExtShCreqryGuarStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话征信贷款信息查询_担保信息
     * @date 2017-06-09 10:01:47
     * @param paramMap
     */
    public void updateExtShCreqryGuarStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话征信贷款信息查询_担保信息
     * @date 2017-06-09 10:01:47
     * @param ids
     * @return
     */ 
    public void deleteExtShCreqryGuarStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
