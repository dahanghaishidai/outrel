package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtloancountp.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtloancountp.dto.ExtWlZxtLoanCountPDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZxtLoanCountPDao
 * @description: 定义  同业借贷申请次数(A501/A502/A503/B202) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZxtLoanCountPDao {
    
    /**
     * @author Administrator
     * @description: 分页查询同业借贷申请次数(A501/A502/A503/B202)
     * @date 2017-12-18 16:03:04
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtLoanCountPDTO> searchExtWlZxtLoanCountPByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象同业借贷申请次数(A501/A502/A503/B202)
     * @date 2017-12-18 16:03:04
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtLoanCountPDTO> searchExtWlZxtLoanCountP(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象同业借贷申请次数(A501/A502/A503/B202)
     * @date 2017-12-18 16:03:04
     * @param id
     * @return
     */
    public ExtWlZxtLoanCountPDTO findExtWlZxtLoanCountPByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象同业借贷申请次数(A501/A502/A503/B202)
     * @date 2017-12-18 16:03:04
     * @param paramMap
     * @return
     */
    public int insertExtWlZxtLoanCountP(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象同业借贷申请次数(A501/A502/A503/B202)
     * @date 2017-12-18 16:03:04
     * @param paramMap
     */
    public void updateExtWlZxtLoanCountP(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除同业借贷申请次数(A501/A502/A503/B202)
     * @date 2017-12-18 16:03:04
     * @param ids
     * @return
     */ 
    public void deleteExtWlZxtLoanCountPByPrimaryKey(Map<String, Object> paramMap);
    
    
}
