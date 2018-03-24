package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrbasicinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrbasicinfo.dto.ExtWlShSrBasicInfoDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShSrBasicInfoDao
 * @description: 定义  算话人行结构化版(征信主表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShSrBasicInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行结构化版(征信主表)
     * @date 2017-12-21 19:53:07
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrBasicInfoDTO> searchExtWlShSrBasicInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(征信主表)
     * @date 2017-12-21 19:53:07
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrBasicInfoDTO> searchExtWlShSrBasicInfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(征信主表)
     * @date 2017-12-21 19:53:07
     * @param id
     * @return
     */
    public ExtWlShSrBasicInfoDTO findExtWlShSrBasicInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行结构化版(征信主表)
     * @date 2017-12-21 19:53:07
     * @param paramMap
     * @return
     */
    public int insertExtWlShSrBasicInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行结构化版(征信主表)
     * @date 2017-12-21 19:53:07
     * @param paramMap
     */
    public void updateExtWlShSrBasicInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行结构化版(征信主表)
     * @date 2017-12-21 19:53:07
     * @param ids
     * @return
     */ 
    public void deleteExtWlShSrBasicInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
