package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpercreditloan.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpercreditloan.dto.ExtWlShPerCreditLoanDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShPerCreditLoanDao
 * @description: 定义  人行征信信贷信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShPerCreditLoanDao {
    
    /**
     * @author Administrator
     * @description: 分页查询人行征信信贷信息
     * @date 2017-12-22 12:31:13
     * @param searchParams
     * @return
     */
    public List<ExtWlShPerCreditLoanDTO> searchExtWlShPerCreditLoanByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象人行征信信贷信息
     * @date 2017-12-22 12:31:13
     * @param searchParams
     * @return
     */
    public List<ExtWlShPerCreditLoanDTO> searchExtWlShPerCreditLoan(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象人行征信信贷信息
     * @date 2017-12-22 12:31:13
     * @param id
     * @return
     */
    public ExtWlShPerCreditLoanDTO findExtWlShPerCreditLoanByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象人行征信信贷信息
     * @date 2017-12-22 12:31:13
     * @param paramMap
     * @return
     */
    public int insertExtWlShPerCreditLoan(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象人行征信信贷信息
     * @date 2017-12-22 12:31:13
     * @param paramMap
     */
    public void updateExtWlShPerCreditLoan(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除人行征信信贷信息
     * @date 2017-12-22 12:31:13
     * @param ids
     * @return
     */ 
    public void deleteExtWlShPerCreditLoanByPrimaryKey(Map<String, Object> paramMap);
    
    
}
