package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardorgs.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardorgs.dto.ExtWlJxlMgIdcardorgsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgIdcardorgsDao
 * @description: 定义  身份证号码存疑机构表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgIdcardorgsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询身份证号码存疑机构表
     * @date 2017-12-14 13:57:28
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgIdcardorgsDTO> searchExtWlJxlMgIdcardorgsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象身份证号码存疑机构表
     * @date 2017-12-14 13:57:28
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgIdcardorgsDTO> searchExtWlJxlMgIdcardorgs(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象身份证号码存疑机构表
     * @date 2017-12-14 13:57:28
     * @param id
     * @return
     */
    public ExtWlJxlMgIdcardorgsDTO findExtWlJxlMgIdcardorgsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象身份证号码存疑机构表
     * @date 2017-12-14 13:57:28
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgIdcardorgs(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象身份证号码存疑机构表
     * @date 2017-12-14 13:57:28
     * @param paramMap
     */
    public void updateExtWlJxlMgIdcardorgs(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除身份证号码存疑机构表
     * @date 2017-12-14 13:57:28
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgIdcardorgsByPrimaryKey(Map<String, Object> paramMap);
    
    
}
