package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconreladist.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgconreladist.dto.ExtWlJxlMgConReladistDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgConReladistDao
 * @description: 定义  蜜罐联系人分布表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgConReladistDao {
    
    /**
     * @author Administrator
     * @description: 分页查询蜜罐联系人分布表
     * @date 2018-01-09 17:46:08
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgConReladistDTO> searchExtWlJxlMgConReladistByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象蜜罐联系人分布表
     * @date 2018-01-09 17:46:08
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgConReladistDTO> searchExtWlJxlMgConReladist(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象蜜罐联系人分布表
     * @date 2018-01-09 17:46:08
     * @param id
     * @return
     */
    public ExtWlJxlMgConReladistDTO findExtWlJxlMgConReladistByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象蜜罐联系人分布表
     * @date 2018-01-09 17:46:08
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgConReladist(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象蜜罐联系人分布表
     * @date 2018-01-09 17:46:08
     * @param paramMap
     */
    public void updateExtWlJxlMgConReladist(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除蜜罐联系人分布表
     * @date 2018-01-09 17:46:08
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgConReladistByPrimaryKey(Map<String, Object> paramMap);
    
    
}
