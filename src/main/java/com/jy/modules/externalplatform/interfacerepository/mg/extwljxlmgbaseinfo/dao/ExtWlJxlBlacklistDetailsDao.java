package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgbaseinfo.dto.ExtWlJxlBlacklistDetailsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlBlacklistDetailsDao
 * @description: 定义  聚信立蜜罐黑名单详情 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlBlacklistDetailsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询聚信立蜜罐黑名单详情
     * @date 2017-12-14 16:22:23
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlBlacklistDetailsDTO> searchExtWlJxlBlacklistDetailsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象聚信立蜜罐黑名单详情
     * @date 2017-12-14 16:22:23
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlBlacklistDetailsDTO> searchExtWlJxlBlacklistDetails(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象聚信立蜜罐黑名单详情
     * @date 2017-12-14 16:22:23
     * @param id
     * @return
     */
    public ExtWlJxlBlacklistDetailsDTO findExtWlJxlBlacklistDetailsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象聚信立蜜罐黑名单详情
     * @date 2017-12-14 16:22:23
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlBlacklistDetails(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象聚信立蜜罐黑名单详情
     * @date 2017-12-14 16:22:23
     * @param paramMap
     */
    public void updateExtWlJxlBlacklistDetails(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除聚信立蜜罐黑名单详情
     * @date 2017-12-14 16:22:23
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlBlacklistDetailsByPrimaryKey(Map<String, Object> paramMap);
    
    
}
