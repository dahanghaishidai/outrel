package com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtoverduectc.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.zxt.extwlzxtoverduectc.dto.ExtWlZxtOverdueCtCDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlZxtOverdueCtCDao
 * @description: 定义  关联人-出现逾期黑名单次数 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlZxtOverdueCtCDao {
    
    /**
     * @author Administrator
     * @description: 分页查询关联人-出现逾期黑名单次数
     * @date 2017-12-18 11:34:10
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtOverdueCtCDTO> searchExtWlZxtOverdueCtCByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象关联人-出现逾期黑名单次数
     * @date 2017-12-18 11:34:10
     * @param searchParams
     * @return
     */
    public List<ExtWlZxtOverdueCtCDTO> searchExtWlZxtOverdueCtC(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象关联人-出现逾期黑名单次数
     * @date 2017-12-18 11:34:10
     * @param id
     * @return
     */
    public ExtWlZxtOverdueCtCDTO findExtWlZxtOverdueCtCByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象关联人-出现逾期黑名单次数
     * @date 2017-12-18 11:34:10
     * @param paramMap
     * @return
     */
    public int insertExtWlZxtOverdueCtC(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象关联人-出现逾期黑名单次数
     * @date 2017-12-18 11:34:10
     * @param paramMap
     */
    public void updateExtWlZxtOverdueCtC(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除关联人-出现逾期黑名单次数
     * @date 2017-12-18 11:34:10
     * @param ids
     * @return
     */ 
    public void deleteExtWlZxtOverdueCtCByPrimaryKey(Map<String, Object> paramMap);
    
    
}
