package com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdootip.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdootip.dto.ExtWlQhzxRiskdooTipDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlQhzxRiskdooTipDao
 * @description: 定义  前海征信风险度提示表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlQhzxRiskdooTipDao {
    
    /**
     * @author Administrator
     * @description: 分页查询前海征信风险度提示表
     * @date 2017-12-06 16:03:13
     * @param searchParams
     * @return
     */
    public List<ExtWlQhzxRiskdooTipDTO> searchExtWlQhzxRiskdooTipByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象前海征信风险度提示表
     * @date 2017-12-06 16:03:13
     * @param searchParams
     * @return
     */
    public List<ExtWlQhzxRiskdooTipDTO> searchExtWlQhzxRiskdooTip(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象前海征信风险度提示表
     * @date 2017-12-06 16:03:13
     * @param id
     * @return
     */
    public ExtWlQhzxRiskdooTipDTO findExtWlQhzxRiskdooTipByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象前海征信风险度提示表
     * @date 2017-12-06 16:03:13
     * @param paramMap
     * @return
     */
    public int insertExtWlQhzxRiskdooTip(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象前海征信风险度提示表
     * @date 2017-12-06 16:03:13
     * @param paramMap
     */
    public void updateExtWlQhzxRiskdooTip(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除前海征信风险度提示表
     * @date 2017-12-06 16:03:13
     * @param ids
     * @return
     */ 
    public void deleteExtWlQhzxRiskdooTipByPrimaryKey(Map<String, Object> paramMap);
    
    
}
