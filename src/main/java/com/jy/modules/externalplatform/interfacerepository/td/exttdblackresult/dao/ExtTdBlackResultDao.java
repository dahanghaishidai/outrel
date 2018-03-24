package com.jy.modules.externalplatform.interfacerepository.td.exttdblackresult.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.td.exttdblackresult.dto.ExtTdBlackResultDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtTdBlackResultDao
 * @description: 定义  同盾黑名单查询结果表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtTdBlackResultDao {
    
    /**
     * @author Administrator
     * @description: 分页查询同盾黑名单查询结果表
     * @date 2017-06-02 14:55:58
     * @param searchParams
     * @return
     */
    public List<ExtTdBlackResultDTO> searchExtTdBlackResultByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象同盾黑名单查询结果表
     * @date 2017-06-02 14:55:58
     * @param searchParams
     * @return
     */
    public List<ExtTdBlackResultDTO> searchExtTdBlackResult(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象同盾黑名单查询结果表
     * @date 2017-06-02 14:55:58
     * @param id
     * @return
     */
    public ExtTdBlackResultDTO findExtTdBlackResultByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象同盾黑名单查询结果表
     * @date 2017-06-02 14:55:58
     * @param paramMap
     * @return
     */
    public int insertExtTdBlackResult(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象同盾黑名单查询结果表
     * @date 2017-06-02 14:55:58
     * @param paramMap
     */
    public void updateExtTdBlackResult(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除同盾黑名单查询结果表
     * @date 2017-06-02 14:55:58
     * @param ids
     * @return
     */ 
    public void deleteExtTdBlackResultByPrimaryKey(Map<String, Object> paramMap);
    
    
}
