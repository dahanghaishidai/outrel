package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidutax.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidutax.dto.ExtWlBaiduTaxDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBaiduTaxDao
 * @description: 定义  百度金融偷税漏税表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBaiduTaxDao {
    
    /**
     * @author Administrator
     * @description: 分页查询百度金融偷税漏税表
     * @date 2017-12-13 16:41:52
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduTaxDTO> searchExtWlBaiduTaxByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象百度金融偷税漏税表
     * @date 2017-12-13 16:41:52
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduTaxDTO> searchExtWlBaiduTax(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象百度金融偷税漏税表
     * @date 2017-12-13 16:41:52
     * @param id
     * @return
     */
    public ExtWlBaiduTaxDTO findExtWlBaiduTaxByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象百度金融偷税漏税表
     * @date 2017-12-13 16:41:52
     * @param paramMap
     * @return
     */
    public int insertExtWlBaiduTax(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象百度金融偷税漏税表
     * @date 2017-12-13 16:41:52
     * @param paramMap
     */
    public void updateExtWlBaiduTax(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除百度金融偷税漏税表
     * @date 2017-12-13 16:41:52
     * @param ids
     * @return
     */ 
    public void deleteExtWlBaiduTaxByPrimaryKey(Map<String, Object> paramMap);

    /**
     * @methodName: insertBatchTax
     * @param: paramMap
     * @describe: 批量添加 百度金融偷税漏税
     * @auther: huangxianchao
     * @date: 2017/12/15 0015
     * @time: 上午 10:23
     **/
    public void insertBatchTax(Map<String, Object> paramMap);
    
    
}
