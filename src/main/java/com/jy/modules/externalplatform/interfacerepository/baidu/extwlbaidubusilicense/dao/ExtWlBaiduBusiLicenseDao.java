package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidubusilicense.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidubusilicense.dto.ExtWlBaiduBusiLicenseDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBaiduBusiLicenseDao
 * @description: 定义  百度金融工商执照表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBaiduBusiLicenseDao {
    
    /**
     * @author Administrator
     * @description: 分页查询百度金融工商执照表
     * @date 2017-12-13 16:42:46
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduBusiLicenseDTO> searchExtWlBaiduBusiLicenseByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象百度金融工商执照表
     * @date 2017-12-13 16:42:46
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduBusiLicenseDTO> searchExtWlBaiduBusiLicense(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象百度金融工商执照表
     * @date 2017-12-13 16:42:46
     * @param id
     * @return
     */
    public ExtWlBaiduBusiLicenseDTO findExtWlBaiduBusiLicenseByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象百度金融工商执照表
     * @date 2017-12-13 16:42:46
     * @param paramMap
     * @return
     */
    public int insertExtWlBaiduBusiLicense(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象百度金融工商执照表
     * @date 2017-12-13 16:42:46
     * @param paramMap
     */
    public void updateExtWlBaiduBusiLicense(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除百度金融工商执照表
     * @date 2017-12-13 16:42:46
     * @param ids
     * @return
     */ 
    public void deleteExtWlBaiduBusiLicenseByPrimaryKey(Map<String, Object> paramMap);

    /**
     * @methodName: insertBatchBusiLicense
     * @param: paramMap
     * @describe: 批量保存数据
     * @auther: huangxianchao
     * @date: 2017/12/14 0014
     * @time: 上午 9:30
     **/
    public void insertBatchBusiLicense(Map<String, Object> paramMap);
    
}
