package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegative.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegative.dto.ExtWlTxskNegativeDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @className: ExtWlTxskNegativeDao
 * @package: com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegative.dao
 * @describe: 定义  负面信息查询主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: 董康宁
 * @date: 2018/1/15
 * @time: 10:37
 */
@MyBatisRepository
public interface ExtWlTxskNegativeDao {
    
    /**
     * @methodName: insertExtWlTxskNegative
     * @param: [paramMap]
     * @describe: 新增对象负面信息查询主表
     * @auther: 董康宁
     * @date: 2018/1/15
     * @time: 10:37
     */
    public int insertExtWlTxskNegative(Map<String, Object> paramMap);
    

}
