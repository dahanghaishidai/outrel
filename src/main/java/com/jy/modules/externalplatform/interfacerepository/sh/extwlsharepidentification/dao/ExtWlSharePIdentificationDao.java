package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepidentification.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepidentification.dto.ExtWlSharePIdentificationDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlSharePIdentificationDao
 * @description: 定义  算话共享报告_身份信息概要(身份信息) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlSharePIdentificationDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_身份信息概要(身份信息)
     * @date 2017-12-07 19:52:47
     * @param searchParams
     * @return
     */
    public List<ExtWlSharePIdentificationDTO> searchExtWlSharePIdentificationByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_身份信息概要(身份信息)
     * @date 2017-12-07 19:52:47
     * @param searchParams
     * @return
     */
    public List<ExtWlSharePIdentificationDTO> searchExtWlSharePIdentification(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_身份信息概要(身份信息)
     * @date 2017-12-07 19:52:47
     * @param id
     * @return
     */
    public ExtWlSharePIdentificationDTO findExtWlSharePIdentificationByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_身份信息概要(身份信息)
     * @date 2017-12-07 19:52:47
     * @param paramMap
     * @return
     */
    public int insertExtWlSharePIdentification(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_身份信息概要(身份信息)
     * @date 2017-12-07 19:52:47
     * @param paramMap
     */
    public void updateExtWlSharePIdentification(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_身份信息概要(身份信息)
     * @date 2017-12-07 19:52:47
     * @param ids
     * @return
     */ 
    public void deleteExtWlSharePIdentificationByPrimaryKey(Map<String, Object> paramMap);
    
    
}
