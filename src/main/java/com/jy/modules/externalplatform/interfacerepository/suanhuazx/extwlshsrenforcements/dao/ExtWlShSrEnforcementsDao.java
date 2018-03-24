package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrenforcements.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrenforcements.dto.ExtWlShSrEnforcementsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShSrEnforcementsDao
 * @description: 定义  算话人行结构化版(强制执行记录表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShSrEnforcementsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行结构化版(强制执行记录表)
     * @date 2017-12-21 19:54:07
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrEnforcementsDTO> searchExtWlShSrEnforcementsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(强制执行记录表)
     * @date 2017-12-21 19:54:07
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrEnforcementsDTO> searchExtWlShSrEnforcements(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(强制执行记录表)
     * @date 2017-12-21 19:54:07
     * @param id
     * @return
     */
    public ExtWlShSrEnforcementsDTO findExtWlShSrEnforcementsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行结构化版(强制执行记录表)
     * @date 2017-12-21 19:54:07
     * @param paramMap
     * @return
     */
    public int insertExtWlShSrEnforcements(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行结构化版(强制执行记录表)
     * @date 2017-12-21 19:54:07
     * @param paramMap
     */
    public void updateExtWlShSrEnforcements(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行结构化版(强制执行记录表)
     * @date 2017-12-21 19:54:07
     * @param ids
     * @return
     */ 
    public void deleteExtWlShSrEnforcementsByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShSrEnforcementsList
     * @param: [enforcementsList, fkReportId]
     * @describe: 批量新增 算话人行结构化版(强制执行记录表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 11:14
     **/
    public void insertExtWlShSrEnforcementsList(Map<String, Object> paramMap);
}
