package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtblack.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtblack.dto.ExtWlZxtBlackDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZxtBlackDao
 * @description: 定义  个人-黑名单 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZxtBlackDao {
    
    /**
     * @author Administrator
     * @description: 分页查询个人-黑名单
     * @date 2017-12-14 19:06:09
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtBlackDTO> searchExtWlZxtBlackByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象个人-黑名单
     * @date 2017-12-14 19:06:09
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtBlackDTO> searchExtWlZxtBlack(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象个人-黑名单
     * @date 2017-12-14 19:06:09
     * @param id
     * @return
     */
    public ExtWlZxtBlackDTO findExtWlZxtBlackByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象个人-黑名单
     * @date 2017-12-14 19:06:09
     * @param paramMap
     * @return
     */
    public int insertExtWlZxtBlack(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象个人-黑名单
     * @date 2017-12-14 19:06:09
     * @param paramMap
     */
    public void updateExtWlZxtBlack(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除个人-黑名单
     * @date 2017-12-14 19:06:09
     * @param ids
     * @return
     */ 
    public void deleteExtWlZxtBlackByPrimaryKey(Map<String, Object> paramMap);
    
    
}
