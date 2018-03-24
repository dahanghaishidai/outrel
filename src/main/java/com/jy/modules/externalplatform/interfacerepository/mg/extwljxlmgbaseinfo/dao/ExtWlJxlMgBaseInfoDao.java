package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto.ExtWlJxlMgBaseInfoDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgBaseInfoDao
 * @description: 定义  聚信立蜜罐主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgBaseInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询聚信立蜜罐主表
     * @date 2017-12-14 13:56:25
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgBaseInfoDTO> searchExtWlJxlMgBaseInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象聚信立蜜罐主表
     * @date 2017-12-14 13:56:25
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgBaseInfoDTO> searchExtWlJxlMgBaseInfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象聚信立蜜罐主表
     * @date 2017-12-14 13:56:25
     * @param id
     * @return
     */
    public ExtWlJxlMgBaseInfoDTO findExtWlJxlMgBaseInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象聚信立蜜罐主表
     * @date 2017-12-14 13:56:25
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgBaseInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象聚信立蜜罐主表
     * @date 2017-12-14 13:56:25
     * @param paramMap
     */
    public void updateExtWlJxlMgBaseInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除聚信立蜜罐主表
     * @date 2017-12-14 13:56:25
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgBaseInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
