package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtidentifyloss.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtidentifyloss.dto.ExtWlZxtIdentifyLossDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZxtIdentifyLossDao
 * @description: 定义  身份证挂失信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZxtIdentifyLossDao {
    
    /**
     * @author Administrator
     * @description: 分页查询身份证挂失信息
     * @date 2017-12-18 11:33:56
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtIdentifyLossDTO> searchExtWlZxtIdentifyLossByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象身份证挂失信息
     * @date 2017-12-18 11:33:56
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtIdentifyLossDTO> searchExtWlZxtIdentifyLoss(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象身份证挂失信息
     * @date 2017-12-18 11:33:56
     * @param id
     * @return
     */
    public ExtWlZxtIdentifyLossDTO findExtWlZxtIdentifyLossByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象身份证挂失信息
     * @date 2017-12-18 11:33:56
     * @param paramMap
     * @return
     */
    public int insertExtWlZxtIdentifyLoss(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象身份证挂失信息
     * @date 2017-12-18 11:33:56
     * @param paramMap
     */
    public void updateExtWlZxtIdentifyLoss(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除身份证挂失信息
     * @date 2017-12-18 11:33:56
     * @param ids
     * @return
     */ 
    public void deleteExtWlZxtIdentifyLossByPrimaryKey(Map<String, Object> paramMap);
    
    
}
