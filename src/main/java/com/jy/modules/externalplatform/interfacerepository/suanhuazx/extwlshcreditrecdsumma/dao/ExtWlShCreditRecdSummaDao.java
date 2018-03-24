package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecdsumma.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcreditrecdsumma.dto.ExtWlShCreditRecdSummaDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShCreditRecdSummaDao
 * @description: 定义  算话人行原版(信贷记录概要) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShCreditRecdSummaDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行原版(信贷记录概要)
     * @date 2017-12-21 19:46:19
     * @param searchParams
     * @return
     */
    public List<ExtWlShCreditRecdSummaDTO> searchExtWlShCreditRecdSummaByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行原版(信贷记录概要)
     * @date 2017-12-21 19:46:19
     * @param searchParams
     * @return
     */
    public List<ExtWlShCreditRecdSummaDTO> searchExtWlShCreditRecdSumma(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行原版(信贷记录概要)
     * @date 2017-12-21 19:46:19
     * @param id
     * @return
     */
    public ExtWlShCreditRecdSummaDTO findExtWlShCreditRecdSummaByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行原版(信贷记录概要)
     * @date 2017-12-21 19:46:19
     * @param paramMap
     * @return
     */
    public int insertExtWlShCreditRecdSumma(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行原版(信贷记录概要)
     * @date 2017-12-21 19:46:19
     * @param paramMap
     */
    public void updateExtWlShCreditRecdSumma(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行原版(信贷记录概要)
     * @date 2017-12-21 19:46:19
     * @param ids
     * @return
     */ 
    public void deleteExtWlShCreditRecdSummaByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShCreditRecordSummaryList
     * @param: paramMap
     * @describe: 批量新增 算话人行原版(信贷记录概要)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 9:10
     **/
    void insertExtWlShCreditRecordSummaryList(Map<String, Object> paramMap);
}
