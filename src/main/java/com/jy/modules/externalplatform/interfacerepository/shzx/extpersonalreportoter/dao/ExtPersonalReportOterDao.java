package com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportoter.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.shzx.extpersonalreportoter.dto.ExtPersonalReportOterDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtPersonalReportOterDao
 * @description: 定义  网络金融版个人信用报告-为他人担保 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtPersonalReportOterDao {
    
    /**
     * @author Administrator
     * @description: 分页查询网络金融版个人信用报告-为他人担保
     * @date 2017-06-05 10:08:51
     * @param searchParams
     * @return
     */
    public List<ExtPersonalReportOterDTO> searchExtPersonalReportOterByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象网络金融版个人信用报告-为他人担保
     * @date 2017-06-05 10:08:51
     * @param searchParams
     * @return
     */
    public List<ExtPersonalReportOterDTO> searchExtPersonalReportOter(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象网络金融版个人信用报告-为他人担保
     * @date 2017-06-05 10:08:51
     * @param id
     * @return
     */
    public ExtPersonalReportOterDTO findExtPersonalReportOterByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象网络金融版个人信用报告-为他人担保
     * @date 2017-06-05 10:08:51
     * @param paramMap
     * @return
     */
    public int insertExtPersonalReportOter(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象网络金融版个人信用报告-为他人担保
     * @date 2017-06-05 10:08:51
     * @param paramMap
     */
    public void updateExtPersonalReportOter(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除网络金融版个人信用报告-为他人担保
     * @date 2017-06-05 10:08:51
     * @param ids
     * @return
     */ 
    public void deleteExtPersonalReportOterByPrimaryKey(Map<String, Object> paramMap);
    
    
}
