package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportaddr.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportaddr.dto.ExtPersonalReportAddrDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtPersonalReportAddrDao
 * @description: 定义  网络金融版个人信用报告-地址 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtPersonalReportAddrDao {
    
    /**
     * @author Administrator
     * @description: 分页查询网络金融版个人信用报告-地址
     * @date 2017-06-05 10:08:24
     * @param searchParams
     * @return
     */
    public List<ExtPersonalReportAddrDTO> searchExtPersonalReportAddrByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象网络金融版个人信用报告-地址
     * @date 2017-06-05 10:08:24
     * @param searchParams
     * @return
     */
    public List<ExtPersonalReportAddrDTO> searchExtPersonalReportAddr(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象网络金融版个人信用报告-地址
     * @date 2017-06-05 10:08:24
     * @param id
     * @return
     */
    public ExtPersonalReportAddrDTO findExtPersonalReportAddrByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象网络金融版个人信用报告-地址
     * @date 2017-06-05 10:08:24
     * @param paramMap
     * @return
     */
    public int insertExtPersonalReportAddr(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象网络金融版个人信用报告-地址
     * @date 2017-06-05 10:08:24
     * @param paramMap
     */
    public void updateExtPersonalReportAddr(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除网络金融版个人信用报告-地址
     * @date 2017-06-05 10:08:24
     * @param ids
     * @return
     */ 
    public void deleteExtPersonalReportAddrByPrimaryKey(Map<String, Object> paramMap);
    
    
}
