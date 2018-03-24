package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyopencourt.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanyopencourt.dto.ExtLawCompanyOpencourtDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawCompanyOpencourtDao
 * @description: 定义  汇法网企业开庭公告信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawCompanyOpencourtDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网企业开庭公告信息表
     * @date 2017-06-01 10:11:56
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyOpencourtDTO> searchExtLawCompanyOpencourtByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网企业开庭公告信息表
     * @date 2017-06-01 10:11:56
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyOpencourtDTO> searchExtLawCompanyOpencourt(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网企业开庭公告信息表
     * @date 2017-06-01 10:11:56
     * @param id
     * @return
     */
    public ExtLawCompanyOpencourtDTO findExtLawCompanyOpencourtByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网企业开庭公告信息表
     * @date 2017-06-01 10:11:56
     * @param paramMap
     * @return
     */
    public int insertExtLawCompanyOpencourt(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网企业开庭公告信息表
     * @date 2017-06-01 10:11:56
     * @param paramMap
     */
    public void updateExtLawCompanyOpencourt(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网企业开庭公告信息表
     * @date 2017-06-01 10:11:56
     * @param ids
     * @return
     */ 
    public void deleteExtLawCompanyOpencourtByPrimaryKey(Map<String, Object> paramMap);
    
    
}
