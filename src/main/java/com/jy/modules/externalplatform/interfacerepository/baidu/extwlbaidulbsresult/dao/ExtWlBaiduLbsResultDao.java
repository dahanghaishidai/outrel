package com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsresult.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.baidu.extwlbaidulbsresult.dto.ExtWlBaiduLbsResultDTO;
import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlBaiduLbsResultDao
 * @description: 定义  百度金融LBS地址校验结果表 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlBaiduLbsResultDao {
    
    /**
     * @author Administrator
     * @description: 分页查询百度金融LBS地址校验结果表
     * @date 2017-12-08 15:27:43
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduLbsResultDTO> searchExtWlBaiduLbsResultByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象百度金融LBS地址校验结果表
     * @date 2017-12-08 15:27:43
     * @param searchParams
     * @return
     */
    public List<ExtWlBaiduLbsResultDTO> searchExtWlBaiduLbsResult(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象百度金融LBS地址校验结果表
     * @date 2017-12-08 15:27:43
     * @param id
     * @return
     */
    public ExtWlBaiduLbsResultDTO findExtWlBaiduLbsResultByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象百度金融LBS地址校验结果表
     * @date 2017-12-08 15:27:43
     * @param paramMap
     * @return
     */
    public int insertExtWlBaiduLbsResult(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象百度金融LBS地址校验结果表
     * @date 2017-12-08 15:27:43
     * @param paramMap
     */
    public void updateExtWlBaiduLbsResult(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除百度金融LBS地址校验结果表
     * @date 2017-12-08 15:27:43
     * @param ids
     * @return
     */ 
    public void deleteExtWlBaiduLbsResultByPrimaryKey(Map<String, Object> paramMap);

	/**
	 * @Description: 批量插入LBS地址校验结果数据
	 * @param @param paramMap   
	 * @return void  
	 * @throws
	 * @author huangxianchao
	 * @date 2017年12月12日 下午8:19:31
	 */
	
	public void insertBatchExtWlBaiduLbsResult(Map<String, Object> paramMap);
    
    
}
