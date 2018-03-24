package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrgeneralinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrgeneralinfo.dto.ExtWlShSrGeneralInfoDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShSrGeneralInfoDao
 * @description: 定义  算话人行结构化版(汇总信息表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShSrGeneralInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行结构化版(汇总信息表)
     * @date 2017-12-21 19:54:35
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrGeneralInfoDTO> searchExtWlShSrGeneralInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(汇总信息表)
     * @date 2017-12-21 19:54:35
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrGeneralInfoDTO> searchExtWlShSrGeneralInfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(汇总信息表)
     * @date 2017-12-21 19:54:35
     * @param id
     * @return
     */
    public ExtWlShSrGeneralInfoDTO findExtWlShSrGeneralInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行结构化版(汇总信息表)
     * @date 2017-12-21 19:54:35
     * @param paramMap
     * @return
     */
    public int insertExtWlShSrGeneralInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行结构化版(汇总信息表)
     * @date 2017-12-21 19:54:35
     * @param paramMap
     */
    public void updateExtWlShSrGeneralInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行结构化版(汇总信息表)
     * @date 2017-12-21 19:54:35
     * @param ids
     * @return
     */ 
    public void deleteExtWlShSrGeneralInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
