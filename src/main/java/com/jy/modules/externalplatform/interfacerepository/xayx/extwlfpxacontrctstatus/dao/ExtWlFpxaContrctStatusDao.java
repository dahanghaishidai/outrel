package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacontrctstatus.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacontrctstatus.dto.ExtWlFpxaContrctStatusDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @className: ExtWlFpxaContrctStatusDao
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxacontrctstatus.dao
 * @describe: 定义  EXT_WL_FPXA_CONTRCT_STATUS 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: huangxianchao
 * @date: 2018/1/15 0015
 * @time: 下午 7:56
 **/
@MyBatisRepository
public interface ExtWlFpxaContrctStatusDao {
    
    /**
     * @methodName: insertExtWlFpxaContrctStatus
     * @param: [paramMap]
     * @describe: 新增对象EXT_WL_FPXA_CONTRCT_STATUS
     * @auther: huangxianchao
     * @date: 2018/1/15 0015
     * @time: 下午 8:00
     **/
    public int insertExtWlFpxaContrctStatus(Map<String, Object> paramMap);
    


    
    
}
