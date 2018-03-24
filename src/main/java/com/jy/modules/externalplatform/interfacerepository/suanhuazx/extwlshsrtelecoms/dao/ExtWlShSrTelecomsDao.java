package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtelecoms.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtelecoms.dto.ExtWlShSrTelecomsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShSrTelecomsDao
 * @description: 定义  算话人行结构化版(电信欠费信息表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShSrTelecomsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行结构化版(电信欠费信息表)
     * @date 2017-12-21 19:56:52
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrTelecomsDTO> searchExtWlShSrTelecomsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(电信欠费信息表)
     * @date 2017-12-21 19:56:52
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrTelecomsDTO> searchExtWlShSrTelecoms(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(电信欠费信息表)
     * @date 2017-12-21 19:56:52
     * @param id
     * @return
     */
    public ExtWlShSrTelecomsDTO findExtWlShSrTelecomsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行结构化版(电信欠费信息表)
     * @date 2017-12-21 19:56:52
     * @param paramMap
     * @return
     */
    public int insertExtWlShSrTelecoms(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行结构化版(电信欠费信息表)
     * @date 2017-12-21 19:56:52
     * @param paramMap
     */
    public void updateExtWlShSrTelecoms(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行结构化版(电信欠费信息表)
     * @date 2017-12-21 19:56:52
     * @param ids
     * @return
     */ 
    public void deleteExtWlShSrTelecomsByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShSrTelecomsList
     * @param: [paramMap]
     * @describe: 批量新增 算话人行结构化版(电信欠费信息表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 11:23
     **/
    public void insertExtWlShSrTelecomsList(Map<String, Object> paramMap);
}
