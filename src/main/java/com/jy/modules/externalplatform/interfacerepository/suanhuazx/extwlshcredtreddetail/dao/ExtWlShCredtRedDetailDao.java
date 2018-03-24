package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcredtreddetail.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshcredtreddetail.dto.ExtWlShCredtRedDetailDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShCredtRedDetailDao
 * @description: 定义  算话人行原版(信贷记录详情) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShCredtRedDetailDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行原版(信贷记录详情)
     * @date 2017-12-21 19:47:07
     * @param searchParams
     * @return
     */
    public List<ExtWlShCredtRedDetailDTO> searchExtWlShCredtRedDetailByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行原版(信贷记录详情)
     * @date 2017-12-21 19:47:07
     * @param searchParams
     * @return
     */
    public List<ExtWlShCredtRedDetailDTO> searchExtWlShCredtRedDetail(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行原版(信贷记录详情)
     * @date 2017-12-21 19:47:07
     * @param id
     * @return
     */
    public ExtWlShCredtRedDetailDTO findExtWlShCredtRedDetailByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行原版(信贷记录详情)
     * @date 2017-12-21 19:47:07
     * @param paramMap
     * @return
     */
    public int insertExtWlShCredtRedDetail(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行原版(信贷记录详情)
     * @date 2017-12-21 19:47:07
     * @param paramMap
     */
    public void updateExtWlShCredtRedDetail(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行原版(信贷记录详情)
     * @date 2017-12-21 19:47:07
     * @param ids
     * @return
     */ 
    public void deleteExtWlShCredtRedDetailByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShCreditRecordDetailList
     * @param: paramMap
     * @describe: 批量新增对象算话人行原版(信贷记录详情列表)
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 9:25
     **/
    public void insertExtWlShCreditRecordDetailList(Map<String, Object> paramMap);
}
