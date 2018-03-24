package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxcorporateinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxcorporateinfo.dto.ExtYszxCorporateInfoDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtYszxCorporateInfoDao
 * @description: 定义  元素征信-企业法人信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  dell
 */
@MyBatisRepository
public interface ExtYszxCorporateInfoDao {
    
    /**
     * @author dell
     * @description: 分页查询元素征信-企业法人信息
     * @date 2017-06-01 18:02:16
     * @param searchParams
     * @return
     */
    public List<ExtYszxCorporateInfoDTO> searchExtYszxCorporateInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author dell
     * @description:查询对象元素征信-企业法人信息
     * @date 2017-06-01 18:02:16
     * @param searchParams
     * @return
     */
    public List<ExtYszxCorporateInfoDTO> searchExtYszxCorporateInfo(Map<String,Object> searchParams);

    /**
     * @author dell
     * @description:查询对象元素征信-企业法人信息
     * @date 2017-06-01 18:02:16
     * @param id
     * @return
     */
    public ExtYszxCorporateInfoDTO findExtYszxCorporateInfoByPrimaryKey(String id);
    
    /**
     * @author dell
     * @description: 新增对象元素征信-企业法人信息
     * @date 2017-06-01 18:02:16
     * @param paramMap
     * @return
     */
    public int insertExtYszxCorporateInfo(Map<String, Object> paramMap);
    
    /**
     * @author dell
     * @description: 更新对象元素征信-企业法人信息
     * @date 2017-06-01 18:02:16
     * @param paramMap
     */
    public void updateExtYszxCorporateInfo(Map<String, Object> paramMap);
     
    /**
     * @author dell
     * @description: 按主键删除元素征信-企业法人信息
     * @date 2017-06-01 18:02:16
     * @param ids
     * @return
     */ 
    public void deleteExtYszxCorporateInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
