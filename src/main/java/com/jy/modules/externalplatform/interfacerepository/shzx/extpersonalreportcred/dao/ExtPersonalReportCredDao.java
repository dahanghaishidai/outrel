package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportcred.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportcred.dto.ExtPersonalReportCredDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtPersonalReportCredDao
 * @description: 定义  网络金融版个人信用报告-贷款 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtPersonalReportCredDao {
    
    /**
     * @author Administrator
     * @description: 分页查询网络金融版个人信用报告-贷款
     * @date 2017-06-05 10:08:10
     * @param searchParams
     * @return
     */
    public List<ExtPersonalReportCredDTO> searchExtPersonalReportCredByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象网络金融版个人信用报告-贷款
     * @date 2017-06-05 10:08:10
     * @param searchParams
     * @return
     */
    public List<ExtPersonalReportCredDTO> searchExtPersonalReportCred(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象网络金融版个人信用报告-贷款
     * @date 2017-06-05 10:08:10
     * @param id
     * @return
     */
    public ExtPersonalReportCredDTO findExtPersonalReportCredByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象网络金融版个人信用报告-贷款
     * @date 2017-06-05 10:08:10
     * @param paramMap
     * @return
     */
    public int insertExtPersonalReportCred(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象网络金融版个人信用报告-贷款
     * @date 2017-06-05 10:08:10
     * @param paramMap
     */
    public void updateExtPersonalReportCred(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除网络金融版个人信用报告-贷款
     * @date 2017-06-05 10:08:10
     * @param ids
     * @return
     */ 
    public void deleteExtPersonalReportCredByPrimaryKey(Map<String, Object> paramMap);
    
    
}
