package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtraces.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrtraces.dto.ExtWlShSrTracesDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShSrTracesDao
 * @description: 定义  算话人行结构化版(查询记录表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShSrTracesDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行结构化版(查询记录表)
     * @date 2017-12-21 19:57:13
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrTracesDTO> searchExtWlShSrTracesByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(查询记录表)
     * @date 2017-12-21 19:57:13
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrTracesDTO> searchExtWlShSrTraces(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(查询记录表)
     * @date 2017-12-21 19:57:13
     * @param id
     * @return
     */
    public ExtWlShSrTracesDTO findExtWlShSrTracesByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行结构化版(查询记录表)
     * @date 2017-12-21 19:57:13
     * @param paramMap
     * @return
     */
    public int insertExtWlShSrTraces(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行结构化版(查询记录表)
     * @date 2017-12-21 19:57:13
     * @param paramMap
     */
    public void updateExtWlShSrTraces(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行结构化版(查询记录表)
     * @date 2017-12-21 19:57:13
     * @param ids
     * @return
     */ 
    public void deleteExtWlShSrTracesByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShSrTracesList
     * @param: [paramMap]
     * @describe: 批量新增 算话人行结构化版(查询记录表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 11:30
     **/
    public void insertExtWlShSrTracesList(Map<String, Object> paramMap);
}
