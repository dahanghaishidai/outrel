package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecordintro.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecordintro.dto.ExtWlShCreditRecordIntroDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShCreditRecordIntroDao
 * @description: 定义  算话人行原版(信贷记录解释文字与资产相关汇总信息) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShCreditRecordIntroDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行原版(信贷记录解释文字与资产相关汇总信息)
     * @date 2017-12-21 19:46:39
     * @param searchParams
     * @return
     */
    public List<ExtWlShCreditRecordIntroDTO> searchExtWlShCreditRecordIntroByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行原版(信贷记录解释文字与资产相关汇总信息)
     * @date 2017-12-21 19:46:39
     * @param searchParams
     * @return
     */
    public List<ExtWlShCreditRecordIntroDTO> searchExtWlShCreditRecordIntro(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行原版(信贷记录解释文字与资产相关汇总信息)
     * @date 2017-12-21 19:46:39
     * @param id
     * @return
     */
    public ExtWlShCreditRecordIntroDTO findExtWlShCreditRecordIntroByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行原版(信贷记录解释文字与资产相关汇总信息)
     * @date 2017-12-21 19:46:39
     * @param paramMap
     * @return
     */
    public int insertExtWlShCreditRecordIntro(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行原版(信贷记录解释文字与资产相关汇总信息)
     * @date 2017-12-21 19:46:39
     * @param paramMap
     */
    public void updateExtWlShCreditRecordIntro(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行原版(信贷记录解释文字与资产相关汇总信息)
     * @date 2017-12-21 19:46:39
     * @param ids
     * @return
     */ 
    public void deleteExtWlShCreditRecordIntroByPrimaryKey(Map<String, Object> paramMap);
    
    
}
