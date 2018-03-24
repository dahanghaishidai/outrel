package com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrgeneralinfo.service;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jy.platform.core.common.BaseDTO;

import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrgeneralinfo.dto.ExtWlShSrGeneralInfoDTO;
import com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrgeneralinfo.dao.ExtWlShSrGeneralInfoDao;

/**
 * @classname: ExtWlShSrGeneralInfoService
 * @description: 定义  算话人行结构化版(汇总信息表) 实现类
 * @author:  Administrator
 */
@Service("com.jy.modules.externalplatform.interfacerepository.suanhuazx.extwlshsrgeneralinfo.service.ExtWlShSrGeneralInfoService")
public class ExtWlShSrGeneralInfoService implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Autowired
	private ExtWlShSrGeneralInfoDao dao;

	/**
     * @author Administrator
     * @description: 分页查询 算话人行结构化版(汇总信息表)列表
     * @date 2017-12-21 19:54:35
     * @param searchParams 条件
     * @return
     * @throws
     */ 
	public List<ExtWlShSrGeneralInfoDTO> searchExtWlShSrGeneralInfoByPaging(Map<String,Object> searchParams) throws Exception {
		List<ExtWlShSrGeneralInfoDTO> dataList =  dao.searchExtWlShSrGeneralInfoByPaging(searchParams);
		return dataList;
	}
	/**
     * @author Administrator
     * @description: 按条件查询算话人行结构化版(汇总信息表)列表
     * @date 2017-12-21 19:54:35
     * @param searchParams 条件
     * @return
     * @throws
     */
	public List<ExtWlShSrGeneralInfoDTO> searchExtWlShSrGeneralInfo(Map<String,Object> searchParams) throws Exception {
	    List<ExtWlShSrGeneralInfoDTO> dataList = dao.searchExtWlShSrGeneralInfo(searchParams);
        return dataList;
    }
	/**
     * @author Administrator
     * @description: 查询算话人行结构化版(汇总信息表)对象
     * @date 2017-12-21 19:54:35
     * @param id
     * @return
     * @throws
     */ 
	public ExtWlShSrGeneralInfoDTO queryExtWlShSrGeneralInfoByPrimaryKey(String id) throws Exception {
		
		ExtWlShSrGeneralInfoDTO dto = dao.findExtWlShSrGeneralInfoByPrimaryKey(id);
		
		if(dto == null) dto = new ExtWlShSrGeneralInfoDTO();
		
		return dto;
		
	}

	/**
     * @title: insertExtWlShSrGeneralInfo
     * @author Administrator
     * @description: 新增 算话人行结构化版(汇总信息表)对象
     * @date 2017-12-21 19:54:35
     * @param dto
     * @return
     * @throws
     */
	@SuppressWarnings("all")
	public Long insertExtWlShSrGeneralInfo(ExtWlShSrGeneralInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		int count = dao.insertExtWlShSrGeneralInfo(paramMap);
		
		ExtWlShSrGeneralInfoDTO resultDto = (ExtWlShSrGeneralInfoDTO) paramMap.get("dto");
		Long keyId = resultDto.getId();
		return keyId;
	}
	/**
     * @title: updateExtWlShSrGeneralInfo
     * @author Administrator
     * @description: 修改 算话人行结构化版(汇总信息表)对象
     * @date 2017-12-21 19:54:35
     * @param paramMap
     * @return
     * @throws
     */
	public void updateExtWlShSrGeneralInfo(ExtWlShSrGeneralInfoDTO dto) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", dto);
		
		dao.updateExtWlShSrGeneralInfo(paramMap);
	}
	/**
     * @title: deleteExtWlShSrGeneralInfoByPrimaryKey
     * @author Administrator
     * @description: 删除 算话人行结构化版(汇总信息表),按主键
     * @date 2017-12-21 19:54:35
     * @param paramMap
     * @throws
     */ 
	public void deleteExtWlShSrGeneralInfoByPrimaryKey(BaseDTO baseDto,String ids) throws Exception {
		if(StringUtils.isEmpty(ids)) throw new Exception("删除失败！传入的参数主键为null");
		
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("dto", baseDto);
		paramMap.put("ids", ids);
		dao.deleteExtWlShSrGeneralInfoByPrimaryKey(paramMap);
	}

}

