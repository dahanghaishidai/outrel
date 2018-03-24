package com.jy.modules.externalplatform.interfacerepository.dzswxh.extwlcecablacklist.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.dzswxh.extwlcecablacklist.dto.ExtWlCecaBlacklistDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlCecaBlacklistDao
 * @description: 定义  电子商务协会反欺诈黑名单表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlCecaBlacklistDao {
    
    /**
     * @author Administrator
     * @description: 分页查询电子商务协会反欺诈黑名单表
     * @date 2017-12-07 10:00:02
     * @param searchParams
     * @return
     */
    public List<ExtWlCecaBlacklistDTO> searchExtWlCecaBlacklistByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象电子商务协会反欺诈黑名单表
     * @date 2017-12-07 10:00:02
     * @param searchParams
     * @return
     */
    public List<ExtWlCecaBlacklistDTO> searchExtWlCecaBlacklist(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象电子商务协会反欺诈黑名单表
     * @date 2017-12-07 10:00:02
     * @param id
     * @return
     */
    public ExtWlCecaBlacklistDTO findExtWlCecaBlacklistByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象电子商务协会反欺诈黑名单表
     * @date 2017-12-07 10:00:02
     * @param paramMap
     * @return
     */
    public int insertExtWlCecaBlacklist(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象电子商务协会反欺诈黑名单表
     * @date 2017-12-07 10:00:02
     * @param paramMap
     */
    public void updateExtWlCecaBlacklist(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除电子商务协会反欺诈黑名单表
     * @date 2017-12-07 10:00:02
     * @param ids
     * @return
     */ 
    public void deleteExtWlCecaBlacklistByPrimaryKey(Map<String, Object> paramMap);
    
    /**
     * 批量插入数据
     * @param list
     */
    public Long insertBatchExtWlCecaBlacklist(Map<String, Object> paramMap);
    
    
}
