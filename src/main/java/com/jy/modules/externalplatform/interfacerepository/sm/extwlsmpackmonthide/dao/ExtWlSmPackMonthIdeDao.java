package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackmonthide.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmpackmonthide.dto.ExtWlSmPackMonthIdeDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlSmPackMonthIdeDao
 * @description: 定义  数美中介包装风险识别服务逐月统计（副表） 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlSmPackMonthIdeDao {
    
    /**
     * @author Administrator
     * @description: 分页查询数美中介包装风险识别服务逐月统计（副表）
     * @date 2017-12-19 14:21:37
     * @param searchParams
     * @return
     */
    public List<ExtWlSmPackMonthIdeDTO> searchExtWlSmPackMonthIdeByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象数美中介包装风险识别服务逐月统计（副表）
     * @date 2017-12-19 14:21:37
     * @param searchParams
     * @return
     */
    public List<ExtWlSmPackMonthIdeDTO> searchExtWlSmPackMonthIde(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象数美中介包装风险识别服务逐月统计（副表）
     * @date 2017-12-19 14:21:37
     * @param id
     * @return
     */
    public ExtWlSmPackMonthIdeDTO findExtWlSmPackMonthIdeByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象数美中介包装风险识别服务逐月统计（副表）
     * @date 2017-12-19 14:21:37
     * @param paramMap
     * @return
     */
    public int insertExtWlSmPackMonthIde(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象数美中介包装风险识别服务逐月统计（副表）
     * @date 2017-12-19 14:21:37
     * @param paramMap
     */
    public void updateExtWlSmPackMonthIde(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除数美中介包装风险识别服务逐月统计（副表）
     * @date 2017-12-19 14:21:37
     * @param ids
     * @return
     */ 
    public void deleteExtWlSmPackMonthIdeByPrimaryKey(Map<String, Object> paramMap);
    
    
}
