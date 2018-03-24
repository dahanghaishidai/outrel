package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrloans.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrloans.dto.ExtWlShSrLoansDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShSrLoansDao
 * @description: 定义  算话人行结构化版(贷款表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShSrLoansDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行结构化版(贷款表)
     * @date 2017-12-21 19:55:43
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrLoansDTO> searchExtWlShSrLoansByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(贷款表)
     * @date 2017-12-21 19:55:43
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrLoansDTO> searchExtWlShSrLoans(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(贷款表)
     * @date 2017-12-21 19:55:43
     * @param id
     * @return
     */
    public ExtWlShSrLoansDTO findExtWlShSrLoansByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行结构化版(贷款表)
     * @date 2017-12-21 19:55:43
     * @param paramMap
     * @return
     */
    public int insertExtWlShSrLoans(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行结构化版(贷款表)
     * @date 2017-12-21 19:55:43
     * @param paramMap
     */
    public void updateExtWlShSrLoans(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行结构化版(贷款表)
     * @date 2017-12-21 19:55:43
     * @param ids
     * @return
     */ 
    public void deleteExtWlShSrLoansByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShSrLoansList
     * @param: [loansList, fkReportId]
     * @describe: 批量新增 算话人行结构化版(贷款表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 10:59
     **/
    public void insertExtWlShSrLoansList(Map<String, Object> paramMap);
}
