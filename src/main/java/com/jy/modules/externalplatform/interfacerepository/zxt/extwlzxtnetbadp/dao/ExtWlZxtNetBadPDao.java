package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtnetbadp.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtnetbadp.dto.ExtWlZxtNetBadPDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZxtNetBadPDao
 * @description: 定义  个人/单位-网络负面舆情信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZxtNetBadPDao {
    
    /**
     * @author Administrator
     * @description: 分页查询个人/单位-网络负面舆情信息
     * @date 2017-12-18 15:07:21
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtNetBadPDTO> searchExtWlZxtNetBadPByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象个人/单位-网络负面舆情信息
     * @date 2017-12-18 15:07:21
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtNetBadPDTO> searchExtWlZxtNetBadP(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象个人/单位-网络负面舆情信息
     * @date 2017-12-18 15:07:21
     * @param id
     * @return
     */
    public ExtWlZxtNetBadPDTO findExtWlZxtNetBadPByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象个人/单位-网络负面舆情信息
     * @date 2017-12-18 15:07:21
     * @param paramMap
     * @return
     */
    public int insertExtWlZxtNetBadP(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象个人/单位-网络负面舆情信息
     * @date 2017-12-18 15:07:21
     * @param paramMap
     */
    public void updateExtWlZxtNetBadP(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除个人/单位-网络负面舆情信息
     * @date 2017-12-18 15:07:21
     * @param ids
     * @return
     */ 
    public void deleteExtWlZxtNetBadPByPrimaryKey(Map<String, Object> paramMap);
    
    
}
