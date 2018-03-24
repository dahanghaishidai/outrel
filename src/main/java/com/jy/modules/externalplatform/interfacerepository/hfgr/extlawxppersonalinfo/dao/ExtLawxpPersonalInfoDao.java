package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawxppersonalinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawxppersonalinfo.dto.ExtLawxpPersonalInfoDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawxpPersonalInfoDao
 * @description: 定义  汇法网个人信息主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawxpPersonalInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网个人信息主表
     * @date 2017-05-31 11:09:16
     * @param searchParams
     * @return
     */
    public List<ExtLawxpPersonalInfoDTO> searchExtLawxpPersonalInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网个人信息主表
     * @date 2017-05-31 11:09:16
     * @param searchParams
     * @return
     */
    public List<ExtLawxpPersonalInfoDTO> searchExtLawxpPersonalInfo(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网个人信息主表
     * @date 2017-05-31 11:09:16
     * @param id
     * @return
     */
    public ExtLawxpPersonalInfoDTO findExtLawxpPersonalInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网个人信息主表
     * @date 2017-05-31 11:09:16
     * @param paramMap
     * @return
     */
    public int insertExtLawxpPersonalInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网个人信息主表
     * @date 2017-05-31 11:09:16
     * @param paramMap
     */
    public void updateExtLawxpPersonalInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网个人信息主表
     * @date 2017-05-31 11:09:16
     * @param ids
     * @return
     */ 
    public void deleteExtLawxpPersonalInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
