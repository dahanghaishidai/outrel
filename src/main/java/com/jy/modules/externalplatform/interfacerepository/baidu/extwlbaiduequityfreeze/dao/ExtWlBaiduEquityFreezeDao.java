package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduequityfreeze.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaiduequityfreeze.dto.ExtWlBaiduEquityFreezeDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBaiduEquityFreezeDao
 * @description: 定义  百度金融股权冻结表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBaiduEquityFreezeDao {
    
    /**
     * @author Administrator
     * @description: 分页查询百度金融股权冻结表
     * @date 2017-12-13 16:42:09
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduEquityFreezeDTO> searchExtWlBaiduEquityFreezeByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象百度金融股权冻结表
     * @date 2017-12-13 16:42:09
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduEquityFreezeDTO> searchExtWlBaiduEquityFreeze(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象百度金融股权冻结表
     * @date 2017-12-13 16:42:09
     * @param id
     * @return
     */
    public ExtWlBaiduEquityFreezeDTO findExtWlBaiduEquityFreezeByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象百度金融股权冻结表
     * @date 2017-12-13 16:42:09
     * @param paramMap
     * @return
     */
    public int insertExtWlBaiduEquityFreeze(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象百度金融股权冻结表
     * @date 2017-12-13 16:42:09
     * @param paramMap
     */
    public void updateExtWlBaiduEquityFreeze(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除百度金融股权冻结表
     * @date 2017-12-13 16:42:09
     * @param ids
     * @return
     */ 
    public void deleteExtWlBaiduEquityFreezeByPrimaryKey(Map<String, Object> paramMap);

    /**
     * @methodName: insertBatchEquityFreeze
     * @param: paramMap
     * @describe: 批量保存 百度金融股权冻结
     * @auther: huangxianchao
     * @date: 2017/12/15 0015
     * @time: 上午 10:21
     **/
    public void insertBatchEquityFreeze(Map<String, Object> paramMap);
    
    
}
