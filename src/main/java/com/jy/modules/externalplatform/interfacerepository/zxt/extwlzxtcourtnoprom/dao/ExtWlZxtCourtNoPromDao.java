package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourtnoprom.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourtnoprom.dto.ExtWlZxtCourtNoPromDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZxtCourtNoPromDao
 * @description: 定义  个人/单位-法院失信被执行信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZxtCourtNoPromDao {
    
    /**
     * @author Administrator
     * @description: 分页查询个人/单位-法院失信被执行信息
     * @date 2017-12-18 11:33:37
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtCourtNoPromDTO> searchExtWlZxtCourtNoPromByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象个人/单位-法院失信被执行信息
     * @date 2017-12-18 11:33:37
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtCourtNoPromDTO> searchExtWlZxtCourtNoProm(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象个人/单位-法院失信被执行信息
     * @date 2017-12-18 11:33:37
     * @param id
     * @return
     */
    public ExtWlZxtCourtNoPromDTO findExtWlZxtCourtNoPromByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象个人/单位-法院失信被执行信息
     * @date 2017-12-18 11:33:37
     * @param paramMap
     * @return
     */
    public int insertExtWlZxtCourtNoProm(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象个人/单位-法院失信被执行信息
     * @date 2017-12-18 11:33:37
     * @param paramMap
     */
    public void updateExtWlZxtCourtNoProm(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除个人/单位-法院失信被执行信息
     * @date 2017-12-18 11:33:37
     * @param ids
     * @return
     */ 
    public void deleteExtWlZxtCourtNoPromByPrimaryKey(Map<String, Object> paramMap);
    
    
}
