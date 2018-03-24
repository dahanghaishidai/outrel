package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtaxs.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtaxs.dto.ExtWlShSrTaxsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShSrTaxsDao
 * @description: 定义  算话人行结构化版(欠税记录表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShSrTaxsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行结构化版(欠税记录表)
     * @date 2017-12-21 19:56:25
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrTaxsDTO> searchExtWlShSrTaxsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(欠税记录表)
     * @date 2017-12-21 19:56:25
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrTaxsDTO> searchExtWlShSrTaxs(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(欠税记录表)
     * @date 2017-12-21 19:56:25
     * @param id
     * @return
     */
    public ExtWlShSrTaxsDTO findExtWlShSrTaxsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行结构化版(欠税记录表)
     * @date 2017-12-21 19:56:25
     * @param paramMap
     * @return
     */
    public int insertExtWlShSrTaxs(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行结构化版(欠税记录表)
     * @date 2017-12-21 19:56:25
     * @param paramMap
     */
    public void updateExtWlShSrTaxs(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行结构化版(欠税记录表)
     * @date 2017-12-21 19:56:25
     * @param ids
     * @return
     */ 
    public void deleteExtWlShSrTaxsByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShSrTaxsList
     * @param: [taxsList, fkReportId]
     * @describe: 批量新增 算话人行结构化版(欠税记录表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 11:02
     **/
    public void insertExtWlShSrTaxsList(Map<String, Object> paramMap);
}
