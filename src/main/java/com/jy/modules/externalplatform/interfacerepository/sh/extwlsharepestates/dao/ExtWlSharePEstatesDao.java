package com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepestates.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sh.extwlsharepestates.dto.ExtWlSharePEstatesDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlSharePEstatesDao
 * @description: 定义  算话共享报告_身份信息概要(居住地址信息) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlSharePEstatesDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话共享报告_身份信息概要(居住地址信息)
     * @date 2017-12-07 19:53:02
     * @param searchParams
     * @return
     */
    public List<ExtWlSharePEstatesDTO> searchExtWlSharePEstatesByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话共享报告_身份信息概要(居住地址信息)
     * @date 2017-12-07 19:53:02
     * @param searchParams
     * @return
     */
    public List<ExtWlSharePEstatesDTO> searchExtWlSharePEstates(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话共享报告_身份信息概要(居住地址信息)
     * @date 2017-12-07 19:53:02
     * @param id
     * @return
     */
    public ExtWlSharePEstatesDTO findExtWlSharePEstatesByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话共享报告_身份信息概要(居住地址信息)
     * @date 2017-12-07 19:53:02
     * @param paramMap
     * @return
     */
    public int insertExtWlSharePEstates(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话共享报告_身份信息概要(居住地址信息)
     * @date 2017-12-07 19:53:02
     * @param paramMap
     */
    public void updateExtWlSharePEstates(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话共享报告_身份信息概要(居住地址信息)
     * @date 2017-12-07 19:53:02
     * @param ids
     * @return
     */ 
    public void deleteExtWlSharePEstatesByPrimaryKey(Map<String, Object> paramMap);

    public int insertExtWlSharePEstatesList(Map<String, Object> paramMap);
    
    
}
