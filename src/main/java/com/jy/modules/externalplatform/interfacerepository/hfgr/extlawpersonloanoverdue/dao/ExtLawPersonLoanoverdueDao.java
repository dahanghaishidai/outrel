package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonloanoverdue.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersonloanoverdue.dto.ExtLawPersonLoanoverdueDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawPersonLoanoverdueDao
 * @description: 定义  汇法网个人网贷逾期表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawPersonLoanoverdueDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网个人网贷逾期表
     * @date 2017-05-31 11:11:13
     * @param searchParams
     * @return
     */
    public List<ExtLawPersonLoanoverdueDTO> searchExtLawPersonLoanoverdueByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网个人网贷逾期表
     * @date 2017-05-31 11:11:13
     * @param searchParams
     * @return
     */
    public List<ExtLawPersonLoanoverdueDTO> searchExtLawPersonLoanoverdue(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网个人网贷逾期表
     * @date 2017-05-31 11:11:13
     * @param id
     * @return
     */
    public ExtLawPersonLoanoverdueDTO findExtLawPersonLoanoverdueByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网个人网贷逾期表
     * @date 2017-05-31 11:11:13
     * @param paramMap
     * @return
     */
    public int insertExtLawPersonLoanoverdue(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网个人网贷逾期表
     * @date 2017-05-31 11:11:13
     * @param paramMap
     */
    public void updateExtLawPersonLoanoverdue(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网个人网贷逾期表
     * @date 2017-05-31 11:11:13
     * @param ids
     * @return
     */ 
    public void deleteExtLawPersonLoanoverdueByPrimaryKey(Map<String, Object> paramMap);
    
    
}
