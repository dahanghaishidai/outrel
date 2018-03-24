package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusergray.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgusergray.dto.ExtWlJxlMgUserGrayDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgUserGrayDao
 * @description: 定义  聚信立蜜罐用户灰度分数信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgUserGrayDao {
    
    /**
     * @author Administrator
     * @description: 分页查询聚信立蜜罐用户灰度分数信息
     * @date 2017-12-14 13:55:02
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgUserGrayDTO> searchExtWlJxlMgUserGrayByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象聚信立蜜罐用户灰度分数信息
     * @date 2017-12-14 13:55:02
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgUserGrayDTO> searchExtWlJxlMgUserGray(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象聚信立蜜罐用户灰度分数信息
     * @date 2017-12-14 13:55:02
     * @param id
     * @return
     */
    public ExtWlJxlMgUserGrayDTO findExtWlJxlMgUserGrayByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象聚信立蜜罐用户灰度分数信息
     * @date 2017-12-14 13:55:02
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgUserGray(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象聚信立蜜罐用户灰度分数信息
     * @date 2017-12-14 13:55:02
     * @param paramMap
     */
    public void updateExtWlJxlMgUserGray(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除聚信立蜜罐用户灰度分数信息
     * @date 2017-12-14 13:55:02
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgUserGrayByPrimaryKey(Map<String, Object> paramMap);
    
    
}
