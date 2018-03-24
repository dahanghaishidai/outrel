package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxabasicinfo.dao;

import com.jy.platform.core.mybatis.MyBatisRepository;

import java.util.Map;
/**
 * @className: ExtWlFpxaBasicInfoDao
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxabasicinfo.dao
 * @describe: 定义  EXT_WL_FPXA_BASIC_INFO 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: huangxianchao
 * @date: 2018/1/15 0015
 * @time: 下午 7:37
 **/
@MyBatisRepository
public interface ExtWlFpxaBasicInfoDao {
    
    /**
     * @methodName: insertExtWlFpxaBasicInfo
     * @param: [paramMap]
     * @describe: 新增对象EXT_WL_FPXA_BASIC_INFO
     * @auther: huangxianchao
     * @date: 2018/1/15 0015
     * @time: 下午 7:38
     **/
    public int insertExtWlFpxaBasicInfo(Map<String, Object> paramMap);
    

}
