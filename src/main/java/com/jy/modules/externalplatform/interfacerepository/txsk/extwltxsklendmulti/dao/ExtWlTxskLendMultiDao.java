package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklendmulti.dao;

import com.jy.platform.core.mybatis.MyBatisRepository;

import java.util.Map;
/**
 * @className: ExtWlTxskLendMultiDao
 * @package: com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklendmulti.dao
 * @describe: 定义  多重借贷查询数据表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: 董康宁
 * @date: 2018/1/12
 * @time: 17:07
 */
@MyBatisRepository
public interface ExtWlTxskLendMultiDao {
    
    /**
     * @methodName: insertExtWlTxskLendMulti
     * @param: [paramMap]
     * @describe: 新增对象多重借贷查询数据表
     * @auther: 董康宁
     * @date: 2018/1/12
     * @time: 17:08
     */
    public int insertExtWlTxskLendMulti(Map<String, Object> paramMap);
    

}
