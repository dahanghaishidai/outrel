package com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblackdetail.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.weishidun.extwlwsdblackdetail.dto.ExtWlWsdBlackDetailDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlWsdBlackDetailDao
 * @description: 定义  维氏盾个人黑名单详细信息 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlWsdBlackDetailDao {
    
    /**
     * @author Administrator
     * @description: 分页查询维氏盾个人黑名单详细信息
     * @date 2017-12-19 20:14:33
     * @param searchParams
     * @return
     */
    public List<ExtWlWsdBlackDetailDTO> searchExtWlWsdBlackDetailByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象维氏盾个人黑名单详细信息
     * @date 2017-12-19 20:14:33
     * @param searchParams
     * @return
     */
    public List<ExtWlWsdBlackDetailDTO> searchExtWlWsdBlackDetail(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象维氏盾个人黑名单详细信息
     * @date 2017-12-19 20:14:33
     * @param id
     * @return
     */
    public ExtWlWsdBlackDetailDTO findExtWlWsdBlackDetailByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象维氏盾个人黑名单详细信息
     * @date 2017-12-19 20:14:33
     * @param paramMap
     * @return
     */
    public int insertExtWlWsdBlackDetail(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象维氏盾个人黑名单详细信息
     * @date 2017-12-19 20:14:33
     * @param paramMap
     */
    public void updateExtWlWsdBlackDetail(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除维氏盾个人黑名单详细信息
     * @date 2017-12-19 20:14:33
     * @param ids
     * @return
     */ 
    public void deleteExtWlWsdBlackDetailByPrimaryKey(Map<String, Object> paramMap);
    
    
}
