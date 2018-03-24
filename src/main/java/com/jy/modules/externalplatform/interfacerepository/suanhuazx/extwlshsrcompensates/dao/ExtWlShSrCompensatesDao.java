package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcompensates.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrcompensates.dto.ExtWlShSrCompensatesDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShSrCompensatesDao
 * @description: 定义  算话人行结构化版(保证人代偿信息表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShSrCompensatesDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行结构化版(保证人代偿信息表)
     * @date 2017-12-21 19:53:30
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrCompensatesDTO> searchExtWlShSrCompensatesByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(保证人代偿信息表)
     * @date 2017-12-21 19:53:30
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrCompensatesDTO> searchExtWlShSrCompensates(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(保证人代偿信息表)
     * @date 2017-12-21 19:53:30
     * @param id
     * @return
     */
    public ExtWlShSrCompensatesDTO findExtWlShSrCompensatesByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行结构化版(保证人代偿信息表)
     * @date 2017-12-21 19:53:30
     * @param paramMap
     * @return
     */
    public int insertExtWlShSrCompensates(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行结构化版(保证人代偿信息表)
     * @date 2017-12-21 19:53:30
     * @param paramMap
     */
    public void updateExtWlShSrCompensates(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行结构化版(保证人代偿信息表)
     * @date 2017-12-21 19:53:30
     * @param ids
     * @return
     */ 
    public void deleteExtWlShSrCompensatesByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShSrCompensatesList
     * @param: [compensatesJsonArr, fkReportId]
     * @describe: 批量新增 算话人行结构化版(保证人代偿信息表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 10:37
     **/
    public void insertExtWlShSrCompensatesList(Map<String, Object> paramMap);
}
