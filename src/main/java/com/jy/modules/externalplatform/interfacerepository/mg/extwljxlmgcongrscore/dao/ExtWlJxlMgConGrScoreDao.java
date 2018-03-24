package com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcongrscore.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.mg.extwljxlmgcongrscore.dto.ExtWlJxlMgConGrScoreDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlJxlMgConGrScoreDao
 * @description: 定义  蜜罐联系人灰度分信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlJxlMgConGrScoreDao {
    
    /**
     * @author Administrator
     * @description: 分页查询蜜罐联系人灰度分信息
     * @date 2018-01-09 17:45:51
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgConGrScoreDTO> searchExtWlJxlMgConGrScoreByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象蜜罐联系人灰度分信息
     * @date 2018-01-09 17:45:51
     * @param searchParams
     * @return
     */
    public List<ExtWlJxlMgConGrScoreDTO> searchExtWlJxlMgConGrScore(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象蜜罐联系人灰度分信息
     * @date 2018-01-09 17:45:51
     * @param id
     * @return
     */
    public ExtWlJxlMgConGrScoreDTO findExtWlJxlMgConGrScoreByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象蜜罐联系人灰度分信息
     * @date 2018-01-09 17:45:51
     * @param paramMap
     * @return
     */
    public int insertExtWlJxlMgConGrScore(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象蜜罐联系人灰度分信息
     * @date 2018-01-09 17:45:51
     * @param paramMap
     */
    public void updateExtWlJxlMgConGrScore(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除蜜罐联系人灰度分信息
     * @date 2018-01-09 17:45:51
     * @param ids
     * @return
     */ 
    public void deleteExtWlJxlMgConGrScoreByPrimaryKey(Map<String, Object> paramMap);
    
    
}
