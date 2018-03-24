package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrjudgments.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrjudgments.dto.ExtWlShSrJudgmentsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShSrJudgmentsDao
 * @description: 定义  算话人行结构化版(民事判决记录表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShSrJudgmentsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行结构化版(民事判决记录表)
     * @date 2017-12-21 19:55:22
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrJudgmentsDTO> searchExtWlShSrJudgmentsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(民事判决记录表)
     * @date 2017-12-21 19:55:22
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrJudgmentsDTO> searchExtWlShSrJudgments(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(民事判决记录表)
     * @date 2017-12-21 19:55:22
     * @param id
     * @return
     */
    public ExtWlShSrJudgmentsDTO findExtWlShSrJudgmentsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行结构化版(民事判决记录表)
     * @date 2017-12-21 19:55:22
     * @param paramMap
     * @return
     */
    public int insertExtWlShSrJudgments(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行结构化版(民事判决记录表)
     * @date 2017-12-21 19:55:22
     * @param paramMap
     */
    public void updateExtWlShSrJudgments(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行结构化版(民事判决记录表)
     * @date 2017-12-21 19:55:22
     * @param ids
     * @return
     */ 
    public void deleteExtWlShSrJudgmentsByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShSrJudgmentsList
     * @param: [judgmentsList, fkReportId]
     * @describe: 批量新增 算话人行结构化版(民事判决记录表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 11:10
     **/
    public void insertExtWlShSrJudgmentsList(Map<String, Object> paramMap);
}
