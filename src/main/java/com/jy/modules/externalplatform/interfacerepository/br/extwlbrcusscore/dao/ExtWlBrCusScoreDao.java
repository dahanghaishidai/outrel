package com.jy.modules.externalplatform.interfacerepository.br.extwlbrcusscore.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.br.extwlbrcusscore.dto.ExtWlBrCusScoreDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @methodName:
 * @param:
 * @describe: 定义  百融_客群评分 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @auther: 董康宁
 * @date: 2018/1/24
 * @time: 16:11
 */
@MyBatisRepository
public interface ExtWlBrCusScoreDao {
    

    /**
     * @author Administrator
     * @description: 新增对象百融_客群评分
     * @date 2017-12-19 20:14:01
     * @param paramMap
     * @return
     */
    public int insertExtWlBrCusScore(Map<String, Object> paramMap);
    

}
