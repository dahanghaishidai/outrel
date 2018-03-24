package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneidcards.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgphoneidcards.dto.ExtWlJxlMgPhoneidcardsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgPhoneidcardsDao
 * @description: 定义  手机号码存疑绑定其他身份证号表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgPhoneidcardsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询手机号码存疑绑定其他身份证号表
     * @date 2017-12-14 13:57:55
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgPhoneidcardsDTO> searchExtWlJxlMgPhoneidcardsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象手机号码存疑绑定其他身份证号表
     * @date 2017-12-14 13:57:55
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgPhoneidcardsDTO> searchExtWlJxlMgPhoneidcards(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象手机号码存疑绑定其他身份证号表
     * @date 2017-12-14 13:57:55
     * @param id
     * @return
     */
    public ExtWlJxlMgPhoneidcardsDTO findExtWlJxlMgPhoneidcardsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象手机号码存疑绑定其他身份证号表
     * @date 2017-12-14 13:57:55
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgPhoneidcards(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象手机号码存疑绑定其他身份证号表
     * @date 2017-12-14 13:57:55
     * @param paramMap
     */
    public void updateExtWlJxlMgPhoneidcards(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除手机号码存疑绑定其他身份证号表
     * @date 2017-12-14 13:57:55
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgPhoneidcardsByPrimaryKey(Map<String, Object> paramMap);
    
    
}
