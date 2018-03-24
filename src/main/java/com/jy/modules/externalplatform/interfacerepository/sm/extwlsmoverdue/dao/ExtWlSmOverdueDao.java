package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmoverdue.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmoverdue.dto.ExtWlSmOverdueDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlSmOverdueDao
 * @description: 定义  数美逾期黑名单服务信息(外联平台表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlSmOverdueDao {
    
    /**
     * @author Administrator
     * @description: 分页查询数美逾期黑名单服务信息(外联平台表)
     * @date 2017-09-26 14:26:46
     * @param searchParams
     * @return
     */
    public List<ExtWlSmOverdueDTO> searchExtWlSmOverdueByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象数美逾期黑名单服务信息(外联平台表)
     * @date 2017-09-26 14:26:46
     * @param searchParams
     * @return
     */
    public List<ExtWlSmOverdueDTO> searchExtWlSmOverdue(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象数美逾期黑名单服务信息(外联平台表)
     * @date 2017-09-26 14:26:46
     * @param id
     * @return
     */
    public ExtWlSmOverdueDTO findExtWlSmOverdueByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象数美逾期黑名单服务信息(外联平台表)
     * @date 2017-09-26 14:26:46
     * @param paramMap
     * @return
     */
    public int insertExtWlSmOverdue(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象数美逾期黑名单服务信息(外联平台表)
     * @date 2017-09-26 14:26:46
     * @param paramMap
     */
    public void updateExtWlSmOverdue(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除数美逾期黑名单服务信息(外联平台表)
     * @date 2017-09-26 14:26:46
     * @param ids
     * @return
     */ 
    public void deleteExtWlSmOverdueByPrimaryKey(Map<String, Object> paramMap);

    public void updateExtWlSmOverdueByInfocustid(Map<String, Object> paramMap);
    
    
}
