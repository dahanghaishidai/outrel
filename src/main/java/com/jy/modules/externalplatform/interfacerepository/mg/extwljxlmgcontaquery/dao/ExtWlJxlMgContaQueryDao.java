package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontaquery.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontaquery.dto.ExtWlJxlMgContaQueryDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgContaQueryDao
 * @description: 定义  蜜罐联系人的查询历史表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgContaQueryDao {
    
    /**
     * @author Administrator
     * @description: 分页查询蜜罐联系人的查询历史表
     * @date 2018-01-09 17:46:36
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgContaQueryDTO> searchExtWlJxlMgContaQueryByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象蜜罐联系人的查询历史表
     * @date 2018-01-09 17:46:36
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgContaQueryDTO> searchExtWlJxlMgContaQuery(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象蜜罐联系人的查询历史表
     * @date 2018-01-09 17:46:36
     * @param id
     * @return
     */
    public ExtWlJxlMgContaQueryDTO findExtWlJxlMgContaQueryByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象蜜罐联系人的查询历史表
     * @date 2018-01-09 17:46:36
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgContaQuery(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象蜜罐联系人的查询历史表
     * @date 2018-01-09 17:46:36
     * @param paramMap
     */
    public void updateExtWlJxlMgContaQuery(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除蜜罐联系人的查询历史表
     * @date 2018-01-09 17:46:36
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgContaQueryByPrimaryKey(Map<String, Object> paramMap);
    
    
}
