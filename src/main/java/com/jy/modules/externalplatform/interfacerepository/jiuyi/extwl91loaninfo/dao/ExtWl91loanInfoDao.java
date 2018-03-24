package com.jy.modules.externalplatform.interfacerepository.jiuyi.extwl91loaninfo.dao;

import java.util.List;
import java.util.Map;
import com.jy.modules.externalplatform.interfacerepository.jiuyi.extwl91loaninfo.dto.ExtWl91loanInfoDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWl91loanInfoDao
 * @description: 定义  91征信贷款数据 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWl91loanInfoDao {
    
    /**
     * @author Administrator
     * @description: 分页查询91征信贷款数据
     * @date 2017-12-15 16:12:51
     * @param searchParams
     * @return
     */
    public List<ExtWl91loanInfoDTO> searchExtWl91loanInfoByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象91征信贷款数据
     * @date 2017-12-15 16:12:51
     * @param searchParams
     * @return
     */
    public List<ExtWl91loanInfoDTO> searchExtWl91loanInfo(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象91征信贷款数据
     * @date 2017-12-15 16:12:51
     * @param id
     * @return
     */
    public ExtWl91loanInfoDTO findExtWl91loanInfoByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象91征信贷款数据
     * @date 2017-12-15 16:12:51
     * @param paramMap
     * @return
     */
    public int insertExtWl91loanInfo(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象91征信贷款数据
     * @date 2017-12-15 16:12:51
     * @param paramMap
     */
    public void updateExtWl91loanInfo(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除91征信贷款数据
     * @date 2017-12-15 16:12:51
     * @param paramMap
     * @return
     */ 
    public void deleteExtWl91loanInfoByPrimaryKey(Map<String, Object> paramMap);
    
    
}
