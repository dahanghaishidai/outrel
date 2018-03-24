package com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklenddetail.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklenddetail.dto.ExtWlTxskLendDetailDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @className: ExtWlTxskLendDetailDao
 * @package: com.jy.modules.externalplatform.interfacerepository.txsk.extwltxsklenddetail.dao
 * @describe: 定义  多重借贷查询数据详情表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: 董康宁
 * @date: 2018/1/12
 * @time: 17:09
 */
@MyBatisRepository
public interface ExtWlTxskLendDetailDao {
    
    /**
     * @methodName: insertExtWlTxskLendDetail
     * @param: [paramMap]
     * @describe: 新增对象多重借贷查询数据详情表
     * @auther: 董康宁
     * @date: 2018/1/12
     * @time: 17:12
     */
    public int insertExtWlTxskLendDetail(Map<String, Object> paramMap);
    
}
