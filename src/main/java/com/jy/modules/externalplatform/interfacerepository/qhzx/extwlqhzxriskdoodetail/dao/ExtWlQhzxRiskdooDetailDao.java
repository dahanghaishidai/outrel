package com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdoodetail.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.qhzx.extwlqhzxriskdoodetail.dto.ExtWlQhzxRiskdooDetailDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlQhzxRiskdooDetailDao
 * @description: 定义  前海征信风险度提示明细表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlQhzxRiskdooDetailDao {
    
    /**
     * @author Administrator
     * @description: 分页查询前海征信风险度提示明细表
     * @date 2017-12-06 16:03:25
     * @param searchParams
     * @return
     */
    public List<ExtWlQhzxRiskdooDetailDTO> searchExtWlQhzxRiskdooDetailByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象前海征信风险度提示明细表
     * @date 2017-12-06 16:03:25
     * @param searchParams
     * @return
     */
    public List<ExtWlQhzxRiskdooDetailDTO> searchExtWlQhzxRiskdooDetail(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象前海征信风险度提示明细表
     * @date 2017-12-06 16:03:25
     * @param id
     * @return
     */
    public ExtWlQhzxRiskdooDetailDTO findExtWlQhzxRiskdooDetailByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象前海征信风险度提示明细表
     * @date 2017-12-06 16:03:25
     * @param paramMap
     * @return
     */
    public int insertExtWlQhzxRiskdooDetail(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象前海征信风险度提示明细表
     * @date 2017-12-06 16:03:25
     * @param paramMap
     */
    public void updateExtWlQhzxRiskdooDetail(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除前海征信风险度提示明细表
     * @date 2017-12-06 16:03:25
     * @param paramMap
     * @return
     */ 
    public void deleteExtWlQhzxRiskdooDetailByPrimaryKey(Map<String, Object> paramMap);

    public int insertExtWlQhzxRiskdooDetailList(Map<String, Object> paramMap);
    
    
}
