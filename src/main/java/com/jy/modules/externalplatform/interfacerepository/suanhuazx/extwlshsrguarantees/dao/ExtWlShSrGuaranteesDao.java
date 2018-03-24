package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrguarantees.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrguarantees.dto.ExtWlShSrGuaranteesDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShSrGuaranteesDao
 * @description: 定义  算话人行结构化版(为他人担保信息表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShSrGuaranteesDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行结构化版(为他人担保信息表)
     * @date 2017-12-21 19:54:56
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrGuaranteesDTO> searchExtWlShSrGuaranteesByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(为他人担保信息表)
     * @date 2017-12-21 19:54:56
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrGuaranteesDTO> searchExtWlShSrGuarantees(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(为他人担保信息表)
     * @date 2017-12-21 19:54:56
     * @param id
     * @return
     */
    public ExtWlShSrGuaranteesDTO findExtWlShSrGuaranteesByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行结构化版(为他人担保信息表)
     * @date 2017-12-21 19:54:56
     * @param paramMap
     * @return
     */
    public int insertExtWlShSrGuarantees(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行结构化版(为他人担保信息表)
     * @date 2017-12-21 19:54:56
     * @param paramMap
     */
    public void updateExtWlShSrGuarantees(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行结构化版(为他人担保信息表)
     * @date 2017-12-21 19:54:56
     * @param ids
     * @return
     */ 
    public void deleteExtWlShSrGuaranteesByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShSrGuaranteesList
     * @param: [guaranteesList, fkReportId]
     * @describe: 批量新增 算话人行结构化版(为他人担保信息表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 10:44
     **/
    public void insertExtWlShSrGuaranteesList(Map<String, Object> paramMap);
}
