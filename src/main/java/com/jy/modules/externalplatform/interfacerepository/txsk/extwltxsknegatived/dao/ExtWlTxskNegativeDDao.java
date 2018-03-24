package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegatived.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegatived.dto.ExtWlTxskNegativeDDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @className: ExtWlTxskNegativeDDao
 * @package: com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsknegatived.dao
 * @describe: 定义  负面信息查询详情表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: 董康宁
 * @date: 2018/1/19
 * @time: 13:58
 */
@MyBatisRepository
public interface ExtWlTxskNegativeDDao {
    

    /**
     * @methodName: insertExtWlTxskNegativeD
     * @param: [paramMap]
     * @describe: 新增对象负面信息查询详情表
     * @auther: 董康宁
     * @date: 2018/1/19
     * @time: 13:58
     */
    public int insertExtWlTxskNegativeD(Map<String, Object> paramMap);
    

}
