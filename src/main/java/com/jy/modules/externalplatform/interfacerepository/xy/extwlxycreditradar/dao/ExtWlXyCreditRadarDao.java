package com.jy.modules.externalplatform.interfacerepository.xy.extwlxycreditradar.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.xy.extwlxycreditradar.dto.ExtWlXyCreditRadarDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlXyCreditRadarDao
 * @description: 定义  新颜征信雷达报告表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlXyCreditRadarDao {
    
    /**
     * @author Administrator
     * @description: 分页查询新颜征信雷达报告表
     * @date 2017-12-06 16:36:40
     * @param searchParams
     * @return
     */
    public List<ExtWlXyCreditRadarDTO> searchExtWlXyCreditRadarByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象新颜征信雷达报告表
     * @date 2017-12-06 16:36:40
     * @param searchParams
     * @return
     */
    public List<ExtWlXyCreditRadarDTO> searchExtWlXyCreditRadar(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象新颜征信雷达报告表
     * @date 2017-12-06 16:36:40
     * @param id
     * @return
     */
    public ExtWlXyCreditRadarDTO findExtWlXyCreditRadarByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象新颜征信雷达报告表
     * @date 2017-12-06 16:36:40
     * @param paramMap
     * @return
     */
    public int insertExtWlXyCreditRadar(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象新颜征信雷达报告表
     * @date 2017-12-06 16:36:40
     * @param paramMap
     */
    public void updateExtWlXyCreditRadar(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除新颜征信雷达报告表
     * @date 2017-12-06 16:36:40
     * @param ids
     * @return
     */ 
    public void deleteExtWlXyCreditRadarByPrimaryKey(Map<String, Object> paramMap);
    
    
}
