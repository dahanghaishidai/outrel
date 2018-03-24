package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycq.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanycq.dto.ExtLawCompanyCqDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawCompanyCqDao
 * @description: 定义  汇法网企业催欠公告表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawCompanyCqDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网企业催欠公告表
     * @date 2017-06-01 10:11:27
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyCqDTO> searchExtLawCompanyCqByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网企业催欠公告表
     * @date 2017-06-01 10:11:27
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyCqDTO> searchExtLawCompanyCq(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网企业催欠公告表
     * @date 2017-06-01 10:11:27
     * @param id
     * @return
     */
    public ExtLawCompanyCqDTO findExtLawCompanyCqByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网企业催欠公告表
     * @date 2017-06-01 10:11:27
     * @param paramMap
     * @return
     */
    public int insertExtLawCompanyCq(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网企业催欠公告表
     * @date 2017-06-01 10:11:27
     * @param paramMap
     */
    public void updateExtLawCompanyCq(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网企业催欠公告表
     * @date 2017-06-01 10:11:27
     * @param ids
     * @return
     */ 
    public void deleteExtLawCompanyCqByPrimaryKey(Map<String, Object> paramMap);
    
    
}
