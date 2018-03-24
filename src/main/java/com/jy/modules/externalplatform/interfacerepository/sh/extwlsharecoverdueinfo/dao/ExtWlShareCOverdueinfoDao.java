package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecoverdueinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecoverdueinfo.dto.ExtWlShareCOverdueinfoDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShareCOverdueinfoDao
 * @description: 定义  算话共享报告_信贷信息概要（逾期及违约信息概要） 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShareCOverdueinfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_信贷信息概要（逾期及违约信息概要）
     * @date 2017-12-07 19:53:12
     * @param searchParams
     * @return
     */
    public List<ExtWlShareCOverdueinfoDTO> searchExtWlShareCOverdueinfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_信贷信息概要（逾期及违约信息概要）
     * @date 2017-12-07 19:53:12
     * @param searchParams
     * @return
     */
    public List<ExtWlShareCOverdueinfoDTO> searchExtWlShareCOverdueinfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_信贷信息概要（逾期及违约信息概要）
     * @date 2017-12-07 19:53:12
     * @param id
     * @return
     */
    public ExtWlShareCOverdueinfoDTO findExtWlShareCOverdueinfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_信贷信息概要（逾期及违约信息概要）
     * @date 2017-12-07 19:53:12
     * @param paramMap
     * @return
     */
    public int insertExtWlShareCOverdueinfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_信贷信息概要（逾期及违约信息概要）
     * @date 2017-12-07 19:53:12
     * @param paramMap
     */
    public void updateExtWlShareCOverdueinfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_信贷信息概要（逾期及违约信息概要）
     * @date 2017-12-07 19:53:12
     * @param ids
     * @return
     */ 
    public void deleteExtWlShareCOverdueinfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
