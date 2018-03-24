package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrassets.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrassets.dto.ExtWlShSrAssetsDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrassets.dao.ExtWlShSrAssetsDao;

/**
 * @classname: ExtWlShSrAssetsService
 * @description: 定义  算话人行结构化版(资产处置信息表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrassets.service.ExtWlShSrAssetsService")
public class ExtWlShSrAssetsService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShSrAssetsDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行结构化版(资产处置信息表)列表
     * @date 2017-12-21 19:52:42
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShSrAssetsDTO> searchExtWlShSrAssetsByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShSrAssetsDTO> dataList =  dao.searchExtWlShSrAssetsByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行结构化版(资产处置信息表)列表
     * @date 2017-12-21 19:52:42
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShSrAssetsDTO> searchExtWlShSrAssets(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShSrAssetsDTO> dataList = dao.searchExtWlShSrAssets(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行结构化版(资产处置信息表)对象
     * @date 2017-12-21 19:52:42
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShSrAssetsDTO queryExtWlShSrAssetsByPrimaryKey(String id) throws Exception {
		
		ExtWlShSrAssetsDTO dto = dao.findExtWlShSrAssetsByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShSrAssetsDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShSrAssets
     * @author Administrator
     * @description: 新增 算话人行结构化版(资产处置信息表)对象
     * @date 2017-12-21 19:52:42
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShSrAssets(ExtWlShSrAssetsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShSrAssets(paramMap);
		
		ExtWlShSrAssetsDTO resultDto = (ExtWlShSrAssetsDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShSrAssets
     * @author Administrator
     * @description: 修改 算话人行结构化版(资产处置信息表)对象
     * @date 2017-12-21 19:52:42
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShSrAssets(ExtWlShSrAssetsDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShSrAssets(paramMap);
	}
	/**
     * @title: deleteExtWlShSrAssetsByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行结构化版(资产处置信息表),按主键
     * @date 2017-12-21 19:52:42
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShSrAssetsByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShSrAssetsByPrimaryKey(paramMap);
	}

	/**
	 * @methodName: insertExtWlShSrAssetsList
	 * @param: [assetsList, fkReportId]
	 * @describe: 批量新增 算话人行结构化版(资产处置信息表)列表
	 * @auther: huangxianchao
	 * @date: 2017/12/25 0025
	 * @time: 上午 10:33
	 **/
    public void insertExtWlShSrAssetsList(List<ExtWlShSrAssetsDTO> assetsList, Long fkReportId) {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dtoList", assetsList);
		paramMap.put("fkReportId", fkReportId);
		dao.insertExtWlShSrAssetsList(paramMap);
    }
}

