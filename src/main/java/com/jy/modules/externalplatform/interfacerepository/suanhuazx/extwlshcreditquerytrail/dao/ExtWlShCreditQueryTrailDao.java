package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditquerytrail.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditquerytrail.dto.ExtWlShCreditQueryTrailDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShCreditQueryTrailDao
 * @description: 定义  算话人行信用报告查询轨迹表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShCreditQueryTrailDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行信用报告查询轨迹表
     * @date 2017-12-21 19:45:41
     * @param searchParams
     * @return
     */
    public List<ExtWlShCreditQueryTrailDTO> searchExtWlShCreditQueryTrailByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行信用报告查询轨迹表
     * @date 2017-12-21 19:45:41
     * @param searchParams
     * @return
     */
    public List<ExtWlShCreditQueryTrailDTO> searchExtWlShCreditQueryTrail(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行信用报告查询轨迹表
     * @date 2017-12-21 19:45:41
     * @param id
     * @return
     */
    public ExtWlShCreditQueryTrailDTO findExtWlShCreditQueryTrailByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行信用报告查询轨迹表
     * @date 2017-12-21 19:45:41
     * @param paramMap
     * @return
     */
    public int insertExtWlShCreditQueryTrail(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行信用报告查询轨迹表
     * @date 2017-12-21 19:45:41
     * @param paramMap
     */
    public void updateExtWlShCreditQueryTrail(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行信用报告查询轨迹表
     * @date 2017-12-21 19:45:41
     * @param ids
     * @return
     */ 
    public void deleteExtWlShCreditQueryTrailByPrimaryKey(Map<String, Object> paramMap);
    
    
}
