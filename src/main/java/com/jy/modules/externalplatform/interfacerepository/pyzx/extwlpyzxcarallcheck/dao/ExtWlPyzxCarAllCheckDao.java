package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxcarallcheck.dao;

import com.jy.platform.core.mybatis.MyBatisRepository;

import java.util.Map;
/**
 * @className: ExtWlPyzxCarAllCheckDao
 * @package: com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxcarallcheck.dao
 * @describe: 定义  鹏元征信(车辆核查结果表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: 董康宁
 * @date: 2018/1/10
 * @time: 17:44
 */
@MyBatisRepository
public interface ExtWlPyzxCarAllCheckDao {
    



    /**
     * @methodName: insertExtWlPyzxCarAllCheck
     * @param: [paramMap]
     * @describe: 新增对象鹏元征信(车辆核查结果表)
     * @auther: 董康宁
     * @date: 2018/1/10
     * @time: 17:44
     */
    public int insertExtWlPyzxCarAllCheck(Map<String, Object> paramMap);
    
}
