package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxablack.dao;

import com.jy.platform.core.mybatis.MyBatisRepository;

import java.util.Map;
/**
 * @className: ExtWlFpxaBlackDao
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxablack.dao
 * @describe: 定义  EXT_WL_FPXA_BLACK 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: huangxianchao
 * @date: 2018/1/15 0015
 * @time: 下午 7:48
 **/
@MyBatisRepository
public interface ExtWlFpxaBlackDao {
    

    
    /**
     * @methodName: insertExtWlFpxaBlack
     * @param: [paramMap]
     * @describe: 新增对象EXT_WL_FPXA_BLACK
     * @auther: huangxianchao
     * @date: 2018/1/15 0015
     * @time: 下午 7:48
     **/
    public int insertExtWlFpxaBlack(Map<String, Object> paramMap);
    

    
    
}
