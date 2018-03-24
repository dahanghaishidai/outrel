package com.jy.modules.externalplatform.interfacerepository.sh.extwlshareguarantees.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlshareguarantees.dto.ExtWlShareGuaranteesDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShareGuaranteesDao
 * @description: 定义  算话共享报告_对外担保信息明细 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShareGuaranteesDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_对外担保信息明细
     * @date 2017-12-08 11:03:18
     * @param searchParams
     * @return
     */
    public List<ExtWlShareGuaranteesDTO> searchExtWlShareGuaranteesByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_对外担保信息明细
     * @date 2017-12-08 11:03:18
     * @param searchParams
     * @return
     */
    public List<ExtWlShareGuaranteesDTO> searchExtWlShareGuarantees(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_对外担保信息明细
     * @date 2017-12-08 11:03:18
     * @param id
     * @return
     */
    public ExtWlShareGuaranteesDTO findExtWlShareGuaranteesByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_对外担保信息明细
     * @date 2017-12-08 11:03:18
     * @param paramMap
     * @return
     */
    public int insertExtWlShareGuarantees(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_对外担保信息明细
     * @date 2017-12-08 11:03:18
     * @param paramMap
     */
    public void updateExtWlShareGuarantees(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_对外担保信息明细
     * @date 2017-12-08 11:03:18
     * @param ids
     * @return
     */ 
    public void deleteExtWlShareGuaranteesByPrimaryKey(Map<String, Object> paramMap);

    public int insertExtWlShareGuaranteesList(Map<String, Object> paramMap);
    
    
}
