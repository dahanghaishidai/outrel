package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersondebts.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshpersondebts.dto.ExtWlShPersonDebtsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShPersonDebtsDao
 * @description: 定义  人行征信负债情况 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShPersonDebtsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询人行征信负债情况
     * @date 2017-12-21 19:48:03
     * @param searchParams
     * @return
     */
    public List<ExtWlShPersonDebtsDTO> searchExtWlShPersonDebtsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象人行征信负债情况
     * @date 2017-12-21 19:48:03
     * @param searchParams
     * @return
     */
    public List<ExtWlShPersonDebtsDTO> searchExtWlShPersonDebts(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象人行征信负债情况
     * @date 2017-12-21 19:48:03
     * @param id
     * @return
     */
    public ExtWlShPersonDebtsDTO findExtWlShPersonDebtsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象人行征信负债情况
     * @date 2017-12-21 19:48:03
     * @param paramMap
     * @return
     */
    public int insertExtWlShPersonDebts(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象人行征信负债情况
     * @date 2017-12-21 19:48:03
     * @param paramMap
     */
    public void updateExtWlShPersonDebts(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除人行征信负债情况
     * @date 2017-12-21 19:48:03
     * @param ids
     * @return
     */ 
    public void deleteExtWlShPersonDebtsByPrimaryKey(Map<String, Object> paramMap);
    
    
}
