package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecdebtinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecdebtinfo.dto.ExtWlShareCDebtinfoDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShareCDebtinfoDao
 * @description: 定义  算话共享报告_信贷信息概要（授信及负债信息概要） 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShareCDebtinfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_信贷信息概要（授信及负债信息概要）
     * @date 2017-12-07 19:53:17
     * @param searchParams
     * @return
     */
    public List<ExtWlShareCDebtinfoDTO> searchExtWlShareCDebtinfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_信贷信息概要（授信及负债信息概要）
     * @date 2017-12-07 19:53:17
     * @param searchParams
     * @return
     */
    public List<ExtWlShareCDebtinfoDTO> searchExtWlShareCDebtinfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_信贷信息概要（授信及负债信息概要）
     * @date 2017-12-07 19:53:17
     * @param id
     * @return
     */
    public ExtWlShareCDebtinfoDTO findExtWlShareCDebtinfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_信贷信息概要（授信及负债信息概要）
     * @date 2017-12-07 19:53:17
     * @param paramMap
     * @return
     */
    public int insertExtWlShareCDebtinfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_信贷信息概要（授信及负债信息概要）
     * @date 2017-12-07 19:53:17
     * @param paramMap
     */
    public void updateExtWlShareCDebtinfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_信贷信息概要（授信及负债信息概要）
     * @date 2017-12-07 19:53:17
     * @param ids
     * @return
     */ 
    public void deleteExtWlShareCDebtinfoByPrimaryKey(Map<String, Object> paramMap);

    public int insertExtWlShareCDebtinfoList(Map<String, Object> paramMap);
    
    
}
