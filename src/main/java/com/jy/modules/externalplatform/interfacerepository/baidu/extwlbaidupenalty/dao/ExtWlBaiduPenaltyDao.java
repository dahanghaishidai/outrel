package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidupenalty.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidupenalty.dto.ExtWlBaiduPenaltyDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBaiduPenaltyDao
 * @description: 定义  百度金融行政处罚表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBaiduPenaltyDao {
    
    /**
     * @author Administrator
     * @description: 分页查询百度金融行政处罚表
     * @date 2017-12-13 16:42:29
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduPenaltyDTO> searchExtWlBaiduPenaltyByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象百度金融行政处罚表
     * @date 2017-12-13 16:42:29
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduPenaltyDTO> searchExtWlBaiduPenalty(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象百度金融行政处罚表
     * @date 2017-12-13 16:42:29
     * @param id
     * @return
     */
    public ExtWlBaiduPenaltyDTO findExtWlBaiduPenaltyByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象百度金融行政处罚表
     * @date 2017-12-13 16:42:29
     * @param paramMap
     * @return
     */
    public int insertExtWlBaiduPenalty(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象百度金融行政处罚表
     * @date 2017-12-13 16:42:29
     * @param paramMap
     */
    public void updateExtWlBaiduPenalty(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除百度金融行政处罚表
     * @date 2017-12-13 16:42:29
     * @param ids
     * @return
     */ 
    public void deleteExtWlBaiduPenaltyByPrimaryKey(Map<String, Object> paramMap);

    /**
     * @methodName: insertBatchPenalty
     * @param: paramMap
     * @describe: 批量添加 百度金融行政处罚
     * @auther: huangxianchao
     * @date: 2017/12/15 0015
     * @time: 上午 10:22
     **/
    public void insertBatchPenalty(Map<String, Object> paramMap);
    
    
}
