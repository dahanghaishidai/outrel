package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepaddresses.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepaddresses.dto.ExtWlSharePAddressesDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlSharePAddressesDao
 * @description: 定义  算话共享报告_身份信息概要（通讯地址信息） 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlSharePAddressesDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_身份信息概要（通讯地址信息）
     * @date 2017-12-07 19:52:53
     * @param searchParams
     * @return
     */
    public List<ExtWlSharePAddressesDTO> searchExtWlSharePAddressesByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_身份信息概要（通讯地址信息）
     * @date 2017-12-07 19:52:53
     * @param searchParams
     * @return
     */
    public List<ExtWlSharePAddressesDTO> searchExtWlSharePAddresses(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_身份信息概要（通讯地址信息）
     * @date 2017-12-07 19:52:53
     * @param id
     * @return
     */
    public ExtWlSharePAddressesDTO findExtWlSharePAddressesByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_身份信息概要（通讯地址信息）
     * @date 2017-12-07 19:52:53
     * @param paramMap
     * @return
     */
    public int insertExtWlSharePAddresses(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_身份信息概要（通讯地址信息）
     * @date 2017-12-07 19:52:53
     * @param paramMap
     */
    public void updateExtWlSharePAddresses(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_身份信息概要（通讯地址信息）
     * @date 2017-12-07 19:52:53
     * @param ids
     * @return
     */ 
    public void deleteExtWlSharePAddressesByPrimaryKey(Map<String, Object> paramMap);

    public int insertExtWlSharePAddressesList(Map<String, Object> paramMap);
    
    
}
