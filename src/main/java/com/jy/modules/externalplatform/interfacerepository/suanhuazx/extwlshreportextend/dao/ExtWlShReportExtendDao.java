package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshreportextend.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshreportextend.dto.ExtWlShReportExtendDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShReportExtendDao
 * @description: 定义  算话人行报告扩展字段表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShReportExtendDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行报告扩展字段表
     * @date 2017-12-21 19:52:26
     * @param searchParams
     * @return
     */
    public List<ExtWlShReportExtendDTO> searchExtWlShReportExtendByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行报告扩展字段表
     * @date 2017-12-21 19:52:26
     * @param searchParams
     * @return
     */
    public List<ExtWlShReportExtendDTO> searchExtWlShReportExtend(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行报告扩展字段表
     * @date 2017-12-21 19:52:26
     * @param id
     * @return
     */
    public ExtWlShReportExtendDTO findExtWlShReportExtendByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行报告扩展字段表
     * @date 2017-12-21 19:52:26
     * @param paramMap
     * @return
     */
    public int insertExtWlShReportExtend(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行报告扩展字段表
     * @date 2017-12-21 19:52:26
     * @param paramMap
     */
    public void updateExtWlShReportExtend(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行报告扩展字段表
     * @date 2017-12-21 19:52:26
     * @param ids
     * @return
     */ 
    public void deleteExtWlShReportExtendByPrimaryKey(Map<String, Object> paramMap);
    
    
}
