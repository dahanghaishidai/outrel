package com.jy.modules.externalplatform.interfacerepository.zc.extwlzcrisklist.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zc.extwlzcrisklist.dto.ExtWlZcRiskListDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZcRiskListDao
 * @description: 定义  致诚风险名单结果 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZcRiskListDao {
    
    /**
     * @author Administrator
     * @description: 分页查询致诚风险名单结果
     * @date 2017-12-07 13:39:56
     * @param searchParams
     * @return
     */
    public List<ExtWlZcRiskListDTO> searchExtWlZcRiskListByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象致诚风险名单结果
     * @date 2017-12-07 13:39:56
     * @param searchParams
     * @return
     */
    public List<ExtWlZcRiskListDTO> searchExtWlZcRiskList(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象致诚风险名单结果
     * @date 2017-12-07 13:39:56
     * @param id
     * @return
     */
    public ExtWlZcRiskListDTO findExtWlZcRiskListByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象致诚风险名单结果
     * @date 2017-12-07 13:39:56
     * @param paramMap
     * @return
     */
    public int insertExtWlZcRiskList(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象致诚风险名单结果
     * @date 2017-12-07 13:39:56
     * @param paramMap
     */
    public void updateExtWlZcRiskList(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除致诚风险名单结果
     * @date 2017-12-07 13:39:56
     * @param ids
     * @return
     */ 
    public void deleteExtWlZcRiskListByPrimaryKey(Map<String, Object> paramMap);

    public void batchInsertResults(Map<String, Object> paramMap);
    
    
}
