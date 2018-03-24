package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacollection.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacollection.dto.ExtWlFpxaCollectionDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @className: ExtWlFpxaCollectionDao
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacollection.dao
 * @describe: 定义  EXT_WL_FPXA_COLLECTION 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: huangxianchao
 * @date: 2018/1/15 0015
 * @time: 下午 7:51
 **/
@MyBatisRepository
public interface ExtWlFpxaCollectionDao {
    
    /**
     * @methodName: insertExtWlFpxaCollection
     * @param: [paramMap]
     * @describe: 新增对象EXT_WL_FPXA_COLLECTION
     * @auther: huangxianchao
     * @date: 2018/1/15 0015
     * @time: 下午 7:51
     **/
    public int insertExtWlFpxaCollection(Map<String, Object> paramMap);
    

    
}
