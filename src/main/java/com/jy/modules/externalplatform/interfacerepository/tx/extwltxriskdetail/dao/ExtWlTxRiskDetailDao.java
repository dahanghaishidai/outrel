package com.jy.modules.externalplatform.interfacerepository.tx.extwltxriskdetail.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.tx.extwltxriskdetail.dto.ExtWlTxRiskDetailDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlTxRiskDetailDao
 * @description: 定义  腾讯_反欺诈服务_风险类型详情 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlTxRiskDetailDao {
    
    /**
     * @author Administrator
     * @description: 分页查询腾讯_反欺诈服务_风险类型详情
     * @date 2017-12-18 15:24:26
     * @param searchParams
     * @return
     */
    public List<ExtWlTxRiskDetailDTO> searchExtWlTxRiskDetailByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象腾讯_反欺诈服务_风险类型详情
     * @date 2017-12-18 15:24:26
     * @param searchParams
     * @return
     */
    public List<ExtWlTxRiskDetailDTO> searchExtWlTxRiskDetail(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象腾讯_反欺诈服务_风险类型详情
     * @date 2017-12-18 15:24:26
     * @param id
     * @return
     */
    public ExtWlTxRiskDetailDTO findExtWlTxRiskDetailByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象腾讯_反欺诈服务_风险类型详情
     * @date 2017-12-18 15:24:26
     * @param paramMap
     * @return
     */
    public int insertExtWlTxRiskDetail(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象腾讯_反欺诈服务_风险类型详情
     * @date 2017-12-18 15:24:26
     * @param paramMap
     */
    public void updateExtWlTxRiskDetail(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除腾讯_反欺诈服务_风险类型详情
     * @date 2017-12-18 15:24:26
     * @param ids
     * @return
     */ 
    public void deleteExtWlTxRiskDetailByPrimaryKey(Map<String, Object> paramMap);
    
    
}
