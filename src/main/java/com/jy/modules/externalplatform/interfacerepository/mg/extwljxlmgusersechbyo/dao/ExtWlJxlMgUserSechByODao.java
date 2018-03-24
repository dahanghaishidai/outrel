package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusersechbyo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusersechbyo.dto.ExtWlJxlMgUserSechByODTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgUserSechByODao
 * @description: 定义  用户被机构查询历史 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgUserSechByODao {
    
    /**
     * @author Administrator
     * @description: 分页查询用户被机构查询历史
     * @date 2017-12-14 13:54:04
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgUserSechByODTO> searchExtWlJxlMgUserSechByOByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象用户被机构查询历史
     * @date 2017-12-14 13:54:04
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgUserSechByODTO> searchExtWlJxlMgUserSechByO(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象用户被机构查询历史
     * @date 2017-12-14 13:54:04
     * @param id
     * @return
     */
    public ExtWlJxlMgUserSechByODTO findExtWlJxlMgUserSechByOByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象用户被机构查询历史
     * @date 2017-12-14 13:54:04
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgUserSechByO(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象用户被机构查询历史
     * @date 2017-12-14 13:54:04
     * @param paramMap
     */
    public void updateExtWlJxlMgUserSechByO(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除用户被机构查询历史
     * @date 2017-12-14 13:54:04
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgUserSechByOByPrimaryKey(Map<String, Object> paramMap);
    
    
}
