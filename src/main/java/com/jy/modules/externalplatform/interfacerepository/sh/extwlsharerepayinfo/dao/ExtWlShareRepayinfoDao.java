package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharerepayinfo.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharerepayinfo.dto.ExtWlShareRepayinfoDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShareRepayinfoDao
 * @description: 定义  算话共享报告_近24期还款记录 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShareRepayinfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_近24期还款记录
     * @date 2017-12-07 19:53:32
     * @param searchParams
     * @return
     */
    public List<ExtWlShareRepayinfoDTO> searchExtWlShareRepayinfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_近24期还款记录
     * @date 2017-12-07 19:53:32
     * @param searchParams
     * @return
     */
    public List<ExtWlShareRepayinfoDTO> searchExtWlShareRepayinfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_近24期还款记录
     * @date 2017-12-07 19:53:32
     * @param id
     * @return
     */
    public ExtWlShareRepayinfoDTO findExtWlShareRepayinfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_近24期还款记录
     * @date 2017-12-07 19:53:32
     * @param paramMap
     * @return
     */
    public int insertExtWlShareRepayinfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_近24期还款记录
     * @date 2017-12-07 19:53:32
     * @param paramMap
     */
    public void updateExtWlShareRepayinfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_近24期还款记录
     * @date 2017-12-07 19:53:32
     * @param ids
     * @return
     */ 
    public void deleteExtWlShareRepayinfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
