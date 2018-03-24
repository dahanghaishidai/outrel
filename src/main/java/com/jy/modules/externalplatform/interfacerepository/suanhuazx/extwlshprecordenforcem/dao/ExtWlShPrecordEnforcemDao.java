package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordenforcem.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordenforcem.dto.ExtWlShPrecordEnforcemDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShPrecordEnforcemDao
 * @description: 定义  算话人行原版(公共记录_强制执行记录表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShPrecordEnforcemDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行原版(公共记录_强制执行记录表)
     * @date 2017-12-21 19:59:26
     * @param searchParams
     * @return
     */
    public List<ExtWlShPrecordEnforcemDTO> searchExtWlShPrecordEnforcemByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行原版(公共记录_强制执行记录表)
     * @date 2017-12-21 19:59:26
     * @param searchParams
     * @return
     */
    public List<ExtWlShPrecordEnforcemDTO> searchExtWlShPrecordEnforcem(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行原版(公共记录_强制执行记录表)
     * @date 2017-12-21 19:59:26
     * @param id
     * @return
     */
    public ExtWlShPrecordEnforcemDTO findExtWlShPrecordEnforcemByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行原版(公共记录_强制执行记录表)
     * @date 2017-12-21 19:59:26
     * @param paramMap
     * @return
     */
    public int insertExtWlShPrecordEnforcem(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行原版(公共记录_强制执行记录表)
     * @date 2017-12-21 19:59:26
     * @param paramMap
     */
    public void updateExtWlShPrecordEnforcem(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行原版(公共记录_强制执行记录表)
     * @date 2017-12-21 19:59:26
     * @param ids
     * @return
     */ 
    public void deleteExtWlShPrecordEnforcemByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShPrecordEnforcementList
     * @param: [precordEnforcementList, fkReportId]
     * @describe: 批量新增 算话人行原版(公共记录_强制执行记录表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 9:56
     **/
    public void insertExtWlShPrecordEnforcementList(Map<String, Object> paramMap);
}
