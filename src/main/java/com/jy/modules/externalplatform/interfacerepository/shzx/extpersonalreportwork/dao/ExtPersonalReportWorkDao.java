package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportwork.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportwork.dto.ExtPersonalReportWorkDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtPersonalReportWorkDao
 * @description: 定义  网络金融版个人信用报告-工作 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtPersonalReportWorkDao {
    
    /**
     * @author Administrator
     * @description: 分页查询网络金融版个人信用报告-工作
     * @date 2017-06-05 10:09:01
     * @param searchParams
     * @return
     */
    public List<ExtPersonalReportWorkDTO> searchExtPersonalReportWorkByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象网络金融版个人信用报告-工作
     * @date 2017-06-05 10:09:01
     * @param searchParams
     * @return
     */
    public List<ExtPersonalReportWorkDTO> searchExtPersonalReportWork(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象网络金融版个人信用报告-工作
     * @date 2017-06-05 10:09:01
     * @param id
     * @return
     */
    public ExtPersonalReportWorkDTO findExtPersonalReportWorkByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象网络金融版个人信用报告-工作
     * @date 2017-06-05 10:09:01
     * @param paramMap
     * @return
     */
    public int insertExtPersonalReportWork(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象网络金融版个人信用报告-工作
     * @date 2017-06-05 10:09:01
     * @param paramMap
     */
    public void updateExtPersonalReportWork(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除网络金融版个人信用报告-工作
     * @date 2017-06-05 10:09:01
     * @param ids
     * @return
     */ 
    public void deleteExtPersonalReportWorkByPrimaryKey(Map<String, Object> paramMap);
    
    
}
