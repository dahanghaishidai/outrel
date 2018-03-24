package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtax.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshprecordtax.dto.ExtWlShPrecordTaxDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShPrecordTaxDao
 * @description: 定义  算话人行原版(公共记录_欠税记录表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShPrecordTaxDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行原版(公共记录_欠税记录表)
     * @date 2017-12-21 19:50:26
     * @param searchParams
     * @return
     */
    public List<ExtWlShPrecordTaxDTO> searchExtWlShPrecordTaxByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行原版(公共记录_欠税记录表)
     * @date 2017-12-21 19:50:26
     * @param searchParams
     * @return
     */
    public List<ExtWlShPrecordTaxDTO> searchExtWlShPrecordTax(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行原版(公共记录_欠税记录表)
     * @date 2017-12-21 19:50:26
     * @param id
     * @return
     */
    public ExtWlShPrecordTaxDTO findExtWlShPrecordTaxByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行原版(公共记录_欠税记录表)
     * @date 2017-12-21 19:50:26
     * @param paramMap
     * @return
     */
    public int insertExtWlShPrecordTax(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行原版(公共记录_欠税记录表)
     * @date 2017-12-21 19:50:26
     * @param paramMap
     */
    public void updateExtWlShPrecordTax(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行原版(公共记录_欠税记录表)
     * @date 2017-12-21 19:50:26
     * @param ids
     * @return
     */ 
    public void deleteExtWlShPrecordTaxByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShPrecordTaxList
     * @param: paramMap
     * @describe: 批量新增 算话人行原版(公共记录_欠税记录表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 9:34
     **/
    public void insertExtWlShPrecordTaxList(Map<String, Object> paramMap);
}
