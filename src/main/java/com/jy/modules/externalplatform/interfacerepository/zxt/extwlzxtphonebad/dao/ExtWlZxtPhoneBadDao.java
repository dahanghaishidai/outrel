package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtphonebad.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtphonebad.dto.ExtWlZxtPhoneBadDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZxtPhoneBadDao
 * @description: 定义  个人/关联人-手机号码负面标注信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZxtPhoneBadDao {
    
    /**
     * @author Administrator
     * @description: 分页查询个人/关联人-手机号码负面标注信息
     * @date 2017-12-18 11:33:44
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtPhoneBadDTO> searchExtWlZxtPhoneBadByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象个人/关联人-手机号码负面标注信息
     * @date 2017-12-18 11:33:44
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtPhoneBadDTO> searchExtWlZxtPhoneBad(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象个人/关联人-手机号码负面标注信息
     * @date 2017-12-18 11:33:44
     * @param id
     * @return
     */
    public ExtWlZxtPhoneBadDTO findExtWlZxtPhoneBadByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象个人/关联人-手机号码负面标注信息
     * @date 2017-12-18 11:33:44
     * @param paramMap
     * @return
     */
    public int insertExtWlZxtPhoneBad(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象个人/关联人-手机号码负面标注信息
     * @date 2017-12-18 11:33:44
     * @param paramMap
     */
    public void updateExtWlZxtPhoneBad(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除个人/关联人-手机号码负面标注信息
     * @date 2017-12-18 11:33:44
     * @param ids
     * @return
     */ 
    public void deleteExtWlZxtPhoneBadByPrimaryKey(Map<String, Object> paramMap);
    
    
}
