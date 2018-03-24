package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcustinfostock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcustinfostock.dto.ExtJxlCustInfoStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlCustInfoStockDao
 * @description: 定义  申请人信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlCustInfoStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询申请人信息
     * @date 2017-06-01 16:23:38
     * @param searchParams
     * @return
     */
    public List<ExtJxlCustInfoStockDTO> searchExtJxlCustInfoStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象申请人信息
     * @date 2017-06-01 16:23:38
     * @param searchParams
     * @return
     */
    public List<ExtJxlCustInfoStockDTO> searchExtJxlCustInfoStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象申请人信息
     * @date 2017-06-01 16:23:38
     * @param id
     * @return
     */
    public ExtJxlCustInfoStockDTO findExtJxlCustInfoStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象申请人信息
     * @date 2017-06-01 16:23:38
     * @param paramMap
     * @return
     */
    public int insertExtJxlCustInfoStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象申请人信息
     * @date 2017-06-01 16:23:38
     * @param paramMap
     */
    public void updateExtJxlCustInfoStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除申请人信息
     * @date 2017-06-01 16:23:38
     * @param ids
     * @return
     */ 
    public void deleteExtJxlCustInfoStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
