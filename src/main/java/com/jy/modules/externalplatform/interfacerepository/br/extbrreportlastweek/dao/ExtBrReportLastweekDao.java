package com.jy.modules.externalplatform.interfacerepository.br.extbrreportlastweek.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.br.extbrreportlastweek.dto.ExtBrReportLastweekDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtBrReportLastweekDao
 * @description: 定义  记录百融个人过去一周数据 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtBrReportLastweekDao {
    
    /**
     * @author Administrator
     * @description: 分页查询记录百融个人过去一周数据
     * @date 2017-06-07 15:56:44
     * @param searchParams
     * @return
     */
    public List<ExtBrReportLastweekDTO> searchExtBrReportLastweekByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象记录百融个人过去一周数据
     * @date 2017-06-07 15:56:44
     * @param searchParams
     * @return
     */
    public List<ExtBrReportLastweekDTO> searchExtBrReportLastweek(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象记录百融个人过去一周数据
     * @date 2017-06-07 15:56:44
     * @param id
     * @return
     */
    public ExtBrReportLastweekDTO findExtBrReportLastweekByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象记录百融个人过去一周数据
     * @date 2017-06-07 15:56:44
     * @param paramMap
     * @return
     */
    public int insertExtBrReportLastweek(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象记录百融个人过去一周数据
     * @date 2017-06-07 15:56:44
     * @param paramMap
     */
    public void updateExtBrReportLastweek(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除记录百融个人过去一周数据
     * @date 2017-06-07 15:56:44
     * @param ids
     * @return
     */ 
    public void deleteExtBrReportLastweekByPrimaryKey(Map<String, Object> paramMap);
    
    
}
