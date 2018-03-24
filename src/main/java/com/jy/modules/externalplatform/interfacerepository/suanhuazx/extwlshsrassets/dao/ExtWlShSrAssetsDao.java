package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrassets.dao;

import java.util.List;
import java.util.Map;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrassets.dto.ExtWlShSrAssetsDTO;

import com.jy.platform.core.mybatis.MyBatisRepository;
/**
 * @classname: ExtWlShSrAssetsDao
 * @description: 定义  算话人行结构化版(资产处置信息表) 持久层 接口
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * @author:  Administrator
 */
@MyBatisRepository
public interface ExtWlShSrAssetsDao {
    
    /**
     * @author Administrator
     * @description: 分页查询算话人行结构化版(资产处置信息表)
     * @date 2017-12-21 19:52:42
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrAssetsDTO> searchExtWlShSrAssetsByPaging(Map<String, Object> searchParams) ;
    
    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(资产处置信息表)
     * @date 2017-12-21 19:52:42
     * @param searchParams
     * @return
     */
    public List<ExtWlShSrAssetsDTO> searchExtWlShSrAssets(Map<String, Object> searchParams);

    /**
     * @author Administrator
     * @description:查询对象算话人行结构化版(资产处置信息表)
     * @date 2017-12-21 19:52:42
     * @param id
     * @return
     */
    public ExtWlShSrAssetsDTO findExtWlShSrAssetsByPrimaryKey(String id);
    
    /**
     * @author Administrator
     * @description: 新增对象算话人行结构化版(资产处置信息表)
     * @date 2017-12-21 19:52:42
     * @param paramMap
     * @return
     */
    public int insertExtWlShSrAssets(Map<String, Object> paramMap);
    
    /**
     * @author Administrator
     * @description: 更新对象算话人行结构化版(资产处置信息表)
     * @date 2017-12-21 19:52:42
     * @param paramMap
     */
    public void updateExtWlShSrAssets(Map<String, Object> paramMap);
     
    /**
     * @author Administrator
     * @description: 按主键删除算话人行结构化版(资产处置信息表)
     * @date 2017-12-21 19:52:42
     * @param ids
     * @return
     */ 
    public void deleteExtWlShSrAssetsByPrimaryKey(Map<String, Object> paramMap);


    /**
     * @methodName: insertExtWlShSrAssetsList
     * @param: [assetsList, fkReportId]
     * @describe: 批量新增 算话人行结构化版(资产处置信息表)列表
     * @auther: huangxianchao
     * @date: 2017/12/25 0025
     * @time: 上午 10:34
     **/
    public void insertExtWlShSrAssetsList(Map<String, Object> paramMap);
}
