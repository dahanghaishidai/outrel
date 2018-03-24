package com.jy.modules.externalplatform.interfacerepository.xy.extwlxyidentityprobe.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.xy.extwlxyidentityprobe.dto.ExtWlXyIdentityProbeDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlXyIdentityProbeDao
 * @description: 定义  新颜身份探针信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlXyIdentityProbeDao {
    
    /**
     * @author Administrator
     * @description: 分页查询新颜身份探针信息表
     * @date 2017-12-06 10:47:38
     * @param searchParams
     * @return
     */
    public List<ExtWlXyIdentityProbeDTO> searchExtWlXyIdentityProbeByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象新颜身份探针信息表
     * @date 2017-12-06 10:47:38
     * @param searchParams
     * @return
     */
    public List<ExtWlXyIdentityProbeDTO> searchExtWlXyIdentityProbe(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象新颜身份探针信息表
     * @date 2017-12-06 10:47:38
     * @param id
     * @return
     */
    public ExtWlXyIdentityProbeDTO findExtWlXyIdentityProbeByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象新颜身份探针信息表
     * @date 2017-12-06 10:47:38
     * @param paramMap
     * @return
     */
    public int insertExtWlXyIdentityProbe(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象新颜身份探针信息表
     * @date 2017-12-06 10:47:38
     * @param paramMap
     */
    public void updateExtWlXyIdentityProbe(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除新颜身份探针信息表
     * @date 2017-12-06 10:47:38
     * @param ids
     * @return
     */ 
    public void deleteExtWlXyIdentityProbeByPrimaryKey(Map<String, Object> paramMap);
    
    
}
