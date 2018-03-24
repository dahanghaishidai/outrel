package com.jy.modules.externalplatform.interfacerepository.zs.extzsidentitycheck.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zs.extzsidentitycheck.dto.ExtZsIdentityCheckDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtZsIdentityCheckDao
 * @description: 定义  中胜身份校验查询结果 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtZsIdentityCheckDao {
    
    /**
     * @author Administrator
     * @description: 分页查询中胜身份校验查询结果
     * @date 2017-06-02 14:13:34
     * @param searchParams
     * @return
     */
    public List<ExtZsIdentityCheckDTO> searchExtZsIdentityCheckByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象中胜身份校验查询结果
     * @date 2017-06-02 14:13:34
     * @param searchParams
     * @return
     */
    public List<ExtZsIdentityCheckDTO> searchExtZsIdentityCheck(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象中胜身份校验查询结果
     * @date 2017-06-02 14:13:34
     * @param id
     * @return
     */
    public ExtZsIdentityCheckDTO findExtZsIdentityCheckByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象中胜身份校验查询结果
     * @date 2017-06-02 14:13:34
     * @param paramMap
     * @return
     */
    public int insertExtZsIdentityCheck(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象中胜身份校验查询结果
     * @date 2017-06-02 14:13:34
     * @param paramMap
     */
    public void updateExtZsIdentityCheck(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除中胜身份校验查询结果
     * @date 2017-06-02 14:13:34
     * @param ids
     * @return
     */ 
    public void deleteExtZsIdentityCheckByPrimaryKey(Map<String, Object> paramMap);
    
    
}
