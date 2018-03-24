package com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactliststock.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.extjxlcontactliststock.dto.ExtJxlContactListStockDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlContactListStockDao
 * @description: 定义  运营商联系人列表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtJxlContactListStockDao {
    
    /**
     * @author Administrator
     * @description: 分页查询运营商联系人列表
     * @date 2017-06-01 16:24:57
     * @param searchParams
     * @return
     */
    public List<ExtJxlContactListStockDTO> searchExtJxlContactListStockByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象运营商联系人列表
     * @date 2017-06-01 16:24:57
     * @param searchParams
     * @return
     */
    public List<ExtJxlContactListStockDTO> searchExtJxlContactListStock(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象运营商联系人列表
     * @date 2017-06-01 16:24:57
     * @param id
     * @return
     */
    public ExtJxlContactListStockDTO findExtJxlContactListStockByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象运营商联系人列表
     * @date 2017-06-01 16:24:57
     * @param paramMap
     * @return
     */
    public int insertExtJxlContactListStock(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象运营商联系人列表
     * @date 2017-06-01 16:24:57
     * @param paramMap
     */
    public void updateExtJxlContactListStock(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除运营商联系人列表
     * @date 2017-06-01 16:24:57
     * @param ids
     * @return
     */ 
    public void deleteExtJxlContactListStockByPrimaryKey(Map<String, Object> paramMap);
    
    
}
