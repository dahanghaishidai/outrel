package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxastrategy.dao;

import com.jy.platform.core.mybatis.MyBatisRepository;

import java.util.Map;
/**
 * @className: ExtWlFpxaStrategyDao
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxastrategy.dao
 * @describe: 定义  EXT_WL_FPXA_STRATEGY 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 10:02
 **/
@MyBatisRepository
public interface ExtWlFpxaStrategyDao {
    

   /**
    * @methodName: insertExtWlFpxaStrategy
    * @param: [paramMap]
    * @describe: 新增对象EXT_WL_FPXA_STRATEGY
    * @auther: huangxianchao
    * @date: 2018/1/16 0016
    * @time: 上午 10:04
    **/
    public int insertExtWlFpxaStrategy(Map<String, Object> paramMap);
    

    
}
