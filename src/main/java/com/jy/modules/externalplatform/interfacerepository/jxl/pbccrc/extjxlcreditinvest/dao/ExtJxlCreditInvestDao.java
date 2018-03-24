package com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.dao;

import java.util.List;
import java.util.Map;


import com.jy.modules.externalplatform.interfacerepository.jxl.pbccrc.extjxlcreditinvest.dto.ExtJxlCreditInvestDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtJxlCreditInvestDao
 * @description: 定义  聚信立央行征信采集申请表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  dell
 */
@MyBatisRepository
public interface ExtJxlCreditInvestDao {
    
    /**
     * @author dell
     * @description:查询对象聚信立央行征信采集申请表
     * @date 2017-08-24 19:56:47
     * @param searchParams
     * @return
     */
    public List<ExtJxlCreditInvestDTO> searchExtJxlCreditInvest(Map<String,Object> searchParams);

    
    /**
     * @author dell
     * @description: 新增对象聚信立央行征信采集申请表
     * @date 2017-08-24 19:56:47
     * @param paramMap
     * @return
     */
    public int insertExtJxlCreditInvest(Map<String, Object> paramMap);
    
    
    
	/**
	* @title: updateExtJxlCreditInvestState
	* @description: 更新对象聚信立央行征信采集申请表[调用状态]
	* @date 2017年8月31日 上午11:29:53
	* @param paramMap
	* @throws 
	*/ 
    public void updateExtJxlCreditInvestState(Map<String, Object> paramMap);
    
    /**
	* @title: updateExtJxlCreditInvestLinkIntoIds
	* @description: 更新对象聚信立央行征信采集申请表[关联咨询编号]
	* @date 2017年8月31日 上午11:29:53
	* @param paramMap
	* @throws 
	*/ 
    public void updateExtJxlCreditInvestLinkConsultIds(Map<String, Object> paramMap);
    
    
    
	/**
	* @title: queryMaxConsultIdByIntoId
	* @author:陈东栋
	* @description: 查询进件咨询关联信息表中,某进件对应的最大的咨询单号 
	* @date 2017年9月19日 上午10:18:01
	* @param paramMap
	* @return
	* @throws 
	*/ 
    public Map<String,Object> queryMaxConsultIdByIntoId(Map<String, Object> paramMap);
    
}
