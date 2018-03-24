package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxeducationcheck.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxeducationcheck.dto.ExtWlPyzxEducationCheckDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlPyzxEducationCheckDao
 * @description: 定义  鹏元征信（学历核查结果表） 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlPyzxEducationCheckDao {
    
    /**
     * @methodName: insertExtWlPyzxEducationCheck
     * @param: [paramMap]
     * @describe: 新增对象鹏元征信（学历核查结果表）
     * @auther: 董康宁
     * @date: 2018/1/10
     * @time: 16:46
     */
    public int insertExtWlPyzxEducationCheck(Map<String, Object> paramMap);
    

}
