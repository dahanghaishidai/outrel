package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportspec.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportspec.dto.ExtPersonalReportSpecDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtPersonalReportSpecDao
 * @description: 定义  网络金融版个人信用报告-特殊交易信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtPersonalReportSpecDao {
    
    /**
     * @author Administrator
     * @description: 分页查询网络金融版个人信用报告-特殊交易信息
     * @date 2017-06-05 10:08:39
     * @param searchParams
     * @return
     */
    public List<ExtPersonalReportSpecDTO> searchExtPersonalReportSpecByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象网络金融版个人信用报告-特殊交易信息
     * @date 2017-06-05 10:08:39
     * @param searchParams
     * @return
     */
    public List<ExtPersonalReportSpecDTO> searchExtPersonalReportSpec(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象网络金融版个人信用报告-特殊交易信息
     * @date 2017-06-05 10:08:39
     * @param id
     * @return
     */
    public ExtPersonalReportSpecDTO findExtPersonalReportSpecByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象网络金融版个人信用报告-特殊交易信息
     * @date 2017-06-05 10:08:39
     * @param paramMap
     * @return
     */
    public int insertExtPersonalReportSpec(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象网络金融版个人信用报告-特殊交易信息
     * @date 2017-06-05 10:08:39
     * @param paramMap
     */
    public void updateExtPersonalReportSpec(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除网络金融版个人信用报告-特殊交易信息
     * @date 2017-06-05 10:08:39
     * @param ids
     * @return
     */ 
    public void deleteExtPersonalReportSpecByPrimaryKey(Map<String, Object> paramMap);
    
    
}
