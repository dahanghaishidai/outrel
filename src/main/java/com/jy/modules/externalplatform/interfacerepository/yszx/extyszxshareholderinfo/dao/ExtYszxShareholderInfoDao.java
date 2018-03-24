package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxshareholderinfo.dto.ExtYszxShareholderInfoDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtYszxShareholderInfoDao
 * @description: 定义  元素征信-企业股东信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  dell
 */
@MyBatisRepository
public interface ExtYszxShareholderInfoDao {
    
    /**
     * @author dell
     * @description: 分页查询元素征信-企业股东信息
     * @date 2017-06-01 18:01:47
     * @param searchParams
     * @return
     */
    public List<ExtYszxShareholderInfoDTO> searchExtYszxShareholderInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author dell
     * @description:查询对象元素征信-企业股东信息
     * @date 2017-06-01 18:01:47
     * @param searchParams
     * @return
     */
    public List<ExtYszxShareholderInfoDTO> searchExtYszxShareholderInfo(Map<String,Object> searchParams);

    /**
     * @author dell
     * @description:查询对象元素征信-企业股东信息
     * @date 2017-06-01 18:01:47
     * @param id
     * @return
     */
    public ExtYszxShareholderInfoDTO findExtYszxShareholderInfoByPrimaryKey(String id);
    
    /**
     * @author dell
     * @description: 新增对象元素征信-企业股东信息
     * @date 2017-06-01 18:01:47
     * @param paramMap
     * @return
     */
    public int insertExtYszxShareholderInfo(Map<String, Object> paramMap);
    
    /**
     * @author dell
     * @description: 更新对象元素征信-企业股东信息
     * @date 2017-06-01 18:01:47
     * @param paramMap
     */
    public void updateExtYszxShareholderInfo(Map<String, Object> paramMap);
     
    /**
     * @author dell
     * @description: 按主键删除元素征信-企业股东信息
     * @date 2017-06-01 18:01:47
     * @param ids
     * @return
     */ 
    public void deleteExtYszxShareholderInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
