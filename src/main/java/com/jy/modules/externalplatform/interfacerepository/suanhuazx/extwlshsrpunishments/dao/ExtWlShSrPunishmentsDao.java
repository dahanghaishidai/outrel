package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrpunishments.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrpunishments.dto.ExtWlShSrPunishmentsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShSrPunishmentsDao
 * @description: 定义  算话人行结构化版(行政处罚记录表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShSrPunishmentsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行结构化版(行政处罚记录表)
     * @date 2017-12-21 19:56:07
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrPunishmentsDTO> searchExtWlShSrPunishmentsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(行政处罚记录表)
     * @date 2017-12-21 19:56:07
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrPunishmentsDTO> searchExtWlShSrPunishments(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(行政处罚记录表)
     * @date 2017-12-21 19:56:07
     * @param id
     * @return
     */
    public ExtWlShSrPunishmentsDTO findExtWlShSrPunishmentsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行结构化版(行政处罚记录表)
     * @date 2017-12-21 19:56:07
     * @param paramMap
     * @return
     */
    public int insertExtWlShSrPunishments(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行结构化版(行政处罚记录表)
     * @date 2017-12-21 19:56:07
     * @param paramMap
     */
    public void updateExtWlShSrPunishments(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行结构化版(行政处罚记录表)
     * @date 2017-12-21 19:56:07
     * @param ids
     * @return
     */ 
    public void deleteExtWlShSrPunishmentsByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShSrPunishmentsList
     * @param: [punishmentsList, fkReportId]
     * @describe: 批量新增 算话人行结构化版(行政处罚记录表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 11:18
     **/
    public void insertExtWlShSrPunishmentsList(Map<String, Object> paramMap);
}
