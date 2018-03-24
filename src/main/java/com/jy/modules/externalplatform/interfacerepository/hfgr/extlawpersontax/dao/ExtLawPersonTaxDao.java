package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersontax.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersontax.dto.ExtLawPersonTaxDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawPersonTaxDao
 * @description: 定义  汇法网个人税务信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawPersonTaxDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网个人税务信息表
     * @date 2017-05-31 11:10:18
     * @param searchParams
     * @return
     */
    public List<ExtLawPersonTaxDTO> searchExtLawPersonTaxByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网个人税务信息表
     * @date 2017-05-31 11:10:18
     * @param searchParams
     * @return
     */
    public List<ExtLawPersonTaxDTO> searchExtLawPersonTax(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网个人税务信息表
     * @date 2017-05-31 11:10:18
     * @param id
     * @return
     */
    public ExtLawPersonTaxDTO findExtLawPersonTaxByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网个人税务信息表
     * @date 2017-05-31 11:10:18
     * @param paramMap
     * @return
     */
    public int insertExtLawPersonTax(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网个人税务信息表
     * @date 2017-05-31 11:10:18
     * @param paramMap
     */
    public void updateExtLawPersonTax(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网个人税务信息表
     * @date 2017-05-31 11:10:18
     * @param ids
     * @return
     */ 
    public void deleteExtLawPersonTaxByPrimaryKey(Map<String, Object> paramMap);
    
    
}
