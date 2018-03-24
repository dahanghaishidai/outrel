package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheckd.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheckd.dto.ExtWlTxskCheckDDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @className: ExtWlTxskCheckDDao
 * @package: com.jy.modules.externalplatform.interfacerepository.txsk.extwltxskcheckd.dao
 * @describe: 定义  个人信用验证详情表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: 董康宁
 * @date: 2018/1/15
 * @time: 11:22
 */
@MyBatisRepository
public interface ExtWlTxskCheckDDao {
    
    /**
     * @methodName: insertExtWlTxskCheckD
     * @param: [paramMap]
     * @describe: 新增对象个人信用验证详情表
     * @auther: 董康宁
     * @date: 2018/1/15
     * @time: 11:22
     */
    public int insertExtWlTxskCheckD(Map<String, Object> paramMap);
    

}
