package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepoccupations.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepoccupations.dto.ExtWlSharePOccupationsDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlSharePOccupationsDao
 * @description: 定义  算话共享报告_身份信息概要（职业信息） 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlSharePOccupationsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_身份信息概要（职业信息）
     * @date 2017-12-07 19:52:57
     * @param searchParams
     * @return
     */
    public List<ExtWlSharePOccupationsDTO> searchExtWlSharePOccupationsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_身份信息概要（职业信息）
     * @date 2017-12-07 19:52:57
     * @param searchParams
     * @return
     */
    public List<ExtWlSharePOccupationsDTO> searchExtWlSharePOccupations(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_身份信息概要（职业信息）
     * @date 2017-12-07 19:52:57
     * @param id
     * @return
     */
    public ExtWlSharePOccupationsDTO findExtWlSharePOccupationsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_身份信息概要（职业信息）
     * @date 2017-12-07 19:52:57
     * @param paramMap
     * @return
     */
    public int insertExtWlSharePOccupations(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_身份信息概要（职业信息）
     * @date 2017-12-07 19:52:57
     * @param paramMap
     */
    public void updateExtWlSharePOccupations(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_身份信息概要（职业信息）
     * @date 2017-12-07 19:52:57
     * @param ids
     * @return
     */ 
    public void deleteExtWlSharePOccupationsByPrimaryKey(Map<String, Object> paramMap);

    public int insertExtWlSharePOccupationsList(Map<String, Object> paramMap);
    
    
}
