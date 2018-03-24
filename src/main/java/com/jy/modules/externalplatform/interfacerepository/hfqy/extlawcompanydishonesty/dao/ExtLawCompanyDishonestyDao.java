package com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanydishonesty.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.hfqy.extlawcompanydishonesty.dto.ExtLawCompanyDishonestyDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtLawCompanyDishonestyDao
 * @description: 定义  汇法网企业失信信息表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtLawCompanyDishonestyDao {
    
    /**
     * @author Administrator
     * @description: 分页查询汇法网企业失信信息表
     * @date 2017-06-01 10:11:03
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyDishonestyDTO> searchExtLawCompanyDishonestyByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象汇法网企业失信信息表
     * @date 2017-06-01 10:11:03
     * @param searchParams
     * @return
     */
    public List<ExtLawCompanyDishonestyDTO> searchExtLawCompanyDishonesty(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象汇法网企业失信信息表
     * @date 2017-06-01 10:11:03
     * @param id
     * @return
     */
    public ExtLawCompanyDishonestyDTO findExtLawCompanyDishonestyByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象汇法网企业失信信息表
     * @date 2017-06-01 10:11:03
     * @param paramMap
     * @return
     */
    public int insertExtLawCompanyDishonesty(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象汇法网企业失信信息表
     * @date 2017-06-01 10:11:03
     * @param paramMap
     */
    public void updateExtLawCompanyDishonesty(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除汇法网企业失信信息表
     * @date 2017-06-01 10:11:03
     * @param ids
     * @return
     */ 
    public void deleteExtLawCompanyDishonestyByPrimaryKey(Map<String, Object> paramMap);
    
    
}
