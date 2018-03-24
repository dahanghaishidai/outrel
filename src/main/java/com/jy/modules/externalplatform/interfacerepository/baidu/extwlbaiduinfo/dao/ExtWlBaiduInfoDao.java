package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduinfo.dto.ExtWlBaiduInfoDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBaiduInfoDao
 * @description: 定义  百度金融风险查询主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBaiduInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询百度金融风险查询主表
     * @date 2017-12-13 16:40:42
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduInfoDTO> searchExtWlBaiduInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象百度金融风险查询主表
     * @date 2017-12-13 16:40:42
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduInfoDTO> searchExtWlBaiduInfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象百度金融风险查询主表
     * @date 2017-12-13 16:40:42
     * @param id
     * @return
     */
    public ExtWlBaiduInfoDTO findExtWlBaiduInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象百度金融风险查询主表
     * @date 2017-12-13 16:40:42
     * @param paramMap
     * @return
     */
    public int insertExtWlBaiduInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象百度金融风险查询主表
     * @date 2017-12-13 16:40:42
     * @param paramMap
     */
    public void updateExtWlBaiduInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除百度金融风险查询主表
     * @date 2017-12-13 16:40:42
     * @param ids
     * @return
     */ 
    public void deleteExtWlBaiduInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
