package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardphones.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardphones.dto.ExtWlJxlMgIdcardphonesDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgIdcardphonesDao
 * @description: 定义  身份证号码存疑绑定其他手机表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgIdcardphonesDao {
    
    /**
     * @author Administrator
     * @description: 分页查询身份证号码存疑绑定其他手机表
     * @date 2017-12-14 13:56:42
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgIdcardphonesDTO> searchExtWlJxlMgIdcardphonesByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象身份证号码存疑绑定其他手机表
     * @date 2017-12-14 13:56:42
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgIdcardphonesDTO> searchExtWlJxlMgIdcardphones(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象身份证号码存疑绑定其他手机表
     * @date 2017-12-14 13:56:42
     * @param id
     * @return
     */
    public ExtWlJxlMgIdcardphonesDTO findExtWlJxlMgIdcardphonesByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象身份证号码存疑绑定其他手机表
     * @date 2017-12-14 13:56:42
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgIdcardphones(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象身份证号码存疑绑定其他手机表
     * @date 2017-12-14 13:56:42
     * @param paramMap
     */
    public void updateExtWlJxlMgIdcardphones(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除身份证号码存疑绑定其他手机表
     * @date 2017-12-14 13:56:42
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgIdcardphonesByPrimaryKey(Map<String, Object> paramMap);
    
    
}
