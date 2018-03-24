package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpoiinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpoiinfo.dto.ExtWlSmPoiInfoDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlSmPoiInfoDao
 * @description: 定义  数美黄页服务信息(外联平台表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlSmPoiInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询数美黄页服务信息(外联平台表)
     * @date 2017-09-26 14:27:07
     * @param searchParams
     * @return
     */
    public List<ExtWlSmPoiInfoDTO> searchExtWlSmPoiInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象数美黄页服务信息(外联平台表)
     * @date 2017-09-26 14:27:07
     * @param searchParams
     * @return
     */
    public List<ExtWlSmPoiInfoDTO> searchExtWlSmPoiInfo(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象数美黄页服务信息(外联平台表)
     * @date 2017-09-26 14:27:07
     * @param id
     * @return
     */
    public ExtWlSmPoiInfoDTO findExtWlSmPoiInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象数美黄页服务信息(外联平台表)
     * @date 2017-09-26 14:27:07
     * @param paramMap
     * @return
     */
    public int insertExtWlSmPoiInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象数美黄页服务信息(外联平台表)
     * @date 2017-09-26 14:27:07
     * @param paramMap
     */
    public void updateExtWlSmPoiInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除数美黄页服务信息(外联平台表)
     * @date 2017-09-26 14:27:07
     * @param ids
     * @return
     */ 
    public void deleteExtWlSmPoiInfoByPrimaryKey(Map<String, Object> paramMap);

    public void updateExtWlSmPoiInfoByIntocustid(Map<String, Object> paramMap);
    
    
}
