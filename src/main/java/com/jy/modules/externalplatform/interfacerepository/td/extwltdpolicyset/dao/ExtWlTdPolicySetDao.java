package com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyset.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.td.extwltdpolicyset.dto.ExtWlTdPolicySetDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlTdPolicySetDao
 * @description: 定义  同盾_TDRC决策引擎命中策略集表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlTdPolicySetDao {
    
    /**
     * @author Administrator
     * @description: 分页查询同盾_TDRC决策引擎命中策略集表
     * @date 2017-12-20 20:33:32
     * @param searchParams
     * @return
     */
    public List<ExtWlTdPolicySetDTO> searchExtWlTdPolicySetByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象同盾_TDRC决策引擎命中策略集表
     * @date 2017-12-20 20:33:32
     * @param searchParams
     * @return
     */
    public List<ExtWlTdPolicySetDTO> searchExtWlTdPolicySet(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象同盾_TDRC决策引擎命中策略集表
     * @date 2017-12-20 20:33:32
     * @param id
     * @return
     */
    public ExtWlTdPolicySetDTO findExtWlTdPolicySetByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象同盾_TDRC决策引擎命中策略集表
     * @date 2017-12-20 20:33:32
     * @param paramMap
     * @return
     */
    public int insertExtWlTdPolicySet(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象同盾_TDRC决策引擎命中策略集表
     * @date 2017-12-20 20:33:32
     * @param paramMap
     */
    public void updateExtWlTdPolicySet(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除同盾_TDRC决策引擎命中策略集表
     * @date 2017-12-20 20:33:32
     * @param ids
     * @return
     */ 
    public void deleteExtWlTdPolicySetByPrimaryKey(Map<String, Object> paramMap);
    
    
}
