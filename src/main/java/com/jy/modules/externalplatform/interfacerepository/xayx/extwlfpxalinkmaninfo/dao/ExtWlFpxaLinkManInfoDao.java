package com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalinkmaninfo.dao;

import com.jy.platform.core.mybatis.MyBatisRepository;

import java.util.Map;
/**
 * @className: ExtWlFpxaLinkManInfoDao
 * @package: com.jy.modules.externalplatform.interfacerepository.xayx.extwlfpxalinkmaninfo.dao
 * @describe: 定义  EXT_WL_FPXA_LINK_MAN_INFO 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: huangxianchao
 * @date: 2018/1/16 0016
 * @time: 上午 9:50
 **/
@MyBatisRepository
public interface ExtWlFpxaLinkManInfoDao {
    

    /**
     * @methodName: insertExtWlFpxaLinkManInfo
     * @param: [paramMap]
     * @describe: 新增对象EXT_WL_FPXA_LINK_MAN_INFO
     * @auther: huangxianchao
     * @date: 2018/1/16 0016
     * @time: 上午 9:51
     **/
    public int insertExtWlFpxaLinkManInfo(Map<String, Object> paramMap);
    

}
