package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbdcreditscore.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbdcreditscore.dto.ExtWlBdCreditScoreDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBdCreditScoreDao
 * @description: 定义  百度_PREA信用分 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBdCreditScoreDao {
    
    /**
     * @author Administrator
     * @description: 分页查询百度_PREA信用分
     * @date 2017-12-19 20:13:38
     * @param searchParams
     * @return
     */
    public List<ExtWlBdCreditScoreDTO> searchExtWlBdCreditScoreByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象百度_PREA信用分
     * @date 2017-12-19 20:13:38
     * @param searchParams
     * @return
     */
    public List<ExtWlBdCreditScoreDTO> searchExtWlBdCreditScore(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象百度_PREA信用分
     * @date 2017-12-19 20:13:38
     * @param id
     * @return
     */
    public ExtWlBdCreditScoreDTO findExtWlBdCreditScoreByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象百度_PREA信用分
     * @date 2017-12-19 20:13:38
     * @param paramMap
     * @return
     */
    public int insertExtWlBdCreditScore(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象百度_PREA信用分
     * @date 2017-12-19 20:13:38
     * @param paramMap
     */
    public void updateExtWlBdCreditScore(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除百度_PREA信用分
     * @date 2017-12-19 20:13:38
     * @param ids
     * @return
     */ 
    public void deleteExtWlBdCreditScoreByPrimaryKey(Map<String, Object> paramMap);
    
    
}
