package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtdishonesty.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiducourtdishonesty.dto.ExtWlBaiduCourtDishonestyDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBaiduCourtDishonestyDao
 * @description: 定义  百度金融法院失信表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBaiduCourtDishonestyDao {
    
    /**
     * @author Administrator
     * @description: 分页查询百度金融法院失信表
     * @date 2017-12-13 16:41:01
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduCourtDishonestyDTO> searchExtWlBaiduCourtDishonestyByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象百度金融法院失信表
     * @date 2017-12-13 16:41:01
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduCourtDishonestyDTO> searchExtWlBaiduCourtDishonesty(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象百度金融法院失信表
     * @date 2017-12-13 16:41:01
     * @param id
     * @return
     */
    public ExtWlBaiduCourtDishonestyDTO findExtWlBaiduCourtDishonestyByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象百度金融法院失信表
     * @date 2017-12-13 16:41:01
     * @param paramMap
     * @return
     */
    public int insertExtWlBaiduCourtDishonesty(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象百度金融法院失信表
     * @date 2017-12-13 16:41:01
     * @param paramMap
     */
    public void updateExtWlBaiduCourtDishonesty(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除百度金融法院失信表
     * @date 2017-12-13 16:41:01
     * @param ids
     * @return
     */ 
    public void deleteExtWlBaiduCourtDishonestyByPrimaryKey(Map<String, Object> paramMap);

    /**
     * @methodName: insertBatchCourtDishonesty
     * @param: paramMap
     * @describe: 批量保存 百度金融法院失信
     * @auther: huangxianchao
     * @date: 2017/12/15 0015
     * @time: 上午 10:20
     **/
    public void insertBatchCourtDishonesty(Map<String, Object> paramMap);
    
}
