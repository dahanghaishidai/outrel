package com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncq.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfgr.extlawpersoncq.dto.ExtLawPersonCqDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawPersonCqDao
 * @description: 定义  汇法网个人催欠公告表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawPersonCqDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网个人催欠公告表
     * @date 2017-05-31 11:10:53
     * @param searchParams
     * @return
     */
    public List<ExtLawPersonCqDTO> searchExtLawPersonCqByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网个人催欠公告表
     * @date 2017-05-31 11:10:53
     * @param searchParams
     * @return
     */
    public List<ExtLawPersonCqDTO> searchExtLawPersonCq(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网个人催欠公告表
     * @date 2017-05-31 11:10:53
     * @param id
     * @return
     */
    public ExtLawPersonCqDTO findExtLawPersonCqByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网个人催欠公告表
     * @date 2017-05-31 11:10:53
     * @param paramMap
     * @return
     */
    public int insertExtLawPersonCq(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网个人催欠公告表
     * @date 2017-05-31 11:10:53
     * @param paramMap
     */
    public void updateExtLawPersonCq(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网个人催欠公告表
     * @date 2017-05-31 11:10:53
     * @param ids
     * @return
     */ 
    public void deleteExtLawPersonCqByPrimaryKey(Map<String, Object> paramMap);
    
    
}
