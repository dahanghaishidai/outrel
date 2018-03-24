package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditcard.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditcard.dto.ExtJxlCreditCardDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlCreditCardDao
 * @description: 定义  聚信立央行征信报告（信用卡信息表） 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  dell
 */
@MyBatisRepository
public interface ExtJxlCreditCardDao {
    
    
    /**
     * @author dell
     * @description:查询对象聚信立央行征信报告（信用卡信息表）
     * @date 2017-08-24 20:59:58
     * @param searchParams
     * @return
     */
    public List<ExtJxlCreditCardDTO> searchExtJxlCreditCard(Map<String,Object> searchParams);

    /**
     * @author dell
     * @description: 批量新增对象聚信立央行征信报告（信用卡信息表）
     * @date 2017-08-24 20:59:58
     * @param paramMap
     * @return
     */
    public int insertExtJxlCreditCardList(Map<String, Object> paramMap);
    
}
