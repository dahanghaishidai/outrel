package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecindicator.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharecindicator.dto.ExtWlShareCIndicatorDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShareCIndicatorDao
 * @description: 定义  算话共享报告_信贷信息概要（信用提示） 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShareCIndicatorDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_信贷信息概要（信用提示）
     * @date 2017-12-07 19:53:08
     * @param searchParams
     * @return
     */
    public List<ExtWlShareCIndicatorDTO> searchExtWlShareCIndicatorByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_信贷信息概要（信用提示）
     * @date 2017-12-07 19:53:08
     * @param searchParams
     * @return
     */
    public List<ExtWlShareCIndicatorDTO> searchExtWlShareCIndicator(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_信贷信息概要（信用提示）
     * @date 2017-12-07 19:53:08
     * @param id
     * @return
     */
    public ExtWlShareCIndicatorDTO findExtWlShareCIndicatorByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_信贷信息概要（信用提示）
     * @date 2017-12-07 19:53:08
     * @param paramMap
     * @return
     */
    public int insertExtWlShareCIndicator(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_信贷信息概要（信用提示）
     * @date 2017-12-07 19:53:08
     * @param paramMap
     */
    public void updateExtWlShareCIndicator(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_信贷信息概要（信用提示）
     * @date 2017-12-07 19:53:08
     * @param ids
     * @return
     */ 
    public void deleteExtWlShareCIndicatorByPrimaryKey(Map<String, Object> paramMap);

    public int insertExtWlShareCIndicatorList(Map<String, Object> paramMap);
    
    
}
