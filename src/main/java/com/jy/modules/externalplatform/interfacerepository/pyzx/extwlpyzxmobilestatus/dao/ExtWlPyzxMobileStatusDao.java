package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxmobilestatus.dao;

import com.jy.platform.core.mybatis.MyBatisRepository;

import java.util.Map;
/**
 * @classname: ExtWlPyzxMobileStatusDao
 * @description: 定义  手机号码状态查询结果 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlPyzxMobileStatusDao {
    
    /**
     * @author Administrator
     * @description: 新增对象手机号码状态查询结果
     * @date 2018-01-10 13:51:43
     * @param paramMap
     * @return
     */
    public int insertExtWlPyzxMobileStatus(Map<String, Object> paramMap);
    
}
