package com.jy.modules.externalplatform.interfacerepository.sh.extwlshareoverdues.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlshareoverdues.dto.ExtWlShareOverduesDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShareOverduesDao
 * @description: 定义  算话共享报告_近5年逾期信息记录 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShareOverduesDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_近5年逾期信息记录
     * @date 2017-12-07 19:53:36
     * @param searchParams
     * @return
     */
    public List<ExtWlShareOverduesDTO> searchExtWlShareOverduesByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_近5年逾期信息记录
     * @date 2017-12-07 19:53:36
     * @param searchParams
     * @return
     */
    public List<ExtWlShareOverduesDTO> searchExtWlShareOverdues(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_近5年逾期信息记录
     * @date 2017-12-07 19:53:36
     * @param id
     * @return
     */
    public ExtWlShareOverduesDTO findExtWlShareOverduesByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_近5年逾期信息记录
     * @date 2017-12-07 19:53:36
     * @param paramMap
     * @return
     */
    public int insertExtWlShareOverdues(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_近5年逾期信息记录
     * @date 2017-12-07 19:53:36
     * @param paramMap
     */
    public void updateExtWlShareOverdues(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_近5年逾期信息记录
     * @date 2017-12-07 19:53:36
     * @param ids
     * @return
     */ 
    public void deleteExtWlShareOverduesByPrimaryKey(Map<String, Object> paramMap);

    public int insertExtWlShareOverduesList(Map<String, Object> paramMap);
    
    
}
