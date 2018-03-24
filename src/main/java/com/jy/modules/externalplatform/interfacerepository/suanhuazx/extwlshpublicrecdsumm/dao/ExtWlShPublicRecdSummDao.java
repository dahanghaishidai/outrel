package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpublicrecdsumm.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpublicrecdsumm.dto.ExtWlShPublicRecdSummDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShPublicRecdSummDao
 * @description: 定义  算话人行原版(公共记录概要表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShPublicRecdSummDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行原版(公共记录概要表)
     * @date 2017-12-21 19:51:15
     * @param searchParams
     * @return
     */
    public List<ExtWlShPublicRecdSummDTO> searchExtWlShPublicRecdSummByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行原版(公共记录概要表)
     * @date 2017-12-21 19:51:15
     * @param searchParams
     * @return
     */
    public List<ExtWlShPublicRecdSummDTO> searchExtWlShPublicRecdSumm(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行原版(公共记录概要表)
     * @date 2017-12-21 19:51:15
     * @param id
     * @return
     */
    public ExtWlShPublicRecdSummDTO findExtWlShPublicRecdSummByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行原版(公共记录概要表)
     * @date 2017-12-21 19:51:15
     * @param paramMap
     * @return
     */
    public int insertExtWlShPublicRecdSumm(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行原版(公共记录概要表)
     * @date 2017-12-21 19:51:15
     * @param paramMap
     */
    public void updateExtWlShPublicRecdSumm(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行原版(公共记录概要表)
     * @date 2017-12-21 19:51:15
     * @param ids
     * @return
     */ 
    public void deleteExtWlShPublicRecdSummByPrimaryKey(Map<String, Object> paramMap);
    
    
}
