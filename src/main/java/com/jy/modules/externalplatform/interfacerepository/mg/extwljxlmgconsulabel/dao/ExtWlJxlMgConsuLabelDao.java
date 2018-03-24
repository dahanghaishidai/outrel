package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconsulabel.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconsulabel.dto.ExtWlJxlMgConsuLabelDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgConsuLabelDao
 * @description: 定义  蜜罐消费标签信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgConsuLabelDao {
    
    /**
     * @author Administrator
     * @description: 分页查询蜜罐消费标签信息
     * @date 2018-01-09 17:47:24
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgConsuLabelDTO> searchExtWlJxlMgConsuLabelByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象蜜罐消费标签信息
     * @date 2018-01-09 17:47:24
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgConsuLabelDTO> searchExtWlJxlMgConsuLabel(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象蜜罐消费标签信息
     * @date 2018-01-09 17:47:24
     * @param id
     * @return
     */
    public ExtWlJxlMgConsuLabelDTO findExtWlJxlMgConsuLabelByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象蜜罐消费标签信息
     * @date 2018-01-09 17:47:24
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgConsuLabel(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象蜜罐消费标签信息
     * @date 2018-01-09 17:47:24
     * @param paramMap
     */
    public void updateExtWlJxlMgConsuLabel(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除蜜罐消费标签信息
     * @date 2018-01-09 17:47:24
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgConsuLabelByPrimaryKey(Map<String, Object> paramMap);
    
    
}
