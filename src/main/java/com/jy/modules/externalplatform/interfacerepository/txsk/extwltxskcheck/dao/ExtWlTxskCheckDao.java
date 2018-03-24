package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheck.dao;

import com.jy.platform.core.mybatis.MyBatisRepository;

import java.util.Map;
/**
 * @className: ExtWlTxskCheckDao
 * @package: com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheck.dao
 * @describe: 定义  个人信用验证主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: 董康宁
 * @date: 2018/1/15
 * @time: 11:20
 */
@MyBatisRepository
public interface ExtWlTxskCheckDao {
    
    /**
     * @methodName: insertExtWlTxskCheck
     * @param: [paramMap]
     * @describe: 新增对象个人信用验证主表
     * @auther: 董康宁
     * @date: 2018/1/15
     * @time: 11:21
     */
    public int insertExtWlTxskCheck(Map<String, Object> paramMap);
    

}
