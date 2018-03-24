package com.jy.modules.externalplatform.interfacerepository.zs.extbankcardcheck.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zs.extbankcardcheck.dto.ExtBankCardCheckDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtBankCardCheckDao
 * @description: 定义  银行卡验证表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtBankCardCheckDao {
    
    /**
     * @author Administrator
     * @description: 分页查询银行卡验证表
     * @date 2017-06-14 11:35:32
     * @param searchParams
     * @return
     */
    public List<ExtBankCardCheckDTO> searchExtBankCardCheckByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象银行卡验证表
     * @date 2017-06-14 11:35:32
     * @param searchParams
     * @return
     */
    public List<ExtBankCardCheckDTO> searchExtBankCardCheck(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象银行卡验证表
     * @date 2017-06-14 11:35:32
     * @param id
     * @return
     */
    public ExtBankCardCheckDTO findExtBankCardCheckByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象银行卡验证表
     * @date 2017-06-14 11:35:32
     * @param paramMap
     * @return
     */
    public int insertExtBankCardCheck(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象银行卡验证表
     * @date 2017-06-14 11:35:32
     * @param paramMap
     */
    public void updateExtBankCardCheck(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除银行卡验证表
     * @date 2017-06-14 11:35:32
     * @param ids
     * @return
     */ 
    public void deleteExtBankCardCheckByPrimaryKey(Map<String, Object> paramMap);
    
    
}
