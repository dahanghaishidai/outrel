package com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverduedetail.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.xy.extwlxyoverduedetail.dto.ExtWlXyOverdueDetailDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlXyOverdueDetailDao
 * @description: 定义  新颜逾期信息详情表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlXyOverdueDetailDao {
    
    /**
     * @author Administrator
     * @description: 分页查询新颜逾期信息详情表
     * @date 2017-12-12 16:17:24
     * @param searchParams
     * @return
     */
    public List<ExtWlXyOverdueDetailDTO> searchExtWlXyOverdueDetailByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象新颜逾期信息详情表
     * @date 2017-12-12 16:17:24
     * @param searchParams
     * @return
     */
    public List<ExtWlXyOverdueDetailDTO> searchExtWlXyOverdueDetail(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象新颜逾期信息详情表
     * @date 2017-12-12 16:17:24
     * @param id
     * @return
     */
    public ExtWlXyOverdueDetailDTO findExtWlXyOverdueDetailByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象新颜逾期信息详情表
     * @date 2017-12-12 16:17:24
     * @param paramMap
     * @return
     */
    public int insertExtWlXyOverdueDetail(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象新颜逾期信息详情表
     * @date 2017-12-12 16:17:24
     * @param paramMap
     */
    public void updateExtWlXyOverdueDetail(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除新颜逾期信息详情表
     * @date 2017-12-12 16:17:24
     * @param ids
     * @return
     */ 
    public void deleteExtWlXyOverdueDetailByPrimaryKey(Map<String, Object> paramMap);
    
    
}
