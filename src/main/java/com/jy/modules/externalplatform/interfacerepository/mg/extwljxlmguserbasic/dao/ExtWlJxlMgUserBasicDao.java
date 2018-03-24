package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserbasic.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserbasic.dto.ExtWlJxlMgUserBasicDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgUserBasicDao
 * @description: 定义  聚信立蜜罐用户基本信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgUserBasicDao {
    
    /**
     * @author Administrator
     * @description: 分页查询聚信立蜜罐用户基本信息
     * @date 2017-12-14 13:55:27
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgUserBasicDTO> searchExtWlJxlMgUserBasicByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象聚信立蜜罐用户基本信息
     * @date 2017-12-14 13:55:27
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgUserBasicDTO> searchExtWlJxlMgUserBasic(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象聚信立蜜罐用户基本信息
     * @date 2017-12-14 13:55:27
     * @param id
     * @return
     */
    public ExtWlJxlMgUserBasicDTO findExtWlJxlMgUserBasicByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象聚信立蜜罐用户基本信息
     * @date 2017-12-14 13:55:27
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgUserBasic(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象聚信立蜜罐用户基本信息
     * @date 2017-12-14 13:55:27
     * @param paramMap
     */
    public void updateExtWlJxlMgUserBasic(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除聚信立蜜罐用户基本信息
     * @date 2017-12-14 13:55:27
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgUserBasicByPrimaryKey(Map<String, Object> paramMap);
    
    
}
