package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgseahisbyday.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgseahisbyday.dto.ExtWlJxlMgSeahisBydayDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgSeahisBydayDao
 * @description: 定义  蜜罐历史查询记录 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgSeahisBydayDao {
    
    /**
     * @author Administrator
     * @description: 分页查询蜜罐历史查询记录
     * @date 2018-01-09 17:47:01
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgSeahisBydayDTO> searchExtWlJxlMgSeahisBydayByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象蜜罐历史查询记录
     * @date 2018-01-09 17:47:01
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgSeahisBydayDTO> searchExtWlJxlMgSeahisByday(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象蜜罐历史查询记录
     * @date 2018-01-09 17:47:01
     * @param id
     * @return
     */
    public ExtWlJxlMgSeahisBydayDTO findExtWlJxlMgSeahisBydayByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象蜜罐历史查询记录
     * @date 2018-01-09 17:47:01
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgSeahisByday(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象蜜罐历史查询记录
     * @date 2018-01-09 17:47:01
     * @param paramMap
     */
    public void updateExtWlJxlMgSeahisByday(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除蜜罐历史查询记录
     * @date 2018-01-09 17:47:01
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgSeahisBydayByPrimaryKey(Map<String, Object> paramMap);
    
    
}
