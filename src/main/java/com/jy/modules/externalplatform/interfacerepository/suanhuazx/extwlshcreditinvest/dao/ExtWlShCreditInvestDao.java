package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditinvest.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditinvest.dto.ExtWlShCreditInvestDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShCreditInvestDao
 * @description: 定义  算话央行征信采集申请表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShCreditInvestDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话央行征信采集申请表
     * @date 2017-12-21 19:45:18
     * @param searchParams
     * @return
     */
    public List<ExtWlShCreditInvestDTO> searchExtWlShCreditInvestByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话央行征信采集申请表
     * @date 2017-12-21 19:45:18
     * @param searchParams
     * @return
     */
    public List<ExtWlShCreditInvestDTO> searchExtWlShCreditInvest(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话央行征信采集申请表
     * @date 2017-12-21 19:45:18
     * @param id
     * @return
     */
    public ExtWlShCreditInvestDTO findExtWlShCreditInvestByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话央行征信采集申请表
     * @date 2017-12-21 19:45:18
     * @param paramMap
     * @return
     */
    public int insertExtWlShCreditInvest(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话央行征信采集申请表
     * @date 2017-12-21 19:45:18
     * @param paramMap
     */
    public void updateExtWlShCreditInvest(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话央行征信采集申请表
     * @date 2017-12-21 19:45:18
     * @param ids
     * @return
     */ 
    public void deleteExtWlShCreditInvestByPrimaryKey(Map<String, Object> paramMap);

    /**
     * @methodName: updateExtShCreditInvestState
     * @param: paramMap
     * @describe: 更新对象 更新对象算话央行征信采集申请表[调用状态]
     * @auther: huangxianchao
     * @date: 2017/12/22 0022
     * @time: 上午 10:56
     **/
    public void updateExtWlShCreditInvestState(Map<String, Object> paramMap);
    
    
}
