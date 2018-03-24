package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserblacklist.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmguserblacklist.dto.ExtWlJxlMgUserBlacklistDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgUserBlacklistDao
 * @description: 定义  聚信立蜜罐黑名单信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgUserBlacklistDao {
    
    /**
     * @author Administrator
     * @description: 分页查询聚信立蜜罐黑名单信息
     * @date 2017-12-14 13:54:39
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgUserBlacklistDTO> searchExtWlJxlMgUserBlacklistByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象聚信立蜜罐黑名单信息
     * @date 2017-12-14 13:54:39
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgUserBlacklistDTO> searchExtWlJxlMgUserBlacklist(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象聚信立蜜罐黑名单信息
     * @date 2017-12-14 13:54:39
     * @param id
     * @return
     */
    public ExtWlJxlMgUserBlacklistDTO findExtWlJxlMgUserBlacklistByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象聚信立蜜罐黑名单信息
     * @date 2017-12-14 13:54:39
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgUserBlacklist(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象聚信立蜜罐黑名单信息
     * @date 2017-12-14 13:54:39
     * @param paramMap
     */
    public void updateExtWlJxlMgUserBlacklist(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除聚信立蜜罐黑名单信息
     * @date 2017-12-14 13:54:39
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgUserBlacklistByPrimaryKey(Map<String, Object> paramMap);
    
    
}
