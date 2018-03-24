package com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmalagentphone.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.sm.extwlsmmalagentphone.dto.ExtWlSmMalagentPhoneDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlSmMalagentPhoneDao
 * @description: 定义  数美金融中介识别信息(外联平台表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlSmMalagentPhoneDao {
    
    /**
     * @author Administrator
     * @description: 分页查询数美金融中介识别信息(外联平台表)
     * @date 2017-09-26 14:26:54
     * @param searchParams
     * @return
     */
    public List<ExtWlSmMalagentPhoneDTO> searchExtWlSmMalagentPhoneByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象数美金融中介识别信息(外联平台表)
     * @date 2017-09-26 14:26:54
     * @param searchParams
     * @return
     */
    public List<ExtWlSmMalagentPhoneDTO> searchExtWlSmMalagentPhone(Map<String,Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象数美金融中介识别信息(外联平台表)
     * @date 2017-09-26 14:26:54
     * @param id
     * @return
     */
    public ExtWlSmMalagentPhoneDTO findExtWlSmMalagentPhoneByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象数美金融中介识别信息(外联平台表)
     * @date 2017-09-26 14:26:54
     * @param paramMap
     * @return
     */
    public int insertExtWlSmMalagentPhone(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象数美金融中介识别信息(外联平台表)
     * @date 2017-09-26 14:26:54
     * @param paramMap
     */
    public void updateExtWlSmMalagentPhone(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除数美金融中介识别信息(外联平台表)
     * @date 2017-09-26 14:26:54
     * @param ids
     * @return
     */ 
    public void deleteExtWlSmMalagentPhoneByPrimaryKey(Map<String, Object> paramMap);

    public void updateExtWlSmMalagentPhoneByIntocustid(Map<String, Object> paramMap);
    
    
}
