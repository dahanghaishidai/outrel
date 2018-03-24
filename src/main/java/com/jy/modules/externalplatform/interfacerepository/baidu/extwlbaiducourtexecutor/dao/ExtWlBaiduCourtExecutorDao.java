package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtexecutor.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtexecutor.dto.ExtWlBaiduCourtExecutorDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBaiduCourtExecutorDao
 * @description: 定义  百度金融法院执行人表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBaiduCourtExecutorDao {
    
    /**
     * @author Administrator
     * @description: 分页查询百度金融法院执行人表
     * @date 2017-12-13 16:41:37
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduCourtExecutorDTO> searchExtWlBaiduCourtExecutorByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象百度金融法院执行人表
     * @date 2017-12-13 16:41:37
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduCourtExecutorDTO> searchExtWlBaiduCourtExecutor(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象百度金融法院执行人表
     * @date 2017-12-13 16:41:37
     * @param id
     * @return
     */
    public ExtWlBaiduCourtExecutorDTO findExtWlBaiduCourtExecutorByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象百度金融法院执行人表
     * @date 2017-12-13 16:41:37
     * @param paramMap
     * @return
     */
    public int insertExtWlBaiduCourtExecutor(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象百度金融法院执行人表
     * @date 2017-12-13 16:41:37
     * @param paramMap
     */
    public void updateExtWlBaiduCourtExecutor(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除百度金融法院执行人表
     * @date 2017-12-13 16:41:37
     * @param ids
     * @return
     */ 
    public void deleteExtWlBaiduCourtExecutorByPrimaryKey(Map<String, Object> paramMap);

    /**
     * @methodName: insertBatchCourtExecutor
     * @param: paramMap
     * @describe: 批量保存  百度金融法院执行人
     * @auther: huangxianchao
     * @date: 2017/12/15 0015
     * @time: 上午 10:20
     **/
    public void insertBatchCourtExecutor(Map<String, Object> paramMap);
    
}
