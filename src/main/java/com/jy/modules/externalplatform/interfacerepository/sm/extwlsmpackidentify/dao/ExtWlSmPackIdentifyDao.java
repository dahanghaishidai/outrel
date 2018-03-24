package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackidentify.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackidentify.dto.ExtWlSmPackIdentifyDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlSmPackIdentifyDao
 * @description: 定义  数美中介包装风险识别服务（主表） 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlSmPackIdentifyDao {
    
    /**
     * @author Administrator
     * @description: 分页查询数美中介包装风险识别服务（主表）
     * @date 2017-12-19 10:36:10
     * @param searchParams
     * @return
     */
    public List<ExtWlSmPackIdentifyDTO> searchExtWlSmPackIdentifyByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象数美中介包装风险识别服务（主表）
     * @date 2017-12-19 10:36:10
     * @param searchParams
     * @return
     */
    public List<ExtWlSmPackIdentifyDTO> searchExtWlSmPackIdentify(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象数美中介包装风险识别服务（主表）
     * @date 2017-12-19 10:36:10
     * @param id
     * @return
     */
    public ExtWlSmPackIdentifyDTO findExtWlSmPackIdentifyByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象数美中介包装风险识别服务（主表）
     * @date 2017-12-19 10:36:10
     * @param paramMap
     * @return
     */
    public int insertExtWlSmPackIdentify(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象数美中介包装风险识别服务（主表）
     * @date 2017-12-19 10:36:10
     * @param paramMap
     */
    public void updateExtWlSmPackIdentify(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除数美中介包装风险识别服务（主表）
     * @date 2017-12-19 10:36:10
     * @param ids
     * @return
     */ 
    public void deleteExtWlSmPackIdentifyByPrimaryKey(Map<String, Object> paramMap);
    
    
}
