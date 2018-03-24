package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonloanbala.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonloanbala.dto.ExtWlShPersonLoanBalaDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShPersonLoanBalaDao
 * @description: 定义  人行征信贷款余额信息详列 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShPersonLoanBalaDao {
    
    /**
     * @author Administrator
     * @description: 分页查询人行征信贷款余额信息详列
     * @date 2017-12-21 19:48:25
     * @param searchParams
     * @return
     */
    public List<ExtWlShPersonLoanBalaDTO> searchExtWlShPersonLoanBalaByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象人行征信贷款余额信息详列
     * @date 2017-12-21 19:48:25
     * @param searchParams
     * @return
     */
    public List<ExtWlShPersonLoanBalaDTO> searchExtWlShPersonLoanBala(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象人行征信贷款余额信息详列
     * @date 2017-12-21 19:48:25
     * @param id
     * @return
     */
    public ExtWlShPersonLoanBalaDTO findExtWlShPersonLoanBalaByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象人行征信贷款余额信息详列
     * @date 2017-12-21 19:48:25
     * @param paramMap
     * @return
     */
    public int insertExtWlShPersonLoanBala(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象人行征信贷款余额信息详列
     * @date 2017-12-21 19:48:25
     * @param paramMap
     */
    public void updateExtWlShPersonLoanBala(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除人行征信贷款余额信息详列
     * @date 2017-12-21 19:48:25
     * @param ids
     * @return
     */ 
    public void deleteExtWlShPersonLoanBalaByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShPersonLoanBalancesList
     * @param: paramMap
     * @describe: 新增 人行征信贷款余额信息详列
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 11:29
     **/
    public int insertExtWlShPersonLoanBalancesList(Map<String, Object> paramMap);
    
    
}
