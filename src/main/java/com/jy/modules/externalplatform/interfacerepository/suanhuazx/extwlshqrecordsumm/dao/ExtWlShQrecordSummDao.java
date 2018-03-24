package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordsumm.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordsumm.dto.ExtWlShQrecordSummDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShQrecordSummDao
 * @description: 定义  算话人行原版(查询记录信息概要表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShQrecordSummDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行原版(查询记录信息概要表)
     * @date 2017-12-21 19:52:01
     * @param searchParams
     * @return
     */
    public List<ExtWlShQrecordSummDTO> searchExtWlShQrecordSummByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行原版(查询记录信息概要表)
     * @date 2017-12-21 19:52:01
     * @param searchParams
     * @return
     */
    public List<ExtWlShQrecordSummDTO> searchExtWlShQrecordSumm(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行原版(查询记录信息概要表)
     * @date 2017-12-21 19:52:01
     * @param id
     * @return
     */
    public ExtWlShQrecordSummDTO findExtWlShQrecordSummByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行原版(查询记录信息概要表)
     * @date 2017-12-21 19:52:01
     * @param paramMap
     * @return
     */
    public int insertExtWlShQrecordSumm(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行原版(查询记录信息概要表)
     * @date 2017-12-21 19:52:01
     * @param paramMap
     */
    public void updateExtWlShQrecordSumm(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行原版(查询记录信息概要表)
     * @date 2017-12-21 19:52:01
     * @param ids
     * @return
     */ 
    public void deleteExtWlShQrecordSummByPrimaryKey(Map<String, Object> paramMap);
    
    
}
