package com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverdue.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverdue.dto.ExtWlXyOverdueDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlXyOverdueDao
 * @description: 定义  新颜逾期信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlXyOverdueDao {
    
    /**
     * @author Administrator
     * @description: 分页查询新颜逾期信息表
     * @date 2017-12-12 16:16:58
     * @param searchParams
     * @return
     */
    public List<ExtWlXyOverdueDTO> searchExtWlXyOverdueByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象新颜逾期信息表
     * @date 2017-12-12 16:16:58
     * @param searchParams
     * @return
     */
    public List<ExtWlXyOverdueDTO> searchExtWlXyOverdue(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象新颜逾期信息表
     * @date 2017-12-12 16:16:58
     * @param id
     * @return
     */
    public ExtWlXyOverdueDTO findExtWlXyOverdueByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象新颜逾期信息表
     * @date 2017-12-12 16:16:58
     * @param paramMap
     * @return
     */
    public int insertExtWlXyOverdue(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象新颜逾期信息表
     * @date 2017-12-12 16:16:58
     * @param paramMap
     */
    public void updateExtWlXyOverdue(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除新颜逾期信息表
     * @date 2017-12-12 16:16:58
     * @param ids
     * @return
     */ 
    public void deleteExtWlXyOverdueByPrimaryKey(Map<String, Object> paramMap);
    
    
}
