package com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxphonerevcheck.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.pyzx.extwlpyzxphonerevcheck.dto.ExtWlPyzxPhoneRevcheckDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlPyzxPhoneRevcheckDao
 * @description: 定义  电话反查信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlPyzxPhoneRevcheckDao {
    
    /**
     * @author Administrator
     * @description: 新增对象电话反查信息
     * @date 2018-01-10 13:51:52
     * @param paramMap
     * @return
     */
    public int insertExtWlPyzxPhoneRevcheck(Map<String, Object> paramMap);
    

    
}
