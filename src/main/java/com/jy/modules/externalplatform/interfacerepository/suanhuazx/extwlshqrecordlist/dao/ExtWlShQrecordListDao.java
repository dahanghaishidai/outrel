package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordlist.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshqrecordlist.dto.ExtWlShQrecordListDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShQrecordListDao
 * @description: 定义  算话人行原版(查询记录详单) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShQrecordListDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行原版(查询记录详单)
     * @date 2017-12-21 19:51:38
     * @param searchParams
     * @return
     */
    public List<ExtWlShQrecordListDTO> searchExtWlShQrecordListByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行原版(查询记录详单)
     * @date 2017-12-21 19:51:38
     * @param searchParams
     * @return
     */
    public List<ExtWlShQrecordListDTO> searchExtWlShQrecordList(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行原版(查询记录详单)
     * @date 2017-12-21 19:51:38
     * @param id
     * @return
     */
    public ExtWlShQrecordListDTO findExtWlShQrecordListByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行原版(查询记录详单)
     * @date 2017-12-21 19:51:38
     * @param paramMap
     * @return
     */
    public int insertExtWlShQrecordList(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行原版(查询记录详单)
     * @date 2017-12-21 19:51:38
     * @param paramMap
     */
    public void updateExtWlShQrecordList(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行原版(查询记录详单)
     * @date 2017-12-21 19:51:38
     * @param ids
     * @return
     */ 
    public void deleteExtWlShQrecordListByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShQrecordList1
     * @param: [qrecordList, fkReportId]
     * @describe: 批量新增 算话人行原版(查询记录详单)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 10:11
     **/
    public void insertExtWlShQrecordList1(Map<String, Object> paramMap);
}
