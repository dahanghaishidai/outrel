package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgregorgstat.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgregorgstat.dto.ExtWlJxlMgRegOrgStatDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgRegOrgStatDao
 * @description: 定义  聚信立蜜罐用户注册信息情况 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgRegOrgStatDao {
    
    /**
     * @author Administrator
     * @description: 分页查询聚信立蜜罐用户注册信息情况
     * @date 2017-12-14 13:55:52
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgRegOrgStatDTO> searchExtWlJxlMgRegOrgStatByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象聚信立蜜罐用户注册信息情况
     * @date 2017-12-14 13:55:52
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgRegOrgStatDTO> searchExtWlJxlMgRegOrgStat(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象聚信立蜜罐用户注册信息情况
     * @date 2017-12-14 13:55:52
     * @param id
     * @return
     */
    public ExtWlJxlMgRegOrgStatDTO findExtWlJxlMgRegOrgStatByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象聚信立蜜罐用户注册信息情况
     * @date 2017-12-14 13:55:52
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgRegOrgStat(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象聚信立蜜罐用户注册信息情况
     * @date 2017-12-14 13:55:52
     * @param paramMap
     */
    public void updateExtWlJxlMgRegOrgStat(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除聚信立蜜罐用户注册信息情况
     * @date 2017-12-14 13:55:52
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgRegOrgStatByPrimaryKey(Map<String, Object> paramMap);
    
    
}
