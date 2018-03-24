package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphonenames.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphonenames.dto.ExtWlJxlMgPhonenamesDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgPhonenamesDao
 * @description: 定义  手机号码存疑绑定其他姓名表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgPhonenamesDao {
    
    /**
     * @author Administrator
     * @description: 分页查询手机号码存疑绑定其他姓名表
     * @date 2017-12-14 13:58:13
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgPhonenamesDTO> searchExtWlJxlMgPhonenamesByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象手机号码存疑绑定其他姓名表
     * @date 2017-12-14 13:58:13
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgPhonenamesDTO> searchExtWlJxlMgPhonenames(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象手机号码存疑绑定其他姓名表
     * @date 2017-12-14 13:58:13
     * @param id
     * @return
     */
    public ExtWlJxlMgPhonenamesDTO findExtWlJxlMgPhonenamesByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象手机号码存疑绑定其他姓名表
     * @date 2017-12-14 13:58:13
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgPhonenames(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象手机号码存疑绑定其他姓名表
     * @date 2017-12-14 13:58:13
     * @param paramMap
     */
    public void updateExtWlJxlMgPhonenames(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除手机号码存疑绑定其他姓名表
     * @date 2017-12-14 13:58:13
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgPhonenamesByPrimaryKey(Map<String, Object> paramMap);
    
    
}
