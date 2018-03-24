package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordpunishm.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordpunishm.dto.ExtWlShPrecordPunishmDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShPrecordPunishmDao
 * @description: 定义  算话人行原版(公共记录_行政处罚记录表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShPrecordPunishmDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行原版(公共记录_行政处罚记录表)
     * @date 2017-12-21 19:50:05
     * @param searchParams
     * @return
     */
    public List<ExtWlShPrecordPunishmDTO> searchExtWlShPrecordPunishmByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行原版(公共记录_行政处罚记录表)
     * @date 2017-12-21 19:50:05
     * @param searchParams
     * @return
     */
    public List<ExtWlShPrecordPunishmDTO> searchExtWlShPrecordPunishm(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行原版(公共记录_行政处罚记录表)
     * @date 2017-12-21 19:50:05
     * @param id
     * @return
     */
    public ExtWlShPrecordPunishmDTO findExtWlShPrecordPunishmByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行原版(公共记录_行政处罚记录表)
     * @date 2017-12-21 19:50:05
     * @param paramMap
     * @return
     */
    public int insertExtWlShPrecordPunishm(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行原版(公共记录_行政处罚记录表)
     * @date 2017-12-21 19:50:05
     * @param paramMap
     */
    public void updateExtWlShPrecordPunishm(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行原版(公共记录_行政处罚记录表)
     * @date 2017-12-21 19:50:05
     * @param ids
     * @return
     */ 
    public void deleteExtWlShPrecordPunishmByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShPrecordPunishmentList
     * @param: [precordPunishmentList, fkReportId]
     * @describe: 批量新增 算话人行原版(公共记录_行政处罚记录表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 10:02
     **/
    public void insertExtWlShPrecordPunishmentList(Map<String, Object> paramMap);
}
