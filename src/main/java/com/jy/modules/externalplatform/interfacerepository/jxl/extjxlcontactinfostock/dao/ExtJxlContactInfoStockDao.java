package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactinfostock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactinfostock.dto.ExtJxlContactInfoStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlContactInfoStockDao
 * @description: 定义  联系人信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlContactInfoStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询联系人信息表
     * @date 2017-06-01 16:24:34
     * @param searchParams
     * @return
     */
    public List<ExtJxlContactInfoStockDTO> searchExtJxlContactInfoStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象联系人信息表
     * @date 2017-06-01 16:24:34
     * @param searchParams
     * @return
     */
    public List<ExtJxlContactInfoStockDTO> searchExtJxlContactInfoStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象联系人信息表
     * @date 2017-06-01 16:24:34
     * @param id
     * @return
     */
    public ExtJxlContactInfoStockDTO findExtJxlContactInfoStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象联系人信息表
     * @date 2017-06-01 16:24:34
     * @param paramMap
     * @return
     */
    public int insertExtJxlContactInfoStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象联系人信息表
     * @date 2017-06-01 16:24:34
     * @param paramMap
     */
    public void updateExtJxlContactInfoStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除联系人信息表
     * @date 2017-06-01 16:24:34
     * @param ids
     * @return
     */ 
    public void deleteExtJxlContactInfoStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
