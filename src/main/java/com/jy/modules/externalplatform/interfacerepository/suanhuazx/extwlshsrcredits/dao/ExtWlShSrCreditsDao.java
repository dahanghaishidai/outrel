package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcredits.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcredits.dto.ExtWlShSrCreditsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShSrCreditsDao
 * @description: 定义  算话人行结构化版(信用卡表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShSrCreditsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行结构化版(信用卡表)
     * @date 2017-12-21 19:53:50
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrCreditsDTO> searchExtWlShSrCreditsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(信用卡表)
     * @date 2017-12-21 19:53:50
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrCreditsDTO> searchExtWlShSrCredits(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(信用卡表)
     * @date 2017-12-21 19:53:50
     * @param id
     * @return
     */
    public ExtWlShSrCreditsDTO findExtWlShSrCreditsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行结构化版(信用卡表)
     * @date 2017-12-21 19:53:50
     * @param paramMap
     * @return
     */
    public int insertExtWlShSrCredits(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行结构化版(信用卡表)
     * @date 2017-12-21 19:53:50
     * @param paramMap
     */
    public void updateExtWlShSrCredits(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行结构化版(信用卡表)
     * @date 2017-12-21 19:53:50
     * @param ids
     * @return
     */ 
    public void deleteExtWlShSrCreditsByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShSrCreditsList
     * @param: [creditsList, fkReportId]
     * @describe: 批量新增 算话人行结构化版(信用卡表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 10:55
     **/
    public void insertExtWlShSrCreditsList(Map<String, Object> paramMap);
}
