package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsinfo.dto.ExtWlBaiduLbsInfoDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBaiduLbsInfoDao
 * @description: 定义  百度金融LBS地址校验主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBaiduLbsInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询百度金融LBS地址校验主表
     * @date 2017-12-08 15:26:55
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduLbsInfoDTO> searchExtWlBaiduLbsInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象百度金融LBS地址校验主表
     * @date 2017-12-08 15:26:55
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduLbsInfoDTO> searchExtWlBaiduLbsInfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象百度金融LBS地址校验主表
     * @date 2017-12-08 15:26:55
     * @param id
     * @return
     */
    public ExtWlBaiduLbsInfoDTO findExtWlBaiduLbsInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象百度金融LBS地址校验主表
     * @date 2017-12-08 15:26:55
     * @param paramMap
     * @return
     */
    public int insertExtWlBaiduLbsInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象百度金融LBS地址校验主表
     * @date 2017-12-08 15:26:55
     * @param paramMap
     */
    public void updateExtWlBaiduLbsInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除百度金融LBS地址校验主表
     * @date 2017-12-08 15:26:55
     * @param ids
     * @return
     */ 
    public void deleteExtWlBaiduLbsInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
