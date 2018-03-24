package com.jy.modules.externalplatform.interfacerepository.yszx.extyszxreportinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.yszx.extyszxreportinfo.dto.ExtYszxReportInfoDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtYszxReportInfoDao
 * @description: 定义  元素征信主表信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  dell
 */
@MyBatisRepository
public interface ExtYszxReportInfoDao {
    
    /**
     * @author dell
     * @description: 分页查询元素征信主表信息
     * @date 2017-06-01 18:02:30
     * @param searchParams
     * @return
     */
    public List<ExtYszxReportInfoDTO> searchExtYszxReportInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author dell
     * @description:查询对象元素征信主表信息
     * @date 2017-06-01 18:02:30
     * @param searchParams
     * @return
     */
    public List<ExtYszxReportInfoDTO> searchExtYszxReportInfo(Map<String,Object> searchParams);

    /**
     * @author dell
     * @description:查询对象元素征信主表信息
     * @date 2017-06-01 18:02:30
     * @param id
     * @return
     */
    public ExtYszxReportInfoDTO findExtYszxReportInfoByPrimaryKey(String id);
    
    /**
     * @author dell
     * @description: 新增对象元素征信主表信息
     * @date 2017-06-01 18:02:30
     * @param paramMap
     * @return
     */
    public int insertExtYszxReportInfo(Map<String, Object> paramMap);
    
    /**
     * @author dell
     * @description: 更新对象元素征信主表信息
     * @date 2017-06-01 18:02:30
     * @param paramMap
     */
    public void updateExtYszxReportInfo(Map<String, Object> paramMap);
     
    /**
     * @author dell
     * @description: 按主键删除元素征信主表信息
     * @date 2017-06-01 18:02:30
     * @param ids
     * @return
     */ 
    public void deleteExtYszxReportInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
