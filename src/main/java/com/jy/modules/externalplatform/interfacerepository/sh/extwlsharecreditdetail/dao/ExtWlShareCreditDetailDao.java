package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecreditdetail.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecreditdetail.dto.ExtWlShareCreditDetailDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShareCreditDetailDao
 * @description: 定义  算话共享报告_信贷信息明细 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShareCreditDetailDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_信贷信息明细
     * @date 2017-12-07 19:53:26
     * @param searchParams
     * @return
     */
    public List<ExtWlShareCreditDetailDTO> searchExtWlShareCreditDetailByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_信贷信息明细
     * @date 2017-12-07 19:53:26
     * @param searchParams
     * @return
     */
    public List<ExtWlShareCreditDetailDTO> searchExtWlShareCreditDetail(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_信贷信息明细
     * @date 2017-12-07 19:53:26
     * @param id
     * @return
     */
    public ExtWlShareCreditDetailDTO findExtWlShareCreditDetailByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_信贷信息明细
     * @date 2017-12-07 19:53:26
     * @param paramMap
     * @return
     */
    public int insertExtWlShareCreditDetail(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_信贷信息明细
     * @date 2017-12-07 19:53:26
     * @param paramMap
     */
    public void updateExtWlShareCreditDetail(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_信贷信息明细
     * @date 2017-12-07 19:53:26
     * @param ids
     * @return
     */ 
    public void deleteExtWlShareCreditDetailByPrimaryKey(Map<String, Object> paramMap);
    
    
}
