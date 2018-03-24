package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontactrfm.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcontactrfm.dto.ExtWlJxlMgContactRfmDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgContactRfmDao
 * @description: 定义  EXT_WL_JXL_MG_CONTACT_RFM 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgContactRfmDao {
    
    /**
     * @author Administrator
     * @description: 分页查询EXT_WL_JXL_MG_CONTACT_RFM
     * @date 2018-01-09 17:44:42
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgContactRfmDTO> searchExtWlJxlMgContactRfmByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象EXT_WL_JXL_MG_CONTACT_RFM
     * @date 2018-01-09 17:44:42
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgContactRfmDTO> searchExtWlJxlMgContactRfm(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象EXT_WL_JXL_MG_CONTACT_RFM
     * @date 2018-01-09 17:44:42
     * @param id
     * @return
     */
    public ExtWlJxlMgContactRfmDTO findExtWlJxlMgContactRfmByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象EXT_WL_JXL_MG_CONTACT_RFM
     * @date 2018-01-09 17:44:42
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgContactRfm(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象EXT_WL_JXL_MG_CONTACT_RFM
     * @date 2018-01-09 17:44:42
     * @param paramMap
     */
    public void updateExtWlJxlMgContactRfm(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除EXT_WL_JXL_MG_CONTACT_RFM
     * @date 2018-01-09 17:44:42
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgContactRfmByPrimaryKey(Map<String, Object> paramMap);
    
    
}
