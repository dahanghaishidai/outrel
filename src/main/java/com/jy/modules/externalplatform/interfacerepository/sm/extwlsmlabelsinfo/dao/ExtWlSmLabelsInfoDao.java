package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmlabelsinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmlabelsinfo.dto.ExtWlSmLabelsInfoDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlSmLabelsInfoDao
 * @description: 定义  数美手机号码标签服务信息(外联平台表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlSmLabelsInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询数美手机号码标签服务信息(外联平台表)
     * @date 2017-09-26 14:27:00
     * @param searchParams
     * @return
     */
    public List<ExtWlSmLabelsInfoDTO> searchExtWlSmLabelsInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象数美手机号码标签服务信息(外联平台表)
     * @date 2017-09-26 14:27:00
     * @param searchParams
     * @return
     */
    public List<ExtWlSmLabelsInfoDTO> searchExtWlSmLabelsInfo(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象数美手机号码标签服务信息(外联平台表)
     * @date 2017-09-26 14:27:00
     * @param id
     * @return
     */
    public ExtWlSmLabelsInfoDTO findExtWlSmLabelsInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象数美手机号码标签服务信息(外联平台表)
     * @date 2017-09-26 14:27:00
     * @param paramMap
     * @return
     */
    public int insertExtWlSmLabelsInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象数美手机号码标签服务信息(外联平台表)
     * @date 2017-09-26 14:27:00
     * @param paramMap
     */
    public void updateExtWlSmLabelsInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除数美手机号码标签服务信息(外联平台表)
     * @date 2017-09-26 14:27:00
     * @param ids
     * @return
     */ 
    public void deleteExtWlSmLabelsInfoByPrimaryKey(Map<String, Object> paramMap);

    public void updateExtWlSmLabelsInfoByIntocustid(Map<String, Object> paramMap);
    
    
}
