package com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblack.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblack.dto.ExtWlWsdBlackDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlWsdBlackDao
 * @description: 定义  维氏盾个人黑名单主表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlWsdBlackDao {
    
    /**
     * @author Administrator
     * @description: 分页查询维氏盾个人黑名单主表
     * @date 2017-12-19 20:14:25
     * @param searchParams
     * @return
     */
    public List<ExtWlWsdBlackDTO> searchExtWlWsdBlackByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象维氏盾个人黑名单主表
     * @date 2017-12-19 20:14:25
     * @param searchParams
     * @return
     */
    public List<ExtWlWsdBlackDTO> searchExtWlWsdBlack(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象维氏盾个人黑名单主表
     * @date 2017-12-19 20:14:25
     * @param id
     * @return
     */
    public ExtWlWsdBlackDTO findExtWlWsdBlackByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象维氏盾个人黑名单主表
     * @date 2017-12-19 20:14:25
     * @param paramMap
     * @return
     */
    public int insertExtWlWsdBlack(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象维氏盾个人黑名单主表
     * @date 2017-12-19 20:14:25
     * @param paramMap
     */
    public void updateExtWlWsdBlack(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除维氏盾个人黑名单主表
     * @date 2017-12-19 20:14:25
     * @param ids
     * @return
     */ 
    public void deleteExtWlWsdBlackByPrimaryKey(Map<String, Object> paramMap);
    
    
}
