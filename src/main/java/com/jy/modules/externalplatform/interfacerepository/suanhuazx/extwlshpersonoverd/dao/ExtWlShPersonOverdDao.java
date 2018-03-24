package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonoverd.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersonoverd.dto.ExtWlShPersonOverdDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShPersonOverdDao
 * @description: 定义  人行征信逾期情况 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShPersonOverdDao {
    
    /**
     * @author Administrator
     * @description: 分页查询人行征信逾期情况
     * @date 2017-12-21 19:48:55
     * @param searchParams
     * @return
     */
    public List<ExtWlShPersonOverdDTO> searchExtWlShPersonOverdByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象人行征信逾期情况
     * @date 2017-12-21 19:48:55
     * @param searchParams
     * @return
     */
    public List<ExtWlShPersonOverdDTO> searchExtWlShPersonOverd(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象人行征信逾期情况
     * @date 2017-12-21 19:48:55
     * @param id
     * @return
     */
    public ExtWlShPersonOverdDTO findExtWlShPersonOverdByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象人行征信逾期情况
     * @date 2017-12-21 19:48:55
     * @param paramMap
     * @return
     */
    public int insertExtWlShPersonOverd(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象人行征信逾期情况
     * @date 2017-12-21 19:48:55
     * @param paramMap
     */
    public void updateExtWlShPersonOverd(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除人行征信逾期情况
     * @date 2017-12-21 19:48:55
     * @param ids
     * @return
     */ 
    public void deleteExtWlShPersonOverdByPrimaryKey(Map<String, Object> paramMap);
    
    
}
