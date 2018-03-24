package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalendinfo.dao;

import com.jy.platform.core.mybatis.MyBatisRepository;

import java.util.Map;
/**
 * @className: ExtWlFpxaLendInfoDao
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalendinfo.dao
 * @describe: 定义  EXT_WL_FPXA_LEND_INFO 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 9:48
 **/
@MyBatisRepository
public interface ExtWlFpxaLendInfoDao {
    
    /**
     * @methodName: insertExtWlFpxaLendInfo
     * @param: [paramMap]
     * @describe: 新增对象EXT_WL_FPXA_LEND_INFO
     * @auther: huangxianchao
     * @date: 2018/1/16 0016
     * @time: 上午 9:48
     **/
    public int insertExtWlFpxaLendInfo(Map<String, Object> paramMap);
    

    
}
