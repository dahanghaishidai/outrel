package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyother.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyother.dto.ExtLawCompanyOtherDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawCompanyOtherDao
 * @description: 定义  汇法网企业其他司法公告信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawCompanyOtherDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网企业其他司法公告信息表
     * @date 2017-06-01 10:12:13
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyOtherDTO> searchExtLawCompanyOtherByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网企业其他司法公告信息表
     * @date 2017-06-01 10:12:13
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyOtherDTO> searchExtLawCompanyOther(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网企业其他司法公告信息表
     * @date 2017-06-01 10:12:13
     * @param id
     * @return
     */
    public ExtLawCompanyOtherDTO findExtLawCompanyOtherByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网企业其他司法公告信息表
     * @date 2017-06-01 10:12:13
     * @param paramMap
     * @return
     */
    public int insertExtLawCompanyOther(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网企业其他司法公告信息表
     * @date 2017-06-01 10:12:13
     * @param paramMap
     */
    public void updateExtLawCompanyOther(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网企业其他司法公告信息表
     * @date 2017-06-01 10:12:13
     * @param ids
     * @return
     */ 
    public void deleteExtLawCompanyOtherByPrimaryKey(Map<String, Object> paramMap);
    
    
}
