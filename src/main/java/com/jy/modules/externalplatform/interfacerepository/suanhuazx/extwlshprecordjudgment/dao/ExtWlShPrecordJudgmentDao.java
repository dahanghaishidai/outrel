package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordjudgment.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordjudgment.dto.ExtWlShPrecordJudgmentDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShPrecordJudgmentDao
 * @description: 定义  算话人行原版(公共记录_民事判决记录表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShPrecordJudgmentDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行原版(公共记录_民事判决记录表)
     * @date 2017-12-21 19:49:39
     * @param searchParams
     * @return
     */
    public List<ExtWlShPrecordJudgmentDTO> searchExtWlShPrecordJudgmentByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行原版(公共记录_民事判决记录表)
     * @date 2017-12-21 19:49:39
     * @param searchParams
     * @return
     */
    public List<ExtWlShPrecordJudgmentDTO> searchExtWlShPrecordJudgment(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行原版(公共记录_民事判决记录表)
     * @date 2017-12-21 19:49:39
     * @param id
     * @return
     */
    public ExtWlShPrecordJudgmentDTO findExtWlShPrecordJudgmentByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行原版(公共记录_民事判决记录表)
     * @date 2017-12-21 19:49:39
     * @param paramMap
     * @return
     */
    public int insertExtWlShPrecordJudgment(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行原版(公共记录_民事判决记录表)
     * @date 2017-12-21 19:49:39
     * @param paramMap
     */
    public void updateExtWlShPrecordJudgment(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行原版(公共记录_民事判决记录表)
     * @date 2017-12-21 19:49:39
     * @param ids
     * @return
     */ 
    public void deleteExtWlShPrecordJudgmentByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShPrecordJudgmentList
     * @param: paramMap
     * @describe: 批量新增对象算话人行原版(公共记录_民事判决记录表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 9:39
     **/
    public void insertExtWlShPrecordJudgmentList(Map<String, Object> paramMap);
}
