package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourt.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtcourt.dto.ExtWlZxtCourtDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZxtCourtDao
 * @description: 定义  个人/单位-法院被执行信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZxtCourtDao {
    
    /**
     * @author Administrator
     * @description: 分页查询个人/单位-法院被执行信息
     * @date 2017-12-15 18:07:47
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtCourtDTO> searchExtWlZxtCourtByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象个人/单位-法院被执行信息
     * @date 2017-12-15 18:07:47
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtCourtDTO> searchExtWlZxtCourt(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象个人/单位-法院被执行信息
     * @date 2017-12-15 18:07:47
     * @param id
     * @return
     */
    public ExtWlZxtCourtDTO findExtWlZxtCourtByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象个人/单位-法院被执行信息
     * @date 2017-12-15 18:07:47
     * @param paramMap
     * @return
     */
    public int insertExtWlZxtCourt(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象个人/单位-法院被执行信息
     * @date 2017-12-15 18:07:47
     * @param paramMap
     */
    public void updateExtWlZxtCourt(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除个人/单位-法院被执行信息
     * @date 2017-12-15 18:07:47
     * @param ids
     * @return
     */ 
    public void deleteExtWlZxtCourtByPrimaryKey(Map<String, Object> paramMap);
    
    
}
