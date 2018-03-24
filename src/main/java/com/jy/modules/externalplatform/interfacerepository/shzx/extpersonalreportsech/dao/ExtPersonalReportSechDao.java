package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportsech.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportsech.dto.ExtPersonalReportSechDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtPersonalReportSechDao
 * @description: 定义  网络金融版个人信用报告-查询记录 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtPersonalReportSechDao {
    
    /**
     * @author Administrator
     * @description: 分页查询网络金融版个人信用报告-查询记录
     * @date 2017-06-05 10:07:55
     * @param searchParams
     * @return
     */
    public List<ExtPersonalReportSechDTO> searchExtPersonalReportSechByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象网络金融版个人信用报告-查询记录
     * @date 2017-06-05 10:07:55
     * @param searchParams
     * @return
     */
    public List<ExtPersonalReportSechDTO> searchExtPersonalReportSech(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象网络金融版个人信用报告-查询记录
     * @date 2017-06-05 10:07:55
     * @param id
     * @return
     */
    public ExtPersonalReportSechDTO findExtPersonalReportSechByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象网络金融版个人信用报告-查询记录
     * @date 2017-06-05 10:07:55
     * @param paramMap
     * @return
     */
    public int insertExtPersonalReportSech(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象网络金融版个人信用报告-查询记录
     * @date 2017-06-05 10:07:55
     * @param paramMap
     */
    public void updateExtPersonalReportSech(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除网络金融版个人信用报告-查询记录
     * @date 2017-06-05 10:07:55
     * @param ids
     * @return
     */ 
    public void deleteExtPersonalReportSechByPrimaryKey(Map<String, Object> paramMap);
    
    
}
