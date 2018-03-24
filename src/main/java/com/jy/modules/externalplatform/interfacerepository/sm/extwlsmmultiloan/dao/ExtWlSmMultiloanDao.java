package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmultiloan.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmultiloan.dto.ExtWlSmMultiloanDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlSmMultiloanDao
 * @description: 定义  数美多平台借贷服务信息(外联平台表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlSmMultiloanDao {
    
    /**
     * @author Administrator
     * @description: 分页查询数美多平台借贷服务信息(外联平台表)
     * @date 2017-09-26 14:26:39
     * @param searchParams
     * @return
     */
    public List<ExtWlSmMultiloanDTO> searchExtWlSmMultiloanByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象数美多平台借贷服务信息(外联平台表)
     * @date 2017-09-26 14:26:39
     * @param searchParams
     * @return
     */
    public List<ExtWlSmMultiloanDTO> searchExtWlSmMultiloan(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象数美多平台借贷服务信息(外联平台表)
     * @date 2017-09-26 14:26:39
     * @param id
     * @return
     */
    public ExtWlSmMultiloanDTO findExtWlSmMultiloanByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象数美多平台借贷服务信息(外联平台表)
     * @date 2017-09-26 14:26:39
     * @param paramMap
     * @return
     */
    public int insertExtWlSmMultiloan(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象数美多平台借贷服务信息(外联平台表)
     * @date 2017-09-26 14:26:39
     * @param paramMap
     */
    public void updateExtWlSmMultiloan(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除数美多平台借贷服务信息(外联平台表)
     * @date 2017-09-26 14:26:39
     * @param ids
     * @return
     */ 
    public void deleteExtWlSmMultiloanByPrimaryKey(Map<String, Object> paramMap);

    public void updateExtWlSmMultiloanByIntocustid(Map<String, Object> paramMap);
    
    
}
