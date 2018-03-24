package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecremote.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecremote.dto.ExtWlShareCRemoteDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShareCRemoteDao
 * @description: 定义  算话共享报告_信贷信息概要（长期未更新信贷信息概要） 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShareCRemoteDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_信贷信息概要（长期未更新信贷信息概要）
     * @date 2017-12-07 19:53:22
     * @param searchParams
     * @return
     */
    public List<ExtWlShareCRemoteDTO> searchExtWlShareCRemoteByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_信贷信息概要（长期未更新信贷信息概要）
     * @date 2017-12-07 19:53:22
     * @param searchParams
     * @return
     */
    public List<ExtWlShareCRemoteDTO> searchExtWlShareCRemote(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_信贷信息概要（长期未更新信贷信息概要）
     * @date 2017-12-07 19:53:22
     * @param id
     * @return
     */
    public ExtWlShareCRemoteDTO findExtWlShareCRemoteByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_信贷信息概要（长期未更新信贷信息概要）
     * @date 2017-12-07 19:53:22
     * @param paramMap
     * @return
     */
    public int insertExtWlShareCRemote(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_信贷信息概要（长期未更新信贷信息概要）
     * @date 2017-12-07 19:53:22
     * @param paramMap
     */
    public void updateExtWlShareCRemote(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_信贷信息概要（长期未更新信贷信息概要）
     * @date 2017-12-07 19:53:22
     * @param ids
     * @return
     */ 
    public void deleteExtWlShareCRemoteByPrimaryKey(Map<String, Object> paramMap);
    
    
}
