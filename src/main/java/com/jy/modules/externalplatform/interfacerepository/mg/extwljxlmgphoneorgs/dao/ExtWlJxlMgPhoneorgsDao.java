package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneorgs.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneorgs.dto.ExtWlJxlMgPhoneorgsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgPhoneorgsDao
 * @description: 定义  手机号码存疑其机构表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgPhoneorgsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询手机号码存疑其机构表
     * @date 2017-12-14 13:58:39
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgPhoneorgsDTO> searchExtWlJxlMgPhoneorgsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象手机号码存疑其机构表
     * @date 2017-12-14 13:58:39
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgPhoneorgsDTO> searchExtWlJxlMgPhoneorgs(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象手机号码存疑其机构表
     * @date 2017-12-14 13:58:39
     * @param id
     * @return
     */
    public ExtWlJxlMgPhoneorgsDTO findExtWlJxlMgPhoneorgsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象手机号码存疑其机构表
     * @date 2017-12-14 13:58:39
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgPhoneorgs(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象手机号码存疑其机构表
     * @date 2017-12-14 13:58:39
     * @param paramMap
     */
    public void updateExtWlJxlMgPhoneorgs(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除手机号码存疑其机构表
     * @date 2017-12-14 13:58:39
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgPhoneorgsByPrimaryKey(Map<String, Object> paramMap);
    
    
}
