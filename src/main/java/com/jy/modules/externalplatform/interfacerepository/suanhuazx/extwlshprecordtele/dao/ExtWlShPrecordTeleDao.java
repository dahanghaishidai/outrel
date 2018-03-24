package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtele.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtele.dto.ExtWlShPrecordTeleDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShPrecordTeleDao
 * @description: 定义  算话人行原版(公共记录_电信欠费信息表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShPrecordTeleDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行原版(公共记录_电信欠费信息表)
     * @date 2017-12-21 19:50:54
     * @param searchParams
     * @return
     */
    public List<ExtWlShPrecordTeleDTO> searchExtWlShPrecordTeleByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行原版(公共记录_电信欠费信息表)
     * @date 2017-12-21 19:50:54
     * @param searchParams
     * @return
     */
    public List<ExtWlShPrecordTeleDTO> searchExtWlShPrecordTele(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行原版(公共记录_电信欠费信息表)
     * @date 2017-12-21 19:50:54
     * @param id
     * @return
     */
    public ExtWlShPrecordTeleDTO findExtWlShPrecordTeleByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行原版(公共记录_电信欠费信息表)
     * @date 2017-12-21 19:50:54
     * @param paramMap
     * @return
     */
    public int insertExtWlShPrecordTele(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行原版(公共记录_电信欠费信息表)
     * @date 2017-12-21 19:50:54
     * @param paramMap
     */
    public void updateExtWlShPrecordTele(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行原版(公共记录_电信欠费信息表)
     * @date 2017-12-21 19:50:54
     * @param ids
     * @return
     */ 
    public void deleteExtWlShPrecordTeleByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShPrecordTelecomList
     * @param: [paramMap]
     * @describe: 批量新增 算话人行原版(公共记录_电信欠费信息表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 9:59
     **/
    public void insertExtWlShPrecordTelecomList(Map<String, Object> paramMap);
}
