package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardnames.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgidcardnames.dto.ExtWlJxlMgIdcardnamesDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgIdcardnamesDao
 * @description: 定义  身份证号码存疑绑定其他姓名表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgIdcardnamesDao {
    
    /**
     * @author Administrator
     * @description: 分页查询身份证号码存疑绑定其他姓名表
     * @date 2017-12-14 13:57:08
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgIdcardnamesDTO> searchExtWlJxlMgIdcardnamesByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象身份证号码存疑绑定其他姓名表
     * @date 2017-12-14 13:57:08
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgIdcardnamesDTO> searchExtWlJxlMgIdcardnames(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象身份证号码存疑绑定其他姓名表
     * @date 2017-12-14 13:57:08
     * @param id
     * @return
     */
    public ExtWlJxlMgIdcardnamesDTO findExtWlJxlMgIdcardnamesByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象身份证号码存疑绑定其他姓名表
     * @date 2017-12-14 13:57:08
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgIdcardnames(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象身份证号码存疑绑定其他姓名表
     * @date 2017-12-14 13:57:08
     * @param paramMap
     */
    public void updateExtWlJxlMgIdcardnames(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除身份证号码存疑绑定其他姓名表
     * @date 2017-12-14 13:57:08
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgIdcardnamesByPrimaryKey(Map<String, Object> paramMap);
    
    
}
