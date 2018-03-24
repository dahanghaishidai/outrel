package com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyinfo.dto.ExtWlTdPolicyInfoDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlTdPolicyInfoDao
 * @description: 定义  同盾_TDRC决策引擎信息主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlTdPolicyInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询同盾_TDRC决策引擎信息主表
     * @date 2017-12-20 20:33:23
     * @param searchParams
     * @return
     */
    public List<ExtWlTdPolicyInfoDTO> searchExtWlTdPolicyInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象同盾_TDRC决策引擎信息主表
     * @date 2017-12-20 20:33:23
     * @param searchParams
     * @return
     */
    public List<ExtWlTdPolicyInfoDTO> searchExtWlTdPolicyInfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象同盾_TDRC决策引擎信息主表
     * @date 2017-12-20 20:33:23
     * @param id
     * @return
     */
    public ExtWlTdPolicyInfoDTO findExtWlTdPolicyInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象同盾_TDRC决策引擎信息主表
     * @date 2017-12-20 20:33:23
     * @param paramMap
     * @return
     */
    public int insertExtWlTdPolicyInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象同盾_TDRC决策引擎信息主表
     * @date 2017-12-20 20:33:23
     * @param paramMap
     */
    public void updateExtWlTdPolicyInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除同盾_TDRC决策引擎信息主表
     * @date 2017-12-20 20:33:23
     * @param ids
     * @return
     */ 
    public void deleteExtWlTdPolicyInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
