package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontclosest.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontclosest.dto.ExtWlJxlMgContClosestDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgContClosestDao
 * @description: 定义  蜜罐与联系人的最大亲密度表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgContClosestDao {
    
    /**
     * @author Administrator
     * @description: 分页查询蜜罐与联系人的最大亲密度表
     * @date 2018-01-09 17:45:04
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgContClosestDTO> searchExtWlJxlMgContClosestByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象蜜罐与联系人的最大亲密度表
     * @date 2018-01-09 17:45:04
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgContClosestDTO> searchExtWlJxlMgContClosest(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象蜜罐与联系人的最大亲密度表
     * @date 2018-01-09 17:45:04
     * @param id
     * @return
     */
    public ExtWlJxlMgContClosestDTO findExtWlJxlMgContClosestByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象蜜罐与联系人的最大亲密度表
     * @date 2018-01-09 17:45:04
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgContClosest(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象蜜罐与联系人的最大亲密度表
     * @date 2018-01-09 17:45:04
     * @param paramMap
     */
    public void updateExtWlJxlMgContClosest(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除蜜罐与联系人的最大亲密度表
     * @date 2018-01-09 17:45:04
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgContClosestByPrimaryKey(Map<String, Object> paramMap);
    
    
}
